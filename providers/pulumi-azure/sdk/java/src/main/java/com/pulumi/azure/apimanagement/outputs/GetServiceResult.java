// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.GetServiceAdditionalLocation;
import com.pulumi.azure.apimanagement.outputs.GetServiceHostnameConfiguration;
import com.pulumi.azure.apimanagement.outputs.GetServiceIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * @return Zero or more `additional_location` blocks as defined below
     * 
     */
    private final List<GetServiceAdditionalLocation> additionalLocations;
    /**
     * @return The URL for the Developer Portal associated with this API Management service.
     * 
     */
    private final String developerPortalUrl;
    /**
     * @return Gateway URL of the API Management service in the Region.
     * 
     */
    private final String gatewayRegionalUrl;
    /**
     * @return The URL for the API Management Service&#39;s Gateway.
     * 
     */
    private final String gatewayUrl;
    /**
     * @return A `hostname_configuration` block as defined below.
     * 
     */
    private final List<GetServiceHostnameConfiguration> hostnameConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return (Optional) An `identity` block as defined below.
     * 
     */
    private final List<GetServiceIdentity> identities;
    /**
     * @return The location name of the additional region among Azure Data center regions.
     * 
     */
    private final String location;
    /**
     * @return The URL for the Management API.
     * 
     */
    private final String managementApiUrl;
    /**
     * @return Specifies the plan&#39;s pricing tier.
     * 
     */
    private final String name;
    /**
     * @return The email address from which the notification will be sent.
     * 
     */
    private final String notificationSenderEmail;
    /**
     * @return The URL of the Publisher Portal.
     * 
     */
    private final String portalUrl;
    /**
     * @return Private IP addresses of the API Management service in the additional location, for instances using virtual network mode.
     * 
     */
    private final List<String> privateIpAddresses;
    /**
     * @return ID of the standard SKU IPv4 Public IP. Available only for Premium SKU deployed in a virtual network.
     * 
     */
    private final String publicIpAddressId;
    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    private final List<String> publicIpAddresses;
    /**
     * @return The email of Publisher/Company of the API Management Service.
     * 
     */
    private final String publisherEmail;
    /**
     * @return The name of the Publisher/Company of the API Management Service.
     * 
     */
    private final String publisherName;
    private final String resourceGroupName;
    /**
     * @return The SCM (Source Code Management) endpoint.
     * 
     */
    private final String scmUrl;
    private final String skuName;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("additionalLocations") List<GetServiceAdditionalLocation> additionalLocations,
        @CustomType.Parameter("developerPortalUrl") String developerPortalUrl,
        @CustomType.Parameter("gatewayRegionalUrl") String gatewayRegionalUrl,
        @CustomType.Parameter("gatewayUrl") String gatewayUrl,
        @CustomType.Parameter("hostnameConfigurations") List<GetServiceHostnameConfiguration> hostnameConfigurations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetServiceIdentity> identities,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managementApiUrl") String managementApiUrl,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationSenderEmail") String notificationSenderEmail,
        @CustomType.Parameter("portalUrl") String portalUrl,
        @CustomType.Parameter("privateIpAddresses") List<String> privateIpAddresses,
        @CustomType.Parameter("publicIpAddressId") String publicIpAddressId,
        @CustomType.Parameter("publicIpAddresses") List<String> publicIpAddresses,
        @CustomType.Parameter("publisherEmail") String publisherEmail,
        @CustomType.Parameter("publisherName") String publisherName,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("scmUrl") String scmUrl,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.additionalLocations = additionalLocations;
        this.developerPortalUrl = developerPortalUrl;
        this.gatewayRegionalUrl = gatewayRegionalUrl;
        this.gatewayUrl = gatewayUrl;
        this.hostnameConfigurations = hostnameConfigurations;
        this.id = id;
        this.identities = identities;
        this.location = location;
        this.managementApiUrl = managementApiUrl;
        this.name = name;
        this.notificationSenderEmail = notificationSenderEmail;
        this.portalUrl = portalUrl;
        this.privateIpAddresses = privateIpAddresses;
        this.publicIpAddressId = publicIpAddressId;
        this.publicIpAddresses = publicIpAddresses;
        this.publisherEmail = publisherEmail;
        this.publisherName = publisherName;
        this.resourceGroupName = resourceGroupName;
        this.scmUrl = scmUrl;
        this.skuName = skuName;
        this.tags = tags;
    }

    /**
     * @return Zero or more `additional_location` blocks as defined below
     * 
     */
    public List<GetServiceAdditionalLocation> additionalLocations() {
        return this.additionalLocations;
    }
    /**
     * @return The URL for the Developer Portal associated with this API Management service.
     * 
     */
    public String developerPortalUrl() {
        return this.developerPortalUrl;
    }
    /**
     * @return Gateway URL of the API Management service in the Region.
     * 
     */
    public String gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    /**
     * @return The URL for the API Management Service&#39;s Gateway.
     * 
     */
    public String gatewayUrl() {
        return this.gatewayUrl;
    }
    /**
     * @return A `hostname_configuration` block as defined below.
     * 
     */
    public List<GetServiceHostnameConfiguration> hostnameConfigurations() {
        return this.hostnameConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional) An `identity` block as defined below.
     * 
     */
    public List<GetServiceIdentity> identities() {
        return this.identities;
    }
    /**
     * @return The location name of the additional region among Azure Data center regions.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The URL for the Management API.
     * 
     */
    public String managementApiUrl() {
        return this.managementApiUrl;
    }
    /**
     * @return Specifies the plan&#39;s pricing tier.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The email address from which the notification will be sent.
     * 
     */
    public String notificationSenderEmail() {
        return this.notificationSenderEmail;
    }
    /**
     * @return The URL of the Publisher Portal.
     * 
     */
    public String portalUrl() {
        return this.portalUrl;
    }
    /**
     * @return Private IP addresses of the API Management service in the additional location, for instances using virtual network mode.
     * 
     */
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * @return ID of the standard SKU IPv4 Public IP. Available only for Premium SKU deployed in a virtual network.
     * 
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    public List<String> publicIpAddresses() {
        return this.publicIpAddresses;
    }
    /**
     * @return The email of Publisher/Company of the API Management Service.
     * 
     */
    public String publisherEmail() {
        return this.publisherEmail;
    }
    /**
     * @return The name of the Publisher/Company of the API Management Service.
     * 
     */
    public String publisherName() {
        return this.publisherName;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SCM (Source Code Management) endpoint.
     * 
     */
    public String scmUrl() {
        return this.scmUrl;
    }
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceAdditionalLocation> additionalLocations;
        private String developerPortalUrl;
        private String gatewayRegionalUrl;
        private String gatewayUrl;
        private List<GetServiceHostnameConfiguration> hostnameConfigurations;
        private String id;
        private List<GetServiceIdentity> identities;
        private String location;
        private String managementApiUrl;
        private String name;
        private String notificationSenderEmail;
        private String portalUrl;
        private List<String> privateIpAddresses;
        private String publicIpAddressId;
        private List<String> publicIpAddresses;
        private String publisherEmail;
        private String publisherName;
        private String resourceGroupName;
        private String scmUrl;
        private String skuName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLocations = defaults.additionalLocations;
    	      this.developerPortalUrl = defaults.developerPortalUrl;
    	      this.gatewayRegionalUrl = defaults.gatewayRegionalUrl;
    	      this.gatewayUrl = defaults.gatewayUrl;
    	      this.hostnameConfigurations = defaults.hostnameConfigurations;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.location = defaults.location;
    	      this.managementApiUrl = defaults.managementApiUrl;
    	      this.name = defaults.name;
    	      this.notificationSenderEmail = defaults.notificationSenderEmail;
    	      this.portalUrl = defaults.portalUrl;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publisherEmail = defaults.publisherEmail;
    	      this.publisherName = defaults.publisherName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scmUrl = defaults.scmUrl;
    	      this.skuName = defaults.skuName;
    	      this.tags = defaults.tags;
        }

        public Builder additionalLocations(List<GetServiceAdditionalLocation> additionalLocations) {
            this.additionalLocations = Objects.requireNonNull(additionalLocations);
            return this;
        }
        public Builder additionalLocations(GetServiceAdditionalLocation... additionalLocations) {
            return additionalLocations(List.of(additionalLocations));
        }
        public Builder developerPortalUrl(String developerPortalUrl) {
            this.developerPortalUrl = Objects.requireNonNull(developerPortalUrl);
            return this;
        }
        public Builder gatewayRegionalUrl(String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
            return this;
        }
        public Builder gatewayUrl(String gatewayUrl) {
            this.gatewayUrl = Objects.requireNonNull(gatewayUrl);
            return this;
        }
        public Builder hostnameConfigurations(List<GetServiceHostnameConfiguration> hostnameConfigurations) {
            this.hostnameConfigurations = Objects.requireNonNull(hostnameConfigurations);
            return this;
        }
        public Builder hostnameConfigurations(GetServiceHostnameConfiguration... hostnameConfigurations) {
            return hostnameConfigurations(List.of(hostnameConfigurations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetServiceIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetServiceIdentity... identities) {
            return identities(List.of(identities));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managementApiUrl(String managementApiUrl) {
            this.managementApiUrl = Objects.requireNonNull(managementApiUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationSenderEmail(String notificationSenderEmail) {
            this.notificationSenderEmail = Objects.requireNonNull(notificationSenderEmail);
            return this;
        }
        public Builder portalUrl(String portalUrl) {
            this.portalUrl = Objects.requireNonNull(portalUrl);
            return this;
        }
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            this.privateIpAddresses = Objects.requireNonNull(privateIpAddresses);
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        public Builder publicIpAddresses(List<String> publicIpAddresses) {
            this.publicIpAddresses = Objects.requireNonNull(publicIpAddresses);
            return this;
        }
        public Builder publicIpAddresses(String... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }
        public Builder publisherEmail(String publisherEmail) {
            this.publisherEmail = Objects.requireNonNull(publisherEmail);
            return this;
        }
        public Builder publisherName(String publisherName) {
            this.publisherName = Objects.requireNonNull(publisherName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scmUrl(String scmUrl) {
            this.scmUrl = Objects.requireNonNull(scmUrl);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(additionalLocations, developerPortalUrl, gatewayRegionalUrl, gatewayUrl, hostnameConfigurations, id, identities, location, managementApiUrl, name, notificationSenderEmail, portalUrl, privateIpAddresses, publicIpAddressId, publicIpAddresses, publisherEmail, publisherName, resourceGroupName, scmUrl, skuName, tags);
        }
    }
}
