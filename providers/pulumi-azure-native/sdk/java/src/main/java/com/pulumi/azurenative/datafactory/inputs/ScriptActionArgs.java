// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom script action to run on HDI ondemand cluster once it&#39;s up.
 * 
 */
public final class ScriptActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptActionArgs Empty = new ScriptActionArgs();

    /**
     * The user provided name of the script action.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The user provided name of the script action.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The parameters for the script action.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameters for the script action.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The node types on which the script action should be executed.
     * 
     */
    @Import(name="roles", required=true)
    private Output<Object> roles;

    /**
     * @return The node types on which the script action should be executed.
     * 
     */
    public Output<Object> roles() {
        return this.roles;
    }

    /**
     * The URI for the script action.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI for the script action.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private ScriptActionArgs() {}

    private ScriptActionArgs(ScriptActionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.roles = $.roles;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptActionArgs $;

        public Builder() {
            $ = new ScriptActionArgs();
        }

        public Builder(ScriptActionArgs defaults) {
            $ = new ScriptActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The user provided name of the script action.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The user provided name of the script action.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The parameters for the script action.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters for the script action.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param roles The node types on which the script action should be executed.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<Object> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles The node types on which the script action should be executed.
         * 
         * @return builder
         * 
         */
        public Builder roles(Object roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param uri The URI for the script action.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI for the script action.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public ScriptActionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
