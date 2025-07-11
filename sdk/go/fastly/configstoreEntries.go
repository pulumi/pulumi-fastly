// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-fastly/sdk/v10/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Fastly Config Stores entries can be imported using the corresponding Config Store ID with the `/entries` suffix, e.g.
//
// ```sh
// $ pulumi import fastly:index/configstoreEntries:ConfigstoreEntries example xxxxxxxxxxxxxxxxxxxx/entries
// ```
type ConfigstoreEntries struct {
	pulumi.CustomResourceState

	// A map representing an entry in the Config Store, (key/value)
	Entries       pulumi.StringMapOutput `pulumi:"entries"`
	ManageEntries pulumi.BoolPtrOutput   `pulumi:"manageEntries"`
	// An alphanumeric string identifying the Config Store.
	StoreId pulumi.StringOutput `pulumi:"storeId"`
}

// NewConfigstoreEntries registers a new resource with the given unique name, arguments, and options.
func NewConfigstoreEntries(ctx *pulumi.Context,
	name string, args *ConfigstoreEntriesArgs, opts ...pulumi.ResourceOption) (*ConfigstoreEntries, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entries == nil {
		return nil, errors.New("invalid value for required argument 'Entries'")
	}
	if args.StoreId == nil {
		return nil, errors.New("invalid value for required argument 'StoreId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConfigstoreEntries
	err := ctx.RegisterResource("fastly:index/configstoreEntries:ConfigstoreEntries", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConfigstoreEntries gets an existing ConfigstoreEntries resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConfigstoreEntries(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConfigstoreEntriesState, opts ...pulumi.ResourceOption) (*ConfigstoreEntries, error) {
	var resource ConfigstoreEntries
	err := ctx.ReadResource("fastly:index/configstoreEntries:ConfigstoreEntries", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConfigstoreEntries resources.
type configstoreEntriesState struct {
	// A map representing an entry in the Config Store, (key/value)
	Entries       map[string]string `pulumi:"entries"`
	ManageEntries *bool             `pulumi:"manageEntries"`
	// An alphanumeric string identifying the Config Store.
	StoreId *string `pulumi:"storeId"`
}

type ConfigstoreEntriesState struct {
	// A map representing an entry in the Config Store, (key/value)
	Entries       pulumi.StringMapInput
	ManageEntries pulumi.BoolPtrInput
	// An alphanumeric string identifying the Config Store.
	StoreId pulumi.StringPtrInput
}

func (ConfigstoreEntriesState) ElementType() reflect.Type {
	return reflect.TypeOf((*configstoreEntriesState)(nil)).Elem()
}

type configstoreEntriesArgs struct {
	// A map representing an entry in the Config Store, (key/value)
	Entries       map[string]string `pulumi:"entries"`
	ManageEntries *bool             `pulumi:"manageEntries"`
	// An alphanumeric string identifying the Config Store.
	StoreId string `pulumi:"storeId"`
}

// The set of arguments for constructing a ConfigstoreEntries resource.
type ConfigstoreEntriesArgs struct {
	// A map representing an entry in the Config Store, (key/value)
	Entries       pulumi.StringMapInput
	ManageEntries pulumi.BoolPtrInput
	// An alphanumeric string identifying the Config Store.
	StoreId pulumi.StringInput
}

func (ConfigstoreEntriesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*configstoreEntriesArgs)(nil)).Elem()
}

type ConfigstoreEntriesInput interface {
	pulumi.Input

	ToConfigstoreEntriesOutput() ConfigstoreEntriesOutput
	ToConfigstoreEntriesOutputWithContext(ctx context.Context) ConfigstoreEntriesOutput
}

func (*ConfigstoreEntries) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigstoreEntries)(nil)).Elem()
}

func (i *ConfigstoreEntries) ToConfigstoreEntriesOutput() ConfigstoreEntriesOutput {
	return i.ToConfigstoreEntriesOutputWithContext(context.Background())
}

func (i *ConfigstoreEntries) ToConfigstoreEntriesOutputWithContext(ctx context.Context) ConfigstoreEntriesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigstoreEntriesOutput)
}

// ConfigstoreEntriesArrayInput is an input type that accepts ConfigstoreEntriesArray and ConfigstoreEntriesArrayOutput values.
// You can construct a concrete instance of `ConfigstoreEntriesArrayInput` via:
//
//	ConfigstoreEntriesArray{ ConfigstoreEntriesArgs{...} }
type ConfigstoreEntriesArrayInput interface {
	pulumi.Input

	ToConfigstoreEntriesArrayOutput() ConfigstoreEntriesArrayOutput
	ToConfigstoreEntriesArrayOutputWithContext(context.Context) ConfigstoreEntriesArrayOutput
}

type ConfigstoreEntriesArray []ConfigstoreEntriesInput

func (ConfigstoreEntriesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigstoreEntries)(nil)).Elem()
}

func (i ConfigstoreEntriesArray) ToConfigstoreEntriesArrayOutput() ConfigstoreEntriesArrayOutput {
	return i.ToConfigstoreEntriesArrayOutputWithContext(context.Background())
}

func (i ConfigstoreEntriesArray) ToConfigstoreEntriesArrayOutputWithContext(ctx context.Context) ConfigstoreEntriesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigstoreEntriesArrayOutput)
}

// ConfigstoreEntriesMapInput is an input type that accepts ConfigstoreEntriesMap and ConfigstoreEntriesMapOutput values.
// You can construct a concrete instance of `ConfigstoreEntriesMapInput` via:
//
//	ConfigstoreEntriesMap{ "key": ConfigstoreEntriesArgs{...} }
type ConfigstoreEntriesMapInput interface {
	pulumi.Input

	ToConfigstoreEntriesMapOutput() ConfigstoreEntriesMapOutput
	ToConfigstoreEntriesMapOutputWithContext(context.Context) ConfigstoreEntriesMapOutput
}

type ConfigstoreEntriesMap map[string]ConfigstoreEntriesInput

func (ConfigstoreEntriesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigstoreEntries)(nil)).Elem()
}

func (i ConfigstoreEntriesMap) ToConfigstoreEntriesMapOutput() ConfigstoreEntriesMapOutput {
	return i.ToConfigstoreEntriesMapOutputWithContext(context.Background())
}

func (i ConfigstoreEntriesMap) ToConfigstoreEntriesMapOutputWithContext(ctx context.Context) ConfigstoreEntriesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConfigstoreEntriesMapOutput)
}

type ConfigstoreEntriesOutput struct{ *pulumi.OutputState }

func (ConfigstoreEntriesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConfigstoreEntries)(nil)).Elem()
}

func (o ConfigstoreEntriesOutput) ToConfigstoreEntriesOutput() ConfigstoreEntriesOutput {
	return o
}

func (o ConfigstoreEntriesOutput) ToConfigstoreEntriesOutputWithContext(ctx context.Context) ConfigstoreEntriesOutput {
	return o
}

// A map representing an entry in the Config Store, (key/value)
func (o ConfigstoreEntriesOutput) Entries() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConfigstoreEntries) pulumi.StringMapOutput { return v.Entries }).(pulumi.StringMapOutput)
}

func (o ConfigstoreEntriesOutput) ManageEntries() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ConfigstoreEntries) pulumi.BoolPtrOutput { return v.ManageEntries }).(pulumi.BoolPtrOutput)
}

// An alphanumeric string identifying the Config Store.
func (o ConfigstoreEntriesOutput) StoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConfigstoreEntries) pulumi.StringOutput { return v.StoreId }).(pulumi.StringOutput)
}

type ConfigstoreEntriesArrayOutput struct{ *pulumi.OutputState }

func (ConfigstoreEntriesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConfigstoreEntries)(nil)).Elem()
}

func (o ConfigstoreEntriesArrayOutput) ToConfigstoreEntriesArrayOutput() ConfigstoreEntriesArrayOutput {
	return o
}

func (o ConfigstoreEntriesArrayOutput) ToConfigstoreEntriesArrayOutputWithContext(ctx context.Context) ConfigstoreEntriesArrayOutput {
	return o
}

func (o ConfigstoreEntriesArrayOutput) Index(i pulumi.IntInput) ConfigstoreEntriesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConfigstoreEntries {
		return vs[0].([]*ConfigstoreEntries)[vs[1].(int)]
	}).(ConfigstoreEntriesOutput)
}

type ConfigstoreEntriesMapOutput struct{ *pulumi.OutputState }

func (ConfigstoreEntriesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConfigstoreEntries)(nil)).Elem()
}

func (o ConfigstoreEntriesMapOutput) ToConfigstoreEntriesMapOutput() ConfigstoreEntriesMapOutput {
	return o
}

func (o ConfigstoreEntriesMapOutput) ToConfigstoreEntriesMapOutputWithContext(ctx context.Context) ConfigstoreEntriesMapOutput {
	return o
}

func (o ConfigstoreEntriesMapOutput) MapIndex(k pulumi.StringInput) ConfigstoreEntriesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConfigstoreEntries {
		return vs[0].(map[string]*ConfigstoreEntries)[vs[1].(string)]
	}).(ConfigstoreEntriesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigstoreEntriesInput)(nil)).Elem(), &ConfigstoreEntries{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigstoreEntriesArrayInput)(nil)).Elem(), ConfigstoreEntriesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConfigstoreEntriesMapInput)(nil)).Elem(), ConfigstoreEntriesMap{})
	pulumi.RegisterOutputType(ConfigstoreEntriesOutput{})
	pulumi.RegisterOutputType(ConfigstoreEntriesArrayOutput{})
	pulumi.RegisterOutputType(ConfigstoreEntriesMapOutput{})
}
