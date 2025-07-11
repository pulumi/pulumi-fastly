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


public final class ServiceComputeLoggingBlobstorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceComputeLoggingBlobstorageArgs Empty = new ServiceComputeLoggingBlobstorageArgs();

    /**
     * The unique Azure Blob Storage namespace in which your data objects are stored
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The unique Azure Blob Storage namespace in which your data objects are stored
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    @Import(name="compressionCodec")
    private @Nullable Output<String> compressionCodec;

    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    public Optional<Output<String>> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }

    /**
     * The name of the Azure Blob Storage container in which to store logs
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return The name of the Azure Blob Storage container in which to store logs
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * Maximum size of an uploaded log file, if non-zero.
     * 
     */
    @Import(name="fileMaxBytes")
    private @Nullable Output<Integer> fileMaxBytes;

    /**
     * @return Maximum size of an uploaded log file, if non-zero.
     * 
     */
    public Optional<Output<Integer>> fileMaxBytes() {
        return Optional.ofNullable(this.fileMaxBytes);
    }

    /**
     * Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    @Import(name="gzipLevel")
    private @Nullable Output<Integer> gzipLevel;

    /**
     * @return Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    public Optional<Output<Integer>> gzipLevel() {
        return Optional.ofNullable(this.gzipLevel);
    }

    /**
     * How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    @Import(name="messageType")
    private @Nullable Output<String> messageType;

    /**
     * @return How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    public Optional<Output<String>> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    /**
     * A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * How frequently the logs should be transferred in seconds. Default `3600`
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return How frequently the logs should be transferred in seconds. Default `3600`
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
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
     * A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
     * 
     */
    @Import(name="sasToken", required=true)
    private Output<String> sasToken;

    /**
     * @return The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
     * 
     */
    public Output<String> sasToken() {
        return this.sasToken;
    }

    /**
     * The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Output<String> timestampFormat;

    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    public Optional<Output<String>> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    private ServiceComputeLoggingBlobstorageArgs() {}

    private ServiceComputeLoggingBlobstorageArgs(ServiceComputeLoggingBlobstorageArgs $) {
        this.accountName = $.accountName;
        this.compressionCodec = $.compressionCodec;
        this.container = $.container;
        this.fileMaxBytes = $.fileMaxBytes;
        this.gzipLevel = $.gzipLevel;
        this.messageType = $.messageType;
        this.name = $.name;
        this.path = $.path;
        this.period = $.period;
        this.processingRegion = $.processingRegion;
        this.publicKey = $.publicKey;
        this.sasToken = $.sasToken;
        this.timestampFormat = $.timestampFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceComputeLoggingBlobstorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceComputeLoggingBlobstorageArgs $;

        public Builder() {
            $ = new ServiceComputeLoggingBlobstorageArgs();
        }

        public Builder(ServiceComputeLoggingBlobstorageArgs defaults) {
            $ = new ServiceComputeLoggingBlobstorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The unique Azure Blob Storage namespace in which your data objects are stored
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The unique Azure Blob Storage namespace in which your data objects are stored
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(@Nullable Output<String> compressionCodec) {
            $.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(String compressionCodec) {
            return compressionCodec(Output.of(compressionCodec));
        }

        /**
         * @param container The name of the Azure Blob Storage container in which to store logs
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The name of the Azure Blob Storage container in which to store logs
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param fileMaxBytes Maximum size of an uploaded log file, if non-zero.
         * 
         * @return builder
         * 
         */
        public Builder fileMaxBytes(@Nullable Output<Integer> fileMaxBytes) {
            $.fileMaxBytes = fileMaxBytes;
            return this;
        }

        /**
         * @param fileMaxBytes Maximum size of an uploaded log file, if non-zero.
         * 
         * @return builder
         * 
         */
        public Builder fileMaxBytes(Integer fileMaxBytes) {
            return fileMaxBytes(Output.of(fileMaxBytes));
        }

        /**
         * @param gzipLevel Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder gzipLevel(@Nullable Output<Integer> gzipLevel) {
            $.gzipLevel = gzipLevel;
            return this;
        }

        /**
         * @param gzipLevel Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder gzipLevel(Integer gzipLevel) {
            return gzipLevel(Output.of(gzipLevel));
        }

        /**
         * @param messageType How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
         * 
         * @return builder
         * 
         */
        public Builder messageType(@Nullable Output<String> messageType) {
            $.messageType = messageType;
            return this;
        }

        /**
         * @param messageType How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
         * 
         * @return builder
         * 
         */
        public Builder messageType(String messageType) {
            return messageType(Output.of(messageType));
        }

        /**
         * @param name A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param period How frequently the logs should be transferred in seconds. Default `3600`
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How frequently the logs should be transferred in seconds. Default `3600`
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
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
         * @param publicKey A PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey A PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param sasToken The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
         * 
         * @return builder
         * 
         */
        public Builder sasToken(Output<String> sasToken) {
            $.sasToken = sasToken;
            return this;
        }

        /**
         * @param sasToken The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
         * 
         * @return builder
         * 
         */
        public Builder sasToken(String sasToken) {
            return sasToken(Output.of(sasToken));
        }

        /**
         * @param timestampFormat The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Output<String> timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param timestampFormat The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(String timestampFormat) {
            return timestampFormat(Output.of(timestampFormat));
        }

        public ServiceComputeLoggingBlobstorageArgs build() {
            if ($.accountName == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingBlobstorageArgs", "accountName");
            }
            if ($.container == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingBlobstorageArgs", "container");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingBlobstorageArgs", "name");
            }
            if ($.sasToken == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingBlobstorageArgs", "sasToken");
            }
            return $;
        }
    }

}
