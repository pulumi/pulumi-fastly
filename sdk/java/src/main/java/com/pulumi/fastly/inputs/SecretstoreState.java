// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretstoreState extends com.pulumi.resources.ResourceArgs {

    public static final SecretstoreState Empty = new SecretstoreState();

    /**
     * A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SecretstoreState() {}

    private SecretstoreState(SecretstoreState $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretstoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretstoreState $;

        public Builder() {
            $ = new SecretstoreState();
        }

        public Builder(SecretstoreState defaults) {
            $ = new SecretstoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SecretstoreState build() {
            return $;
        }
    }

}
