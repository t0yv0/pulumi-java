// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListFirewallPolicyIdpsSignaturesFilterValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListFirewallPolicyIdpsSignaturesFilterValueArgs Empty = new ListFirewallPolicyIdpsSignaturesFilterValueArgs();

    /**
     * Describes the name of the column which values will be returned
     * 
     */
    @Import(name="filterName")
    private @Nullable String filterName;

    /**
     * @return Describes the name of the column which values will be returned
     * 
     */
    public Optional<String> filterName() {
        return Optional.ofNullable(this.filterName);
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
    private String firewallPolicyName;

    /**
     * @return The name of the Firewall Policy.
     * 
     */
    public String firewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListFirewallPolicyIdpsSignaturesFilterValueArgs() {}

    private ListFirewallPolicyIdpsSignaturesFilterValueArgs(ListFirewallPolicyIdpsSignaturesFilterValueArgs $) {
        this.filterName = $.filterName;
        this.firewallPolicyName = $.firewallPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListFirewallPolicyIdpsSignaturesFilterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListFirewallPolicyIdpsSignaturesFilterValueArgs $;

        public Builder() {
            $ = new ListFirewallPolicyIdpsSignaturesFilterValueArgs();
        }

        public Builder(ListFirewallPolicyIdpsSignaturesFilterValueArgs defaults) {
            $ = new ListFirewallPolicyIdpsSignaturesFilterValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterName Describes the name of the column which values will be returned
         * 
         * @return builder
         * 
         */
        public Builder filterName(@Nullable String filterName) {
            $.filterName = filterName;
            return this;
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(String firewallPolicyName) {
            $.firewallPolicyName = firewallPolicyName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListFirewallPolicyIdpsSignaturesFilterValueArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
