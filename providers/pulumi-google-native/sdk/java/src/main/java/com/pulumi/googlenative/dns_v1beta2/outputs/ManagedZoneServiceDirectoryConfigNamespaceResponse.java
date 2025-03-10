// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZoneServiceDirectoryConfigNamespaceResponse {
    /**
     * @return The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
     * 
     */
    private final String deletionTime;
    private final String kind;
    /**
     * @return The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
     * 
     */
    private final String namespaceUrl;

    @CustomType.Constructor
    private ManagedZoneServiceDirectoryConfigNamespaceResponse(
        @CustomType.Parameter("deletionTime") String deletionTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("namespaceUrl") String namespaceUrl) {
        this.deletionTime = deletionTime;
        this.kind = kind;
        this.namespaceUrl = namespaceUrl;
    }

    /**
     * @return The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
     * 
     */
    public String deletionTime() {
        return this.deletionTime;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
     * 
     */
    public String namespaceUrl() {
        return this.namespaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deletionTime;
        private String kind;
        private String namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionTime = defaults.deletionTime;
    	      this.kind = defaults.kind;
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder deletionTime(String deletionTime) {
            this.deletionTime = Objects.requireNonNull(deletionTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder namespaceUrl(String namespaceUrl) {
            this.namespaceUrl = Objects.requireNonNull(namespaceUrl);
            return this;
        }        public ManagedZoneServiceDirectoryConfigNamespaceResponse build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceResponse(deletionTime, kind, namespaceUrl);
        }
    }
}
