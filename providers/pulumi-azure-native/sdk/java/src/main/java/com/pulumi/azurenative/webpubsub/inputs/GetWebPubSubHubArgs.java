// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebPubSubHubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebPubSubHubArgs Empty = new GetWebPubSubHubArgs();

    /**
     * The hub name.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The hub name.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetWebPubSubHubArgs() {}

    private GetWebPubSubHubArgs(GetWebPubSubHubArgs $) {
        this.hubName = $.hubName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebPubSubHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebPubSubHubArgs $;

        public Builder() {
            $ = new GetWebPubSubHubArgs();
        }

        public Builder(GetWebPubSubHubArgs defaults) {
            $ = new GetWebPubSubHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The hub name.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetWebPubSubHubArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
