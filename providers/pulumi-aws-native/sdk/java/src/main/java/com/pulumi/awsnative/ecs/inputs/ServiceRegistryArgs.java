// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRegistryArgs Empty = new ServiceRegistryArgs();

    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    @Import(name="containerPort")
    private @Nullable Output<Integer> containerPort;

    public Optional<Output<Integer>> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="registryArn")
    private @Nullable Output<String> registryArn;

    public Optional<Output<String>> registryArn() {
        return Optional.ofNullable(this.registryArn);
    }

    private ServiceRegistryArgs() {}

    private ServiceRegistryArgs(ServiceRegistryArgs $) {
        this.containerName = $.containerName;
        this.containerPort = $.containerPort;
        this.port = $.port;
        this.registryArn = $.registryArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegistryArgs $;

        public Builder() {
            $ = new ServiceRegistryArgs();
        }

        public Builder(ServiceRegistryArgs defaults) {
            $ = new ServiceRegistryArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            $.containerPort = containerPort;
            return this;
        }

        public Builder containerPort(Integer containerPort) {
            return containerPort(Output.of(containerPort));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder registryArn(@Nullable Output<String> registryArn) {
            $.registryArn = registryArn;
            return this;
        }

        public Builder registryArn(String registryArn) {
            return registryArn(Output.of(registryArn));
        }

        public ServiceRegistryArgs build() {
            return $;
        }
    }

}
