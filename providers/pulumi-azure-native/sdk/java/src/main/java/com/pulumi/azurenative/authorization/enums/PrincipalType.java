// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The principal type of the assigned principal ID.
     * 
     */
    @EnumType
    public enum PrincipalType {
        User("User"),
        Group("Group"),
        ServicePrincipal("ServicePrincipal"),
        ForeignGroup("ForeignGroup"),
        Device("Device");

        private final String value;

        PrincipalType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PrincipalType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
