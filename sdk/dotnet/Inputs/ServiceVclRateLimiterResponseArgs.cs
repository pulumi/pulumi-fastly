// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceVclRateLimiterResponseArgs : global::Pulumi.ResourceArgs
    {
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        [Input("status", required: true)]
        public Input<int> Status { get; set; } = null!;

        public ServiceVclRateLimiterResponseArgs()
        {
        }
        public static new ServiceVclRateLimiterResponseArgs Empty => new ServiceVclRateLimiterResponseArgs();
    }
}