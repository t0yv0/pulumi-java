// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetModelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelArgs Empty = new GetModelArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
     * 
     */
    @Import(name="modelId", required=true)
    private String modelId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
     * 
     */
    public String modelId() {
        return this.modelId;
    }

    private GetModelArgs() {}

    private GetModelArgs(GetModelArgs $) {
        this.modelId = $.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelArgs $;

        public Builder() {
            $ = new GetModelArgs();
        }

        public Builder(GetModelArgs defaults) {
            $ = new GetModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param modelId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the model.
         * 
         * @return builder
         * 
         */
        public Builder modelId(String modelId) {
            $.modelId = modelId;
            return this;
        }

        public GetModelArgs build() {
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            return $;
        }
    }

}
