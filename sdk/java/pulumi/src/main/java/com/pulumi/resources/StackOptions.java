package com.pulumi.resources;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

import static com.pulumi.resources.Resources.mergeNullableList;

/**
 * @see StackOptions is a bag of optional settings that control a stack's behavior.
 */
@ParametersAreNonnullByDefault
public class StackOptions {

    public static final StackOptions Empty = new Builder().build();

    private final List<ResourceTransformation> resourceTransformations;

    public StackOptions(@Nullable List<ResourceTransformation> resourceTransformations) {
        this.resourceTransformations = resourceTransformations;
    }

    /**
     * Optional list of transformations to apply to this stack's resources during construction.
     * The transformations are applied in order, and are applied after all the transformations of custom
     * and component resources in the stack.
     * @return list of transformations to apply to children resources
     */
    public List<ResourceTransformation> resourceTransformations() {
        return this.resourceTransformations == null ? List.of() : this.resourceTransformations;
    }

    /**
     * @return a {@link StackOptions} builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The {@link StackOptions} builder.
     */
    public static final class Builder {

        @Nullable
        private List<ResourceTransformation> resourceTransformations;

        /**
         * Merge existing {@link StackOptions} into this builder
         * @param options existing options to merge
         * @return this {@link Builder}
         */
        public Builder merge(@Nullable StackOptions options) {
            if (options != null) {
                this.resourceTransformations = mergeNullableList(this.resourceTransformations, options.resourceTransformations);
            }
            return this;
        }

        /**
         * @see StackOptions#resourceTransformations()
         * @param resourceTransformations list of transformations to apply to children resources
         * @return this {@link Builder}
         */
        public Builder resourceTransformations(@Nullable List<ResourceTransformation> resourceTransformations) {
            this.resourceTransformations = resourceTransformations;
            return this;
        }

        /**
         * @return a new {@link StackOptions} from this {@link Builder}
         */
        public StackOptions build() {
            return new StackOptions(resourceTransformations);
        }
    }
}
