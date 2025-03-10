// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oda.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Oda.inputs.GetOdaInstancesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOdaInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOdaInstancesArgs Empty = new GetOdaInstancesArgs();

    /**
     * List the Digital Assistant instances that belong to this compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return List the Digital Assistant instances that belong to this compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetOdaInstancesFilter> filters;

    public Optional<List<GetOdaInstancesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetOdaInstancesArgs() {}

    private GetOdaInstancesArgs(GetOdaInstancesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOdaInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOdaInstancesArgs $;

        public Builder() {
            $ = new GetOdaInstancesArgs();
        }

        public Builder(GetOdaInstancesArgs defaults) {
            $ = new GetOdaInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId List the Digital Assistant instances that belong to this compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetOdaInstancesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetOdaInstancesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state List only the Digital Assistant instances that are in this lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetOdaInstancesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
