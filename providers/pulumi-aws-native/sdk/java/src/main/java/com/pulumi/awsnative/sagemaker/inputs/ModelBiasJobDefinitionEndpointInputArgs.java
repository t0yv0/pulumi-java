// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3DataDistributionType;
import com.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3InputMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The endpoint for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionEndpointInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionEndpointInputArgs Empty = new ModelBiasJobDefinitionEndpointInputArgs();

    /**
     * Monitoring end time offset, e.g. PT0H
     * 
     */
    @Import(name="endTimeOffset")
    private @Nullable Output<String> endTimeOffset;

    /**
     * @return Monitoring end time offset, e.g. PT0H
     * 
     */
    public Optional<Output<String>> endTimeOffset() {
        return Optional.ofNullable(this.endTimeOffset);
    }

    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * JSONpath to locate features in JSONlines dataset
     * 
     */
    @Import(name="featuresAttribute")
    private @Nullable Output<String> featuresAttribute;

    /**
     * @return JSONpath to locate features in JSONlines dataset
     * 
     */
    public Optional<Output<String>> featuresAttribute() {
        return Optional.ofNullable(this.featuresAttribute);
    }

    /**
     * Index or JSONpath to locate predicted label(s)
     * 
     */
    @Import(name="inferenceAttribute")
    private @Nullable Output<String> inferenceAttribute;

    /**
     * @return Index or JSONpath to locate predicted label(s)
     * 
     */
    public Optional<Output<String>> inferenceAttribute() {
        return Optional.ofNullable(this.inferenceAttribute);
    }

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    @Import(name="localPath", required=true)
    private Output<String> localPath;

    /**
     * @return Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    public Output<String> localPath() {
        return this.localPath;
    }

    /**
     * Index or JSONpath to locate probabilities
     * 
     */
    @Import(name="probabilityAttribute")
    private @Nullable Output<String> probabilityAttribute;

    /**
     * @return Index or JSONpath to locate probabilities
     * 
     */
    public Optional<Output<String>> probabilityAttribute() {
        return Optional.ofNullable(this.probabilityAttribute);
    }

    @Import(name="probabilityThresholdAttribute")
    private @Nullable Output<Double> probabilityThresholdAttribute;

    public Optional<Output<Double>> probabilityThresholdAttribute() {
        return Optional.ofNullable(this.probabilityThresholdAttribute);
    }

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @Import(name="s3DataDistributionType")
    private @Nullable Output<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType;

    /**
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    public Optional<Output<ModelBiasJobDefinitionEndpointInputS3DataDistributionType>> s3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }

    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    @Import(name="s3InputMode")
    private @Nullable Output<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode;

    /**
     * @return Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    public Optional<Output<ModelBiasJobDefinitionEndpointInputS3InputMode>> s3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }

    /**
     * Monitoring start time offset, e.g. -PT1H
     * 
     */
    @Import(name="startTimeOffset")
    private @Nullable Output<String> startTimeOffset;

    /**
     * @return Monitoring start time offset, e.g. -PT1H
     * 
     */
    public Optional<Output<String>> startTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    private ModelBiasJobDefinitionEndpointInputArgs() {}

    private ModelBiasJobDefinitionEndpointInputArgs(ModelBiasJobDefinitionEndpointInputArgs $) {
        this.endTimeOffset = $.endTimeOffset;
        this.endpointName = $.endpointName;
        this.featuresAttribute = $.featuresAttribute;
        this.inferenceAttribute = $.inferenceAttribute;
        this.localPath = $.localPath;
        this.probabilityAttribute = $.probabilityAttribute;
        this.probabilityThresholdAttribute = $.probabilityThresholdAttribute;
        this.s3DataDistributionType = $.s3DataDistributionType;
        this.s3InputMode = $.s3InputMode;
        this.startTimeOffset = $.startTimeOffset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelBiasJobDefinitionEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionEndpointInputArgs $;

        public Builder() {
            $ = new ModelBiasJobDefinitionEndpointInputArgs();
        }

        public Builder(ModelBiasJobDefinitionEndpointInputArgs defaults) {
            $ = new ModelBiasJobDefinitionEndpointInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTimeOffset Monitoring end time offset, e.g. PT0H
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(@Nullable Output<String> endTimeOffset) {
            $.endTimeOffset = endTimeOffset;
            return this;
        }

        /**
         * @param endTimeOffset Monitoring end time offset, e.g. PT0H
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(String endTimeOffset) {
            return endTimeOffset(Output.of(endTimeOffset));
        }

        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param featuresAttribute JSONpath to locate features in JSONlines dataset
         * 
         * @return builder
         * 
         */
        public Builder featuresAttribute(@Nullable Output<String> featuresAttribute) {
            $.featuresAttribute = featuresAttribute;
            return this;
        }

        /**
         * @param featuresAttribute JSONpath to locate features in JSONlines dataset
         * 
         * @return builder
         * 
         */
        public Builder featuresAttribute(String featuresAttribute) {
            return featuresAttribute(Output.of(featuresAttribute));
        }

        /**
         * @param inferenceAttribute Index or JSONpath to locate predicted label(s)
         * 
         * @return builder
         * 
         */
        public Builder inferenceAttribute(@Nullable Output<String> inferenceAttribute) {
            $.inferenceAttribute = inferenceAttribute;
            return this;
        }

        /**
         * @param inferenceAttribute Index or JSONpath to locate predicted label(s)
         * 
         * @return builder
         * 
         */
        public Builder inferenceAttribute(String inferenceAttribute) {
            return inferenceAttribute(Output.of(inferenceAttribute));
        }

        /**
         * @param localPath Path to the filesystem where the endpoint data is available to the container.
         * 
         * @return builder
         * 
         */
        public Builder localPath(Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        /**
         * @param localPath Path to the filesystem where the endpoint data is available to the container.
         * 
         * @return builder
         * 
         */
        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        /**
         * @param probabilityAttribute Index or JSONpath to locate probabilities
         * 
         * @return builder
         * 
         */
        public Builder probabilityAttribute(@Nullable Output<String> probabilityAttribute) {
            $.probabilityAttribute = probabilityAttribute;
            return this;
        }

        /**
         * @param probabilityAttribute Index or JSONpath to locate probabilities
         * 
         * @return builder
         * 
         */
        public Builder probabilityAttribute(String probabilityAttribute) {
            return probabilityAttribute(Output.of(probabilityAttribute));
        }

        public Builder probabilityThresholdAttribute(@Nullable Output<Double> probabilityThresholdAttribute) {
            $.probabilityThresholdAttribute = probabilityThresholdAttribute;
            return this;
        }

        public Builder probabilityThresholdAttribute(Double probabilityThresholdAttribute) {
            return probabilityThresholdAttribute(Output.of(probabilityThresholdAttribute));
        }

        /**
         * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
         * 
         * @return builder
         * 
         */
        public Builder s3DataDistributionType(@Nullable Output<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType) {
            $.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        /**
         * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
         * 
         * @return builder
         * 
         */
        public Builder s3DataDistributionType(ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType) {
            return s3DataDistributionType(Output.of(s3DataDistributionType));
        }

        /**
         * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
         * 
         * @return builder
         * 
         */
        public Builder s3InputMode(@Nullable Output<ModelBiasJobDefinitionEndpointInputS3InputMode> s3InputMode) {
            $.s3InputMode = s3InputMode;
            return this;
        }

        /**
         * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
         * 
         * @return builder
         * 
         */
        public Builder s3InputMode(ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode) {
            return s3InputMode(Output.of(s3InputMode));
        }

        /**
         * @param startTimeOffset Monitoring start time offset, e.g. -PT1H
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param startTimeOffset Monitoring start time offset, e.g. -PT1H
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            return startTimeOffset(Output.of(startTimeOffset));
        }

        public ModelBiasJobDefinitionEndpointInputArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.localPath = Objects.requireNonNull($.localPath, "expected parameter 'localPath' to be non-null");
            return $;
        }
    }

}
