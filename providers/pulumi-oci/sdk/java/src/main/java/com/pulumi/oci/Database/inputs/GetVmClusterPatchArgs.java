// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVmClusterPatchArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterPatchArgs Empty = new GetVmClusterPatchArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     * 
     */
    @Import(name="patchId", required=true)
    private String patchId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     * 
     */
    public String patchId() {
        return this.patchId;
    }

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="vmClusterId", required=true)
    private String vmClusterId;

    /**
     * @return The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String vmClusterId() {
        return this.vmClusterId;
    }

    private GetVmClusterPatchArgs() {}

    private GetVmClusterPatchArgs(GetVmClusterPatchArgs $) {
        this.patchId = $.patchId;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterPatchArgs $;

        public Builder() {
            $ = new GetVmClusterPatchArgs();
        }

        public Builder(GetVmClusterPatchArgs defaults) {
            $ = new GetVmClusterPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param patchId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         * 
         * @return builder
         * 
         */
        public Builder patchId(String patchId) {
            $.patchId = patchId;
            return this;
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        public GetVmClusterPatchArgs build() {
            $.patchId = Objects.requireNonNull($.patchId, "expected parameter 'patchId' to be non-null");
            $.vmClusterId = Objects.requireNonNull($.vmClusterId, "expected parameter 'vmClusterId' to be non-null");
            return $;
        }
    }

}
