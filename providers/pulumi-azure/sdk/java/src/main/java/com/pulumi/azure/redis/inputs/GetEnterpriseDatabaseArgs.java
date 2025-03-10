// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnterpriseDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnterpriseDatabaseArgs Empty = new GetEnterpriseDatabaseArgs();

    /**
     * The resource ID of Redis Enterprise Cluster which hosts the Redis Enterprise Database instance.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The resource ID of Redis Enterprise Cluster which hosts the Redis Enterprise Database instance.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the Redis Enterprise Database.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Redis Enterprise Database.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group the Redis Enterprise Database instance is located in.
     * 
     * @deprecated
     * This field is no longer used and will be removed in the next major version of the Azure Provider
     * 
     */
    @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return The name of the resource group the Redis Enterprise Database instance is located in.
     * 
     * @deprecated
     * This field is no longer used and will be removed in the next major version of the Azure Provider
     * 
     */
    @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private GetEnterpriseDatabaseArgs() {}

    private GetEnterpriseDatabaseArgs(GetEnterpriseDatabaseArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnterpriseDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnterpriseDatabaseArgs $;

        public Builder() {
            $ = new GetEnterpriseDatabaseArgs();
        }

        public Builder(GetEnterpriseDatabaseArgs defaults) {
            $ = new GetEnterpriseDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The resource ID of Redis Enterprise Cluster which hosts the Redis Enterprise Database instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param name The name of the Redis Enterprise Database.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group the Redis Enterprise Database instance is located in.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer used and will be removed in the next major version of the Azure Provider
         * 
         */
        @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetEnterpriseDatabaseArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
