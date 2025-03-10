// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Cluster principal role.
     * 
     */
    @EnumType
    public enum ClusterPrincipalRole {
        AllDatabasesAdmin("AllDatabasesAdmin"),
        AllDatabasesViewer("AllDatabasesViewer");

        private final String value;

        ClusterPrincipalRole(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClusterPrincipalRole[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
