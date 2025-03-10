// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStackArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStackArgs Empty = new GetStackArgs();

    /**
     * The name of the stack
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the stack
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A map of tags associated with this stack.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags associated with this stack.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetStackArgs() {}

    private GetStackArgs(GetStackArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStackArgs $;

        public Builder() {
            $ = new GetStackArgs();
        }

        public Builder(GetStackArgs defaults) {
            $ = new GetStackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the stack
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A map of tags associated with this stack.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetStackArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
