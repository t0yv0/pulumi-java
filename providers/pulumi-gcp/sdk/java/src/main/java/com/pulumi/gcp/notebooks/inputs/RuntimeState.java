// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeMetricArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeState extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeState Empty = new RuntimeState();

    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="accessConfig")
    private @Nullable Output<RuntimeAccessConfigArgs> accessConfig;

    /**
     * @return The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeAccessConfigArgs>> accessConfig() {
        return Optional.ofNullable(this.accessConfig);
    }

    /**
     * The health state of this runtime. For a list of possible output values, see
     * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
     * 
     */
    @Import(name="healthState")
    private @Nullable Output<String> healthState;

    /**
     * @return The health state of this runtime. For a list of possible output values, see
     * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
     * 
     */
    public Optional<Output<String>> healthState() {
        return Optional.ofNullable(this.healthState);
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return A reference to the zone where the machine resides.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<RuntimeMetricArgs>> metrics;

    /**
     * @return Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    public Optional<Output<List<RuntimeMetricArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name specified for the Notebook instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="softwareConfig")
    private @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;

    /**
     * @return The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeSoftwareConfigArgs>> softwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }

    /**
     * The state of this runtime.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of this runtime.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<RuntimeVirtualMachineArgs> virtualMachine;

    /**
     * @return Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeVirtualMachineArgs>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private RuntimeState() {}

    private RuntimeState(RuntimeState $) {
        this.accessConfig = $.accessConfig;
        this.healthState = $.healthState;
        this.location = $.location;
        this.metrics = $.metrics;
        this.name = $.name;
        this.project = $.project;
        this.softwareConfig = $.softwareConfig;
        this.state = $.state;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeState $;

        public Builder() {
            $ = new RuntimeState();
        }

        public Builder(RuntimeState defaults) {
            $ = new RuntimeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConfig The config settings for accessing runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigArgs> accessConfig) {
            $.accessConfig = accessConfig;
            return this;
        }

        /**
         * @param accessConfig The config settings for accessing runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessConfig(RuntimeAccessConfigArgs accessConfig) {
            return accessConfig(Output.of(accessConfig));
        }

        /**
         * @param healthState The health state of this runtime. For a list of possible output values, see
         * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
         * 
         * @return builder
         * 
         */
        public Builder healthState(@Nullable Output<String> healthState) {
            $.healthState = healthState;
            return this;
        }

        /**
         * @param healthState The health state of this runtime. For a list of possible output values, see
         * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
         * 
         * @return builder
         * 
         */
        public Builder healthState(String healthState) {
            return healthState(Output.of(healthState));
        }

        /**
         * @param location A reference to the zone where the machine resides.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location A reference to the zone where the machine resides.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metrics Contains Runtime daemon metrics such as Service status and JupyterLab status
         * 
         * @return builder
         * 
         */
        public Builder metrics(@Nullable Output<List<RuntimeMetricArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        /**
         * @param metrics Contains Runtime daemon metrics such as Service status and JupyterLab status
         * 
         * @return builder
         * 
         */
        public Builder metrics(List<RuntimeMetricArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        /**
         * @param metrics Contains Runtime daemon metrics such as Service status and JupyterLab status
         * 
         * @return builder
         * 
         */
        public Builder metrics(RuntimeMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }

        /**
         * @param name The name specified for the Notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name specified for the Notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param softwareConfig The config settings for software inside the runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig) {
            $.softwareConfig = softwareConfig;
            return this;
        }

        /**
         * @param softwareConfig The config settings for software inside the runtime.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder softwareConfig(RuntimeSoftwareConfigArgs softwareConfig) {
            return softwareConfig(Output.of(softwareConfig));
        }

        /**
         * @param state The state of this runtime.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of this runtime.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param virtualMachine Use a Compute Engine VM image to start the managed notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(@Nullable Output<RuntimeVirtualMachineArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        /**
         * @param virtualMachine Use a Compute Engine VM image to start the managed notebook instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(RuntimeVirtualMachineArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public RuntimeState build() {
            return $;
        }
    }

}
