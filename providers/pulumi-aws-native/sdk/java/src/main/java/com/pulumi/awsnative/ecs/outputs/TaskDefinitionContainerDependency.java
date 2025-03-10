// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionContainerDependency {
    private final @Nullable String condition;
    private final @Nullable String containerName;

    @CustomType.Constructor
    private TaskDefinitionContainerDependency(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("containerName") @Nullable String containerName) {
        this.condition = condition;
        this.containerName = containerName;
    }

    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionContainerDependency defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private @Nullable String containerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionContainerDependency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.containerName = defaults.containerName;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }        public TaskDefinitionContainerDependency build() {
            return new TaskDefinitionContainerDependency(condition, containerName);
        }
    }
}
