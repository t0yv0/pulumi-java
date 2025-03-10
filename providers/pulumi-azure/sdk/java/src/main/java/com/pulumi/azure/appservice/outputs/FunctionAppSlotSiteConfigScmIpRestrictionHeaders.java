// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionAppSlotSiteConfigScmIpRestrictionHeaders {
    /**
     * @return A list of allowed Azure FrontDoor IDs in UUID notation with a maximum of 8.
     * 
     */
    private final @Nullable List<String> xAzureFdids;
    /**
     * @return A list to allow the Azure FrontDoor health probe header. Only allowed value is &#34;1&#34;.
     * 
     */
    private final @Nullable String xFdHealthProbe;
    /**
     * @return A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation with a maximum of 8
     * 
     */
    private final @Nullable List<String> xForwardedFors;
    /**
     * @return A list of allowed &#39;X-Forwarded-Host&#39; domains with a maximum of 8.
     * 
     */
    private final @Nullable List<String> xForwardedHosts;

    @CustomType.Constructor
    private FunctionAppSlotSiteConfigScmIpRestrictionHeaders(
        @CustomType.Parameter("xAzureFdids") @Nullable List<String> xAzureFdids,
        @CustomType.Parameter("xFdHealthProbe") @Nullable String xFdHealthProbe,
        @CustomType.Parameter("xForwardedFors") @Nullable List<String> xForwardedFors,
        @CustomType.Parameter("xForwardedHosts") @Nullable List<String> xForwardedHosts) {
        this.xAzureFdids = xAzureFdids;
        this.xFdHealthProbe = xFdHealthProbe;
        this.xForwardedFors = xForwardedFors;
        this.xForwardedHosts = xForwardedHosts;
    }

    /**
     * @return A list of allowed Azure FrontDoor IDs in UUID notation with a maximum of 8.
     * 
     */
    public List<String> xAzureFdids() {
        return this.xAzureFdids == null ? List.of() : this.xAzureFdids;
    }
    /**
     * @return A list to allow the Azure FrontDoor health probe header. Only allowed value is &#34;1&#34;.
     * 
     */
    public Optional<String> xFdHealthProbe() {
        return Optional.ofNullable(this.xFdHealthProbe);
    }
    /**
     * @return A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation with a maximum of 8
     * 
     */
    public List<String> xForwardedFors() {
        return this.xForwardedFors == null ? List.of() : this.xForwardedFors;
    }
    /**
     * @return A list of allowed &#39;X-Forwarded-Host&#39; domains with a maximum of 8.
     * 
     */
    public List<String> xForwardedHosts() {
        return this.xForwardedHosts == null ? List.of() : this.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionAppSlotSiteConfigScmIpRestrictionHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> xAzureFdids;
        private @Nullable String xFdHealthProbe;
        private @Nullable List<String> xForwardedFors;
        private @Nullable List<String> xForwardedHosts;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionAppSlotSiteConfigScmIpRestrictionHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xAzureFdids = defaults.xAzureFdids;
    	      this.xFdHealthProbe = defaults.xFdHealthProbe;
    	      this.xForwardedFors = defaults.xForwardedFors;
    	      this.xForwardedHosts = defaults.xForwardedHosts;
        }

        public Builder xAzureFdids(@Nullable List<String> xAzureFdids) {
            this.xAzureFdids = xAzureFdids;
            return this;
        }
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }
        public Builder xFdHealthProbe(@Nullable String xFdHealthProbe) {
            this.xFdHealthProbe = xFdHealthProbe;
            return this;
        }
        public Builder xForwardedFors(@Nullable List<String> xForwardedFors) {
            this.xForwardedFors = xForwardedFors;
            return this;
        }
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }
        public Builder xForwardedHosts(@Nullable List<String> xForwardedHosts) {
            this.xForwardedHosts = xForwardedHosts;
            return this;
        }
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }        public FunctionAppSlotSiteConfigScmIpRestrictionHeaders build() {
            return new FunctionAppSlotSiteConfigScmIpRestrictionHeaders(xAzureFdids, xFdHealthProbe, xForwardedFors, xForwardedHosts);
        }
    }
}
