// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachineVirtualMachineConfigContainerImage {
    /**
     * @return The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    private final String repository;
    /**
     * @return The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    private final @Nullable String tag;

    @CustomType.Constructor
    private RuntimeVirtualMachineVirtualMachineConfigContainerImage(
        @CustomType.Parameter("repository") String repository,
        @CustomType.Parameter("tag") @Nullable String tag) {
        this.repository = repository;
        this.tag = tag;
    }

    /**
     * @return The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigContainerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repository;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigContainerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfigContainerImage build() {
            return new RuntimeVirtualMachineVirtualMachineConfigContainerImage(repository, tag);
        }
    }
}
