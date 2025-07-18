// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclLoggingHoneycombArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingHoneycombArgs Empty = new ServiceVclLoggingHoneycombArgs();

    /**
     * The Honeycomb Dataset you want to log to
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return The Honeycomb Dataset you want to log to
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    /**
     * Apache style log formatting. Your log must produce valid JSON that Honeycomb can ingest.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Apache style log formatting. Your log must produce valid JSON that Honeycomb can ingest.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
     * 
     */
    @Import(name="formatVersion")
    private @Nullable Output<Integer> formatVersion;

    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
     * 
     */
    public Optional<Output<Integer>> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }

    /**
     * The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Where in the generated VCL the logging call should be placed. Can be `none` or `none`.
     * 
     */
    @Import(name="placement")
    private @Nullable Output<String> placement;

    /**
     * @return Where in the generated VCL the logging call should be placed. Can be `none` or `none`.
     * 
     */
    public Optional<Output<String>> placement() {
        return Optional.ofNullable(this.placement);
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
     * The name of an existing condition in the configured endpoint, or leave blank to always execute.
     * 
     */
    @Import(name="responseCondition")
    private @Nullable Output<String> responseCondition;

    /**
     * @return The name of an existing condition in the configured endpoint, or leave blank to always execute.
     * 
     */
    public Optional<Output<String>> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }

    /**
     * The Write Key from the Account page of your Honeycomb account
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return The Write Key from the Account page of your Honeycomb account
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    private ServiceVclLoggingHoneycombArgs() {}

    private ServiceVclLoggingHoneycombArgs(ServiceVclLoggingHoneycombArgs $) {
        this.dataset = $.dataset;
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.name = $.name;
        this.placement = $.placement;
        this.processingRegion = $.processingRegion;
        this.responseCondition = $.responseCondition;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingHoneycombArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingHoneycombArgs $;

        public Builder() {
            $ = new ServiceVclLoggingHoneycombArgs();
        }

        public Builder(ServiceVclLoggingHoneycombArgs defaults) {
            $ = new ServiceVclLoggingHoneycombArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset The Honeycomb Dataset you want to log to
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset The Honeycomb Dataset you want to log to
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param format Apache style log formatting. Your log must produce valid JSON that Honeycomb can ingest.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Apache style log formatting. Your log must produce valid JSON that Honeycomb can ingest.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(@Nullable Output<Integer> formatVersion) {
            $.formatVersion = formatVersion;
            return this;
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either `1` or `2`. (default: `2`).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(Integer formatVersion) {
            return formatVersion(Output.of(formatVersion));
        }

        /**
         * @param name The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the Honeycomb logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed. Can be `none` or `none`.
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<String> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed. Can be `none` or `none`.
         * 
         * @return builder
         * 
         */
        public Builder placement(String placement) {
            return placement(Output.of(placement));
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
         * @param responseCondition The name of an existing condition in the configured endpoint, or leave blank to always execute.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(@Nullable Output<String> responseCondition) {
            $.responseCondition = responseCondition;
            return this;
        }

        /**
         * @param responseCondition The name of an existing condition in the configured endpoint, or leave blank to always execute.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(String responseCondition) {
            return responseCondition(Output.of(responseCondition));
        }

        /**
         * @param token The Write Key from the Account page of your Honeycomb account
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The Write Key from the Account page of your Honeycomb account
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ServiceVclLoggingHoneycombArgs build() {
            if ($.dataset == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingHoneycombArgs", "dataset");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingHoneycombArgs", "name");
            }
            if ($.token == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingHoneycombArgs", "token");
            }
            return $;
        }
    }

}
