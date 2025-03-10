// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.LicenseType;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareCbtDiskInputArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt specific enable migration input.
 * 
 */
public final class VMwareCbtEnableMigrationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareCbtEnableMigrationInputArgs Empty = new VMwareCbtEnableMigrationInputArgs();

    /**
     * The data mover RunAs account Id.
     * 
     */
    @Import(name="dataMoverRunAsAccountId", required=true)
    private Output<String> dataMoverRunAsAccountId;

    /**
     * @return The data mover RunAs account Id.
     * 
     */
    public Output<String> dataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude", required=true)
    private Output<List<VMwareCbtDiskInputArgs>> disksToInclude;

    /**
     * @return The disks to include list.
     * 
     */
    public Output<List<VMwareCbtDiskInputArgs>> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * The class type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return The class type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * License type.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,LicenseType>> licenseType;

    /**
     * @return License type.
     * 
     */
    public Optional<Output<Either<String,LicenseType>>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * The snapshot RunAs account Id.
     * 
     */
    @Import(name="snapshotRunAsAccountId", required=true)
    private Output<String> snapshotRunAsAccountId;

    /**
     * @return The snapshot RunAs account Id.
     * 
     */
    public Output<String> snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    /**
     * The target availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
    private @Nullable Output<String> targetAvailabilitySetId;

    /**
     * @return The target availability set ARM Id.
     * 
     */
    public Optional<Output<String>> targetAvailabilitySetId() {
        return Optional.ofNullable(this.targetAvailabilitySetId);
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @Import(name="targetBootDiagnosticsStorageAccountId")
    private @Nullable Output<String> targetBootDiagnosticsStorageAccountId;

    /**
     * @return The target boot diagnostics storage account ARM Id.
     * 
     */
    public Optional<Output<String>> targetBootDiagnosticsStorageAccountId() {
        return Optional.ofNullable(this.targetBootDiagnosticsStorageAccountId);
    }

    /**
     * The target network ARM Id.
     * 
     */
    @Import(name="targetNetworkId", required=true)
    private Output<String> targetNetworkId;

    /**
     * @return The target network ARM Id.
     * 
     */
    public Output<String> targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * The target resource group ARM Id.
     * 
     */
    @Import(name="targetResourceGroupId", required=true)
    private Output<String> targetResourceGroupId;

    /**
     * @return The target resource group ARM Id.
     * 
     */
    public Output<String> targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * The target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
    private @Nullable Output<String> targetSubnetName;

    /**
     * @return The target subnet name.
     * 
     */
    public Optional<Output<String>> targetSubnetName() {
        return Optional.ofNullable(this.targetSubnetName);
    }

    /**
     * The target VM name.
     * 
     */
    @Import(name="targetVmName")
    private @Nullable Output<String> targetVmName;

    /**
     * @return The target VM name.
     * 
     */
    public Optional<Output<String>> targetVmName() {
        return Optional.ofNullable(this.targetVmName);
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
    private @Nullable Output<String> targetVmSize;

    /**
     * @return The target VM size.
     * 
     */
    public Optional<Output<String>> targetVmSize() {
        return Optional.ofNullable(this.targetVmSize);
    }

    /**
     * The ARM Id of the VM discovered in VMware.
     * 
     */
    @Import(name="vmwareMachineId", required=true)
    private Output<String> vmwareMachineId;

    /**
     * @return The ARM Id of the VM discovered in VMware.
     * 
     */
    public Output<String> vmwareMachineId() {
        return this.vmwareMachineId;
    }

    private VMwareCbtEnableMigrationInputArgs() {}

    private VMwareCbtEnableMigrationInputArgs(VMwareCbtEnableMigrationInputArgs $) {
        this.dataMoverRunAsAccountId = $.dataMoverRunAsAccountId;
        this.disksToInclude = $.disksToInclude;
        this.instanceType = $.instanceType;
        this.licenseType = $.licenseType;
        this.snapshotRunAsAccountId = $.snapshotRunAsAccountId;
        this.targetAvailabilitySetId = $.targetAvailabilitySetId;
        this.targetBootDiagnosticsStorageAccountId = $.targetBootDiagnosticsStorageAccountId;
        this.targetNetworkId = $.targetNetworkId;
        this.targetResourceGroupId = $.targetResourceGroupId;
        this.targetSubnetName = $.targetSubnetName;
        this.targetVmName = $.targetVmName;
        this.targetVmSize = $.targetVmSize;
        this.vmwareMachineId = $.vmwareMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareCbtEnableMigrationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareCbtEnableMigrationInputArgs $;

        public Builder() {
            $ = new VMwareCbtEnableMigrationInputArgs();
        }

        public Builder(VMwareCbtEnableMigrationInputArgs defaults) {
            $ = new VMwareCbtEnableMigrationInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataMoverRunAsAccountId The data mover RunAs account Id.
         * 
         * @return builder
         * 
         */
        public Builder dataMoverRunAsAccountId(Output<String> dataMoverRunAsAccountId) {
            $.dataMoverRunAsAccountId = dataMoverRunAsAccountId;
            return this;
        }

        /**
         * @param dataMoverRunAsAccountId The data mover RunAs account Id.
         * 
         * @return builder
         * 
         */
        public Builder dataMoverRunAsAccountId(String dataMoverRunAsAccountId) {
            return dataMoverRunAsAccountId(Output.of(dataMoverRunAsAccountId));
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(Output<List<VMwareCbtDiskInputArgs>> disksToInclude) {
            $.disksToInclude = disksToInclude;
            return this;
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(List<VMwareCbtDiskInputArgs> disksToInclude) {
            return disksToInclude(Output.of(disksToInclude));
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(VMwareCbtDiskInputArgs... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;VMwareCbt&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;VMwareCbt&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param licenseType License type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<Either<String,LicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType License type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(Either<String,LicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param licenseType License type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Either.ofLeft(licenseType));
        }

        /**
         * @param licenseType License type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(LicenseType licenseType) {
            return licenseType(Either.ofRight(licenseType));
        }

        /**
         * @param snapshotRunAsAccountId The snapshot RunAs account Id.
         * 
         * @return builder
         * 
         */
        public Builder snapshotRunAsAccountId(Output<String> snapshotRunAsAccountId) {
            $.snapshotRunAsAccountId = snapshotRunAsAccountId;
            return this;
        }

        /**
         * @param snapshotRunAsAccountId The snapshot RunAs account Id.
         * 
         * @return builder
         * 
         */
        public Builder snapshotRunAsAccountId(String snapshotRunAsAccountId) {
            return snapshotRunAsAccountId(Output.of(snapshotRunAsAccountId));
        }

        /**
         * @param targetAvailabilitySetId The target availability set ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            $.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        /**
         * @param targetAvailabilitySetId The target availability set ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetAvailabilitySetId(String targetAvailabilitySetId) {
            return targetAvailabilitySetId(Output.of(targetAvailabilitySetId));
        }

        /**
         * @param targetBootDiagnosticsStorageAccountId The target boot diagnostics storage account ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable Output<String> targetBootDiagnosticsStorageAccountId) {
            $.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }

        /**
         * @param targetBootDiagnosticsStorageAccountId The target boot diagnostics storage account ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
            return targetBootDiagnosticsStorageAccountId(Output.of(targetBootDiagnosticsStorageAccountId));
        }

        /**
         * @param targetNetworkId The target network ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetNetworkId(Output<String> targetNetworkId) {
            $.targetNetworkId = targetNetworkId;
            return this;
        }

        /**
         * @param targetNetworkId The target network ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetNetworkId(String targetNetworkId) {
            return targetNetworkId(Output.of(targetNetworkId));
        }

        /**
         * @param targetResourceGroupId The target resource group ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceGroupId(Output<String> targetResourceGroupId) {
            $.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        /**
         * @param targetResourceGroupId The target resource group ARM Id.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            return targetResourceGroupId(Output.of(targetResourceGroupId));
        }

        /**
         * @param targetSubnetName The target subnet name.
         * 
         * @return builder
         * 
         */
        public Builder targetSubnetName(@Nullable Output<String> targetSubnetName) {
            $.targetSubnetName = targetSubnetName;
            return this;
        }

        /**
         * @param targetSubnetName The target subnet name.
         * 
         * @return builder
         * 
         */
        public Builder targetSubnetName(String targetSubnetName) {
            return targetSubnetName(Output.of(targetSubnetName));
        }

        /**
         * @param targetVmName The target VM name.
         * 
         * @return builder
         * 
         */
        public Builder targetVmName(@Nullable Output<String> targetVmName) {
            $.targetVmName = targetVmName;
            return this;
        }

        /**
         * @param targetVmName The target VM name.
         * 
         * @return builder
         * 
         */
        public Builder targetVmName(String targetVmName) {
            return targetVmName(Output.of(targetVmName));
        }

        /**
         * @param targetVmSize The target VM size.
         * 
         * @return builder
         * 
         */
        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            $.targetVmSize = targetVmSize;
            return this;
        }

        /**
         * @param targetVmSize The target VM size.
         * 
         * @return builder
         * 
         */
        public Builder targetVmSize(String targetVmSize) {
            return targetVmSize(Output.of(targetVmSize));
        }

        /**
         * @param vmwareMachineId The ARM Id of the VM discovered in VMware.
         * 
         * @return builder
         * 
         */
        public Builder vmwareMachineId(Output<String> vmwareMachineId) {
            $.vmwareMachineId = vmwareMachineId;
            return this;
        }

        /**
         * @param vmwareMachineId The ARM Id of the VM discovered in VMware.
         * 
         * @return builder
         * 
         */
        public Builder vmwareMachineId(String vmwareMachineId) {
            return vmwareMachineId(Output.of(vmwareMachineId));
        }

        public VMwareCbtEnableMigrationInputArgs build() {
            $.dataMoverRunAsAccountId = Objects.requireNonNull($.dataMoverRunAsAccountId, "expected parameter 'dataMoverRunAsAccountId' to be non-null");
            $.disksToInclude = Objects.requireNonNull($.disksToInclude, "expected parameter 'disksToInclude' to be non-null");
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).require();
            $.snapshotRunAsAccountId = Objects.requireNonNull($.snapshotRunAsAccountId, "expected parameter 'snapshotRunAsAccountId' to be non-null");
            $.targetNetworkId = Objects.requireNonNull($.targetNetworkId, "expected parameter 'targetNetworkId' to be non-null");
            $.targetResourceGroupId = Objects.requireNonNull($.targetResourceGroupId, "expected parameter 'targetResourceGroupId' to be non-null");
            $.vmwareMachineId = Objects.requireNonNull($.vmwareMachineId, "expected parameter 'vmwareMachineId' to be non-null");
            return $;
        }
    }

}
