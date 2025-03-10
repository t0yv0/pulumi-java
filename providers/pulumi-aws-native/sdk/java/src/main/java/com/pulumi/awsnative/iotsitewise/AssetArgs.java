// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.iotsitewise.inputs.AssetHierarchyArgs;
import com.pulumi.awsnative.iotsitewise.inputs.AssetPropertyArgs;
import com.pulumi.awsnative.iotsitewise.inputs.AssetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetArgs Empty = new AssetArgs();

    @Import(name="assetHierarchies")
    private @Nullable Output<List<AssetHierarchyArgs>> assetHierarchies;

    public Optional<Output<List<AssetHierarchyArgs>>> assetHierarchies() {
        return Optional.ofNullable(this.assetHierarchies);
    }

    /**
     * The ID of the asset model from which to create the asset.
     * 
     */
    @Import(name="assetModelId", required=true)
    private Output<String> assetModelId;

    /**
     * @return The ID of the asset model from which to create the asset.
     * 
     */
    public Output<String> assetModelId() {
        return this.assetModelId;
    }

    /**
     * A unique, friendly name for the asset.
     * 
     */
    @Import(name="assetName")
    private @Nullable Output<String> assetName;

    /**
     * @return A unique, friendly name for the asset.
     * 
     */
    public Optional<Output<String>> assetName() {
        return Optional.ofNullable(this.assetName);
    }

    @Import(name="assetProperties")
    private @Nullable Output<List<AssetPropertyArgs>> assetProperties;

    public Optional<Output<List<AssetPropertyArgs>>> assetProperties() {
        return Optional.ofNullable(this.assetProperties);
    }

    /**
     * A list of key-value pairs that contain metadata for the asset.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<AssetTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset.
     * 
     */
    public Optional<Output<List<AssetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AssetArgs() {}

    private AssetArgs(AssetArgs $) {
        this.assetHierarchies = $.assetHierarchies;
        this.assetModelId = $.assetModelId;
        this.assetName = $.assetName;
        this.assetProperties = $.assetProperties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetArgs $;

        public Builder() {
            $ = new AssetArgs();
        }

        public Builder(AssetArgs defaults) {
            $ = new AssetArgs(Objects.requireNonNull(defaults));
        }

        public Builder assetHierarchies(@Nullable Output<List<AssetHierarchyArgs>> assetHierarchies) {
            $.assetHierarchies = assetHierarchies;
            return this;
        }

        public Builder assetHierarchies(List<AssetHierarchyArgs> assetHierarchies) {
            return assetHierarchies(Output.of(assetHierarchies));
        }

        public Builder assetHierarchies(AssetHierarchyArgs... assetHierarchies) {
            return assetHierarchies(List.of(assetHierarchies));
        }

        /**
         * @param assetModelId The ID of the asset model from which to create the asset.
         * 
         * @return builder
         * 
         */
        public Builder assetModelId(Output<String> assetModelId) {
            $.assetModelId = assetModelId;
            return this;
        }

        /**
         * @param assetModelId The ID of the asset model from which to create the asset.
         * 
         * @return builder
         * 
         */
        public Builder assetModelId(String assetModelId) {
            return assetModelId(Output.of(assetModelId));
        }

        /**
         * @param assetName A unique, friendly name for the asset.
         * 
         * @return builder
         * 
         */
        public Builder assetName(@Nullable Output<String> assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param assetName A unique, friendly name for the asset.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            return assetName(Output.of(assetName));
        }

        public Builder assetProperties(@Nullable Output<List<AssetPropertyArgs>> assetProperties) {
            $.assetProperties = assetProperties;
            return this;
        }

        public Builder assetProperties(List<AssetPropertyArgs> assetProperties) {
            return assetProperties(Output.of(assetProperties));
        }

        public Builder assetProperties(AssetPropertyArgs... assetProperties) {
            return assetProperties(List.of(assetProperties));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<AssetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<AssetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset.
         * 
         * @return builder
         * 
         */
        public Builder tags(AssetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AssetArgs build() {
            $.assetModelId = Objects.requireNonNull($.assetModelId, "expected parameter 'assetModelId' to be non-null");
            return $;
        }
    }

}
