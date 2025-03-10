// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVersionResult {
    /**
     * @return The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. The developer-provided description of this version.
     * 
     */
    private final String description;
    /**
     * @return The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    private final String name;
    /**
     * @return The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    private final String status;
    /**
     * @return The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    private final Integer versionNumber;

    @CustomType.Constructor
    private GetVersionResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("versionNumber") Integer versionNumber) {
        this.createTime = createTime;
        this.description = description;
        this.name = name;
        this.status = status;
        this.versionNumber = versionNumber;
    }

    /**
     * @return The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. The developer-provided description of this version.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The status of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
     * 
     */
    public Integer versionNumber() {
        return this.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String name;
        private String status;
        private Integer versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = Objects.requireNonNull(versionNumber);
            return this;
        }        public GetVersionResult build() {
            return new GetVersionResult(createTime, description, name, status, versionNumber);
        }
    }
}
