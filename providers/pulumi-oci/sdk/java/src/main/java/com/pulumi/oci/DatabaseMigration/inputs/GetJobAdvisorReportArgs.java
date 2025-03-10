// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobAdvisorReportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobAdvisorReportArgs Empty = new GetJobAdvisorReportArgs();

    /**
     * The OCID of the job
     * 
     */
    @Import(name="jobId", required=true)
    private String jobId;

    /**
     * @return The OCID of the job
     * 
     */
    public String jobId() {
        return this.jobId;
    }

    private GetJobAdvisorReportArgs() {}

    private GetJobAdvisorReportArgs(GetJobAdvisorReportArgs $) {
        this.jobId = $.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobAdvisorReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobAdvisorReportArgs $;

        public Builder() {
            $ = new GetJobAdvisorReportArgs();
        }

        public Builder(GetJobAdvisorReportArgs defaults) {
            $ = new GetJobAdvisorReportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId The OCID of the job
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            $.jobId = jobId;
            return this;
        }

        public GetJobAdvisorReportArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}
