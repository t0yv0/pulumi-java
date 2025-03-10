// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopePacketHeaderStatementRequestArgs;
import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeResourceStatementRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopePathStatementRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopePathStatementRequestArgs Empty = new NetworkInsightsAccessScopePathStatementRequestArgs();

    @Import(name="packetHeaderStatement")
    private @Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement;

    public Optional<Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs>> packetHeaderStatement() {
        return Optional.ofNullable(this.packetHeaderStatement);
    }

    @Import(name="resourceStatement")
    private @Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement;

    public Optional<Output<NetworkInsightsAccessScopeResourceStatementRequestArgs>> resourceStatement() {
        return Optional.ofNullable(this.resourceStatement);
    }

    private NetworkInsightsAccessScopePathStatementRequestArgs() {}

    private NetworkInsightsAccessScopePathStatementRequestArgs(NetworkInsightsAccessScopePathStatementRequestArgs $) {
        this.packetHeaderStatement = $.packetHeaderStatement;
        this.resourceStatement = $.resourceStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAccessScopePathStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAccessScopePathStatementRequestArgs $;

        public Builder() {
            $ = new NetworkInsightsAccessScopePathStatementRequestArgs();
        }

        public Builder(NetworkInsightsAccessScopePathStatementRequestArgs defaults) {
            $ = new NetworkInsightsAccessScopePathStatementRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder packetHeaderStatement(@Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement) {
            $.packetHeaderStatement = packetHeaderStatement;
            return this;
        }

        public Builder packetHeaderStatement(NetworkInsightsAccessScopePacketHeaderStatementRequestArgs packetHeaderStatement) {
            return packetHeaderStatement(Output.of(packetHeaderStatement));
        }

        public Builder resourceStatement(@Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement) {
            $.resourceStatement = resourceStatement;
            return this;
        }

        public Builder resourceStatement(NetworkInsightsAccessScopeResourceStatementRequestArgs resourceStatement) {
            return resourceStatement(Output.of(resourceStatement));
        }

        public NetworkInsightsAccessScopePathStatementRequestArgs build() {
            return $;
        }
    }

}
