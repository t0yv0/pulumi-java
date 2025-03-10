// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.CdnManagedHttpsParametersResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.azurenative.cdn.outputs.UserManagedHttpsParametersResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomDomainResult {
    /**
     * @return Certificate parameters for securing custom HTTPS
     * 
     */
    private final @Nullable Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse> customHttpsParameters;
    /**
     * @return Provisioning status of Custom Https of the custom domain.
     * 
     */
    private final String customHttpsProvisioningState;
    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    private final String customHttpsProvisioningSubstate;
    /**
     * @return The host name of the custom domain. Must be a domain name.
     * 
     */
    private final String hostName;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Provisioning status of the custom domain.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource status of the custom domain.
     * 
     */
    private final String resourceState;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     * 
     */
    private final @Nullable String validationData;

    @CustomType.Constructor
    private GetCustomDomainResult(
        @CustomType.Parameter("customHttpsParameters") @Nullable Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse> customHttpsParameters,
        @CustomType.Parameter("customHttpsProvisioningState") String customHttpsProvisioningState,
        @CustomType.Parameter("customHttpsProvisioningSubstate") String customHttpsProvisioningSubstate,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validationData") @Nullable String validationData) {
        this.customHttpsParameters = customHttpsParameters;
        this.customHttpsProvisioningState = customHttpsProvisioningState;
        this.customHttpsProvisioningSubstate = customHttpsProvisioningSubstate;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.systemData = systemData;
        this.type = type;
        this.validationData = validationData;
    }

    /**
     * @return Certificate parameters for securing custom HTTPS
     * 
     */
    public Optional<Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse>> customHttpsParameters() {
        return Optional.ofNullable(this.customHttpsParameters);
    }
    /**
     * @return Provisioning status of Custom Https of the custom domain.
     * 
     */
    public String customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }
    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    public String customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }
    /**
     * @return The host name of the custom domain. Must be a domain name.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning status of the custom domain.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource status of the custom domain.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Special validation or data may be required when delivering CDN to some regions due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in China.
     * 
     */
    public Optional<String> validationData() {
        return Optional.ofNullable(this.validationData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse> customHttpsParameters;
        private String customHttpsProvisioningState;
        private String customHttpsProvisioningSubstate;
        private String hostName;
        private String id;
        private String name;
        private String provisioningState;
        private String resourceState;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String validationData;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHttpsParameters = defaults.customHttpsParameters;
    	      this.customHttpsProvisioningState = defaults.customHttpsProvisioningState;
    	      this.customHttpsProvisioningSubstate = defaults.customHttpsProvisioningSubstate;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.validationData = defaults.validationData;
        }

        public Builder customHttpsParameters(@Nullable Either<CdnManagedHttpsParametersResponse,UserManagedHttpsParametersResponse> customHttpsParameters) {
            this.customHttpsParameters = customHttpsParameters;
            return this;
        }
        public Builder customHttpsProvisioningState(String customHttpsProvisioningState) {
            this.customHttpsProvisioningState = Objects.requireNonNull(customHttpsProvisioningState);
            return this;
        }
        public Builder customHttpsProvisioningSubstate(String customHttpsProvisioningSubstate) {
            this.customHttpsProvisioningSubstate = Objects.requireNonNull(customHttpsProvisioningSubstate);
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validationData(@Nullable String validationData) {
            this.validationData = validationData;
            return this;
        }        public GetCustomDomainResult build() {
            return new GetCustomDomainResult(customHttpsParameters, customHttpsProvisioningState, customHttpsProvisioningSubstate, hostName, id, name, provisioningState, resourceState, systemData, type, validationData);
        }
    }
}
