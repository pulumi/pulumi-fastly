// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the ID of a TLS configuration for use with other resources.
//
// > **Warning:** The data source's filters are applied using an **AND** boolean operator, so depending on the combination
// of filters, they may become mutually exclusive. The exception to this is `id` which must not be specified in combination
// with any of the others.
//
// > **Note:** If more or less than a single match is returned by the search, this provider will fail. Ensure that your search is specific enough to return a single key.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-fastly/sdk/v3/go/fastly"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := true
// 		exampleTlsConfiguration, err := fastly.GetTlsConfiguration(ctx, &fastly.GetTlsConfigurationArgs{
// 			Default: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = fastly.NewTlsActivation(ctx, "exampleTlsActivation", &fastly.TlsActivationArgs{
// 			ConfigurationId: pulumi.String(exampleTlsConfiguration.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetTlsConfiguration(ctx *pulumi.Context, args *GetTlsConfigurationArgs, opts ...pulumi.InvokeOption) (*GetTlsConfigurationResult, error) {
	var rv GetTlsConfigurationResult
	err := ctx.Invoke("fastly:index/getTlsConfiguration:getTlsConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTlsConfiguration.
type GetTlsConfigurationArgs struct {
	// Signifies whether Fastly will use this configuration as a default when creating a new TLS activation.
	Default *bool `pulumi:"default"`
	// HTTP protocols available on the TLS configuration.
	HttpProtocols []string `pulumi:"httpProtocols"`
	// ID of the TLS configuration obtained from the Fastly API or another data source. Conflicts with all the other filters.
	Id *string `pulumi:"id"`
	// Custom name of the TLS configuration.
	Name *string `pulumi:"name"`
	// TLS protocols available on the TLS configuration.
	TlsProtocols []string `pulumi:"tlsProtocols"`
	// Whether the configuration should support the `PLATFORM` or `CUSTOM` TLS service.
	TlsService *string `pulumi:"tlsService"`
}

// A collection of values returned by getTlsConfiguration.
type GetTlsConfigurationResult struct {
	// Timestamp (GMT) when the configuration was created.
	CreatedAt string `pulumi:"createdAt"`
	// Signifies whether Fastly will use this configuration as a default when creating a new TLS activation.
	Default bool `pulumi:"default"`
	// The available DNS addresses that can be used to enable TLS for a domain. DNS must be configured for a domain for TLS handshakes to succeed. If enabling TLS on an apex domain (e.g. `example.com`) you must create four A records (or four AAAA records for IPv6 support) using the displayed global A record's IP addresses with your DNS provider. For subdomains and wildcard domains (e.g. `www.example.com` or `*.example.com`) you will need to create a relevant CNAME record.
	DnsRecords []GetTlsConfigurationDnsRecord `pulumi:"dnsRecords"`
	// HTTP protocols available on the TLS configuration.
	HttpProtocols []string `pulumi:"httpProtocols"`
	// ID of the TLS configuration obtained from the Fastly API or another data source. Conflicts with all the other filters.
	Id string `pulumi:"id"`
	// Custom name of the TLS configuration.
	Name string `pulumi:"name"`
	// TLS protocols available on the TLS configuration.
	TlsProtocols []string `pulumi:"tlsProtocols"`
	// Whether the configuration should support the `PLATFORM` or `CUSTOM` TLS service.
	TlsService string `pulumi:"tlsService"`
	// Timestamp (GMT) when the configuration was last updated.
	UpdatedAt string `pulumi:"updatedAt"`
}