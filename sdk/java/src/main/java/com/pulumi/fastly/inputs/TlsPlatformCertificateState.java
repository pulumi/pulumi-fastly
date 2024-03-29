// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsPlatformCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final TlsPlatformCertificateState Empty = new TlsPlatformCertificateState();

    /**
     * Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     * 
     */
    @Import(name="allowUntrustedRoot")
    private @Nullable Output<Boolean> allowUntrustedRoot;

    /**
     * @return Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     * 
     */
    public Optional<Output<Boolean>> allowUntrustedRoot() {
        return Optional.ofNullable(this.allowUntrustedRoot);
    }

    /**
     * PEM-formatted certificate.
     * 
     */
    @Import(name="certificateBody")
    private @Nullable Output<String> certificateBody;

    /**
     * @return PEM-formatted certificate.
     * 
     */
    public Optional<Output<String>> certificateBody() {
        return Optional.ofNullable(this.certificateBody);
    }

    /**
     * ID of TLS configuration to be used to terminate TLS traffic.
     * 
     */
    @Import(name="configurationId")
    private @Nullable Output<String> configurationId;

    /**
     * @return ID of TLS configuration to be used to terminate TLS traffic.
     * 
     */
    public Optional<Output<String>> configurationId() {
        return Optional.ofNullable(this.configurationId);
    }

    /**
     * Timestamp (GMT) when the certificate was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Timestamp (GMT) when the certificate was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * PEM-formatted certificate chain from the `certificate_body` to its root.
     * 
     */
    @Import(name="intermediatesBlob")
    private @Nullable Output<String> intermediatesBlob;

    /**
     * @return PEM-formatted certificate chain from the `certificate_body` to its root.
     * 
     */
    public Optional<Output<String>> intermediatesBlob() {
        return Optional.ofNullable(this.intermediatesBlob);
    }

    /**
     * Timestamp (GMT) when the certificate will expire.
     * 
     */
    @Import(name="notAfter")
    private @Nullable Output<String> notAfter;

    /**
     * @return Timestamp (GMT) when the certificate will expire.
     * 
     */
    public Optional<Output<String>> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * Timestamp (GMT) when the certificate will become valid.
     * 
     */
    @Import(name="notBefore")
    private @Nullable Output<String> notBefore;

    /**
     * @return Timestamp (GMT) when the certificate will become valid.
     * 
     */
    public Optional<Output<String>> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }

    /**
     * A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    @Import(name="replace")
    private @Nullable Output<Boolean> replace;

    /**
     * @return A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     * 
     */
    public Optional<Output<Boolean>> replace() {
        return Optional.ofNullable(this.replace);
    }

    /**
     * Timestamp (GMT) when the certificate was last updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return Timestamp (GMT) when the certificate was last updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private TlsPlatformCertificateState() {}

    private TlsPlatformCertificateState(TlsPlatformCertificateState $) {
        this.allowUntrustedRoot = $.allowUntrustedRoot;
        this.certificateBody = $.certificateBody;
        this.configurationId = $.configurationId;
        this.createdAt = $.createdAt;
        this.domains = $.domains;
        this.intermediatesBlob = $.intermediatesBlob;
        this.notAfter = $.notAfter;
        this.notBefore = $.notBefore;
        this.replace = $.replace;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsPlatformCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsPlatformCertificateState $;

        public Builder() {
            $ = new TlsPlatformCertificateState();
        }

        public Builder(TlsPlatformCertificateState defaults) {
            $ = new TlsPlatformCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowUntrustedRoot Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
         * 
         * @return builder
         * 
         */
        public Builder allowUntrustedRoot(@Nullable Output<Boolean> allowUntrustedRoot) {
            $.allowUntrustedRoot = allowUntrustedRoot;
            return this;
        }

        /**
         * @param allowUntrustedRoot Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
         * 
         * @return builder
         * 
         */
        public Builder allowUntrustedRoot(Boolean allowUntrustedRoot) {
            return allowUntrustedRoot(Output.of(allowUntrustedRoot));
        }

        /**
         * @param certificateBody PEM-formatted certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(@Nullable Output<String> certificateBody) {
            $.certificateBody = certificateBody;
            return this;
        }

        /**
         * @param certificateBody PEM-formatted certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(String certificateBody) {
            return certificateBody(Output.of(certificateBody));
        }

        /**
         * @param configurationId ID of TLS configuration to be used to terminate TLS traffic.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(@Nullable Output<String> configurationId) {
            $.configurationId = configurationId;
            return this;
        }

        /**
         * @param configurationId ID of TLS configuration to be used to terminate TLS traffic.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(String configurationId) {
            return configurationId(Output.of(configurationId));
        }

        /**
         * @param createdAt Timestamp (GMT) when the certificate was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Timestamp (GMT) when the certificate was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param domains All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains All the domains (including wildcard domains) that are listed in any certificate&#39;s Subject Alternative Names (SAN) list.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param intermediatesBlob PEM-formatted certificate chain from the `certificate_body` to its root.
         * 
         * @return builder
         * 
         */
        public Builder intermediatesBlob(@Nullable Output<String> intermediatesBlob) {
            $.intermediatesBlob = intermediatesBlob;
            return this;
        }

        /**
         * @param intermediatesBlob PEM-formatted certificate chain from the `certificate_body` to its root.
         * 
         * @return builder
         * 
         */
        public Builder intermediatesBlob(String intermediatesBlob) {
            return intermediatesBlob(Output.of(intermediatesBlob));
        }

        /**
         * @param notAfter Timestamp (GMT) when the certificate will expire.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(@Nullable Output<String> notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        /**
         * @param notAfter Timestamp (GMT) when the certificate will expire.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(String notAfter) {
            return notAfter(Output.of(notAfter));
        }

        /**
         * @param notBefore Timestamp (GMT) when the certificate will become valid.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(@Nullable Output<String> notBefore) {
            $.notBefore = notBefore;
            return this;
        }

        /**
         * @param notBefore Timestamp (GMT) when the certificate will become valid.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(String notBefore) {
            return notBefore(Output.of(notBefore));
        }

        /**
         * @param replace A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
         * 
         * @return builder
         * 
         */
        public Builder replace(@Nullable Output<Boolean> replace) {
            $.replace = replace;
            return this;
        }

        /**
         * @param replace A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
         * 
         * @return builder
         * 
         */
        public Builder replace(Boolean replace) {
            return replace(Output.of(replace));
        }

        /**
         * @param updatedAt Timestamp (GMT) when the certificate was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt Timestamp (GMT) when the certificate was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public TlsPlatformCertificateState build() {
            return $;
        }
    }

}
