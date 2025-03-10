// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppBackupSchedule {
    /**
     * @return How often the backup is executed.
     * 
     */
    private final Integer frequencyInterval;
    /**
     * @return The unit of time for how often the backup takes place.
     * 
     */
    private final String frequencyUnit;
    /**
     * @return Does the service keep at least one backup, regardless of age of backup?
     * 
     */
    private final Boolean keepAtLeastOneBackup;
    private final String lastExecutionTime;
    /**
     * @return After how many days backups are deleted.
     * 
     */
    private final Integer retentionPeriodDays;
    /**
     * @return When the schedule starts working in RFC-3339 format.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private GetLinuxFunctionAppBackupSchedule(
        @CustomType.Parameter("frequencyInterval") Integer frequencyInterval,
        @CustomType.Parameter("frequencyUnit") String frequencyUnit,
        @CustomType.Parameter("keepAtLeastOneBackup") Boolean keepAtLeastOneBackup,
        @CustomType.Parameter("lastExecutionTime") String lastExecutionTime,
        @CustomType.Parameter("retentionPeriodDays") Integer retentionPeriodDays,
        @CustomType.Parameter("startTime") String startTime) {
        this.frequencyInterval = frequencyInterval;
        this.frequencyUnit = frequencyUnit;
        this.keepAtLeastOneBackup = keepAtLeastOneBackup;
        this.lastExecutionTime = lastExecutionTime;
        this.retentionPeriodDays = retentionPeriodDays;
        this.startTime = startTime;
    }

    /**
     * @return How often the backup is executed.
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * @return The unit of time for how often the backup takes place.
     * 
     */
    public String frequencyUnit() {
        return this.frequencyUnit;
    }
    /**
     * @return Does the service keep at least one backup, regardless of age of backup?
     * 
     */
    public Boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }
    public String lastExecutionTime() {
        return this.lastExecutionTime;
    }
    /**
     * @return After how many days backups are deleted.
     * 
     */
    public Integer retentionPeriodDays() {
        return this.retentionPeriodDays;
    }
    /**
     * @return When the schedule starts working in RFC-3339 format.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppBackupSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInterval;
        private String frequencyUnit;
        private Boolean keepAtLeastOneBackup;
        private String lastExecutionTime;
        private Integer retentionPeriodDays;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxFunctionAppBackupSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.retentionPeriodDays = defaults.retentionPeriodDays;
    	      this.startTime = defaults.startTime;
        }

        public Builder frequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }
        public Builder frequencyUnit(String frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }
        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }
        public Builder lastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }
        public Builder retentionPeriodDays(Integer retentionPeriodDays) {
            this.retentionPeriodDays = Objects.requireNonNull(retentionPeriodDays);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetLinuxFunctionAppBackupSchedule build() {
            return new GetLinuxFunctionAppBackupSchedule(frequencyInterval, frequencyUnit, keepAtLeastOneBackup, lastExecutionTime, retentionPeriodDays, startTime);
        }
    }
}
