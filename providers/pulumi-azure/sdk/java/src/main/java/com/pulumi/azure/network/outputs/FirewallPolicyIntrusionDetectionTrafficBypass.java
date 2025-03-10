// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyIntrusionDetectionTrafficBypass {
    /**
     * @return The description for this bypass traffic setting.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Specifies a list of destination IP addresses that shall be bypassed by intrusion detection.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * @return Specifies a list of destination IP groups that shall be bypassed by intrusion detection.
     * 
     */
    private final @Nullable List<String> destinationIpGroups;
    /**
     * @return Specifies a list of destination IP ports that shall be bypassed by intrusion detection.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * @return The name which should be used for this bypass traffic setting.
     * 
     */
    private final String name;
    /**
     * @return The protocols any of &#34;ANY&#34;, &#34;TCP&#34;, &#34;ICMP&#34;, &#34;UDP&#34; that shall be bypassed by intrusion detection.
     * 
     */
    private final String protocol;
    /**
     * @return Specifies a list of source addresses that shall be bypassed by intrusion detection.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * @return Specifies a list of source IP groups that shall be bypassed by intrusion detection.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;

    @CustomType.Constructor
    private FirewallPolicyIntrusionDetectionTrafficBypass(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationIpGroups") @Nullable List<String> destinationIpGroups,
        @CustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.name = name;
        this.protocol = protocol;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    /**
     * @return The description for this bypass traffic setting.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies a list of destination IP addresses that shall be bypassed by intrusion detection.
     * 
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * @return Specifies a list of destination IP groups that shall be bypassed by intrusion detection.
     * 
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }
    /**
     * @return Specifies a list of destination IP ports that shall be bypassed by intrusion detection.
     * 
     */
    public List<String> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * @return The name which should be used for this bypass traffic setting.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The protocols any of &#34;ANY&#34;, &#34;TCP&#34;, &#34;ICMP&#34;, &#34;UDP&#34; that shall be bypassed by intrusion detection.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Specifies a list of source addresses that shall be bypassed by intrusion detection.
     * 
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * @return Specifies a list of source IP groups that shall be bypassed by intrusion detection.
     * 
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionTrafficBypass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private String name;
        private String protocol;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionTrafficBypass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }        public FirewallPolicyIntrusionDetectionTrafficBypass build() {
            return new FirewallPolicyIntrusionDetectionTrafficBypass(description, destinationAddresses, destinationIpGroups, destinationPorts, name, protocol, sourceAddresses, sourceIpGroups);
        }
    }
}
