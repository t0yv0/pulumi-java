// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @EnumType
    public enum HealthCheckType {
        Grpc("GRPC"),
        Http("HTTP"),
        Http2("HTTP2"),
        Https("HTTPS"),
        Invalid("INVALID"),
        Ssl("SSL"),
        Tcp("TCP");

        private final String value;

        HealthCheckType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HealthCheckType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
