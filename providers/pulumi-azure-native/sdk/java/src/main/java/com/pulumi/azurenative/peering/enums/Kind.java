// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of the peering.
     * 
     */
    @EnumType
    public enum Kind {
        Direct("Direct"),
        Exchange("Exchange");

        private final String value;

        Kind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Kind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
