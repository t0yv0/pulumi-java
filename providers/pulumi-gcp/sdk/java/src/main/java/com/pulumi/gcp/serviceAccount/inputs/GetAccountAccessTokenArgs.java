// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountAccessTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountAccessTokenArgs Empty = new GetAccountAccessTokenArgs();

    /**
     * Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.  (e.g. `[&#34;projects/-/serviceAccounts/delegate-svc-account@project-id.iam.gserviceaccount.com&#34;]`)
     * 
     */
    @Import(name="delegates")
    private @Nullable List<String> delegates;

    /**
     * @return Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.  (e.g. `[&#34;projects/-/serviceAccounts/delegate-svc-account@project-id.iam.gserviceaccount.com&#34;]`)
     * 
     */
    public Optional<List<String>> delegates() {
        return Optional.ofNullable(this.delegates);
    }

    /**
     * Lifetime of the impersonated token (defaults to its max: `3600s`).
     * 
     */
    @Import(name="lifetime")
    private @Nullable String lifetime;

    /**
     * @return Lifetime of the impersonated token (defaults to its max: `3600s`).
     * 
     */
    public Optional<String> lifetime() {
        return Optional.ofNullable(this.lifetime);
    }

    /**
     * The scopes the new credential should have (e.g. `[&#34;cloud-platform&#34;]`)
     * 
     */
    @Import(name="scopes", required=true)
    private List<String> scopes;

    /**
     * @return The scopes the new credential should have (e.g. `[&#34;cloud-platform&#34;]`)
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * The service account _to_ impersonate (e.g. `service_B@your-project-id.iam.gserviceaccount.com`)
     * 
     */
    @Import(name="targetServiceAccount", required=true)
    private String targetServiceAccount;

    /**
     * @return The service account _to_ impersonate (e.g. `service_B@your-project-id.iam.gserviceaccount.com`)
     * 
     */
    public String targetServiceAccount() {
        return this.targetServiceAccount;
    }

    private GetAccountAccessTokenArgs() {}

    private GetAccountAccessTokenArgs(GetAccountAccessTokenArgs $) {
        this.delegates = $.delegates;
        this.lifetime = $.lifetime;
        this.scopes = $.scopes;
        this.targetServiceAccount = $.targetServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAccessTokenArgs $;

        public Builder() {
            $ = new GetAccountAccessTokenArgs();
        }

        public Builder(GetAccountAccessTokenArgs defaults) {
            $ = new GetAccountAccessTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegates Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.  (e.g. `[&#34;projects/-/serviceAccounts/delegate-svc-account@project-id.iam.gserviceaccount.com&#34;]`)
         * 
         * @return builder
         * 
         */
        public Builder delegates(@Nullable List<String> delegates) {
            $.delegates = delegates;
            return this;
        }

        /**
         * @param delegates Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.  (e.g. `[&#34;projects/-/serviceAccounts/delegate-svc-account@project-id.iam.gserviceaccount.com&#34;]`)
         * 
         * @return builder
         * 
         */
        public Builder delegates(String... delegates) {
            return delegates(List.of(delegates));
        }

        /**
         * @param lifetime Lifetime of the impersonated token (defaults to its max: `3600s`).
         * 
         * @return builder
         * 
         */
        public Builder lifetime(@Nullable String lifetime) {
            $.lifetime = lifetime;
            return this;
        }

        /**
         * @param scopes The scopes the new credential should have (e.g. `[&#34;cloud-platform&#34;]`)
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The scopes the new credential should have (e.g. `[&#34;cloud-platform&#34;]`)
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param targetServiceAccount The service account _to_ impersonate (e.g. `service_B@your-project-id.iam.gserviceaccount.com`)
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccount(String targetServiceAccount) {
            $.targetServiceAccount = targetServiceAccount;
            return this;
        }

        public GetAccountAccessTokenArgs build() {
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            $.targetServiceAccount = Objects.requireNonNull($.targetServiceAccount, "expected parameter 'targetServiceAccount' to be non-null");
            return $;
        }
    }

}
