// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The current state of the environment.
     * 
     */
    @EnumType
    public enum EnvironmentState {
        /**
         * The state of the environment is unknown.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The environment is in the process of being created.
         * 
         */
        Creating("CREATING"),
        /**
         * The environment is currently running and healthy. It is ready for use.
         * 
         */
        Running("RUNNING"),
        /**
         * The environment is being updated. It remains usable but cannot receive additional update requests or be deleted at this time.
         * 
         */
        Updating("UPDATING"),
        /**
         * The environment is undergoing deletion. It cannot be used.
         * 
         */
        Deleting("DELETING"),
        /**
         * The environment has encountered an error and cannot be used.
         * 
         */
        Error("ERROR");

        private final String value;

        EnvironmentState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
