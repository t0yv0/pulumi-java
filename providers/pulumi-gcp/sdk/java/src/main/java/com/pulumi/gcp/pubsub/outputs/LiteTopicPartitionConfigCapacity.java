// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class LiteTopicPartitionConfigCapacity {
    /**
     * @return Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    private final Integer publishMibPerSec;
    /**
     * @return Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    private final Integer subscribeMibPerSec;

    @CustomType.Constructor
    private LiteTopicPartitionConfigCapacity(
        @CustomType.Parameter("publishMibPerSec") Integer publishMibPerSec,
        @CustomType.Parameter("subscribeMibPerSec") Integer subscribeMibPerSec) {
        this.publishMibPerSec = publishMibPerSec;
        this.subscribeMibPerSec = subscribeMibPerSec;
    }

    /**
     * @return Subscribe throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    public Integer publishMibPerSec() {
        return this.publishMibPerSec;
    }
    /**
     * @return Publish throughput capacity per partition in MiB/s. Must be &gt;= 4 and &lt;= 16.
     * 
     */
    public Integer subscribeMibPerSec() {
        return this.subscribeMibPerSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfigCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer publishMibPerSec;
        private Integer subscribeMibPerSec;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfigCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMibPerSec = defaults.publishMibPerSec;
    	      this.subscribeMibPerSec = defaults.subscribeMibPerSec;
        }

        public Builder publishMibPerSec(Integer publishMibPerSec) {
            this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec);
            return this;
        }
        public Builder subscribeMibPerSec(Integer subscribeMibPerSec) {
            this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec);
            return this;
        }        public LiteTopicPartitionConfigCapacity build() {
            return new LiteTopicPartitionConfigCapacity(publishMibPerSec, subscribeMibPerSec);
        }
    }
}
