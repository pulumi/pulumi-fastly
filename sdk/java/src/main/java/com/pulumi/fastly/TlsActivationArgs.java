// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsActivationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsActivationArgs Empty = new TlsActivationArgs();

    /**
     * ID of certificate to use. Must have the `domain` specified in the certificate&#39;s Subject Alternative Names.
     * 
     */
    @Import(name="certificateId", required=true)
    private Output<String> certificateId;

    /**
     * @return ID of certificate to use. Must have the `domain` specified in the certificate&#39;s Subject Alternative Names.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }

    /**
     * ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
     * 
     */
    @Import(name="configurationId")
    private @Nullable Output<String> configurationId;

    /**
     * @return ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
     * 
     */
    public Optional<Output<String>> configurationId() {
        return Optional.ofNullable(this.configurationId);
    }

    /**
     * Domain to enable TLS on. Must be assigned to an existing Fastly Service.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return Domain to enable TLS on. Must be assigned to an existing Fastly Service.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * An alphanumeric string identifying a mutual authentication.
     * 
     */
    @Import(name="mutualAuthenticationId")
    private @Nullable Output<String> mutualAuthenticationId;

    /**
     * @return An alphanumeric string identifying a mutual authentication.
     * 
     */
    public Optional<Output<String>> mutualAuthenticationId() {
        return Optional.ofNullable(this.mutualAuthenticationId);
    }

    private TlsActivationArgs() {}

    private TlsActivationArgs(TlsActivationArgs $) {
        this.certificateId = $.certificateId;
        this.configurationId = $.configurationId;
        this.domain = $.domain;
        this.mutualAuthenticationId = $.mutualAuthenticationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsActivationArgs $;

        public Builder() {
            $ = new TlsActivationArgs();
        }

        public Builder(TlsActivationArgs defaults) {
            $ = new TlsActivationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId ID of certificate to use. Must have the `domain` specified in the certificate&#39;s Subject Alternative Names.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId ID of certificate to use. Must have the `domain` specified in the certificate&#39;s Subject Alternative Names.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param configurationId ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(@Nullable Output<String> configurationId) {
            $.configurationId = configurationId;
            return this;
        }

        /**
         * @param configurationId ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(String configurationId) {
            return configurationId(Output.of(configurationId));
        }

        /**
         * @param domain Domain to enable TLS on. Must be assigned to an existing Fastly Service.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Domain to enable TLS on. Must be assigned to an existing Fastly Service.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param mutualAuthenticationId An alphanumeric string identifying a mutual authentication.
         * 
         * @return builder
         * 
         */
        public Builder mutualAuthenticationId(@Nullable Output<String> mutualAuthenticationId) {
            $.mutualAuthenticationId = mutualAuthenticationId;
            return this;
        }

        /**
         * @param mutualAuthenticationId An alphanumeric string identifying a mutual authentication.
         * 
         * @return builder
         * 
         */
        public Builder mutualAuthenticationId(String mutualAuthenticationId) {
            return mutualAuthenticationId(Output.of(mutualAuthenticationId));
        }

        public TlsActivationArgs build() {
            if ($.certificateId == null) {
                throw new MissingRequiredPropertyException("TlsActivationArgs", "certificateId");
            }
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("TlsActivationArgs", "domain");
            }
            return $;
        }
    }

}