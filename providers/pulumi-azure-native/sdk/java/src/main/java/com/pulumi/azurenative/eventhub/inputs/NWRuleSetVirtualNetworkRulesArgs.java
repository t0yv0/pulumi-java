// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.azurenative.eventhub.inputs.SubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of VirtualNetworkRules - NetworkRules resource.
 * 
 */
public final class NWRuleSetVirtualNetworkRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NWRuleSetVirtualNetworkRulesArgs Empty = new NWRuleSetVirtualNetworkRulesArgs();

    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
    private @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    public Optional<Output<Boolean>> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * Subnet properties
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubnetArgs> subnet;

    /**
     * @return Subnet properties
     * 
     */
    public Optional<Output<SubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private NWRuleSetVirtualNetworkRulesArgs() {}

    private NWRuleSetVirtualNetworkRulesArgs(NWRuleSetVirtualNetworkRulesArgs $) {
        this.ignoreMissingVnetServiceEndpoint = $.ignoreMissingVnetServiceEndpoint;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NWRuleSetVirtualNetworkRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NWRuleSetVirtualNetworkRulesArgs $;

        public Builder() {
            $ = new NWRuleSetVirtualNetworkRulesArgs();
        }

        public Builder(NWRuleSetVirtualNetworkRulesArgs defaults) {
            $ = new NWRuleSetVirtualNetworkRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Value that indicates whether to ignore missing VNet Service Endpoint
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
            $.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Value that indicates whether to ignore missing VNet Service Endpoint
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
            return ignoreMissingVnetServiceEndpoint(Output.of(ignoreMissingVnetServiceEndpoint));
        }

        /**
         * @param subnet Subnet properties
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Subnet properties
         * 
         * @return builder
         * 
         */
        public Builder subnet(SubnetArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public NWRuleSetVirtualNetworkRulesArgs build() {
            return $;
        }
    }

}
