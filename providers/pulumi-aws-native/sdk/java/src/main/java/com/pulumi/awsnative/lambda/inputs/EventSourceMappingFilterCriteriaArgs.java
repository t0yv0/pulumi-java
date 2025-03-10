// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.awsnative.lambda.inputs.EventSourceMappingFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The filter criteria to control event filtering.
 * 
 */
public final class EventSourceMappingFilterCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterCriteriaArgs Empty = new EventSourceMappingFilterCriteriaArgs();

    /**
     * List of filters of this FilterCriteria
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<EventSourceMappingFilterArgs>> filters;

    /**
     * @return List of filters of this FilterCriteria
     * 
     */
    public Optional<Output<List<EventSourceMappingFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private EventSourceMappingFilterCriteriaArgs() {}

    private EventSourceMappingFilterCriteriaArgs(EventSourceMappingFilterCriteriaArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingFilterCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingFilterCriteriaArgs $;

        public Builder() {
            $ = new EventSourceMappingFilterCriteriaArgs();
        }

        public Builder(EventSourceMappingFilterCriteriaArgs defaults) {
            $ = new EventSourceMappingFilterCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters List of filters of this FilterCriteria
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<EventSourceMappingFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters List of filters of this FilterCriteria
         * 
         * @return builder
         * 
         */
        public Builder filters(List<EventSourceMappingFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters List of filters of this FilterCriteria
         * 
         * @return builder
         * 
         */
        public Builder filters(EventSourceMappingFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public EventSourceMappingFilterCriteriaArgs build() {
            return $;
        }
    }

}
