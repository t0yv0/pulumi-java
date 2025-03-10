// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum InstanceSuspensionReasonItem {
        /**
         * This is an unknown suspension reason.
         * 
         */
        SqlSuspensionReasonUnspecified("SQL_SUSPENSION_REASON_UNSPECIFIED"),
        /**
         * The instance is suspended due to billing issues (for example:, GCP account issue)
         * 
         */
        BillingIssue("BILLING_ISSUE"),
        /**
         * The instance is suspended due to illegal content (for example:, child pornography, copyrighted material, etc.).
         * 
         */
        LegalIssue("LEGAL_ISSUE"),
        /**
         * The instance is causing operational issues (for example:, causing the database to crash).
         * 
         */
        OperationalIssue("OPERATIONAL_ISSUE"),
        /**
         * The KMS key used by the instance is either revoked or denied access to
         * 
         */
        KmsKeyIssue("KMS_KEY_ISSUE");

        private final String value;

        InstanceSuspensionReasonItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceSuspensionReasonItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
