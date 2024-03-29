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
    public sealed class ServiceComputeLoggingPapertrail
    {
        /// <summary>
        /// The address of the Papertrail endpoint
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The port associated with the address where the Papertrail endpoint can be accessed
        /// </summary>
        public readonly int Port;

        [OutputConstructor]
        private ServiceComputeLoggingPapertrail(
            string address,

            string name,

            int port)
        {
            Address = address;
            Name = name;
            Port = port;
        }
    }
}
