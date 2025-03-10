// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineConfigurationAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineConfigurationAssignmentArgs Empty = new GetVirtualMachineConfigurationAssignmentArgs();

    /**
     * Specifies the name of the Guest Configuration Assignment.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Guest Configuration Assignment.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the Name of the Resource Group where the Guest Configuration Assignment exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the Name of the Resource Group where the Guest Configuration Assignment exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Only retrieve Policy Set Definitions from this Management Group.
     * 
     */
    @Import(name="virtualMachineName", required=true)
    private String virtualMachineName;

    /**
     * @return Only retrieve Policy Set Definitions from this Management Group.
     * 
     */
    public String virtualMachineName() {
        return this.virtualMachineName;
    }

    private GetVirtualMachineConfigurationAssignmentArgs() {}

    private GetVirtualMachineConfigurationAssignmentArgs(GetVirtualMachineConfigurationAssignmentArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualMachineName = $.virtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineConfigurationAssignmentArgs $;

        public Builder() {
            $ = new GetVirtualMachineConfigurationAssignmentArgs();
        }

        public Builder(GetVirtualMachineConfigurationAssignmentArgs defaults) {
            $ = new GetVirtualMachineConfigurationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Guest Configuration Assignment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the Name of the Resource Group where the Guest Configuration Assignment exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualMachineName Only retrieve Policy Set Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineName(String virtualMachineName) {
            $.virtualMachineName = virtualMachineName;
            return this;
        }

        public GetVirtualMachineConfigurationAssignmentArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualMachineName = Objects.requireNonNull($.virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
            return $;
        }
    }

}
