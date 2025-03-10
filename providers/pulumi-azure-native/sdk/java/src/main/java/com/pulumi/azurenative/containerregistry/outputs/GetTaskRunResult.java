// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.DockerBuildRequestResponse;
import com.pulumi.azurenative.containerregistry.outputs.EncodedTaskRunRequestResponse;
import com.pulumi.azurenative.containerregistry.outputs.FileTaskRunRequestResponse;
import com.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.RunResponse;
import com.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import com.pulumi.azurenative.containerregistry.outputs.TaskRunRequestResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTaskRunResult {
    /**
     * @return How the run should be forced to rerun even if the run request configuration has not changed
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * @return The resource ID.
     * 
     */
    private final String id;
    /**
     * @return Identity for the resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * @return The location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of this task run
     * 
     */
    private final String provisioningState;
    /**
     * @return The request (parameters) for the run
     * 
     */
    private final @Nullable Object runRequest;
    /**
     * @return The result of this task run
     * 
     */
    private final RunResponse runResult;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTaskRunResult(
        @CustomType.Parameter("forceUpdateTag") @Nullable String forceUpdateTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("runRequest") @Nullable Object runRequest,
        @CustomType.Parameter("runResult") RunResponse runResult,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.forceUpdateTag = forceUpdateTag;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.runRequest = runRequest;
        this.runResult = runResult;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return How the run should be forced to rerun even if the run request configuration has not changed
     * 
     */
    public Optional<String> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * @return The resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<IdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The location of the resource
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of this task run
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The request (parameters) for the run
     * 
     */
    public Optional<Object> runRequest() {
        return Optional.ofNullable(this.runRequest);
    }
    /**
     * @return The result of this task run
     * 
     */
    public RunResponse runResult() {
        return this.runResult;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskRunResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable Object runRequest;
        private RunResponse runResult;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskRunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runRequest = defaults.runRequest;
    	      this.runResult = defaults.runResult;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder runRequest(@Nullable Object runRequest) {
            this.runRequest = runRequest;
            return this;
        }
        public Builder runResult(RunResponse runResult) {
            this.runResult = Objects.requireNonNull(runResult);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTaskRunResult build() {
            return new GetTaskRunResult(forceUpdateTag, id, identity, location, name, provisioningState, runRequest, runResult, systemData, type);
        }
    }
}
