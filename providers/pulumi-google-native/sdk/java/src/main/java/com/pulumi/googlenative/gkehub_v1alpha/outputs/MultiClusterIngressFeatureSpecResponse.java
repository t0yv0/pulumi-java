// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MultiClusterIngressFeatureSpecResponse {
    /**
     * @return Deprecated: This field will be ignored and should not be set. Customer&#39;s billing structure.
     * 
     * @deprecated
     * Deprecated: This field will be ignored and should not be set. Customer&#39;s billing structure.
     * 
     */
    @Deprecated /* Deprecated: This field will be ignored and should not be set. Customer's billing structure. */
    private final String billing;
    /**
     * @return Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    private final String configMembership;

    @CustomType.Constructor
    private MultiClusterIngressFeatureSpecResponse(
        @CustomType.Parameter("billing") String billing,
        @CustomType.Parameter("configMembership") String configMembership) {
        this.billing = billing;
        this.configMembership = configMembership;
    }

    /**
     * @return Deprecated: This field will be ignored and should not be set. Customer&#39;s billing structure.
     * 
     * @deprecated
     * Deprecated: This field will be ignored and should not be set. Customer&#39;s billing structure.
     * 
     */
    @Deprecated /* Deprecated: This field will be ignored and should not be set. Customer's billing structure. */
    public String billing() {
        return this.billing;
    }
    /**
     * @return Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    public String configMembership() {
        return this.configMembership;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterIngressFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billing;
        private String configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterIngressFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billing = defaults.billing;
    	      this.configMembership = defaults.configMembership;
        }

        public Builder billing(String billing) {
            this.billing = Objects.requireNonNull(billing);
            return this;
        }
        public Builder configMembership(String configMembership) {
            this.configMembership = Objects.requireNonNull(configMembership);
            return this;
        }        public MultiClusterIngressFeatureSpecResponse build() {
            return new MultiClusterIngressFeatureSpecResponse(billing, configMembership);
        }
    }
}
