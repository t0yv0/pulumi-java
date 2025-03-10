// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActivityLogAlertActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivityLogAlertActionArgs Empty = new ActivityLogAlertActionArgs();

    /**
     * The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource.
     * 
     */
    @Import(name="actionGroupId", required=true)
    private Output<String> actionGroupId;

    /**
     * @return The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource.
     * 
     */
    public Output<String> actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    @Import(name="webhookProperties")
    private @Nullable Output<Map<String,String>> webhookProperties;

    /**
     * @return The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    public Optional<Output<Map<String,String>>> webhookProperties() {
        return Optional.ofNullable(this.webhookProperties);
    }

    private ActivityLogAlertActionArgs() {}

    private ActivityLogAlertActionArgs(ActivityLogAlertActionArgs $) {
        this.actionGroupId = $.actionGroupId;
        this.webhookProperties = $.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityLogAlertActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityLogAlertActionArgs $;

        public Builder() {
            $ = new ActivityLogAlertActionArgs();
        }

        public Builder(ActivityLogAlertActionArgs defaults) {
            $ = new ActivityLogAlertActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionGroupId The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupId(Output<String> actionGroupId) {
            $.actionGroupId = actionGroupId;
            return this;
        }

        /**
         * @param actionGroupId The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupId(String actionGroupId) {
            return actionGroupId(Output.of(actionGroupId));
        }

        /**
         * @param webhookProperties The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
         * 
         * @return builder
         * 
         */
        public Builder webhookProperties(@Nullable Output<Map<String,String>> webhookProperties) {
            $.webhookProperties = webhookProperties;
            return this;
        }

        /**
         * @param webhookProperties The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
         * 
         * @return builder
         * 
         */
        public Builder webhookProperties(Map<String,String> webhookProperties) {
            return webhookProperties(Output.of(webhookProperties));
        }

        public ActivityLogAlertActionArgs build() {
            $.actionGroupId = Objects.requireNonNull($.actionGroupId, "expected parameter 'actionGroupId' to be non-null");
            return $;
        }
    }

}
