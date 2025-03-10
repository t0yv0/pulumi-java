// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesAlertTriggerMetricTrigger;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetScheduledQueryRulesAlertTrigger {
    private final List<GetScheduledQueryRulesAlertTriggerMetricTrigger> metricTriggers;
    /**
     * @return Evaluation operation for rule.
     * 
     */
    private final String operator;
    /**
     * @return Result or count threshold based on which rule should be triggered.
     * 
     */
    private final Double threshold;

    @CustomType.Constructor
    private GetScheduledQueryRulesAlertTrigger(
        @CustomType.Parameter("metricTriggers") List<GetScheduledQueryRulesAlertTriggerMetricTrigger> metricTriggers,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("threshold") Double threshold) {
        this.metricTriggers = metricTriggers;
        this.operator = operator;
        this.threshold = threshold;
    }

    public List<GetScheduledQueryRulesAlertTriggerMetricTrigger> metricTriggers() {
        return this.metricTriggers;
    }
    /**
     * @return Evaluation operation for rule.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Result or count threshold based on which rule should be triggered.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledQueryRulesAlertTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetScheduledQueryRulesAlertTriggerMetricTrigger> metricTriggers;
        private String operator;
        private Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledQueryRulesAlertTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTriggers = defaults.metricTriggers;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
        }

        public Builder metricTriggers(List<GetScheduledQueryRulesAlertTriggerMetricTrigger> metricTriggers) {
            this.metricTriggers = Objects.requireNonNull(metricTriggers);
            return this;
        }
        public Builder metricTriggers(GetScheduledQueryRulesAlertTriggerMetricTrigger... metricTriggers) {
            return metricTriggers(List.of(metricTriggers));
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }        public GetScheduledQueryRulesAlertTrigger build() {
            return new GetScheduledQueryRulesAlertTrigger(metricTriggers, operator, threshold);
        }
    }
}
