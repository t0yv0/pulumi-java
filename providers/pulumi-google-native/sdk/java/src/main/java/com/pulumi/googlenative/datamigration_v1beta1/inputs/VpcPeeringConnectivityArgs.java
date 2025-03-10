// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the VPC where the source database is located in Google Cloud. We will use this information to set up the VPC peering connection between Cloud SQL and this VPC.
 * 
 */
public final class VpcPeeringConnectivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectivityArgs Empty = new VpcPeeringConnectivityArgs();

    /**
     * The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<String> vpc;

    /**
     * @return The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    public Optional<Output<String>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    private VpcPeeringConnectivityArgs() {}

    private VpcPeeringConnectivityArgs(VpcPeeringConnectivityArgs $) {
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcPeeringConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcPeeringConnectivityArgs $;

        public Builder() {
            $ = new VpcPeeringConnectivityArgs();
        }

        public Builder(VpcPeeringConnectivityArgs defaults) {
            $ = new VpcPeeringConnectivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpc The name of the VPC network to peer with the Cloud SQL private network.
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Output<String> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc The name of the VPC network to peer with the Cloud SQL private network.
         * 
         * @return builder
         * 
         */
        public Builder vpc(String vpc) {
            return vpc(Output.of(vpc));
        }

        public VpcPeeringConnectivityArgs build() {
            return $;
        }
    }

}
