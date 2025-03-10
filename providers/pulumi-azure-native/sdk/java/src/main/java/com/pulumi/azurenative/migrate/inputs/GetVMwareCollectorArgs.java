// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVMwareCollectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVMwareCollectorArgs Empty = new GetVMwareCollectorArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a VMware collector within a project.
     * 
     */
    @Import(name="vmWareCollectorName", required=true)
    private String vmWareCollectorName;

    /**
     * @return Unique name of a VMware collector within a project.
     * 
     */
    public String vmWareCollectorName() {
        return this.vmWareCollectorName;
    }

    private GetVMwareCollectorArgs() {}

    private GetVMwareCollectorArgs(GetVMwareCollectorArgs $) {
        this.projectName = $.projectName;
        this.resourceGroupName = $.resourceGroupName;
        this.vmWareCollectorName = $.vmWareCollectorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVMwareCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVMwareCollectorArgs $;

        public Builder() {
            $ = new GetVMwareCollectorArgs();
        }

        public Builder(GetVMwareCollectorArgs defaults) {
            $ = new GetVMwareCollectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vmWareCollectorName Unique name of a VMware collector within a project.
         * 
         * @return builder
         * 
         */
        public Builder vmWareCollectorName(String vmWareCollectorName) {
            $.vmWareCollectorName = vmWareCollectorName;
            return this;
        }

        public GetVMwareCollectorArgs build() {
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmWareCollectorName = Objects.requireNonNull($.vmWareCollectorName, "expected parameter 'vmWareCollectorName' to be non-null");
            return $;
        }
    }

}
