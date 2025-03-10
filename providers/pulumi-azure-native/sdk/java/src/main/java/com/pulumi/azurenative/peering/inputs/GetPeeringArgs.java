// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringArgs Empty = new GetPeeringArgs();

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private String peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public String peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPeeringArgs() {}

    private GetPeeringArgs(GetPeeringArgs $) {
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringArgs $;

        public Builder() {
            $ = new GetPeeringArgs();
        }

        public Builder(GetPeeringArgs defaults) {
            $ = new GetPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPeeringArgs build() {
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
