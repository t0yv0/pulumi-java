// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    @EnumType
    public enum DomainAppNetworkAccessType {
        PublicInternetOnly("PublicInternetOnly"),
        VpcOnly("VpcOnly");

        private final String value;

        DomainAppNetworkAccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DomainAppNetworkAccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
