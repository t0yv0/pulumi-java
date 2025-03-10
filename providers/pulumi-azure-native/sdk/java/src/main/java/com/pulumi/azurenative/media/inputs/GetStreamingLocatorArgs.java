// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamingLocatorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamingLocatorArgs Empty = new GetStreamingLocatorArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Streaming Locator name.
     * 
     */
    @Import(name="streamingLocatorName", required=true)
    private String streamingLocatorName;

    /**
     * @return The Streaming Locator name.
     * 
     */
    public String streamingLocatorName() {
        return this.streamingLocatorName;
    }

    private GetStreamingLocatorArgs() {}

    private GetStreamingLocatorArgs(GetStreamingLocatorArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.streamingLocatorName = $.streamingLocatorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamingLocatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamingLocatorArgs $;

        public Builder() {
            $ = new GetStreamingLocatorArgs();
        }

        public Builder(GetStreamingLocatorArgs defaults) {
            $ = new GetStreamingLocatorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param streamingLocatorName The Streaming Locator name.
         * 
         * @return builder
         * 
         */
        public Builder streamingLocatorName(String streamingLocatorName) {
            $.streamingLocatorName = streamingLocatorName;
            return this;
        }

        public GetStreamingLocatorArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.streamingLocatorName = Objects.requireNonNull($.streamingLocatorName, "expected parameter 'streamingLocatorName' to be non-null");
            return $;
        }
    }

}
