// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetTagStandardTagNamespaceTemplatesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagStandardTagNamespaceTemplatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagStandardTagNamespaceTemplatesArgs Empty = new GetTagStandardTagNamespaceTemplatesArgs();

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetTagStandardTagNamespaceTemplatesFilter> filters;

    public Optional<List<GetTagStandardTagNamespaceTemplatesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetTagStandardTagNamespaceTemplatesArgs() {}

    private GetTagStandardTagNamespaceTemplatesArgs(GetTagStandardTagNamespaceTemplatesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagStandardTagNamespaceTemplatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagStandardTagNamespaceTemplatesArgs $;

        public Builder() {
            $ = new GetTagStandardTagNamespaceTemplatesArgs();
        }

        public Builder(GetTagStandardTagNamespaceTemplatesArgs defaults) {
            $ = new GetTagStandardTagNamespaceTemplatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetTagStandardTagNamespaceTemplatesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetTagStandardTagNamespaceTemplatesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetTagStandardTagNamespaceTemplatesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
