// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.enums.FilterEventTypeItem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allows filtering to one or more specific event types. If event types are present, those and only those event types will be transmitted to the cluster. Other types will be skipped. If no filter is specified, or no event types are present, all event types will be sent
 * 
 */
public final class FilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Event types to allowlist.
     * 
     */
    @Import(name="eventType")
    private @Nullable Output<List<FilterEventTypeItem>> eventType;

    /**
     * @return Event types to allowlist.
     * 
     */
    public Optional<Output<List<FilterEventTypeItem>>> eventType() {
        return Optional.ofNullable(this.eventType);
    }

    private FilterArgs() {}

    private FilterArgs(FilterArgs $) {
        this.eventType = $.eventType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterArgs $;

        public Builder() {
            $ = new FilterArgs();
        }

        public Builder(FilterArgs defaults) {
            $ = new FilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventType Event types to allowlist.
         * 
         * @return builder
         * 
         */
        public Builder eventType(@Nullable Output<List<FilterEventTypeItem>> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType Event types to allowlist.
         * 
         * @return builder
         * 
         */
        public Builder eventType(List<FilterEventTypeItem> eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param eventType Event types to allowlist.
         * 
         * @return builder
         * 
         */
        public Builder eventType(FilterEventTypeItem... eventType) {
            return eventType(List.of(eventType));
        }

        public FilterArgs build() {
            return $;
        }
    }

}
