// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the fastly package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Fastly API Key from https://app.fastly.com/#account
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// Fastly API URL
	BaseUrl pulumi.StringPtrOutput `pulumi:"baseUrl"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:fastly", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Fastly API Key from https://app.fastly.com/#account
	ApiKey *string `pulumi:"apiKey"`
	// Fastly API URL
	BaseUrl *string `pulumi:"baseUrl"`
	// Set this to `true` to disable HTTP/1.x fallback mechanism that the underlying Go library will attempt upon connection to
	// `api.fastly.com:443` by default. This may slightly improve the provider's performance and reduce unnecessary TLS
	// handshakes. Default: `false`
	ForceHttp2 *bool `pulumi:"forceHttp2"`
	// Set to `true` if your configuration only consumes data sources that do not require authentication, such as
	// `getFastlyIpRanges`
	NoAuth *bool `pulumi:"noAuth"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Fastly API Key from https://app.fastly.com/#account
	ApiKey pulumi.StringPtrInput
	// Fastly API URL
	BaseUrl pulumi.StringPtrInput
	// Set this to `true` to disable HTTP/1.x fallback mechanism that the underlying Go library will attempt upon connection to
	// `api.fastly.com:443` by default. This may slightly improve the provider's performance and reduce unnecessary TLS
	// handshakes. Default: `false`
	ForceHttp2 pulumi.BoolPtrInput
	// Set to `true` if your configuration only consumes data sources that do not require authentication, such as
	// `getFastlyIpRanges`
	NoAuth pulumi.BoolPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

// This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
func (r *Provider) TerraformConfig(ctx *pulumi.Context) (ProviderTerraformConfigResultOutput, error) {
	out, err := ctx.Call("pulumi:providers:fastly/terraformConfig", nil, ProviderTerraformConfigResultOutput{}, r)
	if err != nil {
		return ProviderTerraformConfigResultOutput{}, err
	}
	return out.(ProviderTerraformConfigResultOutput), nil
}

type ProviderTerraformConfigResult struct {
	Result map[string]interface{} `pulumi:"result"`
}

type ProviderTerraformConfigResultOutput struct{ *pulumi.OutputState }

func (ProviderTerraformConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderTerraformConfigResult)(nil)).Elem()
}

func (o ProviderTerraformConfigResultOutput) Result() pulumi.MapOutput {
	return o.ApplyT(func(v ProviderTerraformConfigResult) map[string]interface{} { return v.Result }).(pulumi.MapOutput)
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Fastly API Key from https://app.fastly.com/#account
func (o ProviderOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// Fastly API URL
func (o ProviderOutput) BaseUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.BaseUrl }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderTerraformConfigResultOutput{})
}
