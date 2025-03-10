// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the service resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @Import(name="serviceTopologyName", required=true)
    private String serviceTopologyName;

    /**
     * @return The name of the service topology .
     * 
     */
    public String serviceTopologyName() {
        return this.serviceTopologyName;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.serviceTopologyName = $.serviceTopologyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceTopologyName The name of the service topology .
         * 
         * @return builder
         * 
         */
        public Builder serviceTopologyName(String serviceTopologyName) {
            $.serviceTopologyName = serviceTopologyName;
            return this;
        }

        public GetServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.serviceTopologyName = Objects.requireNonNull($.serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
            return $;
        }
    }

}
