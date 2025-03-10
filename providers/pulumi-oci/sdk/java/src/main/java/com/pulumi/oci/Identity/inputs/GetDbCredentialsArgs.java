// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetDbCredentialsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbCredentialsArgs Empty = new GetDbCredentialsArgs();

    @Import(name="filters")
    private @Nullable List<GetDbCredentialsFilter> filters;

    public Optional<List<GetDbCredentialsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to only return resources that match the given name exactly.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A filter to only return resources that match the given name exactly.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public String userId() {
        return this.userId;
    }

    private GetDbCredentialsArgs() {}

    private GetDbCredentialsArgs(GetDbCredentialsArgs $) {
        this.filters = $.filters;
        this.name = $.name;
        this.state = $.state;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbCredentialsArgs $;

        public Builder() {
            $ = new GetDbCredentialsArgs();
        }

        public Builder(GetDbCredentialsArgs defaults) {
            $ = new GetDbCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetDbCredentialsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDbCredentialsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name A filter to only return resources that match the given name exactly.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetDbCredentialsArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
