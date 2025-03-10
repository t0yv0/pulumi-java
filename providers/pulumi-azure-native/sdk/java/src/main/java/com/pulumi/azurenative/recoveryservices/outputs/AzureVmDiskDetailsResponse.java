// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureVmDiskDetailsResponse {
    /**
     * @return The DiskEncryptionSet ARM ID.
     * 
     */
    private final @Nullable String diskEncryptionSetId;
    /**
     * @return The disk resource id.
     * 
     */
    private final @Nullable String diskId;
    /**
     * @return Ordinal\LunId of the disk for the Azure VM.
     * 
     */
    private final @Nullable String lunId;
    /**
     * @return Max side in MB.
     * 
     */
    private final @Nullable String maxSizeMB;
    /**
     * @return Blob uri of the Azure disk.
     * 
     */
    private final @Nullable String targetDiskLocation;
    /**
     * @return The target Azure disk name.
     * 
     */
    private final @Nullable String targetDiskName;
    /**
     * @return The VHD id.
     * 
     */
    private final @Nullable String vhdId;
    /**
     * @return VHD name.
     * 
     */
    private final @Nullable String vhdName;
    /**
     * @return VHD type.
     * 
     */
    private final @Nullable String vhdType;

    @CustomType.Constructor
    private AzureVmDiskDetailsResponse(
        @CustomType.Parameter("diskEncryptionSetId") @Nullable String diskEncryptionSetId,
        @CustomType.Parameter("diskId") @Nullable String diskId,
        @CustomType.Parameter("lunId") @Nullable String lunId,
        @CustomType.Parameter("maxSizeMB") @Nullable String maxSizeMB,
        @CustomType.Parameter("targetDiskLocation") @Nullable String targetDiskLocation,
        @CustomType.Parameter("targetDiskName") @Nullable String targetDiskName,
        @CustomType.Parameter("vhdId") @Nullable String vhdId,
        @CustomType.Parameter("vhdName") @Nullable String vhdName,
        @CustomType.Parameter("vhdType") @Nullable String vhdType) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskId = diskId;
        this.lunId = lunId;
        this.maxSizeMB = maxSizeMB;
        this.targetDiskLocation = targetDiskLocation;
        this.targetDiskName = targetDiskName;
        this.vhdId = vhdId;
        this.vhdName = vhdName;
        this.vhdType = vhdType;
    }

    /**
     * @return The DiskEncryptionSet ARM ID.
     * 
     */
    public Optional<String> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }
    /**
     * @return The disk resource id.
     * 
     */
    public Optional<String> diskId() {
        return Optional.ofNullable(this.diskId);
    }
    /**
     * @return Ordinal\LunId of the disk for the Azure VM.
     * 
     */
    public Optional<String> lunId() {
        return Optional.ofNullable(this.lunId);
    }
    /**
     * @return Max side in MB.
     * 
     */
    public Optional<String> maxSizeMB() {
        return Optional.ofNullable(this.maxSizeMB);
    }
    /**
     * @return Blob uri of the Azure disk.
     * 
     */
    public Optional<String> targetDiskLocation() {
        return Optional.ofNullable(this.targetDiskLocation);
    }
    /**
     * @return The target Azure disk name.
     * 
     */
    public Optional<String> targetDiskName() {
        return Optional.ofNullable(this.targetDiskName);
    }
    /**
     * @return The VHD id.
     * 
     */
    public Optional<String> vhdId() {
        return Optional.ofNullable(this.vhdId);
    }
    /**
     * @return VHD name.
     * 
     */
    public Optional<String> vhdName() {
        return Optional.ofNullable(this.vhdName);
    }
    /**
     * @return VHD type.
     * 
     */
    public Optional<String> vhdType() {
        return Optional.ofNullable(this.vhdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskEncryptionSetId;
        private @Nullable String diskId;
        private @Nullable String lunId;
        private @Nullable String maxSizeMB;
        private @Nullable String targetDiskLocation;
        private @Nullable String targetDiskName;
        private @Nullable String vhdId;
        private @Nullable String vhdName;
        private @Nullable String vhdType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskId = defaults.diskId;
    	      this.lunId = defaults.lunId;
    	      this.maxSizeMB = defaults.maxSizeMB;
    	      this.targetDiskLocation = defaults.targetDiskLocation;
    	      this.targetDiskName = defaults.targetDiskName;
    	      this.vhdId = defaults.vhdId;
    	      this.vhdName = defaults.vhdName;
    	      this.vhdType = defaults.vhdType;
        }

        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        public Builder diskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder lunId(@Nullable String lunId) {
            this.lunId = lunId;
            return this;
        }
        public Builder maxSizeMB(@Nullable String maxSizeMB) {
            this.maxSizeMB = maxSizeMB;
            return this;
        }
        public Builder targetDiskLocation(@Nullable String targetDiskLocation) {
            this.targetDiskLocation = targetDiskLocation;
            return this;
        }
        public Builder targetDiskName(@Nullable String targetDiskName) {
            this.targetDiskName = targetDiskName;
            return this;
        }
        public Builder vhdId(@Nullable String vhdId) {
            this.vhdId = vhdId;
            return this;
        }
        public Builder vhdName(@Nullable String vhdName) {
            this.vhdName = vhdName;
            return this;
        }
        public Builder vhdType(@Nullable String vhdType) {
            this.vhdType = vhdType;
            return this;
        }        public AzureVmDiskDetailsResponse build() {
            return new AzureVmDiskDetailsResponse(diskEncryptionSetId, diskId, lunId, maxSizeMB, targetDiskLocation, targetDiskName, vhdId, vhdName, vhdType);
        }
    }
}
