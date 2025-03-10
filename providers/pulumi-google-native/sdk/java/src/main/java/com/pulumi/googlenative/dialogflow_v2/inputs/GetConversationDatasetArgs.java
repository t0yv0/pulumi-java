// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationDatasetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationDatasetArgs Empty = new GetConversationDatasetArgs();

    @Import(name="conversationDatasetId", required=true)
    private String conversationDatasetId;

    public String conversationDatasetId() {
        return this.conversationDatasetId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConversationDatasetArgs() {}

    private GetConversationDatasetArgs(GetConversationDatasetArgs $) {
        this.conversationDatasetId = $.conversationDatasetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationDatasetArgs $;

        public Builder() {
            $ = new GetConversationDatasetArgs();
        }

        public Builder(GetConversationDatasetArgs defaults) {
            $ = new GetConversationDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationDatasetId(String conversationDatasetId) {
            $.conversationDatasetId = conversationDatasetId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetConversationDatasetArgs build() {
            $.conversationDatasetId = Objects.requireNonNull($.conversationDatasetId, "expected parameter 'conversationDatasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
