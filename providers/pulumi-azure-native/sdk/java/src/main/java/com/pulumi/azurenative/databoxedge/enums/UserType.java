// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the user.
     * 
     */
    @EnumType
    public enum UserType {
        Share("Share"),
        LocalManagement("LocalManagement"),
        ARM("ARM");

        private final String value;

        UserType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UserType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
