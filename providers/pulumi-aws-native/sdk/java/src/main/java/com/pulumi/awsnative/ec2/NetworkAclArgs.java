// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.NetworkAclTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclArgs Empty = new NetworkAclArgs();

    /**
     * The tags to assign to the network ACL.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<NetworkAclTagArgs>> tags;

    /**
     * @return The tags to assign to the network ACL.
     * 
     */
    public Optional<Output<List<NetworkAclTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private NetworkAclArgs() {}

    private NetworkAclArgs(NetworkAclArgs $) {
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclArgs $;

        public Builder() {
            $ = new NetworkAclArgs();
        }

        public Builder(NetworkAclArgs defaults) {
            $ = new NetworkAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags The tags to assign to the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<NetworkAclTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags to assign to the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<NetworkAclTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags to assign to the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder tags(NetworkAclTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public NetworkAclArgs build() {
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
