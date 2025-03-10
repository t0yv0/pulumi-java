// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.enums.WebACLManagedRuleGroupConfigPayloadType;
import com.pulumi.awsnative.wafv2.outputs.WebACLFieldIdentifier;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLManagedRuleGroupConfig {
    private final @Nullable String loginPath;
    private final @Nullable WebACLFieldIdentifier passwordField;
    private final @Nullable WebACLManagedRuleGroupConfigPayloadType payloadType;
    private final @Nullable WebACLFieldIdentifier usernameField;

    @CustomType.Constructor
    private WebACLManagedRuleGroupConfig(
        @CustomType.Parameter("loginPath") @Nullable String loginPath,
        @CustomType.Parameter("passwordField") @Nullable WebACLFieldIdentifier passwordField,
        @CustomType.Parameter("payloadType") @Nullable WebACLManagedRuleGroupConfigPayloadType payloadType,
        @CustomType.Parameter("usernameField") @Nullable WebACLFieldIdentifier usernameField) {
        this.loginPath = loginPath;
        this.passwordField = passwordField;
        this.payloadType = payloadType;
        this.usernameField = usernameField;
    }

    public Optional<String> loginPath() {
        return Optional.ofNullable(this.loginPath);
    }
    public Optional<WebACLFieldIdentifier> passwordField() {
        return Optional.ofNullable(this.passwordField);
    }
    public Optional<WebACLManagedRuleGroupConfigPayloadType> payloadType() {
        return Optional.ofNullable(this.payloadType);
    }
    public Optional<WebACLFieldIdentifier> usernameField() {
        return Optional.ofNullable(this.usernameField);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLManagedRuleGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String loginPath;
        private @Nullable WebACLFieldIdentifier passwordField;
        private @Nullable WebACLManagedRuleGroupConfigPayloadType payloadType;
        private @Nullable WebACLFieldIdentifier usernameField;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLManagedRuleGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginPath = defaults.loginPath;
    	      this.passwordField = defaults.passwordField;
    	      this.payloadType = defaults.payloadType;
    	      this.usernameField = defaults.usernameField;
        }

        public Builder loginPath(@Nullable String loginPath) {
            this.loginPath = loginPath;
            return this;
        }
        public Builder passwordField(@Nullable WebACLFieldIdentifier passwordField) {
            this.passwordField = passwordField;
            return this;
        }
        public Builder payloadType(@Nullable WebACLManagedRuleGroupConfigPayloadType payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public Builder usernameField(@Nullable WebACLFieldIdentifier usernameField) {
            this.usernameField = usernameField;
            return this;
        }        public WebACLManagedRuleGroupConfig build() {
            return new WebACLManagedRuleGroupConfig(loginPath, passwordField, payloadType, usernameField);
        }
    }
}
