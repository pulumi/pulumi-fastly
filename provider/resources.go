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
	"path/filepath"
	"unicode"

	"github.com/fastly/terraform-provider-fastly/fastly"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-fastly/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(fastly.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "fastly",
		Description: "A Pulumi package for creating and managing fastly cloud resources.",
		Keywords:    []string{"pulumi", "fastly"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-fastly",
		GitHubOrg:   "fastly",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"FASTLY_API_KEY"},
				},
			},
			"base_url": {
				Default: &tfbridge.DefaultInfo{
					Value:   "https://api.fastly.com",
					EnvVars: []string{"FASTLY_API_URL"},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"fastly_service_v1": {
				Tok: makeResource(mainMod, "Servicev1"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"logging_heroku": {
						Name: "loggingHeroku",
					},
				},
			},
			"fastly_service_acl_entries_v1":             {Tok: makeResource(mainMod, "ServiceACLEntriesv1")},
			"fastly_service_dictionary_items_v1":        {Tok: makeResource(mainMod, "ServiceDictionaryItemsv1")},
			"fastly_service_dynamic_snippet_content_v1": {Tok: makeResource(mainMod, "ServiceDynamicSnippetContentv1")},
			"fastly_user_v1":                            {Tok: makeResource(mainMod, "Userv1")},
			"fastly_service_compute": {
				Tok: makeResource(mainMod, "ServiceCompute"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"logging_heroku": {
						Name: "loggingHeroku",
					},
				},
			},
			"fastly_service_waf_configuration": {Tok: makeResource(mainMod, "ServiceWafConfiguration")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"fastly_ip_ranges": {Tok: makeDataSource(mainMod, "getFastlyIpRanges")},
			"fastly_waf_rules": {Tok: makeDataSource(mainMod, "getWafRules")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.15.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.15.0,<3.0.0",
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
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "Fastly",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
