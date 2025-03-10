// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * A list of cache key parameters for the integration.
     * 
     */
    @Import(name="cacheKeyParameters")
    private @Nullable Output<List<String>> cacheKeyParameters;

    /**
     * @return A list of cache key parameters for the integration.
     * 
     */
    public Optional<Output<List<String>>> cacheKeyParameters() {
        return Optional.ofNullable(this.cacheKeyParameters);
    }

    /**
     * The integration&#39;s cache namespace.
     * 
     */
    @Import(name="cacheNamespace")
    private @Nullable Output<String> cacheNamespace;

    /**
     * @return The integration&#39;s cache namespace.
     * 
     */
    public Optional<Output<String>> cacheNamespace() {
        return Optional.ofNullable(this.cacheNamespace);
    }

    /**
     * The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * The integration input&#39;s [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return The integration input&#39;s [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
     * 
     */
    @Import(name="contentHandling")
    private @Nullable Output<String> contentHandling;

    /**
     * @return Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
     * 
     */
    public Optional<Output<String>> contentHandling() {
        return Optional.ofNullable(this.contentHandling);
    }

    /**
     * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role&#39;s ARN. To require that the caller&#39;s identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<String> credentials;

    /**
     * @return The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role&#39;s ARN. To require that the caller&#39;s identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
     * 
     */
    public Optional<Output<String>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
     * when calling the associated resource.
     * 
     */
    @Import(name="httpMethod", required=true)
    private Output<String> httpMethod;

    /**
     * @return The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
     * when calling the associated resource.
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The integration HTTP method
     * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
     * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * Not all methods are compatible with all `AWS` integrations.
     * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
     * 
     */
    @Import(name="integrationHttpMethod")
    private @Nullable Output<String> integrationHttpMethod;

    /**
     * @return The integration HTTP method
     * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
     * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * Not all methods are compatible with all `AWS` integrations.
     * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
     * 
     */
    public Optional<Output<String>> integrationHttpMethod() {
        return Optional.ofNullable(this.integrationHttpMethod);
    }

    /**
     * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
     * 
     */
    @Import(name="passthroughBehavior")
    private @Nullable Output<String> passthroughBehavior;

    /**
     * @return The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
     * 
     */
    public Optional<Output<String>> passthroughBehavior() {
        return Optional.ofNullable(this.passthroughBehavior);
    }

    /**
     * A map of request query string parameters and headers that should be passed to the backend responder.
     * For example: `request_parameters = { &#34;integration.request.header.X-Some-Other-Header&#34; = &#34;method.request.header.X-Some-Header&#34; }`
     * 
     */
    @Import(name="requestParameters")
    private @Nullable Output<Map<String,String>> requestParameters;

    /**
     * @return A map of request query string parameters and headers that should be passed to the backend responder.
     * For example: `request_parameters = { &#34;integration.request.header.X-Some-Other-Header&#34; = &#34;method.request.header.X-Some-Header&#34; }`
     * 
     */
    public Optional<Output<Map<String,String>>> requestParameters() {
        return Optional.ofNullable(this.requestParameters);
    }

    /**
     * A map of the integration&#39;s request templates.
     * 
     */
    @Import(name="requestTemplates")
    private @Nullable Output<Map<String,String>> requestTemplates;

    /**
     * @return A map of the integration&#39;s request templates.
     * 
     */
    public Optional<Output<Map<String,String>>> requestTemplates() {
        return Optional.ofNullable(this.requestTemplates);
    }

    /**
     * The API resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The API resource ID.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the associated REST API.
     * 
     */
    @Import(name="restApi", required=true)
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API.
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
     * 
     */
    @Import(name="timeoutMilliseconds")
    private @Nullable Output<Integer> timeoutMilliseconds;

    /**
     * @return Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
     * 
     */
    public Optional<Output<Integer>> timeoutMilliseconds() {
        return Optional.ofNullable(this.timeoutMilliseconds);
    }

    /**
     * Configuration block specifying the TLS configuration for an integration. Defined below.
     * 
     */
    @Import(name="tlsConfig")
    private @Nullable Output<IntegrationTlsConfigArgs> tlsConfig;

    /**
     * @return Configuration block specifying the TLS configuration for an integration. Defined below.
     * 
     */
    public Optional<Output<IntegrationTlsConfigArgs>> tlsConfig() {
        return Optional.ofNullable(this.tlsConfig);
    }

    /**
     * The integration input&#39;s [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The integration input&#39;s [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The input&#39;s URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
     * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The input&#39;s URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
     * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
     * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private IntegrationArgs() {}

    private IntegrationArgs(IntegrationArgs $) {
        this.cacheKeyParameters = $.cacheKeyParameters;
        this.cacheNamespace = $.cacheNamespace;
        this.connectionId = $.connectionId;
        this.connectionType = $.connectionType;
        this.contentHandling = $.contentHandling;
        this.credentials = $.credentials;
        this.httpMethod = $.httpMethod;
        this.integrationHttpMethod = $.integrationHttpMethod;
        this.passthroughBehavior = $.passthroughBehavior;
        this.requestParameters = $.requestParameters;
        this.requestTemplates = $.requestTemplates;
        this.resourceId = $.resourceId;
        this.restApi = $.restApi;
        this.timeoutMilliseconds = $.timeoutMilliseconds;
        this.tlsConfig = $.tlsConfig;
        this.type = $.type;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationArgs $;

        public Builder() {
            $ = new IntegrationArgs();
        }

        public Builder(IntegrationArgs defaults) {
            $ = new IntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheKeyParameters A list of cache key parameters for the integration.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyParameters(@Nullable Output<List<String>> cacheKeyParameters) {
            $.cacheKeyParameters = cacheKeyParameters;
            return this;
        }

        /**
         * @param cacheKeyParameters A list of cache key parameters for the integration.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyParameters(List<String> cacheKeyParameters) {
            return cacheKeyParameters(Output.of(cacheKeyParameters));
        }

        /**
         * @param cacheKeyParameters A list of cache key parameters for the integration.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyParameters(String... cacheKeyParameters) {
            return cacheKeyParameters(List.of(cacheKeyParameters));
        }

        /**
         * @param cacheNamespace The integration&#39;s cache namespace.
         * 
         * @return builder
         * 
         */
        public Builder cacheNamespace(@Nullable Output<String> cacheNamespace) {
            $.cacheNamespace = cacheNamespace;
            return this;
        }

        /**
         * @param cacheNamespace The integration&#39;s cache namespace.
         * 
         * @return builder
         * 
         */
        public Builder cacheNamespace(String cacheNamespace) {
            return cacheNamespace(Output.of(cacheNamespace));
        }

        /**
         * @param connectionId The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The id of the VpcLink used for the integration. **Required** if `connection_type` is `VPC_LINK`
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param connectionType The integration input&#39;s [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType The integration input&#39;s [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param contentHandling Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
         * 
         * @return builder
         * 
         */
        public Builder contentHandling(@Nullable Output<String> contentHandling) {
            $.contentHandling = contentHandling;
            return this;
        }

        /**
         * @param contentHandling Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
         * 
         * @return builder
         * 
         */
        public Builder contentHandling(String contentHandling) {
            return contentHandling(Output.of(contentHandling));
        }

        /**
         * @param credentials The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role&#39;s ARN. To require that the caller&#39;s identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<String> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role&#39;s ARN. To require that the caller&#39;s identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
         * 
         * @return builder
         * 
         */
        public Builder credentials(String credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param httpMethod The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
         * when calling the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
         * when calling the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param integrationHttpMethod The integration HTTP method
         * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
         * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
         * Not all methods are compatible with all `AWS` integrations.
         * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
         * 
         * @return builder
         * 
         */
        public Builder integrationHttpMethod(@Nullable Output<String> integrationHttpMethod) {
            $.integrationHttpMethod = integrationHttpMethod;
            return this;
        }

        /**
         * @param integrationHttpMethod The integration HTTP method
         * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
         * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
         * Not all methods are compatible with all `AWS` integrations.
         * e.g., Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
         * 
         * @return builder
         * 
         */
        public Builder integrationHttpMethod(String integrationHttpMethod) {
            return integrationHttpMethod(Output.of(integrationHttpMethod));
        }

        /**
         * @param passthroughBehavior The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
         * 
         * @return builder
         * 
         */
        public Builder passthroughBehavior(@Nullable Output<String> passthroughBehavior) {
            $.passthroughBehavior = passthroughBehavior;
            return this;
        }

        /**
         * @param passthroughBehavior The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `request_templates` is used.
         * 
         * @return builder
         * 
         */
        public Builder passthroughBehavior(String passthroughBehavior) {
            return passthroughBehavior(Output.of(passthroughBehavior));
        }

        /**
         * @param requestParameters A map of request query string parameters and headers that should be passed to the backend responder.
         * For example: `request_parameters = { &#34;integration.request.header.X-Some-Other-Header&#34; = &#34;method.request.header.X-Some-Header&#34; }`
         * 
         * @return builder
         * 
         */
        public Builder requestParameters(@Nullable Output<Map<String,String>> requestParameters) {
            $.requestParameters = requestParameters;
            return this;
        }

        /**
         * @param requestParameters A map of request query string parameters and headers that should be passed to the backend responder.
         * For example: `request_parameters = { &#34;integration.request.header.X-Some-Other-Header&#34; = &#34;method.request.header.X-Some-Header&#34; }`
         * 
         * @return builder
         * 
         */
        public Builder requestParameters(Map<String,String> requestParameters) {
            return requestParameters(Output.of(requestParameters));
        }

        /**
         * @param requestTemplates A map of the integration&#39;s request templates.
         * 
         * @return builder
         * 
         */
        public Builder requestTemplates(@Nullable Output<Map<String,String>> requestTemplates) {
            $.requestTemplates = requestTemplates;
            return this;
        }

        /**
         * @param requestTemplates A map of the integration&#39;s request templates.
         * 
         * @return builder
         * 
         */
        public Builder requestTemplates(Map<String,String> requestTemplates) {
            return requestTemplates(Output.of(requestTemplates));
        }

        /**
         * @param resourceId The API resource ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The API resource ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param restApi The ID of the associated REST API.
         * 
         * @return builder
         * 
         */
        public Builder restApi(Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        /**
         * @param restApi The ID of the associated REST API.
         * 
         * @return builder
         * 
         */
        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        /**
         * @param timeoutMilliseconds Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutMilliseconds(@Nullable Output<Integer> timeoutMilliseconds) {
            $.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }

        /**
         * @param timeoutMilliseconds Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutMilliseconds(Integer timeoutMilliseconds) {
            return timeoutMilliseconds(Output.of(timeoutMilliseconds));
        }

        /**
         * @param tlsConfig Configuration block specifying the TLS configuration for an integration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder tlsConfig(@Nullable Output<IntegrationTlsConfigArgs> tlsConfig) {
            $.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * @param tlsConfig Configuration block specifying the TLS configuration for an integration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder tlsConfig(IntegrationTlsConfigArgs tlsConfig) {
            return tlsConfig(Output.of(tlsConfig));
        }

        /**
         * @param type The integration input&#39;s [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The integration input&#39;s [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connection_type` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uri The input&#39;s URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
         * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
         * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The input&#39;s URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
         * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
         * e.g., `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`. For private integrations, the URI parameter is not used for routing requests to your endpoint, but is used for setting the Host header and for certificate validation.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public IntegrationArgs build() {
            $.httpMethod = Objects.requireNonNull($.httpMethod, "expected parameter 'httpMethod' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.restApi = Objects.requireNonNull($.restApi, "expected parameter 'restApi' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
