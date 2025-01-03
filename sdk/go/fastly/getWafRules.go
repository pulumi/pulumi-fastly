// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v8/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetWafRules(ctx *pulumi.Context, args *GetWafRulesArgs, opts ...pulumi.InvokeOption) (*GetWafRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWafRulesResult
	err := ctx.Invoke("fastly:index/getWafRules:getWafRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesArgs struct {
	// Exclusion filter by WAF rule's ModSecurity ID.
	ExcludeModsecRuleIds []int `pulumi:"excludeModsecRuleIds"`
	// A list of modsecurity rules IDs to be used as filters for the data set.
	ModsecRuleIds []int `pulumi:"modsecRuleIds"`
	// Inclusion filter by WAF rule's publishers.
	Publishers []string `pulumi:"publishers"`
	// Inclusion filter by WAF rule's tags.
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getWafRules.
type GetWafRulesResult struct {
	// A list of modsecurity rules IDs to be excluded from the data set.
	ExcludeModsecRuleIds []int `pulumi:"excludeModsecRuleIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of modsecurity rules IDs to be used as filters for the data set.
	ModsecRuleIds []int `pulumi:"modsecRuleIds"`
	// A list of publishers to be used as filters for the data set.
	Publishers []string `pulumi:"publishers"`
	// The list of rules that results from any given combination of filters.
	Rules []GetWafRulesRule `pulumi:"rules"`
	// A list of tags to be used as filters for the data set.
	Tags []string `pulumi:"tags"`
}

func GetWafRulesOutput(ctx *pulumi.Context, args GetWafRulesOutputArgs, opts ...pulumi.InvokeOption) GetWafRulesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWafRulesResultOutput, error) {
			args := v.(GetWafRulesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("fastly:index/getWafRules:getWafRules", args, GetWafRulesResultOutput{}, options).(GetWafRulesResultOutput), nil
		}).(GetWafRulesResultOutput)
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesOutputArgs struct {
	// Exclusion filter by WAF rule's ModSecurity ID.
	ExcludeModsecRuleIds pulumi.IntArrayInput `pulumi:"excludeModsecRuleIds"`
	// A list of modsecurity rules IDs to be used as filters for the data set.
	ModsecRuleIds pulumi.IntArrayInput `pulumi:"modsecRuleIds"`
	// Inclusion filter by WAF rule's publishers.
	Publishers pulumi.StringArrayInput `pulumi:"publishers"`
	// Inclusion filter by WAF rule's tags.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (GetWafRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafRulesArgs)(nil)).Elem()
}

// A collection of values returned by getWafRules.
type GetWafRulesResultOutput struct{ *pulumi.OutputState }

func (GetWafRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafRulesResult)(nil)).Elem()
}

func (o GetWafRulesResultOutput) ToGetWafRulesResultOutput() GetWafRulesResultOutput {
	return o
}

func (o GetWafRulesResultOutput) ToGetWafRulesResultOutputWithContext(ctx context.Context) GetWafRulesResultOutput {
	return o
}

// A list of modsecurity rules IDs to be excluded from the data set.
func (o GetWafRulesResultOutput) ExcludeModsecRuleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []int { return v.ExcludeModsecRuleIds }).(pulumi.IntArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWafRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWafRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of modsecurity rules IDs to be used as filters for the data set.
func (o GetWafRulesResultOutput) ModsecRuleIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []int { return v.ModsecRuleIds }).(pulumi.IntArrayOutput)
}

// A list of publishers to be used as filters for the data set.
func (o GetWafRulesResultOutput) Publishers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []string { return v.Publishers }).(pulumi.StringArrayOutput)
}

// The list of rules that results from any given combination of filters.
func (o GetWafRulesResultOutput) Rules() GetWafRulesRuleArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []GetWafRulesRule { return v.Rules }).(GetWafRulesRuleArrayOutput)
}

// A list of tags to be used as filters for the data set.
func (o GetWafRulesResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWafRulesResultOutput{})
}
