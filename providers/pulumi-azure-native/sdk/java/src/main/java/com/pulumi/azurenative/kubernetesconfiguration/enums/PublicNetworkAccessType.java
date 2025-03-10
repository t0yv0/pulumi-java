// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints.
     * 
     */
    @EnumType
    public enum PublicNetworkAccessType {
        /**
         * Allows Azure Arc agents to communicate with Azure Arc services over both public (internet) and private endpoints.
         * 
         */
        Enabled("Enabled"),
        /**
         * Does not allow Azure Arc agents to communicate with Azure Arc services over public (internet) endpoints. The agents must use the private link.
         * 
         */
        Disabled("Disabled");

        private final String value;

        PublicNetworkAccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicNetworkAccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
