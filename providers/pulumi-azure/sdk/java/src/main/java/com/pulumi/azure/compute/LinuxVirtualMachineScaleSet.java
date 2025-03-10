// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs;
import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetState;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetAdditionalCapabilities;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetAdminSshKey;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetAutomaticInstanceRepair;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetBootDiagnostics;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetDataDisk;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetExtension;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetIdentity;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetNetworkInterface;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetOsDisk;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetPlan;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetRollingUpgradePolicy;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetSecret;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetSourceImageReference;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetTerminateNotification;
import com.pulumi.azure.compute.outputs.LinuxVirtualMachineScaleSetTerminationNotification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linux Virtual Machine Scale Set.
 * 
 * ## Disclaimers
 * 
 * &gt; **NOTE:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * &gt; **NOTE:** This provider will automatically update &amp; reimage the nodes in the Scale Set (if Required) during an Update - this behaviour can be configured using the `features` setting within the Provider block.
 * 
 * ## Example Usage
 * 
 * This example provisions a basic Linux Virtual Machine Scale Set on an internal network.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var internal = new Subnet(&#34;internal&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleLinuxVirtualMachineScaleSet = new LinuxVirtualMachineScaleSet(&#34;exampleLinuxVirtualMachineScaleSet&#34;, LinuxVirtualMachineScaleSetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(&#34;Standard_F2&#34;)
 *             .instances(1)
 *             .adminUsername(&#34;adminuser&#34;)
 *             .adminSshKeys(LinuxVirtualMachineScaleSetAdminSshKey.builder()
 *                 .username(&#34;adminuser&#34;)
 *                 .publicKey(Files.readString(&#34;~/.ssh/id_rsa.pub&#34;))
 *                 .build())
 *             .sourceImageReference(LinuxVirtualMachineScaleSetSourceImageReference.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;UbuntuServer&#34;)
 *                 .sku(&#34;16.04-LTS&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .osDisk(LinuxVirtualMachineScaleSetOsDisk.builder()
 *                 .storageAccountType(&#34;Standard_LRS&#34;)
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .build())
 *             .networkInterfaces(LinuxVirtualMachineScaleSetNetworkInterface.builder()
 *                 .name(&#34;example&#34;)
 *                 .primary(true)
 *                 .ipConfigurations(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfiguration.builder()
 *                     .name(&#34;internal&#34;)
 *                     .primary(true)
 *                     .subnetId(internal.getId())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linux Virtual Machine Scale Sets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/linuxVirtualMachineScaleSet:LinuxVirtualMachineScaleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachineScaleSets/scaleset1
 * ```
 * 
 */
@ResourceType(type="azure:compute/linuxVirtualMachineScaleSet:LinuxVirtualMachineScaleSet")
public class LinuxVirtualMachineScaleSet extends com.pulumi.resources.CustomResource {
    /**
     * A `additional_capabilities` block as defined below.
     * 
     */
    @Export(name="additionalCapabilities", type=LinuxVirtualMachineScaleSetAdditionalCapabilities.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetAdditionalCapabilities> additionalCapabilities;

    /**
     * @return A `additional_capabilities` block as defined below.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetAdditionalCapabilities>> additionalCapabilities() {
        return Codegen.optional(this.additionalCapabilities);
    }
    /**
     * The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="adminPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> adminPassword;

    /**
     * @return The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> adminPassword() {
        return Codegen.optional(this.adminPassword);
    }
    /**
     * One or more `admin_ssh_key` blocks as defined below.
     * 
     */
    @Export(name="adminSshKeys", type=List.class, parameters={LinuxVirtualMachineScaleSetAdminSshKey.class})
    private Output</* @Nullable */ List<LinuxVirtualMachineScaleSetAdminSshKey>> adminSshKeys;

    /**
     * @return One or more `admin_ssh_key` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxVirtualMachineScaleSetAdminSshKey>>> adminSshKeys() {
        return Codegen.optional(this.adminSshKeys);
    }
    /**
     * The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="adminUsername", type=String.class, parameters={})
    private Output<String> adminUsername;

    /**
     * @return The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> adminUsername() {
        return this.adminUsername;
    }
    /**
     * A `automatic_instance_repair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `health_probe_id` or an [Application Health Extension](https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     */
    @Export(name="automaticInstanceRepair", type=LinuxVirtualMachineScaleSetAutomaticInstanceRepair.class, parameters={})
    private Output<LinuxVirtualMachineScaleSetAutomaticInstanceRepair> automaticInstanceRepair;

    /**
     * @return A `automatic_instance_repair` block as defined below. To enable the automatic instance repair, this Virtual Machine Scale Set must have a valid `health_probe_id` or an [Application Health Extension](https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-health-extension).
     * 
     */
    public Output<LinuxVirtualMachineScaleSetAutomaticInstanceRepair> automaticInstanceRepair() {
        return this.automaticInstanceRepair;
    }
    /**
     * A `automatic_os_upgrade_policy` block as defined below. This can only be specified when `upgrade_mode` is set to `Automatic`.
     * 
     */
    @Export(name="automaticOsUpgradePolicy", type=LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy> automaticOsUpgradePolicy;

    /**
     * @return A `automatic_os_upgrade_policy` block as defined below. This can only be specified when `upgrade_mode` is set to `Automatic`.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicy>> automaticOsUpgradePolicy() {
        return Codegen.optional(this.automaticOsUpgradePolicy);
    }
    /**
     * A `boot_diagnostics` block as defined below.
     * 
     */
    @Export(name="bootDiagnostics", type=LinuxVirtualMachineScaleSetBootDiagnostics.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetBootDiagnostics> bootDiagnostics;

    /**
     * @return A `boot_diagnostics` block as defined below.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetBootDiagnostics>> bootDiagnostics() {
        return Codegen.optional(this.bootDiagnostics);
    }
    /**
     * The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`.
     * 
     */
    @Export(name="computerNamePrefix", type=String.class, parameters={})
    private Output<String> computerNamePrefix;

    /**
     * @return The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`.
     * 
     */
    public Output<String> computerNamePrefix() {
        return this.computerNamePrefix;
    }
    /**
     * The Base64-Encoded Custom Data which should be used for this Virtual Machine Scale Set.
     * 
     */
    @Export(name="customData", type=String.class, parameters={})
    private Output</* @Nullable */ String> customData;

    /**
     * @return The Base64-Encoded Custom Data which should be used for this Virtual Machine Scale Set.
     * 
     */
    public Output<Optional<String>> customData() {
        return Codegen.optional(this.customData);
    }
    /**
     * One or more `data_disk` blocks as defined below.
     * 
     */
    @Export(name="dataDisks", type=List.class, parameters={LinuxVirtualMachineScaleSetDataDisk.class})
    private Output</* @Nullable */ List<LinuxVirtualMachineScaleSetDataDisk>> dataDisks;

    /**
     * @return One or more `data_disk` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxVirtualMachineScaleSetDataDisk>>> dataDisks() {
        return Codegen.optional(this.dataDisks);
    }
    /**
     * Should Password Authentication be disabled on this Virtual Machine Scale Set? Defaults to `true`.
     * 
     */
    @Export(name="disablePasswordAuthentication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disablePasswordAuthentication;

    /**
     * @return Should Password Authentication be disabled on this Virtual Machine Scale Set? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> disablePasswordAuthentication() {
        return Codegen.optional(this.disablePasswordAuthentication);
    }
    /**
     * Should Virtual Machine Extensions be run on Overprovisioned Virtual Machines in the Scale Set? Defaults to `false`.
     * 
     */
    @Export(name="doNotRunExtensionsOnOverprovisionedMachines", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> doNotRunExtensionsOnOverprovisionedMachines;

    /**
     * @return Should Virtual Machine Extensions be run on Overprovisioned Virtual Machines in the Scale Set? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> doNotRunExtensionsOnOverprovisionedMachines() {
        return Codegen.optional(this.doNotRunExtensionsOnOverprovisionedMachines);
    }
    /**
     * Specifies the Edge Zone within the Azure Region where this Linux Virtual Machine Scale Set should exist. Changing this forces a new Linux Virtual Machine Scale Set to be created.
     * 
     */
    @Export(name="edgeZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> edgeZone;

    /**
     * @return Specifies the Edge Zone within the Azure Region where this Linux Virtual Machine Scale Set should exist. Changing this forces a new Linux Virtual Machine Scale Set to be created.
     * 
     */
    public Output<Optional<String>> edgeZone() {
        return Codegen.optional(this.edgeZone);
    }
    /**
     * Should all of the disks (including the temp disk) attached to this Virtual Machine be encrypted by enabling Encryption at Host?
     * 
     */
    @Export(name="encryptionAtHostEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryptionAtHostEnabled;

    /**
     * @return Should all of the disks (including the temp disk) attached to this Virtual Machine be encrypted by enabling Encryption at Host?
     * 
     */
    public Output<Optional<Boolean>> encryptionAtHostEnabled() {
        return Codegen.optional(this.encryptionAtHostEnabled);
    }
    /**
     * The Policy which should be used Virtual Machines are Evicted from the Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return The Policy which should be used Virtual Machines are Evicted from the Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> evictionPolicy() {
        return Codegen.optional(this.evictionPolicy);
    }
    /**
     * One or more `extension` blocks as defined below
     * 
     */
    @Export(name="extensions", type=List.class, parameters={LinuxVirtualMachineScaleSetExtension.class})
    private Output<List<LinuxVirtualMachineScaleSetExtension>> extensions;

    /**
     * @return One or more `extension` blocks as defined below
     * 
     */
    public Output<List<LinuxVirtualMachineScaleSetExtension>> extensions() {
        return this.extensions;
    }
    /**
     * Specifies the duration allocated for all extensions to start. The time duration should be between `15` minutes and `120` minutes (inclusive) and should be specified in ISO 8601 format. Defaults to `90` minutes (`PT1H30M`).
     * 
     */
    @Export(name="extensionsTimeBudget", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionsTimeBudget;

    /**
     * @return Specifies the duration allocated for all extensions to start. The time duration should be between `15` minutes and `120` minutes (inclusive) and should be specified in ISO 8601 format. Defaults to `90` minutes (`PT1H30M`).
     * 
     */
    public Output<Optional<String>> extensionsTimeBudget() {
        return Codegen.optional(this.extensionsTimeBudget);
    }
    /**
     * The ID of a Load Balancer Probe which should be used to determine the health of an instance. This is Required and can only be specified when `upgrade_mode` is set to `Automatic` or `Rolling`.
     * 
     */
    @Export(name="healthProbeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthProbeId;

    /**
     * @return The ID of a Load Balancer Probe which should be used to determine the health of an instance. This is Required and can only be specified when `upgrade_mode` is set to `Automatic` or `Rolling`.
     * 
     */
    public Output<Optional<String>> healthProbeId() {
        return Codegen.optional(this.healthProbeId);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=LinuxVirtualMachineScaleSetIdentity.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The number of Virtual Machines in the Scale Set.
     * 
     */
    @Export(name="instances", type=Integer.class, parameters={})
    private Output<Integer> instances;

    /**
     * @return The number of Virtual Machines in the Scale Set.
     * 
     */
    public Output<Integer> instances() {
        return this.instances;
    }
    /**
     * The Azure location where the Linux Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure location where the Linux Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The maximum price you&#39;re willing to pay for each Virtual Machine in this Scale Set, in US Dollars; which must be greater than the current spot price. If this bid price falls below the current spot price the Virtual Machines in the Scale Set will be evicted using the `eviction_policy`. Defaults to `-1`, which means that each Virtual Machine in this Scale Set should not be evicted for price reasons.
     * 
     */
    @Export(name="maxBidPrice", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxBidPrice;

    /**
     * @return The maximum price you&#39;re willing to pay for each Virtual Machine in this Scale Set, in US Dollars; which must be greater than the current spot price. If this bid price falls below the current spot price the Virtual Machines in the Scale Set will be evicted using the `eviction_policy`. Defaults to `-1`, which means that each Virtual Machine in this Scale Set should not be evicted for price reasons.
     * 
     */
    public Output<Optional<Double>> maxBidPrice() {
        return Codegen.optional(this.maxBidPrice);
    }
    /**
     * The name of the Linux Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Linux Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `network_interface` blocks as defined below.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={LinuxVirtualMachineScaleSetNetworkInterface.class})
    private Output<List<LinuxVirtualMachineScaleSetNetworkInterface>> networkInterfaces;

    /**
     * @return One or more `network_interface` blocks as defined below.
     * 
     */
    public Output<List<LinuxVirtualMachineScaleSetNetworkInterface>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * An `os_disk` block as defined below.
     * 
     */
    @Export(name="osDisk", type=LinuxVirtualMachineScaleSetOsDisk.class, parameters={})
    private Output<LinuxVirtualMachineScaleSetOsDisk> osDisk;

    /**
     * @return An `os_disk` block as defined below.
     * 
     */
    public Output<LinuxVirtualMachineScaleSetOsDisk> osDisk() {
        return this.osDisk;
    }
    /**
     * Should Azure over-provision Virtual Machines in this Scale Set? This means that multiple Virtual Machines will be provisioned and Azure will keep the instances which become available first - which improves provisioning success rates and improves deployment time. You&#39;re not billed for these over-provisioned VM&#39;s and they don&#39;t count towards the Subscription Quota. Defaults to `true`.
     * 
     */
    @Export(name="overprovision", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overprovision;

    /**
     * @return Should Azure over-provision Virtual Machines in this Scale Set? This means that multiple Virtual Machines will be provisioned and Azure will keep the instances which become available first - which improves provisioning success rates and improves deployment time. You&#39;re not billed for these over-provisioned VM&#39;s and they don&#39;t count towards the Subscription Quota. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> overprovision() {
        return Codegen.optional(this.overprovision);
    }
    /**
     * A `plan` block as documented below.
     * 
     */
    @Export(name="plan", type=LinuxVirtualMachineScaleSetPlan.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetPlan> plan;

    /**
     * @return A `plan` block as documented below.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetPlan>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * Specifies the number of fault domains that are used by this Linux Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output<Integer> platformFaultDomainCount;

    /**
     * @return Specifies the number of fault domains that are used by this Linux Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    /**
     * The Priority of this Virtual Machine Scale Set. Possible values are `Regular` and `Spot`. Defaults to `Regular`. Changing this value forces a new resource.
     * 
     */
    @Export(name="priority", type=String.class, parameters={})
    private Output</* @Nullable */ String> priority;

    /**
     * @return The Priority of this Virtual Machine Scale Set. Possible values are `Regular` and `Spot`. Defaults to `Regular`. Changing this value forces a new resource.
     * 
     */
    public Output<Optional<String>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
     * 
     */
    @Export(name="provisionVmAgent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> provisionVmAgent;

    /**
     * @return Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> provisionVmAgent() {
        return Codegen.optional(this.provisionVmAgent);
    }
    /**
     * The ID of the Proximity Placement Group in which the Virtual Machine Scale Set should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="proximityPlacementGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group in which the Virtual Machine Scale Set should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupId() {
        return Codegen.optional(this.proximityPlacementGroupId);
    }
    /**
     * The name of the Resource Group in which the Linux Virtual Machine Scale Set should be exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Linux Virtual Machine Scale Set should be exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `rolling_upgrade_policy` block as defined below. This is Required and can only be specified when `upgrade_mode` is set to `Automatic` or `Rolling`.
     * 
     */
    @Export(name="rollingUpgradePolicy", type=LinuxVirtualMachineScaleSetRollingUpgradePolicy.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetRollingUpgradePolicy> rollingUpgradePolicy;

    /**
     * @return A `rolling_upgrade_policy` block as defined below. This is Required and can only be specified when `upgrade_mode` is set to `Automatic` or `Rolling`.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetRollingUpgradePolicy>> rollingUpgradePolicy() {
        return Codegen.optional(this.rollingUpgradePolicy);
    }
    /**
     * The scale-in policy rule that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled in. Possible values for the scale-in policy rules are `Default`, `NewestVM` and `OldestVM`, defaults to `Default`. For more information about scale in policy, please [refer to this doc](https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-scale-in-policy).
     * 
     */
    @Export(name="scaleInPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> scaleInPolicy;

    /**
     * @return The scale-in policy rule that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled in. Possible values for the scale-in policy rules are `Default`, `NewestVM` and `OldestVM`, defaults to `Default`. For more information about scale in policy, please [refer to this doc](https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-scale-in-policy).
     * 
     */
    public Output<Optional<String>> scaleInPolicy() {
        return Codegen.optional(this.scaleInPolicy);
    }
    /**
     * One or more `secret` blocks as defined below.
     * 
     */
    @Export(name="secrets", type=List.class, parameters={LinuxVirtualMachineScaleSetSecret.class})
    private Output</* @Nullable */ List<LinuxVirtualMachineScaleSetSecret>> secrets;

    /**
     * @return One or more `secret` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxVirtualMachineScaleSetSecret>>> secrets() {
        return Codegen.optional(this.secrets);
    }
    /**
     * Specifies whether secure boot should be enabled on the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="secureBootEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> secureBootEnabled;

    /**
     * @return Specifies whether secure boot should be enabled on the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> secureBootEnabled() {
        return Codegen.optional(this.secureBootEnabled);
    }
    /**
     * Should this Virtual Machine Scale Set be limited to a Single Placement Group, which means the number of instances will be capped at 100 Virtual Machines. Defaults to `true`.
     * 
     */
    @Export(name="singlePlacementGroup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> singlePlacementGroup;

    /**
     * @return Should this Virtual Machine Scale Set be limited to a Single Placement Group, which means the number of instances will be capped at 100 Virtual Machines. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> singlePlacementGroup() {
        return Codegen.optional(this.singlePlacementGroup);
    }
    /**
     * The Virtual Machine SKU for the Scale Set, such as `Standard_F2`.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output<String> sku;

    /**
     * @return The Virtual Machine SKU for the Scale Set, such as `Standard_F2`.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }
    /**
     * The ID of an Image which each Virtual Machine in this Scale Set should be based on.
     * 
     */
    @Export(name="sourceImageId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceImageId;

    /**
     * @return The ID of an Image which each Virtual Machine in this Scale Set should be based on.
     * 
     */
    public Output<Optional<String>> sourceImageId() {
        return Codegen.optional(this.sourceImageId);
    }
    /**
     * A `source_image_reference` block as defined below.
     * 
     */
    @Export(name="sourceImageReference", type=LinuxVirtualMachineScaleSetSourceImageReference.class, parameters={})
    private Output</* @Nullable */ LinuxVirtualMachineScaleSetSourceImageReference> sourceImageReference;

    /**
     * @return A `source_image_reference` block as defined below.
     * 
     */
    public Output<Optional<LinuxVirtualMachineScaleSetSourceImageReference>> sourceImageReference() {
        return Codegen.optional(this.sourceImageReference);
    }
    /**
     * A mapping of tags which should be assigned to this Virtual Machine Scale Set.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to this Virtual Machine Scale Set.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A `terminate_notification` block as defined below.
     * 
     * @deprecated
     * `terminate_notification` has been renamed to `termination_notification` and will be removed in 4.0.
     * 
     */
    @Deprecated /* `terminate_notification` has been renamed to `termination_notification` and will be removed in 4.0. */
    @Export(name="terminateNotification", type=LinuxVirtualMachineScaleSetTerminateNotification.class, parameters={})
    private Output<LinuxVirtualMachineScaleSetTerminateNotification> terminateNotification;

    /**
     * @return A `terminate_notification` block as defined below.
     * 
     */
    public Output<LinuxVirtualMachineScaleSetTerminateNotification> terminateNotification() {
        return this.terminateNotification;
    }
    /**
     * A `termination_notification` block as defined below.
     * 
     */
    @Export(name="terminationNotification", type=LinuxVirtualMachineScaleSetTerminationNotification.class, parameters={})
    private Output<LinuxVirtualMachineScaleSetTerminationNotification> terminationNotification;

    /**
     * @return A `termination_notification` block as defined below.
     * 
     */
    public Output<LinuxVirtualMachineScaleSetTerminationNotification> terminationNotification() {
        return this.terminationNotification;
    }
    /**
     * The Unique ID for this Linux Virtual Machine Scale Set.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return The Unique ID for this Linux Virtual Machine Scale Set.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }
    /**
     * Specifies how Upgrades (e.g. changing the Image/SKU) should be performed to Virtual Machine Instances. Possible values are `Automatic`, `Manual` and `Rolling`. Defaults to `Manual`.
     * 
     */
    @Export(name="upgradeMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> upgradeMode;

    /**
     * @return Specifies how Upgrades (e.g. changing the Image/SKU) should be performed to Virtual Machine Instances. Possible values are `Automatic`, `Manual` and `Rolling`. Defaults to `Manual`.
     * 
     */
    public Output<Optional<String>> upgradeMode() {
        return Codegen.optional(this.upgradeMode);
    }
    /**
     * The Base64-Encoded User Data which should be used for this Virtual Machine Scale Set.
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return The Base64-Encoded User Data which should be used for this Virtual Machine Scale Set.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    /**
     * Specifies whether vTPM should be enabled on the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vtpmEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> vtpmEnabled;

    /**
     * @return Specifies whether vTPM should be enabled on the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> vtpmEnabled() {
        return Codegen.optional(this.vtpmEnabled);
    }
    /**
     * Should the Virtual Machines in this Scale Set be strictly evenly distributed across Availability Zones? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneBalance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneBalance;

    /**
     * @return Should the Virtual Machines in this Scale Set be strictly evenly distributed across Availability Zones? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> zoneBalance() {
        return Codegen.optional(this.zoneBalance);
    }
    /**
     * Specifies a list of Availability Zones in which this Linux Virtual Machine Scale Set should be located. Changing this forces a new Linux Virtual Machine Scale Set to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Linux Virtual Machine Scale Set should be located. Changing this forces a new Linux Virtual Machine Scale Set to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinuxVirtualMachineScaleSet(String name) {
        this(name, LinuxVirtualMachineScaleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinuxVirtualMachineScaleSet(String name, LinuxVirtualMachineScaleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinuxVirtualMachineScaleSet(String name, LinuxVirtualMachineScaleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/linuxVirtualMachineScaleSet:LinuxVirtualMachineScaleSet", name, args == null ? LinuxVirtualMachineScaleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinuxVirtualMachineScaleSet(String name, Output<String> id, @Nullable LinuxVirtualMachineScaleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/linuxVirtualMachineScaleSet:LinuxVirtualMachineScaleSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinuxVirtualMachineScaleSet get(String name, Output<String> id, @Nullable LinuxVirtualMachineScaleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinuxVirtualMachineScaleSet(name, id, state, options);
    }
}
