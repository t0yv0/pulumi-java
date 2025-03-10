// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Platform hosting this deployment.
     * 
     */
    @EnumType
    public enum DeploymentOccurrencePlatform {
        /**
         * Unknown.
         * 
         */
        PlatformUnspecified("PLATFORM_UNSPECIFIED"),
        /**
         * Google Container Engine.
         * 
         */
        Gke("GKE"),
        /**
         * Google App Engine: Flexible Environment.
         * 
         */
        Flex("FLEX"),
        /**
         * Custom user-defined platform.
         * 
         */
        Custom("CUSTOM");

        private final String value;

        DeploymentOccurrencePlatform(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeploymentOccurrencePlatform[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
