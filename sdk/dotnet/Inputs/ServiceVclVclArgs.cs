// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceVclVclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The custom VCL code to upload
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// If `true`, use this block as the main configuration. If `false`, use this block as an includable library. Only a single VCL block can be marked as the main block. Default is `false`
        /// </summary>
        [Input("main")]
        public Input<bool>? Main { get; set; }

        /// <summary>
        /// A unique name for this configuration block. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ServiceVclVclArgs()
        {
        }
        public static new ServiceVclVclArgs Empty => new ServiceVclVclArgs();
    }
}