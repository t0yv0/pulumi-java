// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAmiBlockDeviceMapping {
    /**
     * @return The physical name of the device.
     * 
     */
    private final String deviceName;
    /**
     * @return Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs[&#34;volume_size&#34;]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    private final Map<String,String> ebs;
    /**
     * @return Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    private final String noDevice;
    /**
     * @return The virtual device name (for instance stores).
     * 
     */
    private final String virtualName;

    @CustomType.Constructor
    private GetAmiBlockDeviceMapping(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("ebs") Map<String,String> ebs,
        @CustomType.Parameter("noDevice") String noDevice,
        @CustomType.Parameter("virtualName") String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * @return The physical name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs[&#34;volume_size&#34;]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    public Map<String,String> ebs() {
        return this.ebs;
    }
    /**
     * @return Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    public String noDevice() {
        return this.noDevice;
    }
    /**
     * @return The virtual device name (for instance stores).
     * 
     */
    public String virtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private Map<String,String> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder ebs(Map<String,String> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }
        public Builder noDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }
        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }        public GetAmiBlockDeviceMapping build() {
            return new GetAmiBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
