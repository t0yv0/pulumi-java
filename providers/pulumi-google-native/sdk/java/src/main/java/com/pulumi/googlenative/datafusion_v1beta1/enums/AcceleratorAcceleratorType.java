// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    @EnumType
    public enum AcceleratorAcceleratorType {
        /**
         * Default value, if unspecified.
         * 
         */
        AcceleratorTypeUnspecified("ACCELERATOR_TYPE_UNSPECIFIED"),
        /**
         * Change Data Capture accelerator for CDF.
         * 
         */
        Cdc("CDC"),
        /**
         * Cloud Healthcare accelerator for CDF. This accelerator is to enable Cloud Healthcare specific CDF plugins developed by Healthcare team.
         * 
         */
        Healthcare("HEALTHCARE");

        private final String value;

        AcceleratorAcceleratorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AcceleratorAcceleratorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
