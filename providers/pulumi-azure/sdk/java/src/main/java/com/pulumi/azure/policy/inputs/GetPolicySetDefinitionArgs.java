// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicySetDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicySetDefinitionArgs Empty = new GetPolicySetDefinitionArgs();

    /**
     * Specifies the display name of the Policy Set Definition. Conflicts with `name`.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Specifies the display name of the Policy Set Definition. Conflicts with `name`.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Only retrieve Policy Set Definitions from this Management Group.
     * 
     */
    @Import(name="managementGroupName")
    private @Nullable String managementGroupName;

    /**
     * @return Only retrieve Policy Set Definitions from this Management Group.
     * 
     */
    public Optional<String> managementGroupName() {
        return Optional.ofNullable(this.managementGroupName);
    }

    /**
     * Specifies the name of the Policy Set Definition. Conflicts with `display_name`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Specifies the name of the Policy Set Definition. Conflicts with `display_name`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPolicySetDefinitionArgs() {}

    private GetPolicySetDefinitionArgs(GetPolicySetDefinitionArgs $) {
        this.displayName = $.displayName;
        this.managementGroupName = $.managementGroupName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicySetDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicySetDefinitionArgs $;

        public Builder() {
            $ = new GetPolicySetDefinitionArgs();
        }

        public Builder(GetPolicySetDefinitionArgs defaults) {
            $ = new GetPolicySetDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Specifies the display name of the Policy Set Definition. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param managementGroupName Only retrieve Policy Set Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupName(@Nullable String managementGroupName) {
            $.managementGroupName = managementGroupName;
            return this;
        }

        /**
         * @param name Specifies the name of the Policy Set Definition. Conflicts with `display_name`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetPolicySetDefinitionArgs build() {
            return $;
        }
    }

}
