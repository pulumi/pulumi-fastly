// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclConditionArgs Empty = new ServiceVclConditionArgs();

    /**
     * The unique name for the condition. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name for the condition. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A number used to determine the order in which multiple conditions execute. Lower numbers execute first. Default `10`
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return A number used to determine the order in which multiple conditions execute. Lower numbers execute first. Default `10`
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The statement used to determine if the condition is met
     * 
     */
    @Import(name="statement", required=true)
    private Output<String> statement;

    /**
     * @return The statement used to determine if the condition is met
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }

    /**
     * Type of condition, either `REQUEST` (req), `RESPONSE` (req, resp), or `CACHE` (req, beresp)
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of condition, either `REQUEST` (req), `RESPONSE` (req, resp), or `CACHE` (req, beresp)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServiceVclConditionArgs() {}

    private ServiceVclConditionArgs(ServiceVclConditionArgs $) {
        this.name = $.name;
        this.priority = $.priority;
        this.statement = $.statement;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclConditionArgs $;

        public Builder() {
            $ = new ServiceVclConditionArgs();
        }

        public Builder(ServiceVclConditionArgs defaults) {
            $ = new ServiceVclConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique name for the condition. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name for the condition. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority A number used to determine the order in which multiple conditions execute. Lower numbers execute first. Default `10`
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority A number used to determine the order in which multiple conditions execute. Lower numbers execute first. Default `10`
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param statement The statement used to determine if the condition is met
         * 
         * @return builder
         * 
         */
        public Builder statement(Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement The statement used to determine if the condition is met
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param type Type of condition, either `REQUEST` (req), `RESPONSE` (req, resp), or `CACHE` (req, beresp)
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of condition, either `REQUEST` (req), `RESPONSE` (req, resp), or `CACHE` (req, beresp)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceVclConditionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}