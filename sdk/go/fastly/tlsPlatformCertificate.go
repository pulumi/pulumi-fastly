// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Uploads a TLS certificate to the Fastly Platform TLS service.
//
// > Each TLS certificate **must** have its corresponding private key uploaded _prior_ to uploading the certificate.
//
// ## Import
//
// A certificate can be imported using its Fastly certificate ID, e.g.
//
// ```sh
//  $ pulumi import fastly:index/tlsPlatformCertificate:TlsPlatformCertificate demo xxxxxxxxxxx
// ```
type TlsPlatformCertificate struct {
	pulumi.CustomResourceState

	// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
	AllowUntrustedRoot pulumi.BoolPtrOutput `pulumi:"allowUntrustedRoot"`
	// PEM-formatted certificate.
	CertificateBody pulumi.StringOutput `pulumi:"certificateBody"`
	// ID of TLS configuration to be used to terminate TLS traffic.
	ConfigurationId pulumi.StringOutput `pulumi:"configurationId"`
	// Timestamp (GMT) when the certificate was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// PEM-formatted certificate chain from the `certificateBody` to its root.
	IntermediatesBlob pulumi.StringOutput `pulumi:"intermediatesBlob"`
	// Timestamp (GMT) when the certificate will expire.
	NotAfter pulumi.StringOutput `pulumi:"notAfter"`
	// Timestamp (GMT) when the certificate will become valid.
	NotBefore pulumi.StringOutput `pulumi:"notBefore"`
	// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
	Replace pulumi.BoolOutput `pulumi:"replace"`
	// Timestamp (GMT) when the certificate was last updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewTlsPlatformCertificate registers a new resource with the given unique name, arguments, and options.
func NewTlsPlatformCertificate(ctx *pulumi.Context,
	name string, args *TlsPlatformCertificateArgs, opts ...pulumi.ResourceOption) (*TlsPlatformCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateBody == nil {
		return nil, errors.New("invalid value for required argument 'CertificateBody'")
	}
	if args.ConfigurationId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigurationId'")
	}
	if args.IntermediatesBlob == nil {
		return nil, errors.New("invalid value for required argument 'IntermediatesBlob'")
	}
	var resource TlsPlatformCertificate
	err := ctx.RegisterResource("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTlsPlatformCertificate gets an existing TlsPlatformCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTlsPlatformCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TlsPlatformCertificateState, opts ...pulumi.ResourceOption) (*TlsPlatformCertificate, error) {
	var resource TlsPlatformCertificate
	err := ctx.ReadResource("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TlsPlatformCertificate resources.
type tlsPlatformCertificateState struct {
	// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
	AllowUntrustedRoot *bool `pulumi:"allowUntrustedRoot"`
	// PEM-formatted certificate.
	CertificateBody *string `pulumi:"certificateBody"`
	// ID of TLS configuration to be used to terminate TLS traffic.
	ConfigurationId *string `pulumi:"configurationId"`
	// Timestamp (GMT) when the certificate was created.
	CreatedAt *string `pulumi:"createdAt"`
	// All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
	Domains []string `pulumi:"domains"`
	// PEM-formatted certificate chain from the `certificateBody` to its root.
	IntermediatesBlob *string `pulumi:"intermediatesBlob"`
	// Timestamp (GMT) when the certificate will expire.
	NotAfter *string `pulumi:"notAfter"`
	// Timestamp (GMT) when the certificate will become valid.
	NotBefore *string `pulumi:"notBefore"`
	// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
	Replace *bool `pulumi:"replace"`
	// Timestamp (GMT) when the certificate was last updated.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type TlsPlatformCertificateState struct {
	// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
	AllowUntrustedRoot pulumi.BoolPtrInput
	// PEM-formatted certificate.
	CertificateBody pulumi.StringPtrInput
	// ID of TLS configuration to be used to terminate TLS traffic.
	ConfigurationId pulumi.StringPtrInput
	// Timestamp (GMT) when the certificate was created.
	CreatedAt pulumi.StringPtrInput
	// All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
	Domains pulumi.StringArrayInput
	// PEM-formatted certificate chain from the `certificateBody` to its root.
	IntermediatesBlob pulumi.StringPtrInput
	// Timestamp (GMT) when the certificate will expire.
	NotAfter pulumi.StringPtrInput
	// Timestamp (GMT) when the certificate will become valid.
	NotBefore pulumi.StringPtrInput
	// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
	Replace pulumi.BoolPtrInput
	// Timestamp (GMT) when the certificate was last updated.
	UpdatedAt pulumi.StringPtrInput
}

func (TlsPlatformCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*tlsPlatformCertificateState)(nil)).Elem()
}

type tlsPlatformCertificateArgs struct {
	// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
	AllowUntrustedRoot *bool `pulumi:"allowUntrustedRoot"`
	// PEM-formatted certificate.
	CertificateBody string `pulumi:"certificateBody"`
	// ID of TLS configuration to be used to terminate TLS traffic.
	ConfigurationId string `pulumi:"configurationId"`
	// PEM-formatted certificate chain from the `certificateBody` to its root.
	IntermediatesBlob string `pulumi:"intermediatesBlob"`
}

// The set of arguments for constructing a TlsPlatformCertificate resource.
type TlsPlatformCertificateArgs struct {
	// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
	AllowUntrustedRoot pulumi.BoolPtrInput
	// PEM-formatted certificate.
	CertificateBody pulumi.StringInput
	// ID of TLS configuration to be used to terminate TLS traffic.
	ConfigurationId pulumi.StringInput
	// PEM-formatted certificate chain from the `certificateBody` to its root.
	IntermediatesBlob pulumi.StringInput
}

func (TlsPlatformCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tlsPlatformCertificateArgs)(nil)).Elem()
}

type TlsPlatformCertificateInput interface {
	pulumi.Input

	ToTlsPlatformCertificateOutput() TlsPlatformCertificateOutput
	ToTlsPlatformCertificateOutputWithContext(ctx context.Context) TlsPlatformCertificateOutput
}

func (*TlsPlatformCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*TlsPlatformCertificate)(nil))
}

func (i *TlsPlatformCertificate) ToTlsPlatformCertificateOutput() TlsPlatformCertificateOutput {
	return i.ToTlsPlatformCertificateOutputWithContext(context.Background())
}

func (i *TlsPlatformCertificate) ToTlsPlatformCertificateOutputWithContext(ctx context.Context) TlsPlatformCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TlsPlatformCertificateOutput)
}

func (i *TlsPlatformCertificate) ToTlsPlatformCertificatePtrOutput() TlsPlatformCertificatePtrOutput {
	return i.ToTlsPlatformCertificatePtrOutputWithContext(context.Background())
}

func (i *TlsPlatformCertificate) ToTlsPlatformCertificatePtrOutputWithContext(ctx context.Context) TlsPlatformCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TlsPlatformCertificatePtrOutput)
}

type TlsPlatformCertificatePtrInput interface {
	pulumi.Input

	ToTlsPlatformCertificatePtrOutput() TlsPlatformCertificatePtrOutput
	ToTlsPlatformCertificatePtrOutputWithContext(ctx context.Context) TlsPlatformCertificatePtrOutput
}

type tlsPlatformCertificatePtrType TlsPlatformCertificateArgs

func (*tlsPlatformCertificatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TlsPlatformCertificate)(nil))
}

func (i *tlsPlatformCertificatePtrType) ToTlsPlatformCertificatePtrOutput() TlsPlatformCertificatePtrOutput {
	return i.ToTlsPlatformCertificatePtrOutputWithContext(context.Background())
}

func (i *tlsPlatformCertificatePtrType) ToTlsPlatformCertificatePtrOutputWithContext(ctx context.Context) TlsPlatformCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TlsPlatformCertificatePtrOutput)
}

// TlsPlatformCertificateArrayInput is an input type that accepts TlsPlatformCertificateArray and TlsPlatformCertificateArrayOutput values.
// You can construct a concrete instance of `TlsPlatformCertificateArrayInput` via:
//
//          TlsPlatformCertificateArray{ TlsPlatformCertificateArgs{...} }
type TlsPlatformCertificateArrayInput interface {
	pulumi.Input

	ToTlsPlatformCertificateArrayOutput() TlsPlatformCertificateArrayOutput
	ToTlsPlatformCertificateArrayOutputWithContext(context.Context) TlsPlatformCertificateArrayOutput
}

type TlsPlatformCertificateArray []TlsPlatformCertificateInput

func (TlsPlatformCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TlsPlatformCertificate)(nil))
}

func (i TlsPlatformCertificateArray) ToTlsPlatformCertificateArrayOutput() TlsPlatformCertificateArrayOutput {
	return i.ToTlsPlatformCertificateArrayOutputWithContext(context.Background())
}

func (i TlsPlatformCertificateArray) ToTlsPlatformCertificateArrayOutputWithContext(ctx context.Context) TlsPlatformCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TlsPlatformCertificateArrayOutput)
}

// TlsPlatformCertificateMapInput is an input type that accepts TlsPlatformCertificateMap and TlsPlatformCertificateMapOutput values.
// You can construct a concrete instance of `TlsPlatformCertificateMapInput` via:
//
//          TlsPlatformCertificateMap{ "key": TlsPlatformCertificateArgs{...} }
type TlsPlatformCertificateMapInput interface {
	pulumi.Input

	ToTlsPlatformCertificateMapOutput() TlsPlatformCertificateMapOutput
	ToTlsPlatformCertificateMapOutputWithContext(context.Context) TlsPlatformCertificateMapOutput
}

type TlsPlatformCertificateMap map[string]TlsPlatformCertificateInput

func (TlsPlatformCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TlsPlatformCertificate)(nil))
}

func (i TlsPlatformCertificateMap) ToTlsPlatformCertificateMapOutput() TlsPlatformCertificateMapOutput {
	return i.ToTlsPlatformCertificateMapOutputWithContext(context.Background())
}

func (i TlsPlatformCertificateMap) ToTlsPlatformCertificateMapOutputWithContext(ctx context.Context) TlsPlatformCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TlsPlatformCertificateMapOutput)
}

type TlsPlatformCertificateOutput struct {
	*pulumi.OutputState
}

func (TlsPlatformCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TlsPlatformCertificate)(nil))
}

func (o TlsPlatformCertificateOutput) ToTlsPlatformCertificateOutput() TlsPlatformCertificateOutput {
	return o
}

func (o TlsPlatformCertificateOutput) ToTlsPlatformCertificateOutputWithContext(ctx context.Context) TlsPlatformCertificateOutput {
	return o
}

func (o TlsPlatformCertificateOutput) ToTlsPlatformCertificatePtrOutput() TlsPlatformCertificatePtrOutput {
	return o.ToTlsPlatformCertificatePtrOutputWithContext(context.Background())
}

func (o TlsPlatformCertificateOutput) ToTlsPlatformCertificatePtrOutputWithContext(ctx context.Context) TlsPlatformCertificatePtrOutput {
	return o.ApplyT(func(v TlsPlatformCertificate) *TlsPlatformCertificate {
		return &v
	}).(TlsPlatformCertificatePtrOutput)
}

type TlsPlatformCertificatePtrOutput struct {
	*pulumi.OutputState
}

func (TlsPlatformCertificatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TlsPlatformCertificate)(nil))
}

func (o TlsPlatformCertificatePtrOutput) ToTlsPlatformCertificatePtrOutput() TlsPlatformCertificatePtrOutput {
	return o
}

func (o TlsPlatformCertificatePtrOutput) ToTlsPlatformCertificatePtrOutputWithContext(ctx context.Context) TlsPlatformCertificatePtrOutput {
	return o
}

type TlsPlatformCertificateArrayOutput struct{ *pulumi.OutputState }

func (TlsPlatformCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TlsPlatformCertificate)(nil))
}

func (o TlsPlatformCertificateArrayOutput) ToTlsPlatformCertificateArrayOutput() TlsPlatformCertificateArrayOutput {
	return o
}

func (o TlsPlatformCertificateArrayOutput) ToTlsPlatformCertificateArrayOutputWithContext(ctx context.Context) TlsPlatformCertificateArrayOutput {
	return o
}

func (o TlsPlatformCertificateArrayOutput) Index(i pulumi.IntInput) TlsPlatformCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TlsPlatformCertificate {
		return vs[0].([]TlsPlatformCertificate)[vs[1].(int)]
	}).(TlsPlatformCertificateOutput)
}

type TlsPlatformCertificateMapOutput struct{ *pulumi.OutputState }

func (TlsPlatformCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TlsPlatformCertificate)(nil))
}

func (o TlsPlatformCertificateMapOutput) ToTlsPlatformCertificateMapOutput() TlsPlatformCertificateMapOutput {
	return o
}

func (o TlsPlatformCertificateMapOutput) ToTlsPlatformCertificateMapOutputWithContext(ctx context.Context) TlsPlatformCertificateMapOutput {
	return o
}

func (o TlsPlatformCertificateMapOutput) MapIndex(k pulumi.StringInput) TlsPlatformCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TlsPlatformCertificate {
		return vs[0].(map[string]TlsPlatformCertificate)[vs[1].(string)]
	}).(TlsPlatformCertificateOutput)
}

func init() {
	pulumi.RegisterOutputType(TlsPlatformCertificateOutput{})
	pulumi.RegisterOutputType(TlsPlatformCertificatePtrOutput{})
	pulumi.RegisterOutputType(TlsPlatformCertificateArrayOutput{})
	pulumi.RegisterOutputType(TlsPlatformCertificateMapOutput{})
}