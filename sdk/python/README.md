[![Actions Status](https://github.com/pulumi/pulumi-fastly/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-fastly/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Ffastly.svg)](https://www.npmjs.com/package/@pulumi/fastly)
[![Python version](https://badge.fury.io/py/pulumi-fastly.svg)](https://pypi.org/project/pulumi-fastly)
[![NuGet version](https://badge.fury.io/nu/pulumi.fastly.svg)](https://badge.fury.io/nu/pulumi.fastly)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-fastly/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-fastly/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-fastly/blob/master/LICENSE)

# Fastly Resource Provider

The Fastly resource provider for Pulumi lets you manage Fastly resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/fastly

or `yarn`:

    $ yarn add @pulumi/fastly

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_fastly

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-fastly/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Fastly

## Configuration

The following configuration points are available:

- `fastly:apiKey` - (Required) This is the API key. It must be provided, but it can also be sourced from the `FASTLY_API_KEY` 
  environment variable
- `fastly:baseUrl` - (Optional) This is the API server hostname. It is required if using a private instance of the API and 
  otherwise defaults to the public Fastly production service. It can also be sourced from the `FASTLY_API_URL` environment variable

## Reference

For further information, please visit [the Fastly provider docs](https://www.pulumi.com/docs/intro/cloud-providers/fastly) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/fastly).
