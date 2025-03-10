// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementAgent.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementAgentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementAgentArgs Empty = new GetManagementAgentArgs();

    /**
     * Unique Management Agent identifier
     * 
     */
    @Import(name="managementAgentId", required=true)
    private String managementAgentId;

    /**
     * @return Unique Management Agent identifier
     * 
     */
    public String managementAgentId() {
        return this.managementAgentId;
    }

    private GetManagementAgentArgs() {}

    private GetManagementAgentArgs(GetManagementAgentArgs $) {
        this.managementAgentId = $.managementAgentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementAgentArgs $;

        public Builder() {
            $ = new GetManagementAgentArgs();
        }

        public Builder(GetManagementAgentArgs defaults) {
            $ = new GetManagementAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementAgentId Unique Management Agent identifier
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(String managementAgentId) {
            $.managementAgentId = managementAgentId;
            return this;
        }

        public GetManagementAgentArgs build() {
            $.managementAgentId = Objects.requireNonNull($.managementAgentId, "expected parameter 'managementAgentId' to be non-null");
            return $;
        }
    }

}
