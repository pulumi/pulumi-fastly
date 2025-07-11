// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetKvstores(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetKvstoresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKvstoresResult
	err := ctx.Invoke("fastly:index/getKvstores:getKvstores", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getKvstores.
type GetKvstoresResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of all KV Stores.
	Stores []GetKvstoresStore `pulumi:"stores"`
}

func GetKvstoresOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetKvstoresResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetKvstoresResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("fastly:index/getKvstores:getKvstores", nil, GetKvstoresResultOutput{}, options).(GetKvstoresResultOutput), nil
	}).(GetKvstoresResultOutput)
}

// A collection of values returned by getKvstores.
type GetKvstoresResultOutput struct{ *pulumi.OutputState }

func (GetKvstoresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKvstoresResult)(nil)).Elem()
}

func (o GetKvstoresResultOutput) ToGetKvstoresResultOutput() GetKvstoresResultOutput {
	return o
}

func (o GetKvstoresResultOutput) ToGetKvstoresResultOutputWithContext(ctx context.Context) GetKvstoresResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetKvstoresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKvstoresResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of all KV Stores.
func (o GetKvstoresResultOutput) Stores() GetKvstoresStoreArrayOutput {
	return o.ApplyT(func(v GetKvstoresResult) []GetKvstoresStore { return v.Stores }).(GetKvstoresStoreArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKvstoresResultOutput{})
}
