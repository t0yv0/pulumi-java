// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDatabaseFlagArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsInsightsConfigArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsLocationPreferenceArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsMaintenanceWindowArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsArgs Empty = new DatabaseInstanceSettingsArgs();

    /**
     * This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    @Import(name="activationPolicy")
    private @Nullable Output<String> activationPolicy;

    /**
     * @return This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    public Optional<Output<String>> activationPolicy() {
        return Optional.ofNullable(this.activationPolicy);
    }

    /**
     * The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).&#39; For all instances, ensure that
     * `settings.backup_configuration.enabled` is set to `true`.
     * For MySQL instances, ensure that `settings.backup_configuration.binary_log_enabled` is set to `true`.
     * For Postgres instances, ensure that `settings.backup_configuration.point_in_time_recovery_enabled`
     * is set to `true`.
     * 
     */
    @Import(name="availabilityType")
    private @Nullable Output<String> availabilityType;

    /**
     * @return The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).&#39; For all instances, ensure that
     * `settings.backup_configuration.enabled` is set to `true`.
     * For MySQL instances, ensure that `settings.backup_configuration.binary_log_enabled` is set to `true`.
     * For Postgres instances, ensure that `settings.backup_configuration.point_in_time_recovery_enabled`
     * is set to `true`.
     * 
     */
    public Optional<Output<String>> availabilityType() {
        return Optional.ofNullable(this.availabilityType);
    }

    @Import(name="backupConfiguration")
    private @Nullable Output<DatabaseInstanceSettingsBackupConfigurationArgs> backupConfiguration;

    public Optional<Output<DatabaseInstanceSettingsBackupConfigurationArgs>> backupConfiguration() {
        return Optional.ofNullable(this.backupConfiguration);
    }

    /**
     * The name of server instance collation.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return The name of server instance collation.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    @Import(name="databaseFlags")
    private @Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagArgs>> databaseFlags;

    public Optional<Output<List<DatabaseInstanceSettingsDatabaseFlagArgs>>> databaseFlags() {
        return Optional.ofNullable(this.databaseFlags);
    }

    /**
     * Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    @Import(name="diskAutoresize")
    private @Nullable Output<Boolean> diskAutoresize;

    /**
     * @return Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    public Optional<Output<Boolean>> diskAutoresize() {
        return Optional.ofNullable(this.diskAutoresize);
    }

    @Import(name="diskAutoresizeLimit")
    private @Nullable Output<Integer> diskAutoresizeLimit;

    public Optional<Output<Integer>> diskAutoresizeLimit() {
        return Optional.ofNullable(this.diskAutoresizeLimit);
    }

    /**
     * The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    @Import(name="insightsConfig")
    private @Nullable Output<DatabaseInstanceSettingsInsightsConfigArgs> insightsConfig;

    public Optional<Output<DatabaseInstanceSettingsInsightsConfigArgs>> insightsConfig() {
        return Optional.ofNullable(this.insightsConfig);
    }

    @Import(name="ipConfiguration")
    private @Nullable Output<DatabaseInstanceSettingsIpConfigurationArgs> ipConfiguration;

    public Optional<Output<DatabaseInstanceSettingsIpConfigurationArgs>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    @Import(name="locationPreference")
    private @Nullable Output<DatabaseInstanceSettingsLocationPreferenceArgs> locationPreference;

    public Optional<Output<DatabaseInstanceSettingsLocationPreferenceArgs>> locationPreference() {
        return Optional.ofNullable(this.locationPreference);
    }

    @Import(name="maintenanceWindow")
    private @Nullable Output<DatabaseInstanceSettingsMaintenanceWindowArgs> maintenanceWindow;

    public Optional<Output<DatabaseInstanceSettingsMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    @Import(name="pricingPlan")
    private @Nullable Output<String> pricingPlan;

    /**
     * @return Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    public Optional<Output<String>> pricingPlan() {
        return Optional.ofNullable(this.pricingPlan);
    }

    /**
     * The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    @Import(name="tier", required=true)
    private Output<String> tier;

    /**
     * @return The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    /**
     * A set of key/value user label pairs to assign to the instance.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    /**
     * @return A set of key/value user label pairs to assign to the instance.
     * 
     */
    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private DatabaseInstanceSettingsArgs() {}

    private DatabaseInstanceSettingsArgs(DatabaseInstanceSettingsArgs $) {
        this.activationPolicy = $.activationPolicy;
        this.availabilityType = $.availabilityType;
        this.backupConfiguration = $.backupConfiguration;
        this.collation = $.collation;
        this.databaseFlags = $.databaseFlags;
        this.diskAutoresize = $.diskAutoresize;
        this.diskAutoresizeLimit = $.diskAutoresizeLimit;
        this.diskSize = $.diskSize;
        this.diskType = $.diskType;
        this.insightsConfig = $.insightsConfig;
        this.ipConfiguration = $.ipConfiguration;
        this.locationPreference = $.locationPreference;
        this.maintenanceWindow = $.maintenanceWindow;
        this.pricingPlan = $.pricingPlan;
        this.tier = $.tier;
        this.userLabels = $.userLabels;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsArgs();
        }

        public Builder(DatabaseInstanceSettingsArgs defaults) {
            $ = new DatabaseInstanceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationPolicy This specifies when the instance should be
         * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder activationPolicy(@Nullable Output<String> activationPolicy) {
            $.activationPolicy = activationPolicy;
            return this;
        }

        /**
         * @param activationPolicy This specifies when the instance should be
         * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder activationPolicy(String activationPolicy) {
            return activationPolicy(Output.of(activationPolicy));
        }

        /**
         * @param availabilityType The availability type of the Cloud SQL
         * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).&#39; For all instances, ensure that
         * `settings.backup_configuration.enabled` is set to `true`.
         * For MySQL instances, ensure that `settings.backup_configuration.binary_log_enabled` is set to `true`.
         * For Postgres instances, ensure that `settings.backup_configuration.point_in_time_recovery_enabled`
         * is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder availabilityType(@Nullable Output<String> availabilityType) {
            $.availabilityType = availabilityType;
            return this;
        }

        /**
         * @param availabilityType The availability type of the Cloud SQL
         * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).&#39; For all instances, ensure that
         * `settings.backup_configuration.enabled` is set to `true`.
         * For MySQL instances, ensure that `settings.backup_configuration.binary_log_enabled` is set to `true`.
         * For Postgres instances, ensure that `settings.backup_configuration.point_in_time_recovery_enabled`
         * is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder availabilityType(String availabilityType) {
            return availabilityType(Output.of(availabilityType));
        }

        public Builder backupConfiguration(@Nullable Output<DatabaseInstanceSettingsBackupConfigurationArgs> backupConfiguration) {
            $.backupConfiguration = backupConfiguration;
            return this;
        }

        public Builder backupConfiguration(DatabaseInstanceSettingsBackupConfigurationArgs backupConfiguration) {
            return backupConfiguration(Output.of(backupConfiguration));
        }

        /**
         * @param collation The name of server instance collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation The name of server instance collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        public Builder databaseFlags(@Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagArgs>> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        public Builder databaseFlags(List<DatabaseInstanceSettingsDatabaseFlagArgs> databaseFlags) {
            return databaseFlags(Output.of(databaseFlags));
        }

        public Builder databaseFlags(DatabaseInstanceSettingsDatabaseFlagArgs... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }

        /**
         * @param diskAutoresize Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
         * 
         * @return builder
         * 
         */
        public Builder diskAutoresize(@Nullable Output<Boolean> diskAutoresize) {
            $.diskAutoresize = diskAutoresize;
            return this;
        }

        /**
         * @param diskAutoresize Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
         * 
         * @return builder
         * 
         */
        public Builder diskAutoresize(Boolean diskAutoresize) {
            return diskAutoresize(Output.of(diskAutoresize));
        }

        public Builder diskAutoresizeLimit(@Nullable Output<Integer> diskAutoresizeLimit) {
            $.diskAutoresizeLimit = diskAutoresizeLimit;
            return this;
        }

        public Builder diskAutoresizeLimit(Integer diskAutoresizeLimit) {
            return diskAutoresizeLimit(Output.of(diskAutoresizeLimit));
        }

        /**
         * @param diskSize The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param diskType The type of data disk: PD_SSD or PD_HDD.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The type of data disk: PD_SSD or PD_HDD.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        public Builder insightsConfig(@Nullable Output<DatabaseInstanceSettingsInsightsConfigArgs> insightsConfig) {
            $.insightsConfig = insightsConfig;
            return this;
        }

        public Builder insightsConfig(DatabaseInstanceSettingsInsightsConfigArgs insightsConfig) {
            return insightsConfig(Output.of(insightsConfig));
        }

        public Builder ipConfiguration(@Nullable Output<DatabaseInstanceSettingsIpConfigurationArgs> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(DatabaseInstanceSettingsIpConfigurationArgs ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        public Builder locationPreference(@Nullable Output<DatabaseInstanceSettingsLocationPreferenceArgs> locationPreference) {
            $.locationPreference = locationPreference;
            return this;
        }

        public Builder locationPreference(DatabaseInstanceSettingsLocationPreferenceArgs locationPreference) {
            return locationPreference(Output.of(locationPreference));
        }

        public Builder maintenanceWindow(@Nullable Output<DatabaseInstanceSettingsMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(DatabaseInstanceSettingsMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param pricingPlan Pricing plan for this instance, can only be `PER_USE`.
         * 
         * @return builder
         * 
         */
        public Builder pricingPlan(@Nullable Output<String> pricingPlan) {
            $.pricingPlan = pricingPlan;
            return this;
        }

        /**
         * @param pricingPlan Pricing plan for this instance, can only be `PER_USE`.
         * 
         * @return builder
         * 
         */
        public Builder pricingPlan(String pricingPlan) {
            return pricingPlan(Output.of(pricingPlan));
        }

        /**
         * @param tier The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
         * for more details and supported versions. Postgres supports only shared-core machine types,
         * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
         * 
         * @return builder
         * 
         */
        public Builder tier(Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
         * for more details and supported versions. Postgres supports only shared-core machine types,
         * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param userLabels A set of key/value user label pairs to assign to the instance.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        /**
         * @param userLabels A set of key/value user label pairs to assign to the instance.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public DatabaseInstanceSettingsArgs build() {
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
