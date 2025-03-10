// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificateAttribute {
    /**
     * @return The create time of the Key Vault Certificate.
     * 
     */
    private final @Nullable String created;
    /**
     * @return whether the Key Vault Certificate is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The expires time of the Key Vault Certificate.
     * 
     */
    private final @Nullable String expires;
    /**
     * @return The not before valid time of the Key Vault Certificate.
     * 
     */
    private final @Nullable String notBefore;
    /**
     * @return The deletion recovery level of the Key Vault Certificate.
     * 
     */
    private final @Nullable String recoveryLevel;
    /**
     * @return The recent update time of the Key Vault Certificate.
     * 
     */
    private final @Nullable String updated;

    @CustomType.Constructor
    private CertifiateCertificateAttribute(
        @CustomType.Parameter("created") @Nullable String created,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("expires") @Nullable String expires,
        @CustomType.Parameter("notBefore") @Nullable String notBefore,
        @CustomType.Parameter("recoveryLevel") @Nullable String recoveryLevel,
        @CustomType.Parameter("updated") @Nullable String updated) {
        this.created = created;
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
        this.recoveryLevel = recoveryLevel;
        this.updated = updated;
    }

    /**
     * @return The create time of the Key Vault Certificate.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return whether the Key Vault Certificate is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The expires time of the Key Vault Certificate.
     * 
     */
    public Optional<String> expires() {
        return Optional.ofNullable(this.expires);
    }
    /**
     * @return The not before valid time of the Key Vault Certificate.
     * 
     */
    public Optional<String> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    /**
     * @return The deletion recovery level of the Key Vault Certificate.
     * 
     */
    public Optional<String> recoveryLevel() {
        return Optional.ofNullable(this.recoveryLevel);
    }
    /**
     * @return The recent update time of the Key Vault Certificate.
     * 
     */
    public Optional<String> updated() {
        return Optional.ofNullable(this.updated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificateAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String created;
        private @Nullable Boolean enabled;
        private @Nullable String expires;
        private @Nullable String notBefore;
        private @Nullable String recoveryLevel;
        private @Nullable String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(CertifiateCertificateAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
    	      this.recoveryLevel = defaults.recoveryLevel;
    	      this.updated = defaults.updated;
        }

        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder expires(@Nullable String expires) {
            this.expires = expires;
            return this;
        }
        public Builder notBefore(@Nullable String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Builder recoveryLevel(@Nullable String recoveryLevel) {
            this.recoveryLevel = recoveryLevel;
            return this;
        }
        public Builder updated(@Nullable String updated) {
            this.updated = updated;
            return this;
        }        public CertifiateCertificateAttribute build() {
            return new CertifiateCertificateAttribute(created, enabled, expires, notBefore, recoveryLevel, updated);
        }
    }
}
