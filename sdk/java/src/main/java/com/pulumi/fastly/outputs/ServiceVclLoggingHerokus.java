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
public final class ServiceVclLoggingHerokus {
    /**
     * @return Apache-style string or VCL variables to use for log formatting.
     * 
     */
    private @Nullable String format;
    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
     * 
     */
    private @Nullable Integer formatVersion;
    /**
     * @return The unique name of the Heroku logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return Where in the generated VCL the logging call should be placed. Can be `none` or `waf_debug`.
     * 
     */
    private @Nullable String placement;
    /**
     * @return The name of an existing condition in the configured endpoint, or leave blank to always execute.
     * 
     */
    private @Nullable String responseCondition;
    /**
     * @return The token to use for authentication (https://www.heroku.com/docs/customer-token-authentication-token/)
     * 
     */
    private String token;
    /**
     * @return The URL to stream logs to
     * 
     */
    private String url;

    private ServiceVclLoggingHerokus() {}
    /**
     * @return Apache-style string or VCL variables to use for log formatting.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
     * 
     */
    public Optional<Integer> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    /**
     * @return The unique name of the Heroku logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Where in the generated VCL the logging call should be placed. Can be `none` or `waf_debug`.
     * 
     */
    public Optional<String> placement() {
        return Optional.ofNullable(this.placement);
    }
    /**
     * @return The name of an existing condition in the configured endpoint, or leave blank to always execute.
     * 
     */
    public Optional<String> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }
    /**
     * @return The token to use for authentication (https://www.heroku.com/docs/customer-token-authentication-token/)
     * 
     */
    public String token() {
        return this.token;
    }
    /**
     * @return The URL to stream logs to
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceVclLoggingHerokus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String format;
        private @Nullable Integer formatVersion;
        private String name;
        private @Nullable String placement;
        private @Nullable String responseCondition;
        private String token;
        private String url;
        public Builder() {}
        public Builder(ServiceVclLoggingHerokus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.formatVersion = defaults.formatVersion;
    	      this.name = defaults.name;
    	      this.placement = defaults.placement;
    	      this.responseCondition = defaults.responseCondition;
    	      this.token = defaults.token;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder format(@Nullable String format) {

            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder formatVersion(@Nullable Integer formatVersion) {

            this.formatVersion = formatVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingHerokus", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder placement(@Nullable String placement) {

            this.placement = placement;
            return this;
        }
        @CustomType.Setter
        public Builder responseCondition(@Nullable String responseCondition) {

            this.responseCondition = responseCondition;
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingHerokus", "token");
            }
            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingHerokus", "url");
            }
            this.url = url;
            return this;
        }
        public ServiceVclLoggingHerokus build() {
            final var _resultValue = new ServiceVclLoggingHerokus();
            _resultValue.format = format;
            _resultValue.formatVersion = formatVersion;
            _resultValue.name = name;
            _resultValue.placement = placement;
            _resultValue.responseCondition = responseCondition;
            _resultValue.token = token;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}