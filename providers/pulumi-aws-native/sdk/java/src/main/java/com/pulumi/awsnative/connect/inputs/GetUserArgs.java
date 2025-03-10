// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The Amazon Resource Name (ARN) for the user.
     * 
     */
    @Import(name="userArn", required=true)
    private String userArn;

    /**
     * @return The Amazon Resource Name (ARN) for the user.
     * 
     */
    public String userArn() {
        return this.userArn;
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.userArn = $.userArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userArn The Amazon Resource Name (ARN) for the user.
         * 
         * @return builder
         * 
         */
        public Builder userArn(String userArn) {
            $.userArn = userArn;
            return this;
        }

        public GetUserArgs build() {
            $.userArn = Objects.requireNonNull($.userArn, "expected parameter 'userArn' to be non-null");
            return $;
        }
    }

}
