// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.outputs;

import com.pulumi.awsnative.datasync.outputs.LocationSMBMountOptions;
import com.pulumi.awsnative.datasync.outputs.LocationSMBTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLocationSMBResult {
    /**
     * @return The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    private final @Nullable List<String> agentArns;
    /**
     * @return The name of the Windows domain that the SMB server belongs to.
     * 
     */
    private final @Nullable String domain;
    /**
     * @return The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * @return The URL of the SMB location that was described.
     * 
     */
    private final @Nullable String locationUri;
    private final @Nullable LocationSMBMountOptions mountOptions;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationSMBTag> tags;
    /**
     * @return The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private GetLocationSMBResult(
        @CustomType.Parameter("agentArns") @Nullable List<String> agentArns,
        @CustomType.Parameter("domain") @Nullable String domain,
        @CustomType.Parameter("locationArn") @Nullable String locationArn,
        @CustomType.Parameter("locationUri") @Nullable String locationUri,
        @CustomType.Parameter("mountOptions") @Nullable LocationSMBMountOptions mountOptions,
        @CustomType.Parameter("tags") @Nullable List<LocationSMBTag> tags,
        @CustomType.Parameter("user") @Nullable String user) {
        this.agentArns = agentArns;
        this.domain = domain;
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.mountOptions = mountOptions;
        this.tags = tags;
        this.user = user;
    }

    /**
     * @return The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    public List<String> agentArns() {
        return this.agentArns == null ? List.of() : this.agentArns;
    }
    /**
     * @return The name of the Windows domain that the SMB server belongs to.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    public Optional<String> locationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * @return The URL of the SMB location that was described.
     * 
     */
    public Optional<String> locationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    public Optional<LocationSMBMountOptions> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<LocationSMBTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationSMBResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> agentArns;
        private @Nullable String domain;
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable LocationSMBMountOptions mountOptions;
        private @Nullable List<LocationSMBTag> tags;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationSMBResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.domain = defaults.domain;
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.mountOptions = defaults.mountOptions;
    	      this.tags = defaults.tags;
    	      this.user = defaults.user;
        }

        public Builder agentArns(@Nullable List<String> agentArns) {
            this.agentArns = agentArns;
            return this;
        }
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder locationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }
        public Builder locationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public Builder mountOptions(@Nullable LocationSMBMountOptions mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder tags(@Nullable List<LocationSMBTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(LocationSMBTag... tags) {
            return tags(List.of(tags));
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public GetLocationSMBResult build() {
            return new GetLocationSMBResult(agentArns, domain, locationArn, locationUri, mountOptions, tags, user);
        }
    }
}
