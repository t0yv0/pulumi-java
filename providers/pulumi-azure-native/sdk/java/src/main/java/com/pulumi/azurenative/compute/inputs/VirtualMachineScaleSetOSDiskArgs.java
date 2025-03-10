// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.CachingTypes;
import com.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import com.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import com.pulumi.azurenative.compute.inputs.DiffDiskSettingsArgs;
import com.pulumi.azurenative.compute.inputs.VirtualHardDiskArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set operating system disk.
 * 
 */
public final class VirtualMachineScaleSetOSDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetOSDiskArgs Empty = new VirtualMachineScaleSetOSDiskArgs();

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @Import(name="caching")
    private @Nullable Output<CachingTypes> caching;

    /**
     * @return Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    public Optional<Output<CachingTypes>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<Either<String,DiskCreateOptionTypes>> createOption;

    /**
     * @return Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    public Output<Either<String,DiskCreateOptionTypes>> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    @Import(name="diffDiskSettings")
    private @Nullable Output<DiffDiskSettingsArgs> diffDiskSettings;

    /**
     * @return Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    public Optional<Output<DiffDiskSettingsArgs>> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    @Import(name="diskSizeGB")
    private @Nullable Output<Integer> diskSizeGB;

    /**
     * @return Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
     * 
     */
    public Optional<Output<Integer>> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    @Import(name="image")
    private @Nullable Output<VirtualHardDiskArgs> image;

    /**
     * @return Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    public Optional<Output<VirtualHardDiskArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The managed disk parameters.
     * 
     */
    @Import(name="managedDisk")
    private @Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk;

    /**
     * @return The managed disk parameters.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetManagedDiskParametersArgs>> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The disk name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    @Import(name="osType")
    private @Nullable Output<OperatingSystemTypes> osType;

    /**
     * @return This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
     * 
     */
    public Optional<Output<OperatingSystemTypes>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    @Import(name="vhdContainers")
    private @Nullable Output<List<String>> vhdContainers;

    /**
     * @return Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    public Optional<Output<List<String>>> vhdContainers() {
        return Optional.ofNullable(this.vhdContainers);
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Output<Boolean> writeAcceleratorEnabled;

    /**
     * @return Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    public Optional<Output<Boolean>> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private VirtualMachineScaleSetOSDiskArgs() {}

    private VirtualMachineScaleSetOSDiskArgs(VirtualMachineScaleSetOSDiskArgs $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.diffDiskSettings = $.diffDiskSettings;
        this.diskSizeGB = $.diskSizeGB;
        this.image = $.image;
        this.managedDisk = $.managedDisk;
        this.name = $.name;
        this.osType = $.osType;
        this.vhdContainers = $.vhdContainers;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetOSDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetOSDiskArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetOSDiskArgs();
        }

        public Builder(VirtualMachineScaleSetOSDiskArgs defaults) {
            $ = new VirtualMachineScaleSetOSDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable Output<CachingTypes> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**
         * 
         * @return builder
         * 
         */
        public Builder caching(CachingTypes caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param createOption Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<Either<String,DiskCreateOptionTypes>> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Either<String,DiskCreateOptionTypes> createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param createOption Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Either.ofLeft(createOption));
        }

        /**
         * @param createOption Specifies how the virtual machines in the scale set should be created.&lt;br&gt;&lt;br&gt; The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
         * 
         * @return builder
         * 
         */
        public Builder createOption(DiskCreateOptionTypes createOption) {
            return createOption(Either.ofRight(createOption));
        }

        /**
         * @param diffDiskSettings Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(@Nullable Output<DiffDiskSettingsArgs> diffDiskSettings) {
            $.diffDiskSettings = diffDiskSettings;
            return this;
        }

        /**
         * @param diffDiskSettings Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(DiffDiskSettingsArgs diffDiskSettings) {
            return diffDiskSettings(Output.of(diffDiskSettings));
        }

        /**
         * @param diskSizeGB Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        /**
         * @param diskSizeGB Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGB(Integer diskSizeGB) {
            return diskSizeGB(Output.of(diskSizeGB));
        }

        /**
         * @param image Specifies information about the unmanaged user image to base the scale set on.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<VirtualHardDiskArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Specifies information about the unmanaged user image to base the scale set on.
         * 
         * @return builder
         * 
         */
        public Builder image(VirtualHardDiskArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param managedDisk The managed disk parameters.
         * 
         * @return builder
         * 
         */
        public Builder managedDisk(@Nullable Output<VirtualMachineScaleSetManagedDiskParametersArgs> managedDisk) {
            $.managedDisk = managedDisk;
            return this;
        }

        /**
         * @param managedDisk The managed disk parameters.
         * 
         * @return builder
         * 
         */
        public Builder managedDisk(VirtualMachineScaleSetManagedDiskParametersArgs managedDisk) {
            return managedDisk(Output.of(managedDisk));
        }

        /**
         * @param name The disk name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The disk name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osType This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<OperatingSystemTypes> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**
         * 
         * @return builder
         * 
         */
        public Builder osType(OperatingSystemTypes osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param vhdContainers Specifies the container urls that are used to store operating system disks for the scale set.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(@Nullable Output<List<String>> vhdContainers) {
            $.vhdContainers = vhdContainers;
            return this;
        }

        /**
         * @param vhdContainers Specifies the container urls that are used to store operating system disks for the scale set.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(List<String> vhdContainers) {
            return vhdContainers(Output.of(vhdContainers));
        }

        /**
         * @param vhdContainers Specifies the container urls that are used to store operating system disks for the scale set.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(String... vhdContainers) {
            return vhdContainers(List.of(vhdContainers));
        }

        /**
         * @param writeAcceleratorEnabled Specifies whether writeAccelerator should be enabled or disabled on the disk.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            $.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        /**
         * @param writeAcceleratorEnabled Specifies whether writeAccelerator should be enabled or disabled on the disk.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
            return writeAcceleratorEnabled(Output.of(writeAcceleratorEnabled));
        }

        public VirtualMachineScaleSetOSDiskArgs build() {
            $.createOption = Objects.requireNonNull($.createOption, "expected parameter 'createOption' to be non-null");
            return $;
        }
    }

}
