// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArtifactGcsArgs;
import com.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArtifactRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a resource to be used in the recipe.
 * 
 */
public final class SoftwareRecipeArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeArtifactArgs Empty = new SoftwareRecipeArtifactArgs();

    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * A Google Cloud Storage artifact.
     * 
     */
    @Import(name="gcs")
    private @Nullable Output<SoftwareRecipeArtifactGcsArgs> gcs;

    /**
     * @return A Google Cloud Storage artifact.
     * 
     */
    public Optional<Output<SoftwareRecipeArtifactGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference. Artifacts in a recipe cannot have the same id.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Id of the artifact, which the installation and update steps of this recipe can reference. Artifacts in a recipe cannot have the same id.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * A generic remote artifact.
     * 
     */
    @Import(name="remote")
    private @Nullable Output<SoftwareRecipeArtifactRemoteArgs> remote;

    /**
     * @return A generic remote artifact.
     * 
     */
    public Optional<Output<SoftwareRecipeArtifactRemoteArgs>> remote() {
        return Optional.ofNullable(this.remote);
    }

    private SoftwareRecipeArtifactArgs() {}

    private SoftwareRecipeArtifactArgs(SoftwareRecipeArtifactArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.gcs = $.gcs;
        this.id = $.id;
        this.remote = $.remote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeArtifactArgs $;

        public Builder() {
            $ = new SoftwareRecipeArtifactArgs();
        }

        public Builder(SoftwareRecipeArtifactArgs defaults) {
            $ = new SoftwareRecipeArtifactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowInsecure Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param gcs A Google Cloud Storage artifact.
         * 
         * @return builder
         * 
         */
        public Builder gcs(@Nullable Output<SoftwareRecipeArtifactGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        /**
         * @param gcs A Google Cloud Storage artifact.
         * 
         * @return builder
         * 
         */
        public Builder gcs(SoftwareRecipeArtifactGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        /**
         * @param id Id of the artifact, which the installation and update steps of this recipe can reference. Artifacts in a recipe cannot have the same id.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the artifact, which the installation and update steps of this recipe can reference. Artifacts in a recipe cannot have the same id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param remote A generic remote artifact.
         * 
         * @return builder
         * 
         */
        public Builder remote(@Nullable Output<SoftwareRecipeArtifactRemoteArgs> remote) {
            $.remote = remote;
            return this;
        }

        /**
         * @param remote A generic remote artifact.
         * 
         * @return builder
         * 
         */
        public Builder remote(SoftwareRecipeArtifactRemoteArgs remote) {
            return remote(Output.of(remote));
        }

        public SoftwareRecipeArtifactArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
