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
    public sealed class ServiceVclProductEnablement
    {
        /// <summary>
        /// Enable Bot Management support
        /// </summary>
        public readonly bool? BotManagement;
        /// <summary>
        /// Enable Brotli Compression support
        /// </summary>
        public readonly bool? BrotliCompression;
        /// <summary>
        /// Enable Domain Inspector support
        /// </summary>
        public readonly bool? DomainInspector;
        /// <summary>
        /// Enable Image Optimizer support (all backends must have a `shield` attribute)
        /// </summary>
        public readonly bool? ImageOptimizer;
        /// <summary>
        /// Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Enable Next-Gen WAF support
        /// </summary>
        public readonly bool? Ngwaf;
        /// <summary>
        /// Enable Origin Inspector support
        /// </summary>
        public readonly bool? OriginInspector;
        /// <summary>
        /// Enable WebSockets support
        /// </summary>
        public readonly bool? Websockets;

        [OutputConstructor]
        private ServiceVclProductEnablement(
            bool? botManagement,

            bool? brotliCompression,

            bool? domainInspector,

            bool? imageOptimizer,

            string? name,

            bool? ngwaf,

            bool? originInspector,

            bool? websockets)
        {
            BotManagement = botManagement;
            BrotliCompression = brotliCompression;
            DomainInspector = domainInspector;
            ImageOptimizer = imageOptimizer;
            Name = name;
            Ngwaf = ngwaf;
            OriginInspector = originInspector;
            Websockets = websockets;
        }
    }
}