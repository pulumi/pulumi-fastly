// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceComputeLoggingElasticsearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceComputeLoggingElasticsearchArgs Empty = new ServiceComputeLoggingElasticsearchArgs();

    /**
     * The name of the Elasticsearch index to send documents (logs) to
     * 
     */
    @Import(name="index", required=true)
    private Output<String> index;

    /**
     * @return The name of the Elasticsearch index to send documents (logs) to
     * 
     */
    public Output<String> index() {
        return this.index;
    }

    /**
     * The unique name of the Elasticsearch logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the Elasticsearch logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * BasicAuth password for Elasticsearch
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return BasicAuth password for Elasticsearch
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the Elasticsearch ingest pipeline to apply pre-process transformations to before indexing
     * 
     */
    @Import(name="pipeline")
    private @Nullable Output<String> pipeline;

    /**
     * @return The ID of the Elasticsearch ingest pipeline to apply pre-process transformations to before indexing
     * 
     */
    public Optional<Output<String>> pipeline() {
        return Optional.ofNullable(this.pipeline);
    }

    /**
     * The maximum number of logs sent in one request. Defaults to `0` for unbounded
     * 
     */
    @Import(name="requestMaxBytes")
    private @Nullable Output<Integer> requestMaxBytes;

    /**
     * @return The maximum number of logs sent in one request. Defaults to `0` for unbounded
     * 
     */
    public Optional<Output<Integer>> requestMaxBytes() {
        return Optional.ofNullable(this.requestMaxBytes);
    }

    /**
     * The maximum number of bytes sent in one request. Defaults to `0` for unbounded
     * 
     */
    @Import(name="requestMaxEntries")
    private @Nullable Output<Integer> requestMaxEntries;

    /**
     * @return The maximum number of bytes sent in one request. Defaults to `0` for unbounded
     * 
     */
    public Optional<Output<Integer>> requestMaxEntries() {
        return Optional.ofNullable(this.requestMaxEntries);
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
     * The hostname used to verify the server&#39;s certificate. It can either be the Common Name (CN) or a Subject Alternative Name (SAN)
     * 
     */
    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    /**
     * @return The hostname used to verify the server&#39;s certificate. It can either be the Common Name (CN) or a Subject Alternative Name (SAN)
     * 
     */
    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    /**
     * The Elasticsearch URL to stream logs to
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The Elasticsearch URL to stream logs to
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * BasicAuth username for Elasticsearch
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return BasicAuth username for Elasticsearch
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private ServiceComputeLoggingElasticsearchArgs() {}

    private ServiceComputeLoggingElasticsearchArgs(ServiceComputeLoggingElasticsearchArgs $) {
        this.index = $.index;
        this.name = $.name;
        this.password = $.password;
        this.pipeline = $.pipeline;
        this.requestMaxBytes = $.requestMaxBytes;
        this.requestMaxEntries = $.requestMaxEntries;
        this.tlsCaCert = $.tlsCaCert;
        this.tlsClientCert = $.tlsClientCert;
        this.tlsClientKey = $.tlsClientKey;
        this.tlsHostname = $.tlsHostname;
        this.url = $.url;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceComputeLoggingElasticsearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceComputeLoggingElasticsearchArgs $;

        public Builder() {
            $ = new ServiceComputeLoggingElasticsearchArgs();
        }

        public Builder(ServiceComputeLoggingElasticsearchArgs defaults) {
            $ = new ServiceComputeLoggingElasticsearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param index The name of the Elasticsearch index to send documents (logs) to
         * 
         * @return builder
         * 
         */
        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index The name of the Elasticsearch index to send documents (logs) to
         * 
         * @return builder
         * 
         */
        public Builder index(String index) {
            return index(Output.of(index));
        }

        /**
         * @param name The unique name of the Elasticsearch logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the Elasticsearch logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password BasicAuth password for Elasticsearch
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password BasicAuth password for Elasticsearch
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pipeline The ID of the Elasticsearch ingest pipeline to apply pre-process transformations to before indexing
         * 
         * @return builder
         * 
         */
        public Builder pipeline(@Nullable Output<String> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        /**
         * @param pipeline The ID of the Elasticsearch ingest pipeline to apply pre-process transformations to before indexing
         * 
         * @return builder
         * 
         */
        public Builder pipeline(String pipeline) {
            return pipeline(Output.of(pipeline));
        }

        /**
         * @param requestMaxBytes The maximum number of logs sent in one request. Defaults to `0` for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(@Nullable Output<Integer> requestMaxBytes) {
            $.requestMaxBytes = requestMaxBytes;
            return this;
        }

        /**
         * @param requestMaxBytes The maximum number of logs sent in one request. Defaults to `0` for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(Integer requestMaxBytes) {
            return requestMaxBytes(Output.of(requestMaxBytes));
        }

        /**
         * @param requestMaxEntries The maximum number of bytes sent in one request. Defaults to `0` for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxEntries(@Nullable Output<Integer> requestMaxEntries) {
            $.requestMaxEntries = requestMaxEntries;
            return this;
        }

        /**
         * @param requestMaxEntries The maximum number of bytes sent in one request. Defaults to `0` for unbounded
         * 
         * @return builder
         * 
         */
        public Builder requestMaxEntries(Integer requestMaxEntries) {
            return requestMaxEntries(Output.of(requestMaxEntries));
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
         * @param tlsHostname The hostname used to verify the server&#39;s certificate. It can either be the Common Name (CN) or a Subject Alternative Name (SAN)
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        /**
         * @param tlsHostname The hostname used to verify the server&#39;s certificate. It can either be the Common Name (CN) or a Subject Alternative Name (SAN)
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        /**
         * @param url The Elasticsearch URL to stream logs to
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Elasticsearch URL to stream logs to
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param user BasicAuth username for Elasticsearch
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user BasicAuth username for Elasticsearch
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public ServiceComputeLoggingElasticsearchArgs build() {
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}