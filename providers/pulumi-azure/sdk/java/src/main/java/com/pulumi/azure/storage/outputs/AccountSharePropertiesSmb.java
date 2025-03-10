// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccountSharePropertiesSmb {
    /**
     * @return A set of SMB authentication methods. Possible values are `NTLMv2`, and `Kerberos`.
     * 
     */
    private final @Nullable List<String> authenticationTypes;
    /**
     * @return A set of SMB channel encryption. Possible values are `AES-128-CCM`, `AES-128-GCM`, and `AES-256-GCM`.
     * 
     */
    private final @Nullable List<String> channelEncryptionTypes;
    /**
     * @return A set of Kerberos ticket encryption. Possible values are `RC4-HMAC`, and `AES-256`.
     * 
     */
    private final @Nullable List<String> kerberosTicketEncryptionTypes;
    /**
     * @return A set of SMB protocol versions. Possible values are `SMB2.1`, `SMB3.0`, and `SMB3.1.1`.
     * 
     */
    private final @Nullable List<String> versions;

    @CustomType.Constructor
    private AccountSharePropertiesSmb(
        @CustomType.Parameter("authenticationTypes") @Nullable List<String> authenticationTypes,
        @CustomType.Parameter("channelEncryptionTypes") @Nullable List<String> channelEncryptionTypes,
        @CustomType.Parameter("kerberosTicketEncryptionTypes") @Nullable List<String> kerberosTicketEncryptionTypes,
        @CustomType.Parameter("versions") @Nullable List<String> versions) {
        this.authenticationTypes = authenticationTypes;
        this.channelEncryptionTypes = channelEncryptionTypes;
        this.kerberosTicketEncryptionTypes = kerberosTicketEncryptionTypes;
        this.versions = versions;
    }

    /**
     * @return A set of SMB authentication methods. Possible values are `NTLMv2`, and `Kerberos`.
     * 
     */
    public List<String> authenticationTypes() {
        return this.authenticationTypes == null ? List.of() : this.authenticationTypes;
    }
    /**
     * @return A set of SMB channel encryption. Possible values are `AES-128-CCM`, `AES-128-GCM`, and `AES-256-GCM`.
     * 
     */
    public List<String> channelEncryptionTypes() {
        return this.channelEncryptionTypes == null ? List.of() : this.channelEncryptionTypes;
    }
    /**
     * @return A set of Kerberos ticket encryption. Possible values are `RC4-HMAC`, and `AES-256`.
     * 
     */
    public List<String> kerberosTicketEncryptionTypes() {
        return this.kerberosTicketEncryptionTypes == null ? List.of() : this.kerberosTicketEncryptionTypes;
    }
    /**
     * @return A set of SMB protocol versions. Possible values are `SMB2.1`, `SMB3.0`, and `SMB3.1.1`.
     * 
     */
    public List<String> versions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountSharePropertiesSmb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authenticationTypes;
        private @Nullable List<String> channelEncryptionTypes;
        private @Nullable List<String> kerberosTicketEncryptionTypes;
        private @Nullable List<String> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountSharePropertiesSmb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationTypes = defaults.authenticationTypes;
    	      this.channelEncryptionTypes = defaults.channelEncryptionTypes;
    	      this.kerberosTicketEncryptionTypes = defaults.kerberosTicketEncryptionTypes;
    	      this.versions = defaults.versions;
        }

        public Builder authenticationTypes(@Nullable List<String> authenticationTypes) {
            this.authenticationTypes = authenticationTypes;
            return this;
        }
        public Builder authenticationTypes(String... authenticationTypes) {
            return authenticationTypes(List.of(authenticationTypes));
        }
        public Builder channelEncryptionTypes(@Nullable List<String> channelEncryptionTypes) {
            this.channelEncryptionTypes = channelEncryptionTypes;
            return this;
        }
        public Builder channelEncryptionTypes(String... channelEncryptionTypes) {
            return channelEncryptionTypes(List.of(channelEncryptionTypes));
        }
        public Builder kerberosTicketEncryptionTypes(@Nullable List<String> kerberosTicketEncryptionTypes) {
            this.kerberosTicketEncryptionTypes = kerberosTicketEncryptionTypes;
            return this;
        }
        public Builder kerberosTicketEncryptionTypes(String... kerberosTicketEncryptionTypes) {
            return kerberosTicketEncryptionTypes(List.of(kerberosTicketEncryptionTypes));
        }
        public Builder versions(@Nullable List<String> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(String... versions) {
            return versions(List.of(versions));
        }        public AccountSharePropertiesSmb build() {
            return new AccountSharePropertiesSmb(authenticationTypes, channelEncryptionTypes, kerberosTicketEncryptionTypes, versions);
        }
    }
}
