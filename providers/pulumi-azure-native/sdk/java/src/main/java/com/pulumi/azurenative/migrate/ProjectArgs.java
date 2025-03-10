// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.ProjectPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * For optimistic concurrency control.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    /**
     * @return For optimistic concurrency control.
     * 
     */
    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Azure location in which project is created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Azure location in which project is created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName")
    private @Nullable Output<String> projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public Optional<Output<String>> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    /**
     * Properties of the project.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ProjectPropertiesArgs> properties;

    /**
     * @return Properties of the project.
     * 
     */
    public Optional<Output<ProjectPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags provided by Azure Tagging service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Object> tags;

    /**
     * @return Tags provided by Azure Tagging service.
     * 
     */
    public Optional<Output<Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.eTag = $.eTag;
        this.location = $.location;
        this.projectName = $.projectName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eTag For optimistic concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        /**
         * @param eTag For optimistic concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        /**
         * @param location Azure location in which project is created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Azure location in which project is created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(@Nullable Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param properties Properties of the project.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ProjectPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of the project.
         * 
         * @return builder
         * 
         */
        public Builder properties(ProjectPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Tags provided by Azure Tagging service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags provided by Azure Tagging service.
         * 
         * @return builder
         * 
         */
        public Builder tags(Object tags) {
            return tags(Output.of(tags));
        }

        public ProjectArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
