module github.com/pulumi/pulumi-fastly

go 1.13

replace (
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
)

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/hashicorp/terraform-plugin-sdk v1.1.1
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.3.3
	github.com/pulumi/pulumi-terraform-bridge v1.4.0
	github.com/terraform-providers/terraform-provider-fastly v0.11.0
	golang.org/x/xerrors v0.0.0-20190717185122-a985d3407aa7 // indirect
)
