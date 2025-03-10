// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    @EnumType
    public enum TlsValidationContextValidationSource {
        Invalid("INVALID"),
        /**
         * USE_PATH specifies that the certificates and private key are obtained from a locally mounted filesystem path.
         * 
         */
        UsePath("USE_PATH"),
        /**
         * USE_SDS specifies that the certificates and private key are obtained from a SDS server.
         * 
         */
        UseSds("USE_SDS");

        private final String value;

        TlsValidationContextValidationSource(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TlsValidationContextValidationSource[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
