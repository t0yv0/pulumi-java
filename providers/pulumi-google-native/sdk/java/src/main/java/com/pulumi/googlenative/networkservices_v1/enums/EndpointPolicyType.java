// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    @EnumType
    public enum EndpointPolicyType {
        /**
         * Default value. Must not be used.
         * 
         */
        EndpointPolicyTypeUnspecified("ENDPOINT_POLICY_TYPE_UNSPECIFIED"),
        /**
         * Represents a proxy deployed as a sidecar.
         * 
         */
        SidecarProxy("SIDECAR_PROXY"),
        /**
         * Represents a proxyless gRPC backend.
         * 
         */
        GrpcServer("GRPC_SERVER");

        private final String value;

        EndpointPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
