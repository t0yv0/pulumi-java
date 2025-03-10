// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    @EnumType
    public enum DiskInstantiationConfigInstantiateFrom {
        /**
         * Attach the existing disk in read-only mode. The request will fail if the disk was attached in read-write mode on the source instance. Applicable to: read-only disks.
         * 
         */
        AttachReadOnly("ATTACH_READ_ONLY"),
        /**
         * Create a blank disk. The disk will be created unformatted. Applicable to: additional read-write disks, local SSDs.
         * 
         */
        Blank("BLANK"),
        /**
         * Use the custom image specified in the custom_image field. Applicable to: boot disk, additional read-write disks.
         * 
         */
        CustomImage("CUSTOM_IMAGE"),
        /**
         * Use the default instantiation option for the corresponding type of disk. For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
         * 
         */
        Default("DEFAULT"),
        /**
         * Do not include the disk in the instance template. Applicable to: additional read-write disks, local SSDs, read-only disks.
         * 
         */
        DoNotInclude("DO_NOT_INCLUDE"),
        /**
         * Use the same source image used for creation of the source instance&#39;s corresponding disk. The request will fail if the source VM&#39;s disk was created from a snapshot. Applicable to: boot disk, additional read-write disks.
         * 
         */
        SourceImage("SOURCE_IMAGE"),
        /**
         * Use the same source image family used for creation of the source instance&#39;s corresponding disk. The request will fail if the source image of the source disk does not belong to any image family. Applicable to: boot disk, additional read-write disks.
         * 
         */
        SourceImageFamily("SOURCE_IMAGE_FAMILY");

        private final String value;

        DiskInstantiationConfigInstantiateFrom(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskInstantiationConfigInstantiateFrom[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
