// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Factory&#39;s VSTS repo information.
 * 
 */
public final class FactoryVSTSConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FactoryVSTSConfigurationArgs Empty = new FactoryVSTSConfigurationArgs();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
    private Output<String> collaborationBranch;

    /**
     * @return Collaboration branch.
     * 
     */
    public Output<String> collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable Output<String> lastCommitId;

    /**
     * @return Last commit id.
     * 
     */
    public Optional<Output<String>> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * VSTS project name.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return VSTS project name.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
    private Output<String> repositoryName;

    /**
     * @return Repository name.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
    private Output<String> rootFolder;

    /**
     * @return Root folder.
     * 
     */
    public Output<String> rootFolder() {
        return this.rootFolder;
    }

    /**
     * VSTS tenant id.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return VSTS tenant id.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Type of repo configuration.
     * Expected value is &#39;FactoryVSTSConfiguration&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of repo configuration.
     * Expected value is &#39;FactoryVSTSConfiguration&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FactoryVSTSConfigurationArgs() {}

    private FactoryVSTSConfigurationArgs(FactoryVSTSConfigurationArgs $) {
        this.accountName = $.accountName;
        this.collaborationBranch = $.collaborationBranch;
        this.lastCommitId = $.lastCommitId;
        this.projectName = $.projectName;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryVSTSConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryVSTSConfigurationArgs $;

        public Builder() {
            $ = new FactoryVSTSConfigurationArgs();
        }

        public Builder(FactoryVSTSConfigurationArgs defaults) {
            $ = new FactoryVSTSConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param collaborationBranch Collaboration branch.
         * 
         * @return builder
         * 
         */
        public Builder collaborationBranch(Output<String> collaborationBranch) {
            $.collaborationBranch = collaborationBranch;
            return this;
        }

        /**
         * @param collaborationBranch Collaboration branch.
         * 
         * @return builder
         * 
         */
        public Builder collaborationBranch(String collaborationBranch) {
            return collaborationBranch(Output.of(collaborationBranch));
        }

        /**
         * @param lastCommitId Last commit id.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param lastCommitId Last commit id.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(String lastCommitId) {
            return lastCommitId(Output.of(lastCommitId));
        }

        /**
         * @param projectName VSTS project name.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName VSTS project name.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param repositoryName Repository name.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName Repository name.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        /**
         * @param rootFolder Root folder.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(Output<String> rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        /**
         * @param rootFolder Root folder.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(String rootFolder) {
            return rootFolder(Output.of(rootFolder));
        }

        /**
         * @param tenantId VSTS tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId VSTS tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Type of repo configuration.
         * Expected value is &#39;FactoryVSTSConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of repo configuration.
         * Expected value is &#39;FactoryVSTSConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FactoryVSTSConfigurationArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.collaborationBranch = Objects.requireNonNull($.collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            $.rootFolder = Objects.requireNonNull($.rootFolder, "expected parameter 'rootFolder' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
