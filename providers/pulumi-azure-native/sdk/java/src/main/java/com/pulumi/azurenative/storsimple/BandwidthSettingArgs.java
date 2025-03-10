// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.storsimple.enums.Kind;
import com.pulumi.azurenative.storsimple.inputs.BandwidthScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BandwidthSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthSettingArgs Empty = new BandwidthSettingArgs();

    /**
     * The bandwidth setting name.
     * 
     */
    @Import(name="bandwidthSettingName")
    private @Nullable Output<String> bandwidthSettingName;

    /**
     * @return The bandwidth setting name.
     * 
     */
    public Optional<Output<String>> bandwidthSettingName() {
        return Optional.ofNullable(this.bandwidthSettingName);
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Import(name="kind")
    private @Nullable Output<Kind> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Optional<Output<Kind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private Output<String> managerName;

    /**
     * @return The manager name
     * 
     */
    public Output<String> managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The schedules.
     * 
     */
    @Import(name="schedules", required=true)
    private Output<List<BandwidthScheduleArgs>> schedules;

    /**
     * @return The schedules.
     * 
     */
    public Output<List<BandwidthScheduleArgs>> schedules() {
        return this.schedules;
    }

    private BandwidthSettingArgs() {}

    private BandwidthSettingArgs(BandwidthSettingArgs $) {
        this.bandwidthSettingName = $.bandwidthSettingName;
        this.kind = $.kind;
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
        this.schedules = $.schedules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthSettingArgs $;

        public Builder() {
            $ = new BandwidthSettingArgs();
        }

        public Builder(BandwidthSettingArgs defaults) {
            $ = new BandwidthSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthSettingName The bandwidth setting name.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthSettingName(@Nullable Output<String> bandwidthSettingName) {
            $.bandwidthSettingName = bandwidthSettingName;
            return this;
        }

        /**
         * @param bandwidthSettingName The bandwidth setting name.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthSettingName(String bandwidthSettingName) {
            return bandwidthSettingName(Output.of(bandwidthSettingName));
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<Kind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The Kind of the object. Currently only Series8000 is supported
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(Output<String> managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            return managerName(Output.of(managerName));
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schedules The schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(Output<List<BandwidthScheduleArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        /**
         * @param schedules The schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(List<BandwidthScheduleArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        /**
         * @param schedules The schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(BandwidthScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }

        public BandwidthSettingArgs build() {
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schedules = Objects.requireNonNull($.schedules, "expected parameter 'schedules' to be non-null");
            return $;
        }
    }

}
