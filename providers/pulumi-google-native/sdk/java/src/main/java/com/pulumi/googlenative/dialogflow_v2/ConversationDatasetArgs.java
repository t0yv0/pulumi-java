// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConversationDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConversationDatasetArgs Empty = new ConversationDatasetArgs();

    /**
     * Optional. The description of the dataset. Maximum of 10000 bytes.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. The description of the dataset. Maximum of 10000 bytes.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the dataset. Maximum of 64 bytes.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the dataset. Maximum of 64 bytes.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ConversationDatasetArgs() {}

    private ConversationDatasetArgs(ConversationDatasetArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConversationDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConversationDatasetArgs $;

        public Builder() {
            $ = new ConversationDatasetArgs();
        }

        public Builder(ConversationDatasetArgs defaults) {
            $ = new ConversationDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. The description of the dataset. Maximum of 10000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. The description of the dataset. Maximum of 10000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the dataset. Maximum of 64 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the dataset. Maximum of 64 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ConversationDatasetArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
