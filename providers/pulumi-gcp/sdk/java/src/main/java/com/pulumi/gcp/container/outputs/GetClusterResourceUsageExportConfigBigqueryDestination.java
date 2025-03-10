// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterResourceUsageExportConfigBigqueryDestination {
    private final String datasetId;

    @CustomType.Constructor
    private GetClusterResourceUsageExportConfigBigqueryDestination(@CustomType.Parameter("datasetId") String datasetId) {
        this.datasetId = datasetId;
    }

    public String datasetId() {
        return this.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResourceUsageExportConfigBigqueryDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResourceUsageExportConfigBigqueryDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }        public GetClusterResourceUsageExportConfigBigqueryDestination build() {
            return new GetClusterResourceUsageExportConfigBigqueryDestination(datasetId);
        }
    }
}
