// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.azurenative.servicefabric.outputs.ArmApplicationHealthPolicyResponse;
import com.pulumi.azurenative.servicefabric.outputs.ArmRollingUpgradeMonitoringPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationUpgradePolicyResponse {
    /**
     * @return Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    private final @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy;
    /**
     * @return If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    private final @Nullable Boolean forceRestart;
    /**
     * @return Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    private final @Nullable Boolean recreateApplication;
    /**
     * @return The policy used for monitoring the application upgrade
     * 
     */
    private final @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy;
    /**
     * @return The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    private final @Nullable String upgradeMode;
    /**
     * @return The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    private final @Nullable String upgradeReplicaSetCheckTimeout;

    @CustomType.Constructor
    private ApplicationUpgradePolicyResponse(
        @CustomType.Parameter("applicationHealthPolicy") @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy,
        @CustomType.Parameter("forceRestart") @Nullable Boolean forceRestart,
        @CustomType.Parameter("recreateApplication") @Nullable Boolean recreateApplication,
        @CustomType.Parameter("rollingUpgradeMonitoringPolicy") @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy,
        @CustomType.Parameter("upgradeMode") @Nullable String upgradeMode,
        @CustomType.Parameter("upgradeReplicaSetCheckTimeout") @Nullable String upgradeReplicaSetCheckTimeout) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        this.forceRestart = forceRestart;
        this.recreateApplication = recreateApplication;
        this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
        this.upgradeMode = upgradeMode;
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
    }

    /**
     * @return Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    public Optional<ArmApplicationHealthPolicyResponse> applicationHealthPolicy() {
        return Optional.ofNullable(this.applicationHealthPolicy);
    }
    /**
     * @return If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    public Optional<Boolean> forceRestart() {
        return Optional.ofNullable(this.forceRestart);
    }
    /**
     * @return Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    public Optional<Boolean> recreateApplication() {
        return Optional.ofNullable(this.recreateApplication);
    }
    /**
     * @return The policy used for monitoring the application upgrade
     * 
     */
    public Optional<ArmRollingUpgradeMonitoringPolicyResponse> rollingUpgradeMonitoringPolicy() {
        return Optional.ofNullable(this.rollingUpgradeMonitoringPolicy);
    }
    /**
     * @return The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    public Optional<String> upgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }
    /**
     * @return The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    public Optional<String> upgradeReplicaSetCheckTimeout() {
        return Optional.ofNullable(this.upgradeReplicaSetCheckTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy;
        private @Nullable Boolean forceRestart;
        private @Nullable Boolean recreateApplication;
        private @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy;
        private @Nullable String upgradeMode;
        private @Nullable String upgradeReplicaSetCheckTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicy = defaults.applicationHealthPolicy;
    	      this.forceRestart = defaults.forceRestart;
    	      this.recreateApplication = defaults.recreateApplication;
    	      this.rollingUpgradeMonitoringPolicy = defaults.rollingUpgradeMonitoringPolicy;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.upgradeReplicaSetCheckTimeout = defaults.upgradeReplicaSetCheckTimeout;
        }

        public Builder applicationHealthPolicy(@Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy) {
            this.applicationHealthPolicy = applicationHealthPolicy;
            return this;
        }
        public Builder forceRestart(@Nullable Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Builder recreateApplication(@Nullable Boolean recreateApplication) {
            this.recreateApplication = recreateApplication;
            return this;
        }
        public Builder rollingUpgradeMonitoringPolicy(@Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy) {
            this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
            return this;
        }
        public Builder upgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public Builder upgradeReplicaSetCheckTimeout(@Nullable String upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
            return this;
        }        public ApplicationUpgradePolicyResponse build() {
            return new ApplicationUpgradePolicyResponse(applicationHealthPolicy, forceRestart, recreateApplication, rollingUpgradeMonitoringPolicy, upgradeMode, upgradeReplicaSetCheckTimeout);
        }
    }
}
