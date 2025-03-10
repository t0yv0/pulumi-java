// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardIdentityArgs Empty = new StandardIdentityArgs();

    /**
     * The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this Logic App Standard. The only possible value is `SystemAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Logic App Standard. The only possible value is `SystemAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StandardIdentityArgs() {}

    private StandardIdentityArgs(StandardIdentityArgs $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardIdentityArgs $;

        public Builder() {
            $ = new StandardIdentityArgs();
        }

        public Builder(StandardIdentityArgs defaults) {
            $ = new StandardIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the Service Principal associated with the Managed Service Identity of this App Service.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Logic App Standard. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Logic App Standard. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StandardIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
