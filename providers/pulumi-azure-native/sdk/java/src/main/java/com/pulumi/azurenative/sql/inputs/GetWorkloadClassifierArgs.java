// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadClassifierArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadClassifierArgs Empty = new GetWorkloadClassifierArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * The name of the workload classifier.
     * 
     */
    @Import(name="workloadClassifierName", required=true)
    private String workloadClassifierName;

    /**
     * @return The name of the workload classifier.
     * 
     */
    public String workloadClassifierName() {
        return this.workloadClassifierName;
    }

    /**
     * The name of the workload group from which to receive the classifier from.
     * 
     */
    @Import(name="workloadGroupName", required=true)
    private String workloadGroupName;

    /**
     * @return The name of the workload group from which to receive the classifier from.
     * 
     */
    public String workloadGroupName() {
        return this.workloadGroupName;
    }

    private GetWorkloadClassifierArgs() {}

    private GetWorkloadClassifierArgs(GetWorkloadClassifierArgs $) {
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.workloadClassifierName = $.workloadClassifierName;
        this.workloadGroupName = $.workloadGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadClassifierArgs $;

        public Builder() {
            $ = new GetWorkloadClassifierArgs();
        }

        public Builder(GetWorkloadClassifierArgs defaults) {
            $ = new GetWorkloadClassifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param workloadClassifierName The name of the workload classifier.
         * 
         * @return builder
         * 
         */
        public Builder workloadClassifierName(String workloadClassifierName) {
            $.workloadClassifierName = workloadClassifierName;
            return this;
        }

        /**
         * @param workloadGroupName The name of the workload group from which to receive the classifier from.
         * 
         * @return builder
         * 
         */
        public Builder workloadGroupName(String workloadGroupName) {
            $.workloadGroupName = workloadGroupName;
            return this;
        }

        public GetWorkloadClassifierArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.workloadClassifierName = Objects.requireNonNull($.workloadClassifierName, "expected parameter 'workloadClassifierName' to be non-null");
            $.workloadGroupName = Objects.requireNonNull($.workloadGroupName, "expected parameter 'workloadGroupName' to be non-null");
            return $;
        }
    }

}
