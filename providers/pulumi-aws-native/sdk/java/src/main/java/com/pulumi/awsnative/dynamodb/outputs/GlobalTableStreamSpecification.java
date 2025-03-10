// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalTableStreamSpecification {
    private final String streamViewType;

    @CustomType.Constructor
    private GlobalTableStreamSpecification(@CustomType.Parameter("streamViewType") String streamViewType) {
        this.streamViewType = streamViewType;
    }

    public String streamViewType() {
        return this.streamViewType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableStreamSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamViewType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableStreamSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamViewType = defaults.streamViewType;
        }

        public Builder streamViewType(String streamViewType) {
            this.streamViewType = Objects.requireNonNull(streamViewType);
            return this;
        }        public GlobalTableStreamSpecification build() {
            return new GlobalTableStreamSpecification(streamViewType);
        }
    }
}
