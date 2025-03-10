// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.outputs;

import com.pulumi.azurenative.analysisservices.outputs.GatewayDetailsResponse;
import com.pulumi.azurenative.analysisservices.outputs.IPv4FirewallSettingsResponse;
import com.pulumi.azurenative.analysisservices.outputs.ResourceSkuResponse;
import com.pulumi.azurenative.analysisservices.outputs.ServerAdministratorsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerDetailsResult {
    /**
     * @return A collection of AS server administrators
     * 
     */
    private final @Nullable ServerAdministratorsResponse asAdministrators;
    /**
     * @return The SAS container URI to the backup container.
     * 
     */
    private final @Nullable String backupBlobContainerUri;
    /**
     * @return The gateway details configured for the AS server.
     * 
     */
    private final @Nullable GatewayDetailsResponse gatewayDetails;
    /**
     * @return An identifier that represents the Analysis Services resource.
     * 
     */
    private final String id;
    /**
     * @return The firewall settings for the AS server.
     * 
     */
    private final @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
    /**
     * @return Location of the Analysis Services resource.
     * 
     */
    private final String location;
    /**
     * @return The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    private final @Nullable Integer managedMode;
    /**
     * @return The name of the Analysis Services resource.
     * 
     */
    private final String name;
    /**
     * @return The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * @return How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
     * 
     */
    private final @Nullable String querypoolConnectionMode;
    /**
     * @return The full name of the Analysis Services resource.
     * 
     */
    private final String serverFullName;
    /**
     * @return The server monitor mode for AS server
     * 
     */
    private final @Nullable Integer serverMonitorMode;
    /**
     * @return The SKU of the Analysis Services resource.
     * 
     */
    private final ResourceSkuResponse sku;
    /**
     * @return The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    private final String state;
    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the Analysis Services resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerDetailsResult(
        @CustomType.Parameter("asAdministrators") @Nullable ServerAdministratorsResponse asAdministrators,
        @CustomType.Parameter("backupBlobContainerUri") @Nullable String backupBlobContainerUri,
        @CustomType.Parameter("gatewayDetails") @Nullable GatewayDetailsResponse gatewayDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipV4FirewallSettings") @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedMode") @Nullable Integer managedMode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("querypoolConnectionMode") @Nullable String querypoolConnectionMode,
        @CustomType.Parameter("serverFullName") String serverFullName,
        @CustomType.Parameter("serverMonitorMode") @Nullable Integer serverMonitorMode,
        @CustomType.Parameter("sku") ResourceSkuResponse sku,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.asAdministrators = asAdministrators;
        this.backupBlobContainerUri = backupBlobContainerUri;
        this.gatewayDetails = gatewayDetails;
        this.id = id;
        this.ipV4FirewallSettings = ipV4FirewallSettings;
        this.location = location;
        this.managedMode = managedMode;
        this.name = name;
        this.provisioningState = provisioningState;
        this.querypoolConnectionMode = querypoolConnectionMode;
        this.serverFullName = serverFullName;
        this.serverMonitorMode = serverMonitorMode;
        this.sku = sku;
        this.state = state;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return A collection of AS server administrators
     * 
     */
    public Optional<ServerAdministratorsResponse> asAdministrators() {
        return Optional.ofNullable(this.asAdministrators);
    }
    /**
     * @return The SAS container URI to the backup container.
     * 
     */
    public Optional<String> backupBlobContainerUri() {
        return Optional.ofNullable(this.backupBlobContainerUri);
    }
    /**
     * @return The gateway details configured for the AS server.
     * 
     */
    public Optional<GatewayDetailsResponse> gatewayDetails() {
        return Optional.ofNullable(this.gatewayDetails);
    }
    /**
     * @return An identifier that represents the Analysis Services resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The firewall settings for the AS server.
     * 
     */
    public Optional<IPv4FirewallSettingsResponse> ipV4FirewallSettings() {
        return Optional.ofNullable(this.ipV4FirewallSettings);
    }
    /**
     * @return Location of the Analysis Services resource.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    public Optional<Integer> managedMode() {
        return Optional.ofNullable(this.managedMode);
    }
    /**
     * @return The name of the Analysis Services resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return How the read-write server&#39;s participation in the query pool is controlled.&lt;br/&gt;It can have the following values: &lt;ul&gt;&lt;li&gt;readOnly - indicates that the read-write server is intended not to participate in query operations&lt;/li&gt;&lt;li&gt;all - indicates that the read-write server can participate in query operations&lt;/li&gt;&lt;/ul&gt;Specifying readOnly when capacity is 1 results in error.
     * 
     */
    public Optional<String> querypoolConnectionMode() {
        return Optional.ofNullable(this.querypoolConnectionMode);
    }
    /**
     * @return The full name of the Analysis Services resource.
     * 
     */
    public String serverFullName() {
        return this.serverFullName;
    }
    /**
     * @return The server monitor mode for AS server
     * 
     */
    public Optional<Integer> serverMonitorMode() {
        return Optional.ofNullable(this.serverMonitorMode);
    }
    /**
     * @return The SKU of the Analysis Services resource.
     * 
     */
    public ResourceSkuResponse sku() {
        return this.sku;
    }
    /**
     * @return The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the Analysis Services resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServerAdministratorsResponse asAdministrators;
        private @Nullable String backupBlobContainerUri;
        private @Nullable GatewayDetailsResponse gatewayDetails;
        private String id;
        private @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
        private String location;
        private @Nullable Integer managedMode;
        private String name;
        private String provisioningState;
        private @Nullable String querypoolConnectionMode;
        private String serverFullName;
        private @Nullable Integer serverMonitorMode;
        private ResourceSkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asAdministrators = defaults.asAdministrators;
    	      this.backupBlobContainerUri = defaults.backupBlobContainerUri;
    	      this.gatewayDetails = defaults.gatewayDetails;
    	      this.id = defaults.id;
    	      this.ipV4FirewallSettings = defaults.ipV4FirewallSettings;
    	      this.location = defaults.location;
    	      this.managedMode = defaults.managedMode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.querypoolConnectionMode = defaults.querypoolConnectionMode;
    	      this.serverFullName = defaults.serverFullName;
    	      this.serverMonitorMode = defaults.serverMonitorMode;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder asAdministrators(@Nullable ServerAdministratorsResponse asAdministrators) {
            this.asAdministrators = asAdministrators;
            return this;
        }
        public Builder backupBlobContainerUri(@Nullable String backupBlobContainerUri) {
            this.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }
        public Builder gatewayDetails(@Nullable GatewayDetailsResponse gatewayDetails) {
            this.gatewayDetails = gatewayDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipV4FirewallSettings(@Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings) {
            this.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managedMode(@Nullable Integer managedMode) {
            this.managedMode = managedMode;
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
        public Builder querypoolConnectionMode(@Nullable String querypoolConnectionMode) {
            this.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }
        public Builder serverFullName(String serverFullName) {
            this.serverFullName = Objects.requireNonNull(serverFullName);
            return this;
        }
        public Builder serverMonitorMode(@Nullable Integer serverMonitorMode) {
            this.serverMonitorMode = serverMonitorMode;
            return this;
        }
        public Builder sku(ResourceSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerDetailsResult build() {
            return new GetServerDetailsResult(asAdministrators, backupBlobContainerUri, gatewayDetails, id, ipV4FirewallSettings, location, managedMode, name, provisioningState, querypoolConnectionMode, serverFullName, serverMonitorMode, sku, state, tags, type);
        }
    }
}
