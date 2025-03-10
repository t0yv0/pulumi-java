// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Volume size
     * 
     */
    @EnumType
    public enum SizeTypes {
        Small("Small"),
        Medium("Medium"),
        Large("Large");

        private final String value;

        SizeTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SizeTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
