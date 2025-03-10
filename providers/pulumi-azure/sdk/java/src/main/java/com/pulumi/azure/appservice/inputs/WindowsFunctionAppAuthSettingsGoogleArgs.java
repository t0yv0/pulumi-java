// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppAuthSettingsGoogleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppAuthSettingsGoogleArgs Empty = new WindowsFunctionAppAuthSettingsGoogleArgs();

    /**
     * The OpenID Connect Client ID for the Google web application.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
     * 
     */
    @Import(name="clientSecretSettingName")
    private @Nullable Output<String> clientSecretSettingName;

    /**
     * @return The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
     * 
     */
    public Optional<Output<String>> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    /**
     * Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private WindowsFunctionAppAuthSettingsGoogleArgs() {}

    private WindowsFunctionAppAuthSettingsGoogleArgs(WindowsFunctionAppAuthSettingsGoogleArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.clientSecretSettingName = $.clientSecretSettingName;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppAuthSettingsGoogleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppAuthSettingsGoogleArgs $;

        public Builder() {
            $ = new WindowsFunctionAppAuthSettingsGoogleArgs();
        }

        public Builder(WindowsFunctionAppAuthSettingsGoogleArgs defaults) {
            $ = new WindowsFunctionAppAuthSettingsGoogleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The OpenID Connect Client ID for the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The OpenID Connect Client ID for the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param clientSecretSettingName The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            $.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        /**
         * @param clientSecretSettingName The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            return clientSecretSettingName(Output.of(clientSecretSettingName));
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public WindowsFunctionAppAuthSettingsGoogleArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            return $;
        }
    }

}
