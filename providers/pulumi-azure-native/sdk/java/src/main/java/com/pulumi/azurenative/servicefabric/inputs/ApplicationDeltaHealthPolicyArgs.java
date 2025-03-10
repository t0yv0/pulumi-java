// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ServiceTypeDeltaHealthPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a delta health policy used to evaluate the health of an application or one of its child entities when upgrading the cluster.
 * 
 */
public final class ApplicationDeltaHealthPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDeltaHealthPolicyArgs Empty = new ApplicationDeltaHealthPolicyArgs();

    /**
     * The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
     * 
     */
    @Import(name="defaultServiceTypeDeltaHealthPolicy")
    private @Nullable Output<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy;

    /**
     * @return The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
     * 
     */
    public Optional<Output<ServiceTypeDeltaHealthPolicyArgs>> defaultServiceTypeDeltaHealthPolicy() {
        return Optional.ofNullable(this.defaultServiceTypeDeltaHealthPolicy);
    }

    /**
     * The map with service type delta health policy per service type name. The map is empty by default.
     * 
     */
    @Import(name="serviceTypeDeltaHealthPolicies")
    private @Nullable Output<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies;

    /**
     * @return The map with service type delta health policy per service type name. The map is empty by default.
     * 
     */
    public Optional<Output<Map<String,ServiceTypeDeltaHealthPolicyArgs>>> serviceTypeDeltaHealthPolicies() {
        return Optional.ofNullable(this.serviceTypeDeltaHealthPolicies);
    }

    private ApplicationDeltaHealthPolicyArgs() {}

    private ApplicationDeltaHealthPolicyArgs(ApplicationDeltaHealthPolicyArgs $) {
        this.defaultServiceTypeDeltaHealthPolicy = $.defaultServiceTypeDeltaHealthPolicy;
        this.serviceTypeDeltaHealthPolicies = $.serviceTypeDeltaHealthPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDeltaHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDeltaHealthPolicyArgs $;

        public Builder() {
            $ = new ApplicationDeltaHealthPolicyArgs();
        }

        public Builder(ApplicationDeltaHealthPolicyArgs defaults) {
            $ = new ApplicationDeltaHealthPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultServiceTypeDeltaHealthPolicy The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceTypeDeltaHealthPolicy(@Nullable Output<ServiceTypeDeltaHealthPolicyArgs> defaultServiceTypeDeltaHealthPolicy) {
            $.defaultServiceTypeDeltaHealthPolicy = defaultServiceTypeDeltaHealthPolicy;
            return this;
        }

        /**
         * @param defaultServiceTypeDeltaHealthPolicy The delta health policy used by default to evaluate the health of a service type when upgrading the cluster.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceTypeDeltaHealthPolicy(ServiceTypeDeltaHealthPolicyArgs defaultServiceTypeDeltaHealthPolicy) {
            return defaultServiceTypeDeltaHealthPolicy(Output.of(defaultServiceTypeDeltaHealthPolicy));
        }

        /**
         * @param serviceTypeDeltaHealthPolicies The map with service type delta health policy per service type name. The map is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder serviceTypeDeltaHealthPolicies(@Nullable Output<Map<String,ServiceTypeDeltaHealthPolicyArgs>> serviceTypeDeltaHealthPolicies) {
            $.serviceTypeDeltaHealthPolicies = serviceTypeDeltaHealthPolicies;
            return this;
        }

        /**
         * @param serviceTypeDeltaHealthPolicies The map with service type delta health policy per service type name. The map is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder serviceTypeDeltaHealthPolicies(Map<String,ServiceTypeDeltaHealthPolicyArgs> serviceTypeDeltaHealthPolicies) {
            return serviceTypeDeltaHealthPolicies(Output.of(serviceTypeDeltaHealthPolicies));
        }

        public ApplicationDeltaHealthPolicyArgs build() {
            return $;
        }
    }

}
