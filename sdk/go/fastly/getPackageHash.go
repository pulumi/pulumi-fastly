// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-fastly/sdk/v8/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to generate a SHA512 hash of all files (in sorted order) within the package.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-fastly/sdk/v8/go/fastly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			examplePackageHash, err := fastly.GetPackageHash(ctx, &fastly.GetPackageHashArgs{
//				Filename: pulumi.StringRef("./path/to/package.tar.gz"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewServiceCompute(ctx, "exampleServiceCompute", &fastly.ServiceComputeArgs{
//				Package: &fastly.ServiceComputePackageArgs{
//					Filename:       pulumi.String("./path/to/package.tar.gz"),
//					SourceCodeHash: *pulumi.String(examplePackageHash.Hash),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPackageHash(ctx *pulumi.Context, args *GetPackageHashArgs, opts ...pulumi.InvokeOption) (*GetPackageHashResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPackageHashResult
	err := ctx.Invoke("fastly:index/getPackageHash:getPackageHash", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPackageHash.
type GetPackageHashArgs struct {
	// The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
	Content *string `pulumi:"content"`
	// The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
	Filename *string `pulumi:"filename"`
}

// A collection of values returned by getPackageHash.
type GetPackageHashResult struct {
	// The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
	Content *string `pulumi:"content"`
	// The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
	Filename *string `pulumi:"filename"`
	// A SHA512 hash of all files (in sorted order) within the package.
	Hash string `pulumi:"hash"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetPackageHashOutput(ctx *pulumi.Context, args GetPackageHashOutputArgs, opts ...pulumi.InvokeOption) GetPackageHashResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPackageHashResult, error) {
			args := v.(GetPackageHashArgs)
			r, err := GetPackageHash(ctx, &args, opts...)
			var s GetPackageHashResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPackageHashResultOutput)
}

// A collection of arguments for invoking getPackageHash.
type GetPackageHashOutputArgs struct {
	// The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
	Content pulumi.StringPtrInput `pulumi:"content"`
	// The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
	Filename pulumi.StringPtrInput `pulumi:"filename"`
}

func (GetPackageHashOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPackageHashArgs)(nil)).Elem()
}

// A collection of values returned by getPackageHash.
type GetPackageHashResultOutput struct{ *pulumi.OutputState }

func (GetPackageHashResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPackageHashResult)(nil)).Elem()
}

func (o GetPackageHashResultOutput) ToGetPackageHashResultOutput() GetPackageHashResultOutput {
	return o
}

func (o GetPackageHashResultOutput) ToGetPackageHashResultOutputWithContext(ctx context.Context) GetPackageHashResultOutput {
	return o
}

// The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
func (o GetPackageHashResultOutput) Content() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPackageHashResult) *string { return v.Content }).(pulumi.StringPtrOutput)
}

// The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
func (o GetPackageHashResultOutput) Filename() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPackageHashResult) *string { return v.Filename }).(pulumi.StringPtrOutput)
}

// A SHA512 hash of all files (in sorted order) within the package.
func (o GetPackageHashResultOutput) Hash() pulumi.StringOutput {
	return o.ApplyT(func(v GetPackageHashResult) string { return v.Hash }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPackageHashResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPackageHashResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPackageHashResultOutput{})
}