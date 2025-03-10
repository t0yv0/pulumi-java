// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapTestArgs Empty = new URLMapTestArgs();

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this test case.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Host portion of the URL.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Host portion of the URL.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path portion of the URL.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The backend service or backend bucket link that should be matched by this test.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private URLMapTestArgs() {}

    private URLMapTestArgs(URLMapTestArgs $) {
        this.description = $.description;
        this.host = $.host;
        this.path = $.path;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapTestArgs $;

        public Builder() {
            $ = new URLMapTestArgs();
        }

        public Builder(URLMapTestArgs defaults) {
            $ = new URLMapTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of this test case.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this test case.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param host Host portion of the URL.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host portion of the URL.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param path Path portion of the URL.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path portion of the URL.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param service The backend service or backend bucket link that should be matched by this test.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The backend service or backend bucket link that should be matched by this test.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public URLMapTestArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
