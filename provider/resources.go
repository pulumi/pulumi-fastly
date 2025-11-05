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
	"bytes"
	"fmt"
	"path/filepath"
	"regexp"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/fastly/terraform-provider-fastly/fastly"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-fastly/provider/v11/pkg/version"
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
		DisplayName:       "Fastly",
		TFProviderVersion: "4",
		Description:       "A Pulumi package for creating and managing fastly cloud resources.",
		Keywords:          []string{"pulumi", "fastly"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.io",
		Repository:        "https://github.com/pulumi/pulumi-fastly",
		GitHubOrg:         "fastly",
		Config:            map[string]*tfbridge.SchemaInfo{},
		UpstreamRepoPath:  "./upstream",
		DocRules:          &tfbridge.DocRuleInfo{EditRules: docRuleEdits},

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
			"fastly_ip_ranges":    {Tok: makeDataSource(mainMod, "getFastlyIpRanges")},
			"fastly_vcl_snippets": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Fastly",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tks.SingleModule("fastly_", mainMod,
		tks.MakeStandard(mainPkg))) //.
	// Ignore("_acl_")) // acl is capitalized to ACL
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-fastly/bridge-metadata.json
var metadata []byte

func docRuleEdits(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		tfbridge.DocsEdit{
			Path: "*",
			Edit: func(_ string, content []byte) ([]byte, error) {
				content = bytes.ReplaceAll(content,
					[]byte(", Terraform will fail."),
					[]byte(", this provider will fail."))
				content = bytes.ReplaceAll(content,
					[]byte("achieved in Terraform using"),
					[]byte("achieved in Pulumi using"))
				content = bytes.ReplaceAll(content,
					[]byte("-> **Note:** The following example is only available from "+
						"0.20.0 of the Fastly Terraform provider.\n\n"), nil)

				content = bytes.ReplaceAll(content,
					[]byte("The first time Terraform is applied,"),
					[]byte("The first time this provider is applied,"))
				return content, nil
			},
		},
		removeContent,
		skipExtraConfigurationSection,
	)
}

// This provider has both an "Argument Reference" _and_ a "Schema" section. Let's skip one of them.
var skipExtraConfigurationSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Argument Reference"
		})
	},
}

var tfVersionRegexp = regexp.MustCompile(
	`The Fastly provider prior to version [v0-9]*\.[0-9]*\.[0-9]*.*\n.*`,
)

var (
	blockRegexp     = regexp.MustCompile(` in the[A-Za-z0-9\s]* \x60?provider\x60? block`)
	omitBlockRegexp = regexp.MustCompile(
		"When using this method, you may omit the\nFastly `provider` block entirely:",
	)
)

// Removes a version reference and block content
var removeContent = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		removeRegexps := getRemoveRegexps()
		for _, regex := range removeRegexps {
			content = regex.ReplaceAllLiteral(content, nil)
		}
		return content, nil
	},
}

func getRemoveRegexps() []*regexp.Regexp {
	var regexes []*regexp.Regexp
	regexes = append(regexes,
		tfVersionRegexp,
		blockRegexp,
		omitBlockRegexp,
	)
	return regexes
}
