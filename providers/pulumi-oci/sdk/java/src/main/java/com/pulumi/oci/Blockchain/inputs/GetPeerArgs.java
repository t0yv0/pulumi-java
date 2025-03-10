// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Blockchain.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPeerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeerArgs Empty = new GetPeerArgs();

    /**
     * Unique service identifier.
     * 
     */
    @Import(name="blockchainPlatformId", required=true)
    private String blockchainPlatformId;

    /**
     * @return Unique service identifier.
     * 
     */
    public String blockchainPlatformId() {
        return this.blockchainPlatformId;
    }

    /**
     * Peer identifier.
     * 
     */
    @Import(name="peerId", required=true)
    private String peerId;

    /**
     * @return Peer identifier.
     * 
     */
    public String peerId() {
        return this.peerId;
    }

    private GetPeerArgs() {}

    private GetPeerArgs(GetPeerArgs $) {
        this.blockchainPlatformId = $.blockchainPlatformId;
        this.peerId = $.peerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeerArgs $;

        public Builder() {
            $ = new GetPeerArgs();
        }

        public Builder(GetPeerArgs defaults) {
            $ = new GetPeerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockchainPlatformId Unique service identifier.
         * 
         * @return builder
         * 
         */
        public Builder blockchainPlatformId(String blockchainPlatformId) {
            $.blockchainPlatformId = blockchainPlatformId;
            return this;
        }

        /**
         * @param peerId Peer identifier.
         * 
         * @return builder
         * 
         */
        public Builder peerId(String peerId) {
            $.peerId = peerId;
            return this;
        }

        public GetPeerArgs build() {
            $.blockchainPlatformId = Objects.requireNonNull($.blockchainPlatformId, "expected parameter 'blockchainPlatformId' to be non-null");
            $.peerId = Objects.requireNonNull($.peerId, "expected parameter 'peerId' to be non-null");
            return $;
        }
    }

}
