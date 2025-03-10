// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Limits.inputs.GetServicesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicesArgs Empty = new GetServicesArgs();

    /**
     * The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetServicesFilter> filters;

    public Optional<List<GetServicesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetServicesArgs() {}

    private GetServicesArgs(GetServicesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicesArgs $;

        public Builder() {
            $ = new GetServicesArgs();
        }

        public Builder(GetServicesArgs defaults) {
            $ = new GetServicesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetServicesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetServicesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetServicesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
