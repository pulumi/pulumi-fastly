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
public final class ServiceVclLoggingBlobstorage {
    /**
     * @return The unique Azure Blob Storage namespace in which your data objects are stored
     * 
     */
    private String accountName;
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    private @Nullable String compressionCodec;
    /**
     * @return The name of the Azure Blob Storage container in which to store logs
     * 
     */
    private String container;
    /**
     * @return Maximum size of an uploaded log file, if non-zero.
     * 
     */
    private @Nullable Integer fileMaxBytes;
    /**
     * @return Apache-style string or VCL variables to use for log formatting (default: `%h %l %u %t &#34;%r&#34; %&gt;s %b`)
     * 
     */
    private @Nullable String format;
    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
     * 
     */
    private @Nullable Integer formatVersion;
    /**
     * @return Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    private @Nullable Integer gzipLevel;
    /**
     * @return How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    private @Nullable String messageType;
    /**
     * @return A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
     * 
     */
    private @Nullable String path;
    /**
     * @return How frequently the logs should be transferred in seconds. Default `3600`
     * 
     */
    private @Nullable Integer period;
    /**
     * @return Where in the generated VCL the logging call should be placed
     * 
     */
    private @Nullable String placement;
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    private @Nullable String processingRegion;
    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return The name of the condition to apply
     * 
     */
    private @Nullable String responseCondition;
    /**
     * @return The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
     * 
     */
    private String sasToken;
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    private @Nullable String timestampFormat;

    private ServiceVclLoggingBlobstorage() {}
    /**
     * @return The unique Azure Blob Storage namespace in which your data objects are stored
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    public Optional<String> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }
    /**
     * @return The name of the Azure Blob Storage container in which to store logs
     * 
     */
    public String container() {
        return this.container;
    }
    /**
     * @return Maximum size of an uploaded log file, if non-zero.
     * 
     */
    public Optional<Integer> fileMaxBytes() {
        return Optional.ofNullable(this.fileMaxBytes);
    }
    /**
     * @return Apache-style string or VCL variables to use for log formatting (default: `%h %l %u %t &#34;%r&#34; %&gt;s %b`)
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
     * 
     */
    public Optional<Integer> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    /**
     * @return Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    public Optional<Integer> gzipLevel() {
        return Optional.ofNullable(this.gzipLevel);
    }
    /**
     * @return How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    public Optional<String> messageType() {
        return Optional.ofNullable(this.messageType);
    }
    /**
     * @return A unique name to identify the Azure Blob Storage endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path to upload logs to. Must end with a trailing slash. If this field is left empty, the files will be saved in the container&#39;s root path
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return How frequently the logs should be transferred in seconds. Default `3600`
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return Where in the generated VCL the logging call should be placed
     * 
     */
    public Optional<String> placement() {
        return Optional.ofNullable(this.placement);
    }
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    public Optional<String> processingRegion() {
        return Optional.ofNullable(this.processingRegion);
    }
    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The name of the condition to apply
     * 
     */
    public Optional<String> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }
    /**
     * @return The Azure shared access signature providing write access to the blob service objects. Be sure to update your token before it expires or the logging functionality will not work
     * 
     */
    public String sasToken() {
        return this.sasToken;
    }
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    public Optional<String> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceVclLoggingBlobstorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private @Nullable String compressionCodec;
        private String container;
        private @Nullable Integer fileMaxBytes;
        private @Nullable String format;
        private @Nullable Integer formatVersion;
        private @Nullable Integer gzipLevel;
        private @Nullable String messageType;
        private String name;
        private @Nullable String path;
        private @Nullable Integer period;
        private @Nullable String placement;
        private @Nullable String processingRegion;
        private @Nullable String publicKey;
        private @Nullable String responseCondition;
        private String sasToken;
        private @Nullable String timestampFormat;
        public Builder() {}
        public Builder(ServiceVclLoggingBlobstorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.container = defaults.container;
    	      this.fileMaxBytes = defaults.fileMaxBytes;
    	      this.format = defaults.format;
    	      this.formatVersion = defaults.formatVersion;
    	      this.gzipLevel = defaults.gzipLevel;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.period = defaults.period;
    	      this.placement = defaults.placement;
    	      this.processingRegion = defaults.processingRegion;
    	      this.publicKey = defaults.publicKey;
    	      this.responseCondition = defaults.responseCondition;
    	      this.sasToken = defaults.sasToken;
    	      this.timestampFormat = defaults.timestampFormat;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            if (accountName == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingBlobstorage", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder compressionCodec(@Nullable String compressionCodec) {

            this.compressionCodec = compressionCodec;
            return this;
        }
        @CustomType.Setter
        public Builder container(String container) {
            if (container == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingBlobstorage", "container");
            }
            this.container = container;
            return this;
        }
        @CustomType.Setter
        public Builder fileMaxBytes(@Nullable Integer fileMaxBytes) {

            this.fileMaxBytes = fileMaxBytes;
            return this;
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
        public Builder gzipLevel(@Nullable Integer gzipLevel) {

            this.gzipLevel = gzipLevel;
            return this;
        }
        @CustomType.Setter
        public Builder messageType(@Nullable String messageType) {

            this.messageType = messageType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingBlobstorage", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {

            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder placement(@Nullable String placement) {

            this.placement = placement;
            return this;
        }
        @CustomType.Setter
        public Builder processingRegion(@Nullable String processingRegion) {

            this.processingRegion = processingRegion;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {

            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder responseCondition(@Nullable String responseCondition) {

            this.responseCondition = responseCondition;
            return this;
        }
        @CustomType.Setter
        public Builder sasToken(String sasToken) {
            if (sasToken == null) {
              throw new MissingRequiredPropertyException("ServiceVclLoggingBlobstorage", "sasToken");
            }
            this.sasToken = sasToken;
            return this;
        }
        @CustomType.Setter
        public Builder timestampFormat(@Nullable String timestampFormat) {

            this.timestampFormat = timestampFormat;
            return this;
        }
        public ServiceVclLoggingBlobstorage build() {
            final var _resultValue = new ServiceVclLoggingBlobstorage();
            _resultValue.accountName = accountName;
            _resultValue.compressionCodec = compressionCodec;
            _resultValue.container = container;
            _resultValue.fileMaxBytes = fileMaxBytes;
            _resultValue.format = format;
            _resultValue.formatVersion = formatVersion;
            _resultValue.gzipLevel = gzipLevel;
            _resultValue.messageType = messageType;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.period = period;
            _resultValue.placement = placement;
            _resultValue.processingRegion = processingRegion;
            _resultValue.publicKey = publicKey;
            _resultValue.responseCondition = responseCondition;
            _resultValue.sasToken = sasToken;
            _resultValue.timestampFormat = timestampFormat;
            return _resultValue;
        }
    }
}
