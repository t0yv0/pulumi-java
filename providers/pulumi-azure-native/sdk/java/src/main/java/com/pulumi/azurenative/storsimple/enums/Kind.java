// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @EnumType
    public enum Kind {
        Series8000("Series8000");

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
