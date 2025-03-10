// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainsArgs Empty = new GetDomainsArgs();

    /**
     * Set to `true` to only return domains whose DNS is managed by Microsoft 365. Defaults to `false`.
     * 
     */
    @Import(name="adminManaged")
    private @Nullable Boolean adminManaged;

    /**
     * @return Set to `true` to only return domains whose DNS is managed by Microsoft 365. Defaults to `false`.
     * 
     */
    public Optional<Boolean> adminManaged() {
        return Optional.ofNullable(this.adminManaged);
    }

    /**
     * Set to `true` if unverified Azure AD domains should be included. Defaults to `false`.
     * 
     */
    @Import(name="includeUnverified")
    private @Nullable Boolean includeUnverified;

    /**
     * @return Set to `true` if unverified Azure AD domains should be included. Defaults to `false`.
     * 
     */
    public Optional<Boolean> includeUnverified() {
        return Optional.ofNullable(this.includeUnverified);
    }

    /**
     * Set to `true` to only return the default domain.
     * 
     */
    @Import(name="onlyDefault")
    private @Nullable Boolean onlyDefault;

    /**
     * @return Set to `true` to only return the default domain.
     * 
     */
    public Optional<Boolean> onlyDefault() {
        return Optional.ofNullable(this.onlyDefault);
    }

    /**
     * Set to `true` to only return the initial domain, which is your primary Azure Active Directory tenant domain. Defaults to `false`.
     * 
     */
    @Import(name="onlyInitial")
    private @Nullable Boolean onlyInitial;

    /**
     * @return Set to `true` to only return the initial domain, which is your primary Azure Active Directory tenant domain. Defaults to `false`.
     * 
     */
    public Optional<Boolean> onlyInitial() {
        return Optional.ofNullable(this.onlyInitial);
    }

    /**
     * Set to `true` to only return verified root domains. Excludes subdomains and unverified domains.
     * 
     */
    @Import(name="onlyRoot")
    private @Nullable Boolean onlyRoot;

    /**
     * @return Set to `true` to only return verified root domains. Excludes subdomains and unverified domains.
     * 
     */
    public Optional<Boolean> onlyRoot() {
        return Optional.ofNullable(this.onlyRoot);
    }

    /**
     * A list of supported services that must be supported by a domain. Possible values include `Email`, `Sharepoint`, `EmailInternalRelayOnly`, `OfficeCommunicationsOnline`, `SharePointDefaultDomain`, `FullRedelegation`, `SharePointPublic`, `OrgIdAuthentication`, `Yammer` and `Intune`.
     * 
     */
    @Import(name="supportsServices")
    private @Nullable List<String> supportsServices;

    /**
     * @return A list of supported services that must be supported by a domain. Possible values include `Email`, `Sharepoint`, `EmailInternalRelayOnly`, `OfficeCommunicationsOnline`, `SharePointDefaultDomain`, `FullRedelegation`, `SharePointPublic`, `OrgIdAuthentication`, `Yammer` and `Intune`.
     * 
     */
    public Optional<List<String>> supportsServices() {
        return Optional.ofNullable(this.supportsServices);
    }

    private GetDomainsArgs() {}

    private GetDomainsArgs(GetDomainsArgs $) {
        this.adminManaged = $.adminManaged;
        this.includeUnverified = $.includeUnverified;
        this.onlyDefault = $.onlyDefault;
        this.onlyInitial = $.onlyInitial;
        this.onlyRoot = $.onlyRoot;
        this.supportsServices = $.supportsServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainsArgs $;

        public Builder() {
            $ = new GetDomainsArgs();
        }

        public Builder(GetDomainsArgs defaults) {
            $ = new GetDomainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminManaged Set to `true` to only return domains whose DNS is managed by Microsoft 365. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder adminManaged(@Nullable Boolean adminManaged) {
            $.adminManaged = adminManaged;
            return this;
        }

        /**
         * @param includeUnverified Set to `true` if unverified Azure AD domains should be included. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeUnverified(@Nullable Boolean includeUnverified) {
            $.includeUnverified = includeUnverified;
            return this;
        }

        /**
         * @param onlyDefault Set to `true` to only return the default domain.
         * 
         * @return builder
         * 
         */
        public Builder onlyDefault(@Nullable Boolean onlyDefault) {
            $.onlyDefault = onlyDefault;
            return this;
        }

        /**
         * @param onlyInitial Set to `true` to only return the initial domain, which is your primary Azure Active Directory tenant domain. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder onlyInitial(@Nullable Boolean onlyInitial) {
            $.onlyInitial = onlyInitial;
            return this;
        }

        /**
         * @param onlyRoot Set to `true` to only return verified root domains. Excludes subdomains and unverified domains.
         * 
         * @return builder
         * 
         */
        public Builder onlyRoot(@Nullable Boolean onlyRoot) {
            $.onlyRoot = onlyRoot;
            return this;
        }

        /**
         * @param supportsServices A list of supported services that must be supported by a domain. Possible values include `Email`, `Sharepoint`, `EmailInternalRelayOnly`, `OfficeCommunicationsOnline`, `SharePointDefaultDomain`, `FullRedelegation`, `SharePointPublic`, `OrgIdAuthentication`, `Yammer` and `Intune`.
         * 
         * @return builder
         * 
         */
        public Builder supportsServices(@Nullable List<String> supportsServices) {
            $.supportsServices = supportsServices;
            return this;
        }

        /**
         * @param supportsServices A list of supported services that must be supported by a domain. Possible values include `Email`, `Sharepoint`, `EmailInternalRelayOnly`, `OfficeCommunicationsOnline`, `SharePointDefaultDomain`, `FullRedelegation`, `SharePointPublic`, `OrgIdAuthentication`, `Yammer` and `Intune`.
         * 
         * @return builder
         * 
         */
        public Builder supportsServices(String... supportsServices) {
            return supportsServices(List.of(supportsServices));
        }

        public GetDomainsArgs build() {
            return $;
        }
    }

}
