// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of accelerator to use.
     * 
     */
    @EnumType
    public enum GoogleCloudMlV1__AcceleratorConfigType {
        /**
         * Unspecified accelerator type. Default to no GPU.
         * 
         */
        AcceleratorTypeUnspecified("ACCELERATOR_TYPE_UNSPECIFIED"),
        /**
         * Nvidia Tesla K80 GPU.
         * 
         */
        NvidiaTeslaK80("NVIDIA_TESLA_K80"),
        /**
         * Nvidia Tesla P100 GPU.
         * 
         */
        NvidiaTeslaP100("NVIDIA_TESLA_P100"),
        /**
         * Nvidia V100 GPU.
         * 
         */
        NvidiaTeslaV100("NVIDIA_TESLA_V100"),
        /**
         * Nvidia Tesla P4 GPU.
         * 
         */
        NvidiaTeslaP4("NVIDIA_TESLA_P4"),
        /**
         * Nvidia T4 GPU.
         * 
         */
        NvidiaTeslaT4("NVIDIA_TESLA_T4"),
        /**
         * Nvidia A100 GPU.
         * 
         */
        NvidiaTeslaA100("NVIDIA_TESLA_A100"),
        /**
         * TPU v2.
         * 
         */
        TpuV2("TPU_V2"),
        /**
         * TPU v3.
         * 
         */
        TpuV3("TPU_V3"),
        /**
         * TPU v2 POD.
         * 
         */
        TpuV2Pod("TPU_V2_POD"),
        /**
         * TPU v3 POD.
         * 
         */
        TpuV3Pod("TPU_V3_POD");

        private final String value;

        GoogleCloudMlV1__AcceleratorConfigType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1__AcceleratorConfigType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
