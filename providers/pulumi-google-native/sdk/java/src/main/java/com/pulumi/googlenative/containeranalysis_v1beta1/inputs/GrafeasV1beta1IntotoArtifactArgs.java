// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ArtifactHashesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrafeasV1beta1IntotoArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1IntotoArtifactArgs Empty = new GrafeasV1beta1IntotoArtifactArgs();

    @Import(name="hashes")
    private @Nullable Output<ArtifactHashesArgs> hashes;

    public Optional<Output<ArtifactHashesArgs>> hashes() {
        return Optional.ofNullable(this.hashes);
    }

    @Import(name="resourceUri")
    private @Nullable Output<String> resourceUri;

    public Optional<Output<String>> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    private GrafeasV1beta1IntotoArtifactArgs() {}

    private GrafeasV1beta1IntotoArtifactArgs(GrafeasV1beta1IntotoArtifactArgs $) {
        this.hashes = $.hashes;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrafeasV1beta1IntotoArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrafeasV1beta1IntotoArtifactArgs $;

        public Builder() {
            $ = new GrafeasV1beta1IntotoArtifactArgs();
        }

        public Builder(GrafeasV1beta1IntotoArtifactArgs defaults) {
            $ = new GrafeasV1beta1IntotoArtifactArgs(Objects.requireNonNull(defaults));
        }

        public Builder hashes(@Nullable Output<ArtifactHashesArgs> hashes) {
            $.hashes = hashes;
            return this;
        }

        public Builder hashes(ArtifactHashesArgs hashes) {
            return hashes(Output.of(hashes));
        }

        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public GrafeasV1beta1IntotoArtifactArgs build() {
            return $;
        }
    }

}
