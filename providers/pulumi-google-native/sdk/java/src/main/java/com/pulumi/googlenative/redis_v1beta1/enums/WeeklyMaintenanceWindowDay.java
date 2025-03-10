// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The day of week that maintenance updates occur.
     * 
     */
    @EnumType
    public enum WeeklyMaintenanceWindowDay {
        /**
         * The day of the week is unspecified.
         * 
         */
        DayOfWeekUnspecified("DAY_OF_WEEK_UNSPECIFIED"),
        /**
         * Monday
         * 
         */
        Monday("MONDAY"),
        /**
         * Tuesday
         * 
         */
        Tuesday("TUESDAY"),
        /**
         * Wednesday
         * 
         */
        Wednesday("WEDNESDAY"),
        /**
         * Thursday
         * 
         */
        Thursday("THURSDAY"),
        /**
         * Friday
         * 
         */
        Friday("FRIDAY"),
        /**
         * Saturday
         * 
         */
        Saturday("SATURDAY"),
        /**
         * Sunday
         * 
         */
        Sunday("SUNDAY");

        private final String value;

        WeeklyMaintenanceWindowDay(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WeeklyMaintenanceWindowDay[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
