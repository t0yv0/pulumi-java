// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.notebooks_v1.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DiskResponse {
    /**
     * @return Indicates whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * @return Indicates a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine.This field is only applicable for persistent disks.
     * 
     */
    private final String deviceName;
    /**
     * @return Indicates the size of the disk in base-2 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * @return Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    private final String index;
    /**
     * @return Indicates the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
     * 
     */
    private final String interface_;
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use. A License represents billing and aggregate usage data for public and marketplace images.
     * 
     */
    private final List<String> licenses;
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    private final String mode;
    /**
     * @return Indicates a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    private final String source;
    /**
     * @return Indicates the type of the disk, either SCRATCH or PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") String index,
        @CustomType.Parameter("interface") String interface_,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskSizeGb = diskSizeGb;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    /**
     * @return Indicates whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Boolean boot() {
        return this.boot;
    }
    /**
     * @return Indicates a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine.This field is only applicable for persistent disks.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Indicates the size of the disk in base-2 GB.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    public String index() {
        return this.index;
    }
    /**
     * @return Indicates the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use. A License represents billing and aggregate usage data for public and marketplace images.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Indicates a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return Indicates the type of the disk, either SCRATCH or PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private String diskSizeGb;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private String index;
        private String interface_;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DiskResponse build() {
            return new DiskResponse(autoDelete, boot, deviceName, diskSizeGb, guestOsFeatures, index, interface_, kind, licenses, mode, source, type);
        }
    }
}
