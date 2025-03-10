// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIPAMAllocationResult {
    /**
     * @return Id of the allocation.
     * 
     */
    private final @Nullable String ipamPoolAllocationId;

    @CustomType.Constructor
    private GetIPAMAllocationResult(@CustomType.Parameter("ipamPoolAllocationId") @Nullable String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
    }

    /**
     * @return Id of the allocation.
     * 
     */
    public Optional<String> ipamPoolAllocationId() {
        return Optional.ofNullable(this.ipamPoolAllocationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMAllocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipamPoolAllocationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMAllocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipamPoolAllocationId = defaults.ipamPoolAllocationId;
        }

        public Builder ipamPoolAllocationId(@Nullable String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }        public GetIPAMAllocationResult build() {
            return new GetIPAMAllocationResult(ipamPoolAllocationId);
        }
    }
}
