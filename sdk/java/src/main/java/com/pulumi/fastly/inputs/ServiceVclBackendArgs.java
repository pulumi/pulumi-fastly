// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclBackendArgs Empty = new ServiceVclBackendArgs();

    /**
     * An IPv4, hostname, or IPv6 address for the Backend
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return An IPv4, hostname, or IPv6 address for the Backend
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * Denotes if this Backend should be included in the pool of backends that requests are load balanced against. Default `false`
     * 
     */
    @Import(name="autoLoadbalance")
    private @Nullable Output<Boolean> autoLoadbalance;

    /**
     * @return Denotes if this Backend should be included in the pool of backends that requests are load balanced against. Default `false`
     * 
     */
    public Optional<Output<Boolean>> autoLoadbalance() {
        return Optional.ofNullable(this.autoLoadbalance);
    }

    /**
     * How long to wait between bytes in milliseconds. Default `10000`
     * 
     */
    @Import(name="betweenBytesTimeout")
    private @Nullable Output<Integer> betweenBytesTimeout;

    /**
     * @return How long to wait between bytes in milliseconds. Default `10000`
     * 
     */
    public Optional<Output<Integer>> betweenBytesTimeout() {
        return Optional.ofNullable(this.betweenBytesTimeout);
    }

    /**
     * How long to wait for a timeout in milliseconds. Default `1000`
     * 
     */
    @Import(name="connectTimeout")
    private @Nullable Output<Integer> connectTimeout;

    /**
     * @return How long to wait for a timeout in milliseconds. Default `1000`
     * 
     */
    public Optional<Output<Integer>> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }

    /**
     * Number of errors to allow before the Backend is marked as down. Default `0`
     * 
     */
    @Import(name="errorThreshold")
    private @Nullable Output<Integer> errorThreshold;

    /**
     * @return Number of errors to allow before the Backend is marked as down. Default `0`
     * 
     */
    public Optional<Output<Integer>> errorThreshold() {
        return Optional.ofNullable(this.errorThreshold);
    }

    /**
     * How long to wait for the first bytes in milliseconds. Default `15000`
     * 
     */
    @Import(name="firstByteTimeout")
    private @Nullable Output<Integer> firstByteTimeout;

    /**
     * @return How long to wait for the first bytes in milliseconds. Default `15000`
     * 
     */
    public Optional<Output<Integer>> firstByteTimeout() {
        return Optional.ofNullable(this.firstByteTimeout);
    }

    /**
     * Name of a defined `healthcheck` to assign to this backend
     * 
     */
    @Import(name="healthcheck")
    private @Nullable Output<String> healthcheck;

    /**
     * @return Name of a defined `healthcheck` to assign to this backend
     * 
     */
    public Optional<Output<String>> healthcheck() {
        return Optional.ofNullable(this.healthcheck);
    }

    /**
     * Maximum number of connections for this Backend. Default `200`
     * 
     */
    @Import(name="maxConn")
    private @Nullable Output<Integer> maxConn;

    /**
     * @return Maximum number of connections for this Backend. Default `200`
     * 
     */
    public Optional<Output<Integer>> maxConn() {
        return Optional.ofNullable(this.maxConn);
    }

    /**
     * Maximum allowed TLS version on SSL connections to this backend.
     * 
     */
    @Import(name="maxTlsVersion")
    private @Nullable Output<String> maxTlsVersion;

    /**
     * @return Maximum allowed TLS version on SSL connections to this backend.
     * 
     */
    public Optional<Output<String>> maxTlsVersion() {
        return Optional.ofNullable(this.maxTlsVersion);
    }

    /**
     * Minimum allowed TLS version on SSL connections to this backend.
     * 
     */
    @Import(name="minTlsVersion")
    private @Nullable Output<String> minTlsVersion;

    /**
     * @return Minimum allowed TLS version on SSL connections to this backend.
     * 
     */
    public Optional<Output<String>> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * Name for this Backend. Must be unique to this Service. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name for this Backend. Must be unique to this Service. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The hostname to override the Host header
     * 
     */
    @Import(name="overrideHost")
    private @Nullable Output<String> overrideHost;

    /**
     * @return The hostname to override the Host header
     * 
     */
    public Optional<Output<String>> overrideHost() {
        return Optional.ofNullable(this.overrideHost);
    }

    /**
     * The port number on which the Backend responds. Default `80`
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number on which the Backend responds. Default `80`
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Name of a condition, which if met, will select this backend during a request.
     * 
     */
    @Import(name="requestCondition")
    private @Nullable Output<String> requestCondition;

    /**
     * @return Name of a condition, which if met, will select this backend during a request.
     * 
     */
    public Optional<Output<String>> requestCondition() {
        return Optional.ofNullable(this.requestCondition);
    }

    /**
     * The POP of the shield designated to reduce inbound load. Valid values for `shield` are included in the `GET /datacenters` API response
     * 
     */
    @Import(name="shield")
    private @Nullable Output<String> shield;

    /**
     * @return The POP of the shield designated to reduce inbound load. Valid values for `shield` are included in the `GET /datacenters` API response
     * 
     */
    public Optional<Output<String>> shield() {
        return Optional.ofNullable(this.shield);
    }

    /**
     * CA certificate attached to origin.
     * 
     */
    @Import(name="sslCaCert")
    private @Nullable Output<String> sslCaCert;

    /**
     * @return CA certificate attached to origin.
     * 
     */
    public Optional<Output<String>> sslCaCert() {
        return Optional.ofNullable(this.sslCaCert);
    }

    /**
     * Overrides ssl_hostname, but only for cert verification. Does not affect SNI at all
     * 
     */
    @Import(name="sslCertHostname")
    private @Nullable Output<String> sslCertHostname;

    /**
     * @return Overrides ssl_hostname, but only for cert verification. Does not affect SNI at all
     * 
     */
    public Optional<Output<String>> sslCertHostname() {
        return Optional.ofNullable(this.sslCertHostname);
    }

    /**
     * Be strict about checking SSL certs. Default `true`
     * 
     */
    @Import(name="sslCheckCert")
    private @Nullable Output<Boolean> sslCheckCert;

    /**
     * @return Be strict about checking SSL certs. Default `true`
     * 
     */
    public Optional<Output<Boolean>> sslCheckCert() {
        return Optional.ofNullable(this.sslCheckCert);
    }

    /**
     * Cipher list consisting of one or more cipher strings separated by colons. Commas or spaces are also acceptable separators but colons are normally used.
     * 
     */
    @Import(name="sslCiphers")
    private @Nullable Output<String> sslCiphers;

    /**
     * @return Cipher list consisting of one or more cipher strings separated by colons. Commas or spaces are also acceptable separators but colons are normally used.
     * 
     */
    public Optional<Output<String>> sslCiphers() {
        return Optional.ofNullable(this.sslCiphers);
    }

    /**
     * Client certificate attached to origin. Used when connecting to the backend
     * 
     */
    @Import(name="sslClientCert")
    private @Nullable Output<String> sslClientCert;

    /**
     * @return Client certificate attached to origin. Used when connecting to the backend
     * 
     */
    public Optional<Output<String>> sslClientCert() {
        return Optional.ofNullable(this.sslClientCert);
    }

    /**
     * Client key attached to origin. Used when connecting to the backend
     * 
     */
    @Import(name="sslClientKey")
    private @Nullable Output<String> sslClientKey;

    /**
     * @return Client key attached to origin. Used when connecting to the backend
     * 
     */
    public Optional<Output<String>> sslClientKey() {
        return Optional.ofNullable(this.sslClientKey);
    }

    /**
     * Used for both SNI during the TLS handshake and to validate the cert
     * 
     * @deprecated
     * Use ssl_cert_hostname and ssl_sni_hostname instead.
     * 
     */
    @Deprecated /* Use ssl_cert_hostname and ssl_sni_hostname instead. */
    @Import(name="sslHostname")
    private @Nullable Output<String> sslHostname;

    /**
     * @return Used for both SNI during the TLS handshake and to validate the cert
     * 
     * @deprecated
     * Use ssl_cert_hostname and ssl_sni_hostname instead.
     * 
     */
    @Deprecated /* Use ssl_cert_hostname and ssl_sni_hostname instead. */
    public Optional<Output<String>> sslHostname() {
        return Optional.ofNullable(this.sslHostname);
    }

    /**
     * Overrides ssl_hostname, but only for SNI in the handshake. Does not affect cert validation at all
     * 
     */
    @Import(name="sslSniHostname")
    private @Nullable Output<String> sslSniHostname;

    /**
     * @return Overrides ssl_hostname, but only for SNI in the handshake. Does not affect cert validation at all
     * 
     */
    public Optional<Output<String>> sslSniHostname() {
        return Optional.ofNullable(this.sslSniHostname);
    }

    /**
     * Whether or not to use SSL to reach the Backend. Default `false`
     * 
     */
    @Import(name="useSsl")
    private @Nullable Output<Boolean> useSsl;

    /**
     * @return Whether or not to use SSL to reach the Backend. Default `false`
     * 
     */
    public Optional<Output<Boolean>> useSsl() {
        return Optional.ofNullable(this.useSsl);
    }

    /**
     * The [portion of traffic](https://docs.fastly.com/en/guides/load-balancing-configuration#how-weight-affects-load-balancing) to send to this Backend. Each Backend receives weight / total of the traffic. Default `100`
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The [portion of traffic](https://docs.fastly.com/en/guides/load-balancing-configuration#how-weight-affects-load-balancing) to send to this Backend. Each Backend receives weight / total of the traffic. Default `100`
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ServiceVclBackendArgs() {}

    private ServiceVclBackendArgs(ServiceVclBackendArgs $) {
        this.address = $.address;
        this.autoLoadbalance = $.autoLoadbalance;
        this.betweenBytesTimeout = $.betweenBytesTimeout;
        this.connectTimeout = $.connectTimeout;
        this.errorThreshold = $.errorThreshold;
        this.firstByteTimeout = $.firstByteTimeout;
        this.healthcheck = $.healthcheck;
        this.maxConn = $.maxConn;
        this.maxTlsVersion = $.maxTlsVersion;
        this.minTlsVersion = $.minTlsVersion;
        this.name = $.name;
        this.overrideHost = $.overrideHost;
        this.port = $.port;
        this.requestCondition = $.requestCondition;
        this.shield = $.shield;
        this.sslCaCert = $.sslCaCert;
        this.sslCertHostname = $.sslCertHostname;
        this.sslCheckCert = $.sslCheckCert;
        this.sslCiphers = $.sslCiphers;
        this.sslClientCert = $.sslClientCert;
        this.sslClientKey = $.sslClientKey;
        this.sslHostname = $.sslHostname;
        this.sslSniHostname = $.sslSniHostname;
        this.useSsl = $.useSsl;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclBackendArgs $;

        public Builder() {
            $ = new ServiceVclBackendArgs();
        }

        public Builder(ServiceVclBackendArgs defaults) {
            $ = new ServiceVclBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address An IPv4, hostname, or IPv6 address for the Backend
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address An IPv4, hostname, or IPv6 address for the Backend
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param autoLoadbalance Denotes if this Backend should be included in the pool of backends that requests are load balanced against. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder autoLoadbalance(@Nullable Output<Boolean> autoLoadbalance) {
            $.autoLoadbalance = autoLoadbalance;
            return this;
        }

        /**
         * @param autoLoadbalance Denotes if this Backend should be included in the pool of backends that requests are load balanced against. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder autoLoadbalance(Boolean autoLoadbalance) {
            return autoLoadbalance(Output.of(autoLoadbalance));
        }

        /**
         * @param betweenBytesTimeout How long to wait between bytes in milliseconds. Default `10000`
         * 
         * @return builder
         * 
         */
        public Builder betweenBytesTimeout(@Nullable Output<Integer> betweenBytesTimeout) {
            $.betweenBytesTimeout = betweenBytesTimeout;
            return this;
        }

        /**
         * @param betweenBytesTimeout How long to wait between bytes in milliseconds. Default `10000`
         * 
         * @return builder
         * 
         */
        public Builder betweenBytesTimeout(Integer betweenBytesTimeout) {
            return betweenBytesTimeout(Output.of(betweenBytesTimeout));
        }

        /**
         * @param connectTimeout How long to wait for a timeout in milliseconds. Default `1000`
         * 
         * @return builder
         * 
         */
        public Builder connectTimeout(@Nullable Output<Integer> connectTimeout) {
            $.connectTimeout = connectTimeout;
            return this;
        }

        /**
         * @param connectTimeout How long to wait for a timeout in milliseconds. Default `1000`
         * 
         * @return builder
         * 
         */
        public Builder connectTimeout(Integer connectTimeout) {
            return connectTimeout(Output.of(connectTimeout));
        }

        /**
         * @param errorThreshold Number of errors to allow before the Backend is marked as down. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder errorThreshold(@Nullable Output<Integer> errorThreshold) {
            $.errorThreshold = errorThreshold;
            return this;
        }

        /**
         * @param errorThreshold Number of errors to allow before the Backend is marked as down. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder errorThreshold(Integer errorThreshold) {
            return errorThreshold(Output.of(errorThreshold));
        }

        /**
         * @param firstByteTimeout How long to wait for the first bytes in milliseconds. Default `15000`
         * 
         * @return builder
         * 
         */
        public Builder firstByteTimeout(@Nullable Output<Integer> firstByteTimeout) {
            $.firstByteTimeout = firstByteTimeout;
            return this;
        }

        /**
         * @param firstByteTimeout How long to wait for the first bytes in milliseconds. Default `15000`
         * 
         * @return builder
         * 
         */
        public Builder firstByteTimeout(Integer firstByteTimeout) {
            return firstByteTimeout(Output.of(firstByteTimeout));
        }

        /**
         * @param healthcheck Name of a defined `healthcheck` to assign to this backend
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(@Nullable Output<String> healthcheck) {
            $.healthcheck = healthcheck;
            return this;
        }

        /**
         * @param healthcheck Name of a defined `healthcheck` to assign to this backend
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(String healthcheck) {
            return healthcheck(Output.of(healthcheck));
        }

        /**
         * @param maxConn Maximum number of connections for this Backend. Default `200`
         * 
         * @return builder
         * 
         */
        public Builder maxConn(@Nullable Output<Integer> maxConn) {
            $.maxConn = maxConn;
            return this;
        }

        /**
         * @param maxConn Maximum number of connections for this Backend. Default `200`
         * 
         * @return builder
         * 
         */
        public Builder maxConn(Integer maxConn) {
            return maxConn(Output.of(maxConn));
        }

        /**
         * @param maxTlsVersion Maximum allowed TLS version on SSL connections to this backend.
         * 
         * @return builder
         * 
         */
        public Builder maxTlsVersion(@Nullable Output<String> maxTlsVersion) {
            $.maxTlsVersion = maxTlsVersion;
            return this;
        }

        /**
         * @param maxTlsVersion Maximum allowed TLS version on SSL connections to this backend.
         * 
         * @return builder
         * 
         */
        public Builder maxTlsVersion(String maxTlsVersion) {
            return maxTlsVersion(Output.of(maxTlsVersion));
        }

        /**
         * @param minTlsVersion Minimum allowed TLS version on SSL connections to this backend.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param minTlsVersion Minimum allowed TLS version on SSL connections to this backend.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        /**
         * @param name Name for this Backend. Must be unique to this Service. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for this Backend. Must be unique to this Service. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overrideHost The hostname to override the Host header
         * 
         * @return builder
         * 
         */
        public Builder overrideHost(@Nullable Output<String> overrideHost) {
            $.overrideHost = overrideHost;
            return this;
        }

        /**
         * @param overrideHost The hostname to override the Host header
         * 
         * @return builder
         * 
         */
        public Builder overrideHost(String overrideHost) {
            return overrideHost(Output.of(overrideHost));
        }

        /**
         * @param port The port number on which the Backend responds. Default `80`
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number on which the Backend responds. Default `80`
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param requestCondition Name of a condition, which if met, will select this backend during a request.
         * 
         * @return builder
         * 
         */
        public Builder requestCondition(@Nullable Output<String> requestCondition) {
            $.requestCondition = requestCondition;
            return this;
        }

        /**
         * @param requestCondition Name of a condition, which if met, will select this backend during a request.
         * 
         * @return builder
         * 
         */
        public Builder requestCondition(String requestCondition) {
            return requestCondition(Output.of(requestCondition));
        }

        /**
         * @param shield The POP of the shield designated to reduce inbound load. Valid values for `shield` are included in the `GET /datacenters` API response
         * 
         * @return builder
         * 
         */
        public Builder shield(@Nullable Output<String> shield) {
            $.shield = shield;
            return this;
        }

        /**
         * @param shield The POP of the shield designated to reduce inbound load. Valid values for `shield` are included in the `GET /datacenters` API response
         * 
         * @return builder
         * 
         */
        public Builder shield(String shield) {
            return shield(Output.of(shield));
        }

        /**
         * @param sslCaCert CA certificate attached to origin.
         * 
         * @return builder
         * 
         */
        public Builder sslCaCert(@Nullable Output<String> sslCaCert) {
            $.sslCaCert = sslCaCert;
            return this;
        }

        /**
         * @param sslCaCert CA certificate attached to origin.
         * 
         * @return builder
         * 
         */
        public Builder sslCaCert(String sslCaCert) {
            return sslCaCert(Output.of(sslCaCert));
        }

        /**
         * @param sslCertHostname Overrides ssl_hostname, but only for cert verification. Does not affect SNI at all
         * 
         * @return builder
         * 
         */
        public Builder sslCertHostname(@Nullable Output<String> sslCertHostname) {
            $.sslCertHostname = sslCertHostname;
            return this;
        }

        /**
         * @param sslCertHostname Overrides ssl_hostname, but only for cert verification. Does not affect SNI at all
         * 
         * @return builder
         * 
         */
        public Builder sslCertHostname(String sslCertHostname) {
            return sslCertHostname(Output.of(sslCertHostname));
        }

        /**
         * @param sslCheckCert Be strict about checking SSL certs. Default `true`
         * 
         * @return builder
         * 
         */
        public Builder sslCheckCert(@Nullable Output<Boolean> sslCheckCert) {
            $.sslCheckCert = sslCheckCert;
            return this;
        }

        /**
         * @param sslCheckCert Be strict about checking SSL certs. Default `true`
         * 
         * @return builder
         * 
         */
        public Builder sslCheckCert(Boolean sslCheckCert) {
            return sslCheckCert(Output.of(sslCheckCert));
        }

        /**
         * @param sslCiphers Cipher list consisting of one or more cipher strings separated by colons. Commas or spaces are also acceptable separators but colons are normally used.
         * 
         * @return builder
         * 
         */
        public Builder sslCiphers(@Nullable Output<String> sslCiphers) {
            $.sslCiphers = sslCiphers;
            return this;
        }

        /**
         * @param sslCiphers Cipher list consisting of one or more cipher strings separated by colons. Commas or spaces are also acceptable separators but colons are normally used.
         * 
         * @return builder
         * 
         */
        public Builder sslCiphers(String sslCiphers) {
            return sslCiphers(Output.of(sslCiphers));
        }

        /**
         * @param sslClientCert Client certificate attached to origin. Used when connecting to the backend
         * 
         * @return builder
         * 
         */
        public Builder sslClientCert(@Nullable Output<String> sslClientCert) {
            $.sslClientCert = sslClientCert;
            return this;
        }

        /**
         * @param sslClientCert Client certificate attached to origin. Used when connecting to the backend
         * 
         * @return builder
         * 
         */
        public Builder sslClientCert(String sslClientCert) {
            return sslClientCert(Output.of(sslClientCert));
        }

        /**
         * @param sslClientKey Client key attached to origin. Used when connecting to the backend
         * 
         * @return builder
         * 
         */
        public Builder sslClientKey(@Nullable Output<String> sslClientKey) {
            $.sslClientKey = sslClientKey;
            return this;
        }

        /**
         * @param sslClientKey Client key attached to origin. Used when connecting to the backend
         * 
         * @return builder
         * 
         */
        public Builder sslClientKey(String sslClientKey) {
            return sslClientKey(Output.of(sslClientKey));
        }

        /**
         * @param sslHostname Used for both SNI during the TLS handshake and to validate the cert
         * 
         * @return builder
         * 
         * @deprecated
         * Use ssl_cert_hostname and ssl_sni_hostname instead.
         * 
         */
        @Deprecated /* Use ssl_cert_hostname and ssl_sni_hostname instead. */
        public Builder sslHostname(@Nullable Output<String> sslHostname) {
            $.sslHostname = sslHostname;
            return this;
        }

        /**
         * @param sslHostname Used for both SNI during the TLS handshake and to validate the cert
         * 
         * @return builder
         * 
         * @deprecated
         * Use ssl_cert_hostname and ssl_sni_hostname instead.
         * 
         */
        @Deprecated /* Use ssl_cert_hostname and ssl_sni_hostname instead. */
        public Builder sslHostname(String sslHostname) {
            return sslHostname(Output.of(sslHostname));
        }

        /**
         * @param sslSniHostname Overrides ssl_hostname, but only for SNI in the handshake. Does not affect cert validation at all
         * 
         * @return builder
         * 
         */
        public Builder sslSniHostname(@Nullable Output<String> sslSniHostname) {
            $.sslSniHostname = sslSniHostname;
            return this;
        }

        /**
         * @param sslSniHostname Overrides ssl_hostname, but only for SNI in the handshake. Does not affect cert validation at all
         * 
         * @return builder
         * 
         */
        public Builder sslSniHostname(String sslSniHostname) {
            return sslSniHostname(Output.of(sslSniHostname));
        }

        /**
         * @param useSsl Whether or not to use SSL to reach the Backend. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            $.useSsl = useSsl;
            return this;
        }

        /**
         * @param useSsl Whether or not to use SSL to reach the Backend. Default `false`
         * 
         * @return builder
         * 
         */
        public Builder useSsl(Boolean useSsl) {
            return useSsl(Output.of(useSsl));
        }

        /**
         * @param weight The [portion of traffic](https://docs.fastly.com/en/guides/load-balancing-configuration#how-weight-affects-load-balancing) to send to this Backend. Each Backend receives weight / total of the traffic. Default `100`
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The [portion of traffic](https://docs.fastly.com/en/guides/load-balancing-configuration#how-weight-affects-load-balancing) to send to this Backend. Each Backend receives weight / total of the traffic. Default `100`
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ServiceVclBackendArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}