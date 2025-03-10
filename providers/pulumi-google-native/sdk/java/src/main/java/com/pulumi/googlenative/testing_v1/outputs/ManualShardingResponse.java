// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.TestTargetsForShardResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManualShardingResponse {
    /**
     * @return Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    private final List<TestTargetsForShardResponse> testTargetsForShard;

    @CustomType.Constructor
    private ManualShardingResponse(@CustomType.Parameter("testTargetsForShard") List<TestTargetsForShardResponse> testTargetsForShard) {
        this.testTargetsForShard = testTargetsForShard;
    }

    /**
     * @return Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    public List<TestTargetsForShardResponse> testTargetsForShard() {
        return this.testTargetsForShard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualShardingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestTargetsForShardResponse> testTargetsForShard;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualShardingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargetsForShard = defaults.testTargetsForShard;
        }

        public Builder testTargetsForShard(List<TestTargetsForShardResponse> testTargetsForShard) {
            this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard);
            return this;
        }
        public Builder testTargetsForShard(TestTargetsForShardResponse... testTargetsForShard) {
            return testTargetsForShard(List.of(testTargetsForShard));
        }        public ManualShardingResponse build() {
            return new ManualShardingResponse(testTargetsForShard);
        }
    }
}
