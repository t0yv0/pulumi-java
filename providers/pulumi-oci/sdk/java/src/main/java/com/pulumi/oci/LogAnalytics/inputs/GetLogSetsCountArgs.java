// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogSetsCountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogSetsCountArgs Empty = new GetLogSetsCountArgs();

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private GetLogSetsCountArgs() {}

    private GetLogSetsCountArgs(GetLogSetsCountArgs $) {
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogSetsCountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogSetsCountArgs $;

        public Builder() {
            $ = new GetLogSetsCountArgs();
        }

        public Builder(GetLogSetsCountArgs defaults) {
            $ = new GetLogSetsCountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetLogSetsCountArgs build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
