// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionRuntimePlatformArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRuntimePlatformArgs Empty = new TaskDefinitionRuntimePlatformArgs();

    @Import(name="cpuArchitecture")
    private @Nullable Output<String> cpuArchitecture;

    public Optional<Output<String>> cpuArchitecture() {
        return Optional.ofNullable(this.cpuArchitecture);
    }

    @Import(name="operatingSystemFamily")
    private @Nullable Output<String> operatingSystemFamily;

    public Optional<Output<String>> operatingSystemFamily() {
        return Optional.ofNullable(this.operatingSystemFamily);
    }

    private TaskDefinitionRuntimePlatformArgs() {}

    private TaskDefinitionRuntimePlatformArgs(TaskDefinitionRuntimePlatformArgs $) {
        this.cpuArchitecture = $.cpuArchitecture;
        this.operatingSystemFamily = $.operatingSystemFamily;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionRuntimePlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionRuntimePlatformArgs $;

        public Builder() {
            $ = new TaskDefinitionRuntimePlatformArgs();
        }

        public Builder(TaskDefinitionRuntimePlatformArgs defaults) {
            $ = new TaskDefinitionRuntimePlatformArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuArchitecture(@Nullable Output<String> cpuArchitecture) {
            $.cpuArchitecture = cpuArchitecture;
            return this;
        }

        public Builder cpuArchitecture(String cpuArchitecture) {
            return cpuArchitecture(Output.of(cpuArchitecture));
        }

        public Builder operatingSystemFamily(@Nullable Output<String> operatingSystemFamily) {
            $.operatingSystemFamily = operatingSystemFamily;
            return this;
        }

        public Builder operatingSystemFamily(String operatingSystemFamily) {
            return operatingSystemFamily(Output.of(operatingSystemFamily));
        }

        public TaskDefinitionRuntimePlatformArgs build() {
            return $;
        }
    }

}
