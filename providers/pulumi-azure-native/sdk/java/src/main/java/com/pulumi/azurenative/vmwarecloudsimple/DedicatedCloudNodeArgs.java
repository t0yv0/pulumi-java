// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple;

import com.pulumi.azurenative.vmwarecloudsimple.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedCloudNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedCloudNodeArgs Empty = new DedicatedCloudNodeArgs();

    /**
     * Availability Zone id, e.g. &#34;az1&#34;
     * 
     */
    @Import(name="availabilityZoneId", required=true)
    private Output<String> availabilityZoneId;

    /**
     * @return Availability Zone id, e.g. &#34;az1&#34;
     * 
     */
    public Output<String> availabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * dedicated cloud node name
     * 
     */
    @Import(name="dedicatedCloudNodeName")
    private @Nullable Output<String> dedicatedCloudNodeName;

    /**
     * @return dedicated cloud node name
     * 
     */
    public Optional<Output<String>> dedicatedCloudNodeName() {
        return Optional.ofNullable(this.dedicatedCloudNodeName);
    }

    /**
     * SKU&#39;s id
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return SKU&#39;s id
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Azure region
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Azure region
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * SKU&#39;s name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return SKU&#39;s name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * count of nodes to create
     * 
     */
    @Import(name="nodesCount", required=true)
    private Output<Integer> nodesCount;

    /**
     * @return count of nodes to create
     * 
     */
    public Output<Integer> nodesCount() {
        return this.nodesCount;
    }

    /**
     * Placement Group id, e.g. &#34;n1&#34;
     * 
     */
    @Import(name="placementGroupId", required=true)
    private Output<String> placementGroupId;

    /**
     * @return Placement Group id, e.g. &#34;n1&#34;
     * 
     */
    public Output<String> placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * purchase id
     * 
     */
    @Import(name="purchaseId", required=true)
    private Output<String> purchaseId;

    /**
     * @return purchase id
     * 
     */
    public Output<String> purchaseId() {
        return this.purchaseId;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Dedicated Cloud Nodes SKU
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    /**
     * @return Dedicated Cloud Nodes SKU
     * 
     */
    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Dedicated Cloud Nodes tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Dedicated Cloud Nodes tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DedicatedCloudNodeArgs() {}

    private DedicatedCloudNodeArgs(DedicatedCloudNodeArgs $) {
        this.availabilityZoneId = $.availabilityZoneId;
        this.dedicatedCloudNodeName = $.dedicatedCloudNodeName;
        this.id = $.id;
        this.location = $.location;
        this.name = $.name;
        this.nodesCount = $.nodesCount;
        this.placementGroupId = $.placementGroupId;
        this.purchaseId = $.purchaseId;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedCloudNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedCloudNodeArgs $;

        public Builder() {
            $ = new DedicatedCloudNodeArgs();
        }

        public Builder(DedicatedCloudNodeArgs defaults) {
            $ = new DedicatedCloudNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZoneId Availability Zone id, e.g. &#34;az1&#34;
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneId(Output<String> availabilityZoneId) {
            $.availabilityZoneId = availabilityZoneId;
            return this;
        }

        /**
         * @param availabilityZoneId Availability Zone id, e.g. &#34;az1&#34;
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneId(String availabilityZoneId) {
            return availabilityZoneId(Output.of(availabilityZoneId));
        }

        /**
         * @param dedicatedCloudNodeName dedicated cloud node name
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCloudNodeName(@Nullable Output<String> dedicatedCloudNodeName) {
            $.dedicatedCloudNodeName = dedicatedCloudNodeName;
            return this;
        }

        /**
         * @param dedicatedCloudNodeName dedicated cloud node name
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCloudNodeName(String dedicatedCloudNodeName) {
            return dedicatedCloudNodeName(Output.of(dedicatedCloudNodeName));
        }

        /**
         * @param id SKU&#39;s id
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id SKU&#39;s id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Azure region
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Azure region
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name SKU&#39;s name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name SKU&#39;s name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodesCount count of nodes to create
         * 
         * @return builder
         * 
         */
        public Builder nodesCount(Output<Integer> nodesCount) {
            $.nodesCount = nodesCount;
            return this;
        }

        /**
         * @param nodesCount count of nodes to create
         * 
         * @return builder
         * 
         */
        public Builder nodesCount(Integer nodesCount) {
            return nodesCount(Output.of(nodesCount));
        }

        /**
         * @param placementGroupId Placement Group id, e.g. &#34;n1&#34;
         * 
         * @return builder
         * 
         */
        public Builder placementGroupId(Output<String> placementGroupId) {
            $.placementGroupId = placementGroupId;
            return this;
        }

        /**
         * @param placementGroupId Placement Group id, e.g. &#34;n1&#34;
         * 
         * @return builder
         * 
         */
        public Builder placementGroupId(String placementGroupId) {
            return placementGroupId(Output.of(placementGroupId));
        }

        /**
         * @param purchaseId purchase id
         * 
         * @return builder
         * 
         */
        public Builder purchaseId(Output<String> purchaseId) {
            $.purchaseId = purchaseId;
            return this;
        }

        /**
         * @param purchaseId purchase id
         * 
         * @return builder
         * 
         */
        public Builder purchaseId(String purchaseId) {
            return purchaseId(Output.of(purchaseId));
        }

        /**
         * @param resourceGroupName The name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Dedicated Cloud Nodes SKU
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Dedicated Cloud Nodes SKU
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Dedicated Cloud Nodes tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Dedicated Cloud Nodes tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DedicatedCloudNodeArgs build() {
            $.availabilityZoneId = Objects.requireNonNull($.availabilityZoneId, "expected parameter 'availabilityZoneId' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.nodesCount = Objects.requireNonNull($.nodesCount, "expected parameter 'nodesCount' to be non-null");
            $.placementGroupId = Objects.requireNonNull($.placementGroupId, "expected parameter 'placementGroupId' to be non-null");
            $.purchaseId = Objects.requireNonNull($.purchaseId, "expected parameter 'purchaseId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
