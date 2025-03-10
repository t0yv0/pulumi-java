// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The architecture of the disk. Valid values are ARM64 or X86_64.
     * 
     */
    @EnumType
    public enum DiskArchitecture {
        /**
         * Default value indicating Architecture is not set.
         * 
         */
        ArchitectureUnspecified("ARCHITECTURE_UNSPECIFIED"),
        /**
         * Machines with architecture ARM64
         * 
         */
        Arm64("ARM64"),
        /**
         * Machines with architecture X86_64
         * 
         */
        X8664("X86_64");

        private final String value;

        DiskArchitecture(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskArchitecture[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
