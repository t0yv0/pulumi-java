// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.inputs.MABContainerHealthDetailsArgs;
import com.pulumi.azurenative.recoveryservices.inputs.MabContainerExtendedInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container with items backed up using MAB backup engine.
 * 
 */
public final class MabContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final MabContainerArgs Empty = new MabContainerArgs();

    /**
     * Agent version of this container.
     * 
     */
    @Import(name="agentVersion")
    private @Nullable Output<String> agentVersion;

    /**
     * @return Agent version of this container.
     * 
     */
    public Optional<Output<String>> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    /**
     * @return Type of backup management for the container.
     * 
     */
    public Optional<Output<Either<String,BackupManagementType>>> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Can the container be registered one more time.
     * 
     */
    @Import(name="canReRegister")
    private @Nullable Output<Boolean> canReRegister;

    /**
     * @return Can the container be registered one more time.
     * 
     */
    public Optional<Output<Boolean>> canReRegister() {
        return Optional.ofNullable(this.canReRegister);
    }

    /**
     * Health state of mab container.
     * 
     */
    @Import(name="containerHealthState")
    private @Nullable Output<String> containerHealthState;

    /**
     * @return Health state of mab container.
     * 
     */
    public Optional<Output<String>> containerHealthState() {
        return Optional.ofNullable(this.containerHealthState);
    }

    /**
     * ContainerID represents the container.
     * 
     */
    @Import(name="containerId")
    private @Nullable Output<Double> containerId;

    /**
     * @return ContainerID represents the container.
     * 
     */
    public Optional<Output<Double>> containerId() {
        return Optional.ofNullable(this.containerId);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;Windows&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private Output<String> containerType;

    /**
     * @return Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;Windows&#39;.
     * 
     */
    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Additional information for this container
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable Output<MabContainerExtendedInfoArgs> extendedInfo;

    /**
     * @return Additional information for this container
     * 
     */
    public Optional<Output<MabContainerExtendedInfoArgs>> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Friendly name of the container.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable Output<String> healthStatus;

    /**
     * @return Status of health of the container.
     * 
     */
    public Optional<Output<String>> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Health details on this mab container.
     * 
     */
    @Import(name="mabContainerHealthDetails")
    private @Nullable Output<List<MABContainerHealthDetailsArgs>> mabContainerHealthDetails;

    /**
     * @return Health details on this mab container.
     * 
     */
    public Optional<Output<List<MABContainerHealthDetailsArgs>>> mabContainerHealthDetails() {
        return Optional.ofNullable(this.mabContainerHealthDetails);
    }

    /**
     * Number of items backed up in this container.
     * 
     */
    @Import(name="protectedItemCount")
    private @Nullable Output<Double> protectedItemCount;

    /**
     * @return Number of items backed up in this container.
     * 
     */
    public Optional<Output<Double>> protectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable Output<String> registrationStatus;

    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<Output<String>> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    private MabContainerArgs() {}

    private MabContainerArgs(MabContainerArgs $) {
        this.agentVersion = $.agentVersion;
        this.backupManagementType = $.backupManagementType;
        this.canReRegister = $.canReRegister;
        this.containerHealthState = $.containerHealthState;
        this.containerId = $.containerId;
        this.containerType = $.containerType;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.mabContainerHealthDetails = $.mabContainerHealthDetails;
        this.protectedItemCount = $.protectedItemCount;
        this.registrationStatus = $.registrationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MabContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MabContainerArgs $;

        public Builder() {
            $ = new MabContainerArgs();
        }

        public Builder(MabContainerArgs defaults) {
            $ = new MabContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentVersion Agent version of this container.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        /**
         * @param agentVersion Agent version of this container.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(String agentVersion) {
            return agentVersion(Output.of(agentVersion));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(Either<String,BackupManagementType> backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(String backupManagementType) {
            return backupManagementType(Either.ofLeft(backupManagementType));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(BackupManagementType backupManagementType) {
            return backupManagementType(Either.ofRight(backupManagementType));
        }

        /**
         * @param canReRegister Can the container be registered one more time.
         * 
         * @return builder
         * 
         */
        public Builder canReRegister(@Nullable Output<Boolean> canReRegister) {
            $.canReRegister = canReRegister;
            return this;
        }

        /**
         * @param canReRegister Can the container be registered one more time.
         * 
         * @return builder
         * 
         */
        public Builder canReRegister(Boolean canReRegister) {
            return canReRegister(Output.of(canReRegister));
        }

        /**
         * @param containerHealthState Health state of mab container.
         * 
         * @return builder
         * 
         */
        public Builder containerHealthState(@Nullable Output<String> containerHealthState) {
            $.containerHealthState = containerHealthState;
            return this;
        }

        /**
         * @param containerHealthState Health state of mab container.
         * 
         * @return builder
         * 
         */
        public Builder containerHealthState(String containerHealthState) {
            return containerHealthState(Output.of(containerHealthState));
        }

        /**
         * @param containerId ContainerID represents the container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(@Nullable Output<Double> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId ContainerID represents the container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Double containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;Windows&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(Output<String> containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;Windows&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            return containerType(Output.of(containerType));
        }

        /**
         * @param extendedInfo Additional information for this container
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(@Nullable Output<MabContainerExtendedInfoArgs> extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        /**
         * @param extendedInfo Additional information for this container
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(MabContainerExtendedInfoArgs extendedInfo) {
            return extendedInfo(Output.of(extendedInfo));
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(String healthStatus) {
            return healthStatus(Output.of(healthStatus));
        }

        /**
         * @param mabContainerHealthDetails Health details on this mab container.
         * 
         * @return builder
         * 
         */
        public Builder mabContainerHealthDetails(@Nullable Output<List<MABContainerHealthDetailsArgs>> mabContainerHealthDetails) {
            $.mabContainerHealthDetails = mabContainerHealthDetails;
            return this;
        }

        /**
         * @param mabContainerHealthDetails Health details on this mab container.
         * 
         * @return builder
         * 
         */
        public Builder mabContainerHealthDetails(List<MABContainerHealthDetailsArgs> mabContainerHealthDetails) {
            return mabContainerHealthDetails(Output.of(mabContainerHealthDetails));
        }

        /**
         * @param mabContainerHealthDetails Health details on this mab container.
         * 
         * @return builder
         * 
         */
        public Builder mabContainerHealthDetails(MABContainerHealthDetailsArgs... mabContainerHealthDetails) {
            return mabContainerHealthDetails(List.of(mabContainerHealthDetails));
        }

        /**
         * @param protectedItemCount Number of items backed up in this container.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemCount(@Nullable Output<Double> protectedItemCount) {
            $.protectedItemCount = protectedItemCount;
            return this;
        }

        /**
         * @param protectedItemCount Number of items backed up in this container.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemCount(Double protectedItemCount) {
            return protectedItemCount(Output.of(protectedItemCount));
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(String registrationStatus) {
            return registrationStatus(Output.of(registrationStatus));
        }

        public MabContainerArgs build() {
            $.containerType = Codegen.stringProp("containerType").output().arg($.containerType).require();
            return $;
        }
    }

}
