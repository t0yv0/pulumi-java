// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapabilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapabilityArgs Empty = new CapabilityArgs();

    /**
     * String that represents a Capability resource name.
     * 
     */
    @Import(name="capabilityName")
    private @Nullable Output<String> capabilityName;

    /**
     * @return String that represents a Capability resource name.
     * 
     */
    public Optional<Output<String>> capabilityName() {
        return Optional.ofNullable(this.capabilityName);
    }

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @Import(name="parentProviderNamespace", required=true)
    private Output<String> parentProviderNamespace;

    /**
     * @return String that represents a resource provider namespace.
     * 
     */
    public Output<String> parentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @Import(name="parentResourceName", required=true)
    private Output<String> parentResourceName;

    /**
     * @return String that represents a resource name.
     * 
     */
    public Output<String> parentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @Import(name="parentResourceType", required=true)
    private Output<String> parentResourceType;

    /**
     * @return String that represents a resource type.
     * 
     */
    public Output<String> parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return String that represents an Azure resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @Import(name="targetName", required=true)
    private Output<String> targetName;

    /**
     * @return String that represents a Target resource name.
     * 
     */
    public Output<String> targetName() {
        return this.targetName;
    }

    private CapabilityArgs() {}

    private CapabilityArgs(CapabilityArgs $) {
        this.capabilityName = $.capabilityName;
        this.parentProviderNamespace = $.parentProviderNamespace;
        this.parentResourceName = $.parentResourceName;
        this.parentResourceType = $.parentResourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.targetName = $.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapabilityArgs $;

        public Builder() {
            $ = new CapabilityArgs();
        }

        public Builder(CapabilityArgs defaults) {
            $ = new CapabilityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilityName String that represents a Capability resource name.
         * 
         * @return builder
         * 
         */
        public Builder capabilityName(@Nullable Output<String> capabilityName) {
            $.capabilityName = capabilityName;
            return this;
        }

        /**
         * @param capabilityName String that represents a Capability resource name.
         * 
         * @return builder
         * 
         */
        public Builder capabilityName(String capabilityName) {
            return capabilityName(Output.of(capabilityName));
        }

        /**
         * @param parentProviderNamespace String that represents a resource provider namespace.
         * 
         * @return builder
         * 
         */
        public Builder parentProviderNamespace(Output<String> parentProviderNamespace) {
            $.parentProviderNamespace = parentProviderNamespace;
            return this;
        }

        /**
         * @param parentProviderNamespace String that represents a resource provider namespace.
         * 
         * @return builder
         * 
         */
        public Builder parentProviderNamespace(String parentProviderNamespace) {
            return parentProviderNamespace(Output.of(parentProviderNamespace));
        }

        /**
         * @param parentResourceName String that represents a resource name.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceName(Output<String> parentResourceName) {
            $.parentResourceName = parentResourceName;
            return this;
        }

        /**
         * @param parentResourceName String that represents a resource name.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceName(String parentResourceName) {
            return parentResourceName(Output.of(parentResourceName));
        }

        /**
         * @param parentResourceType String that represents a resource type.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(Output<String> parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        /**
         * @param parentResourceType String that represents a resource type.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(String parentResourceType) {
            return parentResourceType(Output.of(parentResourceType));
        }

        /**
         * @param resourceGroupName String that represents an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName String that represents an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param targetName String that represents a Target resource name.
         * 
         * @return builder
         * 
         */
        public Builder targetName(Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        /**
         * @param targetName String that represents a Target resource name.
         * 
         * @return builder
         * 
         */
        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        public CapabilityArgs build() {
            $.parentProviderNamespace = Objects.requireNonNull($.parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
            $.parentResourceName = Objects.requireNonNull($.parentResourceName, "expected parameter 'parentResourceName' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.targetName = Objects.requireNonNull($.targetName, "expected parameter 'targetName' to be non-null");
            return $;
        }
    }

}
