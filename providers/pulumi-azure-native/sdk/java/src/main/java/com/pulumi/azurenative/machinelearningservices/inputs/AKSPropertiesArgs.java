// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.ClusterPurpose;
import com.pulumi.azurenative.machinelearningservices.inputs.AksNetworkingConfigurationArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.SslConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AKS properties
 * 
 */
public final class AKSPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AKSPropertiesArgs Empty = new AKSPropertiesArgs();

    /**
     * Number of agents
     * 
     */
    @Import(name="agentCount")
    private @Nullable Output<Integer> agentCount;

    /**
     * @return Number of agents
     * 
     */
    public Optional<Output<Integer>> agentCount() {
        return Optional.ofNullable(this.agentCount);
    }

    /**
     * Agent virtual machine size
     * 
     */
    @Import(name="agentVmSize")
    private @Nullable Output<String> agentVmSize;

    /**
     * @return Agent virtual machine size
     * 
     */
    public Optional<Output<String>> agentVmSize() {
        return Optional.ofNullable(this.agentVmSize);
    }

    /**
     * AKS networking configuration for vnet
     * 
     */
    @Import(name="aksNetworkingConfiguration")
    private @Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration;

    /**
     * @return AKS networking configuration for vnet
     * 
     */
    public Optional<Output<AksNetworkingConfigurationArgs>> aksNetworkingConfiguration() {
        return Optional.ofNullable(this.aksNetworkingConfiguration);
    }

    /**
     * Cluster full qualified domain name
     * 
     */
    @Import(name="clusterFqdn")
    private @Nullable Output<String> clusterFqdn;

    /**
     * @return Cluster full qualified domain name
     * 
     */
    public Optional<Output<String>> clusterFqdn() {
        return Optional.ofNullable(this.clusterFqdn);
    }

    /**
     * Intended usage of the cluster
     * 
     */
    @Import(name="clusterPurpose")
    private @Nullable Output<Either<String,ClusterPurpose>> clusterPurpose;

    /**
     * @return Intended usage of the cluster
     * 
     */
    public Optional<Output<Either<String,ClusterPurpose>>> clusterPurpose() {
        return Optional.ofNullable(this.clusterPurpose);
    }

    /**
     * SSL configuration
     * 
     */
    @Import(name="sslConfiguration")
    private @Nullable Output<SslConfigurationArgs> sslConfiguration;

    /**
     * @return SSL configuration
     * 
     */
    public Optional<Output<SslConfigurationArgs>> sslConfiguration() {
        return Optional.ofNullable(this.sslConfiguration);
    }

    private AKSPropertiesArgs() {}

    private AKSPropertiesArgs(AKSPropertiesArgs $) {
        this.agentCount = $.agentCount;
        this.agentVmSize = $.agentVmSize;
        this.aksNetworkingConfiguration = $.aksNetworkingConfiguration;
        this.clusterFqdn = $.clusterFqdn;
        this.clusterPurpose = $.clusterPurpose;
        this.sslConfiguration = $.sslConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AKSPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AKSPropertiesArgs $;

        public Builder() {
            $ = new AKSPropertiesArgs();
        }

        public Builder(AKSPropertiesArgs defaults) {
            $ = new AKSPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentCount Number of agents
         * 
         * @return builder
         * 
         */
        public Builder agentCount(@Nullable Output<Integer> agentCount) {
            $.agentCount = agentCount;
            return this;
        }

        /**
         * @param agentCount Number of agents
         * 
         * @return builder
         * 
         */
        public Builder agentCount(Integer agentCount) {
            return agentCount(Output.of(agentCount));
        }

        /**
         * @param agentVmSize Agent virtual machine size
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(@Nullable Output<String> agentVmSize) {
            $.agentVmSize = agentVmSize;
            return this;
        }

        /**
         * @param agentVmSize Agent virtual machine size
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(String agentVmSize) {
            return agentVmSize(Output.of(agentVmSize));
        }

        /**
         * @param aksNetworkingConfiguration AKS networking configuration for vnet
         * 
         * @return builder
         * 
         */
        public Builder aksNetworkingConfiguration(@Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration) {
            $.aksNetworkingConfiguration = aksNetworkingConfiguration;
            return this;
        }

        /**
         * @param aksNetworkingConfiguration AKS networking configuration for vnet
         * 
         * @return builder
         * 
         */
        public Builder aksNetworkingConfiguration(AksNetworkingConfigurationArgs aksNetworkingConfiguration) {
            return aksNetworkingConfiguration(Output.of(aksNetworkingConfiguration));
        }

        /**
         * @param clusterFqdn Cluster full qualified domain name
         * 
         * @return builder
         * 
         */
        public Builder clusterFqdn(@Nullable Output<String> clusterFqdn) {
            $.clusterFqdn = clusterFqdn;
            return this;
        }

        /**
         * @param clusterFqdn Cluster full qualified domain name
         * 
         * @return builder
         * 
         */
        public Builder clusterFqdn(String clusterFqdn) {
            return clusterFqdn(Output.of(clusterFqdn));
        }

        /**
         * @param clusterPurpose Intended usage of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(@Nullable Output<Either<String,ClusterPurpose>> clusterPurpose) {
            $.clusterPurpose = clusterPurpose;
            return this;
        }

        /**
         * @param clusterPurpose Intended usage of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(Either<String,ClusterPurpose> clusterPurpose) {
            return clusterPurpose(Output.of(clusterPurpose));
        }

        /**
         * @param clusterPurpose Intended usage of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(String clusterPurpose) {
            return clusterPurpose(Either.ofLeft(clusterPurpose));
        }

        /**
         * @param clusterPurpose Intended usage of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(ClusterPurpose clusterPurpose) {
            return clusterPurpose(Either.ofRight(clusterPurpose));
        }

        /**
         * @param sslConfiguration SSL configuration
         * 
         * @return builder
         * 
         */
        public Builder sslConfiguration(@Nullable Output<SslConfigurationArgs> sslConfiguration) {
            $.sslConfiguration = sslConfiguration;
            return this;
        }

        /**
         * @param sslConfiguration SSL configuration
         * 
         * @return builder
         * 
         */
        public Builder sslConfiguration(SslConfigurationArgs sslConfiguration) {
            return sslConfiguration(Output.of(sslConfiguration));
        }

        public AKSPropertiesArgs build() {
            $.clusterPurpose = Codegen.stringProp("clusterPurpose").left(ClusterPurpose.class).output().arg($.clusterPurpose).def("FastProd").getNullable();
            return $;
        }
    }

}
