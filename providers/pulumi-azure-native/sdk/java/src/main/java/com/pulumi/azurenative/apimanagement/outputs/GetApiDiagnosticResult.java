// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.PipelineDiagnosticSettingsResponse;
import com.pulumi.azurenative.apimanagement.outputs.SamplingSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiDiagnosticResult {
    /**
     * @return Specifies for what type of messages sampling settings should not apply.
     * 
     */
    private final @Nullable String alwaysLog;
    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    private final @Nullable PipelineDiagnosticSettingsResponse backend;
    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    private final @Nullable PipelineDiagnosticSettingsResponse frontend;
    /**
     * @return Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    private final @Nullable String httpCorrelationProtocol;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Log the ClientIP. Default is false.
     * 
     */
    private final @Nullable Boolean logClientIp;
    /**
     * @return Resource Id of a target logger.
     * 
     */
    private final String loggerId;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    private final @Nullable String operationNameFormat;
    /**
     * @return Sampling settings for Diagnostic.
     * 
     */
    private final @Nullable SamplingSettingsResponse sampling;
    /**
     * @return Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * @return The verbosity level applied to traces emitted by trace policies.
     * 
     */
    private final @Nullable String verbosity;

    @CustomType.Constructor
    private GetApiDiagnosticResult(
        @CustomType.Parameter("alwaysLog") @Nullable String alwaysLog,
        @CustomType.Parameter("backend") @Nullable PipelineDiagnosticSettingsResponse backend,
        @CustomType.Parameter("frontend") @Nullable PipelineDiagnosticSettingsResponse frontend,
        @CustomType.Parameter("httpCorrelationProtocol") @Nullable String httpCorrelationProtocol,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logClientIp") @Nullable Boolean logClientIp,
        @CustomType.Parameter("loggerId") String loggerId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operationNameFormat") @Nullable String operationNameFormat,
        @CustomType.Parameter("sampling") @Nullable SamplingSettingsResponse sampling,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("verbosity") @Nullable String verbosity) {
        this.alwaysLog = alwaysLog;
        this.backend = backend;
        this.frontend = frontend;
        this.httpCorrelationProtocol = httpCorrelationProtocol;
        this.id = id;
        this.logClientIp = logClientIp;
        this.loggerId = loggerId;
        this.name = name;
        this.operationNameFormat = operationNameFormat;
        this.sampling = sampling;
        this.type = type;
        this.verbosity = verbosity;
    }

    /**
     * @return Specifies for what type of messages sampling settings should not apply.
     * 
     */
    public Optional<String> alwaysLog() {
        return Optional.ofNullable(this.alwaysLog);
    }
    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    public Optional<PipelineDiagnosticSettingsResponse> backend() {
        return Optional.ofNullable(this.backend);
    }
    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    public Optional<PipelineDiagnosticSettingsResponse> frontend() {
        return Optional.ofNullable(this.frontend);
    }
    /**
     * @return Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    public Optional<String> httpCorrelationProtocol() {
        return Optional.ofNullable(this.httpCorrelationProtocol);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Log the ClientIP. Default is false.
     * 
     */
    public Optional<Boolean> logClientIp() {
        return Optional.ofNullable(this.logClientIp);
    }
    /**
     * @return Resource Id of a target logger.
     * 
     */
    public String loggerId() {
        return this.loggerId;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    public Optional<String> operationNameFormat() {
        return Optional.ofNullable(this.operationNameFormat);
    }
    /**
     * @return Sampling settings for Diagnostic.
     * 
     */
    public Optional<SamplingSettingsResponse> sampling() {
        return Optional.ofNullable(this.sampling);
    }
    /**
     * @return Resource type for API Management resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The verbosity level applied to traces emitted by trace policies.
     * 
     */
    public Optional<String> verbosity() {
        return Optional.ofNullable(this.verbosity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDiagnosticResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alwaysLog;
        private @Nullable PipelineDiagnosticSettingsResponse backend;
        private @Nullable PipelineDiagnosticSettingsResponse frontend;
        private @Nullable String httpCorrelationProtocol;
        private String id;
        private @Nullable Boolean logClientIp;
        private String loggerId;
        private String name;
        private @Nullable String operationNameFormat;
        private @Nullable SamplingSettingsResponse sampling;
        private String type;
        private @Nullable String verbosity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDiagnosticResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysLog = defaults.alwaysLog;
    	      this.backend = defaults.backend;
    	      this.frontend = defaults.frontend;
    	      this.httpCorrelationProtocol = defaults.httpCorrelationProtocol;
    	      this.id = defaults.id;
    	      this.logClientIp = defaults.logClientIp;
    	      this.loggerId = defaults.loggerId;
    	      this.name = defaults.name;
    	      this.operationNameFormat = defaults.operationNameFormat;
    	      this.sampling = defaults.sampling;
    	      this.type = defaults.type;
    	      this.verbosity = defaults.verbosity;
        }

        public Builder alwaysLog(@Nullable String alwaysLog) {
            this.alwaysLog = alwaysLog;
            return this;
        }
        public Builder backend(@Nullable PipelineDiagnosticSettingsResponse backend) {
            this.backend = backend;
            return this;
        }
        public Builder frontend(@Nullable PipelineDiagnosticSettingsResponse frontend) {
            this.frontend = frontend;
            return this;
        }
        public Builder httpCorrelationProtocol(@Nullable String httpCorrelationProtocol) {
            this.httpCorrelationProtocol = httpCorrelationProtocol;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logClientIp(@Nullable Boolean logClientIp) {
            this.logClientIp = logClientIp;
            return this;
        }
        public Builder loggerId(String loggerId) {
            this.loggerId = Objects.requireNonNull(loggerId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operationNameFormat(@Nullable String operationNameFormat) {
            this.operationNameFormat = operationNameFormat;
            return this;
        }
        public Builder sampling(@Nullable SamplingSettingsResponse sampling) {
            this.sampling = sampling;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder verbosity(@Nullable String verbosity) {
            this.verbosity = verbosity;
            return this;
        }        public GetApiDiagnosticResult build() {
            return new GetApiDiagnosticResult(alwaysLog, backend, frontend, httpCorrelationProtocol, id, logClientIp, loggerId, name, operationNameFormat, sampling, type, verbosity);
        }
    }
}
