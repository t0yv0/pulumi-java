// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.InstanceTemplateSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceTemplateScheduling {
    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    private final @Nullable Boolean automaticRestart;
    private final @Nullable Integer minNodeCpus;
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    private final @Nullable List<InstanceTemplateSchedulingNodeAffinity> nodeAffinities;
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    private final @Nullable String onHostMaintenance;
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    private final @Nullable Boolean preemptible;
    /**
     * @return Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
     * `preemptible` should be `true` and `auto_restart` should be
     * `false`. For more info about
     * `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
     * 
     */
    private final @Nullable String provisioningModel;

    @CustomType.Constructor
    private InstanceTemplateScheduling(
        @CustomType.Parameter("automaticRestart") @Nullable Boolean automaticRestart,
        @CustomType.Parameter("minNodeCpus") @Nullable Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") @Nullable List<InstanceTemplateSchedulingNodeAffinity> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") @Nullable String onHostMaintenance,
        @CustomType.Parameter("preemptible") @Nullable Boolean preemptible,
        @CustomType.Parameter("provisioningModel") @Nullable String provisioningModel) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
    }

    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    public Optional<Boolean> automaticRestart() {
        return Optional.ofNullable(this.automaticRestart);
    }
    public Optional<Integer> minNodeCpus() {
        return Optional.ofNullable(this.minNodeCpus);
    }
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    public List<InstanceTemplateSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities == null ? List.of() : this.nodeAffinities;
    }
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    public Optional<String> onHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    public Optional<Boolean> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    /**
     * @return Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
     * `preemptible` should be `true` and `auto_restart` should be
     * `false`. For more info about
     * `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
     * 
     */
    public Optional<String> provisioningModel() {
        return Optional.ofNullable(this.provisioningModel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automaticRestart;
        private @Nullable Integer minNodeCpus;
        private @Nullable List<InstanceTemplateSchedulingNodeAffinity> nodeAffinities;
        private @Nullable String onHostMaintenance;
        private @Nullable Boolean preemptible;
        private @Nullable String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<InstanceTemplateSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(InstanceTemplateSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder provisioningModel(@Nullable String provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }        public InstanceTemplateScheduling build() {
            return new InstanceTemplateScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
