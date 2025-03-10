// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @EnumType
    public enum SSLHealthCheckProxyHeader {
        None("NONE"),
        ProxyV1("PROXY_V1");

        private final String value;

        SSLHealthCheckProxyHeader(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SSLHealthCheckProxyHeader[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
