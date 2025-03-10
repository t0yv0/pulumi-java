// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Compatibility setting for the schema.
     * 
     */
    @EnumType
    public enum SchemaCompatibility {
        None("NONE"),
        Disabled("DISABLED"),
        Backward("BACKWARD"),
        BackwardAll("BACKWARD_ALL"),
        Forward("FORWARD"),
        ForwardAll("FORWARD_ALL"),
        Full("FULL"),
        FullAll("FULL_ALL");

        private final String value;

        SchemaCompatibility(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchemaCompatibility[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
