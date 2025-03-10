// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the move cost for the service.
     * 
     */
    @EnumType
    public enum MoveCost {
        /**
         * Zero move cost. This value is zero.
         * 
         */
        Zero("Zero"),
        /**
         * Specifies the move cost of the service as Low. The value is 1.
         * 
         */
        Low("Low"),
        /**
         * Specifies the move cost of the service as Medium. The value is 2.
         * 
         */
        Medium("Medium"),
        /**
         * Specifies the move cost of the service as High. The value is 3.
         * 
         */
        High("High");

        private final String value;

        MoveCost(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MoveCost[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
