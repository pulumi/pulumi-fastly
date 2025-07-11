// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclLoggingLogentryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingLogentryArgs Empty = new ServiceVclLoggingLogentryArgs();

    /**
     * Apache-style string or VCL variables to use for log formatting
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Apache-style string or VCL variables to use for log formatting
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2)
     * 
     */
    @Import(name="formatVersion")
    private @Nullable Output<Integer> formatVersion;

    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2)
     * 
     */
    public Optional<Output<Integer>> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }

    /**
     * The unique name of the Logentries logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the Logentries logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Where in the generated VCL the logging call should be placed.
     * 
     */
    @Import(name="placement")
    private @Nullable Output<String> placement;

    /**
     * @return Where in the generated VCL the logging call should be placed.
     * 
     */
    public Optional<Output<String>> placement() {
        return Optional.ofNullable(this.placement);
    }

    /**
     * The port number configured in Logentries
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number configured in Logentries
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    @Import(name="processingRegion")
    private @Nullable Output<String> processingRegion;

    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    public Optional<Output<String>> processingRegion() {
        return Optional.ofNullable(this.processingRegion);
    }

    /**
     * Name of blockAttributes condition to apply this logging.
     * 
     */
    @Import(name="responseCondition")
    private @Nullable Output<String> responseCondition;

    /**
     * @return Name of blockAttributes condition to apply this logging.
     * 
     */
    public Optional<Output<String>> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }

    /**
     * Use token based authentication (https://logentries.com/doc/input-token/)
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return Use token based authentication (https://logentries.com/doc/input-token/)
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     * Whether to use TLS for secure logging
     * 
     */
    @Import(name="useTls")
    private @Nullable Output<Boolean> useTls;

    /**
     * @return Whether to use TLS for secure logging
     * 
     */
    public Optional<Output<Boolean>> useTls() {
        return Optional.ofNullable(this.useTls);
    }

    private ServiceVclLoggingLogentryArgs() {}

    private ServiceVclLoggingLogentryArgs(ServiceVclLoggingLogentryArgs $) {
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.name = $.name;
        this.placement = $.placement;
        this.port = $.port;
        this.processingRegion = $.processingRegion;
        this.responseCondition = $.responseCondition;
        this.token = $.token;
        this.useTls = $.useTls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingLogentryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingLogentryArgs $;

        public Builder() {
            $ = new ServiceVclLoggingLogentryArgs();
        }

        public Builder(ServiceVclLoggingLogentryArgs defaults) {
            $ = new ServiceVclLoggingLogentryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Apache-style string or VCL variables to use for log formatting
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Apache-style string or VCL variables to use for log formatting
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2)
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(@Nullable Output<Integer> formatVersion) {
            $.formatVersion = formatVersion;
            return this;
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2)
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(Integer formatVersion) {
            return formatVersion(Output.of(formatVersion));
        }

        /**
         * @param name The unique name of the Logentries logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the Logentries logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed.
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<String> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed.
         * 
         * @return builder
         * 
         */
        public Builder placement(String placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param port The port number configured in Logentries
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number configured in Logentries
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param processingRegion Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
         * 
         * @return builder
         * 
         */
        public Builder processingRegion(@Nullable Output<String> processingRegion) {
            $.processingRegion = processingRegion;
            return this;
        }

        /**
         * @param processingRegion Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
         * 
         * @return builder
         * 
         */
        public Builder processingRegion(String processingRegion) {
            return processingRegion(Output.of(processingRegion));
        }

        /**
         * @param responseCondition Name of blockAttributes condition to apply this logging.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(@Nullable Output<String> responseCondition) {
            $.responseCondition = responseCondition;
            return this;
        }

        /**
         * @param responseCondition Name of blockAttributes condition to apply this logging.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(String responseCondition) {
            return responseCondition(Output.of(responseCondition));
        }

        /**
         * @param token Use token based authentication (https://logentries.com/doc/input-token/)
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Use token based authentication (https://logentries.com/doc/input-token/)
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param useTls Whether to use TLS for secure logging
         * 
         * @return builder
         * 
         */
        public Builder useTls(@Nullable Output<Boolean> useTls) {
            $.useTls = useTls;
            return this;
        }

        /**
         * @param useTls Whether to use TLS for secure logging
         * 
         * @return builder
         * 
         */
        public Builder useTls(Boolean useTls) {
            return useTls(Output.of(useTls));
        }

        public ServiceVclLoggingLogentryArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingLogentryArgs", "name");
            }
            if ($.token == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingLogentryArgs", "token");
            }
            return $;
        }
    }

}
