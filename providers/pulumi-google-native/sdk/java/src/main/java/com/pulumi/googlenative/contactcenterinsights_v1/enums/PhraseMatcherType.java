// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of this phrase matcher.
     * 
     */
    @EnumType
    public enum PhraseMatcherType {
        /**
         * Unspecified.
         * 
         */
        PhraseMatcherTypeUnspecified("PHRASE_MATCHER_TYPE_UNSPECIFIED"),
        /**
         * Must meet all phrase match rule groups or there is no match.
         * 
         */
        AllOf("ALL_OF"),
        /**
         * If any of the phrase match rule groups are met, there is a match.
         * 
         */
        AnyOf("ANY_OF");

        private final String value;

        PhraseMatcherType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PhraseMatcherType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
