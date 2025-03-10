// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.FailoverDeploymentModel;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanA2AInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanGroupArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery plan creation properties.
 * 
 */
public final class CreateRecoveryPlanInputPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CreateRecoveryPlanInputPropertiesArgs Empty = new CreateRecoveryPlanInputPropertiesArgs();

    /**
     * The failover deployment model.
     * 
     */
    @Import(name="failoverDeploymentModel")
    private @Nullable Output<Either<String,FailoverDeploymentModel>> failoverDeploymentModel;

    /**
     * @return The failover deployment model.
     * 
     */
    public Optional<Output<Either<String,FailoverDeploymentModel>>> failoverDeploymentModel() {
        return Optional.ofNullable(this.failoverDeploymentModel);
    }

    /**
     * The recovery plan groups.
     * 
     */
    @Import(name="groups", required=true)
    private Output<List<RecoveryPlanGroupArgs>> groups;

    /**
     * @return The recovery plan groups.
     * 
     */
    public Output<List<RecoveryPlanGroupArgs>> groups() {
        return this.groups;
    }

    /**
     * The primary fabric Id.
     * 
     */
    @Import(name="primaryFabricId", required=true)
    private Output<String> primaryFabricId;

    /**
     * @return The primary fabric Id.
     * 
     */
    public Output<String> primaryFabricId() {
        return this.primaryFabricId;
    }

    /**
     * The provider specific input.
     * 
     */
    @Import(name="providerSpecificInput")
    private @Nullable Output<List<RecoveryPlanA2AInputArgs>> providerSpecificInput;

    /**
     * @return The provider specific input.
     * 
     */
    public Optional<Output<List<RecoveryPlanA2AInputArgs>>> providerSpecificInput() {
        return Optional.ofNullable(this.providerSpecificInput);
    }

    /**
     * The recovery fabric Id.
     * 
     */
    @Import(name="recoveryFabricId", required=true)
    private Output<String> recoveryFabricId;

    /**
     * @return The recovery fabric Id.
     * 
     */
    public Output<String> recoveryFabricId() {
        return this.recoveryFabricId;
    }

    private CreateRecoveryPlanInputPropertiesArgs() {}

    private CreateRecoveryPlanInputPropertiesArgs(CreateRecoveryPlanInputPropertiesArgs $) {
        this.failoverDeploymentModel = $.failoverDeploymentModel;
        this.groups = $.groups;
        this.primaryFabricId = $.primaryFabricId;
        this.providerSpecificInput = $.providerSpecificInput;
        this.recoveryFabricId = $.recoveryFabricId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateRecoveryPlanInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateRecoveryPlanInputPropertiesArgs $;

        public Builder() {
            $ = new CreateRecoveryPlanInputPropertiesArgs();
        }

        public Builder(CreateRecoveryPlanInputPropertiesArgs defaults) {
            $ = new CreateRecoveryPlanInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverDeploymentModel The failover deployment model.
         * 
         * @return builder
         * 
         */
        public Builder failoverDeploymentModel(@Nullable Output<Either<String,FailoverDeploymentModel>> failoverDeploymentModel) {
            $.failoverDeploymentModel = failoverDeploymentModel;
            return this;
        }

        /**
         * @param failoverDeploymentModel The failover deployment model.
         * 
         * @return builder
         * 
         */
        public Builder failoverDeploymentModel(Either<String,FailoverDeploymentModel> failoverDeploymentModel) {
            return failoverDeploymentModel(Output.of(failoverDeploymentModel));
        }

        /**
         * @param failoverDeploymentModel The failover deployment model.
         * 
         * @return builder
         * 
         */
        public Builder failoverDeploymentModel(String failoverDeploymentModel) {
            return failoverDeploymentModel(Either.ofLeft(failoverDeploymentModel));
        }

        /**
         * @param failoverDeploymentModel The failover deployment model.
         * 
         * @return builder
         * 
         */
        public Builder failoverDeploymentModel(FailoverDeploymentModel failoverDeploymentModel) {
            return failoverDeploymentModel(Either.ofRight(failoverDeploymentModel));
        }

        /**
         * @param groups The recovery plan groups.
         * 
         * @return builder
         * 
         */
        public Builder groups(Output<List<RecoveryPlanGroupArgs>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups The recovery plan groups.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<RecoveryPlanGroupArgs> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups The recovery plan groups.
         * 
         * @return builder
         * 
         */
        public Builder groups(RecoveryPlanGroupArgs... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param primaryFabricId The primary fabric Id.
         * 
         * @return builder
         * 
         */
        public Builder primaryFabricId(Output<String> primaryFabricId) {
            $.primaryFabricId = primaryFabricId;
            return this;
        }

        /**
         * @param primaryFabricId The primary fabric Id.
         * 
         * @return builder
         * 
         */
        public Builder primaryFabricId(String primaryFabricId) {
            return primaryFabricId(Output.of(primaryFabricId));
        }

        /**
         * @param providerSpecificInput The provider specific input.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(@Nullable Output<List<RecoveryPlanA2AInputArgs>> providerSpecificInput) {
            $.providerSpecificInput = providerSpecificInput;
            return this;
        }

        /**
         * @param providerSpecificInput The provider specific input.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(List<RecoveryPlanA2AInputArgs> providerSpecificInput) {
            return providerSpecificInput(Output.of(providerSpecificInput));
        }

        /**
         * @param providerSpecificInput The provider specific input.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(RecoveryPlanA2AInputArgs... providerSpecificInput) {
            return providerSpecificInput(List.of(providerSpecificInput));
        }

        /**
         * @param recoveryFabricId The recovery fabric Id.
         * 
         * @return builder
         * 
         */
        public Builder recoveryFabricId(Output<String> recoveryFabricId) {
            $.recoveryFabricId = recoveryFabricId;
            return this;
        }

        /**
         * @param recoveryFabricId The recovery fabric Id.
         * 
         * @return builder
         * 
         */
        public Builder recoveryFabricId(String recoveryFabricId) {
            return recoveryFabricId(Output.of(recoveryFabricId));
        }

        public CreateRecoveryPlanInputPropertiesArgs build() {
            $.groups = Objects.requireNonNull($.groups, "expected parameter 'groups' to be non-null");
            $.primaryFabricId = Objects.requireNonNull($.primaryFabricId, "expected parameter 'primaryFabricId' to be non-null");
            $.recoveryFabricId = Objects.requireNonNull($.recoveryFabricId, "expected parameter 'recoveryFabricId' to be non-null");
            return $;
        }
    }

}
