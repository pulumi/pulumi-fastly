// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the IDs of available Platform TLS Certificates for use with other resources.
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
// 		exampleTlsPlatformCertificateIds, err := fastly.GetTlsPlatformCertificateIds(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := exampleTlsPlatformCertificateIds.Ids[0]
// 		_, err = fastly.LookupTlsPlatformCertificate(ctx, &fastly.LookupTlsPlatformCertificateArgs{
// 			Id: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetTlsPlatformCertificateIds(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetTlsPlatformCertificateIdsResult, error) {
	var rv GetTlsPlatformCertificateIdsResult
	err := ctx.Invoke("fastly:index/getTlsPlatformCertificateIds:getTlsPlatformCertificateIds", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getTlsPlatformCertificateIds.
type GetTlsPlatformCertificateIdsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of IDs corresponding to Platform TLS certificates.
	Ids []string `pulumi:"ids"`
}