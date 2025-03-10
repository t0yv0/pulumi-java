// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CertificateVisibility {
        /**
         * The certificate should be visible to the user account under which the start task is run. Note that if AutoUser Scope is Pool for both the StartTask and a Task, this certificate will be visible to the Task as well.
         * 
         */
        StartTask("StartTask"),
        /**
         * The certificate should be visible to the user accounts under which job tasks are run.
         * 
         */
        Task("Task"),
        /**
         * The certificate should be visible to the user accounts under which users remotely access the node.
         * 
         */
        RemoteUser("RemoteUser");

        private final String value;

        CertificateVisibility(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CertificateVisibility[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
