// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicesResourceResponseIdentity {
    /**
     * @return The principal ID of the resource identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant ID of the resource.
     * 
     */
    private final String tenantId;
    /**
     * @return Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ServicesResourceResponseIdentity(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The principal ID of the resource identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant ID of the resource.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesResourceResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesResourceResponseIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ServicesResourceResponseIdentity build() {
            return new ServicesResourceResponseIdentity(principalId, tenantId, type);
        }
    }
}
