// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex;

import com.pulumi.awsnative.lex.inputs.ResourcePolicyPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @Import(name="policy", required=true)
    private Output<ResourcePolicyPolicyArgs> policy;

    public Output<ResourcePolicyPolicyArgs> policy() {
        return this.policy;
    }

    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ResourcePolicyArgs() {}

    private ResourcePolicyArgs(ResourcePolicyArgs $) {
        this.policy = $.policy;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyArgs $;

        public Builder() {
            $ = new ResourcePolicyArgs();
        }

        public Builder(ResourcePolicyArgs defaults) {
            $ = new ResourcePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policy(Output<ResourcePolicyPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(ResourcePolicyPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ResourcePolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
