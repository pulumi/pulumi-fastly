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
    public sealed class GetConfigstoresStoreResult
    {
        /// <summary>
        /// Alphanumeric string identifying the Config Store.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name for the Config Store.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetConfigstoresStoreResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}