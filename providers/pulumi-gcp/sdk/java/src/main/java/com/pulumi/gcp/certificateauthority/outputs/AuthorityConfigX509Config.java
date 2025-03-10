// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigAdditionalExtension;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigCaOptions;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigKeyUsage;
import com.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigPolicyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigX509Config {
    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AuthorityConfigX509ConfigAdditionalExtension> additionalExtensions;
    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    private final @Nullable List<String> aiaOcspServers;
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509ConfigCaOptions caOptions;
    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509ConfigKeyUsage keyUsage;
    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AuthorityConfigX509ConfigPolicyId> policyIds;

    @CustomType.Constructor
    private AuthorityConfigX509Config(
        @CustomType.Parameter("additionalExtensions") @Nullable List<AuthorityConfigX509ConfigAdditionalExtension> additionalExtensions,
        @CustomType.Parameter("aiaOcspServers") @Nullable List<String> aiaOcspServers,
        @CustomType.Parameter("caOptions") AuthorityConfigX509ConfigCaOptions caOptions,
        @CustomType.Parameter("keyUsage") AuthorityConfigX509ConfigKeyUsage keyUsage,
        @CustomType.Parameter("policyIds") @Nullable List<AuthorityConfigX509ConfigPolicyId> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    public List<AuthorityConfigX509ConfigAdditionalExtension> additionalExtensions() {
        return this.additionalExtensions == null ? List.of() : this.additionalExtensions;
    }
    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaOcspServers() {
        return this.aiaOcspServers == null ? List.of() : this.aiaOcspServers;
    }
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public AuthorityConfigX509ConfigCaOptions caOptions() {
        return this.caOptions;
    }
    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public AuthorityConfigX509ConfigKeyUsage keyUsage() {
        return this.keyUsage;
    }
    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public List<AuthorityConfigX509ConfigPolicyId> policyIds() {
        return this.policyIds == null ? List.of() : this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AuthorityConfigX509ConfigAdditionalExtension> additionalExtensions;
        private @Nullable List<String> aiaOcspServers;
        private AuthorityConfigX509ConfigCaOptions caOptions;
        private AuthorityConfigX509ConfigKeyUsage keyUsage;
        private @Nullable List<AuthorityConfigX509ConfigPolicyId> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable List<AuthorityConfigX509ConfigAdditionalExtension> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(AuthorityConfigX509ConfigAdditionalExtension... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(AuthorityConfigX509ConfigCaOptions caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }
        public Builder keyUsage(AuthorityConfigX509ConfigKeyUsage keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }
        public Builder policyIds(@Nullable List<AuthorityConfigX509ConfigPolicyId> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(AuthorityConfigX509ConfigPolicyId... policyIds) {
            return policyIds(List.of(policyIds));
        }        public AuthorityConfigX509Config build() {
            return new AuthorityConfigX509Config(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
