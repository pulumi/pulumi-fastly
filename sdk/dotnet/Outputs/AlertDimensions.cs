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
    public sealed class AlertDimensions
    {
        /// <summary>
        /// Names of a subset of domains that the alert monitors.
        /// </summary>
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// Addresses of a subset of backends that the alert monitors.
        /// </summary>
        public readonly ImmutableArray<string> Origins;

        [OutputConstructor]
        private AlertDimensions(
            ImmutableArray<string> domains,

            ImmutableArray<string> origins)
        {
            Domains = domains;
            Origins = origins;
        }
    }
}