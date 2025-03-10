// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleMatcherLayer4ConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleSecureTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatcherArgs Empty = new FirewallPolicyRuleMatcherArgs();

    /**
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    @Import(name="destAddressGroups")
    private @Nullable Output<List<String>> destAddressGroups;

    /**
     * @return Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    public Optional<Output<List<String>>> destAddressGroups() {
        return Optional.ofNullable(this.destAddressGroups);
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    @Import(name="destFqdns")
    private @Nullable Output<List<String>> destFqdns;

    /**
     * @return Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    public Optional<Output<List<String>>> destFqdns() {
        return Optional.ofNullable(this.destFqdns);
    }

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges")
    private @Nullable Output<List<String>> destIpRanges;

    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> destIpRanges() {
        return Optional.ofNullable(this.destIpRanges);
    }

    /**
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
     * 
     */
    @Import(name="destRegionCodes")
    private @Nullable Output<List<String>> destRegionCodes;

    /**
     * @return Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> destRegionCodes() {
        return Optional.ofNullable(this.destRegionCodes);
    }

    /**
     * Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
     * 
     */
    @Import(name="destThreatIntelligences")
    private @Nullable Output<List<String>> destThreatIntelligences;

    /**
     * @return Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
     * 
     */
    public Optional<Output<List<String>>> destThreatIntelligences() {
        return Optional.ofNullable(this.destThreatIntelligences);
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @Import(name="layer4Configs")
    private @Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;

    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * 
     */
    public Optional<Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>>> layer4Configs() {
        return Optional.ofNullable(this.layer4Configs);
    }

    /**
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    @Import(name="srcAddressGroups")
    private @Nullable Output<List<String>> srcAddressGroups;

    /**
     * @return Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    public Optional<Output<List<String>>> srcAddressGroups() {
        return Optional.ofNullable(this.srcAddressGroups);
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    @Import(name="srcFqdns")
    private @Nullable Output<List<String>> srcFqdns;

    /**
     * @return Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    public Optional<Output<List<String>>> srcFqdns() {
        return Optional.ofNullable(this.srcFqdns);
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges")
    private @Nullable Output<List<String>> srcIpRanges;

    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> srcIpRanges() {
        return Optional.ofNullable(this.srcIpRanges);
    }

    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
     * 
     */
    @Import(name="srcRegionCodes")
    private @Nullable Output<List<String>> srcRegionCodes;

    /**
     * @return Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> srcRegionCodes() {
        return Optional.ofNullable(this.srcRegionCodes);
    }

    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    @Import(name="srcSecureTags")
    private @Nullable Output<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags;

    /**
     * @return List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    public Optional<Output<List<FirewallPolicyRuleSecureTagArgs>>> srcSecureTags() {
        return Optional.ofNullable(this.srcSecureTags);
    }

    /**
     * Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
     * 
     */
    @Import(name="srcThreatIntelligences")
    private @Nullable Output<List<String>> srcThreatIntelligences;

    /**
     * @return Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
     * 
     */
    public Optional<Output<List<String>>> srcThreatIntelligences() {
        return Optional.ofNullable(this.srcThreatIntelligences);
    }

    private FirewallPolicyRuleMatcherArgs() {}

    private FirewallPolicyRuleMatcherArgs(FirewallPolicyRuleMatcherArgs $) {
        this.destAddressGroups = $.destAddressGroups;
        this.destFqdns = $.destFqdns;
        this.destIpRanges = $.destIpRanges;
        this.destRegionCodes = $.destRegionCodes;
        this.destThreatIntelligences = $.destThreatIntelligences;
        this.layer4Configs = $.layer4Configs;
        this.srcAddressGroups = $.srcAddressGroups;
        this.srcFqdns = $.srcFqdns;
        this.srcIpRanges = $.srcIpRanges;
        this.srcRegionCodes = $.srcRegionCodes;
        this.srcSecureTags = $.srcSecureTags;
        this.srcThreatIntelligences = $.srcThreatIntelligences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleMatcherArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleMatcherArgs();
        }

        public Builder(FirewallPolicyRuleMatcherArgs defaults) {
            $ = new FirewallPolicyRuleMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destAddressGroups Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder destAddressGroups(@Nullable Output<List<String>> destAddressGroups) {
            $.destAddressGroups = destAddressGroups;
            return this;
        }

        /**
         * @param destAddressGroups Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder destAddressGroups(List<String> destAddressGroups) {
            return destAddressGroups(Output.of(destAddressGroups));
        }

        /**
         * @param destAddressGroups Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder destAddressGroups(String... destAddressGroups) {
            return destAddressGroups(List.of(destAddressGroups));
        }

        /**
         * @param destFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder destFqdns(@Nullable Output<List<String>> destFqdns) {
            $.destFqdns = destFqdns;
            return this;
        }

        /**
         * @param destFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder destFqdns(List<String> destFqdns) {
            return destFqdns(Output.of(destFqdns));
        }

        /**
         * @param destFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder destFqdns(String... destFqdns) {
            return destFqdns(List.of(destFqdns));
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            $.destIpRanges = destIpRanges;
            return this;
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(List<String> destIpRanges) {
            return destIpRanges(Output.of(destIpRanges));
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }

        /**
         * @param destRegionCodes Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destRegionCodes(@Nullable Output<List<String>> destRegionCodes) {
            $.destRegionCodes = destRegionCodes;
            return this;
        }

        /**
         * @param destRegionCodes Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destRegionCodes(List<String> destRegionCodes) {
            return destRegionCodes(Output.of(destRegionCodes));
        }

        /**
         * @param destRegionCodes Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destRegionCodes(String... destRegionCodes) {
            return destRegionCodes(List.of(destRegionCodes));
        }

        /**
         * @param destThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
         * 
         * @return builder
         * 
         */
        public Builder destThreatIntelligences(@Nullable Output<List<String>> destThreatIntelligences) {
            $.destThreatIntelligences = destThreatIntelligences;
            return this;
        }

        /**
         * @param destThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
         * 
         * @return builder
         * 
         */
        public Builder destThreatIntelligences(List<String> destThreatIntelligences) {
            return destThreatIntelligences(Output.of(destThreatIntelligences));
        }

        /**
         * @param destThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic destination.
         * 
         * @return builder
         * 
         */
        public Builder destThreatIntelligences(String... destThreatIntelligences) {
            return destThreatIntelligences(List.of(destThreatIntelligences));
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(@Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs) {
            $.layer4Configs = layer4Configs;
            return this;
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigArgs> layer4Configs) {
            return layer4Configs(Output.of(layer4Configs));
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }

        /**
         * @param srcAddressGroups Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder srcAddressGroups(@Nullable Output<List<String>> srcAddressGroups) {
            $.srcAddressGroups = srcAddressGroups;
            return this;
        }

        /**
         * @param srcAddressGroups Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder srcAddressGroups(List<String> srcAddressGroups) {
            return srcAddressGroups(Output.of(srcAddressGroups));
        }

        /**
         * @param srcAddressGroups Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
         * 
         * @return builder
         * 
         */
        public Builder srcAddressGroups(String... srcAddressGroups) {
            return srcAddressGroups(List.of(srcAddressGroups));
        }

        /**
         * @param srcFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder srcFqdns(@Nullable Output<List<String>> srcFqdns) {
            $.srcFqdns = srcFqdns;
            return this;
        }

        /**
         * @param srcFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder srcFqdns(List<String> srcFqdns) {
            return srcFqdns(Output.of(srcFqdns));
        }

        /**
         * @param srcFqdns Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
         * 
         * @return builder
         * 
         */
        public Builder srcFqdns(String... srcFqdns) {
            return srcFqdns(List.of(srcFqdns));
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            $.srcIpRanges = srcIpRanges;
            return this;
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(List<String> srcIpRanges) {
            return srcIpRanges(Output.of(srcIpRanges));
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }

        /**
         * @param srcRegionCodes Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcRegionCodes(@Nullable Output<List<String>> srcRegionCodes) {
            $.srcRegionCodes = srcRegionCodes;
            return this;
        }

        /**
         * @param srcRegionCodes Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcRegionCodes(List<String> srcRegionCodes) {
            return srcRegionCodes(Output.of(srcRegionCodes));
        }

        /**
         * @param srcRegionCodes Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcRegionCodes(String... srcRegionCodes) {
            return srcRegionCodes(List.of(srcRegionCodes));
        }

        /**
         * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
         * 
         * @return builder
         * 
         */
        public Builder srcSecureTags(@Nullable Output<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags) {
            $.srcSecureTags = srcSecureTags;
            return this;
        }

        /**
         * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
         * 
         * @return builder
         * 
         */
        public Builder srcSecureTags(List<FirewallPolicyRuleSecureTagArgs> srcSecureTags) {
            return srcSecureTags(Output.of(srcSecureTags));
        }

        /**
         * @param srcSecureTags List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
         * 
         * @return builder
         * 
         */
        public Builder srcSecureTags(FirewallPolicyRuleSecureTagArgs... srcSecureTags) {
            return srcSecureTags(List.of(srcSecureTags));
        }

        /**
         * @param srcThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
         * 
         * @return builder
         * 
         */
        public Builder srcThreatIntelligences(@Nullable Output<List<String>> srcThreatIntelligences) {
            $.srcThreatIntelligences = srcThreatIntelligences;
            return this;
        }

        /**
         * @param srcThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
         * 
         * @return builder
         * 
         */
        public Builder srcThreatIntelligences(List<String> srcThreatIntelligences) {
            return srcThreatIntelligences(Output.of(srcThreatIntelligences));
        }

        /**
         * @param srcThreatIntelligences Names of Network Threat Intelligence lists. The IPs in these lists will be matched against traffic source.
         * 
         * @return builder
         * 
         */
        public Builder srcThreatIntelligences(String... srcThreatIntelligences) {
            return srcThreatIntelligences(List.of(srcThreatIntelligences));
        }

        public FirewallPolicyRuleMatcherArgs build() {
            return $;
        }
    }

}
