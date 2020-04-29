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
    public sealed class Servicev1Vcl
    {
        /// <summary>
        /// The custom VCL code to upload.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// If `true`, use this block as the main configuration. If
        /// `false`, use this block as an includable library. Only a single VCL block can be
        /// marked as the main block. Default is `false`.
        /// </summary>
        public readonly bool? Main;
        /// <summary>
        /// A unique name to identify this dictionary.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private Servicev1Vcl(
            string content,

            bool? main,

            string name)
        {
            Content = content;
            Main = main;
            Name = name;
        }
    }
}