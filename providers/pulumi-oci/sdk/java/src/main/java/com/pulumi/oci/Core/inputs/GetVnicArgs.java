// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVnicArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVnicArgs Empty = new GetVnicArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC.
     * 
     */
    @Import(name="vnicId", required=true)
    private String vnicId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC.
     * 
     */
    public String vnicId() {
        return this.vnicId;
    }

    private GetVnicArgs() {}

    private GetVnicArgs(GetVnicArgs $) {
        this.vnicId = $.vnicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVnicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVnicArgs $;

        public Builder() {
            $ = new GetVnicArgs();
        }

        public Builder(GetVnicArgs defaults) {
            $ = new GetVnicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vnicId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(String vnicId) {
            $.vnicId = vnicId;
            return this;
        }

        public GetVnicArgs build() {
            $.vnicId = Objects.requireNonNull($.vnicId, "expected parameter 'vnicId' to be non-null");
            return $;
        }
    }

}
