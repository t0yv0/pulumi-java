// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbidedicated;

import com.pulumi.azurenative.powerbidedicated.enums.Mode;
import com.pulumi.azurenative.powerbidedicated.inputs.CapacitySkuArgs;
import com.pulumi.azurenative.powerbidedicated.inputs.DedicatedCapacityAdministratorsArgs;
import com.pulumi.azurenative.powerbidedicated.inputs.SystemDataArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapacityDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityDetailsArgs Empty = new CapacityDetailsArgs();

    /**
     * A collection of Dedicated capacity administrators
     * 
     */
    @Import(name="administration")
    private @Nullable Output<DedicatedCapacityAdministratorsArgs> administration;

    /**
     * @return A collection of Dedicated capacity administrators
     * 
     */
    public Optional<Output<DedicatedCapacityAdministratorsArgs>> administration() {
        return Optional.ofNullable(this.administration);
    }

    /**
     * The name of the Dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="dedicatedCapacityName")
    private @Nullable Output<String> dedicatedCapacityName;

    /**
     * @return The name of the Dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public Optional<Output<String>> dedicatedCapacityName() {
        return Optional.ofNullable(this.dedicatedCapacityName);
    }

    /**
     * Location of the PowerBI Dedicated resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the PowerBI Dedicated resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,Mode>> mode;

    /**
     * @return Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
     * 
     */
    public Optional<Output<Either<String,Mode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the PowerBI Dedicated capacity resource.
     * 
     */
    @Import(name="sku", required=true)
    private Output<CapacitySkuArgs> sku;

    /**
     * @return The SKU of the PowerBI Dedicated capacity resource.
     * 
     */
    public Output<CapacitySkuArgs> sku() {
        return this.sku;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Import(name="systemData")
    private @Nullable Output<SystemDataArgs> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Optional<Output<SystemDataArgs>> systemData() {
        return Optional.ofNullable(this.systemData);
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CapacityDetailsArgs() {}

    private CapacityDetailsArgs(CapacityDetailsArgs $) {
        this.administration = $.administration;
        this.dedicatedCapacityName = $.dedicatedCapacityName;
        this.location = $.location;
        this.mode = $.mode;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.systemData = $.systemData;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityDetailsArgs $;

        public Builder() {
            $ = new CapacityDetailsArgs();
        }

        public Builder(CapacityDetailsArgs defaults) {
            $ = new CapacityDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administration A collection of Dedicated capacity administrators
         * 
         * @return builder
         * 
         */
        public Builder administration(@Nullable Output<DedicatedCapacityAdministratorsArgs> administration) {
            $.administration = administration;
            return this;
        }

        /**
         * @param administration A collection of Dedicated capacity administrators
         * 
         * @return builder
         * 
         */
        public Builder administration(DedicatedCapacityAdministratorsArgs administration) {
            return administration(Output.of(administration));
        }

        /**
         * @param dedicatedCapacityName The name of the Dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCapacityName(@Nullable Output<String> dedicatedCapacityName) {
            $.dedicatedCapacityName = dedicatedCapacityName;
            return this;
        }

        /**
         * @param dedicatedCapacityName The name of the Dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCapacityName(String dedicatedCapacityName) {
            return dedicatedCapacityName(Output.of(dedicatedCapacityName));
        }

        /**
         * @param location Location of the PowerBI Dedicated resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the PowerBI Dedicated resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mode Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,Mode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,Mode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode Specifies the generation of the Power BI Embedded capacity. If no value is specified, the default value &#39;Gen2&#39; is used. [Learn More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2)
         * 
         * @return builder
         * 
         */
        public Builder mode(Mode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The SKU of the PowerBI Dedicated capacity resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<CapacitySkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the PowerBI Dedicated capacity resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(CapacitySkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param systemData Metadata pertaining to creation and last modification of the resource.
         * 
         * @return builder
         * 
         */
        public Builder systemData(@Nullable Output<SystemDataArgs> systemData) {
            $.systemData = systemData;
            return this;
        }

        /**
         * @param systemData Metadata pertaining to creation and last modification of the resource.
         * 
         * @return builder
         * 
         */
        public Builder systemData(SystemDataArgs systemData) {
            return systemData(Output.of(systemData));
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CapacityDetailsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
