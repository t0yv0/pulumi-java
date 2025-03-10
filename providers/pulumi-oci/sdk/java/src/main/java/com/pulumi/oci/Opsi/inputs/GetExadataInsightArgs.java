// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExadataInsightArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExadataInsightArgs Empty = new GetExadataInsightArgs();

    /**
     * Unique Exadata insight identifier
     * 
     */
    @Import(name="exadataInsightId", required=true)
    private String exadataInsightId;

    /**
     * @return Unique Exadata insight identifier
     * 
     */
    public String exadataInsightId() {
        return this.exadataInsightId;
    }

    private GetExadataInsightArgs() {}

    private GetExadataInsightArgs(GetExadataInsightArgs $) {
        this.exadataInsightId = $.exadataInsightId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExadataInsightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExadataInsightArgs $;

        public Builder() {
            $ = new GetExadataInsightArgs();
        }

        public Builder(GetExadataInsightArgs defaults) {
            $ = new GetExadataInsightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exadataInsightId Unique Exadata insight identifier
         * 
         * @return builder
         * 
         */
        public Builder exadataInsightId(String exadataInsightId) {
            $.exadataInsightId = exadataInsightId;
            return this;
        }

        public GetExadataInsightArgs build() {
            $.exadataInsightId = Objects.requireNonNull($.exadataInsightId, "expected parameter 'exadataInsightId' to be non-null");
            return $;
        }
    }

}
