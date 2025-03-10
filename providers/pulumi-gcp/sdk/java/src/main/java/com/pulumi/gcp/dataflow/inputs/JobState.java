// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends com.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
     * 
     */
    @Import(name="additionalExperiments")
    private @Nullable Output<List<String>> additionalExperiments;

    /**
     * @return List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
     * 
     */
    public Optional<Output<List<String>>> additionalExperiments() {
        return Optional.ofNullable(this.additionalExperiments);
    }

    /**
     * Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    @Import(name="enableStreamingEngine")
    private @Nullable Output<Boolean> enableStreamingEngine;

    /**
     * @return Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
     * 
     */
    public Optional<Output<Boolean>> enableStreamingEngine() {
        return Optional.ofNullable(this.enableStreamingEngine);
    }

    /**
     * The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<String> ipConfiguration;

    /**
     * @return The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
     * 
     */
    public Optional<Output<String>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * The unique ID of this job.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The unique ID of this job.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User labels to be specified for the job. Keys and values should follow the restrictions
     * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
     * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
     * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The machine type to use for the job.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return The machine type to use for the job.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    @Import(name="maxWorkers")
    private @Nullable Output<Integer> maxWorkers;

    /**
     * @return The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
     * 
     */
    public Optional<Output<Integer>> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by Dataflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Import(name="onDelete")
    private @Nullable Output<String> onDelete;

    /**
     * @return One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
     * 
     */
    public Optional<Output<String>> onDelete() {
        return Optional.ofNullable(this.onDelete);
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Key/Value pairs to be passed to the Dataflow job (as used in the template).
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the created job should run.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The Service Account email used to create the job.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return The Service Account email used to create the job.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
     * 
     */
    @Import(name="skipWaitOnJobTermination")
    private @Nullable Output<Boolean> skipWaitOnJobTermination;

    /**
     * @return If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
     * 
     */
    public Optional<Output<Boolean>> skipWaitOnJobTermination() {
        return Optional.ofNullable(this.skipWaitOnJobTermination);
    }

    /**
     * The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    @Import(name="tempGcsLocation")
    private @Nullable Output<String> tempGcsLocation;

    /**
     * @return A writeable location on GCS for the Dataflow job to dump its temporary data.
     * 
     */
    public Optional<Output<String>> tempGcsLocation() {
        return Optional.ofNullable(this.tempGcsLocation);
    }

    /**
     * The GCS path to the Dataflow job template.
     * 
     */
    @Import(name="templateGcsPath")
    private @Nullable Output<String> templateGcsPath;

    /**
     * @return The GCS path to the Dataflow job template.
     * 
     */
    public Optional<Output<String>> templateGcsPath() {
        return Optional.ofNullable(this.templateGcsPath);
    }

    /**
     * Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * 
     */
    @Import(name="transformNameMapping")
    private @Nullable Output<Map<String,Object>> transformNameMapping;

    /**
     * @return Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
     * 
     */
    public Optional<Output<Map<String,Object>>> transformNameMapping() {
        return Optional.ofNullable(this.transformNameMapping);
    }

    /**
     * The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone in which the created job should run. If it is not provided, the provider zone is used.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.additionalExperiments = $.additionalExperiments;
        this.enableStreamingEngine = $.enableStreamingEngine;
        this.ipConfiguration = $.ipConfiguration;
        this.jobId = $.jobId;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.maxWorkers = $.maxWorkers;
        this.name = $.name;
        this.network = $.network;
        this.onDelete = $.onDelete;
        this.parameters = $.parameters;
        this.project = $.project;
        this.region = $.region;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.skipWaitOnJobTermination = $.skipWaitOnJobTermination;
        this.state = $.state;
        this.subnetwork = $.subnetwork;
        this.tempGcsLocation = $.tempGcsLocation;
        this.templateGcsPath = $.templateGcsPath;
        this.transformNameMapping = $.transformNameMapping;
        this.type = $.type;
        this.zone = $.zone;
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
         * @param additionalExperiments List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(@Nullable Output<List<String>> additionalExperiments) {
            $.additionalExperiments = additionalExperiments;
            return this;
        }

        /**
         * @param additionalExperiments List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(List<String> additionalExperiments) {
            return additionalExperiments(Output.of(additionalExperiments));
        }

        /**
         * @param additionalExperiments List of experiments that should be used by the job. An example value is `[&#34;enable_stackdriver_agent_metrics&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }

        /**
         * @param enableStreamingEngine Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
         * 
         * @return builder
         * 
         */
        public Builder enableStreamingEngine(@Nullable Output<Boolean> enableStreamingEngine) {
            $.enableStreamingEngine = enableStreamingEngine;
            return this;
        }

        /**
         * @param enableStreamingEngine Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
         * 
         * @return builder
         * 
         */
        public Builder enableStreamingEngine(Boolean enableStreamingEngine) {
            return enableStreamingEngine(Output.of(enableStreamingEngine));
        }

        /**
         * @param ipConfiguration The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(@Nullable Output<String> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param ipConfiguration The configuration for VM IPs.  Options are `&#34;WORKER_IP_PUBLIC&#34;` or `&#34;WORKER_IP_PRIVATE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(String ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        /**
         * @param jobId The unique ID of this job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The unique ID of this job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param kmsKeyName The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values should follow the restrictions
         * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
         * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
         * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values should follow the restrictions
         * specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
         * **NOTE**: Google-provided Dataflow templates often provide default labels that begin with `goog-dataflow-provided`.
         * Unless explicitly set in config, these labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param machineType The machine type to use for the job.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The machine type to use for the job.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param maxWorkers The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        /**
         * @param maxWorkers The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network to which VMs will be assigned. If it is not provided, &#34;default&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(@Nullable Output<String> onDelete) {
            $.onDelete = onDelete;
            return this;
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;.  Specifies behavior of deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(String onDelete) {
            return onDelete(Output.of(onDelete));
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as used in the template).
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as used in the template).
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param project The project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param serviceAccountEmail The Service Account email used to create the job.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail The Service Account email used to create the job.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param skipWaitOnJobTermination If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(@Nullable Output<Boolean> skipWaitOnJobTermination) {
            $.skipWaitOnJobTermination = skipWaitOnJobTermination;
            return this;
        }

        /**
         * @param skipWaitOnJobTermination If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(Boolean skipWaitOnJobTermination) {
            return skipWaitOnJobTermination(Output.of(skipWaitOnJobTermination));
        }

        /**
         * @param state The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetwork The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The subnetwork to which VMs will be assigned. Should be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `&#34;googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME&#34;`
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param tempGcsLocation A writeable location on GCS for the Dataflow job to dump its temporary data.
         * 
         * @return builder
         * 
         */
        public Builder tempGcsLocation(@Nullable Output<String> tempGcsLocation) {
            $.tempGcsLocation = tempGcsLocation;
            return this;
        }

        /**
         * @param tempGcsLocation A writeable location on GCS for the Dataflow job to dump its temporary data.
         * 
         * @return builder
         * 
         */
        public Builder tempGcsLocation(String tempGcsLocation) {
            return tempGcsLocation(Output.of(tempGcsLocation));
        }

        /**
         * @param templateGcsPath The GCS path to the Dataflow job template.
         * 
         * @return builder
         * 
         */
        public Builder templateGcsPath(@Nullable Output<String> templateGcsPath) {
            $.templateGcsPath = templateGcsPath;
            return this;
        }

        /**
         * @param templateGcsPath The GCS path to the Dataflow job template.
         * 
         * @return builder
         * 
         */
        public Builder templateGcsPath(String templateGcsPath) {
            return templateGcsPath(Output.of(templateGcsPath));
        }

        /**
         * @param transformNameMapping Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
         * 
         * @return builder
         * 
         */
        public Builder transformNameMapping(@Nullable Output<Map<String,Object>> transformNameMapping) {
            $.transformNameMapping = transformNameMapping;
            return this;
        }

        /**
         * @param transformNameMapping Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
         * 
         * @return builder
         * 
         */
        public Builder transformNameMapping(Map<String,Object> transformNameMapping) {
            return transformNameMapping(Output.of(transformNameMapping));
        }

        /**
         * @param type The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone The zone in which the created job should run. If it is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone in which the created job should run. If it is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public JobState build() {
            return $;
        }
    }

}
