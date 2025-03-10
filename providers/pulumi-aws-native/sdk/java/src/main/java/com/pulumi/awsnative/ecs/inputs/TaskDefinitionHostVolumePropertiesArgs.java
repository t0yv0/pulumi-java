// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionHostVolumePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionHostVolumePropertiesArgs Empty = new TaskDefinitionHostVolumePropertiesArgs();

    @Import(name="sourcePath")
    private @Nullable Output<String> sourcePath;

    public Optional<Output<String>> sourcePath() {
        return Optional.ofNullable(this.sourcePath);
    }

    private TaskDefinitionHostVolumePropertiesArgs() {}

    private TaskDefinitionHostVolumePropertiesArgs(TaskDefinitionHostVolumePropertiesArgs $) {
        this.sourcePath = $.sourcePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionHostVolumePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionHostVolumePropertiesArgs $;

        public Builder() {
            $ = new TaskDefinitionHostVolumePropertiesArgs();
        }

        public Builder(TaskDefinitionHostVolumePropertiesArgs defaults) {
            $ = new TaskDefinitionHostVolumePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourcePath(@Nullable Output<String> sourcePath) {
            $.sourcePath = sourcePath;
            return this;
        }

        public Builder sourcePath(String sourcePath) {
            return sourcePath(Output.of(sourcePath));
        }

        public TaskDefinitionHostVolumePropertiesArgs build() {
            return $;
        }
    }

}
