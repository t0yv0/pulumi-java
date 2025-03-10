// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A calendar period, semantically &#34;since the start of the current &#34;. At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
     * 
     */
    @EnumType
    public enum ServiceLevelObjectiveCalendarPeriod {
        /**
         * Undefined period, raises an error.
         * 
         */
        CalendarPeriodUnspecified("CALENDAR_PERIOD_UNSPECIFIED"),
        /**
         * A day.
         * 
         */
        Day("DAY"),
        /**
         * A week. Weeks begin on Monday, following ISO 8601 (https://en.wikipedia.org/wiki/ISO_week_date).
         * 
         */
        Week("WEEK"),
        /**
         * A fortnight. The first calendar fortnight of the year begins at the start of week 1 according to ISO 8601 (https://en.wikipedia.org/wiki/ISO_week_date).
         * 
         */
        Fortnight("FORTNIGHT"),
        /**
         * A month.
         * 
         */
        Month("MONTH"),
        /**
         * A quarter. Quarters start on dates 1-Jan, 1-Apr, 1-Jul, and 1-Oct of each year.
         * 
         */
        Quarter("QUARTER"),
        /**
         * A half-year. Half-years start on dates 1-Jan and 1-Jul.
         * 
         */
        Half("HALF"),
        /**
         * A year.
         * 
         */
        Year("YEAR");

        private final String value;

        ServiceLevelObjectiveCalendarPeriod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceLevelObjectiveCalendarPeriod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
