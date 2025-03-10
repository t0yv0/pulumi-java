// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSpringCloudAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpringCloudAppArgs Empty = new GetSpringCloudAppArgs();

    /**
     * The name of the Spring Cloud Application.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Spring Cloud Application.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Spring Cloud Application exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Spring Cloud Application exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Spring Cloud Service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the Spring Cloud Service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetSpringCloudAppArgs() {}

    private GetSpringCloudAppArgs(GetSpringCloudAppArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpringCloudAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpringCloudAppArgs $;

        public Builder() {
            $ = new GetSpringCloudAppArgs();
        }

        public Builder(GetSpringCloudAppArgs defaults) {
            $ = new GetSpringCloudAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Spring Cloud Application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Spring Cloud Application exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the Spring Cloud Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetSpringCloudAppArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
