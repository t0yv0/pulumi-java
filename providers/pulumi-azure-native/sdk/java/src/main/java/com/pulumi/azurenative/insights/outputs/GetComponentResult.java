// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.PrivateLinkScopedResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetComponentResult {
    /**
     * @return Application Insights Unique ID for your Application.
     * 
     */
    private final String appId;
    /**
     * @return The unique ID of your application. This field mirrors the &#39;Name&#39; field and cannot be changed.
     * 
     */
    private final String applicationId;
    /**
     * @return Type of application being monitored.
     * 
     */
    private final String applicationType;
    /**
     * @return Application Insights component connection string.
     * 
     */
    private final String connectionString;
    /**
     * @return Creation Date for the Application Insights component, in ISO 8601 format.
     * 
     */
    private final String creationDate;
    /**
     * @return Disable IP masking.
     * 
     */
    private final @Nullable Boolean disableIpMasking;
    /**
     * @return Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    private final @Nullable String flowType;
    /**
     * @return The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    private final @Nullable String hockeyAppId;
    /**
     * @return Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
     */
    private final String hockeyAppToken;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return Purge data immediately after 30 days.
     * 
     */
    private final @Nullable Boolean immediatePurgeDataOn30Days;
    /**
     * @return Indicates the flow of the ingestion.
     * 
     */
    private final @Nullable String ingestionMode;
    /**
     * @return Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
     */
    private final String instrumentationKey;
    /**
     * @return The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    private final String kind;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return List of linked private link scope resources.
     * 
     */
    private final List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
    /**
     * @return Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * @return Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    private final @Nullable String requestSource;
    /**
     * @return Retention period in days.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * @return Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    private final @Nullable Double samplingPercentage;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Azure Tenant Id.
     * 
     */
    private final String tenantId;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetComponentResult(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("applicationId") String applicationId,
        @CustomType.Parameter("applicationType") String applicationType,
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("disableIpMasking") @Nullable Boolean disableIpMasking,
        @CustomType.Parameter("flowType") @Nullable String flowType,
        @CustomType.Parameter("hockeyAppId") @Nullable String hockeyAppId,
        @CustomType.Parameter("hockeyAppToken") String hockeyAppToken,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("immediatePurgeDataOn30Days") @Nullable Boolean immediatePurgeDataOn30Days,
        @CustomType.Parameter("ingestionMode") @Nullable String ingestionMode,
        @CustomType.Parameter("instrumentationKey") String instrumentationKey,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateLinkScopedResources") List<PrivateLinkScopedResourceResponse> privateLinkScopedResources,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("requestSource") @Nullable String requestSource,
        @CustomType.Parameter("retentionInDays") @Nullable Integer retentionInDays,
        @CustomType.Parameter("samplingPercentage") @Nullable Double samplingPercentage,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.appId = appId;
        this.applicationId = applicationId;
        this.applicationType = applicationType;
        this.connectionString = connectionString;
        this.creationDate = creationDate;
        this.disableIpMasking = disableIpMasking;
        this.flowType = flowType;
        this.hockeyAppId = hockeyAppId;
        this.hockeyAppToken = hockeyAppToken;
        this.id = id;
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
        this.ingestionMode = ingestionMode;
        this.instrumentationKey = instrumentationKey;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.privateLinkScopedResources = privateLinkScopedResources;
        this.provisioningState = provisioningState;
        this.requestSource = requestSource;
        this.retentionInDays = retentionInDays;
        this.samplingPercentage = samplingPercentage;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return Application Insights Unique ID for your Application.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The unique ID of your application. This field mirrors the &#39;Name&#39; field and cannot be changed.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return Type of application being monitored.
     * 
     */
    public String applicationType() {
        return this.applicationType;
    }
    /**
     * @return Application Insights component connection string.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Creation Date for the Application Insights component, in ISO 8601 format.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Disable IP masking.
     * 
     */
    public Optional<Boolean> disableIpMasking() {
        return Optional.ofNullable(this.disableIpMasking);
    }
    /**
     * @return Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to &#39;Bluefield&#39; when creating/updating a component via the REST API.
     * 
     */
    public Optional<String> flowType() {
        return Optional.ofNullable(this.flowType);
    }
    /**
     * @return The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    public Optional<String> hockeyAppId() {
        return Optional.ofNullable(this.hockeyAppId);
    }
    /**
     * @return Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
     */
    public String hockeyAppToken() {
        return this.hockeyAppToken;
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Purge data immediately after 30 days.
     * 
     */
    public Optional<Boolean> immediatePurgeDataOn30Days() {
        return Optional.ofNullable(this.immediatePurgeDataOn30Days);
    }
    /**
     * @return Indicates the flow of the ingestion.
     * 
     */
    public Optional<String> ingestionMode() {
        return Optional.ofNullable(this.ingestionMode);
    }
    /**
     * @return Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
     */
    public String instrumentationKey() {
        return this.instrumentationKey;
    }
    /**
     * @return The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of linked private link scope resources.
     * 
     */
    public List<PrivateLinkScopedResourceResponse> privateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }
    /**
     * @return Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Describes what tool created this Application Insights component. Customers using this API should set this to the default &#39;rest&#39;.
     * 
     */
    public Optional<String> requestSource() {
        return Optional.ofNullable(this.requestSource);
    }
    /**
     * @return Retention period in days.
     * 
     */
    public Optional<Integer> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * @return Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    public Optional<Double> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Azure Tenant Id.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String applicationId;
        private String applicationType;
        private String connectionString;
        private String creationDate;
        private @Nullable Boolean disableIpMasking;
        private @Nullable String flowType;
        private @Nullable String hockeyAppId;
        private String hockeyAppToken;
        private String id;
        private @Nullable Boolean immediatePurgeDataOn30Days;
        private @Nullable String ingestionMode;
        private String instrumentationKey;
        private String kind;
        private String location;
        private String name;
        private List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
        private String provisioningState;
        private @Nullable String requestSource;
        private @Nullable Integer retentionInDays;
        private @Nullable Double samplingPercentage;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.applicationId = defaults.applicationId;
    	      this.applicationType = defaults.applicationType;
    	      this.connectionString = defaults.connectionString;
    	      this.creationDate = defaults.creationDate;
    	      this.disableIpMasking = defaults.disableIpMasking;
    	      this.flowType = defaults.flowType;
    	      this.hockeyAppId = defaults.hockeyAppId;
    	      this.hockeyAppToken = defaults.hockeyAppToken;
    	      this.id = defaults.id;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
    	      this.ingestionMode = defaults.ingestionMode;
    	      this.instrumentationKey = defaults.instrumentationKey;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateLinkScopedResources = defaults.privateLinkScopedResources;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestSource = defaults.requestSource;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationType(String applicationType) {
            this.applicationType = Objects.requireNonNull(applicationType);
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder disableIpMasking(@Nullable Boolean disableIpMasking) {
            this.disableIpMasking = disableIpMasking;
            return this;
        }
        public Builder flowType(@Nullable String flowType) {
            this.flowType = flowType;
            return this;
        }
        public Builder hockeyAppId(@Nullable String hockeyAppId) {
            this.hockeyAppId = hockeyAppId;
            return this;
        }
        public Builder hockeyAppToken(String hockeyAppToken) {
            this.hockeyAppToken = Objects.requireNonNull(hockeyAppToken);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder immediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }
        public Builder ingestionMode(@Nullable String ingestionMode) {
            this.ingestionMode = ingestionMode;
            return this;
        }
        public Builder instrumentationKey(String instrumentationKey) {
            this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateLinkScopedResources(List<PrivateLinkScopedResourceResponse> privateLinkScopedResources) {
            this.privateLinkScopedResources = Objects.requireNonNull(privateLinkScopedResources);
            return this;
        }
        public Builder privateLinkScopedResources(PrivateLinkScopedResourceResponse... privateLinkScopedResources) {
            return privateLinkScopedResources(List.of(privateLinkScopedResources));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder requestSource(@Nullable String requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder samplingPercentage(@Nullable Double samplingPercentage) {
            this.samplingPercentage = samplingPercentage;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetComponentResult build() {
            return new GetComponentResult(appId, applicationId, applicationType, connectionString, creationDate, disableIpMasking, flowType, hockeyAppId, hockeyAppToken, id, immediatePurgeDataOn30Days, ingestionMode, instrumentationKey, kind, location, name, privateLinkScopedResources, provisioningState, requestSource, retentionInDays, samplingPercentage, tags, tenantId, type);
        }
    }
}
