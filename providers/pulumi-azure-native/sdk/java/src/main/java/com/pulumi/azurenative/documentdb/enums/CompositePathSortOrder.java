// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Sort order for composite paths.
     * 
     */
    @EnumType
    public enum CompositePathSortOrder {
        Ascending("ascending"),
        Descending("descending");

        private final String value;

        CompositePathSortOrder(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CompositePathSortOrder[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
