// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LibraryRequirementsResponse {
    /**
     * @return The library requirements.
     * 
     */
    private final @Nullable String content;
    /**
     * @return The filename of the library requirements file.
     * 
     */
    private final @Nullable String filename;
    /**
     * @return The last update time of the library requirements file.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private LibraryRequirementsResponse(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("filename") @Nullable String filename,
        @CustomType.Parameter("time") String time) {
        this.content = content;
        this.filename = filename;
        this.time = time;
    }

    /**
     * @return The library requirements.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The filename of the library requirements file.
     * 
     */
    public Optional<String> filename() {
        return Optional.ofNullable(this.filename);
    }
    /**
     * @return The last update time of the library requirements file.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String filename;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
    	      this.time = defaults.time;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public LibraryRequirementsResponse build() {
            return new LibraryRequirementsResponse(content, filename, time);
        }
    }
}
