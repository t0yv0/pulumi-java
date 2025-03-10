// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
     */
    @EnumType
    public enum ComputeSchedulingOnHostMaintenance {
        /**
         * An unknown, unexpected behavior.
         * 
         */
        OnHostMaintenanceUnspecified("ON_HOST_MAINTENANCE_UNSPECIFIED"),
        /**
         * Terminate the instance when the host machine undergoes maintenance.
         * 
         */
        Terminate("TERMINATE"),
        /**
         * Migrate the instance when the host machine undergoes maintenance.
         * 
         */
        Migrate("MIGRATE");

        private final String value;

        ComputeSchedulingOnHostMaintenance(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComputeSchedulingOnHostMaintenance[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
