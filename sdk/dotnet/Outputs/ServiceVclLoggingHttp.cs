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
    public sealed class ServiceVclLoggingHttp
    {
        /// <summary>
        /// Value of the `Content-Type` header sent with the request
        /// </summary>
        public readonly string? ContentType;
        /// <summary>
        /// Apache-style string or VCL variables to use for log formatting.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
        /// </summary>
        public readonly int? FormatVersion;
        /// <summary>
        /// Custom header sent with the request
        /// </summary>
        public readonly string? HeaderName;
        /// <summary>
        /// Value of the custom header sent with the request
        /// </summary>
        public readonly string? HeaderValue;
        /// <summary>
        /// Formats log entries as JSON. Can be either disabled (`0`), array of json (`1`), or newline delimited json (`2`)
        /// </summary>
        public readonly string? JsonFormat;
        /// <summary>
        /// How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
        /// </summary>
        public readonly string? MessageType;
        /// <summary>
        /// HTTP method used for request. Can be either `POST` or `PUT`. Default `POST`
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// The unique name of the HTTPS logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Where in the generated VCL the logging call should be placed
        /// </summary>
        public readonly string? Placement;
        /// <summary>
        /// The maximum number of bytes sent in one request
        /// </summary>
        public readonly int? RequestMaxBytes;
        /// <summary>
        /// The maximum number of logs sent in one request
        /// </summary>
        public readonly int? RequestMaxEntries;
        /// <summary>
        /// The name of the condition to apply
        /// </summary>
        public readonly string? ResponseCondition;
        /// <summary>
        /// A secure certificate to authenticate the server with. Must be in PEM format
        /// </summary>
        public readonly string? TlsCaCert;
        /// <summary>
        /// The client certificate used to make authenticated requests. Must be in PEM format
        /// </summary>
        public readonly string? TlsClientCert;
        /// <summary>
        /// The client private key used to make authenticated requests. Must be in PEM format
        /// </summary>
        public readonly string? TlsClientKey;
        /// <summary>
        /// Used during the TLS handshake to validate the certificate
        /// </summary>
        public readonly string? TlsHostname;
        /// <summary>
        /// URL that log data will be sent to. Must use the https protocol
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private ServiceVclLoggingHttp(
            string? contentType,

            string? format,

            int? formatVersion,

            string? headerName,

            string? headerValue,

            string? jsonFormat,

            string? messageType,

            string? method,

            string name,

            string? placement,

            int? requestMaxBytes,

            int? requestMaxEntries,

            string? responseCondition,

            string? tlsCaCert,

            string? tlsClientCert,

            string? tlsClientKey,

            string? tlsHostname,

            string url)
        {
            ContentType = contentType;
            Format = format;
            FormatVersion = formatVersion;
            HeaderName = headerName;
            HeaderValue = headerValue;
            JsonFormat = jsonFormat;
            MessageType = messageType;
            Method = method;
            Name = name;
            Placement = placement;
            RequestMaxBytes = requestMaxBytes;
            RequestMaxEntries = requestMaxEntries;
            ResponseCondition = responseCondition;
            TlsCaCert = tlsCaCert;
            TlsClientCert = tlsClientCert;
            TlsClientKey = tlsClientKey;
            TlsHostname = tlsHostname;
            Url = url;
        }
    }
}