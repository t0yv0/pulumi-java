// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPhraseMatcherArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPhraseMatcherArgs Empty = new GetPhraseMatcherArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="phraseMatcherId", required=true)
    private String phraseMatcherId;

    public String phraseMatcherId() {
        return this.phraseMatcherId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetPhraseMatcherArgs() {}

    private GetPhraseMatcherArgs(GetPhraseMatcherArgs $) {
        this.location = $.location;
        this.phraseMatcherId = $.phraseMatcherId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPhraseMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPhraseMatcherArgs $;

        public Builder() {
            $ = new GetPhraseMatcherArgs();
        }

        public Builder(GetPhraseMatcherArgs defaults) {
            $ = new GetPhraseMatcherArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder phraseMatcherId(String phraseMatcherId) {
            $.phraseMatcherId = phraseMatcherId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetPhraseMatcherArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.phraseMatcherId = Objects.requireNonNull($.phraseMatcherId, "expected parameter 'phraseMatcherId' to be non-null");
            return $;
        }
    }

}
