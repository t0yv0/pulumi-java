// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImportFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImportFileArgs Empty = new ImportFileArgs();

    /**
     * The contents of the file.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The contents of the file.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The name of the file.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the file.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ImportFileArgs() {}

    private ImportFileArgs(ImportFileArgs $) {
        this.content = $.content;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImportFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImportFileArgs $;

        public Builder() {
            $ = new ImportFileArgs();
        }

        public Builder(ImportFileArgs defaults) {
            $ = new ImportFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The contents of the file.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The contents of the file.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param name The name of the file.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the file.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ImportFileArgs build() {
            return $;
        }
    }

}
