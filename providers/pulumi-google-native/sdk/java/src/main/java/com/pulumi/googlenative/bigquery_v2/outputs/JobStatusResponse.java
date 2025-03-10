// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.ErrorProtoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobStatusResponse {
    /**
     * @return Final error result of the job. If present, indicates that the job has completed and was unsuccessful.
     * 
     */
    private final ErrorProtoResponse errorResult;
    /**
     * @return The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
     * 
     */
    private final List<ErrorProtoResponse> errors;
    /**
     * @return Running state of the job.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private JobStatusResponse(
        @CustomType.Parameter("errorResult") ErrorProtoResponse errorResult,
        @CustomType.Parameter("errors") List<ErrorProtoResponse> errors,
        @CustomType.Parameter("state") String state) {
        this.errorResult = errorResult;
        this.errors = errors;
        this.state = state;
    }

    /**
     * @return Final error result of the job. If present, indicates that the job has completed and was unsuccessful.
     * 
     */
    public ErrorProtoResponse errorResult() {
        return this.errorResult;
    }
    /**
     * @return The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
     * 
     */
    public List<ErrorProtoResponse> errors() {
        return this.errors;
    }
    /**
     * @return Running state of the job.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorProtoResponse errorResult;
        private List<ErrorProtoResponse> errors;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorResult = defaults.errorResult;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
        }

        public Builder errorResult(ErrorProtoResponse errorResult) {
            this.errorResult = Objects.requireNonNull(errorResult);
            return this;
        }
        public Builder errors(List<ErrorProtoResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(ErrorProtoResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public JobStatusResponse build() {
            return new JobStatusResponse(errorResult, errors, state);
        }
    }
}
