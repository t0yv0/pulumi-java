// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionMountPoint {
    private final @Nullable String containerPath;
    private final @Nullable Boolean readOnly;
    private final @Nullable String sourceVolume;

    @CustomType.Constructor
    private TaskDefinitionMountPoint(
        @CustomType.Parameter("containerPath") @Nullable String containerPath,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("sourceVolume") @Nullable String sourceVolume) {
        this.containerPath = containerPath;
        this.readOnly = readOnly;
        this.sourceVolume = sourceVolume;
    }

    public Optional<String> containerPath() {
        return Optional.ofNullable(this.containerPath);
    }
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> sourceVolume() {
        return Optional.ofNullable(this.sourceVolume);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionMountPoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerPath;
        private @Nullable Boolean readOnly;
        private @Nullable String sourceVolume;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionMountPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.readOnly = defaults.readOnly;
    	      this.sourceVolume = defaults.sourceVolume;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = containerPath;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder sourceVolume(@Nullable String sourceVolume) {
            this.sourceVolume = sourceVolume;
            return this;
        }        public TaskDefinitionMountPoint build() {
            return new TaskDefinitionMountPoint(containerPath, readOnly, sourceVolume);
        }
    }
}
