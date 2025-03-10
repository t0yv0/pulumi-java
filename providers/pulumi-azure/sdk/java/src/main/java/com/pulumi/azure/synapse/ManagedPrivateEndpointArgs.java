// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the sub resource name which the Synapse Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subresourceName", required=true)
    private Output<String> subresourceName;

    /**
     * @return Specifies the sub resource name which the Synapse Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subresourceName() {
        return this.subresourceName;
    }

    /**
     * The ID of the Synapse Workspace on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="synapseWorkspaceId", required=true)
    private Output<String> synapseWorkspaceId;

    /**
     * @return The ID of the Synapse Workspace on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }

    /**
     * The ID of the Private Link Enabled Remote Resource which this Synapse Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetResourceId", required=true)
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Private Link Enabled Remote Resource which this Synapse Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    private ManagedPrivateEndpointArgs() {}

    private ManagedPrivateEndpointArgs(ManagedPrivateEndpointArgs $) {
        this.name = $.name;
        this.subresourceName = $.subresourceName;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
        this.targetResourceId = $.targetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new ManagedPrivateEndpointArgs();
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
            $ = new ManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subresourceName Specifies the sub resource name which the Synapse Private Endpoint is able to connect to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subresourceName(Output<String> subresourceName) {
            $.subresourceName = subresourceName;
            return this;
        }

        /**
         * @param subresourceName Specifies the sub resource name which the Synapse Private Endpoint is able to connect to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subresourceName(String subresourceName) {
            return subresourceName(Output.of(subresourceName));
        }

        /**
         * @param synapseWorkspaceId The ID of the Synapse Workspace on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The ID of the Synapse Workspace on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        /**
         * @param targetResourceId The ID of the Private Link Enabled Remote Resource which this Synapse Private Endpoint should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId The ID of the Private Link Enabled Remote Resource which this Synapse Private Endpoint should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        public ManagedPrivateEndpointArgs build() {
            $.subresourceName = Objects.requireNonNull($.subresourceName, "expected parameter 'subresourceName' to be non-null");
            $.synapseWorkspaceId = Objects.requireNonNull($.synapseWorkspaceId, "expected parameter 'synapseWorkspaceId' to be non-null");
            $.targetResourceId = Objects.requireNonNull($.targetResourceId, "expected parameter 'targetResourceId' to be non-null");
            return $;
        }
    }

}
