// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCrossConnectGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCrossConnectGroupArgs Empty = new GetCrossConnectGroupArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group.
     * 
     */
    @Import(name="crossConnectGroupId", required=true)
    private String crossConnectGroupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group.
     * 
     */
    public String crossConnectGroupId() {
        return this.crossConnectGroupId;
    }

    private GetCrossConnectGroupArgs() {}

    private GetCrossConnectGroupArgs(GetCrossConnectGroupArgs $) {
        this.crossConnectGroupId = $.crossConnectGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCrossConnectGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCrossConnectGroupArgs $;

        public Builder() {
            $ = new GetCrossConnectGroupArgs();
        }

        public Builder(GetCrossConnectGroupArgs defaults) {
            $ = new GetCrossConnectGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossConnectGroupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group.
         * 
         * @return builder
         * 
         */
        public Builder crossConnectGroupId(String crossConnectGroupId) {
            $.crossConnectGroupId = crossConnectGroupId;
            return this;
        }

        public GetCrossConnectGroupArgs build() {
            $.crossConnectGroupId = Objects.requireNonNull($.crossConnectGroupId, "expected parameter 'crossConnectGroupId' to be non-null");
            return $;
        }
    }

}
