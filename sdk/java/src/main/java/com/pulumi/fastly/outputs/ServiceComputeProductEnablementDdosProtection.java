// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceComputeProductEnablementDdosProtection {
    /**
     * @return Enable DDoS Protection support
     * 
     */
    private Boolean enabled;
    /**
     * @return Operation mode
     * 
     */
    private String mode;

    private ServiceComputeProductEnablementDdosProtection() {}
    /**
     * @return Enable DDoS Protection support
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Operation mode
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceComputeProductEnablementDdosProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String mode;
        public Builder() {}
        public Builder(ServiceComputeProductEnablementDdosProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ServiceComputeProductEnablementDdosProtection", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("ServiceComputeProductEnablementDdosProtection", "mode");
            }
            this.mode = mode;
            return this;
        }
        public ServiceComputeProductEnablementDdosProtection build() {
            final var _resultValue = new ServiceComputeProductEnablementDdosProtection();
            _resultValue.enabled = enabled;
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
