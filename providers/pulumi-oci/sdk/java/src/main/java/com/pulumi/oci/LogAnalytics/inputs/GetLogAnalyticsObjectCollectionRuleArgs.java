// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogAnalyticsObjectCollectionRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogAnalyticsObjectCollectionRuleArgs Empty = new GetLogAnalyticsObjectCollectionRuleArgs();

    /**
     * The Logging Analytics Object Collection Rule [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * 
     */
    @Import(name="logAnalyticsObjectCollectionRuleId", required=true)
    private String logAnalyticsObjectCollectionRuleId;

    /**
     * @return The Logging Analytics Object Collection Rule [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * 
     */
    public String logAnalyticsObjectCollectionRuleId() {
        return this.logAnalyticsObjectCollectionRuleId;
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private GetLogAnalyticsObjectCollectionRuleArgs() {}

    private GetLogAnalyticsObjectCollectionRuleArgs(GetLogAnalyticsObjectCollectionRuleArgs $) {
        this.logAnalyticsObjectCollectionRuleId = $.logAnalyticsObjectCollectionRuleId;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogAnalyticsObjectCollectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogAnalyticsObjectCollectionRuleArgs $;

        public Builder() {
            $ = new GetLogAnalyticsObjectCollectionRuleArgs();
        }

        public Builder(GetLogAnalyticsObjectCollectionRuleArgs defaults) {
            $ = new GetLogAnalyticsObjectCollectionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsObjectCollectionRuleId The Logging Analytics Object Collection Rule [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsObjectCollectionRuleId(String logAnalyticsObjectCollectionRuleId) {
            $.logAnalyticsObjectCollectionRuleId = logAnalyticsObjectCollectionRuleId;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetLogAnalyticsObjectCollectionRuleArgs build() {
            $.logAnalyticsObjectCollectionRuleId = Objects.requireNonNull($.logAnalyticsObjectCollectionRuleId, "expected parameter 'logAnalyticsObjectCollectionRuleId' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
