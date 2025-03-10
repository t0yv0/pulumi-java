// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.ModelDockerSectionResponseResponseBaseImageRegistry;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelEnvironmentDefinitionResponseResponseDocker {
    /**
     * @return Base Dockerfile used for Docker-based runs. Mutually exclusive with BaseImage.
     * 
     */
    private final @Nullable String baseDockerfile;
    /**
     * @return Base image used for Docker-based runs. Mutually exclusive with BaseDockerfile.
     * 
     */
    private final @Nullable String baseImage;
    /**
     * @return Image registry that contains the base image.
     * 
     */
    private final @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

    @CustomType.Constructor
    private ModelEnvironmentDefinitionResponseResponseDocker(
        @CustomType.Parameter("baseDockerfile") @Nullable String baseDockerfile,
        @CustomType.Parameter("baseImage") @Nullable String baseImage,
        @CustomType.Parameter("baseImageRegistry") @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
        this.baseDockerfile = baseDockerfile;
        this.baseImage = baseImage;
        this.baseImageRegistry = baseImageRegistry;
    }

    /**
     * @return Base Dockerfile used for Docker-based runs. Mutually exclusive with BaseImage.
     * 
     */
    public Optional<String> baseDockerfile() {
        return Optional.ofNullable(this.baseDockerfile);
    }
    /**
     * @return Base image used for Docker-based runs. Mutually exclusive with BaseDockerfile.
     * 
     */
    public Optional<String> baseImage() {
        return Optional.ofNullable(this.baseImage);
    }
    /**
     * @return Image registry that contains the base image.
     * 
     */
    public Optional<ModelDockerSectionResponseResponseBaseImageRegistry> baseImageRegistry() {
        return Optional.ofNullable(this.baseImageRegistry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseDockerfile;
        private @Nullable String baseImage;
        private @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDockerfile = defaults.baseDockerfile;
    	      this.baseImage = defaults.baseImage;
    	      this.baseImageRegistry = defaults.baseImageRegistry;
        }

        public Builder baseDockerfile(@Nullable String baseDockerfile) {
            this.baseDockerfile = baseDockerfile;
            return this;
        }
        public Builder baseImage(@Nullable String baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public Builder baseImageRegistry(@Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
            this.baseImageRegistry = baseImageRegistry;
            return this;
        }        public ModelEnvironmentDefinitionResponseResponseDocker build() {
            return new ModelEnvironmentDefinitionResponseResponseDocker(baseDockerfile, baseImage, baseImageRegistry);
        }
    }
}
