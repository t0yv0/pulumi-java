// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataScience.inputs.GetJobShapesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobShapesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobShapesArgs Empty = new GetJobShapesArgs();

    /**
     * &lt;b&gt;Filter&lt;/b&gt; results by the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return &lt;b&gt;Filter&lt;/b&gt; results by the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetJobShapesFilter> filters;

    public Optional<List<GetJobShapesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetJobShapesArgs() {}

    private GetJobShapesArgs(GetJobShapesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobShapesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobShapesArgs $;

        public Builder() {
            $ = new GetJobShapesArgs();
        }

        public Builder(GetJobShapesArgs defaults) {
            $ = new GetJobShapesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId &lt;b&gt;Filter&lt;/b&gt; results by the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetJobShapesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetJobShapesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetJobShapesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
