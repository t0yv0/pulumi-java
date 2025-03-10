// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Third-party Python runtime library that is required by the application.
 * 
 */
public final class LibraryArgs extends com.pulumi.resources.ResourceArgs {

    public static final LibraryArgs Empty = new LibraryArgs();

    /**
     * Name of the library. Example: &#34;django&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the library. Example: &#34;django&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Version of the library to select, or &#34;latest&#34;.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the library to select, or &#34;latest&#34;.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private LibraryArgs() {}

    private LibraryArgs(LibraryArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LibraryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LibraryArgs $;

        public Builder() {
            $ = new LibraryArgs();
        }

        public Builder(LibraryArgs defaults) {
            $ = new LibraryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the library. Example: &#34;django&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the library. Example: &#34;django&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Version of the library to select, or &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the library to select, or &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public LibraryArgs build() {
            return $;
        }
    }

}
