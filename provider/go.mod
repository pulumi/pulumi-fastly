module github.com/pulumi/pulumi-fastly/provider/v4

go 1.16

require (
	github.com/fastly/terraform-provider-fastly v0.20.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.20.0
	github.com/pulumi/pulumi/sdk/v3 v3.27.0
)

replace (
	github.com/fastly/terraform-provider-fastly => github.com/pulumi/terraform-provider-fastly v0.16.1-0.20220315171626-337e01b0b7e1
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20211019194827-62530c6537a4
)
