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


public final class ServiceVclSnippetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclSnippetArgs Empty = new ServiceVclSnippetArgs();

    /**
     * The VCL code that specifies exactly what the snippet does
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The VCL code that specifies exactly what the snippet does
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * A name that is unique across &#34;regular&#34; and &#34;dynamic&#34; VCL Snippet configuration blocks. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A name that is unique across &#34;regular&#34; and &#34;dynamic&#34; VCL Snippet configuration blocks. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Priority determines the ordering for multiple snippets. Lower numbers execute first. Defaults to `100`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority determines the ordering for multiple snippets. Lower numbers execute first. Defaults to `100`
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hash`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`)
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hash`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServiceVclSnippetArgs() {}

    private ServiceVclSnippetArgs(ServiceVclSnippetArgs $) {
        this.content = $.content;
        this.name = $.name;
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclSnippetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclSnippetArgs $;

        public Builder() {
            $ = new ServiceVclSnippetArgs();
        }

        public Builder(ServiceVclSnippetArgs defaults) {
            $ = new ServiceVclSnippetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The VCL code that specifies exactly what the snippet does
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The VCL code that specifies exactly what the snippet does
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param name A name that is unique across &#34;regular&#34; and &#34;dynamic&#34; VCL Snippet configuration blocks. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name that is unique across &#34;regular&#34; and &#34;dynamic&#34; VCL Snippet configuration blocks. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Priority determines the ordering for multiple snippets. Lower numbers execute first. Defaults to `100`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority determines the ordering for multiple snippets. Lower numbers execute first. Defaults to `100`
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param type The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hash`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`)
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The location in generated VCL where the snippet should be placed (can be one of `init`, `recv`, `hash`, `hit`, `miss`, `pass`, `fetch`, `error`, `deliver`, `log` or `none`)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceVclSnippetArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("ServiceVclSnippetArgs", "content");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclSnippetArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ServiceVclSnippetArgs", "type");
            }
            return $;
        }
    }

}
