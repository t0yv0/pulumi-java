// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.enums.MetricDescriptorMetadataLaunchStage;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional annotations that can be used to guide the usage of a metric.
 * 
 */
public final class MetricDescriptorMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorMetadataArgs Empty = new MetricDescriptorMetadataArgs();

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
     */
    @Import(name="ingestDelay")
    private @Nullable Output<String> ingestDelay;

    /**
     * @return The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
     */
    public Optional<Output<String>> ingestDelay() {
        return Optional.ofNullable(this.ingestDelay);
    }

    /**
     * Deprecated. Must use the MetricDescriptor.launch_stage instead.
     * 
     * @deprecated
     * Deprecated. Must use the MetricDescriptor.launch_stage instead.
     * 
     */
    @Deprecated /* Deprecated. Must use the MetricDescriptor.launch_stage instead. */
    @Import(name="launchStage")
    private @Nullable Output<MetricDescriptorMetadataLaunchStage> launchStage;

    /**
     * @return Deprecated. Must use the MetricDescriptor.launch_stage instead.
     * 
     * @deprecated
     * Deprecated. Must use the MetricDescriptor.launch_stage instead.
     * 
     */
    @Deprecated /* Deprecated. Must use the MetricDescriptor.launch_stage instead. */
    public Optional<Output<MetricDescriptorMetadataLaunchStage>> launchStage() {
        return Optional.ofNullable(this.launchStage);
    }

    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
     */
    @Import(name="samplePeriod")
    private @Nullable Output<String> samplePeriod;

    /**
     * @return The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
     */
    public Optional<Output<String>> samplePeriod() {
        return Optional.ofNullable(this.samplePeriod);
    }

    private MetricDescriptorMetadataArgs() {}

    private MetricDescriptorMetadataArgs(MetricDescriptorMetadataArgs $) {
        this.ingestDelay = $.ingestDelay;
        this.launchStage = $.launchStage;
        this.samplePeriod = $.samplePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDescriptorMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDescriptorMetadataArgs $;

        public Builder() {
            $ = new MetricDescriptorMetadataArgs();
        }

        public Builder(MetricDescriptorMetadataArgs defaults) {
            $ = new MetricDescriptorMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingestDelay The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
         * 
         * @return builder
         * 
         */
        public Builder ingestDelay(@Nullable Output<String> ingestDelay) {
            $.ingestDelay = ingestDelay;
            return this;
        }

        /**
         * @param ingestDelay The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
         * 
         * @return builder
         * 
         */
        public Builder ingestDelay(String ingestDelay) {
            return ingestDelay(Output.of(ingestDelay));
        }

        /**
         * @param launchStage Deprecated. Must use the MetricDescriptor.launch_stage instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Must use the MetricDescriptor.launch_stage instead.
         * 
         */
        @Deprecated /* Deprecated. Must use the MetricDescriptor.launch_stage instead. */
        public Builder launchStage(@Nullable Output<MetricDescriptorMetadataLaunchStage> launchStage) {
            $.launchStage = launchStage;
            return this;
        }

        /**
         * @param launchStage Deprecated. Must use the MetricDescriptor.launch_stage instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Must use the MetricDescriptor.launch_stage instead.
         * 
         */
        @Deprecated /* Deprecated. Must use the MetricDescriptor.launch_stage instead. */
        public Builder launchStage(MetricDescriptorMetadataLaunchStage launchStage) {
            return launchStage(Output.of(launchStage));
        }

        /**
         * @param samplePeriod The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
         * 
         * @return builder
         * 
         */
        public Builder samplePeriod(@Nullable Output<String> samplePeriod) {
            $.samplePeriod = samplePeriod;
            return this;
        }

        /**
         * @param samplePeriod The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
         * 
         * @return builder
         * 
         */
        public Builder samplePeriod(String samplePeriod) {
            return samplePeriod(Output.of(samplePeriod));
        }

        public MetricDescriptorMetadataArgs build() {
            return $;
        }
    }

}
