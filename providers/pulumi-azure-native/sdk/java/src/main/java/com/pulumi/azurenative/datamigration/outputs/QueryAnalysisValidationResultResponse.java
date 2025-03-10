// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.QueryExecutionResultResponse;
import com.pulumi.azurenative.datamigration.outputs.ValidationErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class QueryAnalysisValidationResultResponse {
    /**
     * @return List of queries executed and it&#39;s execution results in source and target
     * 
     */
    private final QueryExecutionResultResponse queryResults;
    /**
     * @return Errors that are part of the execution
     * 
     */
    private final ValidationErrorResponse validationErrors;

    @CustomType.Constructor
    private QueryAnalysisValidationResultResponse(
        @CustomType.Parameter("queryResults") QueryExecutionResultResponse queryResults,
        @CustomType.Parameter("validationErrors") ValidationErrorResponse validationErrors) {
        this.queryResults = queryResults;
        this.validationErrors = validationErrors;
    }

    /**
     * @return List of queries executed and it&#39;s execution results in source and target
     * 
     */
    public QueryExecutionResultResponse queryResults() {
        return this.queryResults;
    }
    /**
     * @return Errors that are part of the execution
     * 
     */
    public ValidationErrorResponse validationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryAnalysisValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryExecutionResultResponse queryResults;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryAnalysisValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryResults = defaults.queryResults;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder queryResults(QueryExecutionResultResponse queryResults) {
            this.queryResults = Objects.requireNonNull(queryResults);
            return this;
        }
        public Builder validationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }        public QueryAnalysisValidationResultResponse build() {
            return new QueryAnalysisValidationResultResponse(queryResults, validationErrors);
        }
    }
}
