// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiTagDescriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiTagDescriptionArgs Empty = new GetApiTagDescriptionArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    /**
     * @return API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    public String apiId() {
        return this.apiId;
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

    /**
     * Tag description identifier. Used when creating tagDescription for API/Tag association. Based on API and Tag names.
     * 
     */
    @Import(name="tagDescriptionId", required=true)
    private String tagDescriptionId;

    /**
     * @return Tag description identifier. Used when creating tagDescription for API/Tag association. Based on API and Tag names.
     * 
     */
    public String tagDescriptionId() {
        return this.tagDescriptionId;
    }

    private GetApiTagDescriptionArgs() {}

    private GetApiTagDescriptionArgs(GetApiTagDescriptionArgs $) {
        this.apiId = $.apiId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.tagDescriptionId = $.tagDescriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiTagDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiTagDescriptionArgs $;

        public Builder() {
            $ = new GetApiTagDescriptionArgs();
        }

        public Builder(GetApiTagDescriptionArgs defaults) {
            $ = new GetApiTagDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            $.apiId = apiId;
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

        /**
         * @param tagDescriptionId Tag description identifier. Used when creating tagDescription for API/Tag association. Based on API and Tag names.
         * 
         * @return builder
         * 
         */
        public Builder tagDescriptionId(String tagDescriptionId) {
            $.tagDescriptionId = tagDescriptionId;
            return this;
        }

        public GetApiTagDescriptionArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.tagDescriptionId = Objects.requireNonNull($.tagDescriptionId, "expected parameter 'tagDescriptionId' to be non-null");
            return $;
        }
    }

}
