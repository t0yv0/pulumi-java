// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.MetricDescriptorLabelArgs;
import com.pulumi.gcp.monitoring.inputs.MetricDescriptorMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricDescriptorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorArgs Empty = new MetricDescriptorArgs();

    /**
     * A human-readable description for the label.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A human-readable description for the label.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<MetricDescriptorLabelArgs>> labels;

    /**
     * @return The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<MetricDescriptorLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    @Import(name="launchStage")
    private @Nullable Output<String> launchStage;

    /**
     * @return The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    public Optional<Output<String>> launchStage() {
        return Optional.ofNullable(this.launchStage);
    }

    /**
     * Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<MetricDescriptorMetadataArgs> metadata;

    /**
     * @return Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MetricDescriptorMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    @Import(name="metricKind", required=true)
    private Output<String> metricKind;

    /**
     * @return Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    public Output<String> metricKind() {
        return this.metricKind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, &#39;/&#39; and underscores &#39;_&#39; are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, &#39;/&#39; and underscores &#39;_&#39; are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @Import(name="valueType", required=true)
    private Output<String> valueType;

    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    public Output<String> valueType() {
        return this.valueType;
    }

    private MetricDescriptorArgs() {}

    private MetricDescriptorArgs(MetricDescriptorArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.launchStage = $.launchStage;
        this.metadata = $.metadata;
        this.metricKind = $.metricKind;
        this.project = $.project;
        this.type = $.type;
        this.unit = $.unit;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDescriptorArgs $;

        public Builder() {
            $ = new MetricDescriptorArgs();
        }

        public Builder(MetricDescriptorArgs defaults) {
            $ = new MetricDescriptorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description for the label.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description for the label.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<MetricDescriptorLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<MetricDescriptorLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder labels(MetricDescriptorLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param launchStage The launch stage of the metric definition.
         * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(@Nullable Output<String> launchStage) {
            $.launchStage = launchStage;
            return this;
        }

        /**
         * @param launchStage The launch stage of the metric definition.
         * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(String launchStage) {
            return launchStage(Output.of(launchStage));
        }

        /**
         * @param metadata Metadata which can be used to guide usage of the metric.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<MetricDescriptorMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata which can be used to guide usage of the metric.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadata(MetricDescriptorMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param metricKind Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
         * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
         * 
         * @return builder
         * 
         */
        public Builder metricKind(Output<String> metricKind) {
            $.metricKind = metricKind;
            return this;
        }

        /**
         * @param metricKind Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
         * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
         * 
         * @return builder
         * 
         */
        public Builder metricKind(String metricKind) {
            return metricKind(Output.of(metricKind));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, &#39;/&#39; and underscores &#39;_&#39; are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, &#39;/&#39; and underscores &#39;_&#39; are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unit The units in which the metric value is reported. It is only applicable if the
         * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
         * the stored metric values.
         * Different systems may scale the values to be more easily displayed (so a value of
         * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
         * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
         * thousands of bytes, no matter how it may be displayed.
         * If you want a custom metric to record the exact number of CPU-seconds used by a job,
         * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
         * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
         * 12005.
         * Alternatively, if you want a custom metric to record data in a more granular way, you
         * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
         * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
         * The supported units are a subset of The Unified Code for Units of Measure standard.
         * More info can be found in the API documentation
         * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The units in which the metric value is reported. It is only applicable if the
         * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
         * the stored metric values.
         * Different systems may scale the values to be more easily displayed (so a value of
         * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
         * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
         * thousands of bytes, no matter how it may be displayed.
         * If you want a custom metric to record the exact number of CPU-seconds used by a job,
         * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
         * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
         * 12005.
         * Alternatively, if you want a custom metric to record data in a more granular way, you
         * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
         * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
         * The supported units are a subset of The Unified Code for Units of Measure standard.
         * More info can be found in the API documentation
         * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `STRING`, `BOOL`, and `INT64`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType The type of data that can be assigned to the label.
         * Default value is `STRING`.
         * Possible values are `STRING`, `BOOL`, and `INT64`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public MetricDescriptorArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.metricKind = Objects.requireNonNull($.metricKind, "expected parameter 'metricKind' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.valueType = Objects.requireNonNull($.valueType, "expected parameter 'valueType' to be non-null");
            return $;
        }
    }

}
