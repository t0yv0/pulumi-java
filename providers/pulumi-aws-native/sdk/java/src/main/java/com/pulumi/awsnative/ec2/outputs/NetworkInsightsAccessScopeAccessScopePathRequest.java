// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopePathStatementRequest;
import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeThroughResourcesStatementRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAccessScopeAccessScopePathRequest {
    private final @Nullable NetworkInsightsAccessScopePathStatementRequest destination;
    private final @Nullable NetworkInsightsAccessScopePathStatementRequest source;
    private final @Nullable List<NetworkInsightsAccessScopeThroughResourcesStatementRequest> throughResources;

    @CustomType.Constructor
    private NetworkInsightsAccessScopeAccessScopePathRequest(
        @CustomType.Parameter("destination") @Nullable NetworkInsightsAccessScopePathStatementRequest destination,
        @CustomType.Parameter("source") @Nullable NetworkInsightsAccessScopePathStatementRequest source,
        @CustomType.Parameter("throughResources") @Nullable List<NetworkInsightsAccessScopeThroughResourcesStatementRequest> throughResources) {
        this.destination = destination;
        this.source = source;
        this.throughResources = throughResources;
    }

    public Optional<NetworkInsightsAccessScopePathStatementRequest> destination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<NetworkInsightsAccessScopePathStatementRequest> source() {
        return Optional.ofNullable(this.source);
    }
    public List<NetworkInsightsAccessScopeThroughResourcesStatementRequest> throughResources() {
        return this.throughResources == null ? List.of() : this.throughResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeAccessScopePathRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAccessScopePathStatementRequest destination;
        private @Nullable NetworkInsightsAccessScopePathStatementRequest source;
        private @Nullable List<NetworkInsightsAccessScopeThroughResourcesStatementRequest> throughResources;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeAccessScopePathRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.source = defaults.source;
    	      this.throughResources = defaults.throughResources;
        }

        public Builder destination(@Nullable NetworkInsightsAccessScopePathStatementRequest destination) {
            this.destination = destination;
            return this;
        }
        public Builder source(@Nullable NetworkInsightsAccessScopePathStatementRequest source) {
            this.source = source;
            return this;
        }
        public Builder throughResources(@Nullable List<NetworkInsightsAccessScopeThroughResourcesStatementRequest> throughResources) {
            this.throughResources = throughResources;
            return this;
        }
        public Builder throughResources(NetworkInsightsAccessScopeThroughResourcesStatementRequest... throughResources) {
            return throughResources(List.of(throughResources));
        }        public NetworkInsightsAccessScopeAccessScopePathRequest build() {
            return new NetworkInsightsAccessScopeAccessScopePathRequest(destination, source, throughResources);
        }
    }
}
