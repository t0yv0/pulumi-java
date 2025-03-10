// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PullMessageResponse {
    /**
     * @return A data payload consumed by the worker to execute the task.
     * 
     */
    private final String payload;
    /**
     * @return The tasks&#39;s tag. The tag is less than 500 characters. SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn&#39;t UTF-8 encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * 
     */
    private final String tag;

    @CustomType.Constructor
    private PullMessageResponse(
        @CustomType.Parameter("payload") String payload,
        @CustomType.Parameter("tag") String tag) {
        this.payload = payload;
        this.tag = tag;
    }

    /**
     * @return A data payload consumed by the worker to execute the task.
     * 
     */
    public String payload() {
        return this.payload;
    }
    /**
     * @return The tasks&#39;s tag. The tag is less than 500 characters. SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn&#39;t UTF-8 encoded, the tag will be empty when the task is returned by Cloud Tasks.
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String payload;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(PullMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.tag = defaults.tag;
        }

        public Builder payload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }        public PullMessageResponse build() {
            return new PullMessageResponse(payload, tag);
        }
    }
}
