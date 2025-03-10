// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The algorithm used to encrypt &#34;Value&#34;.
     * 
     */
    @EnumType
    public enum EncryptionAlgorithm {
        None("None"),
        AES256("AES256"),
        RSAES_PKCS1_v_1_5("RSAES_PKCS1_v_1_5");

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
