// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    public static class GetTlsCertificateIds
    {
        /// <summary>
        /// Use this data source to get the IDs of available TLS certificates for use with other resources.
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
        ///     var example = Fastly.GetTlsCertificateIds.Invoke();
        /// 
        ///     var exampleTlsActivation = new Fastly.TlsActivation("example", new()
        ///     {
        ///         CertificateId = example.Apply(getTlsCertificateIdsResult =&gt; getTlsCertificateIdsResult.Ids[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTlsCertificateIdsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTlsCertificateIdsResult>("fastly:index/getTlsCertificateIds:getTlsCertificateIds", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to get the IDs of available TLS certificates for use with other resources.
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
        ///     var example = Fastly.GetTlsCertificateIds.Invoke();
        /// 
        ///     var exampleTlsActivation = new Fastly.TlsActivation("example", new()
        ///     {
        ///         CertificateId = example.Apply(getTlsCertificateIdsResult =&gt; getTlsCertificateIdsResult.Ids[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsCertificateIdsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsCertificateIdsResult>("fastly:index/getTlsCertificateIds:getTlsCertificateIds", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to get the IDs of available TLS certificates for use with other resources.
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
        ///     var example = Fastly.GetTlsCertificateIds.Invoke();
        /// 
        ///     var exampleTlsActivation = new Fastly.TlsActivation("example", new()
        ///     {
        ///         CertificateId = example.Apply(getTlsCertificateIdsResult =&gt; getTlsCertificateIdsResult.Ids[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsCertificateIdsResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsCertificateIdsResult>("fastly:index/getTlsCertificateIds:getTlsCertificateIds", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetTlsCertificateIdsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of IDs corresponding to Custom TLS certificates.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private GetTlsCertificateIdsResult(
            string id,

            ImmutableArray<string> ids)
        {
            Id = id;
            Ids = ids;
        }
    }
}
