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
    public sealed class ServiceVclLoggingPapertrail
    {
        /// <summary>
        /// The address of the Papertrail endpoint
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// A Fastly [log format string](https://docs.fastly.com/en/guides/custom-log-formats)
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The version of the custom logging format used for the configured endpoint. The logging call gets placed by default in `vcl_log` if `format_version` is set to `2` and in `vcl_deliver` if `format_version` is set to `1`
        /// </summary>
        public readonly int? FormatVersion;
        /// <summary>
        /// A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Where in the generated VCL the logging call should be placed. If not set, endpoints with `format_version` of 2 are placed in `vcl_log` and those with `format_version` of 1 are placed in `vcl_deliver`
        /// </summary>
        public readonly string? Placement;
        /// <summary>
        /// The port associated with the address where the Papertrail endpoint can be accessed
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The name of an existing condition in the configured endpoint, or leave blank to always execute
        /// </summary>
        public readonly string? ResponseCondition;

        [OutputConstructor]
        private ServiceVclLoggingPapertrail(
            string address,

            string? format,

            int? formatVersion,

            string name,

            string? placement,

            int port,

            string? responseCondition)
        {
            Address = address;
            Format = format;
            FormatVersion = formatVersion;
            Name = name;
            Placement = placement;
            Port = port;
            ResponseCondition = responseCondition;
        }
    }
}