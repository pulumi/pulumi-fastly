// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceComputeLoggingSftp {
    /**
     * @return The SFTP address to stream logs to
     * 
     */
    private String address;
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
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
     * @return The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    private @Nullable String password;
    /**
     * @return The path to upload log files to. If the path ends in `/` then it is treated as a directory
     * 
     */
    private String path;
    /**
     * @return How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    private @Nullable Integer period;
    /**
     * @return The port the SFTP service listens on. (Default: `22`)
     * 
     */
    private @Nullable Integer port;
    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return A list of host keys for all hosts we can connect to over SFTP
     * 
     */
    private String sshKnownHosts;
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    private @Nullable String timestampFormat;
    /**
     * @return The username for the server
     * 
     */
    private String user;

    private ServiceComputeLoggingSftp() {}
    /**
     * @return The SFTP address to stream logs to
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
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
     * @return The unique name of the SFTP logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The password for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The path to upload log files to. If the path ends in `/` then it is treated as a directory
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return How frequently log files are finalized so they can be available for reading (in seconds, default `3600`)
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return The port the SFTP service listens on. (Default: `22`)
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The SSH private key for the server. If both `password` and `secret_key` are passed, `secret_key` will be preferred
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return A list of host keys for all hosts we can connect to over SFTP
     * 
     */
    public String sshKnownHosts() {
        return this.sshKnownHosts;
    }
    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    public Optional<String> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }
    /**
     * @return The username for the server
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceComputeLoggingSftp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String compressionCodec;
        private @Nullable Integer gzipLevel;
        private @Nullable String messageType;
        private String name;
        private @Nullable String password;
        private String path;
        private @Nullable Integer period;
        private @Nullable Integer port;
        private @Nullable String publicKey;
        private @Nullable String secretKey;
        private String sshKnownHosts;
        private @Nullable String timestampFormat;
        private String user;
        public Builder() {}
        public Builder(ServiceComputeLoggingSftp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.gzipLevel = defaults.gzipLevel;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.path = defaults.path;
    	      this.period = defaults.period;
    	      this.port = defaults.port;
    	      this.publicKey = defaults.publicKey;
    	      this.secretKey = defaults.secretKey;
    	      this.sshKnownHosts = defaults.sshKnownHosts;
    	      this.timestampFormat = defaults.timestampFormat;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
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
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder sshKnownHosts(String sshKnownHosts) {
            this.sshKnownHosts = Objects.requireNonNull(sshKnownHosts);
            return this;
        }
        @CustomType.Setter
        public Builder timestampFormat(@Nullable String timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public ServiceComputeLoggingSftp build() {
            final var o = new ServiceComputeLoggingSftp();
            o.address = address;
            o.compressionCodec = compressionCodec;
            o.gzipLevel = gzipLevel;
            o.messageType = messageType;
            o.name = name;
            o.password = password;
            o.path = path;
            o.period = period;
            o.port = port;
            o.publicKey = publicKey;
            o.secretKey = secretKey;
            o.sshKnownHosts = sshKnownHosts;
            o.timestampFormat = timestampFormat;
            o.user = user;
            return o;
        }
    }
}