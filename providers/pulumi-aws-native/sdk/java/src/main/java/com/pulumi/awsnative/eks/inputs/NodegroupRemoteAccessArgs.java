// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object representing a remote access configuration specification for AWS EKS Nodegroup.
 * 
 */
public final class NodegroupRemoteAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodegroupRemoteAccessArgs Empty = new NodegroupRemoteAccessArgs();

    @Import(name="ec2SshKey", required=true)
    private Output<String> ec2SshKey;

    public Output<String> ec2SshKey() {
        return this.ec2SshKey;
    }

    @Import(name="sourceSecurityGroups")
    private @Nullable Output<List<String>> sourceSecurityGroups;

    public Optional<Output<List<String>>> sourceSecurityGroups() {
        return Optional.ofNullable(this.sourceSecurityGroups);
    }

    private NodegroupRemoteAccessArgs() {}

    private NodegroupRemoteAccessArgs(NodegroupRemoteAccessArgs $) {
        this.ec2SshKey = $.ec2SshKey;
        this.sourceSecurityGroups = $.sourceSecurityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodegroupRemoteAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodegroupRemoteAccessArgs $;

        public Builder() {
            $ = new NodegroupRemoteAccessArgs();
        }

        public Builder(NodegroupRemoteAccessArgs defaults) {
            $ = new NodegroupRemoteAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder ec2SshKey(Output<String> ec2SshKey) {
            $.ec2SshKey = ec2SshKey;
            return this;
        }

        public Builder ec2SshKey(String ec2SshKey) {
            return ec2SshKey(Output.of(ec2SshKey));
        }

        public Builder sourceSecurityGroups(@Nullable Output<List<String>> sourceSecurityGroups) {
            $.sourceSecurityGroups = sourceSecurityGroups;
            return this;
        }

        public Builder sourceSecurityGroups(List<String> sourceSecurityGroups) {
            return sourceSecurityGroups(Output.of(sourceSecurityGroups));
        }

        public Builder sourceSecurityGroups(String... sourceSecurityGroups) {
            return sourceSecurityGroups(List.of(sourceSecurityGroups));
        }

        public NodegroupRemoteAccessArgs build() {
            $.ec2SshKey = Objects.requireNonNull($.ec2SshKey, "expected parameter 'ec2SshKey' to be non-null");
            return $;
        }
    }

}
