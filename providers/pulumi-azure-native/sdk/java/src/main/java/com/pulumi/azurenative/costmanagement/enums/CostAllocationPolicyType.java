// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Method of cost allocation for the rule
     * 
     */
    @EnumType
    public enum CostAllocationPolicyType {
        FixedProportion("FixedProportion");

        private final String value;

        CostAllocationPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CostAllocationPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
