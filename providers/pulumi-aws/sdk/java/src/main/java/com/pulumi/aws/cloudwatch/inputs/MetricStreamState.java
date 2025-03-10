// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs;
import com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricStreamState extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamState Empty = new MetricStreamState();

    /**
     * ARN of the metric stream.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the metric stream.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
     * 
     */
    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    @Import(name="excludeFilters")
    private @Nullable Output<List<MetricStreamExcludeFilterArgs>> excludeFilters;

    /**
     * @return List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    public Optional<Output<List<MetricStreamExcludeFilterArgs>>> excludeFilters() {
        return Optional.ofNullable(this.excludeFilters);
    }

    /**
     * ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    @Import(name="firehoseArn")
    private @Nullable Output<String> firehoseArn;

    /**
     * @return ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    public Optional<Output<String>> firehoseArn() {
        return Optional.ofNullable(this.firehoseArn);
    }

    /**
     * List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    @Import(name="includeFilters")
    private @Nullable Output<List<MetricStreamIncludeFilterArgs>> includeFilters;

    /**
     * @return List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    public Optional<Output<List<MetricStreamIncludeFilterArgs>>> includeFilters() {
        return Optional.ofNullable(this.includeFilters);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
     * 
     */
    @Import(name="lastUpdateDate")
    private @Nullable Output<String> lastUpdateDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
     * 
     */
    public Optional<Output<String>> lastUpdateDate() {
        return Optional.ofNullable(this.lastUpdateDate);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    @Import(name="outputFormat")
    private @Nullable Output<String> outputFormat;

    /**
     * @return Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    public Optional<Output<String>> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }

    /**
     * ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * State of the metric stream. Possible values are `running` and `stopped`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the metric stream. Possible values are `running` and `stopped`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private MetricStreamState() {}

    private MetricStreamState(MetricStreamState $) {
        this.arn = $.arn;
        this.creationDate = $.creationDate;
        this.excludeFilters = $.excludeFilters;
        this.firehoseArn = $.firehoseArn;
        this.includeFilters = $.includeFilters;
        this.lastUpdateDate = $.lastUpdateDate;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.outputFormat = $.outputFormat;
        this.roleArn = $.roleArn;
        this.state = $.state;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamState $;

        public Builder() {
            $ = new MetricStreamState();
        }

        public Builder(MetricStreamState defaults) {
            $ = new MetricStreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the metric stream.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the metric stream.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param creationDate Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        /**
         * @param creationDate Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(@Nullable Output<List<MetricStreamExcludeFilterArgs>> excludeFilters) {
            $.excludeFilters = excludeFilters;
            return this;
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(List<MetricStreamExcludeFilterArgs> excludeFilters) {
            return excludeFilters(Output.of(excludeFilters));
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(MetricStreamExcludeFilterArgs... excludeFilters) {
            return excludeFilters(List.of(excludeFilters));
        }

        /**
         * @param firehoseArn ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
         * 
         * @return builder
         * 
         */
        public Builder firehoseArn(@Nullable Output<String> firehoseArn) {
            $.firehoseArn = firehoseArn;
            return this;
        }

        /**
         * @param firehoseArn ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
         * 
         * @return builder
         * 
         */
        public Builder firehoseArn(String firehoseArn) {
            return firehoseArn(Output.of(firehoseArn));
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(@Nullable Output<List<MetricStreamIncludeFilterArgs>> includeFilters) {
            $.includeFilters = includeFilters;
            return this;
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(List<MetricStreamIncludeFilterArgs> includeFilters) {
            return includeFilters(Output.of(includeFilters));
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(MetricStreamIncludeFilterArgs... includeFilters) {
            return includeFilters(List.of(includeFilters));
        }

        /**
         * @param lastUpdateDate Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateDate(@Nullable Output<String> lastUpdateDate) {
            $.lastUpdateDate = lastUpdateDate;
            return this;
        }

        /**
         * @param lastUpdateDate Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateDate(String lastUpdateDate) {
            return lastUpdateDate(Output.of(lastUpdateDate));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param outputFormat Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        /**
         * @param outputFormat Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        /**
         * @param roleArn ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param state State of the metric stream. Possible values are `running` and `stopped`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the metric stream. Possible values are `running` and `stopped`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public MetricStreamState build() {
            return $;
        }
    }

}
