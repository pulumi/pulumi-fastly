// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceVclLoggingKafkaArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// SASL authentication method. One of: plain, scram-sha-256, scram-sha-512
        /// </summary>
        [Input("authMethod")]
        public Input<string>? AuthMethod { get; set; }

        /// <summary>
        /// A comma-separated list of IP addresses or hostnames of Kafka brokers
        /// </summary>
        [Input("brokers", required: true)]
        public Input<string> Brokers { get; set; } = null!;

        /// <summary>
        /// The codec used for compression of your logs. One of: `gzip`, `snappy`, `lz4`
        /// </summary>
        [Input("compressionCodec")]
        public Input<string>? CompressionCodec { get; set; }

        /// <summary>
        /// Apache style log formatting.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2).
        /// </summary>
        [Input("formatVersion")]
        public Input<int>? FormatVersion { get; set; }

        /// <summary>
        /// The unique name of the Kafka logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Enables parsing of key=value tuples from the beginning of a logline, turning them into record headers
        /// </summary>
        [Input("parseLogKeyvals")]
        public Input<bool>? ParseLogKeyvals { get; set; }

        /// <summary>
        /// SASL Pass
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Where in the generated VCL the logging call should be placed.
        /// </summary>
        [Input("placement")]
        public Input<string>? Placement { get; set; }

        /// <summary>
        /// Maximum size of log batch, if non-zero. Defaults to 0 for unbounded
        /// </summary>
        [Input("requestMaxBytes")]
        public Input<int>? RequestMaxBytes { get; set; }

        /// <summary>
        /// The Number of acknowledgements a leader must receive before a write is considered successful. One of: `1` (default) One server needs to respond. `0` No servers need to respond. `-1`	Wait for all in-sync replicas to respond
        /// </summary>
        [Input("requiredAcks")]
        public Input<string>? RequiredAcks { get; set; }

        /// <summary>
        /// The name of an existing condition in the configured endpoint, or leave blank to always execute.
        /// </summary>
        [Input("responseCondition")]
        public Input<string>? ResponseCondition { get; set; }

        /// <summary>
        /// A secure certificate to authenticate the server with. Must be in PEM format
        /// </summary>
        [Input("tlsCaCert")]
        public Input<string>? TlsCaCert { get; set; }

        /// <summary>
        /// The client certificate used to make authenticated requests. Must be in PEM format
        /// </summary>
        [Input("tlsClientCert")]
        public Input<string>? TlsClientCert { get; set; }

        /// <summary>
        /// The client private key used to make authenticated requests. Must be in PEM format
        /// </summary>
        [Input("tlsClientKey")]
        public Input<string>? TlsClientKey { get; set; }

        /// <summary>
        /// The hostname used to verify the server's certificate. It can either be the Common Name or a Subject Alternative Name (SAN)
        /// </summary>
        [Input("tlsHostname")]
        public Input<string>? TlsHostname { get; set; }

        /// <summary>
        /// The Kafka topic to send logs to
        /// </summary>
        [Input("topic", required: true)]
        public Input<string> Topic { get; set; } = null!;

        /// <summary>
        /// Whether to use TLS for secure logging. Can be either `true` or `false`
        /// </summary>
        [Input("useTls")]
        public Input<bool>? UseTls { get; set; }

        /// <summary>
        /// SASL User
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public ServiceVclLoggingKafkaArgs()
        {
        }
    }
}