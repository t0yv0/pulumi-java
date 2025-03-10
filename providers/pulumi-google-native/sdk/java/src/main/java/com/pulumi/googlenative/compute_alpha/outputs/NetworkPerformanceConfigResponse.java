// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkPerformanceConfigResponse {
    private final String externalIpEgressBandwidthTier;
    private final String totalEgressBandwidthTier;

    @CustomType.Constructor
    private NetworkPerformanceConfigResponse(
        @CustomType.Parameter("externalIpEgressBandwidthTier") String externalIpEgressBandwidthTier,
        @CustomType.Parameter("totalEgressBandwidthTier") String totalEgressBandwidthTier) {
        this.externalIpEgressBandwidthTier = externalIpEgressBandwidthTier;
        this.totalEgressBandwidthTier = totalEgressBandwidthTier;
    }

    public String externalIpEgressBandwidthTier() {
        return this.externalIpEgressBandwidthTier;
    }
    public String totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPerformanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpEgressBandwidthTier;
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPerformanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpEgressBandwidthTier = defaults.externalIpEgressBandwidthTier;
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder externalIpEgressBandwidthTier(String externalIpEgressBandwidthTier) {
            this.externalIpEgressBandwidthTier = Objects.requireNonNull(externalIpEgressBandwidthTier);
            return this;
        }
        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }        public NetworkPerformanceConfigResponse build() {
            return new NetworkPerformanceConfigResponse(externalIpEgressBandwidthTier, totalEgressBandwidthTier);
        }
    }
}
