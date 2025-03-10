// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink;

import com.pulumi.azure.privatelink.inputs.EndpointPrivateDnsZoneGroupArgs;
import com.pulumi.azure.privatelink.inputs.EndpointPrivateServiceConnectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `private_dns_zone_group` block as defined below.
     * 
     */
    @Import(name="privateDnsZoneGroup")
    private @Nullable Output<EndpointPrivateDnsZoneGroupArgs> privateDnsZoneGroup;

    /**
     * @return A `private_dns_zone_group` block as defined below.
     * 
     */
    public Optional<Output<EndpointPrivateDnsZoneGroupArgs>> privateDnsZoneGroup() {
        return Optional.ofNullable(this.privateDnsZoneGroup);
    }

    /**
     * A `private_service_connection` block as defined below.
     * 
     */
    @Import(name="privateServiceConnection", required=true)
    private Output<EndpointPrivateServiceConnectionArgs> privateServiceConnection;

    /**
     * @return A `private_service_connection` block as defined below.
     * 
     */
    public Output<EndpointPrivateServiceConnectionArgs> privateServiceConnection() {
        return this.privateServiceConnection;
    }

    /**
     * Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.privateDnsZoneGroup = $.privateDnsZoneGroup;
        this.privateServiceConnection = $.privateServiceConnection;
        this.resourceGroupName = $.resourceGroupName;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateDnsZoneGroup A `private_dns_zone_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneGroup(@Nullable Output<EndpointPrivateDnsZoneGroupArgs> privateDnsZoneGroup) {
            $.privateDnsZoneGroup = privateDnsZoneGroup;
            return this;
        }

        /**
         * @param privateDnsZoneGroup A `private_dns_zone_group` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneGroup(EndpointPrivateDnsZoneGroupArgs privateDnsZoneGroup) {
            return privateDnsZoneGroup(Output.of(privateDnsZoneGroup));
        }

        /**
         * @param privateServiceConnection A `private_service_connection` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateServiceConnection(Output<EndpointPrivateServiceConnectionArgs> privateServiceConnection) {
            $.privateServiceConnection = privateServiceConnection;
            return this;
        }

        /**
         * @param privateServiceConnection A `private_service_connection` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateServiceConnection(EndpointPrivateServiceConnectionArgs privateServiceConnection) {
            return privateServiceConnection(Output.of(privateServiceConnection));
        }

        /**
         * @param resourceGroupName Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subnetId The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public EndpointArgs build() {
            $.privateServiceConnection = Objects.requireNonNull($.privateServiceConnection, "expected parameter 'privateServiceConnection' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
