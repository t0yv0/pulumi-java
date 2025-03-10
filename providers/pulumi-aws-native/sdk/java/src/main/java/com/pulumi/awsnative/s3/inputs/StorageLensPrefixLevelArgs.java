// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.StorageLensPrefixLevelStorageMetricsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Prefix-level metrics configurations.
 * 
 */
public final class StorageLensPrefixLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageLensPrefixLevelArgs Empty = new StorageLensPrefixLevelArgs();

    @Import(name="storageMetrics", required=true)
    private Output<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics;

    public Output<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics() {
        return this.storageMetrics;
    }

    private StorageLensPrefixLevelArgs() {}

    private StorageLensPrefixLevelArgs(StorageLensPrefixLevelArgs $) {
        this.storageMetrics = $.storageMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensPrefixLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensPrefixLevelArgs $;

        public Builder() {
            $ = new StorageLensPrefixLevelArgs();
        }

        public Builder(StorageLensPrefixLevelArgs defaults) {
            $ = new StorageLensPrefixLevelArgs(Objects.requireNonNull(defaults));
        }

        public Builder storageMetrics(Output<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics) {
            $.storageMetrics = storageMetrics;
            return this;
        }

        public Builder storageMetrics(StorageLensPrefixLevelStorageMetricsArgs storageMetrics) {
            return storageMetrics(Output.of(storageMetrics));
        }

        public StorageLensPrefixLevelArgs build() {
            $.storageMetrics = Objects.requireNonNull($.storageMetrics, "expected parameter 'storageMetrics' to be non-null");
            return $;
        }
    }

}
