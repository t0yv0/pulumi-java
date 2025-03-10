// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppBackupSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppBackup {
    /**
     * @return Should this backup job be enabled?
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The name which should be used for this Backup.
     * 
     */
    private final String name;
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    private final LinuxWebAppBackupSchedule schedule;
    /**
     * @return The SAS URL to the container.
     * 
     */
    private final String storageAccountUrl;

    @CustomType.Constructor
    private LinuxWebAppBackup(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") LinuxWebAppBackupSchedule schedule,
        @CustomType.Parameter("storageAccountUrl") String storageAccountUrl) {
        this.enabled = enabled;
        this.name = name;
        this.schedule = schedule;
        this.storageAccountUrl = storageAccountUrl;
    }

    /**
     * @return Should this backup job be enabled?
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The name which should be used for this Backup.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `schedule` block as defined below.
     * 
     */
    public LinuxWebAppBackupSchedule schedule() {
        return this.schedule;
    }
    /**
     * @return The SAS URL to the container.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppBackup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String name;
        private LinuxWebAppBackupSchedule schedule;
        private String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(LinuxWebAppBackupSchedule schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }        public LinuxWebAppBackup build() {
            return new LinuxWebAppBackup(enabled, name, schedule, storageAccountUrl);
        }
    }
}
