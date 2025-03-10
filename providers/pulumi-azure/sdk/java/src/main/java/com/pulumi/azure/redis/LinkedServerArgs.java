// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LinkedServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServerArgs Empty = new LinkedServerArgs();

    /**
     * The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="linkedRedisCacheId", required=true)
    private Output<String> linkedRedisCacheId;

    /**
     * @return The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="linkedRedisCacheLocation", required=true)
    private Output<String> linkedRedisCacheLocation;

    /**
     * @return The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="serverRole", required=true)
    private Output<String> serverRole;

    /**
     * @return The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> serverRole() {
        return this.serverRole;
    }

    /**
     * The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    @Import(name="targetRedisCacheName", required=true)
    private Output<String> targetRedisCacheName;

    /**
     * @return The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    public Output<String> targetRedisCacheName() {
        return this.targetRedisCacheName;
    }

    private LinkedServerArgs() {}

    private LinkedServerArgs(LinkedServerArgs $) {
        this.linkedRedisCacheId = $.linkedRedisCacheId;
        this.linkedRedisCacheLocation = $.linkedRedisCacheLocation;
        this.resourceGroupName = $.resourceGroupName;
        this.serverRole = $.serverRole;
        this.targetRedisCacheName = $.targetRedisCacheName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServerArgs $;

        public Builder() {
            $ = new LinkedServerArgs();
        }

        public Builder(LinkedServerArgs defaults) {
            $ = new LinkedServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedRedisCacheId The ID of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheId(Output<String> linkedRedisCacheId) {
            $.linkedRedisCacheId = linkedRedisCacheId;
            return this;
        }

        /**
         * @param linkedRedisCacheId The ID of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheId(String linkedRedisCacheId) {
            return linkedRedisCacheId(Output.of(linkedRedisCacheId));
        }

        /**
         * @param linkedRedisCacheLocation The location of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheLocation(Output<String> linkedRedisCacheLocation) {
            $.linkedRedisCacheLocation = linkedRedisCacheLocation;
            return this;
        }

        /**
         * @param linkedRedisCacheLocation The location of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheLocation(String linkedRedisCacheLocation) {
            return linkedRedisCacheLocation(Output.of(linkedRedisCacheLocation));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverRole The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverRole(Output<String> serverRole) {
            $.serverRole = serverRole;
            return this;
        }

        /**
         * @param serverRole The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverRole(String serverRole) {
            return serverRole(Output.of(serverRole));
        }

        /**
         * @param targetRedisCacheName The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
         * 
         * @return builder
         * 
         */
        public Builder targetRedisCacheName(Output<String> targetRedisCacheName) {
            $.targetRedisCacheName = targetRedisCacheName;
            return this;
        }

        /**
         * @param targetRedisCacheName The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
         * 
         * @return builder
         * 
         */
        public Builder targetRedisCacheName(String targetRedisCacheName) {
            return targetRedisCacheName(Output.of(targetRedisCacheName));
        }

        public LinkedServerArgs build() {
            $.linkedRedisCacheId = Objects.requireNonNull($.linkedRedisCacheId, "expected parameter 'linkedRedisCacheId' to be non-null");
            $.linkedRedisCacheLocation = Objects.requireNonNull($.linkedRedisCacheLocation, "expected parameter 'linkedRedisCacheLocation' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverRole = Objects.requireNonNull($.serverRole, "expected parameter 'serverRole' to be non-null");
            $.targetRedisCacheName = Objects.requireNonNull($.targetRedisCacheName, "expected parameter 'targetRedisCacheName' to be non-null");
            return $;
        }
    }

}
