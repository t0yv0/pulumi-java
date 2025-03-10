// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionClusterConfig;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DataQualityJobDefinitionMonitoringResources {
    private final DataQualityJobDefinitionClusterConfig clusterConfig;

    @CustomType.Constructor
    private DataQualityJobDefinitionMonitoringResources(@CustomType.Parameter("clusterConfig") DataQualityJobDefinitionClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public DataQualityJobDefinitionClusterConfig clusterConfig() {
        return this.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionClusterConfig clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(DataQualityJobDefinitionClusterConfig clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }        public DataQualityJobDefinitionMonitoringResources build() {
            return new DataQualityJobDefinitionMonitoringResources(clusterConfig);
        }
    }
}
