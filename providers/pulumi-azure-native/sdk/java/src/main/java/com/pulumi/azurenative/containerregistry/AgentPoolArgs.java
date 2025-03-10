// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry;

import com.pulumi.azurenative.containerregistry.enums.OS;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentPoolArgs Empty = new AgentPoolArgs();

    /**
     * The name of the agent pool.
     * 
     */
    @Import(name="agentPoolName")
    private @Nullable Output<String> agentPoolName;

    /**
     * @return The name of the agent pool.
     * 
     */
    public Optional<Output<String>> agentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The count of agent machine
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The count of agent machine
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The OS of agent machine
     * 
     */
    @Import(name="os")
    private @Nullable Output<Either<String,OS>> os;

    /**
     * @return The OS of agent machine
     * 
     */
    public Optional<Output<Either<String,OS>>> os() {
        return Optional.ofNullable(this.os);
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private Output<String> registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Tier of agent machine
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The Tier of agent machine
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * The Virtual Network Subnet Resource Id of the agent machine
     * 
     */
    @Import(name="virtualNetworkSubnetResourceId")
    private @Nullable Output<String> virtualNetworkSubnetResourceId;

    /**
     * @return The Virtual Network Subnet Resource Id of the agent machine
     * 
     */
    public Optional<Output<String>> virtualNetworkSubnetResourceId() {
        return Optional.ofNullable(this.virtualNetworkSubnetResourceId);
    }

    private AgentPoolArgs() {}

    private AgentPoolArgs(AgentPoolArgs $) {
        this.agentPoolName = $.agentPoolName;
        this.count = $.count;
        this.location = $.location;
        this.os = $.os;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.tier = $.tier;
        this.virtualNetworkSubnetResourceId = $.virtualNetworkSubnetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentPoolArgs $;

        public Builder() {
            $ = new AgentPoolArgs();
        }

        public Builder(AgentPoolArgs defaults) {
            $ = new AgentPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentPoolName The name of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            $.agentPoolName = agentPoolName;
            return this;
        }

        /**
         * @param agentPoolName The name of the agent pool.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolName(String agentPoolName) {
            return agentPoolName(Output.of(agentPoolName));
        }

        /**
         * @param count The count of agent machine
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The count of agent machine
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param location The location of the resource. This cannot be changed after the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource. This cannot be changed after the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param os The OS of agent machine
         * 
         * @return builder
         * 
         */
        public Builder os(@Nullable Output<Either<String,OS>> os) {
            $.os = os;
            return this;
        }

        /**
         * @param os The OS of agent machine
         * 
         * @return builder
         * 
         */
        public Builder os(Either<String,OS> os) {
            return os(Output.of(os));
        }

        /**
         * @param os The OS of agent machine
         * 
         * @return builder
         * 
         */
        public Builder os(String os) {
            return os(Either.ofLeft(os));
        }

        /**
         * @param os The OS of agent machine
         * 
         * @return builder
         * 
         */
        public Builder os(OS os) {
            return os(Either.ofRight(os));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tier The Tier of agent machine
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The Tier of agent machine
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param virtualNetworkSubnetResourceId The Virtual Network Subnet Resource Id of the agent machine
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetResourceId(@Nullable Output<String> virtualNetworkSubnetResourceId) {
            $.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
            return this;
        }

        /**
         * @param virtualNetworkSubnetResourceId The Virtual Network Subnet Resource Id of the agent machine
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetResourceId(String virtualNetworkSubnetResourceId) {
            return virtualNetworkSubnetResourceId(Output.of(virtualNetworkSubnetResourceId));
        }

        public AgentPoolArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
