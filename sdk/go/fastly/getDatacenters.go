// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the list of the [Fastly datacenters](https://developer.fastly.com/reference/api/utils/pops/).
func GetDatacenters(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetDatacentersResult, error) {
	var rv GetDatacentersResult
	err := ctx.Invoke("fastly:index/getDatacenters:getDatacenters", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getDatacenters.
type GetDatacentersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of all Fastly POPs.
	Pops []GetDatacentersPop `pulumi:"pops"`
}