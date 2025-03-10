// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The Name of the API Management Service in which this User exists.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private String apiManagementName;

    /**
     * @return The Name of the API Management Service in which this User exists.
     * 
     */
    public String apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group in which the API Management Service exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Identifier for the User.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return The Identifier for the User.
     * 
     */
    public String userId() {
        return this.userId;
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.resourceGroupName = $.resourceGroupName;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service in which this User exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param userId The Identifier for the User.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetUserArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
