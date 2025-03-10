// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledTriggerArgs Empty = new GetScheduledTriggerArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private String shareSubscriptionName;

    /**
     * @return The name of the shareSubscription.
     * 
     */
    public String shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    /**
     * @return The name of the trigger.
     * 
     */
    public String triggerName() {
        return this.triggerName;
    }

    private GetScheduledTriggerArgs() {}

    private GetScheduledTriggerArgs(GetScheduledTriggerArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledTriggerArgs $;

        public Builder() {
            $ = new GetScheduledTriggerArgs();
        }

        public Builder(GetScheduledTriggerArgs defaults) {
            $ = new GetScheduledTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param shareSubscriptionName The name of the shareSubscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        /**
         * @param triggerName The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        public GetScheduledTriggerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            return $;
        }
    }

}
