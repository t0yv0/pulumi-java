// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single automation scope.
 * 
 */
public final class AutomationScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationScopeArgs Empty = new AutomationScopeArgs();

    /**
     * The resources scope description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The resources scope description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    @Import(name="scopePath")
    private @Nullable Output<String> scopePath;

    /**
     * @return The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    public Optional<Output<String>> scopePath() {
        return Optional.ofNullable(this.scopePath);
    }

    private AutomationScopeArgs() {}

    private AutomationScopeArgs(AutomationScopeArgs $) {
        this.description = $.description;
        this.scopePath = $.scopePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationScopeArgs $;

        public Builder() {
            $ = new AutomationScopeArgs();
        }

        public Builder(AutomationScopeArgs defaults) {
            $ = new AutomationScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The resources scope description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The resources scope description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param scopePath The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
         * 
         * @return builder
         * 
         */
        public Builder scopePath(@Nullable Output<String> scopePath) {
            $.scopePath = scopePath;
            return this;
        }

        /**
         * @param scopePath The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
         * 
         * @return builder
         * 
         */
        public Builder scopePath(String scopePath) {
            return scopePath(Output.of(scopePath));
        }

        public AutomationScopeArgs build() {
            return $;
        }
    }

}
