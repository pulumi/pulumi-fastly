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


public final class ServiceComputeLoggingFtpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceComputeLoggingFtpArgs Empty = new ServiceComputeLoggingFtpArgs();

    /**
     * The FTP address to stream logs to
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The FTP address to stream logs to
     * 
     */
    public Output<String> address() {
        return this.address;
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
     * The unique name of the FTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the FTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The password for the server (for anonymous use an email address)
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password for the server (for anonymous use an email address)
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The path to upload log files to. If the path ends in `/` then it is treated as a directory
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path to upload log files to. If the path ends in `/` then it is treated as a directory
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * How frequently the logs should be transferred, in seconds (Default `3600`)
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return How frequently the logs should be transferred, in seconds (Default `3600`)
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The port number. Default: `21`
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number. Default: `21`
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
     * The PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
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

    /**
     * The username for the server (can be `anonymous`)
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return The username for the server (can be `anonymous`)
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private ServiceComputeLoggingFtpArgs() {}

    private ServiceComputeLoggingFtpArgs(ServiceComputeLoggingFtpArgs $) {
        this.address = $.address;
        this.compressionCodec = $.compressionCodec;
        this.gzipLevel = $.gzipLevel;
        this.messageType = $.messageType;
        this.name = $.name;
        this.password = $.password;
        this.path = $.path;
        this.period = $.period;
        this.port = $.port;
        this.processingRegion = $.processingRegion;
        this.publicKey = $.publicKey;
        this.timestampFormat = $.timestampFormat;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceComputeLoggingFtpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceComputeLoggingFtpArgs $;

        public Builder() {
            $ = new ServiceComputeLoggingFtpArgs();
        }

        public Builder(ServiceComputeLoggingFtpArgs defaults) {
            $ = new ServiceComputeLoggingFtpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The FTP address to stream logs to
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The FTP address to stream logs to
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
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
         * @param name The unique name of the FTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the FTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the server (for anonymous use an email address)
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the server (for anonymous use an email address)
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param path The path to upload log files to. If the path ends in `/` then it is treated as a directory
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to upload log files to. If the path ends in `/` then it is treated as a directory
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param period How frequently the logs should be transferred, in seconds (Default `3600`)
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How frequently the logs should be transferred, in seconds (Default `3600`)
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param port The port number. Default: `21`
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number. Default: `21`
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
         * @param publicKey The PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
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

        /**
         * @param user The username for the server (can be `anonymous`)
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The username for the server (can be `anonymous`)
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ServiceComputeLoggingFtpArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingFtpArgs", "address");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingFtpArgs", "name");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingFtpArgs", "password");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingFtpArgs", "path");
            }
            if ($.user == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingFtpArgs", "user");
            }
            return $;
        }
    }

}
