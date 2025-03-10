// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns_v1.outputs.ManagedZoneServiceDirectoryConfigNamespaceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZoneServiceDirectoryConfigResponse {
    private final String kind;
    /**
     * @return Contains information about the namespace associated with the zone.
     * 
     */
    private final ManagedZoneServiceDirectoryConfigNamespaceResponse namespace;

    @CustomType.Constructor
    private ManagedZoneServiceDirectoryConfigResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("namespace") ManagedZoneServiceDirectoryConfigNamespaceResponse namespace) {
        this.kind = kind;
        this.namespace = namespace;
    }

    public String kind() {
        return this.kind;
    }
    /**
     * @return Contains information about the namespace associated with the zone.
     * 
     */
    public ManagedZoneServiceDirectoryConfigNamespaceResponse namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private ManagedZoneServiceDirectoryConfigNamespaceResponse namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.namespace = defaults.namespace;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceResponse namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public ManagedZoneServiceDirectoryConfigResponse build() {
            return new ManagedZoneServiceDirectoryConfigResponse(kind, namespace);
        }
    }
}
