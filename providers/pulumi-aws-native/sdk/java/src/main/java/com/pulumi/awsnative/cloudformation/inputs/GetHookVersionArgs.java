// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHookVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHookVersionArgs Empty = new GetHookVersionArgs();

    /**
     * The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetHookVersionArgs() {}

    private GetHookVersionArgs(GetHookVersionArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHookVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHookVersionArgs $;

        public Builder() {
            $ = new GetHookVersionArgs();
        }

        public Builder(GetHookVersionArgs defaults) {
            $ = new GetHookVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetHookVersionArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
