// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutonomousExadataInfrastructureOcpuArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousExadataInfrastructureOcpuArgs Empty = new GetAutonomousExadataInfrastructureOcpuArgs();

    /**
     * The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousExadataInfrastructureId", required=true)
    private String autonomousExadataInfrastructureId;

    /**
     * @return The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String autonomousExadataInfrastructureId() {
        return this.autonomousExadataInfrastructureId;
    }

    private GetAutonomousExadataInfrastructureOcpuArgs() {}

    private GetAutonomousExadataInfrastructureOcpuArgs(GetAutonomousExadataInfrastructureOcpuArgs $) {
        this.autonomousExadataInfrastructureId = $.autonomousExadataInfrastructureId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousExadataInfrastructureOcpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousExadataInfrastructureOcpuArgs $;

        public Builder() {
            $ = new GetAutonomousExadataInfrastructureOcpuArgs();
        }

        public Builder(GetAutonomousExadataInfrastructureOcpuArgs defaults) {
            $ = new GetAutonomousExadataInfrastructureOcpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousExadataInfrastructureId The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            $.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            return this;
        }

        public GetAutonomousExadataInfrastructureOcpuArgs build() {
            $.autonomousExadataInfrastructureId = Objects.requireNonNull($.autonomousExadataInfrastructureId, "expected parameter 'autonomousExadataInfrastructureId' to be non-null");
            return $;
        }
    }

}
