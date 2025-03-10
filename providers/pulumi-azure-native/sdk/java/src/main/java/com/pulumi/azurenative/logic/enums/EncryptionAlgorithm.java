// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The encryption algorithm.
     * 
     */
    @EnumType
    public enum EncryptionAlgorithm {
        NotSpecified("NotSpecified"),
        None("None"),
        DES3("DES3"),
        RC2("RC2"),
        AES128("AES128"),
        AES192("AES192"),
        AES256("AES256");

        private final String value;

        EncryptionAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncryptionAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
