// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceSecurityGroupArgs Empty = new GetDeviceSecurityGroupArgs();

    /**
     * The name of the device security group. Note that the name of the device security group is case insensitive.
     * 
     */
    @Import(name="deviceSecurityGroupName", required=true)
    private String deviceSecurityGroupName;

    /**
     * @return The name of the device security group. Note that the name of the device security group is case insensitive.
     * 
     */
    public String deviceSecurityGroupName() {
        return this.deviceSecurityGroupName;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return The identifier of the resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    private GetDeviceSecurityGroupArgs() {}

    private GetDeviceSecurityGroupArgs(GetDeviceSecurityGroupArgs $) {
        this.deviceSecurityGroupName = $.deviceSecurityGroupName;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceSecurityGroupArgs $;

        public Builder() {
            $ = new GetDeviceSecurityGroupArgs();
        }

        public Builder(GetDeviceSecurityGroupArgs defaults) {
            $ = new GetDeviceSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security group is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder deviceSecurityGroupName(String deviceSecurityGroupName) {
            $.deviceSecurityGroupName = deviceSecurityGroupName;
            return this;
        }

        /**
         * @param resourceId The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public GetDeviceSecurityGroupArgs build() {
            $.deviceSecurityGroupName = Objects.requireNonNull($.deviceSecurityGroupName, "expected parameter 'deviceSecurityGroupName' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
