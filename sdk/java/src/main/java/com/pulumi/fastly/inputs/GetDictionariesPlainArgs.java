// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetDictionariesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDictionariesPlainArgs Empty = new GetDictionariesPlainArgs();

    /**
     * Alphanumeric string identifying the service.
     * 
     */
    @Import(name="serviceId", required=true)
    private String serviceId;

    /**
     * @return Alphanumeric string identifying the service.
     * 
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Integer identifying a service version.
     * 
     */
    @Import(name="serviceVersion", required=true)
    private Integer serviceVersion;

    /**
     * @return Integer identifying a service version.
     * 
     */
    public Integer serviceVersion() {
        return this.serviceVersion;
    }

    private GetDictionariesPlainArgs() {}

    private GetDictionariesPlainArgs(GetDictionariesPlainArgs $) {
        this.serviceId = $.serviceId;
        this.serviceVersion = $.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDictionariesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDictionariesPlainArgs $;

        public Builder() {
            $ = new GetDictionariesPlainArgs();
        }

        public Builder(GetDictionariesPlainArgs defaults) {
            $ = new GetDictionariesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceId Alphanumeric string identifying the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceVersion Integer identifying a service version.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(Integer serviceVersion) {
            $.serviceVersion = serviceVersion;
            return this;
        }

        public GetDictionariesPlainArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("GetDictionariesPlainArgs", "serviceId");
            }
            if ($.serviceVersion == null) {
                throw new MissingRequiredPropertyException("GetDictionariesPlainArgs", "serviceVersion");
            }
            return $;
        }
    }

}