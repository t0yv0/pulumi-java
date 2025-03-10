// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * channel specifies which release channel the cluster is subscribed to.
     * 
     */
    @EnumType
    public enum ReleaseChannelChannel {
        /**
         * No channel specified.
         * 
         */
        Unspecified("UNSPECIFIED"),
        /**
         * RAPID channel is offered on an early access basis for customers who want to test new releases. WARNING: Versions available in the RAPID Channel may be subject to unresolved issues with no known workaround and are not subject to any SLAs.
         * 
         */
        Rapid("RAPID"),
        /**
         * Clusters subscribed to REGULAR receive versions that are considered GA quality. REGULAR is intended for production users who want to take advantage of new features.
         * 
         */
        Regular("REGULAR"),
        /**
         * Clusters subscribed to STABLE receive versions that are known to be stable and reliable in production.
         * 
         */
        Stable("STABLE");

        private final String value;

        ReleaseChannelChannel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReleaseChannelChannel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
