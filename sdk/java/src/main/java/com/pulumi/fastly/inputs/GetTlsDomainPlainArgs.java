// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTlsDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTlsDomainPlainArgs Empty = new GetTlsDomainPlainArgs();

    /**
     * Domain name to look up activations, certificates and subscriptions for.
     * 
     */
    @Import(name="domain", required=true)
    private String domain;

    /**
     * @return Domain name to look up activations, certificates and subscriptions for.
     * 
     */
    public String domain() {
        return this.domain;
    }

    private GetTlsDomainPlainArgs() {}

    private GetTlsDomainPlainArgs(GetTlsDomainPlainArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTlsDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTlsDomainPlainArgs $;

        public Builder() {
            $ = new GetTlsDomainPlainArgs();
        }

        public Builder(GetTlsDomainPlainArgs defaults) {
            $ = new GetTlsDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Domain name to look up activations, certificates and subscriptions for.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        public GetTlsDomainPlainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GetTlsDomainPlainArgs", "domain");
            }
            return $;
        }
    }

}
