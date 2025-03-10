// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.communication;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CommunicationServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommunicationServiceArgs Empty = new CommunicationServiceArgs();

    /**
     * The name of the CommunicationService resource.
     * 
     */
    @Import(name="communicationServiceName")
    private @Nullable Output<String> communicationServiceName;

    /**
     * @return The name of the CommunicationService resource.
     * 
     */
    public Optional<Output<String>> communicationServiceName() {
        return Optional.ofNullable(this.communicationServiceName);
    }

    /**
     * The location where the communication service stores its data at rest.
     * 
     */
    @Import(name="dataLocation", required=true)
    private Output<String> dataLocation;

    /**
     * @return The location where the communication service stores its data at rest.
     * 
     */
    public Output<String> dataLocation() {
        return this.dataLocation;
    }

    /**
     * The Azure location where the CommunicationService is running.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where the CommunicationService is running.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CommunicationServiceArgs() {}

    private CommunicationServiceArgs(CommunicationServiceArgs $) {
        this.communicationServiceName = $.communicationServiceName;
        this.dataLocation = $.dataLocation;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommunicationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommunicationServiceArgs $;

        public Builder() {
            $ = new CommunicationServiceArgs();
        }

        public Builder(CommunicationServiceArgs defaults) {
            $ = new CommunicationServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param communicationServiceName The name of the CommunicationService resource.
         * 
         * @return builder
         * 
         */
        public Builder communicationServiceName(@Nullable Output<String> communicationServiceName) {
            $.communicationServiceName = communicationServiceName;
            return this;
        }

        /**
         * @param communicationServiceName The name of the CommunicationService resource.
         * 
         * @return builder
         * 
         */
        public Builder communicationServiceName(String communicationServiceName) {
            return communicationServiceName(Output.of(communicationServiceName));
        }

        /**
         * @param dataLocation The location where the communication service stores its data at rest.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(Output<String> dataLocation) {
            $.dataLocation = dataLocation;
            return this;
        }

        /**
         * @param dataLocation The location where the communication service stores its data at rest.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(String dataLocation) {
            return dataLocation(Output.of(dataLocation));
        }

        /**
         * @param location The Azure location where the CommunicationService is running.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where the CommunicationService is running.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Tags of the service which is a list of key value pairs that describe the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags of the service which is a list of key value pairs that describe the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CommunicationServiceArgs build() {
            $.dataLocation = Objects.requireNonNull($.dataLocation, "expected parameter 'dataLocation' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
