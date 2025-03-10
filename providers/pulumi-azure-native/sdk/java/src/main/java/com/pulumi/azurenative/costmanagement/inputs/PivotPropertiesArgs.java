// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.PivotTypeType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Each pivot must contain a &#39;type&#39; and &#39;name&#39;.
 * 
 */
public final class PivotPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PivotPropertiesArgs Empty = new PivotPropertiesArgs();

    /**
     * Data field to show in view.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Data field to show in view.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Data type to show in view.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,PivotTypeType>> type;

    /**
     * @return Data type to show in view.
     * 
     */
    public Optional<Output<Either<String,PivotTypeType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private PivotPropertiesArgs() {}

    private PivotPropertiesArgs(PivotPropertiesArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PivotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PivotPropertiesArgs $;

        public Builder() {
            $ = new PivotPropertiesArgs();
        }

        public Builder(PivotPropertiesArgs defaults) {
            $ = new PivotPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Data field to show in view.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Data field to show in view.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Data type to show in view.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,PivotTypeType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Data type to show in view.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,PivotTypeType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Data type to show in view.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Data type to show in view.
         * 
         * @return builder
         * 
         */
        public Builder type(PivotTypeType type) {
            return type(Either.ofRight(type));
        }

        public PivotPropertiesArgs build() {
            return $;
        }
    }

}
