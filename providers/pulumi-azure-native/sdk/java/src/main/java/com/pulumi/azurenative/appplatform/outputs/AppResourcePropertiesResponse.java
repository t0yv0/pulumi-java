// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.PersistentDiskResponse;
import com.pulumi.azurenative.appplatform.outputs.TemporaryDiskResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppResourcePropertiesResponse {
    /**
     * @return Name of the active deployment of the App
     * 
     */
    private final @Nullable String activeDeploymentName;
    /**
     * @return Date time when the resource is created
     * 
     */
    private final String createdTime;
    /**
     * @return Fully qualified dns Name.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * @return Indicate if only https is allowed.
     * 
     */
    private final @Nullable Boolean httpsOnly;
    /**
     * @return Persistent disk settings
     * 
     */
    private final @Nullable PersistentDiskResponse persistentDisk;
    /**
     * @return Provisioning state of the App
     * 
     */
    private final String provisioningState;
    /**
     * @return Indicates whether the App exposes public endpoint
     * 
     */
    private final @Nullable Boolean public_;
    /**
     * @return Temporary disk settings
     * 
     */
    private final @Nullable TemporaryDiskResponse temporaryDisk;
    /**
     * @return URL of the App
     * 
     */
    private final String url;

    @CustomType.Constructor
    private AppResourcePropertiesResponse(
        @CustomType.Parameter("activeDeploymentName") @Nullable String activeDeploymentName,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("fqdn") @Nullable String fqdn,
        @CustomType.Parameter("httpsOnly") @Nullable Boolean httpsOnly,
        @CustomType.Parameter("persistentDisk") @Nullable PersistentDiskResponse persistentDisk,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("public") @Nullable Boolean public_,
        @CustomType.Parameter("temporaryDisk") @Nullable TemporaryDiskResponse temporaryDisk,
        @CustomType.Parameter("url") String url) {
        this.activeDeploymentName = activeDeploymentName;
        this.createdTime = createdTime;
        this.fqdn = fqdn;
        this.httpsOnly = httpsOnly;
        this.persistentDisk = persistentDisk;
        this.provisioningState = provisioningState;
        this.public_ = public_;
        this.temporaryDisk = temporaryDisk;
        this.url = url;
    }

    /**
     * @return Name of the active deployment of the App
     * 
     */
    public Optional<String> activeDeploymentName() {
        return Optional.ofNullable(this.activeDeploymentName);
    }
    /**
     * @return Date time when the resource is created
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return Fully qualified dns Name.
     * 
     */
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * @return Indicate if only https is allowed.
     * 
     */
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * @return Persistent disk settings
     * 
     */
    public Optional<PersistentDiskResponse> persistentDisk() {
        return Optional.ofNullable(this.persistentDisk);
    }
    /**
     * @return Provisioning state of the App
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Indicates whether the App exposes public endpoint
     * 
     */
    public Optional<Boolean> public_() {
        return Optional.ofNullable(this.public_);
    }
    /**
     * @return Temporary disk settings
     * 
     */
    public Optional<TemporaryDiskResponse> temporaryDisk() {
        return Optional.ofNullable(this.temporaryDisk);
    }
    /**
     * @return URL of the App
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDeploymentName;
        private String createdTime;
        private @Nullable String fqdn;
        private @Nullable Boolean httpsOnly;
        private @Nullable PersistentDiskResponse persistentDisk;
        private String provisioningState;
        private @Nullable Boolean public_;
        private @Nullable TemporaryDiskResponse temporaryDisk;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(AppResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeploymentName = defaults.activeDeploymentName;
    	      this.createdTime = defaults.createdTime;
    	      this.fqdn = defaults.fqdn;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.persistentDisk = defaults.persistentDisk;
    	      this.provisioningState = defaults.provisioningState;
    	      this.public_ = defaults.public_;
    	      this.temporaryDisk = defaults.temporaryDisk;
    	      this.url = defaults.url;
        }

        public Builder activeDeploymentName(@Nullable String activeDeploymentName) {
            this.activeDeploymentName = activeDeploymentName;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder persistentDisk(@Nullable PersistentDiskResponse persistentDisk) {
            this.persistentDisk = persistentDisk;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder public_(@Nullable Boolean public_) {
            this.public_ = public_;
            return this;
        }
        public Builder temporaryDisk(@Nullable TemporaryDiskResponse temporaryDisk) {
            this.temporaryDisk = temporaryDisk;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public AppResourcePropertiesResponse build() {
            return new AppResourcePropertiesResponse(activeDeploymentName, createdTime, fqdn, httpsOnly, persistentDisk, provisioningState, public_, temporaryDisk, url);
        }
    }
}
