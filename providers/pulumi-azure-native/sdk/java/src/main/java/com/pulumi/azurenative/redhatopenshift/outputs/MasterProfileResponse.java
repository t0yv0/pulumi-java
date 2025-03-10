// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MasterProfileResponse {
    /**
     * @return The Azure resource ID of the master subnet (immutable).
     * 
     */
    private final @Nullable String subnetId;
    /**
     * @return The size of the master VMs (immutable).
     * 
     */
    private final @Nullable String vmSize;

    @CustomType.Constructor
    private MasterProfileResponse(
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.subnetId = subnetId;
        this.vmSize = vmSize;
    }

    /**
     * @return The Azure resource ID of the master subnet (immutable).
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The size of the master VMs (immutable).
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public MasterProfileResponse build() {
            return new MasterProfileResponse(subnetId, vmSize);
        }
    }
}
