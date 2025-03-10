// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningexperimentation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return The immutable id of the team account which contains this workspace.
     * 
     */
    private final String accountId;
    /**
     * @return The creation date of the machine learning workspace in ISO8601 format.
     * 
     */
    private final String creationDate;
    /**
     * @return The description of this workspace.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    private final String friendlyName;
    /**
     * @return The resource ID.
     * 
     */
    private final String id;
    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * @return The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;
    /**
     * @return The immutable id of this workspace.
     * 
     */
    private final String workspaceId;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.accountId = accountId;
        this.creationDate = creationDate;
        this.description = description;
        this.friendlyName = friendlyName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.workspaceId = workspaceId;
    }

    /**
     * @return The immutable id of the team account which contains this workspace.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The creation date of the machine learning workspace in ISO8601 format.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The description of this workspace.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return The resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The immutable id of this workspace.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationDate;
        private @Nullable String description;
        private String friendlyName;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
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
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(accountId, creationDate, description, friendlyName, id, location, name, provisioningState, tags, type, workspaceId);
        }
    }
}
