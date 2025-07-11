// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceComputeLoggingPapertrail {
    /**
     * @return The address of the Papertrail endpoint
     * 
     */
    private String address;
    /**
     * @return A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return The port associated with the address where the Papertrail endpoint can be accessed
     * 
     */
    private Integer port;
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    private @Nullable String processingRegion;

    private ServiceComputeLoggingPapertrail() {}
    /**
     * @return The address of the Papertrail endpoint
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The port associated with the address where the Papertrail endpoint can be accessed
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    public Optional<String> processingRegion() {
        return Optional.ofNullable(this.processingRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceComputeLoggingPapertrail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String name;
        private Integer port;
        private @Nullable String processingRegion;
        public Builder() {}
        public Builder(ServiceComputeLoggingPapertrail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.processingRegion = defaults.processingRegion;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrail", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrail", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrail", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder processingRegion(@Nullable String processingRegion) {

            this.processingRegion = processingRegion;
            return this;
        }
        public ServiceComputeLoggingPapertrail build() {
            final var _resultValue = new ServiceComputeLoggingPapertrail();
            _resultValue.address = address;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.processingRegion = processingRegion;
            return _resultValue;
        }
    }
}
