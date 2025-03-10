// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    @EnumType
    public enum EnvironmentApiProxyType {
        /**
         * API proxy type not specified.
         * 
         */
        ApiProxyTypeUnspecified("API_PROXY_TYPE_UNSPECIFIED"),
        /**
         * Programmable API Proxies enable you to develop APIs with highly flexible behavior using bundled policy configuration and one or more programming languages to describe complex sequential and/or conditional flows of logic.
         * 
         */
        Programmable("PROGRAMMABLE"),
        /**
         * Configurable API Proxies enable you to develop efficient APIs using simple configuration while complex execution control flow logic is handled by Apigee. This type only works with the ARCHIVE deployment type and cannot be combined with the PROXY deployment type.
         * 
         */
        Configurable("CONFIGURABLE");

        private final String value;

        EnvironmentApiProxyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentApiProxyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
