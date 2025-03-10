// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ImageDataDiskResponse;
import com.pulumi.azurenative.compute.outputs.ImageOSDiskResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageStorageProfileResponse {
    /**
     * @return Specifies the parameters that are used to add a data disk to a virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    private final @Nullable List<ImageDataDiskResponse> dataDisks;
    /**
     * @return Specifies information about the operating system disk used by the virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    private final @Nullable ImageOSDiskResponse osDisk;
    /**
     * @return Specifies whether an image is zone resilient or not. Default is false. Zone resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     */
    private final @Nullable Boolean zoneResilient;

    @CustomType.Constructor
    private ImageStorageProfileResponse(
        @CustomType.Parameter("dataDisks") @Nullable List<ImageDataDiskResponse> dataDisks,
        @CustomType.Parameter("osDisk") @Nullable ImageOSDiskResponse osDisk,
        @CustomType.Parameter("zoneResilient") @Nullable Boolean zoneResilient) {
        this.dataDisks = dataDisks;
        this.osDisk = osDisk;
        this.zoneResilient = zoneResilient;
    }

    /**
     * @return Specifies the parameters that are used to add a data disk to a virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    public List<ImageDataDiskResponse> dataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    /**
     * @return Specifies information about the operating system disk used by the virtual machine. &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    public Optional<ImageOSDiskResponse> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }
    /**
     * @return Specifies whether an image is zone resilient or not. Default is false. Zone resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     */
    public Optional<Boolean> zoneResilient() {
        return Optional.ofNullable(this.zoneResilient);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ImageDataDiskResponse> dataDisks;
        private @Nullable ImageOSDiskResponse osDisk;
        private @Nullable Boolean zoneResilient;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.osDisk = defaults.osDisk;
    	      this.zoneResilient = defaults.zoneResilient;
        }

        public Builder dataDisks(@Nullable List<ImageDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(ImageDataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder osDisk(@Nullable ImageOSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }
        public Builder zoneResilient(@Nullable Boolean zoneResilient) {
            this.zoneResilient = zoneResilient;
            return this;
        }        public ImageStorageProfileResponse build() {
            return new ImageStorageProfileResponse(dataDisks, osDisk, zoneResilient);
        }
    }
}
