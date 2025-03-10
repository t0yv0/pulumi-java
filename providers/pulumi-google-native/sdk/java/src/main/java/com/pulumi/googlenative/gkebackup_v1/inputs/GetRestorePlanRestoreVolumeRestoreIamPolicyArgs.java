// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestorePlanRestoreVolumeRestoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestorePlanRestoreVolumeRestoreIamPolicyArgs Empty = new GetRestorePlanRestoreVolumeRestoreIamPolicyArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="restoreId", required=true)
    private String restoreId;

    public String restoreId() {
        return this.restoreId;
    }

    @Import(name="restorePlanId", required=true)
    private String restorePlanId;

    public String restorePlanId() {
        return this.restorePlanId;
    }

    @Import(name="volumeRestoreId", required=true)
    private String volumeRestoreId;

    public String volumeRestoreId() {
        return this.volumeRestoreId;
    }

    private GetRestorePlanRestoreVolumeRestoreIamPolicyArgs() {}

    private GetRestorePlanRestoreVolumeRestoreIamPolicyArgs(GetRestorePlanRestoreVolumeRestoreIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.restoreId = $.restoreId;
        this.restorePlanId = $.restorePlanId;
        this.volumeRestoreId = $.volumeRestoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestorePlanRestoreVolumeRestoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestorePlanRestoreVolumeRestoreIamPolicyArgs $;

        public Builder() {
            $ = new GetRestorePlanRestoreVolumeRestoreIamPolicyArgs();
        }

        public Builder(GetRestorePlanRestoreVolumeRestoreIamPolicyArgs defaults) {
            $ = new GetRestorePlanRestoreVolumeRestoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder restoreId(String restoreId) {
            $.restoreId = restoreId;
            return this;
        }

        public Builder restorePlanId(String restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public Builder volumeRestoreId(String volumeRestoreId) {
            $.volumeRestoreId = volumeRestoreId;
            return this;
        }

        public GetRestorePlanRestoreVolumeRestoreIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.restoreId = Objects.requireNonNull($.restoreId, "expected parameter 'restoreId' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            $.volumeRestoreId = Objects.requireNonNull($.volumeRestoreId, "expected parameter 'volumeRestoreId' to be non-null");
            return $;
        }
    }

}
