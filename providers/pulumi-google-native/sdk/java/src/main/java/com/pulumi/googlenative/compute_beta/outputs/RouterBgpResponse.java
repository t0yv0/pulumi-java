// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.RouterAdvertisedIpRangeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouterBgpResponse {
    /**
     * @return User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    private final String advertiseMode;
    /**
     * @return User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    private final List<String> advertisedGroups;
    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    private final List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
    /**
     * @return Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    private final Integer asn;
    /**
     * @return The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    private final Integer keepaliveInterval;

    @CustomType.Constructor
    private RouterBgpResponse(
        @CustomType.Parameter("advertiseMode") String advertiseMode,
        @CustomType.Parameter("advertisedGroups") List<String> advertisedGroups,
        @CustomType.Parameter("advertisedIpRanges") List<RouterAdvertisedIpRangeResponse> advertisedIpRanges,
        @CustomType.Parameter("asn") Integer asn,
        @CustomType.Parameter("keepaliveInterval") Integer keepaliveInterval) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.asn = asn;
        this.keepaliveInterval = keepaliveInterval;
    }

    /**
     * @return User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    public String advertiseMode() {
        return this.advertiseMode;
    }
    /**
     * @return User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    public List<String> advertisedGroups() {
        return this.advertisedGroups;
    }
    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    public List<RouterAdvertisedIpRangeResponse> advertisedIpRanges() {
        return this.advertisedIpRanges;
    }
    /**
     * @return Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    public Integer keepaliveInterval() {
        return this.keepaliveInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
        private Integer asn;
        private Integer keepaliveInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
    	      this.keepaliveInterval = defaults.keepaliveInterval;
        }

        public Builder advertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }
        public Builder advertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }
        public Builder advertisedGroups(String... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }
        public Builder advertisedIpRanges(List<RouterAdvertisedIpRangeResponse> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }
        public Builder advertisedIpRanges(RouterAdvertisedIpRangeResponse... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }
        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        public Builder keepaliveInterval(Integer keepaliveInterval) {
            this.keepaliveInterval = Objects.requireNonNull(keepaliveInterval);
            return this;
        }        public RouterBgpResponse build() {
            return new RouterBgpResponse(advertiseMode, advertisedGroups, advertisedIpRanges, asn, keepaliveInterval);
        }
    }
}
