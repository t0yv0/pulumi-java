// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    /**
     * The ID of the API Management Service in which the Gateway exists.
     * 
     */
    @Import(name="apiManagementId", required=true)
    private String apiManagementId;

    /**
     * @return The ID of the API Management Service in which the Gateway exists.
     * 
     */
    public String apiManagementId() {
        return this.apiManagementId;
    }

    /**
     * The name of the API Management Gateway.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the API Management Gateway.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetGatewayArgs() {}

    private GetGatewayArgs(GetGatewayArgs $) {
        this.apiManagementId = $.apiManagementId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayArgs $;

        public Builder() {
            $ = new GetGatewayArgs();
        }

        public Builder(GetGatewayArgs defaults) {
            $ = new GetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementId The ID of the API Management Service in which the Gateway exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(String apiManagementId) {
            $.apiManagementId = apiManagementId;
            return this;
        }

        /**
         * @param name The name of the API Management Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetGatewayArgs build() {
            $.apiManagementId = Objects.requireNonNull($.apiManagementId, "expected parameter 'apiManagementId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
