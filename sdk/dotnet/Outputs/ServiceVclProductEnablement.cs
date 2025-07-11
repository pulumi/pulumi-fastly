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
        /// DDoS Protection product
        /// </summary>
        public readonly Outputs.ServiceVclProductEnablementDdosProtection? DdosProtection;
        /// <summary>
        /// Enable Domain Inspector support
        /// </summary>
        public readonly bool? DomainInspector;
        /// <summary>
        /// Enable Image Optimizer support (all backends must have a `shield` attribute)
        /// </summary>
        public readonly bool? ImageOptimizer;
        /// <summary>
        /// Enable Log Explorer &amp; Insights
        /// </summary>
        public readonly bool? LogExplorerInsights;
        /// <summary>
        /// Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Next-Gen WAF product
        /// </summary>
        public readonly Outputs.ServiceVclProductEnablementNgwaf? Ngwaf;
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

            Outputs.ServiceVclProductEnablementDdosProtection? ddosProtection,

            bool? domainInspector,

            bool? imageOptimizer,

            bool? logExplorerInsights,

            string? name,

            Outputs.ServiceVclProductEnablementNgwaf? ngwaf,

            bool? originInspector,

            bool? websockets)
        {
            BotManagement = botManagement;
            BrotliCompression = brotliCompression;
            DdosProtection = ddosProtection;
            DomainInspector = domainInspector;
            ImageOptimizer = imageOptimizer;
            LogExplorerInsights = logExplorerInsights;
            Name = name;
            Ngwaf = ngwaf;
            OriginInspector = originInspector;
            Websockets = websockets;
        }
    }
}
