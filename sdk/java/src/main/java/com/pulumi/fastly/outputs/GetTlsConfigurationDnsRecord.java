// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTlsConfigurationDnsRecord {
    /**
     * @return Type of DNS record to set, e.g. A, AAAA, or CNAME.
     * 
     */
    private String recordType;
    /**
     * @return The IP address or hostname of the DNS record.
     * 
     */
    private String recordValue;
    /**
     * @return The regions that will be used to route traffic. Select DNS Records with a `global` region to route traffic to the most performant point of presence (POP) worldwide (global pricing will apply). Select DNS records with a `us-eu` region to exclusively land traffic on North American and European POPs.
     * 
     */
    private String region;

    private GetTlsConfigurationDnsRecord() {}
    /**
     * @return Type of DNS record to set, e.g. A, AAAA, or CNAME.
     * 
     */
    public String recordType() {
        return this.recordType;
    }
    /**
     * @return The IP address or hostname of the DNS record.
     * 
     */
    public String recordValue() {
        return this.recordValue;
    }
    /**
     * @return The regions that will be used to route traffic. Select DNS Records with a `global` region to route traffic to the most performant point of presence (POP) worldwide (global pricing will apply). Select DNS records with a `us-eu` region to exclusively land traffic on North American and European POPs.
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTlsConfigurationDnsRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String recordType;
        private String recordValue;
        private String region;
        public Builder() {}
        public Builder(GetTlsConfigurationDnsRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordType = defaults.recordType;
    	      this.recordValue = defaults.recordValue;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder recordType(String recordType) {
            if (recordType == null) {
              throw new MissingRequiredPropertyException("GetTlsConfigurationDnsRecord", "recordType");
            }
            this.recordType = recordType;
            return this;
        }
        @CustomType.Setter
        public Builder recordValue(String recordValue) {
            if (recordValue == null) {
              throw new MissingRequiredPropertyException("GetTlsConfigurationDnsRecord", "recordValue");
            }
            this.recordValue = recordValue;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetTlsConfigurationDnsRecord", "region");
            }
            this.region = region;
            return this;
        }
        public GetTlsConfigurationDnsRecord build() {
            final var _resultValue = new GetTlsConfigurationDnsRecord();
            _resultValue.recordType = recordType;
            _resultValue.recordValue = recordValue;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}