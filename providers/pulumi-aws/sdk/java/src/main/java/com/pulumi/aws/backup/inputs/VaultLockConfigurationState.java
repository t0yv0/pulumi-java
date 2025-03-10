// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultLockConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final VaultLockConfigurationState Empty = new VaultLockConfigurationState();

    /**
     * The ARN of the vault.
     * 
     */
    @Import(name="backupVaultArn")
    private @Nullable Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Optional<Output<String>> backupVaultArn() {
        return Optional.ofNullable(this.backupVaultArn);
    }

    /**
     * Name of the backup vault to add a lock configuration for.
     * 
     */
    @Import(name="backupVaultName")
    private @Nullable Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add a lock configuration for.
     * 
     */
    public Optional<Output<String>> backupVaultName() {
        return Optional.ofNullable(this.backupVaultName);
    }

    /**
     * The number of days before the lock date.
     * 
     */
    @Import(name="changeableForDays")
    private @Nullable Output<Integer> changeableForDays;

    /**
     * @return The number of days before the lock date.
     * 
     */
    public Optional<Output<Integer>> changeableForDays() {
        return Optional.ofNullable(this.changeableForDays);
    }

    /**
     * The maximum retention period that the vault retains its recovery points.
     * 
     */
    @Import(name="maxRetentionDays")
    private @Nullable Output<Integer> maxRetentionDays;

    /**
     * @return The maximum retention period that the vault retains its recovery points.
     * 
     */
    public Optional<Output<Integer>> maxRetentionDays() {
        return Optional.ofNullable(this.maxRetentionDays);
    }

    /**
     * The minimum retention period that the vault retains its recovery points.
     * 
     */
    @Import(name="minRetentionDays")
    private @Nullable Output<Integer> minRetentionDays;

    /**
     * @return The minimum retention period that the vault retains its recovery points.
     * 
     */
    public Optional<Output<Integer>> minRetentionDays() {
        return Optional.ofNullable(this.minRetentionDays);
    }

    private VaultLockConfigurationState() {}

    private VaultLockConfigurationState(VaultLockConfigurationState $) {
        this.backupVaultArn = $.backupVaultArn;
        this.backupVaultName = $.backupVaultName;
        this.changeableForDays = $.changeableForDays;
        this.maxRetentionDays = $.maxRetentionDays;
        this.minRetentionDays = $.minRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultLockConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultLockConfigurationState $;

        public Builder() {
            $ = new VaultLockConfigurationState();
        }

        public Builder(VaultLockConfigurationState defaults) {
            $ = new VaultLockConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(@Nullable Output<String> backupVaultArn) {
            $.backupVaultArn = backupVaultArn;
            return this;
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(String backupVaultArn) {
            return backupVaultArn(Output.of(backupVaultArn));
        }

        /**
         * @param backupVaultName Name of the backup vault to add a lock configuration for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(@Nullable Output<String> backupVaultName) {
            $.backupVaultName = backupVaultName;
            return this;
        }

        /**
         * @param backupVaultName Name of the backup vault to add a lock configuration for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(String backupVaultName) {
            return backupVaultName(Output.of(backupVaultName));
        }

        /**
         * @param changeableForDays The number of days before the lock date.
         * 
         * @return builder
         * 
         */
        public Builder changeableForDays(@Nullable Output<Integer> changeableForDays) {
            $.changeableForDays = changeableForDays;
            return this;
        }

        /**
         * @param changeableForDays The number of days before the lock date.
         * 
         * @return builder
         * 
         */
        public Builder changeableForDays(Integer changeableForDays) {
            return changeableForDays(Output.of(changeableForDays));
        }

        /**
         * @param maxRetentionDays The maximum retention period that the vault retains its recovery points.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(@Nullable Output<Integer> maxRetentionDays) {
            $.maxRetentionDays = maxRetentionDays;
            return this;
        }

        /**
         * @param maxRetentionDays The maximum retention period that the vault retains its recovery points.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(Integer maxRetentionDays) {
            return maxRetentionDays(Output.of(maxRetentionDays));
        }

        /**
         * @param minRetentionDays The minimum retention period that the vault retains its recovery points.
         * 
         * @return builder
         * 
         */
        public Builder minRetentionDays(@Nullable Output<Integer> minRetentionDays) {
            $.minRetentionDays = minRetentionDays;
            return this;
        }

        /**
         * @param minRetentionDays The minimum retention period that the vault retains its recovery points.
         * 
         * @return builder
         * 
         */
        public Builder minRetentionDays(Integer minRetentionDays) {
            return minRetentionDays(Output.of(minRetentionDays));
        }

        public VaultLockConfigurationState build() {
            return $;
        }
    }

}
