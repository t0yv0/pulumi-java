// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.outputs;

import com.pulumi.awsnative.networkfirewall.outputs.FirewallSubnetMapping;
import com.pulumi.awsnative.networkfirewall.outputs.FirewallTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallResult {
    private final @Nullable Boolean deleteProtection;
    private final @Nullable String description;
    private final @Nullable List<String> endpointIds;
    private final @Nullable String firewallArn;
    private final @Nullable String firewallId;
    private final @Nullable String firewallPolicyArn;
    private final @Nullable Boolean firewallPolicyChangeProtection;
    private final @Nullable Boolean subnetChangeProtection;
    private final @Nullable List<FirewallSubnetMapping> subnetMappings;
    private final @Nullable List<FirewallTag> tags;

    @CustomType.Constructor
    private GetFirewallResult(
        @CustomType.Parameter("deleteProtection") @Nullable Boolean deleteProtection,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("endpointIds") @Nullable List<String> endpointIds,
        @CustomType.Parameter("firewallArn") @Nullable String firewallArn,
        @CustomType.Parameter("firewallId") @Nullable String firewallId,
        @CustomType.Parameter("firewallPolicyArn") @Nullable String firewallPolicyArn,
        @CustomType.Parameter("firewallPolicyChangeProtection") @Nullable Boolean firewallPolicyChangeProtection,
        @CustomType.Parameter("subnetChangeProtection") @Nullable Boolean subnetChangeProtection,
        @CustomType.Parameter("subnetMappings") @Nullable List<FirewallSubnetMapping> subnetMappings,
        @CustomType.Parameter("tags") @Nullable List<FirewallTag> tags) {
        this.deleteProtection = deleteProtection;
        this.description = description;
        this.endpointIds = endpointIds;
        this.firewallArn = firewallArn;
        this.firewallId = firewallId;
        this.firewallPolicyArn = firewallPolicyArn;
        this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
        this.subnetChangeProtection = subnetChangeProtection;
        this.subnetMappings = subnetMappings;
        this.tags = tags;
    }

    public Optional<Boolean> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<String> endpointIds() {
        return this.endpointIds == null ? List.of() : this.endpointIds;
    }
    public Optional<String> firewallArn() {
        return Optional.ofNullable(this.firewallArn);
    }
    public Optional<String> firewallId() {
        return Optional.ofNullable(this.firewallId);
    }
    public Optional<String> firewallPolicyArn() {
        return Optional.ofNullable(this.firewallPolicyArn);
    }
    public Optional<Boolean> firewallPolicyChangeProtection() {
        return Optional.ofNullable(this.firewallPolicyChangeProtection);
    }
    public Optional<Boolean> subnetChangeProtection() {
        return Optional.ofNullable(this.subnetChangeProtection);
    }
    public List<FirewallSubnetMapping> subnetMappings() {
        return this.subnetMappings == null ? List.of() : this.subnetMappings;
    }
    public List<FirewallTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteProtection;
        private @Nullable String description;
        private @Nullable List<String> endpointIds;
        private @Nullable String firewallArn;
        private @Nullable String firewallId;
        private @Nullable String firewallPolicyArn;
        private @Nullable Boolean firewallPolicyChangeProtection;
        private @Nullable Boolean subnetChangeProtection;
        private @Nullable List<FirewallSubnetMapping> subnetMappings;
        private @Nullable List<FirewallTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.description = defaults.description;
    	      this.endpointIds = defaults.endpointIds;
    	      this.firewallArn = defaults.firewallArn;
    	      this.firewallId = defaults.firewallId;
    	      this.firewallPolicyArn = defaults.firewallPolicyArn;
    	      this.firewallPolicyChangeProtection = defaults.firewallPolicyChangeProtection;
    	      this.subnetChangeProtection = defaults.subnetChangeProtection;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.tags = defaults.tags;
        }

        public Builder deleteProtection(@Nullable Boolean deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder endpointIds(@Nullable List<String> endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }
        public Builder endpointIds(String... endpointIds) {
            return endpointIds(List.of(endpointIds));
        }
        public Builder firewallArn(@Nullable String firewallArn) {
            this.firewallArn = firewallArn;
            return this;
        }
        public Builder firewallId(@Nullable String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public Builder firewallPolicyArn(@Nullable String firewallPolicyArn) {
            this.firewallPolicyArn = firewallPolicyArn;
            return this;
        }
        public Builder firewallPolicyChangeProtection(@Nullable Boolean firewallPolicyChangeProtection) {
            this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
            return this;
        }
        public Builder subnetChangeProtection(@Nullable Boolean subnetChangeProtection) {
            this.subnetChangeProtection = subnetChangeProtection;
            return this;
        }
        public Builder subnetMappings(@Nullable List<FirewallSubnetMapping> subnetMappings) {
            this.subnetMappings = subnetMappings;
            return this;
        }
        public Builder subnetMappings(FirewallSubnetMapping... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }
        public Builder tags(@Nullable List<FirewallTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(FirewallTag... tags) {
            return tags(List.of(tags));
        }        public GetFirewallResult build() {
            return new GetFirewallResult(deleteProtection, description, endpointIds, firewallArn, firewallId, firewallPolicyArn, firewallPolicyChangeProtection, subnetChangeProtection, subnetMappings, tags);
        }
    }
}
