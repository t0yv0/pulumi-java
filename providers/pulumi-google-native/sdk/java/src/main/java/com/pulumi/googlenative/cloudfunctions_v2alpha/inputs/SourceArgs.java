// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.RepoSourceArgs;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.StorageSourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of the function source code.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    @Import(name="repoSource")
    private @Nullable Output<RepoSourceArgs> repoSource;

    /**
     * @return If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    public Optional<Output<RepoSourceArgs>> repoSource() {
        return Optional.ofNullable(this.repoSource);
    }

    /**
     * If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    @Import(name="storageSource")
    private @Nullable Output<StorageSourceArgs> storageSource;

    /**
     * @return If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    public Optional<Output<StorageSourceArgs>> storageSource() {
        return Optional.ofNullable(this.storageSource);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.repoSource = $.repoSource;
        this.storageSource = $.storageSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(@Nullable Output<RepoSourceArgs> repoSource) {
            $.repoSource = repoSource;
            return this;
        }

        /**
         * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoSource(RepoSourceArgs repoSource) {
            return repoSource(Output.of(repoSource));
        }

        /**
         * @param storageSource If provided, get the source from this location in Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(@Nullable Output<StorageSourceArgs> storageSource) {
            $.storageSource = storageSource;
            return this;
        }

        /**
         * @param storageSource If provided, get the source from this location in Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder storageSource(StorageSourceArgs storageSource) {
            return storageSource(Output.of(storageSource));
        }

        public SourceArgs build() {
            return $;
        }
    }

}
