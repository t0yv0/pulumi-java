// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A condition control that determines how metric-threshold conditions are evaluated when data stops arriving.
     * 
     */
    @EnumType
    public enum MetricThresholdEvaluationMissingData {
        /**
         * An unspecified evaluation missing data option. Equivalent to EVALUATION_MISSING_DATA_NO_OP.
         * 
         */
        EvaluationMissingDataUnspecified("EVALUATION_MISSING_DATA_UNSPECIFIED"),
        /**
         * If there is no data to evaluate the condition, then evaluate the condition as false.
         * 
         */
        EvaluationMissingDataInactive("EVALUATION_MISSING_DATA_INACTIVE"),
        /**
         * If there is no data to evaluate the condition, then evaluate the condition as true. The default for conditions with a duration value.
         * 
         */
        EvaluationMissingDataActive("EVALUATION_MISSING_DATA_ACTIVE"),
        /**
         * Do not evaluate the condition to any value if there is no data.
         * 
         */
        EvaluationMissingDataNoOp("EVALUATION_MISSING_DATA_NO_OP");

        private final String value;

        MetricThresholdEvaluationMissingData(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetricThresholdEvaluationMissingData[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
