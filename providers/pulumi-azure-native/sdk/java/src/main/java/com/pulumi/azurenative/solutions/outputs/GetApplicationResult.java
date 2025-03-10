// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.azurenative.solutions.outputs.ApplicationArtifactResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationAuthorizationResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationBillingDetailsDefinitionResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationClientDetailsResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationJitAccessPolicyResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationPackageContactResponse;
import com.pulumi.azurenative.solutions.outputs.ApplicationPackageSupportUrlsResponse;
import com.pulumi.azurenative.solutions.outputs.IdentityResponse;
import com.pulumi.azurenative.solutions.outputs.PlanResponse;
import com.pulumi.azurenative.solutions.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    /**
     * @return The fully qualified path of managed application definition Id.
     * 
     */
    private final @Nullable String applicationDefinitionId;
    /**
     * @return The collection of managed application artifacts.
     * 
     */
    private final List<ApplicationArtifactResponse> artifacts;
    /**
     * @return The  read-only authorizations property that is retrieved from the application package.
     * 
     */
    private final List<ApplicationAuthorizationResponse> authorizations;
    /**
     * @return The managed application billing details.
     * 
     */
    private final ApplicationBillingDetailsDefinitionResponse billingDetails;
    /**
     * @return The client entity that created the JIT request.
     * 
     */
    private final ApplicationClientDetailsResponse createdBy;
    /**
     * @return The read-only customer support property that is retrieved from the application package.
     * 
     */
    private final ApplicationPackageContactResponse customerSupport;
    /**
     * @return Resource ID
     * 
     */
    private final String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return The managed application Jit access policy.
     * 
     */
    private final @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy;
    /**
     * @return The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     * 
     */
    private final String kind;
    /**
     * @return Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * @return ID of the resource that manages this resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * @return The managed resource group Id.
     * 
     */
    private final @Nullable String managedResourceGroupId;
    /**
     * @return The managed application management mode.
     * 
     */
    private final String managementMode;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Name and value pairs that define the managed application outputs.
     * 
     */
    private final Object outputs;
    /**
     * @return Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     * 
     */
    private final @Nullable Object parameters;
    /**
     * @return The plan information.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * @return The managed application provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return The publisher tenant Id.
     * 
     */
    private final String publisherTenantId;
    /**
     * @return The SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return The read-only support URLs property that is retrieved from the application package.
     * 
     */
    private final ApplicationPackageSupportUrlsResponse supportUrls;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return The client entity that last updated the JIT request.
     * 
     */
    private final ApplicationClientDetailsResponse updatedBy;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("applicationDefinitionId") @Nullable String applicationDefinitionId,
        @CustomType.Parameter("artifacts") List<ApplicationArtifactResponse> artifacts,
        @CustomType.Parameter("authorizations") List<ApplicationAuthorizationResponse> authorizations,
        @CustomType.Parameter("billingDetails") ApplicationBillingDetailsDefinitionResponse billingDetails,
        @CustomType.Parameter("createdBy") ApplicationClientDetailsResponse createdBy,
        @CustomType.Parameter("customerSupport") ApplicationPackageContactResponse customerSupport,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("jitAccessPolicy") @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedBy") @Nullable String managedBy,
        @CustomType.Parameter("managedResourceGroupId") @Nullable String managedResourceGroupId,
        @CustomType.Parameter("managementMode") String managementMode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputs") Object outputs,
        @CustomType.Parameter("parameters") @Nullable Object parameters,
        @CustomType.Parameter("plan") @Nullable PlanResponse plan,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publisherTenantId") String publisherTenantId,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("supportUrls") ApplicationPackageSupportUrlsResponse supportUrls,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedBy") ApplicationClientDetailsResponse updatedBy) {
        this.applicationDefinitionId = applicationDefinitionId;
        this.artifacts = artifacts;
        this.authorizations = authorizations;
        this.billingDetails = billingDetails;
        this.createdBy = createdBy;
        this.customerSupport = customerSupport;
        this.id = id;
        this.identity = identity;
        this.jitAccessPolicy = jitAccessPolicy;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.managedResourceGroupId = managedResourceGroupId;
        this.managementMode = managementMode;
        this.name = name;
        this.outputs = outputs;
        this.parameters = parameters;
        this.plan = plan;
        this.provisioningState = provisioningState;
        this.publisherTenantId = publisherTenantId;
        this.sku = sku;
        this.supportUrls = supportUrls;
        this.tags = tags;
        this.type = type;
        this.updatedBy = updatedBy;
    }

    /**
     * @return The fully qualified path of managed application definition Id.
     * 
     */
    public Optional<String> applicationDefinitionId() {
        return Optional.ofNullable(this.applicationDefinitionId);
    }
    /**
     * @return The collection of managed application artifacts.
     * 
     */
    public List<ApplicationArtifactResponse> artifacts() {
        return this.artifacts;
    }
    /**
     * @return The  read-only authorizations property that is retrieved from the application package.
     * 
     */
    public List<ApplicationAuthorizationResponse> authorizations() {
        return this.authorizations;
    }
    /**
     * @return The managed application billing details.
     * 
     */
    public ApplicationBillingDetailsDefinitionResponse billingDetails() {
        return this.billingDetails;
    }
    /**
     * @return The client entity that created the JIT request.
     * 
     */
    public ApplicationClientDetailsResponse createdBy() {
        return this.createdBy;
    }
    /**
     * @return The read-only customer support property that is retrieved from the application package.
     * 
     */
    public ApplicationPackageContactResponse customerSupport() {
        return this.customerSupport;
    }
    /**
     * @return Resource ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The managed application Jit access policy.
     * 
     */
    public Optional<ApplicationJitAccessPolicyResponse> jitAccessPolicy() {
        return Optional.ofNullable(this.jitAccessPolicy);
    }
    /**
     * @return The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return ID of the resource that manages this resource.
     * 
     */
    public Optional<String> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * @return The managed resource group Id.
     * 
     */
    public Optional<String> managedResourceGroupId() {
        return Optional.ofNullable(this.managedResourceGroupId);
    }
    /**
     * @return The managed application management mode.
     * 
     */
    public String managementMode() {
        return this.managementMode;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name and value pairs that define the managed application outputs.
     * 
     */
    public Object outputs() {
        return this.outputs;
    }
    /**
     * @return Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     * 
     */
    public Optional<Object> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * @return The plan information.
     * 
     */
    public Optional<PlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The managed application provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The publisher tenant Id.
     * 
     */
    public String publisherTenantId() {
        return this.publisherTenantId;
    }
    /**
     * @return The SKU of the resource.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The read-only support URLs property that is retrieved from the application package.
     * 
     */
    public ApplicationPackageSupportUrlsResponse supportUrls() {
        return this.supportUrls;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The client entity that last updated the JIT request.
     * 
     */
    public ApplicationClientDetailsResponse updatedBy() {
        return this.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationDefinitionId;
        private List<ApplicationArtifactResponse> artifacts;
        private List<ApplicationAuthorizationResponse> authorizations;
        private ApplicationBillingDetailsDefinitionResponse billingDetails;
        private ApplicationClientDetailsResponse createdBy;
        private ApplicationPackageContactResponse customerSupport;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy;
        private String kind;
        private @Nullable String location;
        private @Nullable String managedBy;
        private @Nullable String managedResourceGroupId;
        private String managementMode;
        private String name;
        private Object outputs;
        private @Nullable Object parameters;
        private @Nullable PlanResponse plan;
        private String provisioningState;
        private String publisherTenantId;
        private @Nullable SkuResponse sku;
        private ApplicationPackageSupportUrlsResponse supportUrls;
        private @Nullable Map<String,String> tags;
        private String type;
        private ApplicationClientDetailsResponse updatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDefinitionId = defaults.applicationDefinitionId;
    	      this.artifacts = defaults.artifacts;
    	      this.authorizations = defaults.authorizations;
    	      this.billingDetails = defaults.billingDetails;
    	      this.createdBy = defaults.createdBy;
    	      this.customerSupport = defaults.customerSupport;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.jitAccessPolicy = defaults.jitAccessPolicy;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.managementMode = defaults.managementMode;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisherTenantId = defaults.publisherTenantId;
    	      this.sku = defaults.sku;
    	      this.supportUrls = defaults.supportUrls;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedBy = defaults.updatedBy;
        }

        public Builder applicationDefinitionId(@Nullable String applicationDefinitionId) {
            this.applicationDefinitionId = applicationDefinitionId;
            return this;
        }
        public Builder artifacts(List<ApplicationArtifactResponse> artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }
        public Builder artifacts(ApplicationArtifactResponse... artifacts) {
            return artifacts(List.of(artifacts));
        }
        public Builder authorizations(List<ApplicationAuthorizationResponse> authorizations) {
            this.authorizations = Objects.requireNonNull(authorizations);
            return this;
        }
        public Builder authorizations(ApplicationAuthorizationResponse... authorizations) {
            return authorizations(List.of(authorizations));
        }
        public Builder billingDetails(ApplicationBillingDetailsDefinitionResponse billingDetails) {
            this.billingDetails = Objects.requireNonNull(billingDetails);
            return this;
        }
        public Builder createdBy(ApplicationClientDetailsResponse createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder customerSupport(ApplicationPackageContactResponse customerSupport) {
            this.customerSupport = Objects.requireNonNull(customerSupport);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder jitAccessPolicy(@Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy) {
            this.jitAccessPolicy = jitAccessPolicy;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }
        public Builder managedResourceGroupId(@Nullable String managedResourceGroupId) {
            this.managedResourceGroupId = managedResourceGroupId;
            return this;
        }
        public Builder managementMode(String managementMode) {
            this.managementMode = Objects.requireNonNull(managementMode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        public Builder parameters(@Nullable Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publisherTenantId(String publisherTenantId) {
            this.publisherTenantId = Objects.requireNonNull(publisherTenantId);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder supportUrls(ApplicationPackageSupportUrlsResponse supportUrls) {
            this.supportUrls = Objects.requireNonNull(supportUrls);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedBy(ApplicationClientDetailsResponse updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }        public GetApplicationResult build() {
            return new GetApplicationResult(applicationDefinitionId, artifacts, authorizations, billingDetails, createdBy, customerSupport, id, identity, jitAccessPolicy, kind, location, managedBy, managedResourceGroupId, managementMode, name, outputs, parameters, plan, provisioningState, publisherTenantId, sku, supportUrls, tags, type, updatedBy);
        }
    }
}
