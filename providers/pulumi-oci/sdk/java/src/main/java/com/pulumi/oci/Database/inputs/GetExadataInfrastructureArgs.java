// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExadataInfrastructureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExadataInfrastructureArgs Empty = new GetExadataInfrastructureArgs();

    /**
     * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="exadataInfrastructureId", required=true)
    private String exadataInfrastructureId;

    /**
     * @return The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String exadataInfrastructureId() {
        return this.exadataInfrastructureId;
    }

    private GetExadataInfrastructureArgs() {}

    private GetExadataInfrastructureArgs(GetExadataInfrastructureArgs $) {
        this.exadataInfrastructureId = $.exadataInfrastructureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExadataInfrastructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExadataInfrastructureArgs $;

        public Builder() {
            $ = new GetExadataInfrastructureArgs();
        }

        public Builder(GetExadataInfrastructureArgs defaults) {
            $ = new GetExadataInfrastructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exadataInfrastructureId The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            $.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }

        public GetExadataInfrastructureArgs build() {
            $.exadataInfrastructureId = Objects.requireNonNull($.exadataInfrastructureId, "expected parameter 'exadataInfrastructureId' to be non-null");
            return $;
        }
    }

}
