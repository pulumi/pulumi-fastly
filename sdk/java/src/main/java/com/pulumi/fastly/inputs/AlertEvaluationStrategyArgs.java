// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertEvaluationStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertEvaluationStrategyArgs Empty = new AlertEvaluationStrategyArgs();

    /**
     * Threshold for the denominator value used in evaluations that calculate a rate or ratio. Usually used to filter out noise.
     * 
     */
    @Import(name="ignoreBelow")
    private @Nullable Output<Double> ignoreBelow;

    /**
     * @return Threshold for the denominator value used in evaluations that calculate a rate or ratio. Usually used to filter out noise.
     * 
     */
    public Optional<Output<Double>> ignoreBelow() {
        return Optional.ofNullable(this.ignoreBelow);
    }

    /**
     * The length of time to evaluate whether the conditions have been met. The data is polled every minute. One of: `2m`, `3m`, `5m`, `15m`, `30m`.
     * 
     */
    @Import(name="period", required=true)
    private Output<String> period;

    /**
     * @return The length of time to evaluate whether the conditions have been met. The data is polled every minute. One of: `2m`, `3m`, `5m`, `15m`, `30m`.
     * 
     */
    public Output<String> period() {
        return this.period;
    }

    /**
     * Threshold used to alert.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return Threshold used to alert.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * Type of strategy to use to evaluate. One of: `above_threshold`, `all_above_threshold`, `below_threshold`, `percent_absolute`, `percent_decrease`, `percent_increase`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of strategy to use to evaluate. One of: `above_threshold`, `all_above_threshold`, `below_threshold`, `percent_absolute`, `percent_decrease`, `percent_increase`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AlertEvaluationStrategyArgs() {}

    private AlertEvaluationStrategyArgs(AlertEvaluationStrategyArgs $) {
        this.ignoreBelow = $.ignoreBelow;
        this.period = $.period;
        this.threshold = $.threshold;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertEvaluationStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertEvaluationStrategyArgs $;

        public Builder() {
            $ = new AlertEvaluationStrategyArgs();
        }

        public Builder(AlertEvaluationStrategyArgs defaults) {
            $ = new AlertEvaluationStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreBelow Threshold for the denominator value used in evaluations that calculate a rate or ratio. Usually used to filter out noise.
         * 
         * @return builder
         * 
         */
        public Builder ignoreBelow(@Nullable Output<Double> ignoreBelow) {
            $.ignoreBelow = ignoreBelow;
            return this;
        }

        /**
         * @param ignoreBelow Threshold for the denominator value used in evaluations that calculate a rate or ratio. Usually used to filter out noise.
         * 
         * @return builder
         * 
         */
        public Builder ignoreBelow(Double ignoreBelow) {
            return ignoreBelow(Output.of(ignoreBelow));
        }

        /**
         * @param period The length of time to evaluate whether the conditions have been met. The data is polled every minute. One of: `2m`, `3m`, `5m`, `15m`, `30m`.
         * 
         * @return builder
         * 
         */
        public Builder period(Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The length of time to evaluate whether the conditions have been met. The data is polled every minute. One of: `2m`, `3m`, `5m`, `15m`, `30m`.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param threshold Threshold used to alert.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Threshold used to alert.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param type Type of strategy to use to evaluate. One of: `above_threshold`, `all_above_threshold`, `below_threshold`, `percent_absolute`, `percent_decrease`, `percent_increase`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of strategy to use to evaluate. One of: `above_threshold`, `all_above_threshold`, `below_threshold`, `percent_absolute`, `percent_decrease`, `percent_increase`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AlertEvaluationStrategyArgs build() {
            if ($.period == null) {
                throw new MissingRequiredPropertyException("AlertEvaluationStrategyArgs", "period");
            }
            if ($.threshold == null) {
                throw new MissingRequiredPropertyException("AlertEvaluationStrategyArgs", "threshold");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AlertEvaluationStrategyArgs", "type");
            }
            return $;
        }
    }

}
