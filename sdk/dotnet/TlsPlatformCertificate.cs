// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    /// <summary>
    /// Uploads a TLS certificate to the Fastly Platform TLS service.
    /// 
    /// &gt; Each TLS certificate **must** have its corresponding private key uploaded _prior_ to uploading the certificate. This
    /// can be achieved in Pulumi using `depends_on`
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage with self-signed CA:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Fastly = Pulumi.Fastly;
    /// using Tls = Pulumi.Tls;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var caKey = new Tls.Index.PrivateKey("ca_key", new()
    ///     {
    ///         Algorithm = "RSA",
    ///     });
    /// 
    ///     var key = new Tls.Index.PrivateKey("key", new()
    ///     {
    ///         Algorithm = "RSA",
    ///     });
    /// 
    ///     var ca = new Tls.Index.SelfSignedCert("ca", new()
    ///     {
    ///         KeyAlgorithm = caKey.Algorithm,
    ///         PrivateKeyPem = caKey.PrivateKeyPem,
    ///         Subject = new[]
    ///         {
    ///             
    ///             {
    ///                 { "commonName", "Example CA" },
    ///             },
    ///         },
    ///         IsCaCertificate = true,
    ///         ValidityPeriodHours = 360,
    ///         AllowedUses = new[]
    ///         {
    ///             "cert_signing",
    ///             "server_auth",
    ///         },
    ///     });
    /// 
    ///     var example = new Tls.Index.CertRequest("example", new()
    ///     {
    ///         KeyAlgorithm = key.Algorithm,
    ///         PrivateKeyPem = key.PrivateKeyPem,
    ///         Subject = new[]
    ///         {
    ///             
    ///             {
    ///                 { "commonName", "example.com" },
    ///             },
    ///         },
    ///         DnsNames = new[]
    ///         {
    ///             "example.com",
    ///             "www.example.com",
    ///         },
    ///     });
    /// 
    ///     var cert = new Tls.Index.LocallySignedCert("cert", new()
    ///     {
    ///         CertRequestPem = example.CertRequestPem,
    ///         CaKeyAlgorithm = caKey.Algorithm,
    ///         CaPrivateKeyPem = caKey.PrivateKeyPem,
    ///         CaCertPem = ca.CertPem,
    ///         ValidityPeriodHours = 360,
    ///         AllowedUses = new[]
    ///         {
    ///             "cert_signing",
    ///             "server_auth",
    ///         },
    ///     });
    /// 
    ///     var config = Fastly.GetTlsConfiguration.Invoke(new()
    ///     {
    ///         TlsService = "PLATFORM",
    ///     });
    /// 
    ///     var keyTlsPrivateKey = new Fastly.TlsPrivateKey("key", new()
    ///     {
    ///         KeyPem = key.PrivateKeyPem,
    ///         Name = "tf-demo",
    ///     });
    /// 
    ///     var certTlsPlatformCertificate = new Fastly.TlsPlatformCertificate("cert", new()
    ///     {
    ///         CertificateBody = cert.CertPem,
    ///         IntermediatesBlob = ca.CertPem,
    ///         ConfigurationId = config.Apply(getTlsConfigurationResult =&gt; getTlsConfigurationResult.Id),
    ///         AllowUntrustedRoot = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             keyTlsPrivateKey,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A certificate can be imported using its Fastly certificate ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import fastly:index/tlsPlatformCertificate:TlsPlatformCertificate demo xxxxxxxxxxx
    /// ```
    /// </summary>
    [FastlyResourceType("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate")]
    public partial class TlsPlatformCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
        /// </summary>
        [Output("allowUntrustedRoot")]
        public Output<bool?> AllowUntrustedRoot { get; private set; } = null!;

        /// <summary>
        /// PEM-formatted certificate.
        /// </summary>
        [Output("certificateBody")]
        public Output<string> CertificateBody { get; private set; } = null!;

        /// <summary>
        /// ID of TLS configuration to be used to terminate TLS traffic.
        /// </summary>
        [Output("configurationId")]
        public Output<string> ConfigurationId { get; private set; } = null!;

        /// <summary>
        /// Timestamp (GMT) when the certificate was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
        /// </summary>
        [Output("domains")]
        public Output<ImmutableArray<string>> Domains { get; private set; } = null!;

        /// <summary>
        /// PEM-formatted certificate chain from the `certificate_body` to its root.
        /// </summary>
        [Output("intermediatesBlob")]
        public Output<string> IntermediatesBlob { get; private set; } = null!;

        /// <summary>
        /// Timestamp (GMT) when the certificate will expire.
        /// </summary>
        [Output("notAfter")]
        public Output<string> NotAfter { get; private set; } = null!;

        /// <summary>
        /// Timestamp (GMT) when the certificate will become valid.
        /// </summary>
        [Output("notBefore")]
        public Output<string> NotBefore { get; private set; } = null!;

        /// <summary>
        /// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
        /// </summary>
        [Output("replace")]
        public Output<bool> Replace { get; private set; } = null!;

        /// <summary>
        /// Timestamp (GMT) when the certificate was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a TlsPlatformCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TlsPlatformCertificate(string name, TlsPlatformCertificateArgs args, CustomResourceOptions? options = null)
            : base("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, args ?? new TlsPlatformCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TlsPlatformCertificate(string name, Input<string> id, TlsPlatformCertificateState? state = null, CustomResourceOptions? options = null)
            : base("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TlsPlatformCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TlsPlatformCertificate Get(string name, Input<string> id, TlsPlatformCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new TlsPlatformCertificate(name, id, state, options);
        }
    }

    public sealed class TlsPlatformCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
        /// </summary>
        [Input("allowUntrustedRoot")]
        public Input<bool>? AllowUntrustedRoot { get; set; }

        /// <summary>
        /// PEM-formatted certificate.
        /// </summary>
        [Input("certificateBody", required: true)]
        public Input<string> CertificateBody { get; set; } = null!;

        /// <summary>
        /// ID of TLS configuration to be used to terminate TLS traffic.
        /// </summary>
        [Input("configurationId", required: true)]
        public Input<string> ConfigurationId { get; set; } = null!;

        /// <summary>
        /// PEM-formatted certificate chain from the `certificate_body` to its root.
        /// </summary>
        [Input("intermediatesBlob", required: true)]
        public Input<string> IntermediatesBlob { get; set; } = null!;

        public TlsPlatformCertificateArgs()
        {
        }
        public static new TlsPlatformCertificateArgs Empty => new TlsPlatformCertificateArgs();
    }

    public sealed class TlsPlatformCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
        /// </summary>
        [Input("allowUntrustedRoot")]
        public Input<bool>? AllowUntrustedRoot { get; set; }

        /// <summary>
        /// PEM-formatted certificate.
        /// </summary>
        [Input("certificateBody")]
        public Input<string>? CertificateBody { get; set; }

        /// <summary>
        /// ID of TLS configuration to be used to terminate TLS traffic.
        /// </summary>
        [Input("configurationId")]
        public Input<string>? ConfigurationId { get; set; }

        /// <summary>
        /// Timestamp (GMT) when the certificate was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("domains")]
        private InputList<string>? _domains;

        /// <summary>
        /// All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
        /// </summary>
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        /// <summary>
        /// PEM-formatted certificate chain from the `certificate_body` to its root.
        /// </summary>
        [Input("intermediatesBlob")]
        public Input<string>? IntermediatesBlob { get; set; }

        /// <summary>
        /// Timestamp (GMT) when the certificate will expire.
        /// </summary>
        [Input("notAfter")]
        public Input<string>? NotAfter { get; set; }

        /// <summary>
        /// Timestamp (GMT) when the certificate will become valid.
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        /// <summary>
        /// A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
        /// </summary>
        [Input("replace")]
        public Input<bool>? Replace { get; set; }

        /// <summary>
        /// Timestamp (GMT) when the certificate was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public TlsPlatformCertificateState()
        {
        }
        public static new TlsPlatformCertificateState Empty => new TlsPlatformCertificateState();
    }
}
