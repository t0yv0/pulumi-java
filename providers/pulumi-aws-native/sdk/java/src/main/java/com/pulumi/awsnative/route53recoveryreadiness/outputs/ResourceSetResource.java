// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.outputs;

import com.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetDNSTargetResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetResource {
    /**
     * @return The component identifier of the resource, generated when DNS target resource is used.
     * 
     */
    private final @Nullable String componentId;
    private final @Nullable ResourceSetDNSTargetResource dnsTargetResource;
    /**
     * @return A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * 
     */
    private final @Nullable List<String> readinessScopes;
    /**
     * @return The Amazon Resource Name (ARN) of the AWS resource.
     * 
     */
    private final @Nullable String resourceArn;

    @CustomType.Constructor
    private ResourceSetResource(
        @CustomType.Parameter("componentId") @Nullable String componentId,
        @CustomType.Parameter("dnsTargetResource") @Nullable ResourceSetDNSTargetResource dnsTargetResource,
        @CustomType.Parameter("readinessScopes") @Nullable List<String> readinessScopes,
        @CustomType.Parameter("resourceArn") @Nullable String resourceArn) {
        this.componentId = componentId;
        this.dnsTargetResource = dnsTargetResource;
        this.readinessScopes = readinessScopes;
        this.resourceArn = resourceArn;
    }

    /**
     * @return The component identifier of the resource, generated when DNS target resource is used.
     * 
     */
    public Optional<String> componentId() {
        return Optional.ofNullable(this.componentId);
    }
    public Optional<ResourceSetDNSTargetResource> dnsTargetResource() {
        return Optional.ofNullable(this.dnsTargetResource);
    }
    /**
     * @return A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * 
     */
    public List<String> readinessScopes() {
        return this.readinessScopes == null ? List.of() : this.readinessScopes;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the AWS resource.
     * 
     */
    public Optional<String> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentId;
        private @Nullable ResourceSetDNSTargetResource dnsTargetResource;
        private @Nullable List<String> readinessScopes;
        private @Nullable String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.dnsTargetResource = defaults.dnsTargetResource;
    	      this.readinessScopes = defaults.readinessScopes;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder componentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }
        public Builder dnsTargetResource(@Nullable ResourceSetDNSTargetResource dnsTargetResource) {
            this.dnsTargetResource = dnsTargetResource;
            return this;
        }
        public Builder readinessScopes(@Nullable List<String> readinessScopes) {
            this.readinessScopes = readinessScopes;
            return this;
        }
        public Builder readinessScopes(String... readinessScopes) {
            return readinessScopes(List.of(readinessScopes));
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }        public ResourceSetResource build() {
            return new ResourceSetResource(componentId, dnsTargetResource, readinessScopes, resourceArn);
        }
    }
}
