// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConstraintArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConstraintArgs Empty = new GetConstraintArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable String acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Description of the constraint.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the constraint.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Constraint identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Constraint identifier.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetConstraintArgs() {}

    private GetConstraintArgs(GetConstraintArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.description = $.description;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConstraintArgs $;

        public Builder() {
            $ = new GetConstraintArgs();
        }

        public Builder(GetConstraintArgs defaults) {
            $ = new GetConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param description Description of the constraint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param id Constraint identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetConstraintArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
