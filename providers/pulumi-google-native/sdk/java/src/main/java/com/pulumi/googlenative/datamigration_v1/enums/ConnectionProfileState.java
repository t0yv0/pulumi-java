// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    @EnumType
    public enum ConnectionProfileState {
        /**
         * The state of the connection profile is unknown.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The connection profile is in draft mode and fully editable.
         * 
         */
        Draft("DRAFT"),
        /**
         * The connection profile is being created.
         * 
         */
        Creating("CREATING"),
        /**
         * The connection profile is ready.
         * 
         */
        Ready("READY"),
        /**
         * The connection profile is being updated.
         * 
         */
        Updating("UPDATING"),
        /**
         * The connection profile is being deleted.
         * 
         */
        Deleting("DELETING"),
        /**
         * The connection profile has been deleted.
         * 
         */
        Deleted("DELETED"),
        /**
         * The last action on the connection profile failed.
         * 
         */
        Failed("FAILED");

        private final String value;

        ConnectionProfileState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionProfileState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
