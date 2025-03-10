// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.AnyResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.StackTraceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TestIssueResponse {
    /**
     * @return Category of issue. Required.
     * 
     */
    private final String category;
    /**
     * @return A brief human-readable message describing the issue. Required.
     * 
     */
    private final String errorMessage;
    /**
     * @return Severity of issue. Required.
     * 
     */
    private final String severity;
    /**
     * @return Deprecated in favor of stack trace fields inside specific warnings.
     * 
     * @deprecated
     * Deprecated in favor of stack trace fields inside specific warnings.
     * 
     */
    @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
    private final StackTraceResponse stackTrace;
    /**
     * @return Type of issue. Required.
     * 
     */
    private final String type;
    /**
     * @return Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    private final AnyResponse warning;

    @CustomType.Constructor
    private TestIssueResponse(
        @CustomType.Parameter("category") String category,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("stackTrace") StackTraceResponse stackTrace,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("warning") AnyResponse warning) {
        this.category = category;
        this.errorMessage = errorMessage;
        this.severity = severity;
        this.stackTrace = stackTrace;
        this.type = type;
        this.warning = warning;
    }

    /**
     * @return Category of issue. Required.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return A brief human-readable message describing the issue. Required.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return Severity of issue. Required.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return Deprecated in favor of stack trace fields inside specific warnings.
     * 
     * @deprecated
     * Deprecated in favor of stack trace fields inside specific warnings.
     * 
     */
    @Deprecated /* Deprecated in favor of stack trace fields inside specific warnings. */
    public StackTraceResponse stackTrace() {
        return this.stackTrace;
    }
    /**
     * @return Type of issue. Required.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    public AnyResponse warning() {
        return this.warning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String errorMessage;
        private String severity;
        private StackTraceResponse stackTrace;
        private String type;
        private AnyResponse warning;

        public Builder() {
    	      // Empty
        }

        public Builder(TestIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.errorMessage = defaults.errorMessage;
    	      this.severity = defaults.severity;
    	      this.stackTrace = defaults.stackTrace;
    	      this.type = defaults.type;
    	      this.warning = defaults.warning;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder stackTrace(StackTraceResponse stackTrace) {
            this.stackTrace = Objects.requireNonNull(stackTrace);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder warning(AnyResponse warning) {
            this.warning = Objects.requireNonNull(warning);
            return this;
        }        public TestIssueResponse build() {
            return new TestIssueResponse(category, errorMessage, severity, stackTrace, type, warning);
        }
    }
}
