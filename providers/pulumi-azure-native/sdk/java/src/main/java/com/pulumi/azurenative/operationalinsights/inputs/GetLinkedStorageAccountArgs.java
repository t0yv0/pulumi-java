// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedStorageAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinkedStorageAccountArgs Empty = new GetLinkedStorageAccountArgs();

    /**
     * Linked storage accounts type.
     * 
     */
    @Import(name="dataSourceType", required=true)
    private String dataSourceType;

    /**
     * @return Linked storage accounts type.
     * 
     */
    public String dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetLinkedStorageAccountArgs() {}

    private GetLinkedStorageAccountArgs(GetLinkedStorageAccountArgs $) {
        this.dataSourceType = $.dataSourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinkedStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinkedStorageAccountArgs $;

        public Builder() {
            $ = new GetLinkedStorageAccountArgs();
        }

        public Builder(GetLinkedStorageAccountArgs defaults) {
            $ = new GetLinkedStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceType Linked storage accounts type.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetLinkedStorageAccountArgs build() {
            $.dataSourceType = Objects.requireNonNull($.dataSourceType, "expected parameter 'dataSourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
