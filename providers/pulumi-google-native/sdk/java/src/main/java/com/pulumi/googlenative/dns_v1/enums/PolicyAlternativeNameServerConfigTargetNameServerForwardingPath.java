// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @EnumType
    public enum PolicyAlternativeNameServerConfigTargetNameServerForwardingPath {
        /**
         * Cloud DNS makes forwarding decision based on IP address ranges; that is, RFC1918 addresses forward to the target through the VPC and non-RFC1918 addresses forward to the target through the internet
         * 
         */
        Default("default"),
        /**
         * Cloud DNS always forwards to this target through the VPC.
         * 
         */
        Private("private");

        private final String value;

        PolicyAlternativeNameServerConfigTargetNameServerForwardingPath(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PolicyAlternativeNameServerConfigTargetNameServerForwardingPath[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
