// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerTopicEventSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPartnerTopicEventSubscriptionArgs Empty = new GetPartnerTopicEventSubscriptionArgs();

    /**
     * Name of the event subscription to be found. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName", required=true)
    private String eventSubscriptionName;

    /**
     * @return Name of the event subscription to be found. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    public String eventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * Name of the partner topic.
     * 
     */
    @Import(name="partnerTopicName", required=true)
    private String partnerTopicName;

    /**
     * @return Name of the partner topic.
     * 
     */
    public String partnerTopicName() {
        return this.partnerTopicName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPartnerTopicEventSubscriptionArgs() {}

    private GetPartnerTopicEventSubscriptionArgs(GetPartnerTopicEventSubscriptionArgs $) {
        this.eventSubscriptionName = $.eventSubscriptionName;
        this.partnerTopicName = $.partnerTopicName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPartnerTopicEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPartnerTopicEventSubscriptionArgs $;

        public Builder() {
            $ = new GetPartnerTopicEventSubscriptionArgs();
        }

        public Builder(GetPartnerTopicEventSubscriptionArgs defaults) {
            $ = new GetPartnerTopicEventSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventSubscriptionName Name of the event subscription to be found. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
         * 
         * @return builder
         * 
         */
        public Builder eventSubscriptionName(String eventSubscriptionName) {
            $.eventSubscriptionName = eventSubscriptionName;
            return this;
        }

        /**
         * @param partnerTopicName Name of the partner topic.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(String partnerTopicName) {
            $.partnerTopicName = partnerTopicName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPartnerTopicEventSubscriptionArgs build() {
            $.eventSubscriptionName = Objects.requireNonNull($.eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
            $.partnerTopicName = Objects.requireNonNull($.partnerTopicName, "expected parameter 'partnerTopicName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
