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


public final class ServiceVclLoggingSftpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingSftpArgs Empty = new ServiceVclLoggingSftpArgs();

    /**
     * The SFTP address to stream logs to
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The SFTP address to stream logs to
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
     * Apache-style string or VCL variables to use for log formatting.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Apache-style string or VCL variables to use for log formatting.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2).
     * 
     */
    @Import(name="formatVersion")
    private @Nullable Output<Integer> formatVersion;

    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2).
     * 
     */
    public Optional<Output<Integer>> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
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
     * The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
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
     * How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
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
     * The port the SFTP service listens on. (Default: `22`)
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port the SFTP service listens on. (Default: `22`)
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
     * The name of the condition to apply.
     * 
     */
    @Import(name="responseCondition")
    private @Nullable Output<String> responseCondition;

    /**
     * @return The name of the condition to apply.
     * 
     */
    public Optional<Output<String>> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }

    /**
     * The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * A list of host keys for all hosts we can connect to over SFTP
     * 
     */
    @Import(name="sshKnownHosts", required=true)
    private Output<String> sshKnownHosts;

    /**
     * @return A list of host keys for all hosts we can connect to over SFTP
     * 
     */
    public Output<String> sshKnownHosts() {
        return this.sshKnownHosts;
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
     * The username for the server
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return The username for the server
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private ServiceVclLoggingSftpArgs() {}

    private ServiceVclLoggingSftpArgs(ServiceVclLoggingSftpArgs $) {
        this.address = $.address;
        this.compressionCodec = $.compressionCodec;
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.gzipLevel = $.gzipLevel;
        this.messageType = $.messageType;
        this.name = $.name;
        this.password = $.password;
        this.path = $.path;
        this.period = $.period;
        this.placement = $.placement;
        this.port = $.port;
        this.processingRegion = $.processingRegion;
        this.publicKey = $.publicKey;
        this.responseCondition = $.responseCondition;
        this.secretKey = $.secretKey;
        this.sshKnownHosts = $.sshKnownHosts;
        this.timestampFormat = $.timestampFormat;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingSftpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingSftpArgs $;

        public Builder() {
            $ = new ServiceVclLoggingSftpArgs();
        }

        public Builder(ServiceVclLoggingSftpArgs defaults) {
            $ = new ServiceVclLoggingSftpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The SFTP address to stream logs to
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The SFTP address to stream logs to
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
         * @param format Apache-style string or VCL variables to use for log formatting.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Apache-style string or VCL variables to use for log formatting.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(@Nullable Output<Integer> formatVersion) {
            $.formatVersion = formatVersion;
            return this;
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(Integer formatVersion) {
            return formatVersion(Output.of(formatVersion));
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
         * @param name The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
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
         * @param period How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
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
         * @param port The port the SFTP service listens on. (Default: `22`)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port the SFTP service listens on. (Default: `22`)
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
         * @param responseCondition The name of the condition to apply.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(@Nullable Output<String> responseCondition) {
            $.responseCondition = responseCondition;
            return this;
        }

        /**
         * @param responseCondition The name of the condition to apply.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(String responseCondition) {
            return responseCondition(Output.of(responseCondition));
        }

        /**
         * @param secretKey The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param sshKnownHosts A list of host keys for all hosts we can connect to over SFTP
         * 
         * @return builder
         * 
         */
        public Builder sshKnownHosts(Output<String> sshKnownHosts) {
            $.sshKnownHosts = sshKnownHosts;
            return this;
        }

        /**
         * @param sshKnownHosts A list of host keys for all hosts we can connect to over SFTP
         * 
         * @return builder
         * 
         */
        public Builder sshKnownHosts(String sshKnownHosts) {
            return sshKnownHosts(Output.of(sshKnownHosts));
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
         * @param user The username for the server
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The username for the server
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ServiceVclLoggingSftpArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingSftpArgs", "address");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingSftpArgs", "name");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingSftpArgs", "path");
            }
            if ($.sshKnownHosts == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingSftpArgs", "sshKnownHosts");
            }
            if ($.user == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingSftpArgs", "user");
            }
            return $;
        }
    }

}
