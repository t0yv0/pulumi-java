// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs Empty = new ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs();

    /**
     * The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
     * 
     */
    @Import(name="predefinedScalingMetricType", required=true)
    private Output<String> predefinedScalingMetricType;

    /**
     * @return The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
     * 
     */
    public Output<String> predefinedScalingMetricType() {
        return this.predefinedScalingMetricType;
    }

    /**
     * Identifies the resource associated with the metric type.
     * 
     */
    @Import(name="resourceLabel")
    private @Nullable Output<String> resourceLabel;

    /**
     * @return Identifies the resource associated with the metric type.
     * 
     */
    public Optional<Output<String>> resourceLabel() {
        return Optional.ofNullable(this.resourceLabel);
    }

    private ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs() {}

    private ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs(ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs $) {
        this.predefinedScalingMetricType = $.predefinedScalingMetricType;
        this.resourceLabel = $.resourceLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs $;

        public Builder() {
            $ = new ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs();
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs defaults) {
            $ = new ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predefinedScalingMetricType The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedScalingMetricType(Output<String> predefinedScalingMetricType) {
            $.predefinedScalingMetricType = predefinedScalingMetricType;
            return this;
        }

        /**
         * @param predefinedScalingMetricType The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedScalingMetricType(String predefinedScalingMetricType) {
            return predefinedScalingMetricType(Output.of(predefinedScalingMetricType));
        }

        /**
         * @param resourceLabel Identifies the resource associated with the metric type.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(@Nullable Output<String> resourceLabel) {
            $.resourceLabel = resourceLabel;
            return this;
        }

        /**
         * @param resourceLabel Identifies the resource associated with the metric type.
         * 
         * @return builder
         * 
         */
        public Builder resourceLabel(String resourceLabel) {
            return resourceLabel(Output.of(resourceLabel));
        }

        public ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs build() {
            $.predefinedScalingMetricType = Objects.requireNonNull($.predefinedScalingMetricType, "expected parameter 'predefinedScalingMetricType' to be non-null");
            return $;
        }
    }

}
