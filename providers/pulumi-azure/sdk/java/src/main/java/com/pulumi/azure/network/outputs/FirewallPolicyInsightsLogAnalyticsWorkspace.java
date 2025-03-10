// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyInsightsLogAnalyticsWorkspace {
    /**
     * @return The location of the Firewalls, that when matches this Log Analytics Workspace will be used to consume their logs.
     * 
     */
    private final String firewallLocation;
    /**
     * @return The ID of the Log Analytics Workspace that the Firewalls associated with this Firewall Policy will send their logs to when their locations match the `firewall_location`.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private FirewallPolicyInsightsLogAnalyticsWorkspace(
        @CustomType.Parameter("firewallLocation") String firewallLocation,
        @CustomType.Parameter("id") String id) {
        this.firewallLocation = firewallLocation;
        this.id = id;
    }

    /**
     * @return The location of the Firewalls, that when matches this Log Analytics Workspace will be used to consume their logs.
     * 
     */
    public String firewallLocation() {
        return this.firewallLocation;
    }
    /**
     * @return The ID of the Log Analytics Workspace that the Firewalls associated with this Firewall Policy will send their logs to when their locations match the `firewall_location`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyInsightsLogAnalyticsWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallLocation;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyInsightsLogAnalyticsWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallLocation = defaults.firewallLocation;
    	      this.id = defaults.id;
        }

        public Builder firewallLocation(String firewallLocation) {
            this.firewallLocation = Objects.requireNonNull(firewallLocation);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public FirewallPolicyInsightsLogAnalyticsWorkspace build() {
            return new FirewallPolicyInsightsLogAnalyticsWorkspace(firewallLocation, id);
        }
    }
}
