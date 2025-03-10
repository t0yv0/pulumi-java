// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsFunctionAppSlotAuthSettingsFacebook {
    /**
     * @return The App ID of the Facebook app used for login.
     * 
     */
    private final String appId;
    /**
     * @return The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
     * 
     */
    private final @Nullable String appSecret;
    /**
     * @return The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
     * 
     */
    private final @Nullable String appSecretSettingName;
    /**
     * @return an `oauth_scopes` block as detailed below.
     * 
     */
    private final @Nullable List<String> oauthScopes;

    @CustomType.Constructor
    private WindowsFunctionAppSlotAuthSettingsFacebook(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("appSecret") @Nullable String appSecret,
        @CustomType.Parameter("appSecretSettingName") @Nullable String appSecretSettingName,
        @CustomType.Parameter("oauthScopes") @Nullable List<String> oauthScopes) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.appSecretSettingName = appSecretSettingName;
        this.oauthScopes = oauthScopes;
    }

    /**
     * @return The App ID of the Facebook app used for login.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
     * 
     */
    public Optional<String> appSecret() {
        return Optional.ofNullable(this.appSecret);
    }
    /**
     * @return The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
     * 
     */
    public Optional<String> appSecretSettingName() {
        return Optional.ofNullable(this.appSecretSettingName);
    }
    /**
     * @return an `oauth_scopes` block as detailed below.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFunctionAppSlotAuthSettingsFacebook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private @Nullable String appSecret;
        private @Nullable String appSecretSettingName;
        private @Nullable List<String> oauthScopes;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFunctionAppSlotAuthSettingsFacebook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.appSecretSettingName = defaults.appSecretSettingName;
    	      this.oauthScopes = defaults.oauthScopes;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appSecret(@Nullable String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public Builder appSecretSettingName(@Nullable String appSecretSettingName) {
            this.appSecretSettingName = appSecretSettingName;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }        public WindowsFunctionAppSlotAuthSettingsFacebook build() {
            return new WindowsFunctionAppSlotAuthSettingsFacebook(appId, appSecret, appSecretSettingName, oauthScopes);
        }
    }
}
