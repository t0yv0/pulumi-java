// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatasetAnnotationStoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetAnnotationStoreIamPolicyArgs Empty = new GetDatasetAnnotationStoreIamPolicyArgs();

    @Import(name="annotationStoreId", required=true)
    private String annotationStoreId;

    public String annotationStoreId() {
        return this.annotationStoreId;
    }

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

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

    private GetDatasetAnnotationStoreIamPolicyArgs() {}

    private GetDatasetAnnotationStoreIamPolicyArgs(GetDatasetAnnotationStoreIamPolicyArgs $) {
        this.annotationStoreId = $.annotationStoreId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetAnnotationStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetAnnotationStoreIamPolicyArgs $;

        public Builder() {
            $ = new GetDatasetAnnotationStoreIamPolicyArgs();
        }

        public Builder(GetDatasetAnnotationStoreIamPolicyArgs defaults) {
            $ = new GetDatasetAnnotationStoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotationStoreId(String annotationStoreId) {
            $.annotationStoreId = annotationStoreId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
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

        public GetDatasetAnnotationStoreIamPolicyArgs build() {
            $.annotationStoreId = Objects.requireNonNull($.annotationStoreId, "expected parameter 'annotationStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
