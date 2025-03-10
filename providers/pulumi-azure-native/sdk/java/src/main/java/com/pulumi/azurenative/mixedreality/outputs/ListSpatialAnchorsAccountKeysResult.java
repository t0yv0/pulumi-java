// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListSpatialAnchorsAccountKeysResult {
    /**
     * @return value of primary key.
     * 
     */
    private final String primaryKey;
    /**
     * @return value of secondary key.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private ListSpatialAnchorsAccountKeysResult(
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return value of primary key.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    /**
     * @return value of secondary key.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSpatialAnchorsAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSpatialAnchorsAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }        public ListSpatialAnchorsAccountKeysResult build() {
            return new ListSpatialAnchorsAccountKeysResult(primaryKey, secondaryKey);
        }
    }
}
