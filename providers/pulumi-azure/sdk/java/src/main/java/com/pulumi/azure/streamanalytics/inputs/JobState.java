// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends com.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     */
    @Import(name="compatibilityLevel")
    private @Nullable Output<String> compatibilityLevel;

    /**
     * @return Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     */
    public Optional<Output<String>> compatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }

    /**
     * Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
     * 
     */
    @Import(name="dataLocale")
    private @Nullable Output<String> dataLocale;

    /**
     * @return Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
     * 
     */
    public Optional<Output<String>> dataLocale() {
        return Optional.ofNullable(this.dataLocale);
    }

    /**
     * Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
     * 
     */
    @Import(name="eventsLateArrivalMaxDelayInSeconds")
    private @Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
     * 
     */
    public Optional<Output<Integer>> eventsLateArrivalMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsLateArrivalMaxDelayInSeconds);
    }

    /**
     * Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
     * 
     */
    @Import(name="eventsOutOfOrderMaxDelayInSeconds")
    private @Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
     * 
     */
    public Optional<Output<Integer>> eventsOutOfOrderMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsOutOfOrderMaxDelayInSeconds);
    }

    /**
     * Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
     * 
     */
    @Import(name="eventsOutOfOrderPolicy")
    private @Nullable Output<String> eventsOutOfOrderPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
     * 
     */
    public Optional<Output<String>> eventsOutOfOrderPolicy() {
        return Optional.ofNullable(this.eventsOutOfOrderPolicy);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<JobIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<JobIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Job ID assigned by the Stream Analytics Job.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The Job ID assigned by the Stream Analytics Job.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
     * 
     */
    @Import(name="outputErrorPolicy")
    private @Nullable Output<String> outputErrorPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
     * 
     */
    public Optional<Output<String>> outputErrorPolicy() {
        return Optional.ofNullable(this.outputErrorPolicy);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    @Import(name="streamAnalyticsClusterId")
    private @Nullable Output<String> streamAnalyticsClusterId;

    /**
     * @return The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    public Optional<Output<String>> streamAnalyticsClusterId() {
        return Optional.ofNullable(this.streamAnalyticsClusterId);
    }

    /**
     * Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
     * 
     */
    @Import(name="streamingUnits")
    private @Nullable Output<Integer> streamingUnits;

    /**
     * @return Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
     * 
     */
    public Optional<Output<Integer>> streamingUnits() {
        return Optional.ofNullable(this.streamingUnits);
    }

    /**
     * A mapping of tags assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
     * 
     */
    @Import(name="transformationQuery")
    private @Nullable Output<String> transformationQuery;

    /**
     * @return Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
     * 
     */
    public Optional<Output<String>> transformationQuery() {
        return Optional.ofNullable(this.transformationQuery);
    }

    /**
     * The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.compatibilityLevel = $.compatibilityLevel;
        this.dataLocale = $.dataLocale;
        this.eventsLateArrivalMaxDelayInSeconds = $.eventsLateArrivalMaxDelayInSeconds;
        this.eventsOutOfOrderMaxDelayInSeconds = $.eventsOutOfOrderMaxDelayInSeconds;
        this.eventsOutOfOrderPolicy = $.eventsOutOfOrderPolicy;
        this.identity = $.identity;
        this.jobId = $.jobId;
        this.location = $.location;
        this.name = $.name;
        this.outputErrorPolicy = $.outputErrorPolicy;
        this.resourceGroupName = $.resourceGroupName;
        this.streamAnalyticsClusterId = $.streamAnalyticsClusterId;
        this.streamingUnits = $.streamingUnits;
        this.tags = $.tags;
        this.transformationQuery = $.transformationQuery;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobState $;

        public Builder() {
            $ = new JobState();
        }

        public Builder(JobState defaults) {
            $ = new JobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compatibilityLevel Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(@Nullable Output<String> compatibilityLevel) {
            $.compatibilityLevel = compatibilityLevel;
            return this;
        }

        /**
         * @param compatibilityLevel Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(String compatibilityLevel) {
            return compatibilityLevel(Output.of(compatibilityLevel));
        }

        /**
         * @param dataLocale Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
         * 
         * @return builder
         * 
         */
        public Builder dataLocale(@Nullable Output<String> dataLocale) {
            $.dataLocale = dataLocale;
            return this;
        }

        /**
         * @param dataLocale Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
         * 
         * @return builder
         * 
         */
        public Builder dataLocale(String dataLocale) {
            return dataLocale(Output.of(dataLocale));
        }

        /**
         * @param eventsLateArrivalMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds) {
            $.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
            return this;
        }

        /**
         * @param eventsLateArrivalMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder eventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
            return eventsLateArrivalMaxDelayInSeconds(Output.of(eventsLateArrivalMaxDelayInSeconds));
        }

        /**
         * @param eventsOutOfOrderMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds) {
            $.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
            return this;
        }

        /**
         * @param eventsOutOfOrderMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
            return eventsOutOfOrderMaxDelayInSeconds(Output.of(eventsOutOfOrderMaxDelayInSeconds));
        }

        /**
         * @param eventsOutOfOrderPolicy Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderPolicy(@Nullable Output<String> eventsOutOfOrderPolicy) {
            $.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
            return this;
        }

        /**
         * @param eventsOutOfOrderPolicy Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderPolicy(String eventsOutOfOrderPolicy) {
            return eventsOutOfOrderPolicy(Output.of(eventsOutOfOrderPolicy));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<JobIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(JobIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param jobId The Job ID assigned by the Stream Analytics Job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The Job ID assigned by the Stream Analytics Job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param location The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputErrorPolicy Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
         * 
         * @return builder
         * 
         */
        public Builder outputErrorPolicy(@Nullable Output<String> outputErrorPolicy) {
            $.outputErrorPolicy = outputErrorPolicy;
            return this;
        }

        /**
         * @param outputErrorPolicy Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
         * 
         * @return builder
         * 
         */
        public Builder outputErrorPolicy(String outputErrorPolicy) {
            return outputErrorPolicy(Output.of(outputErrorPolicy));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param streamAnalyticsClusterId The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsClusterId(@Nullable Output<String> streamAnalyticsClusterId) {
            $.streamAnalyticsClusterId = streamAnalyticsClusterId;
            return this;
        }

        /**
         * @param streamAnalyticsClusterId The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsClusterId(String streamAnalyticsClusterId) {
            return streamAnalyticsClusterId(Output.of(streamAnalyticsClusterId));
        }

        /**
         * @param streamingUnits Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
         * 
         * @return builder
         * 
         */
        public Builder streamingUnits(@Nullable Output<Integer> streamingUnits) {
            $.streamingUnits = streamingUnits;
            return this;
        }

        /**
         * @param streamingUnits Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
         * 
         * @return builder
         * 
         */
        public Builder streamingUnits(Integer streamingUnits) {
            return streamingUnits(Output.of(streamingUnits));
        }

        /**
         * @param tags A mapping of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transformationQuery Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
         * 
         * @return builder
         * 
         */
        public Builder transformationQuery(@Nullable Output<String> transformationQuery) {
            $.transformationQuery = transformationQuery;
            return this;
        }

        /**
         * @param transformationQuery Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
         * 
         * @return builder
         * 
         */
        public Builder transformationQuery(String transformationQuery) {
            return transformationQuery(Output.of(transformationQuery));
        }

        /**
         * @param type The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JobState build() {
            return $;
        }
    }

}
