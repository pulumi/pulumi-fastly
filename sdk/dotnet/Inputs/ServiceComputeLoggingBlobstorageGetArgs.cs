// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceComputeLoggingBlobstorageGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique Azure Blob Storage namespace in which your data objects are stored
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is "gzip", gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
        /// </summary>
        [Input("compressionCodec")]
        public Input<string>? CompressionCodec { get; set; }

        /// <summary>
        /// The name of the Azure Blob Storage container in which to store logs
        /// </summary>
        [Input("container", required: true)]
        public Input<string> Container { get; set; } = null!;

        /// <summary>
        /// Maximum size of an uploaded log file, if non-zero.
        /// </summary>
        [Input("fileMaxBytes")]
        public Input<int>? FileMaxBytes { get; set; }

        /// <summary>
        /// Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
        /// </summary>
        [Input("gzipLevel")]
        public Input<int>? GzipLevel { get; set; }

        /// <summary>
        /// How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
        /// </summary>
        [Input("messageType")]
        public Input<string>? MessageType { get; set; }

        /// <summary>
        /// A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container's root path
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// How frequently the logs should be transferred in seconds. Default `3600`
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// A PGP public key that Fastly will use to encrypt your log files before writing them to disk
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
        /// </summary>
        [Input("sasToken", required: true)]
        public Input<string> SasToken { get; set; } = null!;

        /// <summary>
        /// The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
        /// </summary>
        [Input("timestampFormat")]
        public Input<string>? TimestampFormat { get; set; }

        public ServiceComputeLoggingBlobstorageGetArgs()
        {
        }
    }
}