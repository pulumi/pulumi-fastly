// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetDictionariesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDictionariesArgs Empty = new GetDictionariesArgs();

    /**
     * Alphanumeric string identifying the service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return Alphanumeric string identifying the service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * Integer identifying a service version.
     * 
     */
    @Import(name="serviceVersion", required=true)
    private Output<Integer> serviceVersion;

    /**
     * @return Integer identifying a service version.
     * 
     */
    public Output<Integer> serviceVersion() {
        return this.serviceVersion;
    }

    private GetDictionariesArgs() {}

    private GetDictionariesArgs(GetDictionariesArgs $) {
        this.serviceId = $.serviceId;
        this.serviceVersion = $.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDictionariesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDictionariesArgs $;

        public Builder() {
            $ = new GetDictionariesArgs();
        }

        public Builder(GetDictionariesArgs defaults) {
            $ = new GetDictionariesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceId Alphanumeric string identifying the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId Alphanumeric string identifying the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param serviceVersion Integer identifying a service version.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(Output<Integer> serviceVersion) {
            $.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * @param serviceVersion Integer identifying a service version.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(Integer serviceVersion) {
            return serviceVersion(Output.of(serviceVersion));
        }

        public GetDictionariesArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("GetDictionariesArgs", "serviceId");
            }
            if ($.serviceVersion == null) {
                throw new MissingRequiredPropertyException("GetDictionariesArgs", "serviceVersion");
            }
            return $;
        }
    }

}