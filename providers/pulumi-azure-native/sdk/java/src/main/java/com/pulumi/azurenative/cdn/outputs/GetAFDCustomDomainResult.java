// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.AFDDomainHttpsParametersResponse;
import com.pulumi.azurenative.cdn.outputs.DomainValidationPropertiesResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAFDCustomDomainResult {
    /**
     * @return Resource reference to the Azure DNS zone
     * 
     */
    private final @Nullable ResourceReferenceResponse azureDnsZone;
    private final String deploymentStatus;
    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     */
    private final String domainValidationState;
    /**
     * @return The host name of the domain. Must be a domain name.
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
     * @return Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user&#39;s own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
     */
    private final @Nullable AFDDomainHttpsParametersResponse tlsSettings;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Values the customer needs to validate domain ownership
     * 
     */
    private final DomainValidationPropertiesResponse validationProperties;

    @CustomType.Constructor
    private GetAFDCustomDomainResult(
        @CustomType.Parameter("azureDnsZone") @Nullable ResourceReferenceResponse azureDnsZone,
        @CustomType.Parameter("deploymentStatus") String deploymentStatus,
        @CustomType.Parameter("domainValidationState") String domainValidationState,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tlsSettings") @Nullable AFDDomainHttpsParametersResponse tlsSettings,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validationProperties") DomainValidationPropertiesResponse validationProperties) {
        this.azureDnsZone = azureDnsZone;
        this.deploymentStatus = deploymentStatus;
        this.domainValidationState = domainValidationState;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tlsSettings = tlsSettings;
        this.type = type;
        this.validationProperties = validationProperties;
    }

    /**
     * @return Resource reference to the Azure DNS zone
     * 
     */
    public Optional<ResourceReferenceResponse> azureDnsZone() {
        return Optional.ofNullable(this.azureDnsZone);
    }
    public String deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     */
    public String domainValidationState() {
        return this.domainValidationState;
    }
    /**
     * @return The host name of the domain. Must be a domain name.
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
     * @return Provisioning status
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user&#39;s own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
     */
    public Optional<AFDDomainHttpsParametersResponse> tlsSettings() {
        return Optional.ofNullable(this.tlsSettings);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Values the customer needs to validate domain ownership
     * 
     */
    public DomainValidationPropertiesResponse validationProperties() {
        return this.validationProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDCustomDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceReferenceResponse azureDnsZone;
        private String deploymentStatus;
        private String domainValidationState;
        private String hostName;
        private String id;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable AFDDomainHttpsParametersResponse tlsSettings;
        private String type;
        private DomainValidationPropertiesResponse validationProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDCustomDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDnsZone = defaults.azureDnsZone;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.domainValidationState = defaults.domainValidationState;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tlsSettings = defaults.tlsSettings;
    	      this.type = defaults.type;
    	      this.validationProperties = defaults.validationProperties;
        }

        public Builder azureDnsZone(@Nullable ResourceReferenceResponse azureDnsZone) {
            this.azureDnsZone = azureDnsZone;
            return this;
        }
        public Builder deploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }
        public Builder domainValidationState(String domainValidationState) {
            this.domainValidationState = Objects.requireNonNull(domainValidationState);
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
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tlsSettings(@Nullable AFDDomainHttpsParametersResponse tlsSettings) {
            this.tlsSettings = tlsSettings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validationProperties(DomainValidationPropertiesResponse validationProperties) {
            this.validationProperties = Objects.requireNonNull(validationProperties);
            return this;
        }        public GetAFDCustomDomainResult build() {
            return new GetAFDCustomDomainResult(azureDnsZone, deploymentStatus, domainValidationState, hostName, id, name, provisioningState, systemData, tlsSettings, type, validationProperties);
        }
    }
}
