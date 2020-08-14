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
    public sealed class ServiceComputeLoggingElasticsearch
    {
        /// <summary>
        /// The name of the Elasticsearch index to send documents (logs) to.
        /// </summary>
        public readonly string Index;
        /// <summary>
        /// The unique name of the Rackspace Cloud Files logging endpoint.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The ID of the Elasticsearch ingest pipeline to apply pre-process transformations to before indexing.
        /// </summary>
        public readonly string? Pipeline;
        /// <summary>
        /// The maximum number of bytes sent in one request. Defaults to `0` for unbounded.
        /// </summary>
        public readonly int? RequestMaxBytes;
        /// <summary>
        /// The maximum number of logs sent in one request. Defaults to `0` for unbounded.
        /// </summary>
        public readonly int? RequestMaxEntries;
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
        /// Your OpenStack auth url.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The username for your Cloud Files account.
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private ServiceComputeLoggingElasticsearch(
            string index,

            string name,

            string? password,

            string? pipeline,

            int? requestMaxBytes,

            int? requestMaxEntries,

            string? tlsCaCert,

            string? tlsClientCert,

            string? tlsClientKey,

            string? tlsHostname,

            string url,

            string? user)
        {
            Index = index;
            Name = name;
            Password = password;
            Pipeline = pipeline;
            RequestMaxBytes = requestMaxBytes;
            RequestMaxEntries = requestMaxEntries;
            TlsCaCert = tlsCaCert;
            TlsClientCert = tlsClientCert;
            TlsClientKey = tlsClientKey;
            TlsHostname = tlsHostname;
            Url = url;
            User = user;
        }
    }
}