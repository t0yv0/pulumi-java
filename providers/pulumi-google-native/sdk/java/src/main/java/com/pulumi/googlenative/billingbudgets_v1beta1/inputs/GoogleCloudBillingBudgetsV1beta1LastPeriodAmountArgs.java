// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.inputs;




/**
 * Describes a budget amount targeted to the last Filter.calendar_period spend. At this time, the amount is automatically 100% of the last calendar period&#39;s spend; that is, there are no other options yet. Future configuration options will be described here (for example, configuring a percentage of last period&#39;s spend). LastPeriodAmount cannot be set for a budget configured with a Filter.custom_period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs Empty = new GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs();

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs();
        }
        public GoogleCloudBillingBudgetsV1beta1LastPeriodAmountArgs build() {
            return $;
        }
    }

}
