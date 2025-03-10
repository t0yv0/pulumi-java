// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.FileNoteFileType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FileNote represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileNoteArgs Empty = new FileNoteArgs();

    /**
     * Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    @Import(name="checksum")
    private @Nullable Output<List<String>> checksum;

    /**
     * @return Provide a unique identifier to match analysis information on each specific file in a package
     * 
     */
    public Optional<Output<List<String>>> checksum() {
        return Optional.ofNullable(this.checksum);
    }

    /**
     * This field provides information about the type of file identified
     * 
     */
    @Import(name="fileType")
    private @Nullable Output<FileNoteFileType> fileType;

    /**
     * @return This field provides information about the type of file identified
     * 
     */
    public Optional<Output<FileNoteFileType>> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    /**
     * Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Identify the full path and filename that corresponds to the file information in this section
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private FileNoteArgs() {}

    private FileNoteArgs(FileNoteArgs $) {
        this.checksum = $.checksum;
        this.fileType = $.fileType;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileNoteArgs $;

        public Builder() {
            $ = new FileNoteArgs();
        }

        public Builder(FileNoteArgs defaults) {
            $ = new FileNoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checksum Provide a unique identifier to match analysis information on each specific file in a package
         * 
         * @return builder
         * 
         */
        public Builder checksum(@Nullable Output<List<String>> checksum) {
            $.checksum = checksum;
            return this;
        }

        /**
         * @param checksum Provide a unique identifier to match analysis information on each specific file in a package
         * 
         * @return builder
         * 
         */
        public Builder checksum(List<String> checksum) {
            return checksum(Output.of(checksum));
        }

        /**
         * @param checksum Provide a unique identifier to match analysis information on each specific file in a package
         * 
         * @return builder
         * 
         */
        public Builder checksum(String... checksum) {
            return checksum(List.of(checksum));
        }

        /**
         * @param fileType This field provides information about the type of file identified
         * 
         * @return builder
         * 
         */
        public Builder fileType(@Nullable Output<FileNoteFileType> fileType) {
            $.fileType = fileType;
            return this;
        }

        /**
         * @param fileType This field provides information about the type of file identified
         * 
         * @return builder
         * 
         */
        public Builder fileType(FileNoteFileType fileType) {
            return fileType(Output.of(fileType));
        }

        /**
         * @param title Identify the full path and filename that corresponds to the file information in this section
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Identify the full path and filename that corresponds to the file information in this section
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public FileNoteArgs build() {
            return $;
        }
    }

}
