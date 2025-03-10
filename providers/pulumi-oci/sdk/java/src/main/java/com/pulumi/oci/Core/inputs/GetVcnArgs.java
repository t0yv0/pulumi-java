// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVcnArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVcnArgs Empty = new GetVcnArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    @Import(name="vcnId", required=true)
    private String vcnId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    public String vcnId() {
        return this.vcnId;
    }

    private GetVcnArgs() {}

    private GetVcnArgs(GetVcnArgs $) {
        this.vcnId = $.vcnId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVcnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVcnArgs $;

        public Builder() {
            $ = new GetVcnArgs();
        }

        public Builder(GetVcnArgs defaults) {
            $ = new GetVcnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vcnId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * 
         * @return builder
         * 
         */
        public Builder vcnId(String vcnId) {
            $.vcnId = vcnId;
            return this;
        }

        public GetVcnArgs build() {
            $.vcnId = Objects.requireNonNull($.vcnId, "expected parameter 'vcnId' to be non-null");
            return $;
        }
    }

}
