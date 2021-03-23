CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 2.14.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.14.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.13.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.13.0 (2021-01-29)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.12.0 (2021-01-19)
* Upgrade to v0.23.0 of the Fastly Terraform Provider

## 2.11.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.11.0 (2021-01-08)
* Upgrade to v0.22.0 of the Fastly Terraform Provider

## 2.10.3 (2021-01-05)
* Upgrade to v0.21.3 of the Fastly Terraform Provider

## 2.10.2 (2020-12-21)
* Upgrade to v0.21.2 of the Fastly Terraform Provider

## 2.10.1 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.10.0 (2020-10-26)
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.9.0 (2020-10-19)
* Upgrade to v0.21.1 of the Fastly Terraform Provider
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0

## 2.8.2 (2020-10-01)
* Upgrade to v0.20.4 of the Fastly Terraform Provider

## 2.8.1 (2020-09-25)
* Upgrade to v0.20.3 of the Fastly Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 2.8.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.7.0 (2020-07-23)
* Upgrade to v0.19.2 of the Fastly Terraform Provider

## 2.6.0 (2020-07-07)
* Upgrade to v0.18.0 of the Fastly Terraform Provider

## 2.5.1 (2020-06-25)
* Upgrade to v0.17.1 of the Fastly Terraform Provider

## 2.5.0 (2020-06-23)
* Upgrade to v0.17.0 of the Fastly Terraform Provider

## 2.4.2 (2020-06-11)
* Switch to GitHub actions for build

## 2.4.1 (2020-06-04)
* Upgrade to v0.16.1 of the Fastly Terraform Provider

## 2.4.0 (2020-06-01)
* Upgrade to v0.16.0 of the Fastly Terraform Provider

## 2.3.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.3.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.3.0 (2020-04-29)
* Upgrade to v0.15.0 of the Fastly Terraform Provider

## 2.2.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.1.0 (2020-04-20)
* Upgrade to v0.14.0 of the Fastly Terraform Provider

## 2.0.0 (2020-04-18)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.6.0 (2020-04-14)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Refactor layout to support Go modules

## 1.5.0 (2020-03-23)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.4.0 (2020-01-29)
* Upgrade to v0.12.1 of the Fastly Terraform Provider
* Upgrade to pulumi-terraform-bridge v1.6.4

## 1.3.0 (2020-01-06)
* Upgrade to pulumi-terraform-bridge v1.5.2

## 1.2.0 (2019-12-17)
* Upgrade to v0.11.1 of the Fastly Terraform Provider

## 1.1.0 (2019-12-04)
* Upgrade to pulumi-terraform-bridge v1.4.3

## 1.0.0 (2019-11-20)
* Initial release of the provider
