// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceComputeProductEnablementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DDoS Protection product
        /// </summary>
        [Input("ddosProtection")]
        public Input<Inputs.ServiceComputeProductEnablementDdosProtectionArgs>? DdosProtection { get; set; }

        /// <summary>
        /// Enable Fanout support
        /// </summary>
        [Input("fanout")]
        public Input<bool>? Fanout { get; set; }

        /// <summary>
        /// Enable Log Explorer &amp; Insights
        /// </summary>
        [Input("logExplorerInsights")]
        public Input<bool>? LogExplorerInsights { get; set; }

        /// <summary>
        /// Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Next-Gen WAF product
        /// </summary>
        [Input("ngwaf")]
        public Input<Inputs.ServiceComputeProductEnablementNgwafArgs>? Ngwaf { get; set; }

        /// <summary>
        /// Enable WebSockets support
        /// </summary>
        [Input("websockets")]
        public Input<bool>? Websockets { get; set; }

        public ServiceComputeProductEnablementArgs()
        {
        }
        public static new ServiceComputeProductEnablementArgs Empty => new ServiceComputeProductEnablementArgs();
    }
}
