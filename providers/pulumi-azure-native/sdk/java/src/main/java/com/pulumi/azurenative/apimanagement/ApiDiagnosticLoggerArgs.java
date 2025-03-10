// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDiagnosticLoggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticLoggerArgs Empty = new ApiDiagnosticLoggerArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId", required=true)
    private Output<String> diagnosticId;

    /**
     * @return Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> diagnosticId() {
        return this.diagnosticId;
    }

    /**
     * Logger identifier. Must be unique in the API Management service instance.
     * 
     */
    @Import(name="loggerid")
    private @Nullable Output<String> loggerid;

    /**
     * @return Logger identifier. Must be unique in the API Management service instance.
     * 
     */
    public Optional<Output<String>> loggerid() {
        return Optional.ofNullable(this.loggerid);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ApiDiagnosticLoggerArgs() {}

    private ApiDiagnosticLoggerArgs(ApiDiagnosticLoggerArgs $) {
        this.apiId = $.apiId;
        this.diagnosticId = $.diagnosticId;
        this.loggerid = $.loggerid;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticLoggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticLoggerArgs $;

        public Builder() {
            $ = new ApiDiagnosticLoggerArgs();
        }

        public Builder(ApiDiagnosticLoggerArgs defaults) {
            $ = new ApiDiagnosticLoggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(Output<String> diagnosticId) {
            $.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticId(String diagnosticId) {
            return diagnosticId(Output.of(diagnosticId));
        }

        /**
         * @param loggerid Logger identifier. Must be unique in the API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder loggerid(@Nullable Output<String> loggerid) {
            $.loggerid = loggerid;
            return this;
        }

        /**
         * @param loggerid Logger identifier. Must be unique in the API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder loggerid(String loggerid) {
            return loggerid(Output.of(loggerid));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ApiDiagnosticLoggerArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.diagnosticId = Objects.requireNonNull($.diagnosticId, "expected parameter 'diagnosticId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
