// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    public static class GetTlsPrivateKey
    {
        /// <summary>
        /// Use this data source to get information on a TLS Private Key uploaded to Fastly.
        /// 
        /// &gt; **Warning:** The data source's filters are applied using an **AND** boolean operator, so depending on the combination
        ///  of filters, they may become mutually exclusive. The exception to this is `id` which must not be specified in combination
        ///  with any of the others.
        /// 
        /// &gt; **Note:** If more or less than a single match is returned by the search, this provider will fail. Ensure that your search
        ///  is specific enough to return a single key.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Fastly = Pulumi.Fastly;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var demo = Output.Create(Fastly.GetTlsPrivateKey.InvokeAsync(new Fastly.GetTlsPrivateKeyArgs
        ///         {
        ///             Name = "demo-private-key",
        ///         }));
        ///         this.PrivateKeyNeedsReplacing = demo.Apply(demo =&gt; demo.Replace);
        ///     }
        /// 
        ///     [Output("privateKeyNeedsReplacing")]
        ///     public Output&lt;string&gt; PrivateKeyNeedsReplacing { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTlsPrivateKeyResult> InvokeAsync(GetTlsPrivateKeyArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTlsPrivateKeyResult>("fastly:index/getTlsPrivateKey:getTlsPrivateKey", args ?? new GetTlsPrivateKeyArgs(), options.WithVersion());
    }


    public sealed class GetTlsPrivateKeyArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Timestamp (GMT) when the private key was created.
        /// </summary>
        [Input("createdAt")]
        public string? CreatedAt { get; set; }

        /// <summary>
        /// Fastly private key ID. Conflicts with all the other filters
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The key length used to generate the private key.
        /// </summary>
        [Input("keyLength")]
        public int? KeyLength { get; set; }

        /// <summary>
        /// The algorithm used to generate the private key. Must be RSA.
        /// </summary>
        [Input("keyType")]
        public string? KeyType { get; set; }

        /// <summary>
        /// The human-readable name assigned to the private key when uploaded.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// A hash of the associated public key, useful for safely identifying it.
        /// </summary>
        [Input("publicKeySha1")]
        public string? PublicKeySha1 { get; set; }

        public GetTlsPrivateKeyArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTlsPrivateKeyResult
    {
        /// <summary>
        /// Timestamp (GMT) when the private key was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Fastly private key ID. Conflicts with all the other filters
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The key length used to generate the private key.
        /// </summary>
        public readonly int KeyLength;
        /// <summary>
        /// The algorithm used to generate the private key. Must be RSA.
        /// </summary>
        public readonly string KeyType;
        /// <summary>
        /// The human-readable name assigned to the private key when uploaded.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A hash of the associated public key, useful for safely identifying it.
        /// </summary>
        public readonly string PublicKeySha1;
        /// <summary>
        /// Whether Fastly recommends replacing this private key.
        /// </summary>
        public readonly bool Replace;

        [OutputConstructor]
        private GetTlsPrivateKeyResult(
            string createdAt,

            string id,

            int keyLength,

            string keyType,

            string name,

            string publicKeySha1,

            bool replace)
        {
            CreatedAt = createdAt;
            Id = id;
            KeyLength = keyLength;
            KeyType = keyType;
            Name = name;
            PublicKeySha1 = publicKeySha1;
            Replace = replace;
        }
    }
}