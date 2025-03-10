// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedflowArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedflowArgs Empty = new SharedflowArgs();

    /**
     * Required. Must be set to either `import` or `validate`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Required. Must be set to either `import` or `validate`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The HTTP request/response body as raw binary.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return The HTTP request/response body as raw binary.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<Map<String,String>>> extensions;

    /**
     * @return Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    public Optional<Output<List<Map<String,String>>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * Required. The name to give the shared flow
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required. The name to give the shared flow
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private SharedflowArgs() {}

    private SharedflowArgs(SharedflowArgs $) {
        this.action = $.action;
        this.contentType = $.contentType;
        this.data = $.data;
        this.extensions = $.extensions;
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedflowArgs $;

        public Builder() {
            $ = new SharedflowArgs();
        }

        public Builder(SharedflowArgs defaults) {
            $ = new SharedflowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Required. Must be set to either `import` or `validate`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Required. Must be set to either `import` or `validate`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param contentType The HTTP Content-Type header value specifying the content type of the body.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The HTTP Content-Type header value specifying the content type of the body.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param data The HTTP request/response body as raw binary.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The HTTP request/response body as raw binary.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<Map<String,String>>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<Map<String,String>> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(Map<String,String>... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param name Required. The name to give the shared flow
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required. The name to give the shared flow
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public SharedflowArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
