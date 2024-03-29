// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceComputeLoggingPapertrailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceComputeLoggingPapertrailArgs Empty = new ServiceComputeLoggingPapertrailArgs();

    /**
     * The address of the Papertrail endpoint
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The address of the Papertrail endpoint
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The port associated with the address where the Papertrail endpoint can be accessed
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port associated with the address where the Papertrail endpoint can be accessed
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private ServiceComputeLoggingPapertrailArgs() {}

    private ServiceComputeLoggingPapertrailArgs(ServiceComputeLoggingPapertrailArgs $) {
        this.address = $.address;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceComputeLoggingPapertrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceComputeLoggingPapertrailArgs $;

        public Builder() {
            $ = new ServiceComputeLoggingPapertrailArgs();
        }

        public Builder(ServiceComputeLoggingPapertrailArgs defaults) {
            $ = new ServiceComputeLoggingPapertrailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the Papertrail endpoint
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the Papertrail endpoint
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param name A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name to identify this Papertrail endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port associated with the address where the Papertrail endpoint can be accessed
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port associated with the address where the Papertrail endpoint can be accessed
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ServiceComputeLoggingPapertrailArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrailArgs", "address");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrailArgs", "name");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("ServiceComputeLoggingPapertrailArgs", "port");
            }
            return $;
        }
    }

}
