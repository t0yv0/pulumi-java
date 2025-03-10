// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlertRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertRuleArgs Empty = new GetAlertRuleArgs();

    /**
     * The ID of the Log Analytics Workspace this Sentinel Alert Rule belongs to.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private String logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace this Sentinel Alert Rule belongs to.
     * 
     */
    public String logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The name which should be used for this Sentinel Alert Rule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name which should be used for this Sentinel Alert Rule.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAlertRuleArgs() {}

    private GetAlertRuleArgs(GetAlertRuleArgs $) {
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertRuleArgs $;

        public Builder() {
            $ = new GetAlertRuleArgs();
        }

        public Builder(GetAlertRuleArgs defaults) {
            $ = new GetAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace this Sentinel Alert Rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param name The name which should be used for this Sentinel Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAlertRuleArgs build() {
            $.logAnalyticsWorkspaceId = Objects.requireNonNull($.logAnalyticsWorkspaceId, "expected parameter 'logAnalyticsWorkspaceId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
