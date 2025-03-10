// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePolicySnapshotSchedulePolicySnapshotProperties {
    /**
     * @return Whether to perform a &#39;guest aware&#39; snapshot.
     * 
     */
    private final @Nullable Boolean guestFlush;
    /**
     * @return A set of key-value pairs.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * @return Cloud Storage bucket location to store the auto snapshot
     * (regional or multi-regional)
     * 
     */
    private final @Nullable String storageLocations;

    @CustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicySnapshotProperties(
        @CustomType.Parameter("guestFlush") @Nullable Boolean guestFlush,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("storageLocations") @Nullable String storageLocations) {
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    /**
     * @return Whether to perform a &#39;guest aware&#39; snapshot.
     * 
     */
    public Optional<Boolean> guestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }
    /**
     * @return A set of key-value pairs.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Cloud Storage bucket location to store the auto snapshot
     * (regional or multi-regional)
     * 
     */
    public Optional<String> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean guestFlush;
        private @Nullable Map<String,String> labels;
        private @Nullable String storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder guestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder storageLocations(@Nullable String storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }        public ResourcePolicySnapshotSchedulePolicySnapshotProperties build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotProperties(guestFlush, labels, storageLocations);
        }
    }
}
