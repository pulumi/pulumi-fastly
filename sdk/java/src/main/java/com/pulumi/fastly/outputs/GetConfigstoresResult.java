// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.fastly.outputs.GetConfigstoresStore;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConfigstoresResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of all Config Stores.
     * 
     */
    private List<GetConfigstoresStore> stores;

    private GetConfigstoresResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of all Config Stores.
     * 
     */
    public List<GetConfigstoresStore> stores() {
        return this.stores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigstoresResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetConfigstoresStore> stores;
        public Builder() {}
        public Builder(GetConfigstoresResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.stores = defaults.stores;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder stores(List<GetConfigstoresStore> stores) {
            this.stores = Objects.requireNonNull(stores);
            return this;
        }
        public Builder stores(GetConfigstoresStore... stores) {
            return stores(List.of(stores));
        }
        public GetConfigstoresResult build() {
            final var o = new GetConfigstoresResult();
            o.id = id;
            o.stores = stores;
            return o;
        }
    }
}