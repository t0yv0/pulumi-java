// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountVirtualNetworkRule {
    /**
     * @return The ID of the virtual network subnet.
     * 
     */
    private final String id;
    /**
     * @return If set to true, the specified subnet will be added as a virtual network rule even if its CosmosDB service endpoint is not active. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    @CustomType.Constructor
    private AccountVirtualNetworkRule(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ignoreMissingVnetServiceEndpoint") @Nullable Boolean ignoreMissingVnetServiceEndpoint) {
        this.id = id;
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
    }

    /**
     * @return The ID of the virtual network subnet.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If set to true, the specified subnet will be added as a virtual network rule even if its CosmosDB service endpoint is not active. Defaults to `false`.
     * 
     */
    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountVirtualNetworkRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountVirtualNetworkRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }        public AccountVirtualNetworkRule build() {
            return new AccountVirtualNetworkRule(id, ignoreMissingVnetServiceEndpoint);
        }
    }
}
