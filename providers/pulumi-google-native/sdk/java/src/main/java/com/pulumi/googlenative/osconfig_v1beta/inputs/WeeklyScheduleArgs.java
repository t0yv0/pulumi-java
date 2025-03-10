// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.enums.WeeklyScheduleDayOfWeek;
import java.util.Objects;


/**
 * Represents a weekly schedule.
 * 
 */
public final class WeeklyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WeeklyScheduleArgs Empty = new WeeklyScheduleArgs();

    /**
     * Day of the week.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private Output<WeeklyScheduleDayOfWeek> dayOfWeek;

    /**
     * @return Day of the week.
     * 
     */
    public Output<WeeklyScheduleDayOfWeek> dayOfWeek() {
        return this.dayOfWeek;
    }

    private WeeklyScheduleArgs() {}

    private WeeklyScheduleArgs(WeeklyScheduleArgs $) {
        this.dayOfWeek = $.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyScheduleArgs $;

        public Builder() {
            $ = new WeeklyScheduleArgs();
        }

        public Builder(WeeklyScheduleArgs defaults) {
            $ = new WeeklyScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeek Day of the week.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Output<WeeklyScheduleDayOfWeek> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek Day of the week.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(WeeklyScheduleDayOfWeek dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public WeeklyScheduleArgs build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            return $;
        }
    }

}
