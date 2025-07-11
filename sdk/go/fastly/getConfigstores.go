// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetConfigstores(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetConfigstoresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConfigstoresResult
	err := ctx.Invoke("fastly:index/getConfigstores:getConfigstores", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getConfigstores.
type GetConfigstoresResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of all Config Stores.
	Stores []GetConfigstoresStore `pulumi:"stores"`
}

func GetConfigstoresOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetConfigstoresResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetConfigstoresResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("fastly:index/getConfigstores:getConfigstores", nil, GetConfigstoresResultOutput{}, options).(GetConfigstoresResultOutput), nil
	}).(GetConfigstoresResultOutput)
}

// A collection of values returned by getConfigstores.
type GetConfigstoresResultOutput struct{ *pulumi.OutputState }

func (GetConfigstoresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigstoresResult)(nil)).Elem()
}

func (o GetConfigstoresResultOutput) ToGetConfigstoresResultOutput() GetConfigstoresResultOutput {
	return o
}

func (o GetConfigstoresResultOutput) ToGetConfigstoresResultOutputWithContext(ctx context.Context) GetConfigstoresResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetConfigstoresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConfigstoresResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of all Config Stores.
func (o GetConfigstoresResultOutput) Stores() GetConfigstoresStoreArrayOutput {
	return o.ApplyT(func(v GetConfigstoresResult) []GetConfigstoresStore { return v.Stores }).(GetConfigstoresStoreArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConfigstoresResultOutput{})
}
