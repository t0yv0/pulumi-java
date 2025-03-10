// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of DHCP: SERVER or RELAY.
     * 
     */
    @EnumType
    public enum DhcpTypeEnum {
        SERVER_RELAY("SERVER, RELAY");

        private final String value;

        DhcpTypeEnum(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DhcpTypeEnum[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
