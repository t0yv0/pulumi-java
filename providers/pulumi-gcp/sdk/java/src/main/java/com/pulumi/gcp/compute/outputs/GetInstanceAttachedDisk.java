// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceAttachedDisk {
    /**
     * @return Name with which the attached disk is accessible
     * under `/dev/disk/by-id/`
     * 
     */
    private final String deviceName;
    private final String diskEncryptionKeyRaw;
    private final String diskEncryptionKeySha256;
    private final String kmsKeySelfLink;
    /**
     * @return Read/write mode for the disk. One of `&#34;READ_ONLY&#34;` or `&#34;READ_WRITE&#34;`.
     * 
     */
    private final String mode;
    /**
     * @return The name or self_link of the disk attached to this instance.
     * 
     */
    private final String source;

    @CustomType.Constructor
    private GetInstanceAttachedDisk(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskEncryptionKeyRaw") String diskEncryptionKeyRaw,
        @CustomType.Parameter("diskEncryptionKeySha256") String diskEncryptionKeySha256,
        @CustomType.Parameter("kmsKeySelfLink") String kmsKeySelfLink,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("source") String source) {
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    /**
     * @return Name with which the attached disk is accessible
     * under `/dev/disk/by-id/`
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    public String diskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw;
    }
    public String diskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256;
    }
    public String kmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }
    /**
     * @return Read/write mode for the disk. One of `&#34;READ_ONLY&#34;` or `&#34;READ_WRITE&#34;`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The name or self_link of the disk attached to this instance.
     * 
     */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAttachedDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String diskEncryptionKeyRaw;
        private String diskEncryptionKeySha256;
        private String kmsKeySelfLink;
        private String mode;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAttachedDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Objects.requireNonNull(diskEncryptionKeyRaw);
            return this;
        }
        public Builder diskEncryptionKeySha256(String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Objects.requireNonNull(diskEncryptionKeySha256);
            return this;
        }
        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public GetInstanceAttachedDisk build() {
            return new GetInstanceAttachedDisk(deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, kmsKeySelfLink, mode, source);
        }
    }
}
