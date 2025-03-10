// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareV2 fabric provider specific settings.
 * 
 */
public final class VMwareV2FabricCreationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareV2FabricCreationInputArgs Empty = new VMwareV2FabricCreationInputArgs();

    /**
     * Gets the class type.
     * Expected value is &#39;VMwareV2&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Gets the class type.
     * Expected value is &#39;VMwareV2&#39;.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The ARM Id of the migration solution.
     * 
     */
    @Import(name="migrationSolutionId", required=true)
    private Output<String> migrationSolutionId;

    /**
     * @return The ARM Id of the migration solution.
     * 
     */
    public Output<String> migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * The ARM Id of the VMware site.
     * 
     */
    @Import(name="vmwareSiteId", required=true)
    private Output<String> vmwareSiteId;

    /**
     * @return The ARM Id of the VMware site.
     * 
     */
    public Output<String> vmwareSiteId() {
        return this.vmwareSiteId;
    }

    private VMwareV2FabricCreationInputArgs() {}

    private VMwareV2FabricCreationInputArgs(VMwareV2FabricCreationInputArgs $) {
        this.instanceType = $.instanceType;
        this.migrationSolutionId = $.migrationSolutionId;
        this.vmwareSiteId = $.vmwareSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareV2FabricCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareV2FabricCreationInputArgs $;

        public Builder() {
            $ = new VMwareV2FabricCreationInputArgs();
        }

        public Builder(VMwareV2FabricCreationInputArgs defaults) {
            $ = new VMwareV2FabricCreationInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType Gets the class type.
         * Expected value is &#39;VMwareV2&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Gets the class type.
         * Expected value is &#39;VMwareV2&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param migrationSolutionId The ARM Id of the migration solution.
         * 
         * @return builder
         * 
         */
        public Builder migrationSolutionId(Output<String> migrationSolutionId) {
            $.migrationSolutionId = migrationSolutionId;
            return this;
        }

        /**
         * @param migrationSolutionId The ARM Id of the migration solution.
         * 
         * @return builder
         * 
         */
        public Builder migrationSolutionId(String migrationSolutionId) {
            return migrationSolutionId(Output.of(migrationSolutionId));
        }

        /**
         * @param vmwareSiteId The ARM Id of the VMware site.
         * 
         * @return builder
         * 
         */
        public Builder vmwareSiteId(Output<String> vmwareSiteId) {
            $.vmwareSiteId = vmwareSiteId;
            return this;
        }

        /**
         * @param vmwareSiteId The ARM Id of the VMware site.
         * 
         * @return builder
         * 
         */
        public Builder vmwareSiteId(String vmwareSiteId) {
            return vmwareSiteId(Output.of(vmwareSiteId));
        }

        public VMwareV2FabricCreationInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            $.migrationSolutionId = Objects.requireNonNull($.migrationSolutionId, "expected parameter 'migrationSolutionId' to be non-null");
            $.vmwareSiteId = Objects.requireNonNull($.vmwareSiteId, "expected parameter 'vmwareSiteId' to be non-null");
            return $;
        }
    }

}
