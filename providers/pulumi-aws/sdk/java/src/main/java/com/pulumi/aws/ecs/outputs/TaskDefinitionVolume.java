// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.aws.ecs.outputs.TaskDefinitionVolumeDockerVolumeConfiguration;
import com.pulumi.aws.ecs.outputs.TaskDefinitionVolumeEfsVolumeConfiguration;
import com.pulumi.aws.ecs.outputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionVolume {
    /**
     * @return Configuration block to configure a docker volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
    /**
     * @return Configuration block for an EFS volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
    /**
     * @return Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
    /**
     * @return Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
     */
    private final @Nullable String hostPath;
    /**
     * @return Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private TaskDefinitionVolume(
        @CustomType.Parameter("dockerVolumeConfiguration") @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration,
        @CustomType.Parameter("efsVolumeConfiguration") @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration,
        @CustomType.Parameter("fsxWindowsFileServerVolumeConfiguration") @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration,
        @CustomType.Parameter("hostPath") @Nullable String hostPath,
        @CustomType.Parameter("name") String name) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        this.efsVolumeConfiguration = efsVolumeConfiguration;
        this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
        this.hostPath = hostPath;
        this.name = name;
    }

    /**
     * @return Configuration block to configure a docker volume. Detailed below.
     * 
     */
    public Optional<TaskDefinitionVolumeDockerVolumeConfiguration> dockerVolumeConfiguration() {
        return Optional.ofNullable(this.dockerVolumeConfiguration);
    }
    /**
     * @return Configuration block for an EFS volume. Detailed below.
     * 
     */
    public Optional<TaskDefinitionVolumeEfsVolumeConfiguration> efsVolumeConfiguration() {
        return Optional.ofNullable(this.efsVolumeConfiguration);
    }
    /**
     * @return Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
     */
    public Optional<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration> fsxWindowsFileServerVolumeConfiguration() {
        return Optional.ofNullable(this.fsxWindowsFileServerVolumeConfiguration);
    }
    /**
     * @return Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
     */
    public Optional<String> hostPath() {
        return Optional.ofNullable(this.hostPath);
    }
    /**
     * @return Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
        private @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
        private @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
        private @Nullable String hostPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerVolumeConfiguration = defaults.dockerVolumeConfiguration;
    	      this.efsVolumeConfiguration = defaults.efsVolumeConfiguration;
    	      this.fsxWindowsFileServerVolumeConfiguration = defaults.fsxWindowsFileServerVolumeConfiguration;
    	      this.hostPath = defaults.hostPath;
    	      this.name = defaults.name;
        }

        public Builder dockerVolumeConfiguration(@Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }
        public Builder efsVolumeConfiguration(@Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration) {
            this.efsVolumeConfiguration = efsVolumeConfiguration;
            return this;
        }
        public Builder fsxWindowsFileServerVolumeConfiguration(@Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
            return this;
        }
        public Builder hostPath(@Nullable String hostPath) {
            this.hostPath = hostPath;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public TaskDefinitionVolume build() {
            return new TaskDefinitionVolume(dockerVolumeConfiguration, efsVolumeConfiguration, fsxWindowsFileServerVolumeConfiguration, hostPath, name);
        }
    }
}
