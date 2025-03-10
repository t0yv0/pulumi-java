// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeConfigShieldedInstanceConfig {
    /**
     * @return Defines if the instance has integrity monitoring enabled.
     * 
     */
    private final @Nullable Boolean enableIntegrityMonitoring;
    /**
     * @return Defines if the instance has Secure Boot enabled.
     * 
     */
    private final @Nullable Boolean enableSecureBoot;

    @CustomType.Constructor
    private ClusterNodeConfigShieldedInstanceConfig(
        @CustomType.Parameter("enableIntegrityMonitoring") @Nullable Boolean enableIntegrityMonitoring,
        @CustomType.Parameter("enableSecureBoot") @Nullable Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    /**
     * @return Defines if the instance has integrity monitoring enabled.
     * 
     */
    public Optional<Boolean> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * @return Defines if the instance has Secure Boot enabled.
     * 
     */
    public Optional<Boolean> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }        public ClusterNodeConfigShieldedInstanceConfig build() {
            return new ClusterNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
