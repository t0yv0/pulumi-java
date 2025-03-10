// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    @EnumType
    public enum VpnGatewayStackType {
        /**
         * Enable VPN gateway with both IPv4 and IPv6 protocols.
         * 
         */
        Ipv4Ipv6("IPV4_IPV6"),
        /**
         * Enable VPN gateway with only IPv4 protocol.
         * 
         */
        Ipv4Only("IPV4_ONLY");

        private final String value;

        VpnGatewayStackType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VpnGatewayStackType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
