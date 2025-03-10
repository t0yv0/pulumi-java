// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests.
     * 
     */
    @EnumType
    public enum PubsubConfigState {
        /**
         * The subscription configuration has not been checked.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The Pub/Sub subscription is properly configured.
         * 
         */
        Ok("OK"),
        /**
         * The subscription has been deleted.
         * 
         */
        SubscriptionDeleted("SUBSCRIPTION_DELETED"),
        /**
         * The topic has been deleted.
         * 
         */
        TopicDeleted("TOPIC_DELETED"),
        /**
         * Some of the subscription&#39;s field are misconfigured.
         * 
         */
        SubscriptionMisconfigured("SUBSCRIPTION_MISCONFIGURED");

        private final String value;

        PubsubConfigState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PubsubConfigState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
