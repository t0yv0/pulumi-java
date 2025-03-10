// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.RestorePointCollectionSourcePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePointCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePointCollectionArgs Empty = new RestorePointCollectionArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the restore point collection.
     * 
     */
    @Import(name="restorePointCollectionName")
    private @Nullable Output<String> restorePointCollectionName;

    /**
     * @return The name of the restore point collection.
     * 
     */
    public Optional<Output<String>> restorePointCollectionName() {
        return Optional.ofNullable(this.restorePointCollectionName);
    }

    /**
     * The properties of the source resource that this restore point collection is created from.
     * 
     */
    @Import(name="source")
    private @Nullable Output<RestorePointCollectionSourcePropertiesArgs> source;

    /**
     * @return The properties of the source resource that this restore point collection is created from.
     * 
     */
    public Optional<Output<RestorePointCollectionSourcePropertiesArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RestorePointCollectionArgs() {}

    private RestorePointCollectionArgs(RestorePointCollectionArgs $) {
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.restorePointCollectionName = $.restorePointCollectionName;
        this.source = $.source;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePointCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePointCollectionArgs $;

        public Builder() {
            $ = new RestorePointCollectionArgs();
        }

        public Builder(RestorePointCollectionArgs defaults) {
            $ = new RestorePointCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param restorePointCollectionName The name of the restore point collection.
         * 
         * @return builder
         * 
         */
        public Builder restorePointCollectionName(@Nullable Output<String> restorePointCollectionName) {
            $.restorePointCollectionName = restorePointCollectionName;
            return this;
        }

        /**
         * @param restorePointCollectionName The name of the restore point collection.
         * 
         * @return builder
         * 
         */
        public Builder restorePointCollectionName(String restorePointCollectionName) {
            return restorePointCollectionName(Output.of(restorePointCollectionName));
        }

        /**
         * @param source The properties of the source resource that this restore point collection is created from.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<RestorePointCollectionSourcePropertiesArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The properties of the source resource that this restore point collection is created from.
         * 
         * @return builder
         * 
         */
        public Builder source(RestorePointCollectionSourcePropertiesArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RestorePointCollectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
