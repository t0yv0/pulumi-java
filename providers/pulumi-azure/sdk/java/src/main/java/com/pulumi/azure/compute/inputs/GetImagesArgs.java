// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesArgs Empty = new GetImagesArgs();

    /**
     * The name of the Resource Group in which the Image exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Image exists.
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

    private GetImagesArgs() {}

    private GetImagesArgs(GetImagesArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.tagsFilter = $.tagsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesArgs $;

        public Builder() {
            $ = new GetImagesArgs();
        }

        public Builder(GetImagesArgs defaults) {
            $ = new GetImagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Image exists.
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

        public GetImagesArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
