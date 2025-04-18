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
    public sealed class ServiceVclLoggingHoneycomb
    {
        /// <summary>
        /// The Honeycomb Dataset you want to log to
        /// </summary>
        public readonly string Dataset;
        /// <summary>
        /// Apache style log formatting. Your log must produce valid JSON that Honeycomb can ingest.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
        /// </summary>
        public readonly int? FormatVersion;
        /// <summary>
        /// The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Where in the generated VCL the logging call should be placed. Can be `none` or `none`.
        /// </summary>
        public readonly string? Placement;
        /// <summary>
        /// The name of an existing condition in the configured endpoint, or leave blank to always execute.
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// The Write Key from the Account page of your Honeycomb account
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private ServiceVclLoggingHoneycomb(
            string dataset,

            string? format,

            int? formatVersion,

            string name,

            string? placement,

            string? responseCondition,

            string token)
        {
            Dataset = dataset;
            Format = format;
            FormatVersion = formatVersion;
            Name = name;
            Placement = placement;
            ResponseCondition = responseCondition;
            Token = token;
        }
    }
}
