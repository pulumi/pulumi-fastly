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


public final class ServiceVclLoggingHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingHttpArgs Empty = new ServiceVclLoggingHttpArgs();

    /**
     * Value of the `Content-Type` header sent with the request
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return Value of the `Content-Type` header sent with the request
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
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
     * The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
     * 
     */
    @Import(name="formatVersion")
    private @Nullable Output<Integer> formatVersion;

    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
     * 
     */
    public Optional<Output<Integer>> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }

    /**
     * Custom header sent with the request
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    /**
     * @return Custom header sent with the request
     * 
     */
    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * Value of the custom header sent with the request
     * 
     */
    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    /**
     * @return Value of the custom header sent with the request
     * 
     */
    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    /**
     * Formats log entries as JSON. Can be either disabled (`0`), array of json (`1`), or newline delimited json (`2`)
     * 
     */
    @Import(name="jsonFormat")
    private @Nullable Output<String> jsonFormat;

    /**
     * @return Formats log entries as JSON. Can be either disabled (`0`), array of json (`1`), or newline delimited json (`2`)
     * 
     */
    public Optional<Output<String>> jsonFormat() {
        return Optional.ofNullable(this.jsonFormat);
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
     * HTTP method used for request. Can be either `POST` or `PUT`. Default `POST`
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return HTTP method used for request. Can be either `POST` or `PUT`. Default `POST`
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The unique name of the HTTPS logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the HTTPS logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Where in the generated VCL the logging call should be placed
     * 
     */
    @Import(name="placement")
    private @Nullable Output<String> placement;

    /**
     * @return Where in the generated VCL the logging call should be placed
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
     * The maximum number of bytes sent in one request
     * 
     */
    @Import(name="requestMaxBytes")
    private @Nullable Output<Integer> requestMaxBytes;

    /**
     * @return The maximum number of bytes sent in one request
     * 
     */
    public Optional<Output<Integer>> requestMaxBytes() {
        return Optional.ofNullable(this.requestMaxBytes);
    }

    /**
     * The maximum number of logs sent in one request
     * 
     */
    @Import(name="requestMaxEntries")
    private @Nullable Output<Integer> requestMaxEntries;

    /**
     * @return The maximum number of logs sent in one request
     * 
     */
    public Optional<Output<Integer>> requestMaxEntries() {
        return Optional.ofNullable(this.requestMaxEntries);
    }

    /**
     * The name of the condition to apply
     * 
     */
    @Import(name="responseCondition")
    private @Nullable Output<String> responseCondition;

    /**
     * @return The name of the condition to apply
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
     * Used during the TLS handshake to validate the certificate
     * 
     */
    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    /**
     * @return Used during the TLS handshake to validate the certificate
     * 
     */
    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    /**
     * URL that log data will be sent to. Must use the https protocol
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL that log data will be sent to. Must use the https protocol
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ServiceVclLoggingHttpArgs() {}

    private ServiceVclLoggingHttpArgs(ServiceVclLoggingHttpArgs $) {
        this.contentType = $.contentType;
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
        this.jsonFormat = $.jsonFormat;
        this.messageType = $.messageType;
        this.method = $.method;
        this.name = $.name;
        this.placement = $.placement;
        this.processingRegion = $.processingRegion;
        this.requestMaxBytes = $.requestMaxBytes;
        this.requestMaxEntries = $.requestMaxEntries;
        this.responseCondition = $.responseCondition;
        this.tlsCaCert = $.tlsCaCert;
        this.tlsClientCert = $.tlsClientCert;
        this.tlsClientKey = $.tlsClientKey;
        this.tlsHostname = $.tlsHostname;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingHttpArgs $;

        public Builder() {
            $ = new ServiceVclLoggingHttpArgs();
        }

        public Builder(ServiceVclLoggingHttpArgs defaults) {
            $ = new ServiceVclLoggingHttpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Value of the `Content-Type` header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Value of the `Content-Type` header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
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
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(@Nullable Output<Integer> formatVersion) {
            $.formatVersion = formatVersion;
            return this;
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (default: 2)
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(Integer formatVersion) {
            return formatVersion(Output.of(formatVersion));
        }

        /**
         * @param headerName Custom header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName Custom header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue Value of the custom header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue Value of the custom header sent with the request
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        /**
         * @param jsonFormat Formats log entries as JSON. Can be either disabled (`0`), array of json (`1`), or newline delimited json (`2`)
         * 
         * @return builder
         * 
         */
        public Builder jsonFormat(@Nullable Output<String> jsonFormat) {
            $.jsonFormat = jsonFormat;
            return this;
        }

        /**
         * @param jsonFormat Formats log entries as JSON. Can be either disabled (`0`), array of json (`1`), or newline delimited json (`2`)
         * 
         * @return builder
         * 
         */
        public Builder jsonFormat(String jsonFormat) {
            return jsonFormat(Output.of(jsonFormat));
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
         * @param method HTTP method used for request. Can be either `POST` or `PUT`. Default `POST`
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method HTTP method used for request. Can be either `POST` or `PUT`. Default `POST`
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name The unique name of the HTTPS logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the HTTPS logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<String> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed
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
         * @param requestMaxBytes The maximum number of bytes sent in one request
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(@Nullable Output<Integer> requestMaxBytes) {
            $.requestMaxBytes = requestMaxBytes;
            return this;
        }

        /**
         * @param requestMaxBytes The maximum number of bytes sent in one request
         * 
         * @return builder
         * 
         */
        public Builder requestMaxBytes(Integer requestMaxBytes) {
            return requestMaxBytes(Output.of(requestMaxBytes));
        }

        /**
         * @param requestMaxEntries The maximum number of logs sent in one request
         * 
         * @return builder
         * 
         */
        public Builder requestMaxEntries(@Nullable Output<Integer> requestMaxEntries) {
            $.requestMaxEntries = requestMaxEntries;
            return this;
        }

        /**
         * @param requestMaxEntries The maximum number of logs sent in one request
         * 
         * @return builder
         * 
         */
        public Builder requestMaxEntries(Integer requestMaxEntries) {
            return requestMaxEntries(Output.of(requestMaxEntries));
        }

        /**
         * @param responseCondition The name of the condition to apply
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(@Nullable Output<String> responseCondition) {
            $.responseCondition = responseCondition;
            return this;
        }

        /**
         * @param responseCondition The name of the condition to apply
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
         * @param tlsHostname Used during the TLS handshake to validate the certificate
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        /**
         * @param tlsHostname Used during the TLS handshake to validate the certificate
         * 
         * @return builder
         * 
         */
        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        /**
         * @param url URL that log data will be sent to. Must use the https protocol
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL that log data will be sent to. Must use the https protocol
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ServiceVclLoggingHttpArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingHttpArgs", "name");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("ServiceVclLoggingHttpArgs", "url");
            }
            return $;
        }
    }

}
