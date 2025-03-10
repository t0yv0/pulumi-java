// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstanceFailoverGroupPartnerRegion {
    /**
     * @return The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The partner replication role of the Managed Instance Failover Group.
     * 
     */
    private final @Nullable String role;

    @CustomType.Constructor
    private ManagedInstanceFailoverGroupPartnerRegion(
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("role") @Nullable String role) {
        this.location = location;
        this.role = role;
    }

    /**
     * @return The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The partner replication role of the Managed Instance Failover Group.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceFailoverGroupPartnerRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceFailoverGroupPartnerRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.role = defaults.role;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }        public ManagedInstanceFailoverGroupPartnerRegion build() {
            return new ManagedInstanceFailoverGroupPartnerRegion(location, role);
        }
    }
}
