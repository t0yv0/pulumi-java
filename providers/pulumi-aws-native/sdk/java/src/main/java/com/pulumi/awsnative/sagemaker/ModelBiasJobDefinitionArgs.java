// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionModelBiasAppSpecificationArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionModelBiasBaselineConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionModelBiasJobInputArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionMonitoringOutputConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionMonitoringResourcesArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionNetworkConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionStoppingConditionArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelBiasJobDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionArgs Empty = new ModelBiasJobDefinitionArgs();

    @Import(name="jobDefinitionName")
    private @Nullable Output<String> jobDefinitionName;

    public Optional<Output<String>> jobDefinitionName() {
        return Optional.ofNullable(this.jobDefinitionName);
    }

    @Import(name="jobResources", required=true)
    private Output<ModelBiasJobDefinitionMonitoringResourcesArgs> jobResources;

    public Output<ModelBiasJobDefinitionMonitoringResourcesArgs> jobResources() {
        return this.jobResources;
    }

    @Import(name="modelBiasAppSpecification", required=true)
    private Output<ModelBiasJobDefinitionModelBiasAppSpecificationArgs> modelBiasAppSpecification;

    public Output<ModelBiasJobDefinitionModelBiasAppSpecificationArgs> modelBiasAppSpecification() {
        return this.modelBiasAppSpecification;
    }

    @Import(name="modelBiasBaselineConfig")
    private @Nullable Output<ModelBiasJobDefinitionModelBiasBaselineConfigArgs> modelBiasBaselineConfig;

    public Optional<Output<ModelBiasJobDefinitionModelBiasBaselineConfigArgs>> modelBiasBaselineConfig() {
        return Optional.ofNullable(this.modelBiasBaselineConfig);
    }

    @Import(name="modelBiasJobInput", required=true)
    private Output<ModelBiasJobDefinitionModelBiasJobInputArgs> modelBiasJobInput;

    public Output<ModelBiasJobDefinitionModelBiasJobInputArgs> modelBiasJobInput() {
        return this.modelBiasJobInput;
    }

    @Import(name="modelBiasJobOutputConfig", required=true)
    private Output<ModelBiasJobDefinitionMonitoringOutputConfigArgs> modelBiasJobOutputConfig;

    public Output<ModelBiasJobDefinitionMonitoringOutputConfigArgs> modelBiasJobOutputConfig() {
        return this.modelBiasJobOutputConfig;
    }

    @Import(name="networkConfig")
    private @Nullable Output<ModelBiasJobDefinitionNetworkConfigArgs> networkConfig;

    public Optional<Output<ModelBiasJobDefinitionNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="stoppingCondition")
    private @Nullable Output<ModelBiasJobDefinitionStoppingConditionArgs> stoppingCondition;

    public Optional<Output<ModelBiasJobDefinitionStoppingConditionArgs>> stoppingCondition() {
        return Optional.ofNullable(this.stoppingCondition);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ModelBiasJobDefinitionTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<ModelBiasJobDefinitionTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelBiasJobDefinitionArgs() {}

    private ModelBiasJobDefinitionArgs(ModelBiasJobDefinitionArgs $) {
        this.jobDefinitionName = $.jobDefinitionName;
        this.jobResources = $.jobResources;
        this.modelBiasAppSpecification = $.modelBiasAppSpecification;
        this.modelBiasBaselineConfig = $.modelBiasBaselineConfig;
        this.modelBiasJobInput = $.modelBiasJobInput;
        this.modelBiasJobOutputConfig = $.modelBiasJobOutputConfig;
        this.networkConfig = $.networkConfig;
        this.roleArn = $.roleArn;
        this.stoppingCondition = $.stoppingCondition;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelBiasJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionArgs $;

        public Builder() {
            $ = new ModelBiasJobDefinitionArgs();
        }

        public Builder(ModelBiasJobDefinitionArgs defaults) {
            $ = new ModelBiasJobDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobDefinitionName(@Nullable Output<String> jobDefinitionName) {
            $.jobDefinitionName = jobDefinitionName;
            return this;
        }

        public Builder jobDefinitionName(String jobDefinitionName) {
            return jobDefinitionName(Output.of(jobDefinitionName));
        }

        public Builder jobResources(Output<ModelBiasJobDefinitionMonitoringResourcesArgs> jobResources) {
            $.jobResources = jobResources;
            return this;
        }

        public Builder jobResources(ModelBiasJobDefinitionMonitoringResourcesArgs jobResources) {
            return jobResources(Output.of(jobResources));
        }

        public Builder modelBiasAppSpecification(Output<ModelBiasJobDefinitionModelBiasAppSpecificationArgs> modelBiasAppSpecification) {
            $.modelBiasAppSpecification = modelBiasAppSpecification;
            return this;
        }

        public Builder modelBiasAppSpecification(ModelBiasJobDefinitionModelBiasAppSpecificationArgs modelBiasAppSpecification) {
            return modelBiasAppSpecification(Output.of(modelBiasAppSpecification));
        }

        public Builder modelBiasBaselineConfig(@Nullable Output<ModelBiasJobDefinitionModelBiasBaselineConfigArgs> modelBiasBaselineConfig) {
            $.modelBiasBaselineConfig = modelBiasBaselineConfig;
            return this;
        }

        public Builder modelBiasBaselineConfig(ModelBiasJobDefinitionModelBiasBaselineConfigArgs modelBiasBaselineConfig) {
            return modelBiasBaselineConfig(Output.of(modelBiasBaselineConfig));
        }

        public Builder modelBiasJobInput(Output<ModelBiasJobDefinitionModelBiasJobInputArgs> modelBiasJobInput) {
            $.modelBiasJobInput = modelBiasJobInput;
            return this;
        }

        public Builder modelBiasJobInput(ModelBiasJobDefinitionModelBiasJobInputArgs modelBiasJobInput) {
            return modelBiasJobInput(Output.of(modelBiasJobInput));
        }

        public Builder modelBiasJobOutputConfig(Output<ModelBiasJobDefinitionMonitoringOutputConfigArgs> modelBiasJobOutputConfig) {
            $.modelBiasJobOutputConfig = modelBiasJobOutputConfig;
            return this;
        }

        public Builder modelBiasJobOutputConfig(ModelBiasJobDefinitionMonitoringOutputConfigArgs modelBiasJobOutputConfig) {
            return modelBiasJobOutputConfig(Output.of(modelBiasJobOutputConfig));
        }

        public Builder networkConfig(@Nullable Output<ModelBiasJobDefinitionNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        public Builder networkConfig(ModelBiasJobDefinitionNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder stoppingCondition(@Nullable Output<ModelBiasJobDefinitionStoppingConditionArgs> stoppingCondition) {
            $.stoppingCondition = stoppingCondition;
            return this;
        }

        public Builder stoppingCondition(ModelBiasJobDefinitionStoppingConditionArgs stoppingCondition) {
            return stoppingCondition(Output.of(stoppingCondition));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ModelBiasJobDefinitionTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ModelBiasJobDefinitionTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(ModelBiasJobDefinitionTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ModelBiasJobDefinitionArgs build() {
            $.jobResources = Objects.requireNonNull($.jobResources, "expected parameter 'jobResources' to be non-null");
            $.modelBiasAppSpecification = Objects.requireNonNull($.modelBiasAppSpecification, "expected parameter 'modelBiasAppSpecification' to be non-null");
            $.modelBiasJobInput = Objects.requireNonNull($.modelBiasJobInput, "expected parameter 'modelBiasJobInput' to be non-null");
            $.modelBiasJobOutputConfig = Objects.requireNonNull($.modelBiasJobOutputConfig, "expected parameter 'modelBiasJobOutputConfig' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
