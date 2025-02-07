// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.fastly.inputs.CustomDashboardDashboardItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDashboardState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDashboardState Empty = new CustomDashboardState();

    /**
     * A list of dashboard items.
     * 
     */
    @Import(name="dashboardItems")
    private @Nullable Output<List<CustomDashboardDashboardItemArgs>> dashboardItems;

    /**
     * @return A list of dashboard items.
     * 
     */
    public Optional<Output<List<CustomDashboardDashboardItemArgs>>> dashboardItems() {
        return Optional.ofNullable(this.dashboardItems);
    }

    /**
     * A short description of the dashboard.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the dashboard.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A human-readable name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-readable name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CustomDashboardState() {}

    private CustomDashboardState(CustomDashboardState $) {
        this.dashboardItems = $.dashboardItems;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDashboardState $;

        public Builder() {
            $ = new CustomDashboardState();
        }

        public Builder(CustomDashboardState defaults) {
            $ = new CustomDashboardState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboardItems A list of dashboard items.
         * 
         * @return builder
         * 
         */
        public Builder dashboardItems(@Nullable Output<List<CustomDashboardDashboardItemArgs>> dashboardItems) {
            $.dashboardItems = dashboardItems;
            return this;
        }

        /**
         * @param dashboardItems A list of dashboard items.
         * 
         * @return builder
         * 
         */
        public Builder dashboardItems(List<CustomDashboardDashboardItemArgs> dashboardItems) {
            return dashboardItems(Output.of(dashboardItems));
        }

        /**
         * @param dashboardItems A list of dashboard items.
         * 
         * @return builder
         * 
         */
        public Builder dashboardItems(CustomDashboardDashboardItemArgs... dashboardItems) {
            return dashboardItems(List.of(dashboardItems));
        }

        /**
         * @param description A short description of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A human-readable name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-readable name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CustomDashboardState build() {
            return $;
        }
    }

}
