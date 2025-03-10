// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNatGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatGatewayArgs Empty = new GetNatGatewayArgs();

    /**
     * The NAT gateway&#39;s [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="natGatewayId", required=true)
    private String natGatewayId;

    /**
     * @return The NAT gateway&#39;s [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }

    private GetNatGatewayArgs() {}

    private GetNatGatewayArgs(GetNatGatewayArgs $) {
        this.natGatewayId = $.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatGatewayArgs $;

        public Builder() {
            $ = new GetNatGatewayArgs();
        }

        public Builder(GetNatGatewayArgs defaults) {
            $ = new GetNatGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param natGatewayId The NAT gateway&#39;s [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        public GetNatGatewayArgs build() {
            $.natGatewayId = Objects.requireNonNull($.natGatewayId, "expected parameter 'natGatewayId' to be non-null");
            return $;
        }
    }

}
