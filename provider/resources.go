// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package fastly

import (
	"fmt"
	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"unicode"

	"github.com/fastly/terraform-provider-fastly/fastly"
	"github.com/pulumi/pulumi-fastly/provider/v7/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "fastly"
	// modules:
	mainMod = "index"
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(fastly.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "fastly",
		TFProviderVersion: "4",
		Description:       "A Pulumi package for creating and managing fastly cloud resources.",
		Keywords:          []string{"pulumi", "fastly"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.io",
		Repository:        "https://github.com/pulumi/pulumi-fastly",
		GitHubOrg:         "fastly",
		Config:            map[string]*tfbridge.SchemaInfo{},
		UpstreamRepoPath:  "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
			"fastly_service_acl_entries": {Tok: makeResource(mainMod, "ServiceACLEntries")},
			"fastly_service_compute": {
				Tok: makeResource(mainMod, "ServiceCompute"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"logging_heroku": {
						Name: "loggingHeroku",
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"fastly_ip_ranges": {Tok: makeDataSource(mainMod, "getFastlyIpRanges")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Fastly",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	err := x.ComputeDefaults(&prov, x.TokensSingleModule("fastly_", mainMod,
		x.MakeStandardToken(mainPkg)).Unmappable("_acl_", "acl is capitalized to ACL"))
	contract.AssertNoError(err)
	err = x.AutoAliasing(&prov, prov.GetMetadata())
	contract.AssertNoErrorf(err, "auto aliasing apply failed")

	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-fastly/bridge-metadata.json
var metadata []byte
