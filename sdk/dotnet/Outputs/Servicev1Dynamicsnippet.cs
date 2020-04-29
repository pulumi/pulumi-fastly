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
    public sealed class Servicev1Dynamicsnippet
    {
        /// <summary>
        /// A unique name to identify this dictionary.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Priority determines the ordering for multiple snippets. Lower numbers execute first.  Defaults to `100`.
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// The ID of the dynamic snippet.
        /// </summary>
        public readonly string? SnippetId;
        /// <summary>
        /// The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private Servicev1Dynamicsnippet(
            string name,

            int? priority,

            string? snippetId,

            string type)
        {
            Name = name;
            Priority = priority;
            SnippetId = snippetId;
            Type = type;
        }
    }
}