// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPackageHashArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackageHashArgs Empty = new GetPackageHashArgs();

    /**
     * The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    private GetPackageHashArgs() {}

    private GetPackageHashArgs(GetPackageHashArgs $) {
        this.content = $.content;
        this.filename = $.filename;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackageHashArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackageHashArgs $;

        public Builder() {
            $ = new GetPackageHashArgs();
        }

        public Builder(GetPackageHashArgs defaults) {
            $ = new GetPackageHashArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The contents of the Wasm deployment package as a base64 encoded string (e.g. could be provided using an input variable or via external data source output variable). Conflicts with `filename`. Exactly one of these two arguments must be specified
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param filename The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename The path to the Wasm deployment package within your local filesystem. Conflicts with `content`. Exactly one of these two arguments must be specified
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        public GetPackageHashArgs build() {
            return $;
        }
    }

}
