// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GuestOsFeatureResponse {
    /**
     * @return The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GuestOsFeatureResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * @return The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOsFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOsFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GuestOsFeatureResponse build() {
            return new GuestOsFeatureResponse(type);
        }
    }
}
