// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetVclSnippetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVclSnippetsArgs Empty = new GetVclSnippetsArgs();

    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    @Import(name="serviceVersion", required=true)
    private Output<Integer> serviceVersion;

    public Output<Integer> serviceVersion() {
        return this.serviceVersion;
    }

    private GetVclSnippetsArgs() {}

    private GetVclSnippetsArgs(GetVclSnippetsArgs $) {
        this.serviceId = $.serviceId;
        this.serviceVersion = $.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVclSnippetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVclSnippetsArgs $;

        public Builder() {
            $ = new GetVclSnippetsArgs();
        }

        public Builder(GetVclSnippetsArgs defaults) {
            $ = new GetVclSnippetsArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public Builder serviceVersion(Output<Integer> serviceVersion) {
            $.serviceVersion = serviceVersion;
            return this;
        }

        public Builder serviceVersion(Integer serviceVersion) {
            return serviceVersion(Output.of(serviceVersion));
        }

        public GetVclSnippetsArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("GetVclSnippetsArgs", "serviceId");
            }
            if ($.serviceVersion == null) {
                throw new MissingRequiredPropertyException("GetVclSnippetsArgs", "serviceVersion");
            }
            return $;
        }
    }

}