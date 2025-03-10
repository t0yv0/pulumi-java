// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigFileArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A gRPC service definition.
 * 
 */
public final class ApigatewayApiConfigGrpcServiceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayApiConfigGrpcServiceDefinitionArgs Empty = new ApigatewayApiConfigGrpcServiceDefinitionArgs();

    /**
     * Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
     */
    @Import(name="fileDescriptorSet")
    private @Nullable Output<ApigatewayApiConfigFileArgs> fileDescriptorSet;

    /**
     * @return Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
     * 
     */
    public Optional<Output<ApigatewayApiConfigFileArgs>> fileDescriptorSet() {
        return Optional.ofNullable(this.fileDescriptorSet);
    }

    /**
     * Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate file_descriptor_set.
     * 
     */
    @Import(name="source")
    private @Nullable Output<List<ApigatewayApiConfigFileArgs>> source;

    /**
     * @return Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate file_descriptor_set.
     * 
     */
    public Optional<Output<List<ApigatewayApiConfigFileArgs>>> source() {
        return Optional.ofNullable(this.source);
    }

    private ApigatewayApiConfigGrpcServiceDefinitionArgs() {}

    private ApigatewayApiConfigGrpcServiceDefinitionArgs(ApigatewayApiConfigGrpcServiceDefinitionArgs $) {
        this.fileDescriptorSet = $.fileDescriptorSet;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigGrpcServiceDefinitionArgs $;

        public Builder() {
            $ = new ApigatewayApiConfigGrpcServiceDefinitionArgs();
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionArgs defaults) {
            $ = new ApigatewayApiConfigGrpcServiceDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileDescriptorSet Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
         * 
         * @return builder
         * 
         */
        public Builder fileDescriptorSet(@Nullable Output<ApigatewayApiConfigFileArgs> fileDescriptorSet) {
            $.fileDescriptorSet = fileDescriptorSet;
            return this;
        }

        /**
         * @param fileDescriptorSet Input only. File descriptor set, generated by protoc. To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb. $ protoc --include_imports --include_source_info test.proto -o out.pb
         * 
         * @return builder
         * 
         */
        public Builder fileDescriptorSet(ApigatewayApiConfigFileArgs fileDescriptorSet) {
            return fileDescriptorSet(Output.of(fileDescriptorSet));
        }

        /**
         * @param source Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate file_descriptor_set.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<List<ApigatewayApiConfigFileArgs>> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate file_descriptor_set.
         * 
         * @return builder
         * 
         */
        public Builder source(List<ApigatewayApiConfigFileArgs> source) {
            return source(Output.of(source));
        }

        /**
         * @param source Optional. Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate file_descriptor_set.
         * 
         * @return builder
         * 
         */
        public Builder source(ApigatewayApiConfigFileArgs... source) {
            return source(List.of(source));
        }

        public ApigatewayApiConfigGrpcServiceDefinitionArgs build() {
            return $;
        }
    }

}
