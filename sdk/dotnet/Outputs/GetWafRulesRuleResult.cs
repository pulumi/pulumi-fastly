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
    public sealed class GetWafRulesRuleResult
    {
        /// <summary>
        /// The modsecurity rule's latest revision.
        /// </summary>
        public readonly int LatestRevisionNumber;
        /// <summary>
        /// The modsecurity rule ID.
        /// </summary>
        public readonly int ModsecRuleId;
        /// <summary>
        /// The modsecurity rule's type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetWafRulesRuleResult(
            int latestRevisionNumber,

            int modsecRuleId,

            string type)
        {
            LatestRevisionNumber = latestRevisionNumber;
            ModsecRuleId = modsecRuleId;
            Type = type;
        }
    }
}