// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceProfileArgs Empty = new GetInstanceProfileArgs();

    /**
     * The name of the instance profile to create.
     * 
     */
    @Import(name="instanceProfileName", required=true)
    private String instanceProfileName;

    /**
     * @return The name of the instance profile to create.
     * 
     */
    public String instanceProfileName() {
        return this.instanceProfileName;
    }

    private GetInstanceProfileArgs() {}

    private GetInstanceProfileArgs(GetInstanceProfileArgs $) {
        this.instanceProfileName = $.instanceProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceProfileArgs $;

        public Builder() {
            $ = new GetInstanceProfileArgs();
        }

        public Builder(GetInstanceProfileArgs defaults) {
            $ = new GetInstanceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceProfileName The name of the instance profile to create.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileName(String instanceProfileName) {
            $.instanceProfileName = instanceProfileName;
            return this;
        }

        public GetInstanceProfileArgs build() {
            $.instanceProfileName = Objects.requireNonNull($.instanceProfileName, "expected parameter 'instanceProfileName' to be non-null");
            return $;
        }
    }

}
