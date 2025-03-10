// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCachePolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyArgs Empty = new GetCachePolicyArgs();

    /**
     * The identifier for the cache policy.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The identifier for the cache policy.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A unique name to identify the cache policy.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A unique name to identify the cache policy.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetCachePolicyArgs() {}

    private GetCachePolicyArgs(GetCachePolicyArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCachePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCachePolicyArgs $;

        public Builder() {
            $ = new GetCachePolicyArgs();
        }

        public Builder(GetCachePolicyArgs defaults) {
            $ = new GetCachePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier for the cache policy.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name A unique name to identify the cache policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetCachePolicyArgs build() {
            return $;
        }
    }

}
