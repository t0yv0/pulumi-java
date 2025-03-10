// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.WorkspaceKeyDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomerManagedKeyDetailsResponse {
    /**
     * @return The key object of the workspace
     * 
     */
    private final @Nullable WorkspaceKeyDetailsResponse key;
    /**
     * @return The customer managed key status on the workspace
     * 
     */
    private final String status;

    @CustomType.Constructor
    private CustomerManagedKeyDetailsResponse(
        @CustomType.Parameter("key") @Nullable WorkspaceKeyDetailsResponse key,
        @CustomType.Parameter("status") String status) {
        this.key = key;
        this.status = status;
    }

    /**
     * @return The key object of the workspace
     * 
     */
    public Optional<WorkspaceKeyDetailsResponse> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The customer managed key status on the workspace
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkspaceKeyDetailsResponse key;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder key(@Nullable WorkspaceKeyDetailsResponse key) {
            this.key = key;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public CustomerManagedKeyDetailsResponse build() {
            return new CustomerManagedKeyDetailsResponse(key, status);
        }
    }
}
