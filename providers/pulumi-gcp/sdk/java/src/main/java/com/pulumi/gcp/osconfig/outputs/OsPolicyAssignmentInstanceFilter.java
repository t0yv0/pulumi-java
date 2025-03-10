// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentInstanceFilterExclusionLabel;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentInstanceFilterInclusionLabel;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentInstanceFilterInventory;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentInstanceFilter {
    /**
     * @return Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    private final @Nullable Boolean all;
    /**
     * @return List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    private final @Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabel> exclusionLabels;
    /**
     * @return List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    private final @Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabel> inclusionLabels;
    /**
     * @return List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    private final @Nullable List<OsPolicyAssignmentInstanceFilterInventory> inventories;

    @CustomType.Constructor
    private OsPolicyAssignmentInstanceFilter(
        @CustomType.Parameter("all") @Nullable Boolean all,
        @CustomType.Parameter("exclusionLabels") @Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabel> exclusionLabels,
        @CustomType.Parameter("inclusionLabels") @Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabel> inclusionLabels,
        @CustomType.Parameter("inventories") @Nullable List<OsPolicyAssignmentInstanceFilterInventory> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    /**
     * @return Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    public List<OsPolicyAssignmentInstanceFilterExclusionLabel> exclusionLabels() {
        return this.exclusionLabels == null ? List.of() : this.exclusionLabels;
    }
    /**
     * @return List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    public List<OsPolicyAssignmentInstanceFilterInclusionLabel> inclusionLabels() {
        return this.inclusionLabels == null ? List.of() : this.inclusionLabels;
    }
    /**
     * @return List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    public List<OsPolicyAssignmentInstanceFilterInventory> inventories() {
        return this.inventories == null ? List.of() : this.inventories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean all;
        private @Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabel> exclusionLabels;
        private @Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabel> inclusionLabels;
        private @Nullable List<OsPolicyAssignmentInstanceFilterInventory> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = all;
            return this;
        }
        public Builder exclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabel> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }
        public Builder exclusionLabels(OsPolicyAssignmentInstanceFilterExclusionLabel... exclusionLabels) {
            return exclusionLabels(List.of(exclusionLabels));
        }
        public Builder inclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabel> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }
        public Builder inclusionLabels(OsPolicyAssignmentInstanceFilterInclusionLabel... inclusionLabels) {
            return inclusionLabels(List.of(inclusionLabels));
        }
        public Builder inventories(@Nullable List<OsPolicyAssignmentInstanceFilterInventory> inventories) {
            this.inventories = inventories;
            return this;
        }
        public Builder inventories(OsPolicyAssignmentInstanceFilterInventory... inventories) {
            return inventories(List.of(inventories));
        }        public OsPolicyAssignmentInstanceFilter build() {
            return new OsPolicyAssignmentInstanceFilter(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
