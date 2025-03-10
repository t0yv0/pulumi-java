// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @EnumType
    public enum MonitoringStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        MonitoringStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MonitoringStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
