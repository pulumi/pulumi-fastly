[![Build Status](https://travis-ci.com/pulumi/pulumi-fastly.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-fastly)

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

    $ go get github.com/pulumi/pulumi-fastly/sdk/go/...

## Configuration

The following configuration points are available:

- `fastly:apiKey` - (Required) This is the API key. It must be provided, but it can also be sourced from the `FASTLY_API_KEY` 
  environment variable
- `fastly:baseUrl` - (Optional) This is the API server hostname. It is required if using a private instance of the API and 
  otherwise defaults to the public Fastly production service. It can also be sourced from the `FASTLY_API_URL` environment variable

## Reference

For detailed reference documentation, please visit [the API docs](https://pulumi.io/reference/pkg/nodejs/@pulumi/fastly/index.html).
