// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.fastly.TlsPlatformCertificateArgs;
import com.pulumi.fastly.Utilities;
import com.pulumi.fastly.inputs.TlsPlatformCertificateState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Uploads a TLS certificate to the Fastly Platform TLS service.
 * 
 * &gt; Each TLS certificate **must** have its corresponding private key uploaded _prior_ to uploading the certificate.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * A certificate can be imported using its Fastly certificate ID, e.g.
 * 
 * ```sh
 *  $ pulumi import fastly:index/tlsPlatformCertificate:TlsPlatformCertificate demo xxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="fastly:index/tlsPlatformCertificate:TlsPlatformCertificate")
public class TlsPlatformCertificate extends com.pulumi.resources.CustomResource {
    /**
     * Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     * 
     */
    @Export(name="allowUntrustedRoot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowUntrustedRoot;

    /**
     * @return Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     * 
     */
    public Output<Optional<Boolean>> allowUntrustedRoot() {
        return Codegen.optional(this.allowUntrustedRoot);
    }
    /**
     * PEM-formatted certificate.
     * 
     */
    @Export(name="certificateBody", type=String.class, parameters={})
    private Output<String> certificateBody;

    /**
     * @return PEM-formatted certificate.
     * 
     */
    public Output<String> certificateBody() {
        return this.certificateBody;
    }
    /**
     * ID of TLS configuration to be used to terminate TLS traffic.
     * 
     */
    @Export(name="configurationId", type=String.class, parameters={})
    private Output<String> configurationId;

    /**
     * @return ID of TLS configuration to be used to terminate TLS traffic.
     * 
     */
    public Output<String> configurationId() {
        return this.configurationId;
    }
    /**
     * Timestamp (GMT) when the certificate was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Timestamp (GMT) when the certificate was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    @Export(name="domains", type=List.class, parameters={String.class})
    private Output<List<String>> domains;

    /**
     * @return All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    public Output<List<String>> domains() {
        return this.domains;
    }
    /**
     * PEM-formatted certificate chain from the `certificate_body` to its root.
     * 
     */
    @Export(name="intermediatesBlob", type=String.class, parameters={})
    private Output<String> intermediatesBlob;

    /**
     * @return PEM-formatted certificate chain from the `certificate_body` to its root.
     * 
     */
    public Output<String> intermediatesBlob() {
        return this.intermediatesBlob;
    }
    /**
     * Timestamp (GMT) when the certificate will expire.
     * 
     */
    @Export(name="notAfter", type=String.class, parameters={})
    private Output<String> notAfter;

    /**
     * @return Timestamp (GMT) when the certificate will expire.
     * 
     */
    public Output<String> notAfter() {
        return this.notAfter;
    }
    /**
     * Timestamp (GMT) when the certificate will become valid.
     * 
     */
    @Export(name="notBefore", type=String.class, parameters={})
    private Output<String> notBefore;

    /**
     * @return Timestamp (GMT) when the certificate will become valid.
     * 
     */
    public Output<String> notBefore() {
        return this.notBefore;
    }
    /**
     * A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    @Export(name="replace", type=Boolean.class, parameters={})
    private Output<Boolean> replace;

    /**
     * @return A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    public Output<Boolean> replace() {
        return this.replace;
    }
    /**
     * Timestamp (GMT) when the certificate was last updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
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
    public TlsPlatformCertificate(String name) {
        this(name, TlsPlatformCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TlsPlatformCertificate(String name, TlsPlatformCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TlsPlatformCertificate(String name, TlsPlatformCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, args == null ? TlsPlatformCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TlsPlatformCertificate(String name, Output<String> id, @Nullable TlsPlatformCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/tlsPlatformCertificate:TlsPlatformCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static TlsPlatformCertificate get(String name, Output<String> id, @Nullable TlsPlatformCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TlsPlatformCertificate(name, id, state, options);
    }
}