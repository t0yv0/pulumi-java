// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionArgs Empty = new GatewayRouteSpecHttpRouteActionArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
    private Output<GatewayRouteSpecHttpRouteActionTargetArgs> target;

    /**
     * @return The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    public Output<GatewayRouteSpecHttpRouteActionTargetArgs> target() {
        return this.target;
    }

    private GatewayRouteSpecHttpRouteActionArgs() {}

    private GatewayRouteSpecHttpRouteActionArgs(GatewayRouteSpecHttpRouteActionArgs $) {
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttpRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteActionArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttpRouteActionArgs();
        }

        public Builder(GatewayRouteSpecHttpRouteActionArgs defaults) {
            $ = new GatewayRouteSpecHttpRouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target The target that traffic is routed to when a request matches the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<GatewayRouteSpecHttpRouteActionTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target that traffic is routed to when a request matches the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder target(GatewayRouteSpecHttpRouteActionTargetArgs target) {
            return target(Output.of(target));
        }

        public GatewayRouteSpecHttpRouteActionArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
