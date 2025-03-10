// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The DH Group used in IKE Phase 1 for initial SA.
     * 
     */
    @EnumType
    public enum DhGroup {
        None("None"),
        DHGroup1("DHGroup1"),
        DHGroup2("DHGroup2"),
        DHGroup14("DHGroup14"),
        DHGroup2048("DHGroup2048"),
        ECP256("ECP256"),
        ECP384("ECP384"),
        DHGroup24("DHGroup24");

        private final String value;

        DhGroup(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DhGroup[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
