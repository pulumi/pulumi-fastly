// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.fastly.outputs.GetDictionariesDictionary;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDictionariesResult {
    /**
     * @return List of all dictionaries for the version of the service.
     * 
     */
    private List<GetDictionariesDictionary> dictionaries;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string identifying the service.
     * 
     */
    private String serviceId;
    /**
     * @return Integer identifying a service version.
     * 
     */
    private Integer serviceVersion;

    private GetDictionariesResult() {}
    /**
     * @return List of all dictionaries for the version of the service.
     * 
     */
    public List<GetDictionariesDictionary> dictionaries() {
        return this.dictionaries;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alphanumeric string identifying the service.
     * 
     */
    public String serviceId() {
        return this.serviceId;
    }
    /**
     * @return Integer identifying a service version.
     * 
     */
    public Integer serviceVersion() {
        return this.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDictionariesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDictionariesDictionary> dictionaries;
        private String id;
        private String serviceId;
        private Integer serviceVersion;
        public Builder() {}
        public Builder(GetDictionariesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionaries = defaults.dictionaries;
    	      this.id = defaults.id;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceVersion = defaults.serviceVersion;
        }

        @CustomType.Setter
        public Builder dictionaries(List<GetDictionariesDictionary> dictionaries) {
            if (dictionaries == null) {
              throw new MissingRequiredPropertyException("GetDictionariesResult", "dictionaries");
            }
            this.dictionaries = dictionaries;
            return this;
        }
        public Builder dictionaries(GetDictionariesDictionary... dictionaries) {
            return dictionaries(List.of(dictionaries));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDictionariesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serviceId(String serviceId) {
            if (serviceId == null) {
              throw new MissingRequiredPropertyException("GetDictionariesResult", "serviceId");
            }
            this.serviceId = serviceId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceVersion(Integer serviceVersion) {
            if (serviceVersion == null) {
              throw new MissingRequiredPropertyException("GetDictionariesResult", "serviceVersion");
            }
            this.serviceVersion = serviceVersion;
            return this;
        }
        public GetDictionariesResult build() {
            final var _resultValue = new GetDictionariesResult();
            _resultValue.dictionaries = dictionaries;
            _resultValue.id = id;
            _resultValue.serviceId = serviceId;
            _resultValue.serviceVersion = serviceVersion;
            return _resultValue;
        }
    }
}
