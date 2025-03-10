// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and AutoLogon.
     * 
     */
    @EnumType
    public enum SettingNames {
        AutoLogon("AutoLogon"),
        FirstLogonCommands("FirstLogonCommands");

        private final String value;

        SettingNames(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SettingNames[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
