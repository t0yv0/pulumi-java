// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionFixedResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionFixedResponseArgs Empty = new ListenerDefaultActionFixedResponseArgs();

    /**
     * Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Message body.
     * 
     */
    @Import(name="messageBody")
    private @Nullable Output<String> messageBody;

    /**
     * @return Message body.
     * 
     */
    public Optional<Output<String>> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }

    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    /**
     * @return HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private ListenerDefaultActionFixedResponseArgs() {}

    private ListenerDefaultActionFixedResponseArgs(ListenerDefaultActionFixedResponseArgs $) {
        this.contentType = $.contentType;
        this.messageBody = $.messageBody;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionFixedResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionFixedResponseArgs $;

        public Builder() {
            $ = new ListenerDefaultActionFixedResponseArgs();
        }

        public Builder(ListenerDefaultActionFixedResponseArgs defaults) {
            $ = new ListenerDefaultActionFixedResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param messageBody Message body.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(@Nullable Output<String> messageBody) {
            $.messageBody = messageBody;
            return this;
        }

        /**
         * @param messageBody Message body.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(String messageBody) {
            return messageBody(Output.of(messageBody));
        }

        /**
         * @param statusCode HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ListenerDefaultActionFixedResponseArgs build() {
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            return $;
        }
    }

}
