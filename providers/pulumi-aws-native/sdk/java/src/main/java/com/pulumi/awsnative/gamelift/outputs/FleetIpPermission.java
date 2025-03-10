// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.outputs;

import com.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FleetIpPermission {
    /**
     * @return A starting value for a range of allowed port numbers.
     * 
     */
    private final Integer fromPort;
    /**
     * @return A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: &#34;000.000.000.000/[subnet mask]&#34; or optionally the shortened version &#34;0.0.0.0/[subnet mask]&#34;.
     * 
     */
    private final String ipRange;
    /**
     * @return The network communication protocol used by the fleet.
     * 
     */
    private final FleetIpPermissionProtocol protocol;
    /**
     * @return An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
     */
    private final Integer toPort;

    @CustomType.Constructor
    private FleetIpPermission(
        @CustomType.Parameter("fromPort") Integer fromPort,
        @CustomType.Parameter("ipRange") String ipRange,
        @CustomType.Parameter("protocol") FleetIpPermissionProtocol protocol,
        @CustomType.Parameter("toPort") Integer toPort) {
        this.fromPort = fromPort;
        this.ipRange = ipRange;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    /**
     * @return A starting value for a range of allowed port numbers.
     * 
     */
    public Integer fromPort() {
        return this.fromPort;
    }
    /**
     * @return A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: &#34;000.000.000.000/[subnet mask]&#34; or optionally the shortened version &#34;0.0.0.0/[subnet mask]&#34;.
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }
    /**
     * @return The network communication protocol used by the fleet.
     * 
     */
    public FleetIpPermissionProtocol protocol() {
        return this.protocol;
    }
    /**
     * @return An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
     */
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private String ipRange;
        private FleetIpPermissionProtocol protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        public Builder protocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }        public FleetIpPermission build() {
            return new FleetIpPermission(fromPort, ipRange, protocol, toPort);
        }
    }
}
