// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleMonitoringType;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringJobDefinition;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleScheduleConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleConfig {
    private final @Nullable MonitoringScheduleMonitoringJobDefinition monitoringJobDefinition;
    /**
     * @return Name of the job definition
     * 
     */
    private final @Nullable String monitoringJobDefinitionName;
    private final @Nullable MonitoringScheduleMonitoringType monitoringType;
    private final @Nullable MonitoringScheduleScheduleConfig scheduleConfig;

    @CustomType.Constructor
    private MonitoringScheduleConfig(
        @CustomType.Parameter("monitoringJobDefinition") @Nullable MonitoringScheduleMonitoringJobDefinition monitoringJobDefinition,
        @CustomType.Parameter("monitoringJobDefinitionName") @Nullable String monitoringJobDefinitionName,
        @CustomType.Parameter("monitoringType") @Nullable MonitoringScheduleMonitoringType monitoringType,
        @CustomType.Parameter("scheduleConfig") @Nullable MonitoringScheduleScheduleConfig scheduleConfig) {
        this.monitoringJobDefinition = monitoringJobDefinition;
        this.monitoringJobDefinitionName = monitoringJobDefinitionName;
        this.monitoringType = monitoringType;
        this.scheduleConfig = scheduleConfig;
    }

    public Optional<MonitoringScheduleMonitoringJobDefinition> monitoringJobDefinition() {
        return Optional.ofNullable(this.monitoringJobDefinition);
    }
    /**
     * @return Name of the job definition
     * 
     */
    public Optional<String> monitoringJobDefinitionName() {
        return Optional.ofNullable(this.monitoringJobDefinitionName);
    }
    public Optional<MonitoringScheduleMonitoringType> monitoringType() {
        return Optional.ofNullable(this.monitoringType);
    }
    public Optional<MonitoringScheduleScheduleConfig> scheduleConfig() {
        return Optional.ofNullable(this.scheduleConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MonitoringScheduleMonitoringJobDefinition monitoringJobDefinition;
        private @Nullable String monitoringJobDefinitionName;
        private @Nullable MonitoringScheduleMonitoringType monitoringType;
        private @Nullable MonitoringScheduleScheduleConfig scheduleConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitoringJobDefinition = defaults.monitoringJobDefinition;
    	      this.monitoringJobDefinitionName = defaults.monitoringJobDefinitionName;
    	      this.monitoringType = defaults.monitoringType;
    	      this.scheduleConfig = defaults.scheduleConfig;
        }

        public Builder monitoringJobDefinition(@Nullable MonitoringScheduleMonitoringJobDefinition monitoringJobDefinition) {
            this.monitoringJobDefinition = monitoringJobDefinition;
            return this;
        }
        public Builder monitoringJobDefinitionName(@Nullable String monitoringJobDefinitionName) {
            this.monitoringJobDefinitionName = monitoringJobDefinitionName;
            return this;
        }
        public Builder monitoringType(@Nullable MonitoringScheduleMonitoringType monitoringType) {
            this.monitoringType = monitoringType;
            return this;
        }
        public Builder scheduleConfig(@Nullable MonitoringScheduleScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }        public MonitoringScheduleConfig build() {
            return new MonitoringScheduleConfig(monitoringJobDefinition, monitoringJobDefinitionName, monitoringType, scheduleConfig);
        }
    }
}
