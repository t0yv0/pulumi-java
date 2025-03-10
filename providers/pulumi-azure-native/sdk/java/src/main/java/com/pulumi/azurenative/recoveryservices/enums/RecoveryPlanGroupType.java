// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The group type.
     * 
     */
    @EnumType
    public enum RecoveryPlanGroupType {
        Shutdown("Shutdown"),
        Boot("Boot"),
        Failover("Failover");

        private final String value;

        RecoveryPlanGroupType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RecoveryPlanGroupType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
