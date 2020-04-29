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
    public sealed class Servicev1Header
    {
        /// <summary>
        /// Allows you to terminate request handling and immediately
        /// perform an action. When set it can be `lookup` or `pass` (Ignore the cache completely).
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Name of already defined `condition` to check after we have retrieved an object. If the condition passes then deliver this Request Object instead. This `condition` must be of type `CACHE`. For detailed information about Conditionals,
        /// see [Fastly's Documentation on Conditionals][fastly-conditionals].
        /// </summary>
        public readonly string? CacheCondition;
        /// <summary>
        /// The name of the header that is going to be affected by the Action.
        /// </summary>
        public readonly string Destination;
        /// <summary>
        /// Do not add the header if it is already present. (Only applies to the `set` action.). Default `false`.
        /// </summary>
        public readonly bool? IgnoreIfSet;
        /// <summary>
        /// A unique name to identify this dictionary.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Priority determines the ordering for multiple snippets. Lower numbers execute first.  Defaults to `100`.
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Regular expression to use (Only applies to the `regex` and `regex_repeat` actions.)
        /// </summary>
        public readonly string? Regex;
        /// <summary>
        /// Name of already defined `condition` to be checked during the request phase. If the condition passes then this object will be delivered. This `condition` must be of type `REQUEST`.
        /// </summary>
        public readonly string? RequestCondition;
        /// <summary>
        /// The name of the `condition` to apply. If empty, always execute.
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// Variable to be used as a source for the header
        /// content. (Does not apply to the `delete` action.)
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// Value to substitute in place of regular expression. (Only applies to the `regex` and `regex_repeat` actions.)
        /// </summary>
        public readonly string? Substitution;
        /// <summary>
        /// The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private Servicev1Header(
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