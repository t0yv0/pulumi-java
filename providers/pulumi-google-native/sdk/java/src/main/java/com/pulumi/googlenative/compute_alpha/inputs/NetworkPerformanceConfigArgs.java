// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.NetworkPerformanceConfigExternalIpEgressBandwidthTier;
import com.pulumi.googlenative.compute_alpha.enums.NetworkPerformanceConfigTotalEgressBandwidthTier;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPerformanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPerformanceConfigArgs Empty = new NetworkPerformanceConfigArgs();

    @Import(name="externalIpEgressBandwidthTier")
    private @Nullable Output<NetworkPerformanceConfigExternalIpEgressBandwidthTier> externalIpEgressBandwidthTier;

    public Optional<Output<NetworkPerformanceConfigExternalIpEgressBandwidthTier>> externalIpEgressBandwidthTier() {
        return Optional.ofNullable(this.externalIpEgressBandwidthTier);
    }

    @Import(name="totalEgressBandwidthTier")
    private @Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier;

    public Optional<Output<NetworkPerformanceConfigTotalEgressBandwidthTier>> totalEgressBandwidthTier() {
        return Optional.ofNullable(this.totalEgressBandwidthTier);
    }

    private NetworkPerformanceConfigArgs() {}

    private NetworkPerformanceConfigArgs(NetworkPerformanceConfigArgs $) {
        this.externalIpEgressBandwidthTier = $.externalIpEgressBandwidthTier;
        this.totalEgressBandwidthTier = $.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPerformanceConfigArgs $;

        public Builder() {
            $ = new NetworkPerformanceConfigArgs();
        }

        public Builder(NetworkPerformanceConfigArgs defaults) {
            $ = new NetworkPerformanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalIpEgressBandwidthTier(@Nullable Output<NetworkPerformanceConfigExternalIpEgressBandwidthTier> externalIpEgressBandwidthTier) {
            $.externalIpEgressBandwidthTier = externalIpEgressBandwidthTier;
            return this;
        }

        public Builder externalIpEgressBandwidthTier(NetworkPerformanceConfigExternalIpEgressBandwidthTier externalIpEgressBandwidthTier) {
            return externalIpEgressBandwidthTier(Output.of(externalIpEgressBandwidthTier));
        }

        public Builder totalEgressBandwidthTier(@Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier) {
            $.totalEgressBandwidthTier = totalEgressBandwidthTier;
            return this;
        }

        public Builder totalEgressBandwidthTier(NetworkPerformanceConfigTotalEgressBandwidthTier totalEgressBandwidthTier) {
            return totalEgressBandwidthTier(Output.of(totalEgressBandwidthTier));
        }

        public NetworkPerformanceConfigArgs build() {
            return $;
        }
    }

}
