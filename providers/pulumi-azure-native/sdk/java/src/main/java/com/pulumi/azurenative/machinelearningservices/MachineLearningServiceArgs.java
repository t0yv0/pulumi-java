// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.enums.ComputeEnvironmentType;
import com.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestEnvironmentImageRequestArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestKeysArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineLearningServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineLearningServiceArgs Empty = new MachineLearningServiceArgs();

    /**
     * The compute environment type for the service.
     * 
     */
    @Import(name="computeType", required=true)
    private Output<Either<String,ComputeEnvironmentType>> computeType;

    /**
     * @return The compute environment type for the service.
     * 
     */
    public Output<Either<String,ComputeEnvironmentType>> computeType() {
        return this.computeType;
    }

    /**
     * The description of the service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Environment, models and assets needed for inferencing.
     * 
     */
    @Import(name="environmentImageRequest")
    private @Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;

    /**
     * @return The Environment, models and assets needed for inferencing.
     * 
     */
    public Optional<Output<CreateServiceRequestEnvironmentImageRequestArgs>> environmentImageRequest() {
        return Optional.ofNullable(this.environmentImageRequest);
    }

    /**
     * The authentication keys.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<CreateServiceRequestKeysArgs> keys;

    /**
     * @return The authentication keys.
     * 
     */
    public Optional<Output<CreateServiceRequestKeysArgs>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @Import(name="kvTags")
    private @Nullable Output<Map<String,String>> kvTags;

    /**
     * @return The service tag dictionary. Tags are mutable.
     * 
     */
    public Optional<Output<Map<String,String>>> kvTags() {
        return Optional.ofNullable(this.kvTags);
    }

    /**
     * The name of the Azure location/region.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the Azure location/region.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The service properties dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The service properties dictionary. Properties are immutable.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Name of the Azure Machine Learning service.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
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

    private MachineLearningServiceArgs() {}

    private MachineLearningServiceArgs(MachineLearningServiceArgs $) {
        this.computeType = $.computeType;
        this.description = $.description;
        this.environmentImageRequest = $.environmentImageRequest;
        this.keys = $.keys;
        this.kvTags = $.kvTags;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineLearningServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineLearningServiceArgs $;

        public Builder() {
            $ = new MachineLearningServiceArgs();
        }

        public Builder(MachineLearningServiceArgs defaults) {
            $ = new MachineLearningServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeType The compute environment type for the service.
         * 
         * @return builder
         * 
         */
        public Builder computeType(Output<Either<String,ComputeEnvironmentType>> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType The compute environment type for the service.
         * 
         * @return builder
         * 
         */
        public Builder computeType(Either<String,ComputeEnvironmentType> computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param computeType The compute environment type for the service.
         * 
         * @return builder
         * 
         */
        public Builder computeType(String computeType) {
            return computeType(Either.ofLeft(computeType));
        }

        /**
         * @param computeType The compute environment type for the service.
         * 
         * @return builder
         * 
         */
        public Builder computeType(ComputeEnvironmentType computeType) {
            return computeType(Either.ofRight(computeType));
        }

        /**
         * @param description The description of the service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environmentImageRequest The Environment, models and assets needed for inferencing.
         * 
         * @return builder
         * 
         */
        public Builder environmentImageRequest(@Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest) {
            $.environmentImageRequest = environmentImageRequest;
            return this;
        }

        /**
         * @param environmentImageRequest The Environment, models and assets needed for inferencing.
         * 
         * @return builder
         * 
         */
        public Builder environmentImageRequest(CreateServiceRequestEnvironmentImageRequestArgs environmentImageRequest) {
            return environmentImageRequest(Output.of(environmentImageRequest));
        }

        /**
         * @param keys The authentication keys.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<CreateServiceRequestKeysArgs> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys The authentication keys.
         * 
         * @return builder
         * 
         */
        public Builder keys(CreateServiceRequestKeysArgs keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param kvTags The service tag dictionary. Tags are mutable.
         * 
         * @return builder
         * 
         */
        public Builder kvTags(@Nullable Output<Map<String,String>> kvTags) {
            $.kvTags = kvTags;
            return this;
        }

        /**
         * @param kvTags The service tag dictionary. Tags are mutable.
         * 
         * @return builder
         * 
         */
        public Builder kvTags(Map<String,String> kvTags) {
            return kvTags(Output.of(kvTags));
        }

        /**
         * @param location The name of the Azure location/region.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the Azure location/region.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The service properties dictionary. Properties are immutable.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The service properties dictionary. Properties are immutable.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName Name of the Azure Machine Learning service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Name of the Azure Machine Learning service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
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

        public MachineLearningServiceArgs build() {
            $.computeType = Objects.requireNonNull($.computeType, "expected parameter 'computeType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
