// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleMonitoringAppSpecification {
    /**
     * @return An array of arguments for the container used to run the monitoring job.
     * 
     */
    private final @Nullable List<String> containerArguments;
    /**
     * @return Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    private final @Nullable List<String> containerEntrypoint;
    /**
     * @return The container image to be run by the monitoring job.
     * 
     */
    private final String imageUri;
    /**
     * @return An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    private final @Nullable String postAnalyticsProcessorSourceUri;
    /**
     * @return An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    private final @Nullable String recordPreprocessorSourceUri;

    @CustomType.Constructor
    private MonitoringScheduleMonitoringAppSpecification(
        @CustomType.Parameter("containerArguments") @Nullable List<String> containerArguments,
        @CustomType.Parameter("containerEntrypoint") @Nullable List<String> containerEntrypoint,
        @CustomType.Parameter("imageUri") String imageUri,
        @CustomType.Parameter("postAnalyticsProcessorSourceUri") @Nullable String postAnalyticsProcessorSourceUri,
        @CustomType.Parameter("recordPreprocessorSourceUri") @Nullable String recordPreprocessorSourceUri) {
        this.containerArguments = containerArguments;
        this.containerEntrypoint = containerEntrypoint;
        this.imageUri = imageUri;
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    /**
     * @return An array of arguments for the container used to run the monitoring job.
     * 
     */
    public List<String> containerArguments() {
        return this.containerArguments == null ? List.of() : this.containerArguments;
    }
    /**
     * @return Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    public List<String> containerEntrypoint() {
        return this.containerEntrypoint == null ? List.of() : this.containerEntrypoint;
    }
    /**
     * @return The container image to be run by the monitoring job.
     * 
     */
    public String imageUri() {
        return this.imageUri;
    }
    /**
     * @return An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    public Optional<String> postAnalyticsProcessorSourceUri() {
        return Optional.ofNullable(this.postAnalyticsProcessorSourceUri);
    }
    /**
     * @return An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    public Optional<String> recordPreprocessorSourceUri() {
        return Optional.ofNullable(this.recordPreprocessorSourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringAppSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerArguments;
        private @Nullable List<String> containerEntrypoint;
        private String imageUri;
        private @Nullable String postAnalyticsProcessorSourceUri;
        private @Nullable String recordPreprocessorSourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringAppSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArguments = defaults.containerArguments;
    	      this.containerEntrypoint = defaults.containerEntrypoint;
    	      this.imageUri = defaults.imageUri;
    	      this.postAnalyticsProcessorSourceUri = defaults.postAnalyticsProcessorSourceUri;
    	      this.recordPreprocessorSourceUri = defaults.recordPreprocessorSourceUri;
        }

        public Builder containerArguments(@Nullable List<String> containerArguments) {
            this.containerArguments = containerArguments;
            return this;
        }
        public Builder containerArguments(String... containerArguments) {
            return containerArguments(List.of(containerArguments));
        }
        public Builder containerEntrypoint(@Nullable List<String> containerEntrypoint) {
            this.containerEntrypoint = containerEntrypoint;
            return this;
        }
        public Builder containerEntrypoint(String... containerEntrypoint) {
            return containerEntrypoint(List.of(containerEntrypoint));
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder postAnalyticsProcessorSourceUri(@Nullable String postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }
        public Builder recordPreprocessorSourceUri(@Nullable String recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }        public MonitoringScheduleMonitoringAppSpecification build() {
            return new MonitoringScheduleMonitoringAppSpecification(containerArguments, containerEntrypoint, imageUri, postAnalyticsProcessorSourceUri, recordPreprocessorSourceUri);
        }
    }
}
