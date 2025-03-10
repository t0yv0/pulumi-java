// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.PropagatedRouteTableResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.VnetRouteResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingConfigurationResponse {
    /**
     * @return The resource id RouteTable associated with this RoutingConfiguration.
     * 
     */
    private final @Nullable SubResourceResponse associatedRouteTable;
    /**
     * @return The list of RouteTables to advertise the routes to.
     * 
     */
    private final @Nullable PropagatedRouteTableResponse propagatedRouteTables;
    /**
     * @return List of routes that control routing from VirtualHub into a virtual network connection.
     * 
     */
    private final @Nullable VnetRouteResponse vnetRoutes;

    @CustomType.Constructor
    private RoutingConfigurationResponse(
        @CustomType.Parameter("associatedRouteTable") @Nullable SubResourceResponse associatedRouteTable,
        @CustomType.Parameter("propagatedRouteTables") @Nullable PropagatedRouteTableResponse propagatedRouteTables,
        @CustomType.Parameter("vnetRoutes") @Nullable VnetRouteResponse vnetRoutes) {
        this.associatedRouteTable = associatedRouteTable;
        this.propagatedRouteTables = propagatedRouteTables;
        this.vnetRoutes = vnetRoutes;
    }

    /**
     * @return The resource id RouteTable associated with this RoutingConfiguration.
     * 
     */
    public Optional<SubResourceResponse> associatedRouteTable() {
        return Optional.ofNullable(this.associatedRouteTable);
    }
    /**
     * @return The list of RouteTables to advertise the routes to.
     * 
     */
    public Optional<PropagatedRouteTableResponse> propagatedRouteTables() {
        return Optional.ofNullable(this.propagatedRouteTables);
    }
    /**
     * @return List of routes that control routing from VirtualHub into a virtual network connection.
     * 
     */
    public Optional<VnetRouteResponse> vnetRoutes() {
        return Optional.ofNullable(this.vnetRoutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse associatedRouteTable;
        private @Nullable PropagatedRouteTableResponse propagatedRouteTables;
        private @Nullable VnetRouteResponse vnetRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedRouteTable = defaults.associatedRouteTable;
    	      this.propagatedRouteTables = defaults.propagatedRouteTables;
    	      this.vnetRoutes = defaults.vnetRoutes;
        }

        public Builder associatedRouteTable(@Nullable SubResourceResponse associatedRouteTable) {
            this.associatedRouteTable = associatedRouteTable;
            return this;
        }
        public Builder propagatedRouteTables(@Nullable PropagatedRouteTableResponse propagatedRouteTables) {
            this.propagatedRouteTables = propagatedRouteTables;
            return this;
        }
        public Builder vnetRoutes(@Nullable VnetRouteResponse vnetRoutes) {
            this.vnetRoutes = vnetRoutes;
            return this;
        }        public RoutingConfigurationResponse build() {
            return new RoutingConfigurationResponse(associatedRouteTable, propagatedRouteTables, vnetRoutes);
        }
    }
}
