// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PersistenceConfigResponse {
    /**
     * @return Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    private final String persistenceMode;
    /**
     * @return The next time that a snapshot attempt is scheduled to occur.
     * 
     */
    private final String rdbNextSnapshotTime;
    /**
     * @return Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    private final String rdbSnapshotPeriod;
    /**
     * @return Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    private final String rdbSnapshotStartTime;

    @CustomType.Constructor
    private PersistenceConfigResponse(
        @CustomType.Parameter("persistenceMode") String persistenceMode,
        @CustomType.Parameter("rdbNextSnapshotTime") String rdbNextSnapshotTime,
        @CustomType.Parameter("rdbSnapshotPeriod") String rdbSnapshotPeriod,
        @CustomType.Parameter("rdbSnapshotStartTime") String rdbSnapshotStartTime) {
        this.persistenceMode = persistenceMode;
        this.rdbNextSnapshotTime = rdbNextSnapshotTime;
        this.rdbSnapshotPeriod = rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = rdbSnapshotStartTime;
    }

    /**
     * @return Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    public String persistenceMode() {
        return this.persistenceMode;
    }
    /**
     * @return The next time that a snapshot attempt is scheduled to occur.
     * 
     */
    public String rdbNextSnapshotTime() {
        return this.rdbNextSnapshotTime;
    }
    /**
     * @return Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    public String rdbSnapshotPeriod() {
        return this.rdbSnapshotPeriod;
    }
    /**
     * @return Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    public String rdbSnapshotStartTime() {
        return this.rdbSnapshotStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String persistenceMode;
        private String rdbNextSnapshotTime;
        private String rdbSnapshotPeriod;
        private String rdbSnapshotStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.persistenceMode = defaults.persistenceMode;
    	      this.rdbNextSnapshotTime = defaults.rdbNextSnapshotTime;
    	      this.rdbSnapshotPeriod = defaults.rdbSnapshotPeriod;
    	      this.rdbSnapshotStartTime = defaults.rdbSnapshotStartTime;
        }

        public Builder persistenceMode(String persistenceMode) {
            this.persistenceMode = Objects.requireNonNull(persistenceMode);
            return this;
        }
        public Builder rdbNextSnapshotTime(String rdbNextSnapshotTime) {
            this.rdbNextSnapshotTime = Objects.requireNonNull(rdbNextSnapshotTime);
            return this;
        }
        public Builder rdbSnapshotPeriod(String rdbSnapshotPeriod) {
            this.rdbSnapshotPeriod = Objects.requireNonNull(rdbSnapshotPeriod);
            return this;
        }
        public Builder rdbSnapshotStartTime(String rdbSnapshotStartTime) {
            this.rdbSnapshotStartTime = Objects.requireNonNull(rdbSnapshotStartTime);
            return this;
        }        public PersistenceConfigResponse build() {
            return new PersistenceConfigResponse(persistenceMode, rdbNextSnapshotTime, rdbSnapshotPeriod, rdbSnapshotStartTime);
        }
    }
}
