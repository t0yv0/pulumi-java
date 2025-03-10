// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ActionRuleActionGroupConditionMonitorServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionRuleActionGroupConditionMonitorServiceArgs Empty = new ActionRuleActionGroupConditionMonitorServiceArgs();

    /**
     * The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * A list of values to match for a given condition. Possible values are `ActivityLog Administrative`, `ActivityLog Autoscale`, `ActivityLog Policy`, `ActivityLog Recommendation`, `ActivityLog Security`, `Application Insights`, `Azure Backup`, `Azure Stack Edge`, `Azure Stack Hub`, `Custom`, `Data Box Gateway`, `Health Platform`, `Log Alerts V2`, `Log Analytics`, `Platform`, `Resource Health`, `Smart Detector` and `VM Insights - Health`.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of values to match for a given condition. Possible values are `ActivityLog Administrative`, `ActivityLog Autoscale`, `ActivityLog Policy`, `ActivityLog Recommendation`, `ActivityLog Security`, `Application Insights`, `Azure Backup`, `Azure Stack Edge`, `Azure Stack Hub`, `Custom`, `Data Box Gateway`, `Health Platform`, `Log Alerts V2`, `Log Analytics`, `Platform`, `Resource Health`, `Smart Detector` and `VM Insights - Health`.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private ActionRuleActionGroupConditionMonitorServiceArgs() {}

    private ActionRuleActionGroupConditionMonitorServiceArgs(ActionRuleActionGroupConditionMonitorServiceArgs $) {
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionRuleActionGroupConditionMonitorServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionRuleActionGroupConditionMonitorServiceArgs $;

        public Builder() {
            $ = new ActionRuleActionGroupConditionMonitorServiceArgs();
        }

        public Builder(ActionRuleActionGroupConditionMonitorServiceArgs defaults) {
            $ = new ActionRuleActionGroupConditionMonitorServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The operator for a given condition. Possible values are `Equals` and `NotEquals`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator for a given condition. Possible values are `Equals` and `NotEquals`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `ActivityLog Administrative`, `ActivityLog Autoscale`, `ActivityLog Policy`, `ActivityLog Recommendation`, `ActivityLog Security`, `Application Insights`, `Azure Backup`, `Azure Stack Edge`, `Azure Stack Hub`, `Custom`, `Data Box Gateway`, `Health Platform`, `Log Alerts V2`, `Log Analytics`, `Platform`, `Resource Health`, `Smart Detector` and `VM Insights - Health`.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `ActivityLog Administrative`, `ActivityLog Autoscale`, `ActivityLog Policy`, `ActivityLog Recommendation`, `ActivityLog Security`, `Application Insights`, `Azure Backup`, `Azure Stack Edge`, `Azure Stack Hub`, `Custom`, `Data Box Gateway`, `Health Platform`, `Log Alerts V2`, `Log Analytics`, `Platform`, `Resource Health`, `Smart Detector` and `VM Insights - Health`.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `ActivityLog Administrative`, `ActivityLog Autoscale`, `ActivityLog Policy`, `ActivityLog Recommendation`, `ActivityLog Security`, `Application Insights`, `Azure Backup`, `Azure Stack Edge`, `Azure Stack Hub`, `Custom`, `Data Box Gateway`, `Health Platform`, `Log Alerts V2`, `Log Analytics`, `Platform`, `Resource Health`, `Smart Detector` and `VM Insights - Health`.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ActionRuleActionGroupConditionMonitorServiceArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
