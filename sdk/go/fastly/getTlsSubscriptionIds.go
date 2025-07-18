// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the list of IDs of TLS Subscriptions in Fastly.
func GetTlsSubscriptionIds(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetTlsSubscriptionIdsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTlsSubscriptionIdsResult
	err := ctx.Invoke("fastly:index/getTlsSubscriptionIds:getTlsSubscriptionIds", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getTlsSubscriptionIds.
type GetTlsSubscriptionIdsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// IDs of available TLS subscriptions.
	Ids []string `pulumi:"ids"`
}

func GetTlsSubscriptionIdsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetTlsSubscriptionIdsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetTlsSubscriptionIdsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("fastly:index/getTlsSubscriptionIds:getTlsSubscriptionIds", nil, GetTlsSubscriptionIdsResultOutput{}, options).(GetTlsSubscriptionIdsResultOutput), nil
	}).(GetTlsSubscriptionIdsResultOutput)
}

// A collection of values returned by getTlsSubscriptionIds.
type GetTlsSubscriptionIdsResultOutput struct{ *pulumi.OutputState }

func (GetTlsSubscriptionIdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTlsSubscriptionIdsResult)(nil)).Elem()
}

func (o GetTlsSubscriptionIdsResultOutput) ToGetTlsSubscriptionIdsResultOutput() GetTlsSubscriptionIdsResultOutput {
	return o
}

func (o GetTlsSubscriptionIdsResultOutput) ToGetTlsSubscriptionIdsResultOutputWithContext(ctx context.Context) GetTlsSubscriptionIdsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTlsSubscriptionIdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTlsSubscriptionIdsResult) string { return v.Id }).(pulumi.StringOutput)
}

// IDs of available TLS subscriptions.
func (o GetTlsSubscriptionIdsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTlsSubscriptionIdsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTlsSubscriptionIdsResultOutput{})
}
