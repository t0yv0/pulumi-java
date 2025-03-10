// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.ClientIPConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SessionAffinityConfig {
    /**
     * @return clientIP contains the configurations of Client IP based session affinity.
     * 
     */
    private final @Nullable ClientIPConfig clientIP;

    @CustomType.Constructor
    private SessionAffinityConfig(@CustomType.Parameter("clientIP") @Nullable ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

    /**
     * @return clientIP contains the configurations of Client IP based session affinity.
     * 
     */
    public Optional<ClientIPConfig> clientIP() {
        return Optional.ofNullable(this.clientIP);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionAffinityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClientIPConfig clientIP;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionAffinityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIP = defaults.clientIP;
        }

        public Builder clientIP(@Nullable ClientIPConfig clientIP) {
            this.clientIP = clientIP;
            return this;
        }        public SessionAffinityConfig build() {
            return new SessionAffinityConfig(clientIP);
        }
    }
}
