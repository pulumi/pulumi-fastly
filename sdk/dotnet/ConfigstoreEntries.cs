// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    /// <summary>
    /// ## Import
    /// 
    /// Fastly Config Stores entries can be imported using the corresponding Config Store ID with the `/entries` suffix, e.g.
    /// 
    /// ```sh
    /// $ pulumi import fastly:index/configstoreEntries:ConfigstoreEntries example xxxxxxxxxxxxxxxxxxxx/entries
    /// ```
    /// </summary>
    [FastlyResourceType("fastly:index/configstoreEntries:ConfigstoreEntries")]
    public partial class ConfigstoreEntries : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A map representing an entry in the Config Store, (key/value)
        /// </summary>
        [Output("entries")]
        public Output<ImmutableDictionary<string, string>> Entries { get; private set; } = null!;

        [Output("manageEntries")]
        public Output<bool?> ManageEntries { get; private set; } = null!;

        /// <summary>
        /// An alphanumeric string identifying the Config Store.
        /// </summary>
        [Output("storeId")]
        public Output<string> StoreId { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigstoreEntries resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigstoreEntries(string name, ConfigstoreEntriesArgs args, CustomResourceOptions? options = null)
            : base("fastly:index/configstoreEntries:ConfigstoreEntries", name, args ?? new ConfigstoreEntriesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigstoreEntries(string name, Input<string> id, ConfigstoreEntriesState? state = null, CustomResourceOptions? options = null)
            : base("fastly:index/configstoreEntries:ConfigstoreEntries", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConfigstoreEntries resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigstoreEntries Get(string name, Input<string> id, ConfigstoreEntriesState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigstoreEntries(name, id, state, options);
        }
    }

    public sealed class ConfigstoreEntriesArgs : global::Pulumi.ResourceArgs
    {
        [Input("entries", required: true)]
        private InputMap<string>? _entries;

        /// <summary>
        /// A map representing an entry in the Config Store, (key/value)
        /// </summary>
        public InputMap<string> Entries
        {
            get => _entries ?? (_entries = new InputMap<string>());
            set => _entries = value;
        }

        [Input("manageEntries")]
        public Input<bool>? ManageEntries { get; set; }

        /// <summary>
        /// An alphanumeric string identifying the Config Store.
        /// </summary>
        [Input("storeId", required: true)]
        public Input<string> StoreId { get; set; } = null!;

        public ConfigstoreEntriesArgs()
        {
        }
        public static new ConfigstoreEntriesArgs Empty => new ConfigstoreEntriesArgs();
    }

    public sealed class ConfigstoreEntriesState : global::Pulumi.ResourceArgs
    {
        [Input("entries")]
        private InputMap<string>? _entries;

        /// <summary>
        /// A map representing an entry in the Config Store, (key/value)
        /// </summary>
        public InputMap<string> Entries
        {
            get => _entries ?? (_entries = new InputMap<string>());
            set => _entries = value;
        }

        [Input("manageEntries")]
        public Input<bool>? ManageEntries { get; set; }

        /// <summary>
        /// An alphanumeric string identifying the Config Store.
        /// </summary>
        [Input("storeId")]
        public Input<string>? StoreId { get; set; }

        public ConfigstoreEntriesState()
        {
        }
        public static new ConfigstoreEntriesState Empty => new ConfigstoreEntriesState();
    }
}