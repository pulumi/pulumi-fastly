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
    public sealed class ServiceComputeLoggingHeroku
    {
        /// <summary>
        /// The unique name of the Heroku logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The token to use for authentication (https://www.heroku.com/docs/customer-token-authentication-token/)
        /// </summary>
        public readonly string Token;
        /// <summary>
        /// The URL to stream logs to
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private ServiceComputeLoggingHeroku(
            string name,

            string token,

            string url)
        {
            Name = name;
            Token = token;
            Url = url;
        }
    }
}
