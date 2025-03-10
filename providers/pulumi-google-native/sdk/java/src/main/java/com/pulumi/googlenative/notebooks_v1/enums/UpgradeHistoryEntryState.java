// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The state of this instance upgrade history entry.
     * 
     */
    @EnumType
    public enum UpgradeHistoryEntryState {
        /**
         * State is not specified.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The instance upgrade is started.
         * 
         */
        Started("STARTED"),
        /**
         * The instance upgrade is succeeded.
         * 
         */
        Succeeded("SUCCEEDED"),
        /**
         * The instance upgrade is failed.
         * 
         */
        Failed("FAILED");

        private final String value;

        UpgradeHistoryEntryState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UpgradeHistoryEntryState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
