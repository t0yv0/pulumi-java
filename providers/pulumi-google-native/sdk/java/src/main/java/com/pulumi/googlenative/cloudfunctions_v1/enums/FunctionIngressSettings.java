// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    @EnumType
    public enum FunctionIngressSettings {
        /**
         * Unspecified.
         * 
         */
        IngressSettingsUnspecified("INGRESS_SETTINGS_UNSPECIFIED"),
        /**
         * Allow HTTP traffic from public and private sources.
         * 
         */
        AllowAll("ALLOW_ALL"),
        /**
         * Allow HTTP traffic from only private VPC sources.
         * 
         */
        AllowInternalOnly("ALLOW_INTERNAL_ONLY"),
        /**
         * Allow HTTP traffic from private VPC sources and through GCLB.
         * 
         */
        AllowInternalAndGclb("ALLOW_INTERNAL_AND_GCLB");

        private final String value;

        FunctionIngressSettings(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FunctionIngressSettings[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
