// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.datashare.enums.RecurrenceInterval;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledSynchronizationSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledSynchronizationSettingArgs Empty = new ScheduledSynchronizationSettingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Kind of synchronization setting.
     * Expected value is &#39;ScheduleBased&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of synchronization setting.
     * Expected value is &#39;ScheduleBased&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Recurrence Interval
     * 
     */
    @Import(name="recurrenceInterval", required=true)
    private Output<Either<String,RecurrenceInterval>> recurrenceInterval;

    /**
     * @return Recurrence Interval
     * 
     */
    public Output<Either<String,RecurrenceInterval>> recurrenceInterval() {
        return this.recurrenceInterval;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the synchronization setting to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the share to add the synchronization setting to.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * The name of the synchronizationSetting.
     * 
     */
    @Import(name="synchronizationSettingName")
    private @Nullable Output<String> synchronizationSettingName;

    /**
     * @return The name of the synchronizationSetting.
     * 
     */
    public Optional<Output<String>> synchronizationSettingName() {
        return Optional.ofNullable(this.synchronizationSettingName);
    }

    /**
     * Synchronization time
     * 
     */
    @Import(name="synchronizationTime", required=true)
    private Output<String> synchronizationTime;

    /**
     * @return Synchronization time
     * 
     */
    public Output<String> synchronizationTime() {
        return this.synchronizationTime;
    }

    private ScheduledSynchronizationSettingArgs() {}

    private ScheduledSynchronizationSettingArgs(ScheduledSynchronizationSettingArgs $) {
        this.accountName = $.accountName;
        this.kind = $.kind;
        this.recurrenceInterval = $.recurrenceInterval;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.synchronizationSettingName = $.synchronizationSettingName;
        this.synchronizationTime = $.synchronizationTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledSynchronizationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledSynchronizationSettingArgs $;

        public Builder() {
            $ = new ScheduledSynchronizationSettingArgs();
        }

        public Builder(ScheduledSynchronizationSettingArgs defaults) {
            $ = new ScheduledSynchronizationSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param kind Kind of synchronization setting.
         * Expected value is &#39;ScheduleBased&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of synchronization setting.
         * Expected value is &#39;ScheduleBased&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param recurrenceInterval Recurrence Interval
         * 
         * @return builder
         * 
         */
        public Builder recurrenceInterval(Output<Either<String,RecurrenceInterval>> recurrenceInterval) {
            $.recurrenceInterval = recurrenceInterval;
            return this;
        }

        /**
         * @param recurrenceInterval Recurrence Interval
         * 
         * @return builder
         * 
         */
        public Builder recurrenceInterval(Either<String,RecurrenceInterval> recurrenceInterval) {
            return recurrenceInterval(Output.of(recurrenceInterval));
        }

        /**
         * @param recurrenceInterval Recurrence Interval
         * 
         * @return builder
         * 
         */
        public Builder recurrenceInterval(String recurrenceInterval) {
            return recurrenceInterval(Either.ofLeft(recurrenceInterval));
        }

        /**
         * @param recurrenceInterval Recurrence Interval
         * 
         * @return builder
         * 
         */
        public Builder recurrenceInterval(RecurrenceInterval recurrenceInterval) {
            return recurrenceInterval(Either.ofRight(recurrenceInterval));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareName The name of the share to add the synchronization setting to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the share to add the synchronization setting to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param synchronizationSettingName The name of the synchronizationSetting.
         * 
         * @return builder
         * 
         */
        public Builder synchronizationSettingName(@Nullable Output<String> synchronizationSettingName) {
            $.synchronizationSettingName = synchronizationSettingName;
            return this;
        }

        /**
         * @param synchronizationSettingName The name of the synchronizationSetting.
         * 
         * @return builder
         * 
         */
        public Builder synchronizationSettingName(String synchronizationSettingName) {
            return synchronizationSettingName(Output.of(synchronizationSettingName));
        }

        /**
         * @param synchronizationTime Synchronization time
         * 
         * @return builder
         * 
         */
        public Builder synchronizationTime(Output<String> synchronizationTime) {
            $.synchronizationTime = synchronizationTime;
            return this;
        }

        /**
         * @param synchronizationTime Synchronization time
         * 
         * @return builder
         * 
         */
        public Builder synchronizationTime(String synchronizationTime) {
            return synchronizationTime(Output.of(synchronizationTime));
        }

        public ScheduledSynchronizationSettingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.recurrenceInterval = Objects.requireNonNull($.recurrenceInterval, "expected parameter 'recurrenceInterval' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.synchronizationTime = Objects.requireNonNull($.synchronizationTime, "expected parameter 'synchronizationTime' to be non-null");
            return $;
        }
    }

}
