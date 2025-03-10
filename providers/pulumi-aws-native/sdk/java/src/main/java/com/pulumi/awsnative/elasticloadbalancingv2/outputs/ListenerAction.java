// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.outputs;

import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAuthenticateCognitoConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAuthenticateOidcConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerFixedResponseConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerForwardConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRedirectConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerAction {
    private final @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig;
    private final @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig;
    private final @Nullable ListenerFixedResponseConfig fixedResponseConfig;
    private final @Nullable ListenerForwardConfig forwardConfig;
    private final @Nullable Integer order;
    private final @Nullable ListenerRedirectConfig redirectConfig;
    private final @Nullable String targetGroupArn;
    private final String type;

    @CustomType.Constructor
    private ListenerAction(
        @CustomType.Parameter("authenticateCognitoConfig") @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig,
        @CustomType.Parameter("authenticateOidcConfig") @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig,
        @CustomType.Parameter("fixedResponseConfig") @Nullable ListenerFixedResponseConfig fixedResponseConfig,
        @CustomType.Parameter("forwardConfig") @Nullable ListenerForwardConfig forwardConfig,
        @CustomType.Parameter("order") @Nullable Integer order,
        @CustomType.Parameter("redirectConfig") @Nullable ListenerRedirectConfig redirectConfig,
        @CustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn,
        @CustomType.Parameter("type") String type) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        this.authenticateOidcConfig = authenticateOidcConfig;
        this.fixedResponseConfig = fixedResponseConfig;
        this.forwardConfig = forwardConfig;
        this.order = order;
        this.redirectConfig = redirectConfig;
        this.targetGroupArn = targetGroupArn;
        this.type = type;
    }

    public Optional<ListenerAuthenticateCognitoConfig> authenticateCognitoConfig() {
        return Optional.ofNullable(this.authenticateCognitoConfig);
    }
    public Optional<ListenerAuthenticateOidcConfig> authenticateOidcConfig() {
        return Optional.ofNullable(this.authenticateOidcConfig);
    }
    public Optional<ListenerFixedResponseConfig> fixedResponseConfig() {
        return Optional.ofNullable(this.fixedResponseConfig);
    }
    public Optional<ListenerForwardConfig> forwardConfig() {
        return Optional.ofNullable(this.forwardConfig);
    }
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    public Optional<ListenerRedirectConfig> redirectConfig() {
        return Optional.ofNullable(this.redirectConfig);
    }
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig;
        private @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig;
        private @Nullable ListenerFixedResponseConfig fixedResponseConfig;
        private @Nullable ListenerForwardConfig forwardConfig;
        private @Nullable Integer order;
        private @Nullable ListenerRedirectConfig redirectConfig;
        private @Nullable String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitoConfig = defaults.authenticateCognitoConfig;
    	      this.authenticateOidcConfig = defaults.authenticateOidcConfig;
    	      this.fixedResponseConfig = defaults.fixedResponseConfig;
    	      this.forwardConfig = defaults.forwardConfig;
    	      this.order = defaults.order;
    	      this.redirectConfig = defaults.redirectConfig;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognitoConfig(@Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig) {
            this.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig) {
            this.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }
        public Builder fixedResponseConfig(@Nullable ListenerFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public Builder forwardConfig(@Nullable ListenerForwardConfig forwardConfig) {
            this.forwardConfig = forwardConfig;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder redirectConfig(@Nullable ListenerRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListenerAction build() {
            return new ListenerAction(authenticateCognitoConfig, authenticateOidcConfig, fixedResponseConfig, forwardConfig, order, redirectConfig, targetGroupArn, type);
        }
    }
}
