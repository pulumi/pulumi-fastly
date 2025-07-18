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
public final class ServiceComputeLoggingCloudfile {
    /**
     * @return Your Cloud File account access key
     * 
     */
    private String accessKey;
    /**
     * @return The name of your Cloud Files container
     * 
     */
    private String bucketName;
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    private @Nullable String compressionCodec;
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
     * @return The unique name of the Rackspace Cloud Files logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return The path to upload logs to
     * 
     */
    private @Nullable String path;
    /**
     * @return How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    private @Nullable Integer period;
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    private @Nullable String processingRegion;
    /**
     * @return The PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return The region to stream logs to. One of: DFW (Dallas), ORD (Chicago), IAD (Northern Virginia), LON (London), SYD (Sydney), HKG (Hong Kong)
     * 
     */
    private @Nullable String region;
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    private @Nullable String timestampFormat;
    /**
     * @return The username for your Cloud Files account
     * 
     */
    private String user;

    private ServiceComputeLoggingCloudfile() {}
    /**
     * @return Your Cloud File account access key
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The name of your Cloud Files container
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip_level will default to 3. To specify a different level, leave compression_codec blank and explicitly set the level using gzip_level. Specifying both compression_codec and gzip_level in the same API request will result in an error.
     * 
     */
    public Optional<String> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
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
     * @return The unique name of the Rackspace Cloud Files logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path to upload logs to
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return Region where logs will be processed before streaming to BigQuery. Valid values are &#39;none&#39;, &#39;us&#39; and &#39;eu&#39;.
     * 
     */
    public Optional<String> processingRegion() {
        return Optional.ofNullable(this.processingRegion);
    }
    /**
     * @return The PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The region to stream logs to. One of: DFW (Dallas), ORD (Chicago), IAD (Northern Virginia), LON (London), SYD (Sydney), HKG (Hong Kong)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    public Optional<String> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }
    /**
     * @return The username for your Cloud Files account
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceComputeLoggingCloudfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String bucketName;
        private @Nullable String compressionCodec;
        private @Nullable Integer gzipLevel;
        private @Nullable String messageType;
        private String name;
        private @Nullable String path;
        private @Nullable Integer period;
        private @Nullable String processingRegion;
        private @Nullable String publicKey;
        private @Nullable String region;
        private @Nullable String timestampFormat;
        private String user;
        public Builder() {}
        public Builder(ServiceComputeLoggingCloudfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.gzipLevel = defaults.gzipLevel;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.period = defaults.period;
    	      this.processingRegion = defaults.processingRegion;
    	      this.publicKey = defaults.publicKey;
    	      this.region = defaults.region;
    	      this.timestampFormat = defaults.timestampFormat;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingCloudfile", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            if (bucketName == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingCloudfile", "bucketName");
            }
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder compressionCodec(@Nullable String compressionCodec) {

            this.compressionCodec = compressionCodec;
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
              throw new MissingRequiredPropertyException("ServiceComputeLoggingCloudfile", "name");
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
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder timestampFormat(@Nullable String timestampFormat) {

            this.timestampFormat = timestampFormat;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("ServiceComputeLoggingCloudfile", "user");
            }
            this.user = user;
            return this;
        }
        public ServiceComputeLoggingCloudfile build() {
            final var _resultValue = new ServiceComputeLoggingCloudfile();
            _resultValue.accessKey = accessKey;
            _resultValue.bucketName = bucketName;
            _resultValue.compressionCodec = compressionCodec;
            _resultValue.gzipLevel = gzipLevel;
            _resultValue.messageType = messageType;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.period = period;
            _resultValue.processingRegion = processingRegion;
            _resultValue.publicKey = publicKey;
            _resultValue.region = region;
            _resultValue.timestampFormat = timestampFormat;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
