// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RetentionPolicyResponse {
    /**
     * @return Minimum age for Backups created via this BackupPlan (in days). This field MUST be an integer value between 0-90(inclusive). A Backup created under this BackupPlan will NOT be deletable until it reaches Backup&#39;s create_time + backup_delete_lock_days. Updating this field of a BackupPlan does NOT affect existing Backups under it. Backups created AFTER a successful update will inherit the new value. Default: 0 (no delete blocking)
     * 
     */
    private final Integer backupDeleteLockDays;
    /**
     * @return The default maximum age of a Backup created via this BackupPlan. This field MUST be an integer value &gt;= 0. If specified, a Backup created under this BackupPlan will be automatically deleted after its age reaches create_time + backup_retain_days. If not specified, Backups created under this BackupPlan will NOT be subject to automatic deletion. Updating this field does NOT affect existing Backups under it. Backups created AFTER a successful update will automatically pick up the new value. NOTE: Specifying a backup_retain_days smaller than backup_delete_lock_days at creation/updating time will be considered as invalid, and the request will be rejected immediately. Default: 0 (no automatic deletion)
     * 
     */
    private final Integer backupRetainDays;
    /**
     * @return This flag denotes whether the retention policy of this BackupPlan is locked. If set to True, no further update is allowed on this policy, including the `locked` field itself. Default: False
     * 
     */
    private final Boolean locked;

    @CustomType.Constructor
    private RetentionPolicyResponse(
        @CustomType.Parameter("backupDeleteLockDays") Integer backupDeleteLockDays,
        @CustomType.Parameter("backupRetainDays") Integer backupRetainDays,
        @CustomType.Parameter("locked") Boolean locked) {
        this.backupDeleteLockDays = backupDeleteLockDays;
        this.backupRetainDays = backupRetainDays;
        this.locked = locked;
    }

    /**
     * @return Minimum age for Backups created via this BackupPlan (in days). This field MUST be an integer value between 0-90(inclusive). A Backup created under this BackupPlan will NOT be deletable until it reaches Backup&#39;s create_time + backup_delete_lock_days. Updating this field of a BackupPlan does NOT affect existing Backups under it. Backups created AFTER a successful update will inherit the new value. Default: 0 (no delete blocking)
     * 
     */
    public Integer backupDeleteLockDays() {
        return this.backupDeleteLockDays;
    }
    /**
     * @return The default maximum age of a Backup created via this BackupPlan. This field MUST be an integer value &gt;= 0. If specified, a Backup created under this BackupPlan will be automatically deleted after its age reaches create_time + backup_retain_days. If not specified, Backups created under this BackupPlan will NOT be subject to automatic deletion. Updating this field does NOT affect existing Backups under it. Backups created AFTER a successful update will automatically pick up the new value. NOTE: Specifying a backup_retain_days smaller than backup_delete_lock_days at creation/updating time will be considered as invalid, and the request will be rejected immediately. Default: 0 (no automatic deletion)
     * 
     */
    public Integer backupRetainDays() {
        return this.backupRetainDays;
    }
    /**
     * @return This flag denotes whether the retention policy of this BackupPlan is locked. If set to True, no further update is allowed on this policy, including the `locked` field itself. Default: False
     * 
     */
    public Boolean locked() {
        return this.locked;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupDeleteLockDays;
        private Integer backupRetainDays;
        private Boolean locked;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupDeleteLockDays = defaults.backupDeleteLockDays;
    	      this.backupRetainDays = defaults.backupRetainDays;
    	      this.locked = defaults.locked;
        }

        public Builder backupDeleteLockDays(Integer backupDeleteLockDays) {
            this.backupDeleteLockDays = Objects.requireNonNull(backupDeleteLockDays);
            return this;
        }
        public Builder backupRetainDays(Integer backupRetainDays) {
            this.backupRetainDays = Objects.requireNonNull(backupRetainDays);
            return this;
        }
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }        public RetentionPolicyResponse build() {
            return new RetentionPolicyResponse(backupDeleteLockDays, backupRetainDays, locked);
        }
    }
}
