// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.outputs;

import com.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentSummaryResponse;
import com.pulumi.azurenative.policyinsights.outputs.RemediationFiltersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRemediationAtManagementGroupResult {
    /**
     * @return The time at which the remediation was created.
     * 
     */
    private final String createdOn;
    /**
     * @return The deployment status summary for all deployments created by the remediation.
     * 
     */
    private final RemediationDeploymentSummaryResponse deploymentStatus;
    /**
     * @return The filters that will be applied to determine which resources to remediate.
     * 
     */
    private final @Nullable RemediationFiltersResponse filters;
    /**
     * @return The ID of the remediation.
     * 
     */
    private final String id;
    /**
     * @return The time at which the remediation was last updated.
     * 
     */
    private final String lastUpdatedOn;
    /**
     * @return The name of the remediation.
     * 
     */
    private final String name;
    /**
     * @return The resource ID of the policy assignment that should be remediated.
     * 
     */
    private final @Nullable String policyAssignmentId;
    /**
     * @return The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    private final @Nullable String policyDefinitionReferenceId;
    /**
     * @return The status of the remediation.
     * 
     */
    private final String provisioningState;
    /**
     * @return The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    private final @Nullable String resourceDiscoveryMode;
    /**
     * @return The type of the remediation.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRemediationAtManagementGroupResult(
        @CustomType.Parameter("createdOn") String createdOn,
        @CustomType.Parameter("deploymentStatus") RemediationDeploymentSummaryResponse deploymentStatus,
        @CustomType.Parameter("filters") @Nullable RemediationFiltersResponse filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastUpdatedOn") String lastUpdatedOn,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policyAssignmentId") @Nullable String policyAssignmentId,
        @CustomType.Parameter("policyDefinitionReferenceId") @Nullable String policyDefinitionReferenceId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceDiscoveryMode") @Nullable String resourceDiscoveryMode,
        @CustomType.Parameter("type") String type) {
        this.createdOn = createdOn;
        this.deploymentStatus = deploymentStatus;
        this.filters = filters;
        this.id = id;
        this.lastUpdatedOn = lastUpdatedOn;
        this.name = name;
        this.policyAssignmentId = policyAssignmentId;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.provisioningState = provisioningState;
        this.resourceDiscoveryMode = resourceDiscoveryMode;
        this.type = type;
    }

    /**
     * @return The time at which the remediation was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return The deployment status summary for all deployments created by the remediation.
     * 
     */
    public RemediationDeploymentSummaryResponse deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * @return The filters that will be applied to determine which resources to remediate.
     * 
     */
    public Optional<RemediationFiltersResponse> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * @return The ID of the remediation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The time at which the remediation was last updated.
     * 
     */
    public String lastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    /**
     * @return The name of the remediation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource ID of the policy assignment that should be remediated.
     * 
     */
    public Optional<String> policyAssignmentId() {
        return Optional.ofNullable(this.policyAssignmentId);
    }
    /**
     * @return The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    public Optional<String> policyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }
    /**
     * @return The status of the remediation.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    public Optional<String> resourceDiscoveryMode() {
        return Optional.ofNullable(this.resourceDiscoveryMode);
    }
    /**
     * @return The type of the remediation.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemediationAtManagementGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private RemediationDeploymentSummaryResponse deploymentStatus;
        private @Nullable RemediationFiltersResponse filters;
        private String id;
        private String lastUpdatedOn;
        private String name;
        private @Nullable String policyAssignmentId;
        private @Nullable String policyDefinitionReferenceId;
        private String provisioningState;
        private @Nullable String resourceDiscoveryMode;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemediationAtManagementGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.lastUpdatedOn = defaults.lastUpdatedOn;
    	      this.name = defaults.name;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceDiscoveryMode = defaults.resourceDiscoveryMode;
    	      this.type = defaults.type;
        }

        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        public Builder deploymentStatus(RemediationDeploymentSummaryResponse deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }
        public Builder filters(@Nullable RemediationFiltersResponse filters) {
            this.filters = filters;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastUpdatedOn(String lastUpdatedOn) {
            this.lastUpdatedOn = Objects.requireNonNull(lastUpdatedOn);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyAssignmentId(@Nullable String policyAssignmentId) {
            this.policyAssignmentId = policyAssignmentId;
            return this;
        }
        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceDiscoveryMode(@Nullable String resourceDiscoveryMode) {
            this.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRemediationAtManagementGroupResult build() {
            return new GetRemediationAtManagementGroupResult(createdOn, deploymentStatus, filters, id, lastUpdatedOn, name, policyAssignmentId, policyDefinitionReferenceId, provisioningState, resourceDiscoveryMode, type);
        }
    }
}
