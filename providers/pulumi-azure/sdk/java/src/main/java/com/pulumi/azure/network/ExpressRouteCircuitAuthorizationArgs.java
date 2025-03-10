// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitAuthorizationArgs Empty = new ExpressRouteCircuitAuthorizationArgs();

    /**
     * The name of the Express Route Circuit in which to create the Authorization.
     * 
     */
    @Import(name="expressRouteCircuitName", required=true)
    private Output<String> expressRouteCircuitName;

    /**
     * @return The name of the Express Route Circuit in which to create the Authorization.
     * 
     */
    public Output<String> expressRouteCircuitName() {
        return this.expressRouteCircuitName;
    }

    /**
     * The name of the ExpressRoute circuit. Changing this forces a
     * new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ExpressRoute circuit. Changing this forces a
     * new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to
     * create the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ExpressRouteCircuitAuthorizationArgs() {}

    private ExpressRouteCircuitAuthorizationArgs(ExpressRouteCircuitAuthorizationArgs $) {
        this.expressRouteCircuitName = $.expressRouteCircuitName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitAuthorizationArgs $;

        public Builder() {
            $ = new ExpressRouteCircuitAuthorizationArgs();
        }

        public Builder(ExpressRouteCircuitAuthorizationArgs defaults) {
            $ = new ExpressRouteCircuitAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressRouteCircuitName The name of the Express Route Circuit in which to create the Authorization.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteCircuitName(Output<String> expressRouteCircuitName) {
            $.expressRouteCircuitName = expressRouteCircuitName;
            return this;
        }

        /**
         * @param expressRouteCircuitName The name of the Express Route Circuit in which to create the Authorization.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteCircuitName(String expressRouteCircuitName) {
            return expressRouteCircuitName(Output.of(expressRouteCircuitName));
        }

        /**
         * @param name The name of the ExpressRoute circuit. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ExpressRoute circuit. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the ExpressRoute circuit. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the ExpressRoute circuit. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ExpressRouteCircuitAuthorizationArgs build() {
            $.expressRouteCircuitName = Objects.requireNonNull($.expressRouteCircuitName, "expected parameter 'expressRouteCircuitName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
