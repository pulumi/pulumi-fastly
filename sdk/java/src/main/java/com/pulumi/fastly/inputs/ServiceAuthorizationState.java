// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAuthorizationState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAuthorizationState Empty = new ServiceAuthorizationState();

    /**
     * The permissions to grant the user. Can be `full`, `read_only`, `purge_select` or `purge_all`.
     * 
     */
    @Import(name="permission")
    private @Nullable Output<String> permission;

    /**
     * @return The permissions to grant the user. Can be `full`, `read_only`, `purge_select` or `purge_all`.
     * 
     */
    public Optional<Output<String>> permission() {
        return Optional.ofNullable(this.permission);
    }

    /**
     * The ID of the service to grant permissions for.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The ID of the service to grant permissions for.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * The ID of the user which will receive the granted permissions.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The ID of the user which will receive the granted permissions.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private ServiceAuthorizationState() {}

    private ServiceAuthorizationState(ServiceAuthorizationState $) {
        this.permission = $.permission;
        this.serviceId = $.serviceId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAuthorizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAuthorizationState $;

        public Builder() {
            $ = new ServiceAuthorizationState();
        }

        public Builder(ServiceAuthorizationState defaults) {
            $ = new ServiceAuthorizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param permission The permissions to grant the user. Can be `full`, `read_only`, `purge_select` or `purge_all`.
         * 
         * @return builder
         * 
         */
        public Builder permission(@Nullable Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission The permissions to grant the user. Can be `full`, `read_only`, `purge_select` or `purge_all`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        /**
         * @param serviceId The ID of the service to grant permissions for.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the service to grant permissions for.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param userId The ID of the user which will receive the granted permissions.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the user which will receive the granted permissions.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ServiceAuthorizationState build() {
            return $;
        }
    }

}