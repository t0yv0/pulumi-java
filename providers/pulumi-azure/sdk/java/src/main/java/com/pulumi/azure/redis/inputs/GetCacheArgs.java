// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCacheArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCacheArgs Empty = new GetCacheArgs();

    /**
     * The name of the Redis cache
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Redis cache
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group the Redis cache instance is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group the Redis cache instance is located in.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCacheArgs() {}

    private GetCacheArgs(GetCacheArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCacheArgs $;

        public Builder() {
            $ = new GetCacheArgs();
        }

        public Builder(GetCacheArgs defaults) {
            $ = new GetCacheArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Redis cache
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group the Redis cache instance is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCacheArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
