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
    public sealed class ServiceVclHeader
    {
        /// <summary>
        /// The Header manipulation action to take; must be one of `set`, `append`, `delete`, `regex`, or `regex_repeat`
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Name of already defined `condition` to apply. This `condition` must be of type `CACHE`
        /// </summary>
        public readonly string? CacheCondition;
        /// <summary>
        /// The name of the header that is going to be affected by the Action
        /// </summary>
        public readonly string Destination;
        /// <summary>
        /// Don't add the header if it is already. (Only applies to `set` action.). Default `false`
        /// </summary>
        public readonly bool? IgnoreIfSet;
        /// <summary>
        /// Unique name for this header attribute. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Lower priorities execute first. Default: `100`
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Regular expression to use (Only applies to `regex` and `regex_repeat` actions.)
        /// </summary>
        public readonly string? Regex;
        /// <summary>
        /// Name of already defined `condition` to apply. This `condition` must be of type `REQUEST`
        /// </summary>
        public readonly string? RequestCondition;
        /// <summary>
        /// Name of already defined `condition` to apply. This `condition` must be of type `RESPONSE`. For detailed information about Conditionals, see [Fastly's Documentation on Conditionals](https://docs.fastly.com/en/guides/using-conditions)
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// Variable to be used as a source for the header content (Does not apply to `delete` action.)
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// Value to substitute in place of regular expression. (Only applies to `regex` and `regex_repeat`.)
        /// </summary>
        public readonly string? Substitution;
        /// <summary>
        /// The Request type on which to apply the selected Action; must be one of `request`, `fetch`, `cache` or `response`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ServiceVclHeader(
            string action,

            string? cacheCondition,

            string destination,

            bool? ignoreIfSet,

            string name,

            int? priority,

            string? regex,

            string? requestCondition,

            string? responseCondition,

            string? source,

            string? substitution,

            string type)
        {
            Action = action;
            CacheCondition = cacheCondition;
            Destination = destination;
            IgnoreIfSet = ignoreIfSet;
            Name = name;
            Priority = priority;
            Regex = regex;
            RequestCondition = requestCondition;
            ResponseCondition = responseCondition;
            Source = source;
            Substitution = substitution;
            Type = type;
        }
    }
}
