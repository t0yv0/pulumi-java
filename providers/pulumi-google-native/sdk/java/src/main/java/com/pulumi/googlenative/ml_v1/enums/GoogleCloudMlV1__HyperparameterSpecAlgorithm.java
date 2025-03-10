// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @EnumType
    public enum GoogleCloudMlV1__HyperparameterSpecAlgorithm {
        /**
         * The default algorithm used by the hyperparameter tuning service. This is a Bayesian optimization algorithm.
         * 
         */
        AlgorithmUnspecified("ALGORITHM_UNSPECIFIED"),
        /**
         * Simple grid search within the feasible space. To use grid search, all parameters must be `INTEGER`, `CATEGORICAL`, or `DISCRETE`.
         * 
         */
        GridSearch("GRID_SEARCH"),
        /**
         * Simple random search within the feasible space.
         * 
         */
        RandomSearch("RANDOM_SEARCH");

        private final String value;

        GoogleCloudMlV1__HyperparameterSpecAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1__HyperparameterSpecAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
