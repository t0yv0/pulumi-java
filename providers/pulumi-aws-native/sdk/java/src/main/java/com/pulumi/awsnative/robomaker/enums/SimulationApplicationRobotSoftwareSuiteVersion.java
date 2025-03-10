// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The version of the robot software suite.
     * 
     */
    @EnumType
    public enum SimulationApplicationRobotSoftwareSuiteVersion {
        Kinetic("Kinetic"),
        Melodic("Melodic"),
        Dashing("Dashing"),
        Foxy("Foxy");

        private final String value;

        SimulationApplicationRobotSoftwareSuiteVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SimulationApplicationRobotSoftwareSuiteVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
