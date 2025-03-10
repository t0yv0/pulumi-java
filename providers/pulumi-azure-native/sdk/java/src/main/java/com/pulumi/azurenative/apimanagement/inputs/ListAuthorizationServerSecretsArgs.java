// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAuthorizationServerSecretsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListAuthorizationServerSecretsArgs Empty = new ListAuthorizationServerSecretsArgs();

    /**
     * Identifier of the authorization server.
     * 
     */
    @Import(name="authsid", required=true)
    private String authsid;

    /**
     * @return Identifier of the authorization server.
     * 
     */
    public String authsid() {
        return this.authsid;
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

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private ListAuthorizationServerSecretsArgs() {}

    private ListAuthorizationServerSecretsArgs(ListAuthorizationServerSecretsArgs $) {
        this.authsid = $.authsid;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAuthorizationServerSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAuthorizationServerSecretsArgs $;

        public Builder() {
            $ = new ListAuthorizationServerSecretsArgs();
        }

        public Builder(ListAuthorizationServerSecretsArgs defaults) {
            $ = new ListAuthorizationServerSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authsid Identifier of the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder authsid(String authsid) {
            $.authsid = authsid;
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

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public ListAuthorizationServerSecretsArgs build() {
            $.authsid = Objects.requireNonNull($.authsid, "expected parameter 'authsid' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
