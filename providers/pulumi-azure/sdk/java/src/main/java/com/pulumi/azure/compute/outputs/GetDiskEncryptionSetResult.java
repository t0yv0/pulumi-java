// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDiskEncryptionSetResult {
    /**
     * @return Is the Azure Disk Encryption Set Key automatically rotated to latest version?
     * 
     */
    private final Boolean autoKeyRotationEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The location where the Disk Encryption Set exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Disk Encryption Set.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetDiskEncryptionSetResult(
        @CustomType.Parameter("autoKeyRotationEnabled") Boolean autoKeyRotationEnabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.autoKeyRotationEnabled = autoKeyRotationEnabled;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
    }

    /**
     * @return Is the Azure Disk Encryption Set Key automatically rotated to latest version?
     * 
     */
    public Boolean autoKeyRotationEnabled() {
        return this.autoKeyRotationEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location where the Disk Encryption Set exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the Disk Encryption Set.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskEncryptionSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoKeyRotationEnabled;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskEncryptionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoKeyRotationEnabled = defaults.autoKeyRotationEnabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder autoKeyRotationEnabled(Boolean autoKeyRotationEnabled) {
            this.autoKeyRotationEnabled = Objects.requireNonNull(autoKeyRotationEnabled);
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
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetDiskEncryptionSetResult build() {
            return new GetDiskEncryptionSetResult(autoKeyRotationEnabled, id, location, name, resourceGroupName, tags);
        }
    }
}
