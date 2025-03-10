// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @EnumType
    public enum CloudAuditOptionsLogName {
        /**
         * Default. Should not be used.
         * 
         */
        UnspecifiedLogName("UNSPECIFIED_LOG_NAME"),
        /**
         * Corresponds to &#34;cloudaudit.googleapis.com/activity&#34;
         * 
         */
        AdminActivity("ADMIN_ACTIVITY"),
        /**
         * Corresponds to &#34;cloudaudit.googleapis.com/data_access&#34;
         * 
         */
        DataAccess("DATA_ACCESS");

        private final String value;

        CloudAuditOptionsLogName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudAuditOptionsLogName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
