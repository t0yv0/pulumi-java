// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Possible states of the rule
     * 
     */
    @EnumType
    public enum RuleState {
        Enabled("Enabled"),
        Disabled("Disabled"),
        Expired("Expired");

        private final String value;

        RuleState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuleState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
