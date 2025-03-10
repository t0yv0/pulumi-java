// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    @EnumType
    public enum OperatingSystemTypes {
        Windows("Windows"),
        Linux("Linux");

        private final String value;

        OperatingSystemTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OperatingSystemTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
