// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceWafConfigurationRuleExclusion {
    /**
     * @return A conditional expression in VCL used to determine if the condition is met
     * 
     */
    private String condition;
    /**
     * @return The type of rule exclusion. Values are `rule` to exclude the specified rule(s), or `waf` to disable the Web Application Firewall
     * 
     */
    private String exclusionType;
    /**
     * @return Set of modsecurity IDs to be excluded. No rules should be provided when `exclusion_type` is `waf`. The rules need to be configured on the Web Application Firewall to be excluded
     * 
     */
    private @Nullable List<Integer> modsecRuleIds;
    /**
     * @return The name of rule exclusion
     * 
     */
    private String name;
    /**
     * @return The numeric ID assigned to the WAF Rule Exclusion
     * 
     */
    private @Nullable Integer number;

    private ServiceWafConfigurationRuleExclusion() {}
    /**
     * @return A conditional expression in VCL used to determine if the condition is met
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return The type of rule exclusion. Values are `rule` to exclude the specified rule(s), or `waf` to disable the Web Application Firewall
     * 
     */
    public String exclusionType() {
        return this.exclusionType;
    }
    /**
     * @return Set of modsecurity IDs to be excluded. No rules should be provided when `exclusion_type` is `waf`. The rules need to be configured on the Web Application Firewall to be excluded
     * 
     */
    public List<Integer> modsecRuleIds() {
        return this.modsecRuleIds == null ? List.of() : this.modsecRuleIds;
    }
    /**
     * @return The name of rule exclusion
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The numeric ID assigned to the WAF Rule Exclusion
     * 
     */
    public Optional<Integer> number() {
        return Optional.ofNullable(this.number);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceWafConfigurationRuleExclusion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private String exclusionType;
        private @Nullable List<Integer> modsecRuleIds;
        private String name;
        private @Nullable Integer number;
        public Builder() {}
        public Builder(ServiceWafConfigurationRuleExclusion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.exclusionType = defaults.exclusionType;
    	      this.modsecRuleIds = defaults.modsecRuleIds;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        @CustomType.Setter
        public Builder exclusionType(String exclusionType) {
            this.exclusionType = Objects.requireNonNull(exclusionType);
            return this;
        }
        @CustomType.Setter
        public Builder modsecRuleIds(@Nullable List<Integer> modsecRuleIds) {
            this.modsecRuleIds = modsecRuleIds;
            return this;
        }
        public Builder modsecRuleIds(Integer... modsecRuleIds) {
            return modsecRuleIds(List.of(modsecRuleIds));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable Integer number) {
            this.number = number;
            return this;
        }
        public ServiceWafConfigurationRuleExclusion build() {
            final var o = new ServiceWafConfigurationRuleExclusion();
            o.condition = condition;
            o.exclusionType = exclusionType;
            o.modsecRuleIds = modsecRuleIds;
            o.name = name;
            o.number = number;
            return o;
        }
    }
}