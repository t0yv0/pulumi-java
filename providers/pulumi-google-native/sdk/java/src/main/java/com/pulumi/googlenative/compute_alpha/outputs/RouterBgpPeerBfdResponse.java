// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterBgpPeerBfdResponse {
    /**
     * @return The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    private final Integer minReceiveInterval;
    /**
     * @return The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    private final Integer minTransmitInterval;
    /**
     * @return The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    private final String mode;
    /**
     * @return The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
     * 
     */
    private final Integer multiplier;
    /**
     * @return The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD echo mode is enabled for this BGP peer. In this mode, if the peer router also has BFD echo mode enabled, BFD echo packets will be sent to the other router. If the peer router does not have BFD echo mode enabled, only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode is disabled for this BGP peer. If this router and the peer router have a multihop connection, this should be set to CONTROL_ONLY as BFD echo mode is only supported on singlehop connections. The default is CONTROL_AND_ECHO.
     * 
     */
    private final String packetMode;
    /**
     * @return The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
     * 
     */
    private final String sessionInitializationMode;
    /**
     * @return The minimum interval, in milliseconds, between BFD control packets transmitted to and received from the peer router when BFD echo mode is enabled on both routers. The actual transmit and receive intervals are negotiated between the two routers and are equal to the greater of this value and the corresponding interval on the other router. If set, this value must be between 1000 and 30000. The default is 5000.
     * 
     */
    private final Integer slowTimerInterval;

    @CustomType.Constructor
    private RouterBgpPeerBfdResponse(
        @CustomType.Parameter("minReceiveInterval") Integer minReceiveInterval,
        @CustomType.Parameter("minTransmitInterval") Integer minTransmitInterval,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("multiplier") Integer multiplier,
        @CustomType.Parameter("packetMode") String packetMode,
        @CustomType.Parameter("sessionInitializationMode") String sessionInitializationMode,
        @CustomType.Parameter("slowTimerInterval") Integer slowTimerInterval) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.mode = mode;
        this.multiplier = multiplier;
        this.packetMode = packetMode;
        this.sessionInitializationMode = sessionInitializationMode;
        this.slowTimerInterval = slowTimerInterval;
    }

    /**
     * @return The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    public Integer minReceiveInterval() {
        return this.minReceiveInterval;
    }
    /**
     * @return The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    public Integer minTransmitInterval() {
        return this.minTransmitInterval;
    }
    /**
     * @return The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
     * 
     */
    public Integer multiplier() {
        return this.multiplier;
    }
    /**
     * @return The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD echo mode is enabled for this BGP peer. In this mode, if the peer router also has BFD echo mode enabled, BFD echo packets will be sent to the other router. If the peer router does not have BFD echo mode enabled, only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode is disabled for this BGP peer. If this router and the peer router have a multihop connection, this should be set to CONTROL_ONLY as BFD echo mode is only supported on singlehop connections. The default is CONTROL_AND_ECHO.
     * 
     */
    public String packetMode() {
        return this.packetMode;
    }
    /**
     * @return The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
     * 
     */
    public String sessionInitializationMode() {
        return this.sessionInitializationMode;
    }
    /**
     * @return The minimum interval, in milliseconds, between BFD control packets transmitted to and received from the peer router when BFD echo mode is enabled on both routers. The actual transmit and receive intervals are negotiated between the two routers and are equal to the greater of this value and the corresponding interval on the other router. If set, this value must be between 1000 and 30000. The default is 5000.
     * 
     */
    public Integer slowTimerInterval() {
        return this.slowTimerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerBfdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minReceiveInterval;
        private Integer minTransmitInterval;
        private String mode;
        private Integer multiplier;
        private String packetMode;
        private String sessionInitializationMode;
        private Integer slowTimerInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerBfdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.mode = defaults.mode;
    	      this.multiplier = defaults.multiplier;
    	      this.packetMode = defaults.packetMode;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
    	      this.slowTimerInterval = defaults.slowTimerInterval;
        }

        public Builder minReceiveInterval(Integer minReceiveInterval) {
            this.minReceiveInterval = Objects.requireNonNull(minReceiveInterval);
            return this;
        }
        public Builder minTransmitInterval(Integer minTransmitInterval) {
            this.minTransmitInterval = Objects.requireNonNull(minTransmitInterval);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder multiplier(Integer multiplier) {
            this.multiplier = Objects.requireNonNull(multiplier);
            return this;
        }
        public Builder packetMode(String packetMode) {
            this.packetMode = Objects.requireNonNull(packetMode);
            return this;
        }
        public Builder sessionInitializationMode(String sessionInitializationMode) {
            this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode);
            return this;
        }
        public Builder slowTimerInterval(Integer slowTimerInterval) {
            this.slowTimerInterval = Objects.requireNonNull(slowTimerInterval);
            return this;
        }        public RouterBgpPeerBfdResponse build() {
            return new RouterBgpPeerBfdResponse(minReceiveInterval, minTransmitInterval, mode, multiplier, packetMode, sessionInitializationMode, slowTimerInterval);
        }
    }
}
