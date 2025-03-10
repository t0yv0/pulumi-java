// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseState extends com.pulumi.resources.ResourceArgs {

    public static final ResponseState Empty = new ResponseState();

    /**
     * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    @Import(name="responseParameters")
    private @Nullable Output<Map<String,String>> responseParameters;

    /**
     * @return A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    public Optional<Output<Map<String,String>>> responseParameters() {
        return Optional.ofNullable(this.responseParameters);
    }

    /**
     * A map specifying the templates used to transform the response body.
     * 
     */
    @Import(name="responseTemplates")
    private @Nullable Output<Map<String,String>> responseTemplates;

    /**
     * @return A map specifying the templates used to transform the response body.
     * 
     */
    public Optional<Output<Map<String,String>>> responseTemplates() {
        return Optional.ofNullable(this.responseTemplates);
    }

    /**
     * The response type of the associated GatewayResponse.
     * 
     */
    @Import(name="responseType")
    private @Nullable Output<String> responseType;

    /**
     * @return The response type of the associated GatewayResponse.
     * 
     */
    public Optional<Output<String>> responseType() {
        return Optional.ofNullable(this.responseType);
    }

    /**
     * The string identifier of the associated REST API.
     * 
     */
    @Import(name="restApiId")
    private @Nullable Output<String> restApiId;

    /**
     * @return The string identifier of the associated REST API.
     * 
     */
    public Optional<Output<String>> restApiId() {
        return Optional.ofNullable(this.restApiId);
    }

    /**
     * The HTTP status code of the Gateway Response.
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    /**
     * @return The HTTP status code of the Gateway Response.
     * 
     */
    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private ResponseState() {}

    private ResponseState(ResponseState $) {
        this.responseParameters = $.responseParameters;
        this.responseTemplates = $.responseTemplates;
        this.responseType = $.responseType;
        this.restApiId = $.restApiId;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseState $;

        public Builder() {
            $ = new ResponseState();
        }

        public Builder(ResponseState defaults) {
            $ = new ResponseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param responseParameters A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(@Nullable Output<Map<String,String>> responseParameters) {
            $.responseParameters = responseParameters;
            return this;
        }

        /**
         * @param responseParameters A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(Map<String,String> responseParameters) {
            return responseParameters(Output.of(responseParameters));
        }

        /**
         * @param responseTemplates A map specifying the templates used to transform the response body.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplates(@Nullable Output<Map<String,String>> responseTemplates) {
            $.responseTemplates = responseTemplates;
            return this;
        }

        /**
         * @param responseTemplates A map specifying the templates used to transform the response body.
         * 
         * @return builder
         * 
         */
        public Builder responseTemplates(Map<String,String> responseTemplates) {
            return responseTemplates(Output.of(responseTemplates));
        }

        /**
         * @param responseType The response type of the associated GatewayResponse.
         * 
         * @return builder
         * 
         */
        public Builder responseType(@Nullable Output<String> responseType) {
            $.responseType = responseType;
            return this;
        }

        /**
         * @param responseType The response type of the associated GatewayResponse.
         * 
         * @return builder
         * 
         */
        public Builder responseType(String responseType) {
            return responseType(Output.of(responseType));
        }

        /**
         * @param restApiId The string identifier of the associated REST API.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(@Nullable Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param restApiId The string identifier of the associated REST API.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        /**
         * @param statusCode The HTTP status code of the Gateway Response.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code of the Gateway Response.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ResponseState build() {
            return $;
        }
    }

}
