// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.fastly.inputs.ServiceVclProductEnablementDdosProtectionArgs;
import com.pulumi.fastly.inputs.ServiceVclProductEnablementNgwafArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclProductEnablementArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclProductEnablementArgs Empty = new ServiceVclProductEnablementArgs();

    /**
     * Enable Bot Management support
     * 
     */
    @Import(name="botManagement")
    private @Nullable Output<Boolean> botManagement;

    /**
     * @return Enable Bot Management support
     * 
     */
    public Optional<Output<Boolean>> botManagement() {
        return Optional.ofNullable(this.botManagement);
    }

    /**
     * Enable Brotli Compression support
     * 
     */
    @Import(name="brotliCompression")
    private @Nullable Output<Boolean> brotliCompression;

    /**
     * @return Enable Brotli Compression support
     * 
     */
    public Optional<Output<Boolean>> brotliCompression() {
        return Optional.ofNullable(this.brotliCompression);
    }

    /**
     * DDoS Protection product
     * 
     */
    @Import(name="ddosProtection")
    private @Nullable Output<ServiceVclProductEnablementDdosProtectionArgs> ddosProtection;

    /**
     * @return DDoS Protection product
     * 
     */
    public Optional<Output<ServiceVclProductEnablementDdosProtectionArgs>> ddosProtection() {
        return Optional.ofNullable(this.ddosProtection);
    }

    /**
     * Enable Domain Inspector support
     * 
     */
    @Import(name="domainInspector")
    private @Nullable Output<Boolean> domainInspector;

    /**
     * @return Enable Domain Inspector support
     * 
     */
    public Optional<Output<Boolean>> domainInspector() {
        return Optional.ofNullable(this.domainInspector);
    }

    /**
     * Enable Image Optimizer support (all backends must have a `shield` attribute)
     * 
     */
    @Import(name="imageOptimizer")
    private @Nullable Output<Boolean> imageOptimizer;

    /**
     * @return Enable Image Optimizer support (all backends must have a `shield` attribute)
     * 
     */
    public Optional<Output<Boolean>> imageOptimizer() {
        return Optional.ofNullable(this.imageOptimizer);
    }

    /**
     * Enable Log Explorer &amp; Insights
     * 
     */
    @Import(name="logExplorerInsights")
    private @Nullable Output<Boolean> logExplorerInsights;

    /**
     * @return Enable Log Explorer &amp; Insights
     * 
     */
    public Optional<Output<Boolean>> logExplorerInsights() {
        return Optional.ofNullable(this.logExplorerInsights);
    }

    /**
     * Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Next-Gen WAF product
     * 
     */
    @Import(name="ngwaf")
    private @Nullable Output<ServiceVclProductEnablementNgwafArgs> ngwaf;

    /**
     * @return Next-Gen WAF product
     * 
     */
    public Optional<Output<ServiceVclProductEnablementNgwafArgs>> ngwaf() {
        return Optional.ofNullable(this.ngwaf);
    }

    /**
     * Enable Origin Inspector support
     * 
     */
    @Import(name="originInspector")
    private @Nullable Output<Boolean> originInspector;

    /**
     * @return Enable Origin Inspector support
     * 
     */
    public Optional<Output<Boolean>> originInspector() {
        return Optional.ofNullable(this.originInspector);
    }

    /**
     * Enable WebSockets support
     * 
     */
    @Import(name="websockets")
    private @Nullable Output<Boolean> websockets;

    /**
     * @return Enable WebSockets support
     * 
     */
    public Optional<Output<Boolean>> websockets() {
        return Optional.ofNullable(this.websockets);
    }

    private ServiceVclProductEnablementArgs() {}

    private ServiceVclProductEnablementArgs(ServiceVclProductEnablementArgs $) {
        this.botManagement = $.botManagement;
        this.brotliCompression = $.brotliCompression;
        this.ddosProtection = $.ddosProtection;
        this.domainInspector = $.domainInspector;
        this.imageOptimizer = $.imageOptimizer;
        this.logExplorerInsights = $.logExplorerInsights;
        this.name = $.name;
        this.ngwaf = $.ngwaf;
        this.originInspector = $.originInspector;
        this.websockets = $.websockets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclProductEnablementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclProductEnablementArgs $;

        public Builder() {
            $ = new ServiceVclProductEnablementArgs();
        }

        public Builder(ServiceVclProductEnablementArgs defaults) {
            $ = new ServiceVclProductEnablementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botManagement Enable Bot Management support
         * 
         * @return builder
         * 
         */
        public Builder botManagement(@Nullable Output<Boolean> botManagement) {
            $.botManagement = botManagement;
            return this;
        }

        /**
         * @param botManagement Enable Bot Management support
         * 
         * @return builder
         * 
         */
        public Builder botManagement(Boolean botManagement) {
            return botManagement(Output.of(botManagement));
        }

        /**
         * @param brotliCompression Enable Brotli Compression support
         * 
         * @return builder
         * 
         */
        public Builder brotliCompression(@Nullable Output<Boolean> brotliCompression) {
            $.brotliCompression = brotliCompression;
            return this;
        }

        /**
         * @param brotliCompression Enable Brotli Compression support
         * 
         * @return builder
         * 
         */
        public Builder brotliCompression(Boolean brotliCompression) {
            return brotliCompression(Output.of(brotliCompression));
        }

        /**
         * @param ddosProtection DDoS Protection product
         * 
         * @return builder
         * 
         */
        public Builder ddosProtection(@Nullable Output<ServiceVclProductEnablementDdosProtectionArgs> ddosProtection) {
            $.ddosProtection = ddosProtection;
            return this;
        }

        /**
         * @param ddosProtection DDoS Protection product
         * 
         * @return builder
         * 
         */
        public Builder ddosProtection(ServiceVclProductEnablementDdosProtectionArgs ddosProtection) {
            return ddosProtection(Output.of(ddosProtection));
        }

        /**
         * @param domainInspector Enable Domain Inspector support
         * 
         * @return builder
         * 
         */
        public Builder domainInspector(@Nullable Output<Boolean> domainInspector) {
            $.domainInspector = domainInspector;
            return this;
        }

        /**
         * @param domainInspector Enable Domain Inspector support
         * 
         * @return builder
         * 
         */
        public Builder domainInspector(Boolean domainInspector) {
            return domainInspector(Output.of(domainInspector));
        }

        /**
         * @param imageOptimizer Enable Image Optimizer support (all backends must have a `shield` attribute)
         * 
         * @return builder
         * 
         */
        public Builder imageOptimizer(@Nullable Output<Boolean> imageOptimizer) {
            $.imageOptimizer = imageOptimizer;
            return this;
        }

        /**
         * @param imageOptimizer Enable Image Optimizer support (all backends must have a `shield` attribute)
         * 
         * @return builder
         * 
         */
        public Builder imageOptimizer(Boolean imageOptimizer) {
            return imageOptimizer(Output.of(imageOptimizer));
        }

        /**
         * @param logExplorerInsights Enable Log Explorer &amp; Insights
         * 
         * @return builder
         * 
         */
        public Builder logExplorerInsights(@Nullable Output<Boolean> logExplorerInsights) {
            $.logExplorerInsights = logExplorerInsights;
            return this;
        }

        /**
         * @param logExplorerInsights Enable Log Explorer &amp; Insights
         * 
         * @return builder
         * 
         */
        public Builder logExplorerInsights(Boolean logExplorerInsights) {
            return logExplorerInsights(Output.of(logExplorerInsights));
        }

        /**
         * @param name Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Used by the provider to identify modified settings (changing this value will force the entire block to be deleted, then recreated)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ngwaf Next-Gen WAF product
         * 
         * @return builder
         * 
         */
        public Builder ngwaf(@Nullable Output<ServiceVclProductEnablementNgwafArgs> ngwaf) {
            $.ngwaf = ngwaf;
            return this;
        }

        /**
         * @param ngwaf Next-Gen WAF product
         * 
         * @return builder
         * 
         */
        public Builder ngwaf(ServiceVclProductEnablementNgwafArgs ngwaf) {
            return ngwaf(Output.of(ngwaf));
        }

        /**
         * @param originInspector Enable Origin Inspector support
         * 
         * @return builder
         * 
         */
        public Builder originInspector(@Nullable Output<Boolean> originInspector) {
            $.originInspector = originInspector;
            return this;
        }

        /**
         * @param originInspector Enable Origin Inspector support
         * 
         * @return builder
         * 
         */
        public Builder originInspector(Boolean originInspector) {
            return originInspector(Output.of(originInspector));
        }

        /**
         * @param websockets Enable WebSockets support
         * 
         * @return builder
         * 
         */
        public Builder websockets(@Nullable Output<Boolean> websockets) {
            $.websockets = websockets;
            return this;
        }

        /**
         * @param websockets Enable WebSockets support
         * 
         * @return builder
         * 
         */
        public Builder websockets(Boolean websockets) {
            return websockets(Output.of(websockets));
        }

        public ServiceVclProductEnablementArgs build() {
            return $;
        }
    }

}
