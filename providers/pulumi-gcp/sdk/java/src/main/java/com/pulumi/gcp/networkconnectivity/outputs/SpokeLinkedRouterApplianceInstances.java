// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkconnectivity.outputs.SpokeLinkedRouterApplianceInstancesInstance;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SpokeLinkedRouterApplianceInstances {
    /**
     * @return The list of router appliance instances
     * 
     */
    private final List<SpokeLinkedRouterApplianceInstancesInstance> instances;
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    private final Boolean siteToSiteDataTransfer;

    @CustomType.Constructor
    private SpokeLinkedRouterApplianceInstances(
        @CustomType.Parameter("instances") List<SpokeLinkedRouterApplianceInstancesInstance> instances,
        @CustomType.Parameter("siteToSiteDataTransfer") Boolean siteToSiteDataTransfer) {
        this.instances = instances;
        this.siteToSiteDataTransfer = siteToSiteDataTransfer;
    }

    /**
     * @return The list of router appliance instances
     * 
     */
    public List<SpokeLinkedRouterApplianceInstancesInstance> instances() {
        return this.instances;
    }
    /**
     * @return A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    public Boolean siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstances defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SpokeLinkedRouterApplianceInstancesInstance> instances;
        private Boolean siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder instances(List<SpokeLinkedRouterApplianceInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(SpokeLinkedRouterApplianceInstancesInstance... instances) {
            return instances(List.of(instances));
        }
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }        public SpokeLinkedRouterApplianceInstances build() {
            return new SpokeLinkedRouterApplianceInstances(instances, siteToSiteDataTransfer);
        }
    }
}
