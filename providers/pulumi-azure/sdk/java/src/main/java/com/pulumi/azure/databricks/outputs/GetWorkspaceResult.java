// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return SKU of this Databricks Workspace.
     * 
     */
    private final String sku;
    /**
     * @return A mapping of tags to assign to the Databricks Workspace.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Unique ID of this Databricks Workspace in Databricks management plane.
     * 
     */
    private final String workspaceId;
    /**
     * @return URL this Databricks Workspace is accessible on.
     * 
     */
    private final String workspaceUrl;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("workspaceId") String workspaceId,
        @CustomType.Parameter("workspaceUrl") String workspaceUrl) {
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.sku = sku;
        this.tags = tags;
        this.workspaceId = workspaceId;
        this.workspaceUrl = workspaceUrl;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return SKU of this Databricks Workspace.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags to assign to the Databricks Workspace.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Unique ID of this Databricks Workspace in Databricks management plane.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }
    /**
     * @return URL this Databricks Workspace is accessible on.
     * 
     */
    public String workspaceUrl() {
        return this.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String resourceGroupName;
        private String sku;
        private @Nullable Map<String,String> tags;
        private String workspaceId;
        private String workspaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public Builder workspaceUrl(String workspaceUrl) {
            this.workspaceUrl = Objects.requireNonNull(workspaceUrl);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(id, name, resourceGroupName, sku, tags, workspaceId, workspaceUrl);
        }
    }
}
