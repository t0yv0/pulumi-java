// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.awsnative.msk.outputs.ClusterPublicAccess;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterConnectivityInfo {
    private final @Nullable ClusterPublicAccess publicAccess;

    @CustomType.Constructor
    private ClusterConnectivityInfo(@CustomType.Parameter("publicAccess") @Nullable ClusterPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    public Optional<ClusterPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConnectivityInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterPublicAccess publicAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConnectivityInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicAccess = defaults.publicAccess;
        }

        public Builder publicAccess(@Nullable ClusterPublicAccess publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }        public ClusterConnectivityInfo build() {
            return new ClusterConnectivityInfo(publicAccess);
        }
    }
}
