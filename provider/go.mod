module github.com/pulumi/pulumi-fastly/provider/v2

go 1.14

require (
	github.com/fastly/terraform-provider-fastly v0.20.2
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.13.2
	github.com/pulumi/pulumi/sdk/v2 v2.13.3-0.20201109230029-a6f8b9b205cd
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/fastly/terraform-provider-fastly => github.com/pulumi/terraform-provider-fastly v0.16.1-0.20210108142456-c21029fd2551
)
