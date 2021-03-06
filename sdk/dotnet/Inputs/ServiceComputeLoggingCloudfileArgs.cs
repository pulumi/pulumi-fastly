// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceComputeLoggingCloudfileArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS access key to be used to write to the stream.
        /// </summary>
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        /// <summary>
        /// The name of your Cloud Files container.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// What level of GZIP encoding to have when dumping logs (default 0, no compression).
        /// </summary>
        [Input("gzipLevel")]
        public Input<int>? GzipLevel { get; set; }

        /// <summary>
        /// How the message should be formatted. One of: classic (default), loggly, logplex or blank.
        /// </summary>
        [Input("messageType")]
        public Input<string>? MessageType { get; set; }

        /// <summary>
        /// The unique name of the Kinesis logging endpoint.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The path to upload logs to.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// How frequently log files are finalized so they can be available for reading (in seconds, default 3600).
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The PGP public key that Fastly will use to encrypt your log files before writing them to disk.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The AWS region the stream resides in. (Default: `us-east-1`).
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The strftime specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`).
        /// </summary>
        [Input("timestampFormat")]
        public Input<string>? TimestampFormat { get; set; }

        /// <summary>
        /// The username for your Cloud Files account.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public ServiceComputeLoggingCloudfileArgs()
        {
        }
    }
}
