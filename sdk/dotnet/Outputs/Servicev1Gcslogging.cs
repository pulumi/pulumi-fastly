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
    public sealed class Servicev1Gcslogging
    {
        /// <summary>
        /// The name of your Cloud Files container.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// The email for the service account with write access to your BigQuery dataset. If not provided, this will be pulled from a `FASTLY_BQ_EMAIL` environment variable.
        /// </summary>
        public readonly string? Email;
        /// <summary>
        /// Apache style log formatting.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// What level of GZIP encoding to have when dumping logs (default 0, no compression).
        /// </summary>
        public readonly int? GzipLevel;
        /// <summary>
        /// How the message should be formatted. One of: classic (default), loggly, logplex or blank.
        /// </summary>
        public readonly string? MessageType;
        /// <summary>
        /// A unique name to identify this dictionary.
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
        /// Where in the generated VCL the logging call should be placed. Can be `none` or `waf_debug`.
        /// </summary>
        public readonly string? Placement;
        /// <summary>
        /// The name of an existing condition in the configured endpoint, or leave blank to always execute.
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// The AWS secret access key to authenticate with.
        /// </summary>
        public readonly string? SecretKey;
        /// <summary>
        /// The strftime specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`).
        /// </summary>
        public readonly string? TimestampFormat;

        [OutputConstructor]
        private Servicev1Gcslogging(
            string bucketName,

            string? email,

            string? format,

            int? gzipLevel,

            string? messageType,

            string name,

            string? path,

            int? period,

            string? placement,

            string? responseCondition,

            string? secretKey,

            string? timestampFormat)
        {
            BucketName = bucketName;
            Email = email;
            Format = format;
            GzipLevel = gzipLevel;
            MessageType = messageType;
            Name = name;
            Path = path;
            Period = period;
            Placement = placement;
            ResponseCondition = responseCondition;
            SecretKey = secretKey;
            TimestampFormat = timestampFormat;
        }
    }
}
