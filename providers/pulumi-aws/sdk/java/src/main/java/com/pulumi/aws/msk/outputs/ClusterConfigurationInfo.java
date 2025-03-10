// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterConfigurationInfo {
    /**
     * @return Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    private final String arn;
    /**
     * @return Revision of the MSK Configuration to use in the cluster.
     * 
     */
    private final Integer revision;

    @CustomType.Constructor
    private ClusterConfigurationInfo(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("revision") Integer revision) {
        this.arn = arn;
        this.revision = revision;
    }

    /**
     * @return Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Revision of the MSK Configuration to use in the cluster.
     * 
     */
    public Integer revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.revision = defaults.revision;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }        public ClusterConfigurationInfo build() {
            return new ClusterConfigurationInfo(arn, revision);
        }
    }
}
