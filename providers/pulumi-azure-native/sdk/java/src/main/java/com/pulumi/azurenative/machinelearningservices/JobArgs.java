// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.inputs.CommandJobArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.SweepJobArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The name and identifier for the Job.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The name and identifier for the Job.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * [Required] Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
    private Output<Either<CommandJobArgs,SweepJobArgs>> properties;

    /**
     * @return [Required] Additional attributes of the entity.
     * 
     */
    public Output<Either<CommandJobArgs,SweepJobArgs>> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.id = $.id;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The name and identifier for the Job.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The name and identifier for the Job.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param properties [Required] Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<Either<CommandJobArgs,SweepJobArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties [Required] Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(Either<CommandJobArgs,SweepJobArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties [Required] Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(CommandJobArgs properties) {
            return properties(Either.ofLeft(properties));
        }

        /**
         * @param properties [Required] Additional attributes of the entity.
         * 
         * @return builder
         * 
         */
        public Builder properties(SweepJobArgs properties) {
            return properties(Either.ofRight(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public JobArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
