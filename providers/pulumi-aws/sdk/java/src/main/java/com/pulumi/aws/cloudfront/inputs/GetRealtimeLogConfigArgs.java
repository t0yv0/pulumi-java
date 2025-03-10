// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRealtimeLogConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRealtimeLogConfigArgs Empty = new GetRealtimeLogConfigArgs();

    /**
     * The unique name to identify this real-time log configuration.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The unique name to identify this real-time log configuration.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRealtimeLogConfigArgs() {}

    private GetRealtimeLogConfigArgs(GetRealtimeLogConfigArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRealtimeLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRealtimeLogConfigArgs $;

        public Builder() {
            $ = new GetRealtimeLogConfigArgs();
        }

        public Builder(GetRealtimeLogConfigArgs defaults) {
            $ = new GetRealtimeLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique name to identify this real-time log configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRealtimeLogConfigArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
