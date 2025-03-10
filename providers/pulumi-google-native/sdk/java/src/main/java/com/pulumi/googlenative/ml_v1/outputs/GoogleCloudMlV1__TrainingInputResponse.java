// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__EncryptionConfigResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__HyperparameterSpecResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ReplicaConfigResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__SchedulingResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__TrainingInputResponse {
    /**
     * @return Optional. Command-line arguments passed to the training application when it starts. If your job uses a custom container, then the arguments are passed to the container&#39;s `ENTRYPOINT` command.
     * 
     */
    private final List<String> args;
    /**
     * @return Optional. Whether you want AI Platform Training to enable [interactive shell access](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) to training containers. If set to `true`, you can access interactive shells at the URIs given by TrainingOutput.web_access_uris or HyperparameterOutput.web_access_uris (within TrainingOutput.trials).
     * 
     */
    private final Boolean enableWebAccess;
    /**
     * @return Optional. Options for using customer-managed encryption keys (CMEK) to protect resources created by a training job, instead of using Google&#39;s default encryption. If this is set, then all resources created by the training job will be encrypted with the customer-managed encryption key that you specify. [Learn how and when to use CMEK with AI Platform Training](/ai-platform/training/docs/cmek).
     * 
     */
    private final GoogleCloudMlV1__EncryptionConfigResponse encryptionConfig;
    /**
     * @return Optional. The configuration for evaluators. You should only set `evaluatorConfig.acceleratorConfig` if `evaluatorType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `evaluatorConfig.imageUri` only if you build a custom image for your evaluator. If `evaluatorConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    private final GoogleCloudMlV1__ReplicaConfigResponse evaluatorConfig;
    /**
     * @return Optional. The number of evaluator replicas to use for the training job. Each replica in the cluster will be of the type specified in `evaluator_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `evaluator_type`. The default value is zero.
     * 
     */
    private final String evaluatorCount;
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s evaluator nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `evaluatorCount` is greater than zero.
     * 
     */
    private final String evaluatorType;
    /**
     * @return Optional. The set of Hyperparameters to tune.
     * 
     */
    private final GoogleCloudMlV1__HyperparameterSpecResponse hyperparameters;
    /**
     * @return Optional. A Google Cloud Storage path in which to store training outputs and other data needed for training. This path is passed to your TensorFlow program as the &#39;--job-dir&#39; command-line argument. The benefit of specifying this field is that Cloud ML validates the path for use in training.
     * 
     */
    private final String jobDir;
    /**
     * @return Optional. The configuration for your master worker. You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine machine type. Learn about [restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `masterConfig.imageUri` only if you build a custom image. Only one of `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    private final GoogleCloudMlV1__ReplicaConfigResponse masterConfig;
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. See the [list of compatible Compute Engine machine types](/ai-platform/training/docs/machine-types#compute-engine-machine-types). Alternatively, you can use the certain legacy machine types in this field. See the [list of legacy machine types](/ai-platform/training/docs/machine-types#legacy-machine-types). Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPUs](/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    private final String masterType;
    /**
     * @return Optional. The full name of the [Compute Engine network](/vpc/docs/vpc) to which the Job is peered. For example, `projects/12345/global/networks/myVPC`. The format of this field is `projects/{project}/global/networks/{network}`, where {project} is a project number (like `12345`) and {network} is network name. Private services access must already be configured for the network. If left unspecified, the Job is not peered with any network. [Learn about using VPC Network Peering.](/ai-platform/training/docs/vpc-peering).
     * 
     */
    private final String network;
    /**
     * @return The Google Cloud Storage location of the packages with the training program and any additional dependencies. The maximum number of package URIs is 100.
     * 
     */
    private final List<String> packageUris;
    /**
     * @return Optional. The configuration for parameter servers. You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    private final GoogleCloudMlV1__ReplicaConfigResponse parameterServerConfig;
    /**
     * @return Optional. The number of parameter server replicas to use for the training job. Each replica in the cluster will be of the type specified in `parameter_server_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `parameter_server_type`. The default value is zero.
     * 
     */
    private final String parameterServerCount;
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s parameter server. The supported values are the same as those described in the entry for `master_type`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is greater than zero.
     * 
     */
    private final String parameterServerType;
    /**
     * @return The Python module name to run after installing the packages.
     * 
     */
    private final String pythonModule;
    /**
     * @return Optional. The version of Python used in training. You must either specify this field or specify `masterConfig.imageUri`. The following Python versions are available: * Python &#39;3.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or later. * Python &#39;3.5&#39; is available when `runtime_version` is set to a version from &#39;1.4&#39; to &#39;1.14&#39;. * Python &#39;2.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    private final String pythonVersion;
    /**
     * @return The region to run the training job in. See the [available regions](/ai-platform/training/docs/regions) for AI Platform Training.
     * 
     */
    private final String region;
    /**
     * @return Optional. The AI Platform runtime version to use for training. You must either specify this field or specify `masterConfig.imageUri`. For more information, see the [runtime version list](/ai-platform/training/docs/runtime-version-list) and learn [how to manage runtime versions](/ai-platform/training/docs/versioning).
     * 
     */
    private final String runtimeVersion;
    /**
     * @return Specifies the machine types, the number of replicas for workers and parameter servers.
     * 
     */
    private final String scaleTier;
    /**
     * @return Optional. Scheduling options for a training job.
     * 
     */
    private final GoogleCloudMlV1__SchedulingResponse scheduling;
    /**
     * @return Optional. The email address of a service account to use when running the training appplication. You must have the `iam.serviceAccounts.actAs` permission for the specified service account. In addition, the AI Platform Training Google-managed service account must have the `roles/iam.serviceAccountAdmin` role for the specified service account. [Learn more about configuring a service account.](/ai-platform/training/docs/custom-service-account) If not specified, the AI Platform Training Google-managed service account is used by default.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Optional. Use `chief` instead of `master` in the `TF_CONFIG` environment variable when training with a custom container. Defaults to `false`. [Learn more about this field.](/ai-platform/training/docs/distributed-training-details#chief-versus-master) This field has no effect for training jobs that don&#39;t use a custom container.
     * 
     */
    private final Boolean useChiefInTfConfig;
    /**
     * @return Optional. The configuration for workers. You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `workerConfig.imageUri` only if you build a custom image for your worker. If `workerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    private final GoogleCloudMlV1__ReplicaConfigResponse workerConfig;
    /**
     * @return Optional. The number of worker replicas to use for the training job. Each replica in the cluster will be of the type specified in `worker_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `worker_type`. The default value is zero.
     * 
     */
    private final String workerCount;
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s worker nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine). This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater than zero.
     * 
     */
    private final String workerType;

    @CustomType.Constructor
    private GoogleCloudMlV1__TrainingInputResponse(
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("enableWebAccess") Boolean enableWebAccess,
        @CustomType.Parameter("encryptionConfig") GoogleCloudMlV1__EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("evaluatorConfig") GoogleCloudMlV1__ReplicaConfigResponse evaluatorConfig,
        @CustomType.Parameter("evaluatorCount") String evaluatorCount,
        @CustomType.Parameter("evaluatorType") String evaluatorType,
        @CustomType.Parameter("hyperparameters") GoogleCloudMlV1__HyperparameterSpecResponse hyperparameters,
        @CustomType.Parameter("jobDir") String jobDir,
        @CustomType.Parameter("masterConfig") GoogleCloudMlV1__ReplicaConfigResponse masterConfig,
        @CustomType.Parameter("masterType") String masterType,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("packageUris") List<String> packageUris,
        @CustomType.Parameter("parameterServerConfig") GoogleCloudMlV1__ReplicaConfigResponse parameterServerConfig,
        @CustomType.Parameter("parameterServerCount") String parameterServerCount,
        @CustomType.Parameter("parameterServerType") String parameterServerType,
        @CustomType.Parameter("pythonModule") String pythonModule,
        @CustomType.Parameter("pythonVersion") String pythonVersion,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion,
        @CustomType.Parameter("scaleTier") String scaleTier,
        @CustomType.Parameter("scheduling") GoogleCloudMlV1__SchedulingResponse scheduling,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("useChiefInTfConfig") Boolean useChiefInTfConfig,
        @CustomType.Parameter("workerConfig") GoogleCloudMlV1__ReplicaConfigResponse workerConfig,
        @CustomType.Parameter("workerCount") String workerCount,
        @CustomType.Parameter("workerType") String workerType) {
        this.args = args;
        this.enableWebAccess = enableWebAccess;
        this.encryptionConfig = encryptionConfig;
        this.evaluatorConfig = evaluatorConfig;
        this.evaluatorCount = evaluatorCount;
        this.evaluatorType = evaluatorType;
        this.hyperparameters = hyperparameters;
        this.jobDir = jobDir;
        this.masterConfig = masterConfig;
        this.masterType = masterType;
        this.network = network;
        this.packageUris = packageUris;
        this.parameterServerConfig = parameterServerConfig;
        this.parameterServerCount = parameterServerCount;
        this.parameterServerType = parameterServerType;
        this.pythonModule = pythonModule;
        this.pythonVersion = pythonVersion;
        this.region = region;
        this.runtimeVersion = runtimeVersion;
        this.scaleTier = scaleTier;
        this.scheduling = scheduling;
        this.serviceAccount = serviceAccount;
        this.useChiefInTfConfig = useChiefInTfConfig;
        this.workerConfig = workerConfig;
        this.workerCount = workerCount;
        this.workerType = workerType;
    }

    /**
     * @return Optional. Command-line arguments passed to the training application when it starts. If your job uses a custom container, then the arguments are passed to the container&#39;s `ENTRYPOINT` command.
     * 
     */
    public List<String> args() {
        return this.args;
    }
    /**
     * @return Optional. Whether you want AI Platform Training to enable [interactive shell access](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) to training containers. If set to `true`, you can access interactive shells at the URIs given by TrainingOutput.web_access_uris or HyperparameterOutput.web_access_uris (within TrainingOutput.trials).
     * 
     */
    public Boolean enableWebAccess() {
        return this.enableWebAccess;
    }
    /**
     * @return Optional. Options for using customer-managed encryption keys (CMEK) to protect resources created by a training job, instead of using Google&#39;s default encryption. If this is set, then all resources created by the training job will be encrypted with the customer-managed encryption key that you specify. [Learn how and when to use CMEK with AI Platform Training](/ai-platform/training/docs/cmek).
     * 
     */
    public GoogleCloudMlV1__EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * @return Optional. The configuration for evaluators. You should only set `evaluatorConfig.acceleratorConfig` if `evaluatorType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `evaluatorConfig.imageUri` only if you build a custom image for your evaluator. If `evaluatorConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    public GoogleCloudMlV1__ReplicaConfigResponse evaluatorConfig() {
        return this.evaluatorConfig;
    }
    /**
     * @return Optional. The number of evaluator replicas to use for the training job. Each replica in the cluster will be of the type specified in `evaluator_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `evaluator_type`. The default value is zero.
     * 
     */
    public String evaluatorCount() {
        return this.evaluatorCount;
    }
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s evaluator nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `evaluatorCount` is greater than zero.
     * 
     */
    public String evaluatorType() {
        return this.evaluatorType;
    }
    /**
     * @return Optional. The set of Hyperparameters to tune.
     * 
     */
    public GoogleCloudMlV1__HyperparameterSpecResponse hyperparameters() {
        return this.hyperparameters;
    }
    /**
     * @return Optional. A Google Cloud Storage path in which to store training outputs and other data needed for training. This path is passed to your TensorFlow program as the &#39;--job-dir&#39; command-line argument. The benefit of specifying this field is that Cloud ML validates the path for use in training.
     * 
     */
    public String jobDir() {
        return this.jobDir;
    }
    /**
     * @return Optional. The configuration for your master worker. You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine machine type. Learn about [restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `masterConfig.imageUri` only if you build a custom image. Only one of `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    public GoogleCloudMlV1__ReplicaConfigResponse masterConfig() {
        return this.masterConfig;
    }
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. See the [list of compatible Compute Engine machine types](/ai-platform/training/docs/machine-types#compute-engine-machine-types). Alternatively, you can use the certain legacy machine types in this field. See the [list of legacy machine types](/ai-platform/training/docs/machine-types#legacy-machine-types). Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPUs](/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    public String masterType() {
        return this.masterType;
    }
    /**
     * @return Optional. The full name of the [Compute Engine network](/vpc/docs/vpc) to which the Job is peered. For example, `projects/12345/global/networks/myVPC`. The format of this field is `projects/{project}/global/networks/{network}`, where {project} is a project number (like `12345`) and {network} is network name. Private services access must already be configured for the network. If left unspecified, the Job is not peered with any network. [Learn about using VPC Network Peering.](/ai-platform/training/docs/vpc-peering).
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The Google Cloud Storage location of the packages with the training program and any additional dependencies. The maximum number of package URIs is 100.
     * 
     */
    public List<String> packageUris() {
        return this.packageUris;
    }
    /**
     * @return Optional. The configuration for parameter servers. You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    public GoogleCloudMlV1__ReplicaConfigResponse parameterServerConfig() {
        return this.parameterServerConfig;
    }
    /**
     * @return Optional. The number of parameter server replicas to use for the training job. Each replica in the cluster will be of the type specified in `parameter_server_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `parameter_server_type`. The default value is zero.
     * 
     */
    public String parameterServerCount() {
        return this.parameterServerCount;
    }
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s parameter server. The supported values are the same as those described in the entry for `master_type`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is greater than zero.
     * 
     */
    public String parameterServerType() {
        return this.parameterServerType;
    }
    /**
     * @return The Python module name to run after installing the packages.
     * 
     */
    public String pythonModule() {
        return this.pythonModule;
    }
    /**
     * @return Optional. The version of Python used in training. You must either specify this field or specify `masterConfig.imageUri`. The following Python versions are available: * Python &#39;3.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or later. * Python &#39;3.5&#39; is available when `runtime_version` is set to a version from &#39;1.4&#39; to &#39;1.14&#39;. * Python &#39;2.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return The region to run the training job in. See the [available regions](/ai-platform/training/docs/regions) for AI Platform Training.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Optional. The AI Platform runtime version to use for training. You must either specify this field or specify `masterConfig.imageUri`. For more information, see the [runtime version list](/ai-platform/training/docs/runtime-version-list) and learn [how to manage runtime versions](/ai-platform/training/docs/versioning).
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * @return Specifies the machine types, the number of replicas for workers and parameter servers.
     * 
     */
    public String scaleTier() {
        return this.scaleTier;
    }
    /**
     * @return Optional. Scheduling options for a training job.
     * 
     */
    public GoogleCloudMlV1__SchedulingResponse scheduling() {
        return this.scheduling;
    }
    /**
     * @return Optional. The email address of a service account to use when running the training appplication. You must have the `iam.serviceAccounts.actAs` permission for the specified service account. In addition, the AI Platform Training Google-managed service account must have the `roles/iam.serviceAccountAdmin` role for the specified service account. [Learn more about configuring a service account.](/ai-platform/training/docs/custom-service-account) If not specified, the AI Platform Training Google-managed service account is used by default.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. Use `chief` instead of `master` in the `TF_CONFIG` environment variable when training with a custom container. Defaults to `false`. [Learn more about this field.](/ai-platform/training/docs/distributed-training-details#chief-versus-master) This field has no effect for training jobs that don&#39;t use a custom container.
     * 
     */
    public Boolean useChiefInTfConfig() {
        return this.useChiefInTfConfig;
    }
    /**
     * @return Optional. The configuration for workers. You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `workerConfig.imageUri` only if you build a custom image for your worker. If `workerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    public GoogleCloudMlV1__ReplicaConfigResponse workerConfig() {
        return this.workerConfig;
    }
    /**
     * @return Optional. The number of worker replicas to use for the training job. Each replica in the cluster will be of the type specified in `worker_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `worker_type`. The default value is zero.
     * 
     */
    public String workerCount() {
        return this.workerCount;
    }
    /**
     * @return Optional. Specifies the type of virtual machine to use for your training job&#39;s worker nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine). This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater than zero.
     * 
     */
    public String workerType() {
        return this.workerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__TrainingInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private Boolean enableWebAccess;
        private GoogleCloudMlV1__EncryptionConfigResponse encryptionConfig;
        private GoogleCloudMlV1__ReplicaConfigResponse evaluatorConfig;
        private String evaluatorCount;
        private String evaluatorType;
        private GoogleCloudMlV1__HyperparameterSpecResponse hyperparameters;
        private String jobDir;
        private GoogleCloudMlV1__ReplicaConfigResponse masterConfig;
        private String masterType;
        private String network;
        private List<String> packageUris;
        private GoogleCloudMlV1__ReplicaConfigResponse parameterServerConfig;
        private String parameterServerCount;
        private String parameterServerType;
        private String pythonModule;
        private String pythonVersion;
        private String region;
        private String runtimeVersion;
        private String scaleTier;
        private GoogleCloudMlV1__SchedulingResponse scheduling;
        private String serviceAccount;
        private Boolean useChiefInTfConfig;
        private GoogleCloudMlV1__ReplicaConfigResponse workerConfig;
        private String workerCount;
        private String workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__TrainingInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.enableWebAccess = defaults.enableWebAccess;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.evaluatorConfig = defaults.evaluatorConfig;
    	      this.evaluatorCount = defaults.evaluatorCount;
    	      this.evaluatorType = defaults.evaluatorType;
    	      this.hyperparameters = defaults.hyperparameters;
    	      this.jobDir = defaults.jobDir;
    	      this.masterConfig = defaults.masterConfig;
    	      this.masterType = defaults.masterType;
    	      this.network = defaults.network;
    	      this.packageUris = defaults.packageUris;
    	      this.parameterServerConfig = defaults.parameterServerConfig;
    	      this.parameterServerCount = defaults.parameterServerCount;
    	      this.parameterServerType = defaults.parameterServerType;
    	      this.pythonModule = defaults.pythonModule;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.region = defaults.region;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.scaleTier = defaults.scaleTier;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.useChiefInTfConfig = defaults.useChiefInTfConfig;
    	      this.workerConfig = defaults.workerConfig;
    	      this.workerCount = defaults.workerCount;
    	      this.workerType = defaults.workerType;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder enableWebAccess(Boolean enableWebAccess) {
            this.enableWebAccess = Objects.requireNonNull(enableWebAccess);
            return this;
        }
        public Builder encryptionConfig(GoogleCloudMlV1__EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder evaluatorConfig(GoogleCloudMlV1__ReplicaConfigResponse evaluatorConfig) {
            this.evaluatorConfig = Objects.requireNonNull(evaluatorConfig);
            return this;
        }
        public Builder evaluatorCount(String evaluatorCount) {
            this.evaluatorCount = Objects.requireNonNull(evaluatorCount);
            return this;
        }
        public Builder evaluatorType(String evaluatorType) {
            this.evaluatorType = Objects.requireNonNull(evaluatorType);
            return this;
        }
        public Builder hyperparameters(GoogleCloudMlV1__HyperparameterSpecResponse hyperparameters) {
            this.hyperparameters = Objects.requireNonNull(hyperparameters);
            return this;
        }
        public Builder jobDir(String jobDir) {
            this.jobDir = Objects.requireNonNull(jobDir);
            return this;
        }
        public Builder masterConfig(GoogleCloudMlV1__ReplicaConfigResponse masterConfig) {
            this.masterConfig = Objects.requireNonNull(masterConfig);
            return this;
        }
        public Builder masterType(String masterType) {
            this.masterType = Objects.requireNonNull(masterType);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder packageUris(List<String> packageUris) {
            this.packageUris = Objects.requireNonNull(packageUris);
            return this;
        }
        public Builder packageUris(String... packageUris) {
            return packageUris(List.of(packageUris));
        }
        public Builder parameterServerConfig(GoogleCloudMlV1__ReplicaConfigResponse parameterServerConfig) {
            this.parameterServerConfig = Objects.requireNonNull(parameterServerConfig);
            return this;
        }
        public Builder parameterServerCount(String parameterServerCount) {
            this.parameterServerCount = Objects.requireNonNull(parameterServerCount);
            return this;
        }
        public Builder parameterServerType(String parameterServerType) {
            this.parameterServerType = Objects.requireNonNull(parameterServerType);
            return this;
        }
        public Builder pythonModule(String pythonModule) {
            this.pythonModule = Objects.requireNonNull(pythonModule);
            return this;
        }
        public Builder pythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        public Builder scaleTier(String scaleTier) {
            this.scaleTier = Objects.requireNonNull(scaleTier);
            return this;
        }
        public Builder scheduling(GoogleCloudMlV1__SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder useChiefInTfConfig(Boolean useChiefInTfConfig) {
            this.useChiefInTfConfig = Objects.requireNonNull(useChiefInTfConfig);
            return this;
        }
        public Builder workerConfig(GoogleCloudMlV1__ReplicaConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }
        public Builder workerCount(String workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }
        public Builder workerType(String workerType) {
            this.workerType = Objects.requireNonNull(workerType);
            return this;
        }        public GoogleCloudMlV1__TrainingInputResponse build() {
            return new GoogleCloudMlV1__TrainingInputResponse(args, enableWebAccess, encryptionConfig, evaluatorConfig, evaluatorCount, evaluatorType, hyperparameters, jobDir, masterConfig, masterType, network, packageUris, parameterServerConfig, parameterServerCount, parameterServerType, pythonModule, pythonVersion, region, runtimeVersion, scaleTier, scheduling, serviceAccount, useChiefInTfConfig, workerConfig, workerCount, workerType);
        }
    }
}
