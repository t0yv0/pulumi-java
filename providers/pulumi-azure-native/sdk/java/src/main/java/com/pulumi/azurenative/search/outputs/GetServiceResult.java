// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.outputs;

import com.pulumi.azurenative.search.outputs.IdentityResponse;
import com.pulumi.azurenative.search.outputs.NetworkRuleSetResponse;
import com.pulumi.azurenative.search.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.search.outputs.SharedPrivateLinkResourceResponse;
import com.pulumi.azurenative.search.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
    /**
     * @return Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either &#39;default&#39; or &#39;highDensity&#39;. For all other SKUs, this value must be &#39;default&#39;.
     * 
     */
    private final @Nullable String hostingMode;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Network specific rules that determine how the Azure Cognitive Search service may be reached.
     * 
     */
    private final @Nullable NetworkRuleSetResponse networkRuleSet;
    /**
     * @return The number of partitions in the search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For &#39;standard3&#39; services with hostingMode set to &#39;highDensity&#39;, the allowed values are between 1 and 3.
     * 
     */
    private final @Nullable Integer partitionCount;
    /**
     * @return The list of private endpoint connections to the Azure Cognitive Search service.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return The state of the last provisioning operation performed on the search service. Provisioning is an intermediate state that occurs while service capacity is being established. After capacity is set up, provisioningState changes to either &#39;succeeded&#39; or &#39;failed&#39;. Client applications can poll provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search Service operation to see when an operation is completed. If you are using the free service, this value tends to come back as &#39;succeeded&#39; directly in the call to Create search service. This is because the free service uses capacity that is already set up.
     * 
     */
    private final String provisioningState;
    /**
     * @return This value can be set to &#39;enabled&#39; to avoid breaking changes on existing customer resources and templates. If set to &#39;disabled&#39;, traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * @return The number of replicas in the search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     */
    private final @Nullable Integer replicaCount;
    /**
     * @return The list of shared private link resources managed by the Azure Cognitive Search service.
     * 
     */
    private final List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
    /**
     * @return The SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return The status of the search service. Possible values include: &#39;running&#39;: The search service is running and no provisioning operations are underway. &#39;provisioning&#39;: The search service is being provisioned or scaled up or down. &#39;deleting&#39;: The search service is being deleted. &#39;degraded&#39;: The search service is degraded. This can occur when the underlying search units are not healthy. The search service is most likely operational, but performance might be slow and some requests might be dropped. &#39;disabled&#39;: The search service is disabled. In this state, the service will reject all API requests. &#39;error&#39;: The search service is in an error state. If your service is in the degraded, disabled, or error states, it means the Azure Cognitive Search team is actively investigating the underlying issue. Dedicated services in these states are still chargeable based on the number of search units provisioned.
     * 
     */
    private final String status;
    /**
     * @return The details of the search service status.
     * 
     */
    private final String statusDetails;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("hostingMode") @Nullable String hostingMode,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkRuleSet") @Nullable NetworkRuleSetResponse networkRuleSet,
        @CustomType.Parameter("partitionCount") @Nullable Integer partitionCount,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("replicaCount") @Nullable Integer replicaCount,
        @CustomType.Parameter("sharedPrivateLinkResources") List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetails") String statusDetails,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.hostingMode = hostingMode;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.networkRuleSet = networkRuleSet;
        this.partitionCount = partitionCount;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.replicaCount = replicaCount;
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        this.sku = sku;
        this.status = status;
        this.statusDetails = statusDetails;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either &#39;default&#39; or &#39;highDensity&#39;. For all other SKUs, this value must be &#39;default&#39;.
     * 
     */
    public Optional<String> hostingMode() {
        return Optional.ofNullable(this.hostingMode);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
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
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network specific rules that determine how the Azure Cognitive Search service may be reached.
     * 
     */
    public Optional<NetworkRuleSetResponse> networkRuleSet() {
        return Optional.ofNullable(this.networkRuleSet);
    }
    /**
     * @return The number of partitions in the search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For &#39;standard3&#39; services with hostingMode set to &#39;highDensity&#39;, the allowed values are between 1 and 3.
     * 
     */
    public Optional<Integer> partitionCount() {
        return Optional.ofNullable(this.partitionCount);
    }
    /**
     * @return The list of private endpoint connections to the Azure Cognitive Search service.
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * @return The state of the last provisioning operation performed on the search service. Provisioning is an intermediate state that occurs while service capacity is being established. After capacity is set up, provisioningState changes to either &#39;succeeded&#39; or &#39;failed&#39;. Client applications can poll provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search Service operation to see when an operation is completed. If you are using the free service, this value tends to come back as &#39;succeeded&#39; directly in the call to Create search service. This is because the free service uses capacity that is already set up.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return This value can be set to &#39;enabled&#39; to avoid breaking changes on existing customer resources and templates. If set to &#39;disabled&#39;, traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return The number of replicas in the search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     */
    public Optional<Integer> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    /**
     * @return The list of shared private link resources managed by the Azure Cognitive Search service.
     * 
     */
    public List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }
    /**
     * @return The SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The status of the search service. Possible values include: &#39;running&#39;: The search service is running and no provisioning operations are underway. &#39;provisioning&#39;: The search service is being provisioned or scaled up or down. &#39;deleting&#39;: The search service is being deleted. &#39;degraded&#39;: The search service is degraded. This can occur when the underlying search units are not healthy. The search service is most likely operational, but performance might be slow and some requests might be dropped. &#39;disabled&#39;: The search service is disabled. In this state, the service will reject all API requests. &#39;error&#39;: The search service is in an error state. If your service is in the degraded, disabled, or error states, it means the Azure Cognitive Search team is actively investigating the underlying issue. Dedicated services in these states are still chargeable based on the number of search units provisioned.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The details of the search service status.
     * 
     */
    public String statusDetails() {
        return this.statusDetails;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostingMode;
        private String id;
        private @Nullable IdentityResponse identity;
        private String location;
        private String name;
        private @Nullable NetworkRuleSetResponse networkRuleSet;
        private @Nullable Integer partitionCount;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable Integer replicaCount;
        private List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
        private @Nullable SkuResponse sku;
        private String status;
        private String statusDetails;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostingMode = defaults.hostingMode;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.partitionCount = defaults.partitionCount;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.replicaCount = defaults.replicaCount;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder hostingMode(@Nullable String hostingMode) {
            this.hostingMode = hostingMode;
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
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkRuleSet(@Nullable NetworkRuleSetResponse networkRuleSet) {
            this.networkRuleSet = networkRuleSet;
            return this;
        }
        public Builder partitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Builder sharedPrivateLinkResources(List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = Objects.requireNonNull(sharedPrivateLinkResources);
            return this;
        }
        public Builder sharedPrivateLinkResources(SharedPrivateLinkResourceResponse... sharedPrivateLinkResources) {
            return sharedPrivateLinkResources(List.of(sharedPrivateLinkResources));
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(hostingMode, id, identity, location, name, networkRuleSet, partitionCount, privateEndpointConnections, provisioningState, publicNetworkAccess, replicaCount, sharedPrivateLinkResources, sku, status, statusDetails, tags, type);
        }
    }
}
