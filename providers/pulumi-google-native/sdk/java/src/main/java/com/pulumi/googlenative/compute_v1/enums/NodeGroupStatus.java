// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum NodeGroupStatus {
        Creating("CREATING"),
        Deleting("DELETING"),
        Invalid("INVALID"),
        Ready("READY");

        private final String value;

        NodeGroupStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeGroupStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
