// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1beta1.enums.GrpcRouteMethodMatchType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a match against a method.
 * 
 */
public final class GrpcRouteMethodMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrpcRouteMethodMatchArgs Empty = new GrpcRouteMethodMatchArgs();

    /**
     * Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
     * 
     */
    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    /**
     * @return Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
     * 
     */
    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    /**
     * Name of the method to match against. If unspecified, will match all methods.
     * 
     */
    @Import(name="grpcMethod", required=true)
    private Output<String> grpcMethod;

    /**
     * @return Name of the method to match against. If unspecified, will match all methods.
     * 
     */
    public Output<String> grpcMethod() {
        return this.grpcMethod;
    }

    /**
     * Name of the service to match against. If unspecified, will match all services.
     * 
     */
    @Import(name="grpcService", required=true)
    private Output<String> grpcService;

    /**
     * @return Name of the service to match against. If unspecified, will match all services.
     * 
     */
    public Output<String> grpcService() {
        return this.grpcService;
    }

    /**
     * Optional. Specifies how to match against the name. If not specified, a default value of &#34;EXACT&#34; is used.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GrpcRouteMethodMatchType> type;

    /**
     * @return Optional. Specifies how to match against the name. If not specified, a default value of &#34;EXACT&#34; is used.
     * 
     */
    public Optional<Output<GrpcRouteMethodMatchType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GrpcRouteMethodMatchArgs() {}

    private GrpcRouteMethodMatchArgs(GrpcRouteMethodMatchArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.grpcMethod = $.grpcMethod;
        this.grpcService = $.grpcService;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcRouteMethodMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcRouteMethodMatchArgs $;

        public Builder() {
            $ = new GrpcRouteMethodMatchArgs();
        }

        public Builder(GrpcRouteMethodMatchArgs defaults) {
            $ = new GrpcRouteMethodMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caseSensitive Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * @param caseSensitive Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        /**
         * @param grpcMethod Name of the method to match against. If unspecified, will match all methods.
         * 
         * @return builder
         * 
         */
        public Builder grpcMethod(Output<String> grpcMethod) {
            $.grpcMethod = grpcMethod;
            return this;
        }

        /**
         * @param grpcMethod Name of the method to match against. If unspecified, will match all methods.
         * 
         * @return builder
         * 
         */
        public Builder grpcMethod(String grpcMethod) {
            return grpcMethod(Output.of(grpcMethod));
        }

        /**
         * @param grpcService Name of the service to match against. If unspecified, will match all services.
         * 
         * @return builder
         * 
         */
        public Builder grpcService(Output<String> grpcService) {
            $.grpcService = grpcService;
            return this;
        }

        /**
         * @param grpcService Name of the service to match against. If unspecified, will match all services.
         * 
         * @return builder
         * 
         */
        public Builder grpcService(String grpcService) {
            return grpcService(Output.of(grpcService));
        }

        /**
         * @param type Optional. Specifies how to match against the name. If not specified, a default value of &#34;EXACT&#34; is used.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GrpcRouteMethodMatchType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Optional. Specifies how to match against the name. If not specified, a default value of &#34;EXACT&#34; is used.
         * 
         * @return builder
         * 
         */
        public Builder type(GrpcRouteMethodMatchType type) {
            return type(Output.of(type));
        }

        public GrpcRouteMethodMatchArgs build() {
            $.grpcMethod = Objects.requireNonNull($.grpcMethod, "expected parameter 'grpcMethod' to be non-null");
            $.grpcService = Objects.requireNonNull($.grpcService, "expected parameter 'grpcService' to be non-null");
            return $;
        }
    }

}
