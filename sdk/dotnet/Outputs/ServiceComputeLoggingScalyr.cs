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
    public sealed class ServiceComputeLoggingScalyr
    {
        /// <summary>
        /// The unique name of the Scalyr logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the logfile field sent to Scalyr
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// The region that log data will be sent to. One of `US` or `EU`. Defaults to `US` if undefined
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The token to use for authentication (https://www.scalyr.com/keys)
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private ServiceComputeLoggingScalyr(
            string name,

            string? projectId,

            string? region,

            string token)
        {
            Name = name;
            ProjectId = projectId;
            Region = region;
            Token = token;
        }
    }
}
