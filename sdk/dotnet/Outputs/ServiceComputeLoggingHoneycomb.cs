// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Outputs
{

    [OutputType]
    public sealed class ServiceComputeLoggingHoneycomb
    {
        /// <summary>
        /// The Honeycomb Dataset you want to log to
        /// </summary>
        public readonly string Dataset;
        /// <summary>
        /// The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Write Key from the Account page of your Honeycomb account
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private ServiceComputeLoggingHoneycomb(
            string dataset,

            string name,

            string token)
        {
            Dataset = dataset;
            Name = name;
            Token = token;
        }
    }
}