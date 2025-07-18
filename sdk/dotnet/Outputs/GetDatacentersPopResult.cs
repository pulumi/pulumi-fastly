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
    public sealed class GetDatacentersPopResult
    {
        /// <summary>
        /// A code representing the POP location.
        /// </summary>
        public readonly string Code;
        /// <summary>
        /// A code representing the general region of the world in which the POP location resides.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The name of the POP.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A code representing the shielding name of the POP. The value may be empty if the POP is not available for shielding.
        /// </summary>
        public readonly string Shield;

        [OutputConstructor]
        private GetDatacentersPopResult(
            string code,

            string group,

            string name,

            string shield)
        {
            Code = code;
            Group = group;
            Name = name;
            Shield = shield;
        }
    }
}
