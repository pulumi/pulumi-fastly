// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Outputs
{

    [OutputType]
    public sealed class ServiceComputeResourceLink
    {
        /// <summary>
        /// An alphanumeric string identifying the resource link.
        /// </summary>
        public readonly string? LinkId;
        /// <summary>
        /// The name of the resource link.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the underlying linked resource.
        /// </summary>
        public readonly string ResourceId;

        [OutputConstructor]
        private ServiceComputeResourceLink(
            string? linkId,

            string name,

            string resourceId)
        {
            LinkId = linkId;
            Name = name;
            ResourceId = resourceId;
        }
    }
}
