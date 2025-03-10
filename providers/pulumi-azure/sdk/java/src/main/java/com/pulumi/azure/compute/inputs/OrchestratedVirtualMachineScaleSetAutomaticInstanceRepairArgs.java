// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs Empty = new OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="gracePeriod")
    private @Nullable Output<String> gracePeriod;

    public Optional<Output<String>> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    private OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs() {}

    private OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs(OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs $) {
        this.enabled = $.enabled;
        this.gracePeriod = $.gracePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder gracePeriod(@Nullable Output<String> gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        public Builder gracePeriod(String gracePeriod) {
            return gracePeriod(Output.of(gracePeriod));
        }

        public OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
