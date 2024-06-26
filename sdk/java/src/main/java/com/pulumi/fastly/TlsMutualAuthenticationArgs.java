// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsMutualAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsMutualAuthenticationArgs Empty = new TlsMutualAuthenticationArgs();

    /**
     * List of TLS Activation IDs
     * 
     */
    @Import(name="activationIds")
    private @Nullable Output<List<String>> activationIds;

    /**
     * @return List of TLS Activation IDs
     * 
     */
    public Optional<Output<List<String>>> activationIds() {
        return Optional.ofNullable(this.activationIds);
    }

    /**
     * One or more certificates. Enter each individual certificate blob on a new line. Must be PEM-formatted.
     * 
     */
    @Import(name="certBundle", required=true)
    private Output<String> certBundle;

    /**
     * @return One or more certificates. Enter each individual certificate blob on a new line. Must be PEM-formatted.
     * 
     */
    public Output<String> certBundle() {
        return this.certBundle;
    }

    /**
     * Determines whether Mutual TLS will fail closed (enforced) or fail open. A true value will require a successful Mutual TLS handshake for the connection to continue and will fail closed if unsuccessful. A false value will fail open and allow the connection to proceed (if this attribute is not set we default to `false`).
     * 
     */
    @Import(name="enforced")
    private @Nullable Output<Boolean> enforced;

    /**
     * @return Determines whether Mutual TLS will fail closed (enforced) or fail open. A true value will require a successful Mutual TLS handshake for the connection to continue and will fail closed if unsuccessful. A false value will fail open and allow the connection to proceed (if this attribute is not set we default to `false`).
     * 
     */
    public Optional<Output<Boolean>> enforced() {
        return Optional.ofNullable(this.enforced);
    }

    @Import(name="include")
    private @Nullable Output<String> include;

    public Optional<Output<String>> include() {
        return Optional.ofNullable(this.include);
    }

    /**
     * A custom name for your mutual authentication. If name is not supplied we will auto-generate one.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A custom name for your mutual authentication. If name is not supplied we will auto-generate one.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TlsMutualAuthenticationArgs() {}

    private TlsMutualAuthenticationArgs(TlsMutualAuthenticationArgs $) {
        this.activationIds = $.activationIds;
        this.certBundle = $.certBundle;
        this.enforced = $.enforced;
        this.include = $.include;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsMutualAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsMutualAuthenticationArgs $;

        public Builder() {
            $ = new TlsMutualAuthenticationArgs();
        }

        public Builder(TlsMutualAuthenticationArgs defaults) {
            $ = new TlsMutualAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationIds List of TLS Activation IDs
         * 
         * @return builder
         * 
         */
        public Builder activationIds(@Nullable Output<List<String>> activationIds) {
            $.activationIds = activationIds;
            return this;
        }

        /**
         * @param activationIds List of TLS Activation IDs
         * 
         * @return builder
         * 
         */
        public Builder activationIds(List<String> activationIds) {
            return activationIds(Output.of(activationIds));
        }

        /**
         * @param activationIds List of TLS Activation IDs
         * 
         * @return builder
         * 
         */
        public Builder activationIds(String... activationIds) {
            return activationIds(List.of(activationIds));
        }

        /**
         * @param certBundle One or more certificates. Enter each individual certificate blob on a new line. Must be PEM-formatted.
         * 
         * @return builder
         * 
         */
        public Builder certBundle(Output<String> certBundle) {
            $.certBundle = certBundle;
            return this;
        }

        /**
         * @param certBundle One or more certificates. Enter each individual certificate blob on a new line. Must be PEM-formatted.
         * 
         * @return builder
         * 
         */
        public Builder certBundle(String certBundle) {
            return certBundle(Output.of(certBundle));
        }

        /**
         * @param enforced Determines whether Mutual TLS will fail closed (enforced) or fail open. A true value will require a successful Mutual TLS handshake for the connection to continue and will fail closed if unsuccessful. A false value will fail open and allow the connection to proceed (if this attribute is not set we default to `false`).
         * 
         * @return builder
         * 
         */
        public Builder enforced(@Nullable Output<Boolean> enforced) {
            $.enforced = enforced;
            return this;
        }

        /**
         * @param enforced Determines whether Mutual TLS will fail closed (enforced) or fail open. A true value will require a successful Mutual TLS handshake for the connection to continue and will fail closed if unsuccessful. A false value will fail open and allow the connection to proceed (if this attribute is not set we default to `false`).
         * 
         * @return builder
         * 
         */
        public Builder enforced(Boolean enforced) {
            return enforced(Output.of(enforced));
        }

        public Builder include(@Nullable Output<String> include) {
            $.include = include;
            return this;
        }

        public Builder include(String include) {
            return include(Output.of(include));
        }

        /**
         * @param name A custom name for your mutual authentication. If name is not supplied we will auto-generate one.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A custom name for your mutual authentication. If name is not supplied we will auto-generate one.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TlsMutualAuthenticationArgs build() {
            if ($.certBundle == null) {
                throw new MissingRequiredPropertyException("TlsMutualAuthenticationArgs", "certBundle");
            }
            return $;
        }
    }

}
