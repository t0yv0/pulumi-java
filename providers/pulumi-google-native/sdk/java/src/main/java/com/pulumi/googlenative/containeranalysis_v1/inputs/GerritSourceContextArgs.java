// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GerritSourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GerritSourceContextArgs Empty = new GerritSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext")
    private @Nullable Output<AliasContextArgs> aliasContext;

    /**
     * @return An alias, which may be a branch or tag.
     * 
     */
    public Optional<Output<AliasContextArgs>> aliasContext() {
        return Optional.ofNullable(this.aliasContext);
    }

    /**
     * The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    @Import(name="gerritProject")
    private @Nullable Output<String> gerritProject;

    /**
     * @return The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    public Optional<Output<String>> gerritProject() {
        return Optional.ofNullable(this.gerritProject);
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @Import(name="hostUri")
    private @Nullable Output<String> hostUri;

    /**
     * @return The URI of a running Gerrit instance.
     * 
     */
    public Optional<Output<String>> hostUri() {
        return Optional.ofNullable(this.hostUri);
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @Import(name="revisionId")
    private @Nullable Output<String> revisionId;

    /**
     * @return A revision (commit) ID.
     * 
     */
    public Optional<Output<String>> revisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    private GerritSourceContextArgs() {}

    private GerritSourceContextArgs(GerritSourceContextArgs $) {
        this.aliasContext = $.aliasContext;
        this.gerritProject = $.gerritProject;
        this.hostUri = $.hostUri;
        this.revisionId = $.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GerritSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GerritSourceContextArgs $;

        public Builder() {
            $ = new GerritSourceContextArgs();
        }

        public Builder(GerritSourceContextArgs defaults) {
            $ = new GerritSourceContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasContext An alias, which may be a branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder aliasContext(@Nullable Output<AliasContextArgs> aliasContext) {
            $.aliasContext = aliasContext;
            return this;
        }

        /**
         * @param aliasContext An alias, which may be a branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder aliasContext(AliasContextArgs aliasContext) {
            return aliasContext(Output.of(aliasContext));
        }

        /**
         * @param gerritProject The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
         * 
         * @return builder
         * 
         */
        public Builder gerritProject(@Nullable Output<String> gerritProject) {
            $.gerritProject = gerritProject;
            return this;
        }

        /**
         * @param gerritProject The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
         * 
         * @return builder
         * 
         */
        public Builder gerritProject(String gerritProject) {
            return gerritProject(Output.of(gerritProject));
        }

        /**
         * @param hostUri The URI of a running Gerrit instance.
         * 
         * @return builder
         * 
         */
        public Builder hostUri(@Nullable Output<String> hostUri) {
            $.hostUri = hostUri;
            return this;
        }

        /**
         * @param hostUri The URI of a running Gerrit instance.
         * 
         * @return builder
         * 
         */
        public Builder hostUri(String hostUri) {
            return hostUri(Output.of(hostUri));
        }

        /**
         * @param revisionId A revision (commit) ID.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(@Nullable Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        /**
         * @param revisionId A revision (commit) ID.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        public GerritSourceContextArgs build() {
            return $;
        }
    }

}
