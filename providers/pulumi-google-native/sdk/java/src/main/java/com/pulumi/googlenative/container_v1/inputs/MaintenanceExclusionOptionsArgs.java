// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.enums.MaintenanceExclusionOptionsScope;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the Maintenance exclusion option.
 * 
 */
public final class MaintenanceExclusionOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceExclusionOptionsArgs Empty = new MaintenanceExclusionOptionsArgs();

    /**
     * Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<MaintenanceExclusionOptionsScope> scope;

    /**
     * @return Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    public Optional<Output<MaintenanceExclusionOptionsScope>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private MaintenanceExclusionOptionsArgs() {}

    private MaintenanceExclusionOptionsArgs(MaintenanceExclusionOptionsArgs $) {
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceExclusionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceExclusionOptionsArgs $;

        public Builder() {
            $ = new MaintenanceExclusionOptionsArgs();
        }

        public Builder(MaintenanceExclusionOptionsArgs defaults) {
            $ = new MaintenanceExclusionOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<MaintenanceExclusionOptionsScope> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
         * 
         * @return builder
         * 
         */
        public Builder scope(MaintenanceExclusionOptionsScope scope) {
            return scope(Output.of(scope));
        }

        public MaintenanceExclusionOptionsArgs build() {
            return $;
        }
    }

}
