// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowErrorHandlingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSnowflakeDestinationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSnowflakeDestinationPropertiesArgs Empty = new FlowSnowflakeDestinationPropertiesArgs();

    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    @Import(name="errorHandlingConfig")
    private @Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig;

    public Optional<Output<FlowErrorHandlingConfigArgs>> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }

    @Import(name="intermediateBucketName", required=true)
    private Output<String> intermediateBucketName;

    public Output<String> intermediateBucketName() {
        return this.intermediateBucketName;
    }

    @Import(name="object", required=true)
    private Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    private FlowSnowflakeDestinationPropertiesArgs() {}

    private FlowSnowflakeDestinationPropertiesArgs(FlowSnowflakeDestinationPropertiesArgs $) {
        this.bucketPrefix = $.bucketPrefix;
        this.errorHandlingConfig = $.errorHandlingConfig;
        this.intermediateBucketName = $.intermediateBucketName;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSnowflakeDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSnowflakeDestinationPropertiesArgs $;

        public Builder() {
            $ = new FlowSnowflakeDestinationPropertiesArgs();
        }

        public Builder(FlowSnowflakeDestinationPropertiesArgs defaults) {
            $ = new FlowSnowflakeDestinationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public Builder errorHandlingConfig(@Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig) {
            $.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder errorHandlingConfig(FlowErrorHandlingConfigArgs errorHandlingConfig) {
            return errorHandlingConfig(Output.of(errorHandlingConfig));
        }

        public Builder intermediateBucketName(Output<String> intermediateBucketName) {
            $.intermediateBucketName = intermediateBucketName;
            return this;
        }

        public Builder intermediateBucketName(String intermediateBucketName) {
            return intermediateBucketName(Output.of(intermediateBucketName));
        }

        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public FlowSnowflakeDestinationPropertiesArgs build() {
            $.intermediateBucketName = Objects.requireNonNull($.intermediateBucketName, "expected parameter 'intermediateBucketName' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
