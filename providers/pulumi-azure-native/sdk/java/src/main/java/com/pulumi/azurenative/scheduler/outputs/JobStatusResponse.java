// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobStatusResponse {
    /**
     * @return Gets the number of times this job has executed.
     * 
     */
    private final Integer executionCount;
    /**
     * @return Gets the number of times this job has failed.
     * 
     */
    private final Integer failureCount;
    /**
     * @return Gets the number of faulted occurrences (occurrences that were retried and failed as many times as the retry policy states).
     * 
     */
    private final Integer faultedCount;
    /**
     * @return Gets the time the last occurrence executed in ISO-8601 format.  Could be empty if job has not run yet.
     * 
     */
    private final String lastExecutionTime;
    /**
     * @return Gets the time of the next occurrence in ISO-8601 format. Could be empty if the job is completed.
     * 
     */
    private final String nextExecutionTime;

    @CustomType.Constructor
    private JobStatusResponse(
        @CustomType.Parameter("executionCount") Integer executionCount,
        @CustomType.Parameter("failureCount") Integer failureCount,
        @CustomType.Parameter("faultedCount") Integer faultedCount,
        @CustomType.Parameter("lastExecutionTime") String lastExecutionTime,
        @CustomType.Parameter("nextExecutionTime") String nextExecutionTime) {
        this.executionCount = executionCount;
        this.failureCount = failureCount;
        this.faultedCount = faultedCount;
        this.lastExecutionTime = lastExecutionTime;
        this.nextExecutionTime = nextExecutionTime;
    }

    /**
     * @return Gets the number of times this job has executed.
     * 
     */
    public Integer executionCount() {
        return this.executionCount;
    }
    /**
     * @return Gets the number of times this job has failed.
     * 
     */
    public Integer failureCount() {
        return this.failureCount;
    }
    /**
     * @return Gets the number of faulted occurrences (occurrences that were retried and failed as many times as the retry policy states).
     * 
     */
    public Integer faultedCount() {
        return this.faultedCount;
    }
    /**
     * @return Gets the time the last occurrence executed in ISO-8601 format.  Could be empty if job has not run yet.
     * 
     */
    public String lastExecutionTime() {
        return this.lastExecutionTime;
    }
    /**
     * @return Gets the time of the next occurrence in ISO-8601 format. Could be empty if the job is completed.
     * 
     */
    public String nextExecutionTime() {
        return this.nextExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer executionCount;
        private Integer failureCount;
        private Integer faultedCount;
        private String lastExecutionTime;
        private String nextExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionCount = defaults.executionCount;
    	      this.failureCount = defaults.failureCount;
    	      this.faultedCount = defaults.faultedCount;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.nextExecutionTime = defaults.nextExecutionTime;
        }

        public Builder executionCount(Integer executionCount) {
            this.executionCount = Objects.requireNonNull(executionCount);
            return this;
        }
        public Builder failureCount(Integer failureCount) {
            this.failureCount = Objects.requireNonNull(failureCount);
            return this;
        }
        public Builder faultedCount(Integer faultedCount) {
            this.faultedCount = Objects.requireNonNull(faultedCount);
            return this;
        }
        public Builder lastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }
        public Builder nextExecutionTime(String nextExecutionTime) {
            this.nextExecutionTime = Objects.requireNonNull(nextExecutionTime);
            return this;
        }        public JobStatusResponse build() {
            return new JobStatusResponse(executionCount, failureCount, faultedCount, lastExecutionTime, nextExecutionTime);
        }
    }
}
