// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @EnumType
    public enum CustomRuleEnabledState {
        Disabled("Disabled"),
        Enabled("Enabled");

        private final String value;

        CustomRuleEnabledState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CustomRuleEnabledState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
