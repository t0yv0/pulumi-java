// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ARecordResponse {
    /**
     * @return The IPv4 address of this A record.
     * 
     */
    private final @Nullable String ipv4Address;

    @CustomType.Constructor
    private ARecordResponse(@CustomType.Parameter("ipv4Address") @Nullable String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * @return The IPv4 address of this A record.
     * 
     */
    public Optional<String> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ARecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(ARecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }        public ARecordResponse build() {
            return new ARecordResponse(ipv4Address);
        }
    }
}
