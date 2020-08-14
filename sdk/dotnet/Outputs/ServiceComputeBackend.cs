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
    public sealed class ServiceComputeBackend
    {
        /// <summary>
        /// The SFTP address to stream logs to.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Denotes if this Backend should be
        /// included in the pool of backends that requests are load balanced against.
        /// Default `true`.
        /// </summary>
        public readonly bool? AutoLoadbalance;
        /// <summary>
        /// How long to wait between bytes in milliseconds. Default `10000`.
        /// </summary>
        public readonly int? BetweenBytesTimeout;
        /// <summary>
        /// How long to wait for a timeout in milliseconds.
        /// Default `1000`
        /// </summary>
        public readonly int? ConnectTimeout;
        /// <summary>
        /// Number of errors to allow before the Backend is marked as down. Default `0`.
        /// </summary>
        public readonly int? ErrorThreshold;
        /// <summary>
        /// How long to wait for the first bytes in milliseconds. Default `15000`.
        /// </summary>
        public readonly int? FirstByteTimeout;
        /// <summary>
        /// Name of a defined `healthcheck` to assign to this backend.
        /// </summary>
        public readonly string? Healthcheck;
        /// <summary>
        /// Maximum number of connections for this Backend.
        /// Default `200`.
        /// </summary>
        public readonly int? MaxConn;
        /// <summary>
        /// Maximum allowed TLS version on SSL connections to this backend.
        /// </summary>
        public readonly string? MaxTlsVersion;
        /// <summary>
        /// Minimum allowed TLS version on SSL connections to this backend.
        /// </summary>
        public readonly string? MinTlsVersion;
        /// <summary>
        /// The unique name of the Rackspace Cloud Files logging endpoint.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The hostname to override the Host header.
        /// </summary>
        public readonly string? OverrideHost;
        /// <summary>
        /// The port the SFTP service listens on. (Default: `22`).
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The POP of the shield designated to reduce inbound load. Valid values for `shield` are included in the [`GET /datacenters`](https://developer.fastly.com/reference/api/utils/datacenter/) API response.
        /// </summary>
        public readonly string? Shield;
        /// <summary>
        /// CA certificate attached to origin.
        /// </summary>
        public readonly string? SslCaCert;
        /// <summary>
        /// Overrides ssl_hostname, but only for cert verification. Does not affect SNI at all.
        /// </summary>
        public readonly string? SslCertHostname;
        /// <summary>
        /// Be strict about checking SSL certs. Default `true`.
        /// </summary>
        public readonly bool? SslCheckCert;
        /// <summary>
        /// Comma separated list of OpenSSL Ciphers to try when negotiating to the backend.
        /// </summary>
        public readonly string? SslCiphers;
        /// <summary>
        /// Client certificate attached to origin. Used when connecting to the backend.
        /// </summary>
        public readonly string? SslClientCert;
        /// <summary>
        /// Client key attached to origin. Used when connecting to the backend.
        /// </summary>
        public readonly string? SslClientKey;
        /// <summary>
        /// Used for both SNI during the TLS handshake and to validate the cert.
        /// </summary>
        public readonly string? SslHostname;
        /// <summary>
        /// Overrides ssl_hostname, but only for SNI in the handshake. Does not affect cert validation at all.
        /// </summary>
        public readonly string? SslSniHostname;
        /// <summary>
        /// Whether or not to use SSL to reach the backend. Default `false`.
        /// </summary>
        public readonly bool? UseSsl;
        /// <summary>
        /// The [portion of traffic](https://docs.fastly.com/en/guides/load-balancing-configuration#how-weight-affects-load-balancing) to send to this Backend. Each Backend receives `weight / total` of the traffic. Default `100`.
        /// </summary>
        public readonly int? Weight;

        [OutputConstructor]
        private ServiceComputeBackend(
            string address,

            bool? autoLoadbalance,

            int? betweenBytesTimeout,

            int? connectTimeout,

            int? errorThreshold,

            int? firstByteTimeout,

            string? healthcheck,

            int? maxConn,

            string? maxTlsVersion,

            string? minTlsVersion,

            string name,

            string? overrideHost,

            int? port,

            string? shield,

            string? sslCaCert,

            string? sslCertHostname,

            bool? sslCheckCert,

            string? sslCiphers,

            string? sslClientCert,

            string? sslClientKey,

            string? sslHostname,

            string? sslSniHostname,

            bool? useSsl,

            int? weight)
        {
            Address = address;
            AutoLoadbalance = autoLoadbalance;
            BetweenBytesTimeout = betweenBytesTimeout;
            ConnectTimeout = connectTimeout;
            ErrorThreshold = errorThreshold;
            FirstByteTimeout = firstByteTimeout;
            Healthcheck = healthcheck;
            MaxConn = maxConn;
            MaxTlsVersion = maxTlsVersion;
            MinTlsVersion = minTlsVersion;
            Name = name;
            OverrideHost = overrideHost;
            Port = port;
            Shield = shield;
            SslCaCert = sslCaCert;
            SslCertHostname = sslCertHostname;
            SslCheckCert = sslCheckCert;
            SslCiphers = sslCiphers;
            SslClientCert = sslClientCert;
            SslClientKey = sslClientKey;
            SslHostname = sslHostname;
            SslSniHostname = sslSniHostname;
            UseSsl = useSsl;
            Weight = weight;
        }
    }
}