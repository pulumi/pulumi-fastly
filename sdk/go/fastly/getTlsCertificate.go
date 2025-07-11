// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information of a TLS certificate for use with other resources.
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
//
//	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := fastly.LookupTlsCertificate(ctx, &fastly.LookupTlsCertificateArgs{
//				Name: pulumi.StringRef("example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTlsCertificate(ctx *pulumi.Context, args *LookupTlsCertificateArgs, opts ...pulumi.InvokeOption) (*LookupTlsCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTlsCertificateResult
	err := ctx.Invoke("fastly:index/getTlsCertificate:getTlsCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTlsCertificate.
type LookupTlsCertificateArgs struct {
	// Domains that are listed in any certificates' Subject Alternative Names (SAN) list.
	Domains []string `pulumi:"domains"`
	// Unique ID assigned to certificate by Fastly
	Id *string `pulumi:"id"`
	// The hostname for which a certificate was issued.
	IssuedTo *string `pulumi:"issuedTo"`
	// The certificate authority that issued the certificate.
	Issuer *string `pulumi:"issuer"`
	// Human-readable name used to identify the certificate. Defaults to the certificate's Common Name or first Subject Alternative Name entry.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getTlsCertificate.
type LookupTlsCertificateResult struct {
	// Timestamp (GMT) when the certificate was created
	CreatedAt string `pulumi:"createdAt"`
	// Domains that are listed in any certificates' Subject Alternative Names (SAN) list.
	Domains []string `pulumi:"domains"`
	// Unique ID assigned to certificate by Fastly
	Id string `pulumi:"id"`
	// The hostname for which a certificate was issued.
	IssuedTo string `pulumi:"issuedTo"`
	// The certificate authority that issued the certificate.
	Issuer string `pulumi:"issuer"`
	// Human-readable name used to identify the certificate. Defaults to the certificate's Common Name or first Subject Alternative Name entry.
	Name string `pulumi:"name"`
	// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation
	Replace bool `pulumi:"replace"`
	// A value assigned by the issuer that is unique to a certificate
	SerialNumber string `pulumi:"serialNumber"`
	// The algorithm used to sign the certificate
	SignatureAlgorithm string `pulumi:"signatureAlgorithm"`
	// Timestamp (GMT) when the certificate was last updated
	UpdatedAt string `pulumi:"updatedAt"`
}

func LookupTlsCertificateOutput(ctx *pulumi.Context, args LookupTlsCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupTlsCertificateResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTlsCertificateResultOutput, error) {
			args := v.(LookupTlsCertificateArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fastly:index/getTlsCertificate:getTlsCertificate", args, LookupTlsCertificateResultOutput{}, options).(LookupTlsCertificateResultOutput), nil
		}).(LookupTlsCertificateResultOutput)
}

// A collection of arguments for invoking getTlsCertificate.
type LookupTlsCertificateOutputArgs struct {
	// Domains that are listed in any certificates' Subject Alternative Names (SAN) list.
	Domains pulumi.StringArrayInput `pulumi:"domains"`
	// Unique ID assigned to certificate by Fastly
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The hostname for which a certificate was issued.
	IssuedTo pulumi.StringPtrInput `pulumi:"issuedTo"`
	// The certificate authority that issued the certificate.
	Issuer pulumi.StringPtrInput `pulumi:"issuer"`
	// Human-readable name used to identify the certificate. Defaults to the certificate's Common Name or first Subject Alternative Name entry.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupTlsCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getTlsCertificate.
type LookupTlsCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupTlsCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsCertificateResult)(nil)).Elem()
}

func (o LookupTlsCertificateResultOutput) ToLookupTlsCertificateResultOutput() LookupTlsCertificateResultOutput {
	return o
}

func (o LookupTlsCertificateResultOutput) ToLookupTlsCertificateResultOutputWithContext(ctx context.Context) LookupTlsCertificateResultOutput {
	return o
}

// Timestamp (GMT) when the certificate was created
func (o LookupTlsCertificateResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// Domains that are listed in any certificates' Subject Alternative Names (SAN) list.
func (o LookupTlsCertificateResultOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) []string { return v.Domains }).(pulumi.StringArrayOutput)
}

// Unique ID assigned to certificate by Fastly
func (o LookupTlsCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

// The hostname for which a certificate was issued.
func (o LookupTlsCertificateResultOutput) IssuedTo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.IssuedTo }).(pulumi.StringOutput)
}

// The certificate authority that issued the certificate.
func (o LookupTlsCertificateResultOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.Issuer }).(pulumi.StringOutput)
}

// Human-readable name used to identify the certificate. Defaults to the certificate's Common Name or first Subject Alternative Name entry.
func (o LookupTlsCertificateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.Name }).(pulumi.StringOutput)
}

// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation
func (o LookupTlsCertificateResultOutput) Replace() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) bool { return v.Replace }).(pulumi.BoolOutput)
}

// A value assigned by the issuer that is unique to a certificate
func (o LookupTlsCertificateResultOutput) SerialNumber() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.SerialNumber }).(pulumi.StringOutput)
}

// The algorithm used to sign the certificate
func (o LookupTlsCertificateResultOutput) SignatureAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.SignatureAlgorithm }).(pulumi.StringOutput)
}

// Timestamp (GMT) when the certificate was last updated
func (o LookupTlsCertificateResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsCertificateResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTlsCertificateResultOutput{})
}
