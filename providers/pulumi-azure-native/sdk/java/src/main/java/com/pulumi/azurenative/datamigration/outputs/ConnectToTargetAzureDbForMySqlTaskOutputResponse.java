// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConnectToTargetAzureDbForMySqlTaskOutputResponse {
    /**
     * @return List of databases on target server
     * 
     */
    private final List<String> databases;
    /**
     * @return Result identifier
     * 
     */
    private final String id;
    /**
     * @return Version of the target server
     * 
     */
    private final String serverVersion;
    /**
     * @return Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * @return Validation errors associated with the task
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @CustomType.Constructor
    private ConnectToTargetAzureDbForMySqlTaskOutputResponse(
        @CustomType.Parameter("databases") List<String> databases,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("serverVersion") String serverVersion,
        @CustomType.Parameter("targetServerBrandVersion") String targetServerBrandVersion,
        @CustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.databases = databases;
        this.id = id;
        this.serverVersion = serverVersion;
        this.targetServerBrandVersion = targetServerBrandVersion;
        this.validationErrors = validationErrors;
    }

    /**
     * @return List of databases on target server
     * 
     */
    public List<String> databases() {
        return this.databases;
    }
    /**
     * @return Result identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Version of the target server
     * 
     */
    public String serverVersion() {
        return this.serverVersion;
    }
    /**
     * @return Target server brand version
     * 
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * @return Validation errors associated with the task
     * 
     */
    public List<ReportableExceptionResponse> validationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> databases;
        private String id;
        private String serverVersion;
        private String targetServerBrandVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.serverVersion = defaults.serverVersion;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder databases(List<String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder serverVersion(String serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }
        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }        public ConnectToTargetAzureDbForMySqlTaskOutputResponse build() {
            return new ConnectToTargetAzureDbForMySqlTaskOutputResponse(databases, id, serverVersion, targetServerBrandVersion, validationErrors);
        }
    }
}
