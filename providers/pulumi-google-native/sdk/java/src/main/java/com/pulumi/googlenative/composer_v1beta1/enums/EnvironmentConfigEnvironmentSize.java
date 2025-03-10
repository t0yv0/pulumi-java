// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @EnumType
    public enum EnvironmentConfigEnvironmentSize {
        /**
         * The size of the environment is unspecified.
         * 
         */
        EnvironmentSizeUnspecified("ENVIRONMENT_SIZE_UNSPECIFIED"),
        /**
         * The environment size is small.
         * 
         */
        EnvironmentSizeSmall("ENVIRONMENT_SIZE_SMALL"),
        /**
         * The environment size is medium.
         * 
         */
        EnvironmentSizeMedium("ENVIRONMENT_SIZE_MEDIUM"),
        /**
         * The environment size is large.
         * 
         */
        EnvironmentSizeLarge("ENVIRONMENT_SIZE_LARGE");

        private final String value;

        EnvironmentConfigEnvironmentSize(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentConfigEnvironmentSize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
