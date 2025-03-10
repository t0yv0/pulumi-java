// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s billing configuration.
 * 
 */
public final class BucketBillingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketBillingArgs Empty = new BucketBillingArgs();

    /**
     * When set to true, Requester Pays is enabled for this bucket.
     * 
     */
    @Import(name="requesterPays")
    private @Nullable Output<Boolean> requesterPays;

    /**
     * @return When set to true, Requester Pays is enabled for this bucket.
     * 
     */
    public Optional<Output<Boolean>> requesterPays() {
        return Optional.ofNullable(this.requesterPays);
    }

    private BucketBillingArgs() {}

    private BucketBillingArgs(BucketBillingArgs $) {
        this.requesterPays = $.requesterPays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketBillingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketBillingArgs $;

        public Builder() {
            $ = new BucketBillingArgs();
        }

        public Builder(BucketBillingArgs defaults) {
            $ = new BucketBillingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requesterPays When set to true, Requester Pays is enabled for this bucket.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(@Nullable Output<Boolean> requesterPays) {
            $.requesterPays = requesterPays;
            return this;
        }

        /**
         * @param requesterPays When set to true, Requester Pays is enabled for this bucket.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(Boolean requesterPays) {
            return requesterPays(Output.of(requesterPays));
        }

        public BucketBillingArgs build() {
            return $;
        }
    }

}
