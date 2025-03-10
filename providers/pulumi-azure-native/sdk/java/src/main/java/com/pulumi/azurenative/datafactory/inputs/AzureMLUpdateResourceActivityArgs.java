// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Update Resource management activity.
 * 
 */
public final class AzureMLUpdateResourceActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureMLUpdateResourceActivityArgs Empty = new AzureMLUpdateResourceActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="trainedModelFilePath", required=true)
    private Output<Object> trainedModelFilePath;

    /**
     * @return The relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> trainedModelFilePath() {
        return this.trainedModelFilePath;
    }

    /**
     * Name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
     * 
     */
    @Import(name="trainedModelLinkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> trainedModelLinkedServiceName;

    /**
     * @return Name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
     * 
     */
    public Output<LinkedServiceReferenceArgs> trainedModelLinkedServiceName() {
        return this.trainedModelLinkedServiceName;
    }

    /**
     * Name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="trainedModelName", required=true)
    private Output<Object> trainedModelName;

    /**
     * @return Name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> trainedModelName() {
        return this.trainedModelName;
    }

    /**
     * Type of activity.
     * Expected value is &#39;AzureMLUpdateResource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;AzureMLUpdateResource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private AzureMLUpdateResourceActivityArgs() {}

    private AzureMLUpdateResourceActivityArgs(AzureMLUpdateResourceActivityArgs $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.trainedModelFilePath = $.trainedModelFilePath;
        this.trainedModelLinkedServiceName = $.trainedModelLinkedServiceName;
        this.trainedModelName = $.trainedModelName;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLUpdateResourceActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLUpdateResourceActivityArgs $;

        public Builder() {
            $ = new AzureMLUpdateResourceActivityArgs();
        }

        public Builder(AzureMLUpdateResourceActivityArgs defaults) {
            $ = new AzureMLUpdateResourceActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param trainedModelFilePath The relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder trainedModelFilePath(Output<Object> trainedModelFilePath) {
            $.trainedModelFilePath = trainedModelFilePath;
            return this;
        }

        /**
         * @param trainedModelFilePath The relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder trainedModelFilePath(Object trainedModelFilePath) {
            return trainedModelFilePath(Output.of(trainedModelFilePath));
        }

        /**
         * @param trainedModelLinkedServiceName Name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
         * 
         * @return builder
         * 
         */
        public Builder trainedModelLinkedServiceName(Output<LinkedServiceReferenceArgs> trainedModelLinkedServiceName) {
            $.trainedModelLinkedServiceName = trainedModelLinkedServiceName;
            return this;
        }

        /**
         * @param trainedModelLinkedServiceName Name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
         * 
         * @return builder
         * 
         */
        public Builder trainedModelLinkedServiceName(LinkedServiceReferenceArgs trainedModelLinkedServiceName) {
            return trainedModelLinkedServiceName(Output.of(trainedModelLinkedServiceName));
        }

        /**
         * @param trainedModelName Name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder trainedModelName(Output<Object> trainedModelName) {
            $.trainedModelName = trainedModelName;
            return this;
        }

        /**
         * @param trainedModelName Name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder trainedModelName(Object trainedModelName) {
            return trainedModelName(Output.of(trainedModelName));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLUpdateResource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLUpdateResource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public AzureMLUpdateResourceActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.trainedModelFilePath = Objects.requireNonNull($.trainedModelFilePath, "expected parameter 'trainedModelFilePath' to be non-null");
            $.trainedModelLinkedServiceName = Objects.requireNonNull($.trainedModelLinkedServiceName, "expected parameter 'trainedModelLinkedServiceName' to be non-null");
            $.trainedModelName = Objects.requireNonNull($.trainedModelName, "expected parameter 'trainedModelName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
