// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This field provides information about the type of file identified
     * 
     */
    @EnumType
    public enum FileNoteFileType {
        /**
         * Unspecified
         * 
         */
        FileTypeUnspecified("FILE_TYPE_UNSPECIFIED"),
        /**
         * The file is human readable source code (.c, .html, etc.)
         * 
         */
        Source("SOURCE"),
        /**
         * The file is a compiled object, target image or binary executable (.o, .a, etc.)
         * 
         */
        Binary("BINARY"),
        /**
         * The file represents an archive (.tar, .jar, etc.)
         * 
         */
        Archive("ARCHIVE"),
        /**
         * The file is associated with a specific application type (MIME type of application/*)
         * 
         */
        Application("APPLICATION"),
        /**
         * The file is associated with an audio file (MIME type of audio/* , e.g. .mp3)
         * 
         */
        Audio("AUDIO"),
        /**
         * The file is associated with an picture image file (MIME type of image/*, e.g., .jpg, .gif)
         * 
         */
        Image("IMAGE"),
        /**
         * The file is human readable text file (MIME type of text/*)
         * 
         */
        Text("TEXT"),
        /**
         * The file is associated with a video file type (MIME type of video/*)
         * 
         */
        Video("VIDEO"),
        /**
         * The file serves as documentation
         * 
         */
        Documentation("DOCUMENTATION"),
        /**
         * The file is an SPDX document
         * 
         */
        Spdx("SPDX"),
        /**
         * The file doesn&#39;t fit into the above categories (generated artifacts, data files, etc.)
         * 
         */
        Other("OTHER");

        private final String value;

        FileNoteFileType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FileNoteFileType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
