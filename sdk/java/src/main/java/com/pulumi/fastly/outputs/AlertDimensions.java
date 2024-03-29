// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AlertDimensions {
    /**
     * @return Names of a subset of domains that the alert monitors.
     * 
     */
    private @Nullable List<String> domains;
    /**
     * @return Addresses of a subset of backends that the alert monitors.
     * 
     */
    private @Nullable List<String> origins;

    private AlertDimensions() {}
    /**
     * @return Names of a subset of domains that the alert monitors.
     * 
     */
    public List<String> domains() {
        return this.domains == null ? List.of() : this.domains;
    }
    /**
     * @return Addresses of a subset of backends that the alert monitors.
     * 
     */
    public List<String> origins() {
        return this.origins == null ? List.of() : this.origins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertDimensions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> domains;
        private @Nullable List<String> origins;
        public Builder() {}
        public Builder(AlertDimensions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.origins = defaults.origins;
        }

        @CustomType.Setter
        public Builder domains(@Nullable List<String> domains) {

            this.domains = domains;
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder origins(@Nullable List<String> origins) {

            this.origins = origins;
            return this;
        }
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }
        public AlertDimensions build() {
            final var _resultValue = new AlertDimensions();
            _resultValue.domains = domains;
            _resultValue.origins = origins;
            return _resultValue;
        }
    }
}
