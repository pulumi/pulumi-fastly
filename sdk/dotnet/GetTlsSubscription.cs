// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    public static class GetTlsSubscription
    {
        /// <summary>
        /// Use this data source to get information about a TLS subscription.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fastly = Pulumi.Fastly;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Fastly.GetTlsSubscription.Invoke(new()
        ///     {
        ///         Domains = new[]
        ///         {
        ///             "example.com",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTlsSubscriptionResult> InvokeAsync(GetTlsSubscriptionArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTlsSubscriptionResult>("fastly:index/getTlsSubscription:getTlsSubscription", args ?? new GetTlsSubscriptionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a TLS subscription.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fastly = Pulumi.Fastly;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Fastly.GetTlsSubscription.Invoke(new()
        ///     {
        ///         Domains = new[]
        ///         {
        ///             "example.com",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsSubscriptionResult> Invoke(GetTlsSubscriptionInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsSubscriptionResult>("fastly:index/getTlsSubscription:getTlsSubscription", args ?? new GetTlsSubscriptionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a TLS subscription.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Fastly = Pulumi.Fastly;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Fastly.GetTlsSubscription.Invoke(new()
        ///     {
        ///         Domains = new[]
        ///         {
        ///             "example.com",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsSubscriptionResult> Invoke(GetTlsSubscriptionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsSubscriptionResult>("fastly:index/getTlsSubscription:getTlsSubscription", args ?? new GetTlsSubscriptionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTlsSubscriptionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The entity that issues and certifies the TLS certificates for the subscription.
        /// </summary>
        [Input("certificateAuthority")]
        public string? CertificateAuthority { get; set; }

        /// <summary>
        /// ID of TLS configuration used to terminate TLS traffic.
        /// </summary>
        [Input("configurationId")]
        public string? ConfigurationId { get; set; }

        [Input("domains")]
        private List<string>? _domains;

        /// <summary>
        /// List of domains on which to enable TLS.
        /// </summary>
        public List<string> Domains
        {
            get => _domains ?? (_domains = new List<string>());
            set => _domains = value;
        }

        /// <summary>
        /// ID of TLS subscription. Conflicts with all the other filters.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetTlsSubscriptionArgs()
        {
        }
        public static new GetTlsSubscriptionArgs Empty => new GetTlsSubscriptionArgs();
    }

    public sealed class GetTlsSubscriptionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The entity that issues and certifies the TLS certificates for the subscription.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// ID of TLS configuration used to terminate TLS traffic.
        /// </summary>
        [Input("configurationId")]
        public Input<string>? ConfigurationId { get; set; }

        [Input("domains")]
        private InputList<string>? _domains;

        /// <summary>
        /// List of domains on which to enable TLS.
        /// </summary>
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        /// <summary>
        /// ID of TLS subscription. Conflicts with all the other filters.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetTlsSubscriptionInvokeArgs()
        {
        }
        public static new GetTlsSubscriptionInvokeArgs Empty => new GetTlsSubscriptionInvokeArgs();
    }


    [OutputType]
    public sealed class GetTlsSubscriptionResult
    {
        /// <summary>
        /// The entity that issues and certifies the TLS certificates for the subscription.
        /// </summary>
        public readonly string CertificateAuthority;
        /// <summary>
        /// List of certificate IDs associated with the Subscription.
        /// </summary>
        public readonly ImmutableArray<string> CertificateIds;
        /// <summary>
        /// The common name associated with the subscription generated by Fastly TLS.
        /// </summary>
        public readonly string CommonName;
        /// <summary>
        /// ID of TLS configuration used to terminate TLS traffic.
        /// </summary>
        public readonly string ConfigurationId;
        /// <summary>
        /// Timestamp (GMT) when subscription was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// List of domains on which to enable TLS.
        /// </summary>
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// ID of TLS subscription. Conflicts with all the other filters.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The current state of the subscription. The list of possible states are: `pending`, `processing`, `issued`, and `renewing`.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Timestamp (GMT) when subscription was last updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetTlsSubscriptionResult(
            string certificateAuthority,

            ImmutableArray<string> certificateIds,

            string commonName,

            string configurationId,

            string createdAt,

            ImmutableArray<string> domains,

            string id,

            string state,

            string updatedAt)
        {
            CertificateAuthority = certificateAuthority;
            CertificateIds = certificateIds;
            CommonName = commonName;
            ConfigurationId = configurationId;
            CreatedAt = createdAt;
            Domains = domains;
            Id = id;
            State = state;
            UpdatedAt = updatedAt;
        }
    }
}
