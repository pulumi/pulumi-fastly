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
    public sealed class ServiceComputeLoggingGrafanacloudlog
    {
        /// <summary>
        /// The stream identifier as a JSON string
        /// </summary>
        public readonly string Index;
        /// <summary>
        /// The unique name of the GrafanaCloudLogs logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Access Policy Token key for your GrafanaCloudLogs account
        /// </summary>
        public readonly string Token;
        /// <summary>
        /// The URL to stream logs to
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The Grafana User ID
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private ServiceComputeLoggingGrafanacloudlog(
            string index,

            string name,

            string token,

            string url,

            string user)
        {
            Index = index;
            Name = name;
            Token = token;
            Url = url;
            User = user;
        }
    }
}
