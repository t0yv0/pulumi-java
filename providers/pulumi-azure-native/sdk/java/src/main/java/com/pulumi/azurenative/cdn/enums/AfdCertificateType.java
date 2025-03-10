// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines the source of the SSL certificate.
     * 
     */
    @EnumType
    public enum AfdCertificateType {
        CustomerCertificate("CustomerCertificate"),
        ManagedCertificate("ManagedCertificate");

        private final String value;

        AfdCertificateType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AfdCertificateType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
