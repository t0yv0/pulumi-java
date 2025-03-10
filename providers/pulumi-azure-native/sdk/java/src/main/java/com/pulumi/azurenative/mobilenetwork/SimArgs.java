// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork;

import com.pulumi.azurenative.mobilenetwork.enums.CreatedByType;
import com.pulumi.azurenative.mobilenetwork.inputs.MobileNetworkResourceIdArgs;
import com.pulumi.azurenative.mobilenetwork.inputs.SimPolicyResourceIdArgs;
import com.pulumi.azurenative.mobilenetwork.inputs.SimStaticIpPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SimArgs extends com.pulumi.resources.ResourceArgs {

    public static final SimArgs Empty = new SimArgs();

    /**
     * The ki value for the sim.
     * 
     */
    @Import(name="authenticationKey")
    private @Nullable Output<String> authenticationKey;

    /**
     * @return The ki value for the sim.
     * 
     */
    public Optional<Output<String>> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
    private @Nullable Output<Either<String,CreatedByType>> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Optional<Output<Either<String,CreatedByType>>> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }

    /**
     * An optional free-form text field that can be used to record the device type this sim is associated with, for example &#39;Video camera&#39;. The Azure portal allows Sims to be grouped and filtered based on this value.
     * 
     */
    @Import(name="deviceType")
    private @Nullable Output<String> deviceType;

    /**
     * @return An optional free-form text field that can be used to record the device type this sim is associated with, for example &#39;Video camera&#39;. The Azure portal allows Sims to be grouped and filtered based on this value.
     * 
     */
    public Optional<Output<String>> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }

    /**
     * The Integrated Circuit Card ID (ICC Id) for the sim.
     * 
     */
    @Import(name="integratedCircuitCardIdentifier")
    private @Nullable Output<String> integratedCircuitCardIdentifier;

    /**
     * @return The Integrated Circuit Card ID (ICC Id) for the sim.
     * 
     */
    public Optional<Output<String>> integratedCircuitCardIdentifier() {
        return Optional.ofNullable(this.integratedCircuitCardIdentifier);
    }

    /**
     * The International Mobile Subscriber Identity (IMSI) for the sim.
     * 
     */
    @Import(name="internationalMobileSubscriberIdentity", required=true)
    private Output<String> internationalMobileSubscriberIdentity;

    /**
     * @return The International Mobile Subscriber Identity (IMSI) for the sim.
     * 
     */
    public Output<String> internationalMobileSubscriberIdentity() {
        return this.internationalMobileSubscriberIdentity;
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Import(name="lastModifiedAt")
    private @Nullable Output<String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<Output<String>> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
    private @Nullable Output<String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Optional<Output<String>> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
    private @Nullable Output<Either<String,CreatedByType>> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Optional<Output<Either<String,CreatedByType>>> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Mobile network that this sim belongs to
     * 
     */
    @Import(name="mobileNetwork")
    private @Nullable Output<MobileNetworkResourceIdArgs> mobileNetwork;

    /**
     * @return Mobile network that this sim belongs to
     * 
     */
    public Optional<Output<MobileNetworkResourceIdArgs>> mobileNetwork() {
        return Optional.ofNullable(this.mobileNetwork);
    }

    /**
     * The Opc value for the sim.
     * 
     */
    @Import(name="operatorKeyCode")
    private @Nullable Output<String> operatorKeyCode;

    /**
     * @return The Opc value for the sim.
     * 
     */
    public Optional<Output<String>> operatorKeyCode() {
        return Optional.ofNullable(this.operatorKeyCode);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SIM.
     * 
     */
    @Import(name="simName")
    private @Nullable Output<String> simName;

    /**
     * @return The name of the SIM.
     * 
     */
    public Optional<Output<String>> simName() {
        return Optional.ofNullable(this.simName);
    }

    /**
     * The simPolicy used by this sim.
     * 
     */
    @Import(name="simPolicy")
    private @Nullable Output<SimPolicyResourceIdArgs> simPolicy;

    /**
     * @return The simPolicy used by this sim.
     * 
     */
    public Optional<Output<SimPolicyResourceIdArgs>> simPolicy() {
        return Optional.ofNullable(this.simPolicy);
    }

    /**
     * A list of static IP addresses assigned to this sim. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     */
    @Import(name="staticIpConfiguration")
    private @Nullable Output<List<SimStaticIpPropertiesArgs>> staticIpConfiguration;

    /**
     * @return A list of static IP addresses assigned to this sim. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     */
    public Optional<Output<List<SimStaticIpPropertiesArgs>>> staticIpConfiguration() {
        return Optional.ofNullable(this.staticIpConfiguration);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SimArgs() {}

    private SimArgs(SimArgs $) {
        this.authenticationKey = $.authenticationKey;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.createdByType = $.createdByType;
        this.deviceType = $.deviceType;
        this.integratedCircuitCardIdentifier = $.integratedCircuitCardIdentifier;
        this.internationalMobileSubscriberIdentity = $.internationalMobileSubscriberIdentity;
        this.lastModifiedAt = $.lastModifiedAt;
        this.lastModifiedBy = $.lastModifiedBy;
        this.lastModifiedByType = $.lastModifiedByType;
        this.location = $.location;
        this.mobileNetwork = $.mobileNetwork;
        this.operatorKeyCode = $.operatorKeyCode;
        this.resourceGroupName = $.resourceGroupName;
        this.simName = $.simName;
        this.simPolicy = $.simPolicy;
        this.staticIpConfiguration = $.staticIpConfiguration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimArgs $;

        public Builder() {
            $ = new SimArgs();
        }

        public Builder(SimArgs defaults) {
            $ = new SimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationKey The ki value for the sim.
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(@Nullable Output<String> authenticationKey) {
            $.authenticationKey = authenticationKey;
            return this;
        }

        /**
         * @param authenticationKey The ki value for the sim.
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(String authenticationKey) {
            return authenticationKey(Output.of(authenticationKey));
        }

        /**
         * @param createdAt The timestamp of resource creation (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp of resource creation (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy The identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(@Nullable Output<Either<String,CreatedByType>> createdByType) {
            $.createdByType = createdByType;
            return this;
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(Either<String,CreatedByType> createdByType) {
            return createdByType(Output.of(createdByType));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(String createdByType) {
            return createdByType(Either.ofLeft(createdByType));
        }

        /**
         * @param createdByType The type of identity that created the resource.
         * 
         * @return builder
         * 
         */
        public Builder createdByType(CreatedByType createdByType) {
            return createdByType(Either.ofRight(createdByType));
        }

        /**
         * @param deviceType An optional free-form text field that can be used to record the device type this sim is associated with, for example &#39;Video camera&#39;. The Azure portal allows Sims to be grouped and filtered based on this value.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(@Nullable Output<String> deviceType) {
            $.deviceType = deviceType;
            return this;
        }

        /**
         * @param deviceType An optional free-form text field that can be used to record the device type this sim is associated with, for example &#39;Video camera&#39;. The Azure portal allows Sims to be grouped and filtered based on this value.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(String deviceType) {
            return deviceType(Output.of(deviceType));
        }

        /**
         * @param integratedCircuitCardIdentifier The Integrated Circuit Card ID (ICC Id) for the sim.
         * 
         * @return builder
         * 
         */
        public Builder integratedCircuitCardIdentifier(@Nullable Output<String> integratedCircuitCardIdentifier) {
            $.integratedCircuitCardIdentifier = integratedCircuitCardIdentifier;
            return this;
        }

        /**
         * @param integratedCircuitCardIdentifier The Integrated Circuit Card ID (ICC Id) for the sim.
         * 
         * @return builder
         * 
         */
        public Builder integratedCircuitCardIdentifier(String integratedCircuitCardIdentifier) {
            return integratedCircuitCardIdentifier(Output.of(integratedCircuitCardIdentifier));
        }

        /**
         * @param internationalMobileSubscriberIdentity The International Mobile Subscriber Identity (IMSI) for the sim.
         * 
         * @return builder
         * 
         */
        public Builder internationalMobileSubscriberIdentity(Output<String> internationalMobileSubscriberIdentity) {
            $.internationalMobileSubscriberIdentity = internationalMobileSubscriberIdentity;
            return this;
        }

        /**
         * @param internationalMobileSubscriberIdentity The International Mobile Subscriber Identity (IMSI) for the sim.
         * 
         * @return builder
         * 
         */
        public Builder internationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity) {
            return internationalMobileSubscriberIdentity(Output.of(internationalMobileSubscriberIdentity));
        }

        /**
         * @param lastModifiedAt The timestamp of resource last modification (UTC)
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(@Nullable Output<String> lastModifiedAt) {
            $.lastModifiedAt = lastModifiedAt;
            return this;
        }

        /**
         * @param lastModifiedAt The timestamp of resource last modification (UTC)
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedAt(String lastModifiedAt) {
            return lastModifiedAt(Output.of(lastModifiedAt));
        }

        /**
         * @param lastModifiedBy The identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(@Nullable Output<String> lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        /**
         * @param lastModifiedBy The identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(String lastModifiedBy) {
            return lastModifiedBy(Output.of(lastModifiedBy));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(@Nullable Output<Either<String,CreatedByType>> lastModifiedByType) {
            $.lastModifiedByType = lastModifiedByType;
            return this;
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(Either<String,CreatedByType> lastModifiedByType) {
            return lastModifiedByType(Output.of(lastModifiedByType));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(String lastModifiedByType) {
            return lastModifiedByType(Either.ofLeft(lastModifiedByType));
        }

        /**
         * @param lastModifiedByType The type of identity that last modified the resource.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedByType(CreatedByType lastModifiedByType) {
            return lastModifiedByType(Either.ofRight(lastModifiedByType));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mobileNetwork Mobile network that this sim belongs to
         * 
         * @return builder
         * 
         */
        public Builder mobileNetwork(@Nullable Output<MobileNetworkResourceIdArgs> mobileNetwork) {
            $.mobileNetwork = mobileNetwork;
            return this;
        }

        /**
         * @param mobileNetwork Mobile network that this sim belongs to
         * 
         * @return builder
         * 
         */
        public Builder mobileNetwork(MobileNetworkResourceIdArgs mobileNetwork) {
            return mobileNetwork(Output.of(mobileNetwork));
        }

        /**
         * @param operatorKeyCode The Opc value for the sim.
         * 
         * @return builder
         * 
         */
        public Builder operatorKeyCode(@Nullable Output<String> operatorKeyCode) {
            $.operatorKeyCode = operatorKeyCode;
            return this;
        }

        /**
         * @param operatorKeyCode The Opc value for the sim.
         * 
         * @return builder
         * 
         */
        public Builder operatorKeyCode(String operatorKeyCode) {
            return operatorKeyCode(Output.of(operatorKeyCode));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param simName The name of the SIM.
         * 
         * @return builder
         * 
         */
        public Builder simName(@Nullable Output<String> simName) {
            $.simName = simName;
            return this;
        }

        /**
         * @param simName The name of the SIM.
         * 
         * @return builder
         * 
         */
        public Builder simName(String simName) {
            return simName(Output.of(simName));
        }

        /**
         * @param simPolicy The simPolicy used by this sim.
         * 
         * @return builder
         * 
         */
        public Builder simPolicy(@Nullable Output<SimPolicyResourceIdArgs> simPolicy) {
            $.simPolicy = simPolicy;
            return this;
        }

        /**
         * @param simPolicy The simPolicy used by this sim.
         * 
         * @return builder
         * 
         */
        public Builder simPolicy(SimPolicyResourceIdArgs simPolicy) {
            return simPolicy(Output.of(simPolicy));
        }

        /**
         * @param staticIpConfiguration A list of static IP addresses assigned to this sim. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
         * 
         * @return builder
         * 
         */
        public Builder staticIpConfiguration(@Nullable Output<List<SimStaticIpPropertiesArgs>> staticIpConfiguration) {
            $.staticIpConfiguration = staticIpConfiguration;
            return this;
        }

        /**
         * @param staticIpConfiguration A list of static IP addresses assigned to this sim. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
         * 
         * @return builder
         * 
         */
        public Builder staticIpConfiguration(List<SimStaticIpPropertiesArgs> staticIpConfiguration) {
            return staticIpConfiguration(Output.of(staticIpConfiguration));
        }

        /**
         * @param staticIpConfiguration A list of static IP addresses assigned to this sim. Each address is assigned at a defined network scope, made up of {attached data network, slice}.
         * 
         * @return builder
         * 
         */
        public Builder staticIpConfiguration(SimStaticIpPropertiesArgs... staticIpConfiguration) {
            return staticIpConfiguration(List.of(staticIpConfiguration));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SimArgs build() {
            $.internationalMobileSubscriberIdentity = Objects.requireNonNull($.internationalMobileSubscriberIdentity, "expected parameter 'internationalMobileSubscriberIdentity' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
