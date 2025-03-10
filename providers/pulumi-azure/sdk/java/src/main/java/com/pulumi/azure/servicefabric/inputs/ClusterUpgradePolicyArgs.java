// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyDeltaHealthPolicyArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyHealthPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterUpgradePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradePolicyArgs Empty = new ClusterUpgradePolicyArgs();

    /**
     * A `delta_health_policy` block as defined below
     * 
     */
    @Import(name="deltaHealthPolicy")
    private @Nullable Output<ClusterUpgradePolicyDeltaHealthPolicyArgs> deltaHealthPolicy;

    /**
     * @return A `delta_health_policy` block as defined below
     * 
     */
    public Optional<Output<ClusterUpgradePolicyDeltaHealthPolicyArgs>> deltaHealthPolicy() {
        return Optional.ofNullable(this.deltaHealthPolicy);
    }

    @Import(name="forceRestartEnabled")
    private @Nullable Output<Boolean> forceRestartEnabled;

    public Optional<Output<Boolean>> forceRestartEnabled() {
        return Optional.ofNullable(this.forceRestartEnabled);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, after which Service Fabric retries the health check if the previous health check fails. Defaults to `00:45:00`.
     * 
     */
    @Import(name="healthCheckRetryTimeout")
    private @Nullable Output<String> healthCheckRetryTimeout;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, after which Service Fabric retries the health check if the previous health check fails. Defaults to `00:45:00`.
     * 
     */
    public Optional<Output<String>> healthCheckRetryTimeout() {
        return Optional.ofNullable(this.healthCheckRetryTimeout);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits in order to verify that the cluster is stable before it continues to the next upgrade domain or completes the upgrade. This wait duration prevents undetected changes of health right after the health check is performed. Defaults to `00:01:00`.
     * 
     */
    @Import(name="healthCheckStableDuration")
    private @Nullable Output<String> healthCheckStableDuration;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits in order to verify that the cluster is stable before it continues to the next upgrade domain or completes the upgrade. This wait duration prevents undetected changes of health right after the health check is performed. Defaults to `00:01:00`.
     * 
     */
    public Optional<Output<String>> healthCheckStableDuration() {
        return Optional.ofNullable(this.healthCheckStableDuration);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits before it performs the initial health check after it finishes the upgrade on the upgrade domain. Defaults to `00:00:30`.
     * 
     */
    @Import(name="healthCheckWaitDuration")
    private @Nullable Output<String> healthCheckWaitDuration;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits before it performs the initial health check after it finishes the upgrade on the upgrade domain. Defaults to `00:00:30`.
     * 
     */
    public Optional<Output<String>> healthCheckWaitDuration() {
        return Optional.ofNullable(this.healthCheckWaitDuration);
    }

    /**
     * A `health_policy` block as defined below
     * 
     */
    @Import(name="healthPolicy")
    private @Nullable Output<ClusterUpgradePolicyHealthPolicyArgs> healthPolicy;

    /**
     * @return A `health_policy` block as defined below
     * 
     */
    public Optional<Output<ClusterUpgradePolicyHealthPolicyArgs>> healthPolicy() {
        return Optional.ofNullable(this.healthPolicy);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes to upgrade a single upgrade domain. After this period, the upgrade fails. Defaults to `02:00:00`.
     * 
     */
    @Import(name="upgradeDomainTimeout")
    private @Nullable Output<String> upgradeDomainTimeout;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes to upgrade a single upgrade domain. After this period, the upgrade fails. Defaults to `02:00:00`.
     * 
     */
    public Optional<Output<String>> upgradeDomainTimeout() {
        return Optional.ofNullable(this.upgradeDomainTimeout);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits for a replica set to reconfigure into a safe state, if it is not already in a safe state, before Service Fabric proceeds with the upgrade. Defaults to `10675199.02:48:05.4775807`.
     * 
     */
    @Import(name="upgradeReplicaSetCheckTimeout")
    private @Nullable Output<String> upgradeReplicaSetCheckTimeout;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits for a replica set to reconfigure into a safe state, if it is not already in a safe state, before Service Fabric proceeds with the upgrade. Defaults to `10675199.02:48:05.4775807`.
     * 
     */
    public Optional<Output<String>> upgradeReplicaSetCheckTimeout() {
        return Optional.ofNullable(this.upgradeReplicaSetCheckTimeout);
    }

    /**
     * Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes for the entire upgrade. After this period, the upgrade fails. Defaults to `12:00:00`.
     * 
     */
    @Import(name="upgradeTimeout")
    private @Nullable Output<String> upgradeTimeout;

    /**
     * @return Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes for the entire upgrade. After this period, the upgrade fails. Defaults to `12:00:00`.
     * 
     */
    public Optional<Output<String>> upgradeTimeout() {
        return Optional.ofNullable(this.upgradeTimeout);
    }

    private ClusterUpgradePolicyArgs() {}

    private ClusterUpgradePolicyArgs(ClusterUpgradePolicyArgs $) {
        this.deltaHealthPolicy = $.deltaHealthPolicy;
        this.forceRestartEnabled = $.forceRestartEnabled;
        this.healthCheckRetryTimeout = $.healthCheckRetryTimeout;
        this.healthCheckStableDuration = $.healthCheckStableDuration;
        this.healthCheckWaitDuration = $.healthCheckWaitDuration;
        this.healthPolicy = $.healthPolicy;
        this.upgradeDomainTimeout = $.upgradeDomainTimeout;
        this.upgradeReplicaSetCheckTimeout = $.upgradeReplicaSetCheckTimeout;
        this.upgradeTimeout = $.upgradeTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterUpgradePolicyArgs $;

        public Builder() {
            $ = new ClusterUpgradePolicyArgs();
        }

        public Builder(ClusterUpgradePolicyArgs defaults) {
            $ = new ClusterUpgradePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deltaHealthPolicy A `delta_health_policy` block as defined below
         * 
         * @return builder
         * 
         */
        public Builder deltaHealthPolicy(@Nullable Output<ClusterUpgradePolicyDeltaHealthPolicyArgs> deltaHealthPolicy) {
            $.deltaHealthPolicy = deltaHealthPolicy;
            return this;
        }

        /**
         * @param deltaHealthPolicy A `delta_health_policy` block as defined below
         * 
         * @return builder
         * 
         */
        public Builder deltaHealthPolicy(ClusterUpgradePolicyDeltaHealthPolicyArgs deltaHealthPolicy) {
            return deltaHealthPolicy(Output.of(deltaHealthPolicy));
        }

        public Builder forceRestartEnabled(@Nullable Output<Boolean> forceRestartEnabled) {
            $.forceRestartEnabled = forceRestartEnabled;
            return this;
        }

        public Builder forceRestartEnabled(Boolean forceRestartEnabled) {
            return forceRestartEnabled(Output.of(forceRestartEnabled));
        }

        /**
         * @param healthCheckRetryTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, after which Service Fabric retries the health check if the previous health check fails. Defaults to `00:45:00`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRetryTimeout(@Nullable Output<String> healthCheckRetryTimeout) {
            $.healthCheckRetryTimeout = healthCheckRetryTimeout;
            return this;
        }

        /**
         * @param healthCheckRetryTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, after which Service Fabric retries the health check if the previous health check fails. Defaults to `00:45:00`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRetryTimeout(String healthCheckRetryTimeout) {
            return healthCheckRetryTimeout(Output.of(healthCheckRetryTimeout));
        }

        /**
         * @param healthCheckStableDuration Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits in order to verify that the cluster is stable before it continues to the next upgrade domain or completes the upgrade. This wait duration prevents undetected changes of health right after the health check is performed. Defaults to `00:01:00`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckStableDuration(@Nullable Output<String> healthCheckStableDuration) {
            $.healthCheckStableDuration = healthCheckStableDuration;
            return this;
        }

        /**
         * @param healthCheckStableDuration Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits in order to verify that the cluster is stable before it continues to the next upgrade domain or completes the upgrade. This wait duration prevents undetected changes of health right after the health check is performed. Defaults to `00:01:00`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckStableDuration(String healthCheckStableDuration) {
            return healthCheckStableDuration(Output.of(healthCheckStableDuration));
        }

        /**
         * @param healthCheckWaitDuration Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits before it performs the initial health check after it finishes the upgrade on the upgrade domain. Defaults to `00:00:30`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckWaitDuration(@Nullable Output<String> healthCheckWaitDuration) {
            $.healthCheckWaitDuration = healthCheckWaitDuration;
            return this;
        }

        /**
         * @param healthCheckWaitDuration Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits before it performs the initial health check after it finishes the upgrade on the upgrade domain. Defaults to `00:00:30`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckWaitDuration(String healthCheckWaitDuration) {
            return healthCheckWaitDuration(Output.of(healthCheckWaitDuration));
        }

        /**
         * @param healthPolicy A `health_policy` block as defined below
         * 
         * @return builder
         * 
         */
        public Builder healthPolicy(@Nullable Output<ClusterUpgradePolicyHealthPolicyArgs> healthPolicy) {
            $.healthPolicy = healthPolicy;
            return this;
        }

        /**
         * @param healthPolicy A `health_policy` block as defined below
         * 
         * @return builder
         * 
         */
        public Builder healthPolicy(ClusterUpgradePolicyHealthPolicyArgs healthPolicy) {
            return healthPolicy(Output.of(healthPolicy));
        }

        /**
         * @param upgradeDomainTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes to upgrade a single upgrade domain. After this period, the upgrade fails. Defaults to `02:00:00`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeDomainTimeout(@Nullable Output<String> upgradeDomainTimeout) {
            $.upgradeDomainTimeout = upgradeDomainTimeout;
            return this;
        }

        /**
         * @param upgradeDomainTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes to upgrade a single upgrade domain. After this period, the upgrade fails. Defaults to `02:00:00`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeDomainTimeout(String upgradeDomainTimeout) {
            return upgradeDomainTimeout(Output.of(upgradeDomainTimeout));
        }

        /**
         * @param upgradeReplicaSetCheckTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits for a replica set to reconfigure into a safe state, if it is not already in a safe state, before Service Fabric proceeds with the upgrade. Defaults to `10675199.02:48:05.4775807`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeReplicaSetCheckTimeout(@Nullable Output<String> upgradeReplicaSetCheckTimeout) {
            $.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
            return this;
        }

        /**
         * @param upgradeReplicaSetCheckTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric waits for a replica set to reconfigure into a safe state, if it is not already in a safe state, before Service Fabric proceeds with the upgrade. Defaults to `10675199.02:48:05.4775807`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeReplicaSetCheckTimeout(String upgradeReplicaSetCheckTimeout) {
            return upgradeReplicaSetCheckTimeout(Output.of(upgradeReplicaSetCheckTimeout));
        }

        /**
         * @param upgradeTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes for the entire upgrade. After this period, the upgrade fails. Defaults to `12:00:00`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeTimeout(@Nullable Output<String> upgradeTimeout) {
            $.upgradeTimeout = upgradeTimeout;
            return this;
        }

        /**
         * @param upgradeTimeout Specifies the duration, in &#34;hh:mm:ss&#34; string format, that Service Fabric takes for the entire upgrade. After this period, the upgrade fails. Defaults to `12:00:00`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeTimeout(String upgradeTimeout) {
            return upgradeTimeout(Output.of(upgradeTimeout));
        }

        public ClusterUpgradePolicyArgs build() {
            return $;
        }
    }

}
