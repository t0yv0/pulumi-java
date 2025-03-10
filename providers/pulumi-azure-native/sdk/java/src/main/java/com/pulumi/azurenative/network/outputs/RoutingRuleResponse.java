// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ForwardingConfigurationResponse;
import com.pulumi.azurenative.network.outputs.RedirectConfigurationResponse;
import com.pulumi.azurenative.network.outputs.RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingRuleResponse {
    /**
     * @return Protocol schemes to match for this rule
     * 
     */
    private final @Nullable List<String> acceptedProtocols;
    /**
     * @return Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    private final @Nullable String enabledState;
    /**
     * @return Frontend endpoints associated with this rule
     * 
     */
    private final @Nullable List<SubResourceResponse> frontendEndpoints;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The route patterns of the rule.
     * 
     */
    private final @Nullable List<String> patternsToMatch;
    /**
     * @return Resource status.
     * 
     */
    private final String resourceState;
    /**
     * @return A reference to the routing configuration.
     * 
     */
    private final @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfiguration;
    /**
     * @return A reference to a specific Rules Engine Configuration to apply to this route.
     * 
     */
    private final @Nullable SubResourceResponse rulesEngine;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Defines the Web Application Firewall policy for each routing rule (if applicable)
     * 
     */
    private final @Nullable RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    @CustomType.Constructor
    private RoutingRuleResponse(
        @CustomType.Parameter("acceptedProtocols") @Nullable List<String> acceptedProtocols,
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("frontendEndpoints") @Nullable List<SubResourceResponse> frontendEndpoints,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("patternsToMatch") @Nullable List<String> patternsToMatch,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("routeConfiguration") @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfiguration,
        @CustomType.Parameter("rulesEngine") @Nullable SubResourceResponse rulesEngine,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("webApplicationFirewallPolicyLink") @Nullable RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.acceptedProtocols = acceptedProtocols;
        this.enabledState = enabledState;
        this.frontendEndpoints = frontendEndpoints;
        this.id = id;
        this.name = name;
        this.patternsToMatch = patternsToMatch;
        this.resourceState = resourceState;
        this.routeConfiguration = routeConfiguration;
        this.rulesEngine = rulesEngine;
        this.type = type;
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
    }

    /**
     * @return Protocol schemes to match for this rule
     * 
     */
    public List<String> acceptedProtocols() {
        return this.acceptedProtocols == null ? List.of() : this.acceptedProtocols;
    }
    /**
     * @return Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * @return Frontend endpoints associated with this rule
     * 
     */
    public List<SubResourceResponse> frontendEndpoints() {
        return this.frontendEndpoints == null ? List.of() : this.frontendEndpoints;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The route patterns of the rule.
     * 
     */
    public List<String> patternsToMatch() {
        return this.patternsToMatch == null ? List.of() : this.patternsToMatch;
    }
    /**
     * @return Resource status.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return A reference to the routing configuration.
     * 
     */
    public Optional<Either<ForwardingConfigurationResponse,RedirectConfigurationResponse>> routeConfiguration() {
        return Optional.ofNullable(this.routeConfiguration);
    }
    /**
     * @return A reference to a specific Rules Engine Configuration to apply to this route.
     * 
     */
    public Optional<SubResourceResponse> rulesEngine() {
        return Optional.ofNullable(this.rulesEngine);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Defines the Web Application Firewall policy for each routing rule (if applicable)
     * 
     */
    public Optional<RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink> webApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> acceptedProtocols;
        private @Nullable String enabledState;
        private @Nullable List<SubResourceResponse> frontendEndpoints;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<String> patternsToMatch;
        private String resourceState;
        private @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfiguration;
        private @Nullable SubResourceResponse rulesEngine;
        private String type;
        private @Nullable RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedProtocols = defaults.acceptedProtocols;
    	      this.enabledState = defaults.enabledState;
    	      this.frontendEndpoints = defaults.frontendEndpoints;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.patternsToMatch = defaults.patternsToMatch;
    	      this.resourceState = defaults.resourceState;
    	      this.routeConfiguration = defaults.routeConfiguration;
    	      this.rulesEngine = defaults.rulesEngine;
    	      this.type = defaults.type;
    	      this.webApplicationFirewallPolicyLink = defaults.webApplicationFirewallPolicyLink;
        }

        public Builder acceptedProtocols(@Nullable List<String> acceptedProtocols) {
            this.acceptedProtocols = acceptedProtocols;
            return this;
        }
        public Builder acceptedProtocols(String... acceptedProtocols) {
            return acceptedProtocols(List.of(acceptedProtocols));
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder frontendEndpoints(@Nullable List<SubResourceResponse> frontendEndpoints) {
            this.frontendEndpoints = frontendEndpoints;
            return this;
        }
        public Builder frontendEndpoints(SubResourceResponse... frontendEndpoints) {
            return frontendEndpoints(List.of(frontendEndpoints));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder patternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }
        public Builder patternsToMatch(String... patternsToMatch) {
            return patternsToMatch(List.of(patternsToMatch));
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder routeConfiguration(@Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfiguration) {
            this.routeConfiguration = routeConfiguration;
            return this;
        }
        public Builder rulesEngine(@Nullable SubResourceResponse rulesEngine) {
            this.rulesEngine = rulesEngine;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder webApplicationFirewallPolicyLink(@Nullable RoutingRuleUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
            this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }        public RoutingRuleResponse build() {
            return new RoutingRuleResponse(acceptedProtocols, enabledState, frontendEndpoints, id, name, patternsToMatch, resourceState, routeConfiguration, rulesEngine, type, webApplicationFirewallPolicyLink);
        }
    }
}
