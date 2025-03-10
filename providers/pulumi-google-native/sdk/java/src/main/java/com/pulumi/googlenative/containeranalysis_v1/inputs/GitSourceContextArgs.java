// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 * 
 */
public final class GitSourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitSourceContextArgs Empty = new GitSourceContextArgs();

    /**
     * Git commit hash.
     * 
     */
    @Import(name="revisionId")
    private @Nullable Output<String> revisionId;

    /**
     * @return Git commit hash.
     * 
     */
    public Optional<Output<String>> revisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    /**
     * Git repository URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Git repository URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private GitSourceContextArgs() {}

    private GitSourceContextArgs(GitSourceContextArgs $) {
        this.revisionId = $.revisionId;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitSourceContextArgs $;

        public Builder() {
            $ = new GitSourceContextArgs();
        }

        public Builder(GitSourceContextArgs defaults) {
            $ = new GitSourceContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param revisionId Git commit hash.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(@Nullable Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        /**
         * @param revisionId Git commit hash.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        /**
         * @param url Git repository URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Git repository URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GitSourceContextArgs build() {
            return $;
        }
    }

}
