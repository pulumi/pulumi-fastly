// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.fastly.TlsCertificateArgs;
import com.pulumi.fastly.Utilities;
import com.pulumi.fastly.inputs.TlsCertificateState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Uploads a custom TLS certificate to Fastly to be used to terminate TLS traffic.
 * 
 * &gt; Each TLS certificate **must** have its corresponding private key uploaded _prior_ to uploading the certificate. This
 * can be achieved in Pulumi using `depends_on`
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.tls.privateKey;
 * import com.pulumi.tls.privateKeyArgs;
 * import com.pulumi.tls.selfSignedCert;
 * import com.pulumi.tls.selfSignedCertArgs;
 * import com.pulumi.fastly.TlsPrivateKey;
 * import com.pulumi.fastly.TlsPrivateKeyArgs;
 * import com.pulumi.fastly.TlsCertificate;
 * import com.pulumi.fastly.TlsCertificateArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var key = new PrivateKey("key", PrivateKeyArgs.builder()
 *             .algorithm("RSA")
 *             .build());
 * 
 *         var cert = new SelfSignedCert("cert", SelfSignedCertArgs.builder()
 *             .keyAlgorithm(key.algorithm())
 *             .privateKeyPem(key.privateKeyPem())
 *             .subject(List.of(Map.of("commonName", "example.com")))
 *             .isCaCertificate(true)
 *             .validityPeriodHours(360)
 *             .allowedUses(List.of(            
 *                 "cert_signing",
 *                 "server_auth"))
 *             .dnsNames(List.of("example.com"))
 *             .build());
 * 
 *         var keyTlsPrivateKey = new TlsPrivateKey("keyTlsPrivateKey", TlsPrivateKeyArgs.builder()
 *             .keyPem(key.privateKeyPem())
 *             .name("tf-demo")
 *             .build());
 * 
 *         var example = new TlsCertificate("example", TlsCertificateArgs.builder()
 *             .name("tf-demo")
 *             .certificateBody(cert.certPem())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(keyTlsPrivateKey)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Updating certificates
 * 
 * There are three scenarios for updating a certificate:
 * 
 * 1. The certificate is about to expire but the private key stays the same.
 * 2. The certificate is about to expire but the private key is changing.
 * 3. The domains on the certificate are changing.
 * 
 * In the first scenario you only need to update the `certificate_body` attribute of the `fastly.TlsCertificate` resource, while the other scenarios require a new private key (`fastly.TlsPrivateKey`) and certificate (`fastly.TlsCertificate`) to be generated.
 * 
 * When updating both the `fastly.TlsPrivateKey` and `fastly.TlsCertificate` resources, they should be done in multiple plan/apply steps to avoid potential downtime. The new certificate and associated private key must first be created so they exist alongside the currently active resources. Once the new resources have been created, then the `fastly.TlsActivation` can be updated to point to the new certificate. Finally, the original key/certificate resources can be deleted.
 * 
 * ## Import
 * 
 * A certificate can be imported using its Fastly certificate ID, e.g.
 * 
 * ```sh
 * $ pulumi import fastly:index/tlsCertificate:TlsCertificate demo xxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="fastly:index/tlsCertificate:TlsCertificate")
public class TlsCertificate extends com.pulumi.resources.CustomResource {
    /**
     * PEM-formatted certificate, optionally including any intermediary certificates.
     * 
     */
    @Export(name="certificateBody", refs={String.class}, tree="[0]")
    private Output<String> certificateBody;

    /**
     * @return PEM-formatted certificate, optionally including any intermediary certificates.
     * 
     */
    public Output<String> certificateBody() {
        return this.certificateBody;
    }
    /**
     * Timestamp (GMT) when the certificate was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp (GMT) when the certificate was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * All the domains (including wildcard domains) that are listed in the certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    @Export(name="domains", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> domains;

    /**
     * @return All the domains (including wildcard domains) that are listed in the certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    public Output<List<String>> domains() {
        return this.domains;
    }
    /**
     * The hostname for which a certificate was issued.
     * 
     */
    @Export(name="issuedTo", refs={String.class}, tree="[0]")
    private Output<String> issuedTo;

    /**
     * @return The hostname for which a certificate was issued.
     * 
     */
    public Output<String> issuedTo() {
        return this.issuedTo;
    }
    /**
     * The certificate authority that issued the certificate.
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return The certificate authority that issued the certificate.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * Human-readable name used to identify the certificate. Defaults to the certificate&#39;s Common Name or first Subject Alternative Name entry.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human-readable name used to identify the certificate. Defaults to the certificate&#39;s Common Name or first Subject Alternative Name entry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    @Export(name="replace", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> replace;

    /**
     * @return A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    public Output<Boolean> replace() {
        return this.replace;
    }
    /**
     * A value assigned by the issuer that is unique to a certificate.
     * 
     */
    @Export(name="serialNumber", refs={String.class}, tree="[0]")
    private Output<String> serialNumber;

    /**
     * @return A value assigned by the issuer that is unique to a certificate.
     * 
     */
    public Output<String> serialNumber() {
        return this.serialNumber;
    }
    /**
     * The algorithm used to sign the certificate.
     * 
     */
    @Export(name="signatureAlgorithm", refs={String.class}, tree="[0]")
    private Output<String> signatureAlgorithm;

    /**
     * @return The algorithm used to sign the certificate.
     * 
     */
    public Output<String> signatureAlgorithm() {
        return this.signatureAlgorithm;
    }
    /**
     * Timestamp (GMT) when the certificate was last updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Timestamp (GMT) when the certificate was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TlsCertificate(java.lang.String name) {
        this(name, TlsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TlsCertificate(java.lang.String name, TlsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TlsCertificate(java.lang.String name, TlsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/tlsCertificate:TlsCertificate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TlsCertificate(java.lang.String name, Output<java.lang.String> id, @Nullable TlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/tlsCertificate:TlsCertificate", name, state, makeResourceOptions(options, id), false);
    }

    private static TlsCertificateArgs makeArgs(TlsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TlsCertificateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TlsCertificate get(java.lang.String name, Output<java.lang.String> id, @Nullable TlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TlsCertificate(name, id, state, options);
    }
}
