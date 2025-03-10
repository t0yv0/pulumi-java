// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.marketplace.inputs;

import com.pulumi.azurenative.marketplace.enums.Accessibility;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanArgs Empty = new PlanArgs();

    /**
     * Plan accessibility
     * 
     */
    @Import(name="accessibility")
    private @Nullable Output<Either<String,Accessibility>> accessibility;

    /**
     * @return Plan accessibility
     * 
     */
    public Optional<Output<Either<String,Accessibility>>> accessibility() {
        return Optional.ofNullable(this.accessibility);
    }

    private PlanArgs() {}

    private PlanArgs(PlanArgs $) {
        this.accessibility = $.accessibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanArgs $;

        public Builder() {
            $ = new PlanArgs();
        }

        public Builder(PlanArgs defaults) {
            $ = new PlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibility Plan accessibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(@Nullable Output<Either<String,Accessibility>> accessibility) {
            $.accessibility = accessibility;
            return this;
        }

        /**
         * @param accessibility Plan accessibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(Either<String,Accessibility> accessibility) {
            return accessibility(Output.of(accessibility));
        }

        /**
         * @param accessibility Plan accessibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(String accessibility) {
            return accessibility(Either.ofLeft(accessibility));
        }

        /**
         * @param accessibility Plan accessibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(Accessibility accessibility) {
            return accessibility(Either.ofRight(accessibility));
        }

        public PlanArgs build() {
            return $;
        }
    }

}
