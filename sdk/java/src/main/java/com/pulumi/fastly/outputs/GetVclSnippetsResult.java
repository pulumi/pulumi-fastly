// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.fastly.outputs.GetVclSnippetsVclSnippet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVclSnippetsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String serviceId;
    private Integer serviceVersion;
    private List<GetVclSnippetsVclSnippet> vclSnippets;

    private GetVclSnippetsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String serviceId() {
        return this.serviceId;
    }
    public Integer serviceVersion() {
        return this.serviceVersion;
    }
    public List<GetVclSnippetsVclSnippet> vclSnippets() {
        return this.vclSnippets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVclSnippetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String serviceId;
        private Integer serviceVersion;
        private List<GetVclSnippetsVclSnippet> vclSnippets;
        public Builder() {}
        public Builder(GetVclSnippetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceVersion = defaults.serviceVersion;
    	      this.vclSnippets = defaults.vclSnippets;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVclSnippetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serviceId(String serviceId) {
            if (serviceId == null) {
              throw new MissingRequiredPropertyException("GetVclSnippetsResult", "serviceId");
            }
            this.serviceId = serviceId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceVersion(Integer serviceVersion) {
            if (serviceVersion == null) {
              throw new MissingRequiredPropertyException("GetVclSnippetsResult", "serviceVersion");
            }
            this.serviceVersion = serviceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder vclSnippets(List<GetVclSnippetsVclSnippet> vclSnippets) {
            if (vclSnippets == null) {
              throw new MissingRequiredPropertyException("GetVclSnippetsResult", "vclSnippets");
            }
            this.vclSnippets = vclSnippets;
            return this;
        }
        public Builder vclSnippets(GetVclSnippetsVclSnippet... vclSnippets) {
            return vclSnippets(List.of(vclSnippets));
        }
        public GetVclSnippetsResult build() {
            final var _resultValue = new GetVclSnippetsResult();
            _resultValue.id = id;
            _resultValue.serviceId = serviceId;
            _resultValue.serviceVersion = serviceVersion;
            _resultValue.vclSnippets = vclSnippets;
            return _resultValue;
        }
    }
}