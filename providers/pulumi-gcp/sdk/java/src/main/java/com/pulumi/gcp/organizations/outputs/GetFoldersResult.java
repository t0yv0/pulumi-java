// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.organizations.outputs.GetFoldersFolder;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFoldersResult {
    /**
     * @return A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    private final List<GetFoldersFolder> folders;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String parentId;

    @CustomType.Constructor
    private GetFoldersResult(
        @CustomType.Parameter("folders") List<GetFoldersFolder> folders,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parentId") String parentId) {
        this.folders = folders;
        this.id = id;
        this.parentId = parentId;
    }

    /**
     * @return A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    public List<GetFoldersFolder> folders() {
        return this.folders;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String parentId() {
        return this.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetFoldersFolder> folders;
        private String id;
        private String parentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folders = defaults.folders;
    	      this.id = defaults.id;
    	      this.parentId = defaults.parentId;
        }

        public Builder folders(List<GetFoldersFolder> folders) {
            this.folders = Objects.requireNonNull(folders);
            return this;
        }
        public Builder folders(GetFoldersFolder... folders) {
            return folders(List.of(folders));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }        public GetFoldersResult build() {
            return new GetFoldersResult(folders, id, parentId);
        }
    }
}
