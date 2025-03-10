// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceAttachmentConsumerAcceptList {
    /**
     * @return The number of consumer forwarding rules the consumer project can
     * create.
     * 
     */
    private final Integer connectionLimit;
    /**
     * @return A project that is allowed to connect to this service attachment.
     * 
     */
    private final String projectIdOrNum;

    @CustomType.Constructor
    private ServiceAttachmentConsumerAcceptList(
        @CustomType.Parameter("connectionLimit") Integer connectionLimit,
        @CustomType.Parameter("projectIdOrNum") String projectIdOrNum) {
        this.connectionLimit = connectionLimit;
        this.projectIdOrNum = projectIdOrNum;
    }

    /**
     * @return The number of consumer forwarding rules the consumer project can
     * create.
     * 
     */
    public Integer connectionLimit() {
        return this.connectionLimit;
    }
    /**
     * @return A project that is allowed to connect to this service attachment.
     * 
     */
    public String projectIdOrNum() {
        return this.projectIdOrNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConsumerAcceptList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer connectionLimit;
        private String projectIdOrNum;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConsumerAcceptList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLimit = defaults.connectionLimit;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
        }

        public Builder connectionLimit(Integer connectionLimit) {
            this.connectionLimit = Objects.requireNonNull(connectionLimit);
            return this;
        }
        public Builder projectIdOrNum(String projectIdOrNum) {
            this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum);
            return this;
        }        public ServiceAttachmentConsumerAcceptList build() {
            return new ServiceAttachmentConsumerAcceptList(connectionLimit, projectIdOrNum);
        }
    }
}
