// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AssetModelCompositeModel;
import com.pulumi.awsnative.iotsitewise.outputs.AssetModelHierarchy;
import com.pulumi.awsnative.iotsitewise.outputs.AssetModelProperty;
import com.pulumi.awsnative.iotsitewise.outputs.AssetModelTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetModelResult {
    /**
     * @return The ARN of the asset model, which has the following format.
     * 
     */
    private final @Nullable String assetModelArn;
    /**
     * @return The composite asset models that are part of this asset model. Composite asset models are asset models that contain specific properties.
     * 
     */
    private final @Nullable List<AssetModelCompositeModel> assetModelCompositeModels;
    /**
     * @return A description for the asset model.
     * 
     */
    private final @Nullable String assetModelDescription;
    /**
     * @return The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. You can specify up to 10 hierarchies per asset model.
     * 
     */
    private final @Nullable List<AssetModelHierarchy> assetModelHierarchies;
    /**
     * @return The ID of the asset model.
     * 
     */
    private final @Nullable String assetModelId;
    /**
     * @return A unique, friendly name for the asset model.
     * 
     */
    private final @Nullable String assetModelName;
    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    private final @Nullable List<AssetModelProperty> assetModelProperties;
    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    private final @Nullable List<AssetModelTag> tags;

    @CustomType.Constructor
    private GetAssetModelResult(
        @CustomType.Parameter("assetModelArn") @Nullable String assetModelArn,
        @CustomType.Parameter("assetModelCompositeModels") @Nullable List<AssetModelCompositeModel> assetModelCompositeModels,
        @CustomType.Parameter("assetModelDescription") @Nullable String assetModelDescription,
        @CustomType.Parameter("assetModelHierarchies") @Nullable List<AssetModelHierarchy> assetModelHierarchies,
        @CustomType.Parameter("assetModelId") @Nullable String assetModelId,
        @CustomType.Parameter("assetModelName") @Nullable String assetModelName,
        @CustomType.Parameter("assetModelProperties") @Nullable List<AssetModelProperty> assetModelProperties,
        @CustomType.Parameter("tags") @Nullable List<AssetModelTag> tags) {
        this.assetModelArn = assetModelArn;
        this.assetModelCompositeModels = assetModelCompositeModels;
        this.assetModelDescription = assetModelDescription;
        this.assetModelHierarchies = assetModelHierarchies;
        this.assetModelId = assetModelId;
        this.assetModelName = assetModelName;
        this.assetModelProperties = assetModelProperties;
        this.tags = tags;
    }

    /**
     * @return The ARN of the asset model, which has the following format.
     * 
     */
    public Optional<String> assetModelArn() {
        return Optional.ofNullable(this.assetModelArn);
    }
    /**
     * @return The composite asset models that are part of this asset model. Composite asset models are asset models that contain specific properties.
     * 
     */
    public List<AssetModelCompositeModel> assetModelCompositeModels() {
        return this.assetModelCompositeModels == null ? List.of() : this.assetModelCompositeModels;
    }
    /**
     * @return A description for the asset model.
     * 
     */
    public Optional<String> assetModelDescription() {
        return Optional.ofNullable(this.assetModelDescription);
    }
    /**
     * @return The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. You can specify up to 10 hierarchies per asset model.
     * 
     */
    public List<AssetModelHierarchy> assetModelHierarchies() {
        return this.assetModelHierarchies == null ? List.of() : this.assetModelHierarchies;
    }
    /**
     * @return The ID of the asset model.
     * 
     */
    public Optional<String> assetModelId() {
        return Optional.ofNullable(this.assetModelId);
    }
    /**
     * @return A unique, friendly name for the asset model.
     * 
     */
    public Optional<String> assetModelName() {
        return Optional.ofNullable(this.assetModelName);
    }
    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    public List<AssetModelProperty> assetModelProperties() {
        return this.assetModelProperties == null ? List.of() : this.assetModelProperties;
    }
    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public List<AssetModelTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetModelArn;
        private @Nullable List<AssetModelCompositeModel> assetModelCompositeModels;
        private @Nullable String assetModelDescription;
        private @Nullable List<AssetModelHierarchy> assetModelHierarchies;
        private @Nullable String assetModelId;
        private @Nullable String assetModelName;
        private @Nullable List<AssetModelProperty> assetModelProperties;
        private @Nullable List<AssetModelTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetModelArn = defaults.assetModelArn;
    	      this.assetModelCompositeModels = defaults.assetModelCompositeModels;
    	      this.assetModelDescription = defaults.assetModelDescription;
    	      this.assetModelHierarchies = defaults.assetModelHierarchies;
    	      this.assetModelId = defaults.assetModelId;
    	      this.assetModelName = defaults.assetModelName;
    	      this.assetModelProperties = defaults.assetModelProperties;
    	      this.tags = defaults.tags;
        }

        public Builder assetModelArn(@Nullable String assetModelArn) {
            this.assetModelArn = assetModelArn;
            return this;
        }
        public Builder assetModelCompositeModels(@Nullable List<AssetModelCompositeModel> assetModelCompositeModels) {
            this.assetModelCompositeModels = assetModelCompositeModels;
            return this;
        }
        public Builder assetModelCompositeModels(AssetModelCompositeModel... assetModelCompositeModels) {
            return assetModelCompositeModels(List.of(assetModelCompositeModels));
        }
        public Builder assetModelDescription(@Nullable String assetModelDescription) {
            this.assetModelDescription = assetModelDescription;
            return this;
        }
        public Builder assetModelHierarchies(@Nullable List<AssetModelHierarchy> assetModelHierarchies) {
            this.assetModelHierarchies = assetModelHierarchies;
            return this;
        }
        public Builder assetModelHierarchies(AssetModelHierarchy... assetModelHierarchies) {
            return assetModelHierarchies(List.of(assetModelHierarchies));
        }
        public Builder assetModelId(@Nullable String assetModelId) {
            this.assetModelId = assetModelId;
            return this;
        }
        public Builder assetModelName(@Nullable String assetModelName) {
            this.assetModelName = assetModelName;
            return this;
        }
        public Builder assetModelProperties(@Nullable List<AssetModelProperty> assetModelProperties) {
            this.assetModelProperties = assetModelProperties;
            return this;
        }
        public Builder assetModelProperties(AssetModelProperty... assetModelProperties) {
            return assetModelProperties(List.of(assetModelProperties));
        }
        public Builder tags(@Nullable List<AssetModelTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AssetModelTag... tags) {
            return tags(List.of(tags));
        }        public GetAssetModelResult build() {
            return new GetAssetModelResult(assetModelArn, assetModelCompositeModels, assetModelDescription, assetModelHierarchies, assetModelId, assetModelName, assetModelProperties, tags);
        }
    }
}
