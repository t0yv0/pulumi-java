// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponseContent;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MarkdownPartMetadataResponseSettings {
    /**
     * @return The content of markdown part.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponseContent content;

    @CustomType.Constructor
    private MarkdownPartMetadataResponseSettings(@CustomType.Parameter("content") @Nullable MarkdownPartMetadataResponseContent content) {
        this.content = content;
    }

    /**
     * @return The content of markdown part.
     * 
     */
    public Optional<MarkdownPartMetadataResponseContent> content() {
        return Optional.ofNullable(this.content);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponseContent content;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder content(@Nullable MarkdownPartMetadataResponseContent content) {
            this.content = content;
            return this;
        }        public MarkdownPartMetadataResponseSettings build() {
            return new MarkdownPartMetadataResponseSettings(content);
        }
    }
}
