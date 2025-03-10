// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode of includeChangeDetails feature. The flag configures whether to include or exclude content of the change before and after values.
     * 
     */
    @EnumType
    public enum ChangeDetailsMode {
        None("None"),
        Include("Include"),
        Exclude("Exclude");

        private final String value;

        ChangeDetailsMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ChangeDetailsMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
