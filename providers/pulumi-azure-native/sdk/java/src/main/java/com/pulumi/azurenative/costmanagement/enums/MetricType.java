// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Metric to use when displaying costs.
     * 
     */
    @EnumType
    public enum MetricType {
        ActualCost("ActualCost"),
        AmortizedCost("AmortizedCost"),
        AHUB("AHUB");

        private final String value;

        MetricType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetricType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
