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
public final class ServiceVclResponseObject {
    /**
     * @return Name of already defined `condition` to check after we have retrieved an object. If the condition passes then deliver this Request Object instead. This `condition` must be of type `CACHE`. For detailed information about Conditionals, see [Fastly&#39;s Documentation on Conditionals](https://docs.fastly.com/en/guides/using-conditions)
     * 
     */
    private @Nullable String cacheCondition;
    /**
     * @return The content to deliver for the response object
     * 
     */
    private @Nullable String content;
    /**
     * @return The MIME type of the content
     * 
     */
    private @Nullable String contentType;
    /**
     * @return A unique name to identify this Response Object. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    private String name;
    /**
     * @return Name of already defined `condition` to be checked during the request phase. If the condition passes then this object will be delivered. This `condition` must be of type `REQUEST`
     * 
     */
    private @Nullable String requestCondition;
    /**
     * @return The HTTP Response. Default `OK`
     * 
     */
    private @Nullable String response;
    /**
     * @return The HTTP Status Code. Default `200`
     * 
     */
    private @Nullable Integer status;

    private ServiceVclResponseObject() {}
    /**
     * @return Name of already defined `condition` to check after we have retrieved an object. If the condition passes then deliver this Request Object instead. This `condition` must be of type `CACHE`. For detailed information about Conditionals, see [Fastly&#39;s Documentation on Conditionals](https://docs.fastly.com/en/guides/using-conditions)
     * 
     */
    public Optional<String> cacheCondition() {
        return Optional.ofNullable(this.cacheCondition);
    }
    /**
     * @return The content to deliver for the response object
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The MIME type of the content
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * @return A unique name to identify this Response Object. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of already defined `condition` to be checked during the request phase. If the condition passes then this object will be delivered. This `condition` must be of type `REQUEST`
     * 
     */
    public Optional<String> requestCondition() {
        return Optional.ofNullable(this.requestCondition);
    }
    /**
     * @return The HTTP Response. Default `OK`
     * 
     */
    public Optional<String> response() {
        return Optional.ofNullable(this.response);
    }
    /**
     * @return The HTTP Status Code. Default `200`
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceVclResponseObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cacheCondition;
        private @Nullable String content;
        private @Nullable String contentType;
        private String name;
        private @Nullable String requestCondition;
        private @Nullable String response;
        private @Nullable Integer status;
        public Builder() {}
        public Builder(ServiceVclResponseObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheCondition = defaults.cacheCondition;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.name = defaults.name;
    	      this.requestCondition = defaults.requestCondition;
    	      this.response = defaults.response;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder cacheCondition(@Nullable String cacheCondition) {

            this.cacheCondition = cacheCondition;
            return this;
        }
        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {

            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceVclResponseObject", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder requestCondition(@Nullable String requestCondition) {

            this.requestCondition = requestCondition;
            return this;
        }
        @CustomType.Setter
        public Builder response(@Nullable String response) {

            this.response = response;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable Integer status) {

            this.status = status;
            return this;
        }
        public ServiceVclResponseObject build() {
            final var _resultValue = new ServiceVclResponseObject();
            _resultValue.cacheCondition = cacheCondition;
            _resultValue.content = content;
            _resultValue.contentType = contentType;
            _resultValue.name = name;
            _resultValue.requestCondition = requestCondition;
            _resultValue.response = response;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}