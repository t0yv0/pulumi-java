// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StorageLensBucketsAndRegions {
    private final @Nullable List<String> buckets;
    private final @Nullable List<String> regions;

    @CustomType.Constructor
    private StorageLensBucketsAndRegions(
        @CustomType.Parameter("buckets") @Nullable List<String> buckets,
        @CustomType.Parameter("regions") @Nullable List<String> regions) {
        this.buckets = buckets;
        this.regions = regions;
    }

    public List<String> buckets() {
        return this.buckets == null ? List.of() : this.buckets;
    }
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensBucketsAndRegions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> buckets;
        private @Nullable List<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensBucketsAndRegions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
    	      this.regions = defaults.regions;
        }

        public Builder buckets(@Nullable List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public Builder buckets(String... buckets) {
            return buckets(List.of(buckets));
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }        public StorageLensBucketsAndRegions build() {
            return new StorageLensBucketsAndRegions(buckets, regions);
        }
    }
}
