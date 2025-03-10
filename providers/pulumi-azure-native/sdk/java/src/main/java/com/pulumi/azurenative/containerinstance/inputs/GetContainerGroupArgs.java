// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContainerGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerGroupArgs Empty = new GetContainerGroupArgs();

    /**
     * The name of the container group.
     * 
     */
    @Import(name="containerGroupName", required=true)
    private String containerGroupName;

    /**
     * @return The name of the container group.
     * 
     */
    public String containerGroupName() {
        return this.containerGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetContainerGroupArgs() {}

    private GetContainerGroupArgs(GetContainerGroupArgs $) {
        this.containerGroupName = $.containerGroupName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerGroupArgs $;

        public Builder() {
            $ = new GetContainerGroupArgs();
        }

        public Builder(GetContainerGroupArgs defaults) {
            $ = new GetContainerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerGroupName The name of the container group.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(String containerGroupName) {
            $.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetContainerGroupArgs build() {
            $.containerGroupName = Objects.requireNonNull($.containerGroupName, "expected parameter 'containerGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
