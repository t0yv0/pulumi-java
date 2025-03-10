// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSharedAccessPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedAccessPolicyArgs Empty = new GetSharedAccessPolicyArgs();

    /**
     * The name of the IoTHub to which this Shared Access Policy belongs.
     * 
     */
    @Import(name="iothubName", required=true)
    private String iothubName;

    /**
     * @return The name of the IoTHub to which this Shared Access Policy belongs.
     * 
     */
    public String iothubName() {
        return this.iothubName;
    }

    /**
     * Specifies the name of the IotHub Shared Access Policy resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the IotHub Shared Access Policy resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetSharedAccessPolicyArgs() {}

    private GetSharedAccessPolicyArgs(GetSharedAccessPolicyArgs $) {
        this.iothubName = $.iothubName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedAccessPolicyArgs $;

        public Builder() {
            $ = new GetSharedAccessPolicyArgs();
        }

        public Builder(GetSharedAccessPolicyArgs defaults) {
            $ = new GetSharedAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iothubName The name of the IoTHub to which this Shared Access Policy belongs.
         * 
         * @return builder
         * 
         */
        public Builder iothubName(String iothubName) {
            $.iothubName = iothubName;
            return this;
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetSharedAccessPolicyArgs build() {
            $.iothubName = Objects.requireNonNull($.iothubName, "expected parameter 'iothubName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
