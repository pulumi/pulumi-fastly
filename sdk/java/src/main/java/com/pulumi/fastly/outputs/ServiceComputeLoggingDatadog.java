// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceComputeLoggingDatadog {
    /**
     * @return The unique name of the Datadog logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    private @Nullable String processingRegion;
    /**
     * @return The region that log data will be sent to. One of `US` or `EU`. Defaults to `US` if undefined
     * 
     */
    private @Nullable String region;
    /**
     * @return The API key from your Datadog account
     * 
     */
    private String token;

    private ServiceComputeLoggingDatadog() {}
    /**
     * @return The unique name of the Datadog logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    public Optional<String> processingRegion() {
        return Optional.ofNullable(this.processingRegion);
    }
    /**
     * @return The region that log data will be sent to. One of `US` or `EU`. Defaults to `US` if undefined
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The API key from your Datadog account
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceComputeLoggingDatadog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String processingRegion;
        private @Nullable String region;
        private String token;
        public Builder() {}
        public Builder(ServiceComputeLoggingDatadog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.processingRegion = defaults.processingRegion;
    	      this.region = defaults.region;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingDatadog", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder processingRegion(@Nullable String processingRegion) {

            this.processingRegion = processingRegion;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingDatadog", "token");
            }
            this.token = token;
            return this;
        }
        public ServiceComputeLoggingDatadog build() {
            final var _resultValue = new ServiceComputeLoggingDatadog();
            _resultValue.name = name;
            _resultValue.processingRegion = processingRegion;
            _resultValue.region = region;
            _resultValue.token = token;
            return _resultValue;
        }
    }
}
