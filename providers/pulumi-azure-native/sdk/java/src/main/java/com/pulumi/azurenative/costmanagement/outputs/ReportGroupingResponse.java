// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReportGroupingResponse {
    /**
     * @return The name of the column to group.
     * 
     */
    private final String name;
    /**
     * @return Has type of the column to group.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ReportGroupingResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return The name of the column to group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Has type of the column to group.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ReportGroupingResponse build() {
            return new ReportGroupingResponse(name, type);
        }
    }
}
