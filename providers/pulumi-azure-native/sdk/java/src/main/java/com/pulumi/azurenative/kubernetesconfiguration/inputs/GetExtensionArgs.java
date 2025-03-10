// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExtensionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExtensionArgs Empty = new GetExtensionArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the kubernetes cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
    private String clusterResourceName;

    /**
     * @return The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    public String clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
    private String clusterRp;

    /**
     * @return The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    public String clusterRp() {
        return this.clusterRp;
    }

    /**
     * Name of an instance of the Extension.
     * 
     */
    @Import(name="extensionInstanceName", required=true)
    private String extensionInstanceName;

    /**
     * @return Name of an instance of the Extension.
     * 
     */
    public String extensionInstanceName() {
        return this.extensionInstanceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExtensionArgs() {}

    private GetExtensionArgs(GetExtensionArgs $) {
        this.clusterName = $.clusterName;
        this.clusterResourceName = $.clusterResourceName;
        this.clusterRp = $.clusterRp;
        this.extensionInstanceName = $.extensionInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExtensionArgs $;

        public Builder() {
            $ = new GetExtensionArgs();
        }

        public Builder(GetExtensionArgs defaults) {
            $ = new GetExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceName(String clusterResourceName) {
            $.clusterResourceName = clusterResourceName;
            return this;
        }

        /**
         * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterRp(String clusterRp) {
            $.clusterRp = clusterRp;
            return this;
        }

        /**
         * @param extensionInstanceName Name of an instance of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionInstanceName(String extensionInstanceName) {
            $.extensionInstanceName = extensionInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExtensionArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.clusterResourceName = Objects.requireNonNull($.clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
            $.clusterRp = Objects.requireNonNull($.clusterRp, "expected parameter 'clusterRp' to be non-null");
            $.extensionInstanceName = Objects.requireNonNull($.extensionInstanceName, "expected parameter 'extensionInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
