// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.runtimeconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    @Import(name="text")
    private @Nullable Output<String> text;

    /**
     * @return or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private VariableArgs() {}

    private VariableArgs(VariableArgs $) {
        this.name = $.name;
        this.parent = $.parent;
        this.project = $.project;
        this.text = $.text;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VariableArgs $;

        public Builder() {
            $ = new VariableArgs();
        }

        public Builder(VariableArgs defaults) {
            $ = new VariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the variable to manage. Note that variable
         * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the variable to manage. Note that variable
         * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The name of the RuntimeConfig resource containing this
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The name of the RuntimeConfig resource containing this
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param text or `value` - (Required) The content to associate with the variable.
         * Exactly one of `text` or `variable` must be specified. If `text` is specified,
         * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
         * is specified, it must be base64 encoded and less than 4096 bytes in length.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text or `value` - (Required) The content to associate with the variable.
         * Exactly one of `text` or `variable` must be specified. If `text` is specified,
         * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
         * is specified, it must be base64 encoded and less than 4096 bytes in length.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VariableArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            return $;
        }
    }

}
