// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceDisasterRecoveryConfigResult {
    private final String defaultPrimaryKey;
    private final String defaultSecondaryKey;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final @Nullable String namespaceId;
    private final @Nullable String namespaceName;
    private final String partnerNamespaceId;
    private final String primaryConnectionStringAlias;
    private final @Nullable String resourceGroupName;
    private final String secondaryConnectionStringAlias;

    @CustomType.Constructor
    private GetNamespaceDisasterRecoveryConfigResult(
        @CustomType.Parameter("defaultPrimaryKey") String defaultPrimaryKey,
        @CustomType.Parameter("defaultSecondaryKey") String defaultSecondaryKey,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceId") @Nullable String namespaceId,
        @CustomType.Parameter("namespaceName") @Nullable String namespaceName,
        @CustomType.Parameter("partnerNamespaceId") String partnerNamespaceId,
        @CustomType.Parameter("primaryConnectionStringAlias") String primaryConnectionStringAlias,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("secondaryConnectionStringAlias") String secondaryConnectionStringAlias) {
        this.defaultPrimaryKey = defaultPrimaryKey;
        this.defaultSecondaryKey = defaultSecondaryKey;
        this.id = id;
        this.name = name;
        this.namespaceId = namespaceId;
        this.namespaceName = namespaceName;
        this.partnerNamespaceId = partnerNamespaceId;
        this.primaryConnectionStringAlias = primaryConnectionStringAlias;
        this.resourceGroupName = resourceGroupName;
        this.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
    }

    public String defaultPrimaryKey() {
        return this.defaultPrimaryKey;
    }
    public String defaultSecondaryKey() {
        return this.defaultSecondaryKey;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    public String partnerNamespaceId() {
        return this.partnerNamespaceId;
    }
    public String primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    public String secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultPrimaryKey;
        private String defaultSecondaryKey;
        private String id;
        private String name;
        private @Nullable String namespaceId;
        private @Nullable String namespaceName;
        private String partnerNamespaceId;
        private String primaryConnectionStringAlias;
        private @Nullable String resourceGroupName;
        private String secondaryConnectionStringAlias;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPrimaryKey = defaults.defaultPrimaryKey;
    	      this.defaultSecondaryKey = defaults.defaultSecondaryKey;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partnerNamespaceId = defaults.partnerNamespaceId;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
        }

        public Builder defaultPrimaryKey(String defaultPrimaryKey) {
            this.defaultPrimaryKey = Objects.requireNonNull(defaultPrimaryKey);
            return this;
        }
        public Builder defaultSecondaryKey(String defaultSecondaryKey) {
            this.defaultSecondaryKey = Objects.requireNonNull(defaultSecondaryKey);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Builder namespaceName(@Nullable String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            this.partnerNamespaceId = Objects.requireNonNull(partnerNamespaceId);
            return this;
        }
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            this.primaryConnectionStringAlias = Objects.requireNonNull(primaryConnectionStringAlias);
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            this.secondaryConnectionStringAlias = Objects.requireNonNull(secondaryConnectionStringAlias);
            return this;
        }        public GetNamespaceDisasterRecoveryConfigResult build() {
            return new GetNamespaceDisasterRecoveryConfigResult(defaultPrimaryKey, defaultSecondaryKey, id, name, namespaceId, namespaceName, partnerNamespaceId, primaryConnectionStringAlias, resourceGroupName, secondaryConnectionStringAlias);
        }
    }
}
