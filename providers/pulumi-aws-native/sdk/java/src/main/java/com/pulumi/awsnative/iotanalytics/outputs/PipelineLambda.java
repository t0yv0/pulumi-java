// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineLambda {
    private final Integer batchSize;
    private final String lambdaName;
    private final String name;
    private final @Nullable String next;

    @CustomType.Constructor
    private PipelineLambda(
        @CustomType.Parameter("batchSize") Integer batchSize,
        @CustomType.Parameter("lambdaName") String lambdaName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("next") @Nullable String next) {
        this.batchSize = batchSize;
        this.lambdaName = lambdaName;
        this.name = name;
        this.next = next;
    }

    public Integer batchSize() {
        return this.batchSize;
    }
    public String lambdaName() {
        return this.lambdaName;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> next() {
        return Optional.ofNullable(this.next);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineLambda defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer batchSize;
        private String lambdaName;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.lambdaName = defaults.lambdaName;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder batchSize(Integer batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }
        public Builder lambdaName(String lambdaName) {
            this.lambdaName = Objects.requireNonNull(lambdaName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }        public PipelineLambda build() {
            return new PipelineLambda(batchSize, lambdaName, name, next);
        }
    }
}
