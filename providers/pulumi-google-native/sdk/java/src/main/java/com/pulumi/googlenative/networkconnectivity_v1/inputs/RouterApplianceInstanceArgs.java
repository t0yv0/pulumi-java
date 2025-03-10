// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A router appliance instance is a Compute Engine virtual machine (VM) instance that acts as a BGP speaker. A router appliance instance is specified by the URI of the VM and the internal IP address of one of the VM&#39;s network interfaces.
 * 
 */
public final class RouterApplianceInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterApplianceInstanceArgs Empty = new RouterApplianceInstanceArgs();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address on the VM to use for peering.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The URI of the VM.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<String> virtualMachine;

    /**
     * @return The URI of the VM.
     * 
     */
    public Optional<Output<String>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private RouterApplianceInstanceArgs() {}

    private RouterApplianceInstanceArgs(RouterApplianceInstanceArgs $) {
        this.ipAddress = $.ipAddress;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterApplianceInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterApplianceInstanceArgs $;

        public Builder() {
            $ = new RouterApplianceInstanceArgs();
        }

        public Builder(RouterApplianceInstanceArgs defaults) {
            $ = new RouterApplianceInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress The IP address on the VM to use for peering.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address on the VM to use for peering.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param virtualMachine The URI of the VM.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(@Nullable Output<String> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        /**
         * @param virtualMachine The URI of the VM.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(String virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public RouterApplianceInstanceArgs build() {
            return $;
        }
    }

}
