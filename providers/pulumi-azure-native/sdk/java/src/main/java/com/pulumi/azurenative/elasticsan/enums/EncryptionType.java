// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elasticsan.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of encryption
     * 
     */
    @EnumType
    public enum EncryptionType {
        /**
         * Volume is encrypted at rest with Platform managed key. It is the default encryption type. This is not a valid encryption type for disk encryption sets.
         * 
         */
        EncryptionAtRestWithPlatformKey("EncryptionAtRestWithPlatformKey"),
        /**
         * Volume is encrypted at rest with Customer managed key that can be changed and revoked by a customer.
         * 
         */
        EncryptionAtRestWithCustomerKey("EncryptionAtRestWithCustomerKey"),
        /**
         * Volume is encrypted at rest with 2 layers of encryption. One of the keys is Customer managed and the other key is Platform managed.
         * 
         */
        EncryptionAtRestWithPlatformAndCustomerKeys("EncryptionAtRestWithPlatformAndCustomerKeys");

        private final String value;

        EncryptionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncryptionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
