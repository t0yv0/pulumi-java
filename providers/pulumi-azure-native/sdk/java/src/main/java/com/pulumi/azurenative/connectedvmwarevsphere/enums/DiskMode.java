// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the disk mode.
     * 
     */
    @EnumType
    public enum DiskMode {
        Persistent("persistent"),
        Independent_persistent("independent_persistent"),
        Independent_nonpersistent("independent_nonpersistent");

        private final String value;

        DiskMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
