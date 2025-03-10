// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.PipelineReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execute pipeline activity.
 * 
 */
public final class ExecutePipelineActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutePipelineActivityArgs Empty = new ExecutePipelineActivityArgs();

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
     * Pipeline parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Pipeline parameters.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Pipeline reference.
     * 
     */
    @Import(name="pipeline", required=true)
    private Output<PipelineReferenceArgs> pipeline;

    /**
     * @return Pipeline reference.
     * 
     */
    public Output<PipelineReferenceArgs> pipeline() {
        return this.pipeline;
    }

    /**
     * Execute pipeline activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ExecutePipelineActivityPolicyArgs> policy;

    /**
     * @return Execute pipeline activity policy.
     * 
     */
    public Optional<Output<ExecutePipelineActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;ExecutePipeline&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;ExecutePipeline&#39;.
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

    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    @Import(name="waitOnCompletion")
    private @Nullable Output<Boolean> waitOnCompletion;

    /**
     * @return Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    public Optional<Output<Boolean>> waitOnCompletion() {
        return Optional.ofNullable(this.waitOnCompletion);
    }

    private ExecutePipelineActivityArgs() {}

    private ExecutePipelineActivityArgs(ExecutePipelineActivityArgs $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.name = $.name;
        this.parameters = $.parameters;
        this.pipeline = $.pipeline;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.waitOnCompletion = $.waitOnCompletion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutePipelineActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutePipelineActivityArgs $;

        public Builder() {
            $ = new ExecutePipelineActivityArgs();
        }

        public Builder(ExecutePipelineActivityArgs defaults) {
            $ = new ExecutePipelineActivityArgs(Objects.requireNonNull(defaults));
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
         * @param parameters Pipeline parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Pipeline parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param pipeline Pipeline reference.
         * 
         * @return builder
         * 
         */
        public Builder pipeline(Output<PipelineReferenceArgs> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        /**
         * @param pipeline Pipeline reference.
         * 
         * @return builder
         * 
         */
        public Builder pipeline(PipelineReferenceArgs pipeline) {
            return pipeline(Output.of(pipeline));
        }

        /**
         * @param policy Execute pipeline activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ExecutePipelineActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Execute pipeline activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ExecutePipelineActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;ExecutePipeline&#39;.
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
         * Expected value is &#39;ExecutePipeline&#39;.
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

        /**
         * @param waitOnCompletion Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder waitOnCompletion(@Nullable Output<Boolean> waitOnCompletion) {
            $.waitOnCompletion = waitOnCompletion;
            return this;
        }

        /**
         * @param waitOnCompletion Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder waitOnCompletion(Boolean waitOnCompletion) {
            return waitOnCompletion(Output.of(waitOnCompletion));
        }

        public ExecutePipelineActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.pipeline = Objects.requireNonNull($.pipeline, "expected parameter 'pipeline' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
