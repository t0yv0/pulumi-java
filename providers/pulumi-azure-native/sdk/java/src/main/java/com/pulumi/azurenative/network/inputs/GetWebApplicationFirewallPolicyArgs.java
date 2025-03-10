// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebApplicationFirewallPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebApplicationFirewallPolicyArgs Empty = new GetWebApplicationFirewallPolicyArgs();

    /**
     * The name of the policy.
     * 
     */
    @Import(name="policyName", required=true)
    private String policyName;

    /**
     * @return The name of the policy.
     * 
     */
    public String policyName() {
        return this.policyName;
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

    private GetWebApplicationFirewallPolicyArgs() {}

    private GetWebApplicationFirewallPolicyArgs(GetWebApplicationFirewallPolicyArgs $) {
        this.policyName = $.policyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebApplicationFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebApplicationFirewallPolicyArgs $;

        public Builder() {
            $ = new GetWebApplicationFirewallPolicyArgs();
        }

        public Builder(GetWebApplicationFirewallPolicyArgs defaults) {
            $ = new GetWebApplicationFirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName The name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            $.policyName = policyName;
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

        public GetWebApplicationFirewallPolicyArgs build() {
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
