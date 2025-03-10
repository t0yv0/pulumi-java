// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTsigKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTsigKeyArgs Empty = new GetTsigKeyArgs();

    /**
     * The OCID of the target TSIG key.
     * 
     */
    @Import(name="tsigKeyId", required=true)
    private String tsigKeyId;

    /**
     * @return The OCID of the target TSIG key.
     * 
     */
    public String tsigKeyId() {
        return this.tsigKeyId;
    }

    private GetTsigKeyArgs() {}

    private GetTsigKeyArgs(GetTsigKeyArgs $) {
        this.tsigKeyId = $.tsigKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTsigKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTsigKeyArgs $;

        public Builder() {
            $ = new GetTsigKeyArgs();
        }

        public Builder(GetTsigKeyArgs defaults) {
            $ = new GetTsigKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tsigKeyId The OCID of the target TSIG key.
         * 
         * @return builder
         * 
         */
        public Builder tsigKeyId(String tsigKeyId) {
            $.tsigKeyId = tsigKeyId;
            return this;
        }

        public GetTsigKeyArgs build() {
            $.tsigKeyId = Objects.requireNonNull($.tsigKeyId, "expected parameter 'tsigKeyId' to be non-null");
            return $;
        }
    }

}
