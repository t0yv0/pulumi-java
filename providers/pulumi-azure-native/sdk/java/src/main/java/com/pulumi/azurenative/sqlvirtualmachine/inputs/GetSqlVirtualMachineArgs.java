// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlVirtualMachineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlVirtualMachineArgs Empty = new GetSqlVirtualMachineArgs();

    /**
     * The child resources to include in the response.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The child resources to include in the response.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL virtual machine.
     * 
     */
    @Import(name="sqlVirtualMachineName", required=true)
    private String sqlVirtualMachineName;

    /**
     * @return Name of the SQL virtual machine.
     * 
     */
    public String sqlVirtualMachineName() {
        return this.sqlVirtualMachineName;
    }

    private GetSqlVirtualMachineArgs() {}

    private GetSqlVirtualMachineArgs(GetSqlVirtualMachineArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.sqlVirtualMachineName = $.sqlVirtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlVirtualMachineArgs $;

        public Builder() {
            $ = new GetSqlVirtualMachineArgs();
        }

        public Builder(GetSqlVirtualMachineArgs defaults) {
            $ = new GetSqlVirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The child resources to include in the response.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sqlVirtualMachineName Name of the SQL virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder sqlVirtualMachineName(String sqlVirtualMachineName) {
            $.sqlVirtualMachineName = sqlVirtualMachineName;
            return this;
        }

        public GetSqlVirtualMachineArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlVirtualMachineName = Objects.requireNonNull($.sqlVirtualMachineName, "expected parameter 'sqlVirtualMachineName' to be non-null");
            return $;
        }
    }

}
