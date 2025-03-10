// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @EnumType
    public enum InstanceNicType {
        /**
         * No type specified.
         * 
         */
        UnspecifiedNicType("UNSPECIFIED_NIC_TYPE"),
        /**
         * VIRTIO
         * 
         */
        VirtioNet("VIRTIO_NET"),
        /**
         * GVNIC
         * 
         */
        Gvnic("GVNIC");

        private final String value;

        InstanceNicType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceNicType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
