// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig {
    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private final String fallbackBehavior;
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    private final String headerName;
    /**
     * @return - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    private final String position;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig(
        @CustomType.Parameter("fallbackBehavior") String fallbackBehavior,
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("position") String position) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
        this.position = position;
    }

    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    public String fallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    public String position() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;
        private String position;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder position(String position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig build() {
            return new RuleGroupRuleStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig(fallbackBehavior, headerName, position);
        }
    }
}
