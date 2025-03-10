// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ApplicationInstanceStatus {
        DeploymentPending("DEPLOYMENT_PENDING"),
        DeploymentRequested("DEPLOYMENT_REQUESTED"),
        DeploymentInProgress("DEPLOYMENT_IN_PROGRESS"),
        DeploymentError("DEPLOYMENT_ERROR"),
        DeploymentSucceeded("DEPLOYMENT_SUCCEEDED"),
        RemovalPending("REMOVAL_PENDING"),
        RemovalRequested("REMOVAL_REQUESTED"),
        RemovalInProgress("REMOVAL_IN_PROGRESS"),
        RemovalFailed("REMOVAL_FAILED"),
        RemovalSucceeded("REMOVAL_SUCCEEDED");

        private final String value;

        ApplicationInstanceStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationInstanceStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
