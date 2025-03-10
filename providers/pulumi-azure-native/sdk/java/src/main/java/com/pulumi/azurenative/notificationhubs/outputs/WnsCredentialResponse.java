// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WnsCredentialResponse {
    /**
     * @return The package ID for this credential.
     * 
     */
    private final @Nullable String packageSid;
    /**
     * @return The secret key.
     * 
     */
    private final @Nullable String secretKey;
    /**
     * @return The Windows Live endpoint.
     * 
     */
    private final @Nullable String windowsLiveEndpoint;

    @CustomType.Constructor
    private WnsCredentialResponse(
        @CustomType.Parameter("packageSid") @Nullable String packageSid,
        @CustomType.Parameter("secretKey") @Nullable String secretKey,
        @CustomType.Parameter("windowsLiveEndpoint") @Nullable String windowsLiveEndpoint) {
        this.packageSid = packageSid;
        this.secretKey = secretKey;
        this.windowsLiveEndpoint = windowsLiveEndpoint;
    }

    /**
     * @return The package ID for this credential.
     * 
     */
    public Optional<String> packageSid() {
        return Optional.ofNullable(this.packageSid);
    }
    /**
     * @return The secret key.
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return The Windows Live endpoint.
     * 
     */
    public Optional<String> windowsLiveEndpoint() {
        return Optional.ofNullable(this.windowsLiveEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WnsCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String packageSid;
        private @Nullable String secretKey;
        private @Nullable String windowsLiveEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WnsCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageSid = defaults.packageSid;
    	      this.secretKey = defaults.secretKey;
    	      this.windowsLiveEndpoint = defaults.windowsLiveEndpoint;
        }

        public Builder packageSid(@Nullable String packageSid) {
            this.packageSid = packageSid;
            return this;
        }
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public Builder windowsLiveEndpoint(@Nullable String windowsLiveEndpoint) {
            this.windowsLiveEndpoint = windowsLiveEndpoint;
            return this;
        }        public WnsCredentialResponse build() {
            return new WnsCredentialResponse(packageSid, secretKey, windowsLiveEndpoint);
        }
    }
}
