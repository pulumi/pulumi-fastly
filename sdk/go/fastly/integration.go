// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fastly

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-fastly/sdk/v8/go/fastly/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := fastly.NewIntegration(ctx, "mailinglist_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my mailing list integration"),
//				Description: pulumi.String("example mailing list integration"),
//				Type:        pulumi.String("mailinglist"),
//				Config: pulumi.Map{
//					"address": pulumi.Any("incoming-hook@my.domain.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewIntegration(ctx, "microsoftteams_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my Microsoft Teams integration"),
//				Description: pulumi.String("example Microsoft Teams integration"),
//				Type:        pulumi.String("microsoftteams"),
//				Config: pulumi.Map{
//					"webhook": pulumi.Any("https://m365x012345.webhook.office.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewIntegration(ctx, "newrelic_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my New Relic integration"),
//				Description: pulumi.String("example New Relic integration"),
//				Type:        pulumi.String("newrelic"),
//				Config: pulumi.Map{
//					"account": pulumi.Any("XXXXXXX"),
//					"key":     pulumi.Any("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewIntegration(ctx, "pagerduty_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my PagerDuty integration"),
//				Description: pulumi.String("example PagerDuty integration"),
//				Type:        pulumi.String("pagerduty"),
//				Config: pulumi.Map{
//					"key": pulumi.Any("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewIntegration(ctx, "slack_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my Slack integration"),
//				Description: pulumi.String("example Slack integration"),
//				Type:        pulumi.String("slack"),
//				Config: pulumi.Map{
//					"webhook": pulumi.Any("https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXXXXXXXXXXXXXXXXXX"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fastly.NewIntegration(ctx, "webhook_example", &fastly.IntegrationArgs{
//				Name:        pulumi.String("my webhook integration"),
//				Description: pulumi.String("example webhook integration"),
//				Type:        pulumi.String("webhook"),
//				Config: pulumi.Map{
//					"webhook": pulumi.Any("https://my.domain.com/webhook"),
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
type Integration struct {
	pulumi.CustomResourceState

	// Configuration specific to the integration `type` (see documentation examples).
	Config pulumi.MapOutput `pulumi:"config"`
	// User submitted description of the integration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// User submitted name of the integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewIntegration registers a new resource with the given unique name, arguments, and options.
func NewIntegration(ctx *pulumi.Context,
	name string, args *IntegrationArgs, opts ...pulumi.ResourceOption) (*Integration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.Config != nil {
		args.Config = pulumi.ToSecret(args.Config).(pulumi.MapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"config",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Integration
	err := ctx.RegisterResource("fastly:index/integration:Integration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegration gets an existing Integration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationState, opts ...pulumi.ResourceOption) (*Integration, error) {
	var resource Integration
	err := ctx.ReadResource("fastly:index/integration:Integration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Integration resources.
type integrationState struct {
	// Configuration specific to the integration `type` (see documentation examples).
	Config map[string]interface{} `pulumi:"config"`
	// User submitted description of the integration.
	Description *string `pulumi:"description"`
	// User submitted name of the integration.
	Name *string `pulumi:"name"`
	// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
	Type *string `pulumi:"type"`
}

type IntegrationState struct {
	// Configuration specific to the integration `type` (see documentation examples).
	Config pulumi.MapInput
	// User submitted description of the integration.
	Description pulumi.StringPtrInput
	// User submitted name of the integration.
	Name pulumi.StringPtrInput
	// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
	Type pulumi.StringPtrInput
}

func (IntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationState)(nil)).Elem()
}

type integrationArgs struct {
	// Configuration specific to the integration `type` (see documentation examples).
	Config map[string]interface{} `pulumi:"config"`
	// User submitted description of the integration.
	Description *string `pulumi:"description"`
	// User submitted name of the integration.
	Name *string `pulumi:"name"`
	// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Integration resource.
type IntegrationArgs struct {
	// Configuration specific to the integration `type` (see documentation examples).
	Config pulumi.MapInput
	// User submitted description of the integration.
	Description pulumi.StringPtrInput
	// User submitted name of the integration.
	Name pulumi.StringPtrInput
	// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
	Type pulumi.StringInput
}

func (IntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationArgs)(nil)).Elem()
}

type IntegrationInput interface {
	pulumi.Input

	ToIntegrationOutput() IntegrationOutput
	ToIntegrationOutputWithContext(ctx context.Context) IntegrationOutput
}

func (*Integration) ElementType() reflect.Type {
	return reflect.TypeOf((**Integration)(nil)).Elem()
}

func (i *Integration) ToIntegrationOutput() IntegrationOutput {
	return i.ToIntegrationOutputWithContext(context.Background())
}

func (i *Integration) ToIntegrationOutputWithContext(ctx context.Context) IntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationOutput)
}

// IntegrationArrayInput is an input type that accepts IntegrationArray and IntegrationArrayOutput values.
// You can construct a concrete instance of `IntegrationArrayInput` via:
//
//	IntegrationArray{ IntegrationArgs{...} }
type IntegrationArrayInput interface {
	pulumi.Input

	ToIntegrationArrayOutput() IntegrationArrayOutput
	ToIntegrationArrayOutputWithContext(context.Context) IntegrationArrayOutput
}

type IntegrationArray []IntegrationInput

func (IntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Integration)(nil)).Elem()
}

func (i IntegrationArray) ToIntegrationArrayOutput() IntegrationArrayOutput {
	return i.ToIntegrationArrayOutputWithContext(context.Background())
}

func (i IntegrationArray) ToIntegrationArrayOutputWithContext(ctx context.Context) IntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationArrayOutput)
}

// IntegrationMapInput is an input type that accepts IntegrationMap and IntegrationMapOutput values.
// You can construct a concrete instance of `IntegrationMapInput` via:
//
//	IntegrationMap{ "key": IntegrationArgs{...} }
type IntegrationMapInput interface {
	pulumi.Input

	ToIntegrationMapOutput() IntegrationMapOutput
	ToIntegrationMapOutputWithContext(context.Context) IntegrationMapOutput
}

type IntegrationMap map[string]IntegrationInput

func (IntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Integration)(nil)).Elem()
}

func (i IntegrationMap) ToIntegrationMapOutput() IntegrationMapOutput {
	return i.ToIntegrationMapOutputWithContext(context.Background())
}

func (i IntegrationMap) ToIntegrationMapOutputWithContext(ctx context.Context) IntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationMapOutput)
}

type IntegrationOutput struct{ *pulumi.OutputState }

func (IntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Integration)(nil)).Elem()
}

func (o IntegrationOutput) ToIntegrationOutput() IntegrationOutput {
	return o
}

func (o IntegrationOutput) ToIntegrationOutputWithContext(ctx context.Context) IntegrationOutput {
	return o
}

// Configuration specific to the integration `type` (see documentation examples).
func (o IntegrationOutput) Config() pulumi.MapOutput {
	return o.ApplyT(func(v *Integration) pulumi.MapOutput { return v.Config }).(pulumi.MapOutput)
}

// User submitted description of the integration.
func (o IntegrationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Integration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// User submitted name of the integration.
func (o IntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Integration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
func (o IntegrationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Integration) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type IntegrationArrayOutput struct{ *pulumi.OutputState }

func (IntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Integration)(nil)).Elem()
}

func (o IntegrationArrayOutput) ToIntegrationArrayOutput() IntegrationArrayOutput {
	return o
}

func (o IntegrationArrayOutput) ToIntegrationArrayOutputWithContext(ctx context.Context) IntegrationArrayOutput {
	return o
}

func (o IntegrationArrayOutput) Index(i pulumi.IntInput) IntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Integration {
		return vs[0].([]*Integration)[vs[1].(int)]
	}).(IntegrationOutput)
}

type IntegrationMapOutput struct{ *pulumi.OutputState }

func (IntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Integration)(nil)).Elem()
}

func (o IntegrationMapOutput) ToIntegrationMapOutput() IntegrationMapOutput {
	return o
}

func (o IntegrationMapOutput) ToIntegrationMapOutputWithContext(ctx context.Context) IntegrationMapOutput {
	return o
}

func (o IntegrationMapOutput) MapIndex(k pulumi.StringInput) IntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Integration {
		return vs[0].(map[string]*Integration)[vs[1].(string)]
	}).(IntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationInput)(nil)).Elem(), &Integration{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationArrayInput)(nil)).Elem(), IntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationMapInput)(nil)).Elem(), IntegrationMap{})
	pulumi.RegisterOutputType(IntegrationOutput{})
	pulumi.RegisterOutputType(IntegrationArrayOutput{})
	pulumi.RegisterOutputType(IntegrationMapOutput{})
}