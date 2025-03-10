// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointArgs Empty = new GetAccessPointArgs();

    /**
     * The name you want to assign to this Access Point. If you don&#39;t specify a name, AWS CloudFormation generates a unique ID and uses that ID for the access point name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name you want to assign to this Access Point. If you don&#39;t specify a name, AWS CloudFormation generates a unique ID and uses that ID for the access point name.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAccessPointArgs() {}

    private GetAccessPointArgs(GetAccessPointArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointArgs $;

        public Builder() {
            $ = new GetAccessPointArgs();
        }

        public Builder(GetAccessPointArgs defaults) {
            $ = new GetAccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name you want to assign to this Access Point. If you don&#39;t specify a name, AWS CloudFormation generates a unique ID and uses that ID for the access point name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAccessPointArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
