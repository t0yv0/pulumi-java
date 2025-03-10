// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.NamedPortResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceGroupResult {
    /**
     * @return The creation timestamp for this instance group in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    private final String fingerprint;
    /**
     * @return The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    private final String kind;
    /**
     * @return The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     * @return  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    private final List<NamedPortResponse> namedPorts;
    /**
     * @return The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    private final String network;
    /**
     * @return The URL of the region where the instance group is located (for regional resources).
     * 
     */
    private final String region;
    /**
     * @return The URL for this instance group. The server generates this URL.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * @return The total number of instances in the instance group.
     * 
     */
    private final Integer size;
    /**
     * @return The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    private final String subnetwork;
    /**
     * @return The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetInstanceGroupResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namedPorts") List<NamedPortResponse> namedPorts,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("zone") String zone) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.name = name;
        this.namedPorts = namedPorts;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.size = size;
        this.subnetwork = subnetwork;
        this.zone = zone;
    }

    /**
     * @return The creation timestamp for this instance group in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The fingerprint of the named ports. The system uses this fingerprint to detect conflicts when multiple users change the named ports concurrently.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The resource type, which is always compute#instanceGroup for instance groups.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    public List<NamedPortResponse> namedPorts() {
        return this.namedPorts;
    }
    /**
     * @return The URL of the network to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The URL of the region where the instance group is located (for regional resources).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The URL for this instance group. The server generates this URL.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return The total number of instances in the instance group.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The URL of the subnetwork to which all instances in the instance group belong. If your instance has multiple network interfaces, then the network and subnetwork fields only refer to the network and subnet used by your primary interface (nic0).
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * @return The URL of the zone where the instance group is located (for zonal resources).
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String name;
        private List<NamedPortResponse> namedPorts;
        private String network;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private Integer size;
        private String subnetwork;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.zone = defaults.zone;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namedPorts(List<NamedPortResponse> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }
        public Builder namedPorts(NamedPortResponse... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetInstanceGroupResult build() {
            return new GetInstanceGroupResult(creationTimestamp, description, fingerprint, kind, name, namedPorts, network, region, selfLink, selfLinkWithId, size, subnetwork, zone);
        }
    }
}
