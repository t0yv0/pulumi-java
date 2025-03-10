// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.WorkflowTriggerListCallbackUrlQueriesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListIntegrationAccountSchemaContentCallbackUrlResult {
    /**
     * @return Gets the workflow trigger callback URL base path.
     * 
     */
    private final String basePath;
    /**
     * @return Gets the workflow trigger callback URL HTTP method.
     * 
     */
    private final String method;
    /**
     * @return Gets the workflow trigger callback URL query parameters.
     * 
     */
    private final @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
    /**
     * @return Gets the workflow trigger callback URL relative path.
     * 
     */
    private final String relativePath;
    /**
     * @return Gets the workflow trigger callback URL relative path parameters.
     * 
     */
    private final @Nullable List<String> relativePathParameters;
    /**
     * @return Gets the workflow trigger callback URL.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ListIntegrationAccountSchemaContentCallbackUrlResult(
        @CustomType.Parameter("basePath") String basePath,
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("queries") @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries,
        @CustomType.Parameter("relativePath") String relativePath,
        @CustomType.Parameter("relativePathParameters") @Nullable List<String> relativePathParameters,
        @CustomType.Parameter("value") String value) {
        this.basePath = basePath;
        this.method = method;
        this.queries = queries;
        this.relativePath = relativePath;
        this.relativePathParameters = relativePathParameters;
        this.value = value;
    }

    /**
     * @return Gets the workflow trigger callback URL base path.
     * 
     */
    public String basePath() {
        return this.basePath;
    }
    /**
     * @return Gets the workflow trigger callback URL HTTP method.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Gets the workflow trigger callback URL query parameters.
     * 
     */
    public Optional<WorkflowTriggerListCallbackUrlQueriesResponse> queries() {
        return Optional.ofNullable(this.queries);
    }
    /**
     * @return Gets the workflow trigger callback URL relative path.
     * 
     */
    public String relativePath() {
        return this.relativePath;
    }
    /**
     * @return Gets the workflow trigger callback URL relative path parameters.
     * 
     */
    public List<String> relativePathParameters() {
        return this.relativePathParameters == null ? List.of() : this.relativePathParameters;
    }
    /**
     * @return Gets the workflow trigger callback URL.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountSchemaContentCallbackUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String basePath;
        private String method;
        private @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
        private String relativePath;
        private @Nullable List<String> relativePathParameters;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountSchemaContentCallbackUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePath = defaults.basePath;
    	      this.method = defaults.method;
    	      this.queries = defaults.queries;
    	      this.relativePath = defaults.relativePath;
    	      this.relativePathParameters = defaults.relativePathParameters;
    	      this.value = defaults.value;
        }

        public Builder basePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder queries(@Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries) {
            this.queries = queries;
            return this;
        }
        public Builder relativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }
        public Builder relativePathParameters(@Nullable List<String> relativePathParameters) {
            this.relativePathParameters = relativePathParameters;
            return this;
        }
        public Builder relativePathParameters(String... relativePathParameters) {
            return relativePathParameters(List.of(relativePathParameters));
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ListIntegrationAccountSchemaContentCallbackUrlResult build() {
            return new ListIntegrationAccountSchemaContentCallbackUrlResult(basePath, method, queries, relativePath, relativePathParameters, value);
        }
    }
}
