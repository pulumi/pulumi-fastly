// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the list of the [Fastly services](https://developer.fastly.com/reference/api/services/service/).
func GetServices(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetServicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServicesResult
	err := ctx.Invoke("fastly:index/getServices:getServices", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getServices.
type GetServicesResult struct {
	// A detailed list of Fastly services in your account. This is limited to the services the API token can read.
	Details []GetServicesDetail `pulumi:"details"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of service IDs in your account. This is limited to the services the API token can read.
	Ids []string `pulumi:"ids"`
}

func GetServicesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetServicesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetServicesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("fastly:index/getServices:getServices", nil, GetServicesResultOutput{}, options).(GetServicesResultOutput), nil
	}).(GetServicesResultOutput)
}

// A collection of values returned by getServices.
type GetServicesResultOutput struct{ *pulumi.OutputState }

func (GetServicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicesResult)(nil)).Elem()
}

func (o GetServicesResultOutput) ToGetServicesResultOutput() GetServicesResultOutput {
	return o
}

func (o GetServicesResultOutput) ToGetServicesResultOutputWithContext(ctx context.Context) GetServicesResultOutput {
	return o
}

// A detailed list of Fastly services in your account. This is limited to the services the API token can read.
func (o GetServicesResultOutput) Details() GetServicesDetailArrayOutput {
	return o.ApplyT(func(v GetServicesResult) []GetServicesDetail { return v.Details }).(GetServicesDetailArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of service IDs in your account. This is limited to the services the API token can read.
func (o GetServicesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServicesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServicesResultOutput{})
}
