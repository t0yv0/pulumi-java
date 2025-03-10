// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSharedImageVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedImageVersionsArgs Empty = new GetSharedImageVersionsArgs();

    /**
     * The name of the Shared Image in which the Shared Image exists.
     * 
     */
    @Import(name="galleryName", required=true)
    private String galleryName;

    /**
     * @return The name of the Shared Image in which the Shared Image exists.
     * 
     */
    public String galleryName() {
        return this.galleryName;
    }

    /**
     * The name of the Shared Image in which this Version exists.
     * 
     */
    @Import(name="imageName", required=true)
    private String imageName;

    /**
     * @return The name of the Shared Image in which this Version exists.
     * 
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * The name of the Resource Group in which the Shared Image Gallery exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Shared Image Gallery exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to filter the list of images against.
     * 
     */
    @Import(name="tagsFilter")
    private @Nullable Map<String,String> tagsFilter;

    /**
     * @return A mapping of tags to filter the list of images against.
     * 
     */
    public Optional<Map<String,String>> tagsFilter() {
        return Optional.ofNullable(this.tagsFilter);
    }

    private GetSharedImageVersionsArgs() {}

    private GetSharedImageVersionsArgs(GetSharedImageVersionsArgs $) {
        this.galleryName = $.galleryName;
        this.imageName = $.imageName;
        this.resourceGroupName = $.resourceGroupName;
        this.tagsFilter = $.tagsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedImageVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedImageVersionsArgs $;

        public Builder() {
            $ = new GetSharedImageVersionsArgs();
        }

        public Builder(GetSharedImageVersionsArgs defaults) {
            $ = new GetSharedImageVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryName The name of the Shared Image in which the Shared Image exists.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param imageName The name of the Shared Image in which this Version exists.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Shared Image Gallery exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tagsFilter A mapping of tags to filter the list of images against.
         * 
         * @return builder
         * 
         */
        public Builder tagsFilter(@Nullable Map<String,String> tagsFilter) {
            $.tagsFilter = tagsFilter;
            return this;
        }

        public GetSharedImageVersionsArgs build() {
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
