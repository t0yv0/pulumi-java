// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterStatusEgressPolicyEgressFrom {
    /**
     * @return A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    private final @Nullable List<String> identities;
    /**
     * @return Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    private final @Nullable String identityType;

    @CustomType.Constructor
    private ServicePerimeterStatusEgressPolicyEgressFrom(
        @CustomType.Parameter("identities") @Nullable List<String> identities,
        @CustomType.Parameter("identityType") @Nullable String identityType) {
        this.identities = identities;
        this.identityType = identityType;
    }

    /**
     * @return A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    public List<String> identities() {
        return this.identities == null ? List.of() : this.identities;
    }
    /**
     * @return Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    public Optional<String> identityType() {
        return Optional.ofNullable(this.identityType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusEgressPolicyEgressFrom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> identities;
        private @Nullable String identityType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusEgressPolicyEgressFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
        }

        public Builder identities(@Nullable List<String> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }
        public Builder identityType(@Nullable String identityType) {
            this.identityType = identityType;
            return this;
        }        public ServicePerimeterStatusEgressPolicyEgressFrom build() {
            return new ServicePerimeterStatusEgressPolicyEgressFrom(identities, identityType);
        }
    }
}
