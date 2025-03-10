// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfig;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentPatchConfigPreStep {
    /**
     * @return The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    private final @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig;
    /**
     * @return The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    private final @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig;

    @CustomType.Constructor
    private PatchDeploymentPatchConfigPreStep(
        @CustomType.Parameter("linuxExecStepConfig") @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig,
        @CustomType.Parameter("windowsExecStepConfig") @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    /**
     * @return The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    public Optional<PatchDeploymentPatchConfigPreStepLinuxExecStepConfig> linuxExecStepConfig() {
        return Optional.ofNullable(this.linuxExecStepConfig);
    }
    /**
     * @return The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    public Optional<PatchDeploymentPatchConfigPreStepWindowsExecStepConfig> windowsExecStepConfig() {
        return Optional.ofNullable(this.windowsExecStepConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig;
        private @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }
        public Builder windowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }        public PatchDeploymentPatchConfigPreStep build() {
            return new PatchDeploymentPatchConfigPreStep(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
