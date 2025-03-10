// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSubscriptionSubjectFilter {
    /**
     * @return Specifies if `subject_begins_with` and `subject_ends_with` case sensitive. This value defaults to `false`.
     * 
     */
    private final @Nullable Boolean caseSensitive;
    /**
     * @return A string to filter events for an event subscription based on a resource path prefix.
     * 
     */
    private final @Nullable String subjectBeginsWith;
    /**
     * @return A string to filter events for an event subscription based on a resource path suffix.
     * 
     */
    private final @Nullable String subjectEndsWith;

    @CustomType.Constructor
    private EventSubscriptionSubjectFilter(
        @CustomType.Parameter("caseSensitive") @Nullable Boolean caseSensitive,
        @CustomType.Parameter("subjectBeginsWith") @Nullable String subjectBeginsWith,
        @CustomType.Parameter("subjectEndsWith") @Nullable String subjectEndsWith) {
        this.caseSensitive = caseSensitive;
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
    }

    /**
     * @return Specifies if `subject_begins_with` and `subject_ends_with` case sensitive. This value defaults to `false`.
     * 
     */
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    /**
     * @return A string to filter events for an event subscription based on a resource path prefix.
     * 
     */
    public Optional<String> subjectBeginsWith() {
        return Optional.ofNullable(this.subjectBeginsWith);
    }
    /**
     * @return A string to filter events for an event subscription based on a resource path suffix.
     * 
     */
    public Optional<String> subjectEndsWith() {
        return Optional.ofNullable(this.subjectEndsWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionSubjectFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean caseSensitive;
        private @Nullable String subjectBeginsWith;
        private @Nullable String subjectEndsWith;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionSubjectFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
        }

        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Builder subjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }
        public Builder subjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }        public EventSubscriptionSubjectFilter build() {
            return new EventSubscriptionSubjectFilter(caseSensitive, subjectBeginsWith, subjectEndsWith);
        }
    }
}
