// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    @EnumType
    public enum Confirmation {
        /**
         * Send an e-mail to the user confirming they have successfully signed up.
         * 
         */
        Signup("signup"),
        /**
         * Send an e-mail inviting the user to sign-up and complete registration.
         * 
         */
        Invite("invite");

        private final String value;

        Confirmation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Confirmation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
