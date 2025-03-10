// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    @EnumType
    public enum AppEngineHttpRequestHttpMethod {
        /**
         * HTTP method unspecified
         * 
         */
        HttpMethodUnspecified("HTTP_METHOD_UNSPECIFIED"),
        /**
         * HTTP POST
         * 
         */
        Post("POST"),
        /**
         * HTTP GET
         * 
         */
        Get("GET"),
        /**
         * HTTP HEAD
         * 
         */
        Head("HEAD"),
        /**
         * HTTP PUT
         * 
         */
        Put("PUT"),
        /**
         * HTTP DELETE
         * 
         */
        Delete("DELETE"),
        /**
         * HTTP PATCH
         * 
         */
        Patch("PATCH"),
        /**
         * HTTP OPTIONS
         * 
         */
        Options("OPTIONS");

        private final String value;

        AppEngineHttpRequestHttpMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppEngineHttpRequestHttpMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
