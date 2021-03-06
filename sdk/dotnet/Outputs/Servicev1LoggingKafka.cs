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
    public sealed class Servicev1LoggingKafka
    {
        public readonly string? AuthMethod;
        /// <summary>
        /// A comma-separated list of IP addresses or hostnames of Kafka brokers.
        /// </summary>
        public readonly string Brokers;
        /// <summary>
        /// The codec used for compression of your logs. One of: gzip, snappy, lz4.
        /// </summary>
        public readonly string? CompressionCodec;
        /// <summary>
        /// Apache style log formatting.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
        /// </summary>
        public readonly int? FormatVersion;
        /// <summary>
        /// A unique name to identify this dictionary.
        /// </summary>
        public readonly string Name;
        public readonly bool? ParseLogKeyvals;
        /// <summary>
        /// The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Where in the generated VCL the logging call should be placed. Can be `none` or `waf_debug`.
        /// </summary>
        public readonly string? Placement;
        /// <summary>
        /// The maximum number of bytes sent in one request. Defaults to `0` for unbounded.
        /// </summary>
        public readonly int? RequestMaxBytes;
        /// <summary>
        /// The Number of acknowledgements a leader must receive before a write is considered successful. One of: 1 (default) One server needs to respond. 0 No servers need to respond. -1	Wait for all in-sync replicas to respond.
        /// </summary>
        public readonly string? RequiredAcks;
        /// <summary>
        /// The name of an existing condition in the configured endpoint, or leave blank to always execute.
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// A secure certificate to authenticate the server with. Must be in PEM format.
        /// </summary>
        public readonly string? TlsCaCert;
        /// <summary>
        /// The client certificate used to make authenticated requests. Must be in PEM format.
        /// </summary>
        public readonly string? TlsClientCert;
        /// <summary>
        /// The client private key used to make authenticated requests. Must be in PEM format.
        /// </summary>
        public readonly string? TlsClientKey;
        /// <summary>
        /// The hostname used to verify the server's certificate. It can either be the Common Name or a Subject Alternative Name (SAN).
        /// </summary>
        public readonly string? TlsHostname;
        /// <summary>
        /// The Kinesis stream name.
        /// </summary>
        public readonly string Topic;
        /// <summary>
        /// Whether to use TLS for secure logging. Can be either true or false.
        /// </summary>
        public readonly bool? UseTls;
        /// <summary>
        /// The username for your Cloud Files account.
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private Servicev1LoggingKafka(
            string? authMethod,

            string brokers,

            string? compressionCodec,

            string? format,

            int? formatVersion,

            string name,

            bool? parseLogKeyvals,

            string? password,

            string? placement,

            int? requestMaxBytes,

            string? requiredAcks,

            string? responseCondition,

            string? tlsCaCert,

            string? tlsClientCert,

            string? tlsClientKey,

            string? tlsHostname,

            string topic,

            bool? useTls,

            string? user)
        {
            AuthMethod = authMethod;
            Brokers = brokers;
            CompressionCodec = compressionCodec;
            Format = format;
            FormatVersion = formatVersion;
            Name = name;
            ParseLogKeyvals = parseLogKeyvals;
            Password = password;
            Placement = placement;
            RequestMaxBytes = requestMaxBytes;
            RequiredAcks = requiredAcks;
            ResponseCondition = responseCondition;
            TlsCaCert = tlsCaCert;
            TlsClientCert = tlsClientCert;
            TlsClientKey = tlsClientKey;
            TlsHostname = tlsHostname;
            Topic = topic;
            UseTls = useTls;
            User = user;
        }
    }
}
