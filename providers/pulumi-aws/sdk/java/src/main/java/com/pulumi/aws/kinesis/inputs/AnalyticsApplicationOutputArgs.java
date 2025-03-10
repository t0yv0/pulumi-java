// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisStreamArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputLambdaArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputArgs Empty = new AnalyticsApplicationOutputArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    @Import(name="kinesisFirehose")
    private @Nullable Output<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose;

    /**
     * @return The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationOutputKinesisFirehoseArgs>> kinesisFirehose() {
        return Optional.ofNullable(this.kinesisFirehose);
    }

    /**
     * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    @Import(name="kinesisStream")
    private @Nullable Output<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream;

    /**
     * @return The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationOutputKinesisStreamArgs>> kinesisStream() {
        return Optional.ofNullable(this.kinesisStream);
    }

    /**
     * The Lambda function destination. See Lambda below for more details.
     * 
     */
    @Import(name="lambda")
    private @Nullable Output<AnalyticsApplicationOutputLambdaArgs> lambda;

    /**
     * @return The Lambda function destination. See Lambda below for more details.
     * 
     */
    public Optional<Output<AnalyticsApplicationOutputLambdaArgs>> lambda() {
        return Optional.ofNullable(this.lambda);
    }

    /**
     * The Name of the in-application stream.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name of the in-application stream.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
     */
    @Import(name="schema", required=true)
    private Output<AnalyticsApplicationOutputSchemaArgs> schema;

    /**
     * @return The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
     */
    public Output<AnalyticsApplicationOutputSchemaArgs> schema() {
        return this.schema;
    }

    private AnalyticsApplicationOutputArgs() {}

    private AnalyticsApplicationOutputArgs(AnalyticsApplicationOutputArgs $) {
        this.id = $.id;
        this.kinesisFirehose = $.kinesisFirehose;
        this.kinesisStream = $.kinesisStream;
        this.lambda = $.lambda;
        this.name = $.name;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationOutputArgs $;

        public Builder() {
            $ = new AnalyticsApplicationOutputArgs();
        }

        public Builder(AnalyticsApplicationOutputArgs defaults) {
            $ = new AnalyticsApplicationOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ARN of the Kinesis Analytics Application.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kinesisFirehose The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
         * See Kinesis Firehose below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehose(@Nullable Output<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose) {
            $.kinesisFirehose = kinesisFirehose;
            return this;
        }

        /**
         * @param kinesisFirehose The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
         * See Kinesis Firehose below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisFirehose(AnalyticsApplicationOutputKinesisFirehoseArgs kinesisFirehose) {
            return kinesisFirehose(Output.of(kinesisFirehose));
        }

        /**
         * @param kinesisStream The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
         * See Kinesis Stream below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStream(@Nullable Output<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream) {
            $.kinesisStream = kinesisStream;
            return this;
        }

        /**
         * @param kinesisStream The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
         * See Kinesis Stream below for more details.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStream(AnalyticsApplicationOutputKinesisStreamArgs kinesisStream) {
            return kinesisStream(Output.of(kinesisStream));
        }

        /**
         * @param lambda The Lambda function destination. See Lambda below for more details.
         * 
         * @return builder
         * 
         */
        public Builder lambda(@Nullable Output<AnalyticsApplicationOutputLambdaArgs> lambda) {
            $.lambda = lambda;
            return this;
        }

        /**
         * @param lambda The Lambda function destination. See Lambda below for more details.
         * 
         * @return builder
         * 
         */
        public Builder lambda(AnalyticsApplicationOutputLambdaArgs lambda) {
            return lambda(Output.of(lambda));
        }

        /**
         * @param name The Name of the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The Schema format of the data written to the destination. See Destination Schema below for more details.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<AnalyticsApplicationOutputSchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The Schema format of the data written to the destination. See Destination Schema below for more details.
         * 
         * @return builder
         * 
         */
        public Builder schema(AnalyticsApplicationOutputSchemaArgs schema) {
            return schema(Output.of(schema));
        }

        public AnalyticsApplicationOutputArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
