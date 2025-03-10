// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RelationshipNoteResponse {
    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RelationshipNoteResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RelationshipNoteResponse build() {
            return new RelationshipNoteResponse(type);
        }
    }
}
