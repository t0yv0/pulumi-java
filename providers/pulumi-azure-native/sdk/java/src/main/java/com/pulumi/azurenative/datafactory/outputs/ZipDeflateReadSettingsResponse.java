// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZipDeflateReadSettingsResponse {
    /**
     * @return Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object preserveZipFileNameAsFolder;
    /**
     * @return The Compression setting type.
     * Expected value is &#39;ZipDeflateReadSettings&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ZipDeflateReadSettingsResponse(
        @CustomType.Parameter("preserveZipFileNameAsFolder") @Nullable Object preserveZipFileNameAsFolder,
        @CustomType.Parameter("type") String type) {
        this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
        this.type = type;
    }

    /**
     * @return Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> preserveZipFileNameAsFolder() {
        return Optional.ofNullable(this.preserveZipFileNameAsFolder);
    }
    /**
     * @return The Compression setting type.
     * Expected value is &#39;ZipDeflateReadSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipDeflateReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object preserveZipFileNameAsFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipDeflateReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveZipFileNameAsFolder = defaults.preserveZipFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder preserveZipFileNameAsFolder(@Nullable Object preserveZipFileNameAsFolder) {
            this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ZipDeflateReadSettingsResponse build() {
            return new ZipDeflateReadSettingsResponse(preserveZipFileNameAsFolder, type);
        }
    }
}
