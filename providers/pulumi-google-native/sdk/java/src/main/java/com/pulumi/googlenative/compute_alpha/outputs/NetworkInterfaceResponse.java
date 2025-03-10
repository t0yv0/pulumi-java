// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.AccessConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AliasIpRangeResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkInterfaceSubInterfaceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkInterfaceResponse {
    /**
     * @return An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    private final List<AccessConfigResponse> accessConfigs;
    /**
     * @return An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    private final List<AliasIpRangeResponse> aliasIpRanges;
    /**
     * @return Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
     * 
     */
    private final String fingerprint;
    /**
     * @return The prefix length of the primary internal IPv6 range.
     * 
     */
    private final Integer internalIpv6PrefixLength;
    /**
     * @return An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    private final List<AccessConfigResponse> ipv6AccessConfigs;
    /**
     * @return One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
     * 
     */
    private final String ipv6AccessType;
    /**
     * @return An IPv6 internal network address for this network interface.
     * 
     */
    private final String ipv6Address;
    /**
     * @return Type of the resource. Always compute#networkInterface for network interfaces.
     * 
     */
    private final String kind;
    /**
     * @return The name of the network interface, which is generated by the server. For a VM, the network interface uses the nicN naming format. Where N is a value between 0 and 7. The default interface value is nic0.
     * 
     */
    private final String name;
    /**
     * @return URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    private final String network;
    /**
     * @return An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    private final String networkIP;
    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    private final String nicType;
    /**
     * @return The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
     * 
     */
    private final Integer queueCount;
    /**
     * @return The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    private final String stackType;
    /**
     * @return SubInterfaces help enable L2 communication for the instance over subnetworks that support L2. Every network interface will get a default untagged (vlan not specified) subinterface. Users can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
     * 
     */
    private final List<NetworkInterfaceSubInterfaceResponse> subinterfaces;
    /**
     * @return The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    private final String subnetwork;

    @CustomType.Constructor
    private NetworkInterfaceResponse(
        @CustomType.Parameter("accessConfigs") List<AccessConfigResponse> accessConfigs,
        @CustomType.Parameter("aliasIpRanges") List<AliasIpRangeResponse> aliasIpRanges,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("internalIpv6PrefixLength") Integer internalIpv6PrefixLength,
        @CustomType.Parameter("ipv6AccessConfigs") List<AccessConfigResponse> ipv6AccessConfigs,
        @CustomType.Parameter("ipv6AccessType") String ipv6AccessType,
        @CustomType.Parameter("ipv6Address") String ipv6Address,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkIP") String networkIP,
        @CustomType.Parameter("nicType") String nicType,
        @CustomType.Parameter("queueCount") Integer queueCount,
        @CustomType.Parameter("stackType") String stackType,
        @CustomType.Parameter("subinterfaces") List<NetworkInterfaceSubInterfaceResponse> subinterfaces,
        @CustomType.Parameter("subnetwork") String subnetwork) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.fingerprint = fingerprint;
        this.internalIpv6PrefixLength = internalIpv6PrefixLength;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.networkIP = networkIP;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subinterfaces = subinterfaces;
        this.subnetwork = subnetwork;
    }

    /**
     * @return An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    public List<AccessConfigResponse> accessConfigs() {
        return this.accessConfigs;
    }
    /**
     * @return An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    public List<AliasIpRangeResponse> aliasIpRanges() {
        return this.aliasIpRanges;
    }
    /**
     * @return Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The prefix length of the primary internal IPv6 range.
     * 
     */
    public Integer internalIpv6PrefixLength() {
        return this.internalIpv6PrefixLength;
    }
    /**
     * @return An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    public List<AccessConfigResponse> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }
    /**
     * @return One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
     * 
     */
    public String ipv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * @return An IPv6 internal network address for this network interface.
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return Type of the resource. Always compute#networkInterface for network interfaces.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the network interface, which is generated by the server. For a VM, the network interface uses the nicN naming format. Where N is a value between 0 and 7. The default interface value is nic0.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    public String networkIP() {
        return this.networkIP;
    }
    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    public String nicType() {
        return this.nicType;
    }
    /**
     * @return The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
     * 
     */
    public Integer queueCount() {
        return this.queueCount;
    }
    /**
     * @return The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    public String stackType() {
        return this.stackType;
    }
    /**
     * @return SubInterfaces help enable L2 communication for the instance over subnetworks that support L2. Every network interface will get a default untagged (vlan not specified) subinterface. Users can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
     * 
     */
    public List<NetworkInterfaceSubInterfaceResponse> subinterfaces() {
        return this.subinterfaces;
    }
    /**
     * @return The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccessConfigResponse> accessConfigs;
        private List<AliasIpRangeResponse> aliasIpRanges;
        private String fingerprint;
        private Integer internalIpv6PrefixLength;
        private List<AccessConfigResponse> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String ipv6Address;
        private String kind;
        private String name;
        private String network;
        private String networkIP;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private List<NetworkInterfaceSubInterfaceResponse> subinterfaces;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.fingerprint = defaults.fingerprint;
    	      this.internalIpv6PrefixLength = defaults.internalIpv6PrefixLength;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subinterfaces = defaults.subinterfaces;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder accessConfigs(List<AccessConfigResponse> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }
        public Builder accessConfigs(AccessConfigResponse... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(List<AliasIpRangeResponse> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(AliasIpRangeResponse... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder internalIpv6PrefixLength(Integer internalIpv6PrefixLength) {
            this.internalIpv6PrefixLength = Objects.requireNonNull(internalIpv6PrefixLength);
            return this;
        }
        public Builder ipv6AccessConfigs(List<AccessConfigResponse> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(AccessConfigResponse... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
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
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkIP(String networkIP) {
            this.networkIP = Objects.requireNonNull(networkIP);
            return this;
        }
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder queueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder subinterfaces(List<NetworkInterfaceSubInterfaceResponse> subinterfaces) {
            this.subinterfaces = Objects.requireNonNull(subinterfaces);
            return this;
        }
        public Builder subinterfaces(NetworkInterfaceSubInterfaceResponse... subinterfaces) {
            return subinterfaces(List.of(subinterfaces));
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(accessConfigs, aliasIpRanges, fingerprint, internalIpv6PrefixLength, ipv6AccessConfigs, ipv6AccessType, ipv6Address, kind, name, network, networkIP, nicType, queueCount, stackType, subinterfaces, subnetwork);
        }
    }
}
