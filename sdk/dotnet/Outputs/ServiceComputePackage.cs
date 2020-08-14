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
    public sealed class ServiceComputePackage
    {
        /// <summary>
        /// The path to the Wasm deployment package within your local filesystem.
        /// </summary>
        public readonly string Filename;
        public readonly string? SourceCodeHash;

        [OutputConstructor]
        private ServiceComputePackage(
            string filename,

            string? sourceCodeHash)
        {
            Filename = filename;
            SourceCodeHash = sourceCodeHash;
        }
    }
}