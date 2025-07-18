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


public final class ServiceVclLoggingKafkaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingKafkaArgs Empty = new ServiceVclLoggingKafkaArgs();

    /**
     * SASL authentication method. One of: plain, scram-sha-256, scram-sha-512
     * 
     */
    @Import(name="authMethod")
    private @Nullable Output<String> authMethod;

    /**
     * @return SASL authentication method. One of: plain, scram-sha-256, scram-sha-512
     * 
     */
    public Optional<Output<String>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    /**
     * A comma-separated list of IP addresses or hostnames of Kafka brokers
     * 
     */
    @Import(name="brokers", required=true)
    private Output<String> brokers;

    /**
     * @return A comma-separated list of IP addresses or hostnames of Kafka brokers
     * 
     */
    public Output<String> brokers() {
        return this.brokers;
    }

    /**
     * The codec used for compression of your logs. One of: `gzip`, `snappy`, `lz4`
     * 
     */
    @Import(name="compressionCodec")
    private @Nullable Output<String> compressionCodec;

    /**
     * @return The codec used for compression of your logs. One of: `gzip`, `snappy`, `lz4`
     * 
     */
    public Optional<Output<String>> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }

    /**
     * Apache style log formatting.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Apache style log formatting.
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
     * The unique name of the Kafka logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the Kafka logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Enables parsing of key=value tuples from the beginning of a logline, turning them into record headers
     * 
     */
    @Import(name="parseLogKeyvals")
    private @Nullable Output<Boolean> parseLogKeyvals;

    /**
     * @return Enables parsing of key=value tuples from the beginning of a logline, turning them into record headers
     * 
     */
    public Optional<Output<Boolean>> parseLogKeyvals() {
        return Optional.ofNullable(this.parseLogKeyvals);
    }

    /**
     * SASL Pass
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return SASL Pass
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
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
     * Maximum size of log batch, if non-zero. Defaults to 0 for unbounded
     * 
     */
    @Import(name="requestMaxBytes")
    private @Nullable Output<Integer> requestMaxBytes;

    /**
     * @return Maximum size of log batch, if non-zero. Defaults to 0 for unbounded
     * 
     */
    public Optional<Output<Integer>> requestMaxBytes() {
        return Optional.ofNullable(this.requestMaxBytes);
    }

    /**
     * The Number of acknowledgements a leader must receive before a write is considered successful. One of: `1` (default) One server needs to respond. `0` No servers need to respond. `-1` Wait for all in-sync replicas to respond
     * 
     */
    @Import(name="requiredAcks")
    private @Nullable Output<String> requiredAcks;

    /**
     * @return The Number of acknowledgements a leader must receive before a write is considered successful. One of: `1` (default) One server needs to respond. `0` No servers need to respond. `-1` Wait for all in-sync replicas to respond
     * 
     */
    public Optional<Output<String>> requiredAcks() {
        return Optional.ofNullable(this.requiredAcks);
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
     * A secure certificate to authenticate the server with. Must be in PEM format
     * 
     */
    @Import(name="tlsCaCert")
    private @Nullable Output<String> tlsCaCert;

    /**
     * @return A secure certificate to authenticate the server with. Must be in PEM format
     * 
     */
    public Optional<Output<String>> tlsCaCert() {
        return Optional.ofNullable(this.tlsCaCert);
    }

    /**
     * The client certificate used to make authenticated requests. Must be in PEM format
     * 
     */
    @Import(name="tlsClientCert")
    private @Nullable Output<String> tlsClientCert;

    /**
     * @return The client certificate used to make authenticated requests. Must be in PEM format
     * 
     */
    public Optional<Output<String>> tlsClientCert() {
        return Optional.ofNullable(this.tlsClientCert);
    }

    /**
     * The client private key used to make authenticated requests. Must be in PEM format
     * 
     */
    @Import(name="tlsClientKey")
    private @Nullable Output<String> tlsClientKey;

    /**
     * @return The client private key used to make authenticated requests. Must be in PEM format
     * 
     */
    public Optional<Output<String>> tlsClientKey() {
        return Optional.ofNullable(this.tlsClientKey);
    }

    /**
     * The hostname used to verify the server&#39;s certificate. It can either be the Common Name or a Subject Alternative Name (SAN)
     * 
     */
    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    /**
     * @return The hostname used to verify the server&#39;s certificate. It can either be the Common Name or a Subject Alternative Name (SAN)
     * 
     */
    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    /**
     * The Kafka topic to send logs to
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return The Kafka topic to send logs to
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     * Whether to use TLS for secure logging. Can be either `true` or `false`
     * 
     */
    @Import(name="useTls")
    private @Nullable Output<Boolean> useTls;

    /**
     * @return Whether to use TLS for secure logging. Can be either `true` or `false`
     * 
     */
    public Optional<Output<Boolean>> useTls() {
        return Optional.ofNullable(this.useTls);
    }

    /**
     * SASL User
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return SASL User
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private ServiceVclLoggingKafkaArgs() {}

    private ServiceVclLoggingKafkaArgs(ServiceVclLoggingKafkaArgs $) {
        this.authMethod = $.authMethod;
        this.brokers = $.brokers;
        this.compressionCodec = $.compressionCodec;
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.name = $.name;
        this.parseLogKeyvals = $.parseLogKeyvals;
        this.password = $.password;
        this.placement = $.placement;
        this.processingRegion = $.processingRegion;
        this.requestMaxBytes = $.requestMaxBytes;
        this.requiredAcks = $.requiredAcks;
        this.responseCondition = $.responseCondition;
        this.tlsCaCert = $.tlsCaCert;
        this.tlsClientCert = $.tlsClientCert;
        this.tlsClientKey = $.tlsClientKey;
        this.tlsHostname = $.tlsHostname;
        this.topic = $.topic;
        this.useTls = $.useTls;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingKafkaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingKafkaArgs $;

        public Builder() {
            $ = new ServiceVclLoggingKafkaArgs();
        }

        public Builder(ServiceVclLoggingKafkaArgs defaults) {
            $ = new ServiceVclLoggingKafkaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authMethod SASL authentication method. One of: plain, scram-sha-256, scram-sha-512
         * 
         * @return builder
         * 
         */
        public Builder authMethod(@Nullable Output<String> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        /**
         * @param authMethod SASL authentication method. One of: plain, scram-sha-256, scram-sha-512
         * 
         * @return builder
         * 
         */
        public Builder authMethod(String authMethod) {
            return authMethod(Output.of(authMethod));
        }

        /**
         * @param brokers A comma-separated list of IP addresses or hostnames of Kafka brokers
         * 
         * @return builder
         * 
         */
        public Builder brokers(Output<String> brokers) {
            $.brokers = brokers;
            return this;
        }

        /**
         * @param brokers A comma-separated list of IP addresses or hostnames of Kafka brokers
         * 
         * @return builder
         * 
         */
        public Builder brokers(String brokers) {
            return brokers(Output.of(brokers));
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. One of: `gzip`, `snappy`, `lz4`
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(@Nullable Output<String> compressionCodec) {
            $.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. One of: `gzip`, `snappy`, `lz4`
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(String compressionCodec) {
            return compressionCodec(Output.of(compressionCodec));
        }

        /**
         * @param format Apache style log formatting.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Apache style log formatting.
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
         * @param name The unique name of the Kafka logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the Kafka logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parseLogKeyvals Enables parsing of key=value tuples from the beginning of a logline, turning them into record headers
         * 
         * @return builder
         * 
         */
        public Builder parseLogKeyvals(@Nullable Output<Boolean> parseLogKeyvals) {
            $.parseLogKeyvals = parseLogKeyvals;
            return this;
        }

        /**
         * @param parseLogKeyvals Enables parsing of key=value tuples from the beginning of a logline, turning them into record headers
         * 
         * @return builder
         * 
         */
        public Builder parseLogKeyvals(Boolean parseLogKeyvals) {
            return parseLogKeyvals(Output.of(parseLogKeyvals));
        }

        /**
         * @param password SASL Pass
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password SASL Pass
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
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
         * @param requestMaxBytes Maximum size of log batch, if non-zero. Defaults to 0 for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(@Nullable Output<Integer> requestMaxBytes) {
            $.requestMaxBytes = requestMaxBytes;
            return this;
        }

        /**
         * @param requestMaxBytes Maximum size of log batch, if non-zero. Defaults to 0 for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(Integer requestMaxBytes) {
            return requestMaxBytes(Output.of(requestMaxBytes));
        }

        /**
         * @param requiredAcks The Number of acknowledgements a leader must receive before a write is considered successful. One of: `1` (default) One server needs to respond. `0` No servers need to respond. `-1` Wait for all in-sync replicas to respond
         * 
         * @return builder
         * 
         */
        public Builder requiredAcks(@Nullable Output<String> requiredAcks) {
            $.requiredAcks = requiredAcks;
            return this;
        }

        /**
         * @param requiredAcks The Number of acknowledgements a leader must receive before a write is considered successful. One of: `1` (default) One server needs to respond. `0` No servers need to respond. `-1` Wait for all in-sync replicas to respond
         * 
         * @return builder
         * 
         */
        public Builder requiredAcks(String requiredAcks) {
            return requiredAcks(Output.of(requiredAcks));
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
         * @param tlsCaCert A secure certificate to authenticate the server with. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsCaCert(@Nullable Output<String> tlsCaCert) {
            $.tlsCaCert = tlsCaCert;
            return this;
        }

        /**
         * @param tlsCaCert A secure certificate to authenticate the server with. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsCaCert(String tlsCaCert) {
            return tlsCaCert(Output.of(tlsCaCert));
        }

        /**
         * @param tlsClientCert The client certificate used to make authenticated requests. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCert(@Nullable Output<String> tlsClientCert) {
            $.tlsClientCert = tlsClientCert;
            return this;
        }

        /**
         * @param tlsClientCert The client certificate used to make authenticated requests. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsClientCert(String tlsClientCert) {
            return tlsClientCert(Output.of(tlsClientCert));
        }

        /**
         * @param tlsClientKey The client private key used to make authenticated requests. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsClientKey(@Nullable Output<String> tlsClientKey) {
            $.tlsClientKey = tlsClientKey;
            return this;
        }

        /**
         * @param tlsClientKey The client private key used to make authenticated requests. Must be in PEM format
         * 
         * @return builder
         * 
         */
        public Builder tlsClientKey(String tlsClientKey) {
            return tlsClientKey(Output.of(tlsClientKey));
        }

        /**
         * @param tlsHostname The hostname used to verify the server&#39;s certificate. It can either be the Common Name or a Subject Alternative Name (SAN)
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        /**
         * @param tlsHostname The hostname used to verify the server&#39;s certificate. It can either be the Common Name or a Subject Alternative Name (SAN)
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        /**
         * @param topic The Kafka topic to send logs to
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The Kafka topic to send logs to
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        /**
         * @param useTls Whether to use TLS for secure logging. Can be either `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder useTls(@Nullable Output<Boolean> useTls) {
            $.useTls = useTls;
            return this;
        }

        /**
         * @param useTls Whether to use TLS for secure logging. Can be either `true` or `false`
         * 
         * @return builder
         * 
         */
        public Builder useTls(Boolean useTls) {
            return useTls(Output.of(useTls));
        }

        /**
         * @param user SASL User
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user SASL User
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ServiceVclLoggingKafkaArgs build() {
            if ($.brokers == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingKafkaArgs", "brokers");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingKafkaArgs", "name");
            }
            if ($.topic == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingKafkaArgs", "topic");
            }
            return $;
        }
    }

}
