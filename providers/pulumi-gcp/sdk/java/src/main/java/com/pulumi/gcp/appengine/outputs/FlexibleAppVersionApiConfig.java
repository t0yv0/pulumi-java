// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionApiConfig {
    /**
     * @return Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    private final @Nullable String authFailAction;
    /**
     * @return Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    private final @Nullable String login;
    /**
     * @return Path to the script from the application root directory.
     * 
     */
    private final String script;
    /**
     * @return Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    private final @Nullable String securityLevel;
    /**
     * @return URL to serve the endpoint at.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private FlexibleAppVersionApiConfig(
        @CustomType.Parameter("authFailAction") @Nullable String authFailAction,
        @CustomType.Parameter("login") @Nullable String login,
        @CustomType.Parameter("script") String script,
        @CustomType.Parameter("securityLevel") @Nullable String securityLevel,
        @CustomType.Parameter("url") @Nullable String url) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.script = script;
        this.securityLevel = securityLevel;
        this.url = url;
    }

    /**
     * @return Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    public Optional<String> authFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }
    /**
     * @return Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    public Optional<String> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * @return Path to the script from the application root directory.
     * 
     */
    public String script() {
        return this.script;
    }
    /**
     * @return Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    /**
     * @return URL to serve the endpoint at.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionApiConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authFailAction;
        private @Nullable String login;
        private String script;
        private @Nullable String securityLevel;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionApiConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder authFailAction(@Nullable String authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }
        public Builder login(@Nullable String login) {
            this.login = login;
            return this;
        }
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public FlexibleAppVersionApiConfig build() {
            return new FlexibleAppVersionApiConfig(authFailAction, login, script, securityLevel, url);
        }
    }
}
