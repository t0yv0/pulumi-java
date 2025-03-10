// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.advisor.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRecommendationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecommendationsArgs Empty = new GetRecommendationsArgs();

    /**
     * Specifies a list of categories in which the Advisor Recommendations will be listed. Possible values are `HighAvailability`, `Security`, `Performance`, `Cost` and `OperationalExcellence`.
     * 
     */
    @Import(name="filterByCategories")
    private @Nullable List<String> filterByCategories;

    /**
     * @return Specifies a list of categories in which the Advisor Recommendations will be listed. Possible values are `HighAvailability`, `Security`, `Performance`, `Cost` and `OperationalExcellence`.
     * 
     */
    public Optional<List<String>> filterByCategories() {
        return Optional.ofNullable(this.filterByCategories);
    }

    /**
     * Specifies a list of resource groups about which the Advisor Recommendations will be listed.
     * 
     */
    @Import(name="filterByResourceGroups")
    private @Nullable List<String> filterByResourceGroups;

    /**
     * @return Specifies a list of resource groups about which the Advisor Recommendations will be listed.
     * 
     */
    public Optional<List<String>> filterByResourceGroups() {
        return Optional.ofNullable(this.filterByResourceGroups);
    }

    private GetRecommendationsArgs() {}

    private GetRecommendationsArgs(GetRecommendationsArgs $) {
        this.filterByCategories = $.filterByCategories;
        this.filterByResourceGroups = $.filterByResourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecommendationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecommendationsArgs $;

        public Builder() {
            $ = new GetRecommendationsArgs();
        }

        public Builder(GetRecommendationsArgs defaults) {
            $ = new GetRecommendationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterByCategories Specifies a list of categories in which the Advisor Recommendations will be listed. Possible values are `HighAvailability`, `Security`, `Performance`, `Cost` and `OperationalExcellence`.
         * 
         * @return builder
         * 
         */
        public Builder filterByCategories(@Nullable List<String> filterByCategories) {
            $.filterByCategories = filterByCategories;
            return this;
        }

        /**
         * @param filterByCategories Specifies a list of categories in which the Advisor Recommendations will be listed. Possible values are `HighAvailability`, `Security`, `Performance`, `Cost` and `OperationalExcellence`.
         * 
         * @return builder
         * 
         */
        public Builder filterByCategories(String... filterByCategories) {
            return filterByCategories(List.of(filterByCategories));
        }

        /**
         * @param filterByResourceGroups Specifies a list of resource groups about which the Advisor Recommendations will be listed.
         * 
         * @return builder
         * 
         */
        public Builder filterByResourceGroups(@Nullable List<String> filterByResourceGroups) {
            $.filterByResourceGroups = filterByResourceGroups;
            return this;
        }

        /**
         * @param filterByResourceGroups Specifies a list of resource groups about which the Advisor Recommendations will be listed.
         * 
         * @return builder
         * 
         */
        public Builder filterByResourceGroups(String... filterByResourceGroups) {
            return filterByResourceGroups(List.of(filterByResourceGroups));
        }

        public GetRecommendationsArgs build() {
            return $;
        }
    }

}
