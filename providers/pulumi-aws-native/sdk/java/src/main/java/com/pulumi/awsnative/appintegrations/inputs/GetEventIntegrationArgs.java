// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventIntegrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventIntegrationArgs Empty = new GetEventIntegrationArgs();

    /**
     * The name of the event integration.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the event integration.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetEventIntegrationArgs() {}

    private GetEventIntegrationArgs(GetEventIntegrationArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventIntegrationArgs $;

        public Builder() {
            $ = new GetEventIntegrationArgs();
        }

        public Builder(GetEventIntegrationArgs defaults) {
            $ = new GetEventIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the event integration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetEventIntegrationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
