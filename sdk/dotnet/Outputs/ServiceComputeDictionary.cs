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
    public sealed class ServiceComputeDictionary
    {
        /// <summary>
        /// The ID of the dictionary
        /// </summary>
        public readonly string? DictionaryId;
        /// <summary>
        /// Allow the dictionary to be deleted, even if it contains entries. Defaults to false.
        /// </summary>
        public readonly bool? ForceDestroy;
        /// <summary>
        /// A unique name to identify this dictionary. It is important to note that changing this attribute will delete and recreate the dictionary, and discard the current items in the dictionary
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// If `true`, the dictionary is a private dictionary, and items are not readable in the UI or via API. Default is `false`. It is important to note that changing this attribute will delete and recreate the dictionary, and discard the current items in the dictionary. Using a write-only/private dictionary should only be done if the items are managed outside of this provider
        /// </summary>
        public readonly bool? WriteOnly;

        [OutputConstructor]
        private ServiceComputeDictionary(
            string? dictionaryId,

            bool? forceDestroy,

            string name,

            bool? writeOnly)
        {
            DictionaryId = dictionaryId;
            ForceDestroy = forceDestroy;
            Name = name;
            WriteOnly = writeOnly;
        }
    }
}