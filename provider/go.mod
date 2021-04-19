module github.com/pulumi/pulumi-fastly/provider/v3

go 1.16

require (
	github.com/fastly/terraform-provider-fastly v0.20.2
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)

replace (
	github.com/fastly/terraform-provider-fastly => github.com/pulumi/terraform-provider-fastly v0.16.1-0.20210115140421-10f590c87f4e
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
)
