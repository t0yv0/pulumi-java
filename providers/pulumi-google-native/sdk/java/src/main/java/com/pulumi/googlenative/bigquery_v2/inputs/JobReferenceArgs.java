// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobReferenceArgs Empty = new JobReferenceArgs();

    /**
     * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * [Required] The ID of the project containing this job.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return [Required] The ID of the project containing this job.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private JobReferenceArgs() {}

    private JobReferenceArgs(JobReferenceArgs $) {
        this.jobId = $.jobId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobReferenceArgs $;

        public Builder() {
            $ = new JobReferenceArgs();
        }

        public Builder(JobReferenceArgs defaults) {
            $ = new JobReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param location The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project [Required] The ID of the project containing this job.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project [Required] The ID of the project containing this job.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public JobReferenceArgs build() {
            return $;
        }
    }

}
