// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceComputeLoggingLogshuttleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique name of the Log Shuttle logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("token", required: true)]
        private Input<string>? _token;

        /// <summary>
        /// The data authentication token associated with this endpoint
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Your Log Shuttle endpoint URL
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public ServiceComputeLoggingLogshuttleArgs()
        {
        }
        public static new ServiceComputeLoggingLogshuttleArgs Empty => new ServiceComputeLoggingLogshuttleArgs();
    }
}