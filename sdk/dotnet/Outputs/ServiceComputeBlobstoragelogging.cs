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
    public sealed class ServiceComputeBlobstoragelogging
    {
        /// <summary>
        /// The unique Azure Blob Storage namespace in which your data objects are stored.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The name of the Azure Blob Storage container in which to store logs.
        /// </summary>
        public readonly string Container;
        /// <summary>
        /// What level of GZIP encoding to have when dumping logs (default 0, no compression).
        /// </summary>
        public readonly int? GzipLevel;
        /// <summary>
        /// How the message should be formatted. One of: classic (default), loggly, logplex or blank.
        /// </summary>
        public readonly string? MessageType;
        /// <summary>
        /// The unique name of the Kinesis logging endpoint.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The path to upload logs to.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// How frequently log files are finalized so they can be available for reading (in seconds, default 3600).
        /// </summary>
        public readonly int? Period;
        /// <summary>
        /// The PGP public key that Fastly will use to encrypt your log files before writing them to disk.
        /// </summary>
        public readonly string? PublicKey;
        /// <summary>
        /// The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work.
        /// </summary>
        public readonly string SasToken;
        /// <summary>
        /// The strftime specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`).
        /// </summary>
        public readonly string? TimestampFormat;

        [OutputConstructor]
        private ServiceComputeBlobstoragelogging(
            string accountName,

            string container,

            int? gzipLevel,

            string? messageType,

            string name,

            string? path,

            int? period,

            string? publicKey,

            string sasToken,

            string? timestampFormat)
        {
            AccountName = accountName;
            Container = container;
            GzipLevel = gzipLevel;
            MessageType = messageType;
            Name = name;
            Path = path;
            Period = period;
            PublicKey = publicKey;
            SasToken = sasToken;
            TimestampFormat = timestampFormat;
        }
    }
}
