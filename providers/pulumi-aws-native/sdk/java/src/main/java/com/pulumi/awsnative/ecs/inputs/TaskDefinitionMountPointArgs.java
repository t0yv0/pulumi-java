// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionMountPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionMountPointArgs Empty = new TaskDefinitionMountPointArgs();

    @Import(name="containerPath")
    private @Nullable Output<String> containerPath;

    public Optional<Output<String>> containerPath() {
        return Optional.ofNullable(this.containerPath);
    }

    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    @Import(name="sourceVolume")
    private @Nullable Output<String> sourceVolume;

    public Optional<Output<String>> sourceVolume() {
        return Optional.ofNullable(this.sourceVolume);
    }

    private TaskDefinitionMountPointArgs() {}

    private TaskDefinitionMountPointArgs(TaskDefinitionMountPointArgs $) {
        this.containerPath = $.containerPath;
        this.readOnly = $.readOnly;
        this.sourceVolume = $.sourceVolume;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionMountPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionMountPointArgs $;

        public Builder() {
            $ = new TaskDefinitionMountPointArgs();
        }

        public Builder(TaskDefinitionMountPointArgs defaults) {
            $ = new TaskDefinitionMountPointArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerPath(@Nullable Output<String> containerPath) {
            $.containerPath = containerPath;
            return this;
        }

        public Builder containerPath(String containerPath) {
            return containerPath(Output.of(containerPath));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder sourceVolume(@Nullable Output<String> sourceVolume) {
            $.sourceVolume = sourceVolume;
            return this;
        }

        public Builder sourceVolume(String sourceVolume) {
            return sourceVolume(Output.of(sourceVolume));
        }

        public TaskDefinitionMountPointArgs build() {
            return $;
        }
    }

}
