// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ZipDeflate compression read settings.
 * 
 */
public final class ZipDeflateReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZipDeflateReadSettingsArgs Empty = new ZipDeflateReadSettingsArgs();

    /**
     * Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="preserveZipFileNameAsFolder")
    private @Nullable Output<Object> preserveZipFileNameAsFolder;

    /**
     * @return Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> preserveZipFileNameAsFolder() {
        return Optional.ofNullable(this.preserveZipFileNameAsFolder);
    }

    /**
     * The Compression setting type.
     * Expected value is &#39;ZipDeflateReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Compression setting type.
     * Expected value is &#39;ZipDeflateReadSettings&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ZipDeflateReadSettingsArgs() {}

    private ZipDeflateReadSettingsArgs(ZipDeflateReadSettingsArgs $) {
        this.preserveZipFileNameAsFolder = $.preserveZipFileNameAsFolder;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZipDeflateReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZipDeflateReadSettingsArgs $;

        public Builder() {
            $ = new ZipDeflateReadSettingsArgs();
        }

        public Builder(ZipDeflateReadSettingsArgs defaults) {
            $ = new ZipDeflateReadSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preserveZipFileNameAsFolder Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder preserveZipFileNameAsFolder(@Nullable Output<Object> preserveZipFileNameAsFolder) {
            $.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
            return this;
        }

        /**
         * @param preserveZipFileNameAsFolder Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder preserveZipFileNameAsFolder(Object preserveZipFileNameAsFolder) {
            return preserveZipFileNameAsFolder(Output.of(preserveZipFileNameAsFolder));
        }

        /**
         * @param type The Compression setting type.
         * Expected value is &#39;ZipDeflateReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Compression setting type.
         * Expected value is &#39;ZipDeflateReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZipDeflateReadSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
