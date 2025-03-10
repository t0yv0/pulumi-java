// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.BuilderConfigArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.MetadataArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.RecipeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InTotoProvenanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InTotoProvenanceArgs Empty = new InTotoProvenanceArgs();

    /**
     * required
     * 
     */
    @Import(name="builderConfig")
    private @Nullable Output<BuilderConfigArgs> builderConfig;

    /**
     * @return required
     * 
     */
    public Optional<Output<BuilderConfigArgs>> builderConfig() {
        return Optional.ofNullable(this.builderConfig);
    }

    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    @Import(name="materials")
    private @Nullable Output<List<String>> materials;

    /**
     * @return The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    public Optional<Output<List<String>>> materials() {
        return Optional.ofNullable(this.materials);
    }

    @Import(name="metadata")
    private @Nullable Output<MetadataArgs> metadata;

    public Optional<Output<MetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    @Import(name="recipe")
    private @Nullable Output<RecipeArgs> recipe;

    /**
     * @return Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    public Optional<Output<RecipeArgs>> recipe() {
        return Optional.ofNullable(this.recipe);
    }

    private InTotoProvenanceArgs() {}

    private InTotoProvenanceArgs(InTotoProvenanceArgs $) {
        this.builderConfig = $.builderConfig;
        this.materials = $.materials;
        this.metadata = $.metadata;
        this.recipe = $.recipe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InTotoProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InTotoProvenanceArgs $;

        public Builder() {
            $ = new InTotoProvenanceArgs();
        }

        public Builder(InTotoProvenanceArgs defaults) {
            $ = new InTotoProvenanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param builderConfig required
         * 
         * @return builder
         * 
         */
        public Builder builderConfig(@Nullable Output<BuilderConfigArgs> builderConfig) {
            $.builderConfig = builderConfig;
            return this;
        }

        /**
         * @param builderConfig required
         * 
         * @return builder
         * 
         */
        public Builder builderConfig(BuilderConfigArgs builderConfig) {
            return builderConfig(Output.of(builderConfig));
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(@Nullable Output<List<String>> materials) {
            $.materials = materials;
            return this;
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(List<String> materials) {
            return materials(Output.of(materials));
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(String... materials) {
            return materials(List.of(materials));
        }

        public Builder metadata(@Nullable Output<MetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(MetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param recipe Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
         * 
         * @return builder
         * 
         */
        public Builder recipe(@Nullable Output<RecipeArgs> recipe) {
            $.recipe = recipe;
            return this;
        }

        /**
         * @param recipe Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
         * 
         * @return builder
         * 
         */
        public Builder recipe(RecipeArgs recipe) {
            return recipe(Output.of(recipe));
        }

        public InTotoProvenanceArgs build() {
            return $;
        }
    }

}
