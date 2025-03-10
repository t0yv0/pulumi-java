// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.outputs;

import com.pulumi.azurenative.azurestackhci.outputs.PerNodeExtensionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExtensionResult {
    /**
     * @return Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
     */
    private final String aggregateState;
    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * @return The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * @return The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * @return The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return State of Arc Extension in each of the nodes.
     * 
     */
    private final List<PerNodeExtensionStateResponse> perNodeExtensionDetails;
    /**
     * @return Protected settings (may contain secrets).
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * @return Provisioning state of the Extension proxy resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The name of the extension handler publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    private final @Nullable Object settings;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Specifies the version of the script handler.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @CustomType.Constructor
    private GetExtensionResult(
        @CustomType.Parameter("aggregateState") String aggregateState,
        @CustomType.Parameter("autoUpgradeMinorVersion") @Nullable Boolean autoUpgradeMinorVersion,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("createdBy") @Nullable String createdBy,
        @CustomType.Parameter("createdByType") @Nullable String createdByType,
        @CustomType.Parameter("forceUpdateTag") @Nullable String forceUpdateTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedAt") @Nullable String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedByType") @Nullable String lastModifiedByType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("perNodeExtensionDetails") List<PerNodeExtensionStateResponse> perNodeExtensionDetails,
        @CustomType.Parameter("protectedSettings") @Nullable Object protectedSettings,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("settings") @Nullable Object settings,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("typeHandlerVersion") @Nullable String typeHandlerVersion) {
        this.aggregateState = aggregateState;
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.forceUpdateTag = forceUpdateTag;
        this.id = id;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.name = name;
        this.perNodeExtensionDetails = perNodeExtensionDetails;
        this.protectedSettings = protectedSettings;
        this.provisioningState = provisioningState;
        this.publisher = publisher;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * @return Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
     */
    public String aggregateState() {
        return this.aggregateState;
    }
    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Optional<Boolean> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The identity that created the resource.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Optional<String> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of Arc Extension in each of the nodes.
     * 
     */
    public List<PerNodeExtensionStateResponse> perNodeExtensionDetails() {
        return this.perNodeExtensionDetails;
    }
    /**
     * @return Protected settings (may contain secrets).
     * 
     */
    public Optional<Object> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * @return Provisioning state of the Extension proxy resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The name of the extension handler publisher.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Optional<Object> settings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies the version of the script handler.
     * 
     */
    public Optional<String> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregateState;
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String name;
        private List<PerNodeExtensionStateResponse> perNodeExtensionDetails;
        private @Nullable Object protectedSettings;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateState = defaults.aggregateState;
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.name = defaults.name;
    	      this.perNodeExtensionDetails = defaults.perNodeExtensionDetails;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder aggregateState(String aggregateState) {
            this.aggregateState = Objects.requireNonNull(aggregateState);
            return this;
        }
        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder perNodeExtensionDetails(List<PerNodeExtensionStateResponse> perNodeExtensionDetails) {
            this.perNodeExtensionDetails = Objects.requireNonNull(perNodeExtensionDetails);
            return this;
        }
        public Builder perNodeExtensionDetails(PerNodeExtensionStateResponse... perNodeExtensionDetails) {
            return perNodeExtensionDetails(List.of(perNodeExtensionDetails));
        }
        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder settings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }        public GetExtensionResult build() {
            return new GetExtensionResult(aggregateState, autoUpgradeMinorVersion, createdAt, createdBy, createdByType, forceUpdateTag, id, lastModifiedAt, lastModifiedBy, lastModifiedByType, name, perNodeExtensionDetails, protectedSettings, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}
