// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    @EnumType
    public enum AutoUserScope {
        /**
         * Specifies that the service should create a new user for the task.
         * 
         */
        Task("Task"),
        /**
         * Specifies that the task runs as the common auto user account which is created on every node in a pool.
         * 
         */
        Pool("Pool");

        private final String value;

        AutoUserScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoUserScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
