// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServicesDetail {
    private String comment;
    private String createdAt;
    private String customerId;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    private String name;
    private String type;
    private String updatedAt;
    private Integer version;

    private GetServicesDetail() {}
    public String comment() {
        return this.comment;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String customerId() {
        return this.customerId;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String type() {
        return this.type;
    }
    public String updatedAt() {
        return this.updatedAt;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicesDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String createdAt;
        private String customerId;
        private String id;
        private String name;
        private String type;
        private String updatedAt;
        private Integer version;
        public Builder() {}
        public Builder(GetServicesDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdAt = defaults.createdAt;
    	      this.customerId = defaults.customerId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder customerId(String customerId) {
            this.customerId = Objects.requireNonNull(customerId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetServicesDetail build() {
            final var o = new GetServicesDetail();
            o.comment = comment;
            o.createdAt = createdAt;
            o.customerId = customerId;
            o.id = id;
            o.name = name;
            o.type = type;
            o.updatedAt = updatedAt;
            o.version = version;
            return o;
        }
    }
}