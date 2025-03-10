// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryGroupArgs Empty = new EntryGroupArgs();

    /**
     * Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;. Default value is an empty string.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;. Default value is an empty string.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required. The ID of the entry group to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and must start with a letter or underscore. The maximum size is 64 bytes when encoded in UTF-8.
     * 
     */
    @Import(name="entryGroupId", required=true)
    private Output<String> entryGroupId;

    /**
     * @return Required. The ID of the entry group to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and must start with a letter or underscore. The maximum size is 64 bytes when encoded in UTF-8.
     * 
     */
    public Output<String> entryGroupId() {
        return this.entryGroupId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private EntryGroupArgs() {}

    private EntryGroupArgs(EntryGroupArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.entryGroupId = $.entryGroupId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryGroupArgs $;

        public Builder() {
            $ = new EntryGroupArgs();
        }

        public Builder(EntryGroupArgs defaults) {
            $ = new EntryGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param entryGroupId Required. The ID of the entry group to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and must start with a letter or underscore. The maximum size is 64 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder entryGroupId(Output<String> entryGroupId) {
            $.entryGroupId = entryGroupId;
            return this;
        }

        /**
         * @param entryGroupId Required. The ID of the entry group to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and must start with a letter or underscore. The maximum size is 64 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder entryGroupId(String entryGroupId) {
            return entryGroupId(Output.of(entryGroupId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public EntryGroupArgs build() {
            $.entryGroupId = Objects.requireNonNull($.entryGroupId, "expected parameter 'entryGroupId' to be non-null");
            return $;
        }
    }

}
