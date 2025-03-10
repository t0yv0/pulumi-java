// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Budget.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Budget.inputs.GetAlertRulesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertRulesArgs Empty = new GetAlertRulesArgs();

    /**
     * The unique Budget OCID
     * 
     */
    @Import(name="budgetId", required=true)
    private String budgetId;

    /**
     * @return The unique Budget OCID
     * 
     */
    public String budgetId() {
        return this.budgetId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetAlertRulesFilter> filters;

    public Optional<List<GetAlertRulesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The current state of the resource to filter by.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The current state of the resource to filter by.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetAlertRulesArgs() {}

    private GetAlertRulesArgs(GetAlertRulesArgs $) {
        this.budgetId = $.budgetId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertRulesArgs $;

        public Builder() {
            $ = new GetAlertRulesArgs();
        }

        public Builder(GetAlertRulesArgs defaults) {
            $ = new GetAlertRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param budgetId The unique Budget OCID
         * 
         * @return builder
         * 
         */
        public Builder budgetId(String budgetId) {
            $.budgetId = budgetId;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetAlertRulesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAlertRulesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state The current state of the resource to filter by.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetAlertRulesArgs build() {
            $.budgetId = Objects.requireNonNull($.budgetId, "expected parameter 'budgetId' to be non-null");
            return $;
        }
    }

}
