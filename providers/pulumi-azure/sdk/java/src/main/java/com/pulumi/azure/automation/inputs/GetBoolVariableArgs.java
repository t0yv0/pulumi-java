// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBoolVariableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBoolVariableArgs Empty = new GetBoolVariableArgs();

    /**
     * The name of the automation account in which the Automation Variable exists.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account in which the Automation Variable exists.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The name of the Automation Variable.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Automation Variable.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the automation account exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the automation account exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBoolVariableArgs() {}

    private GetBoolVariableArgs(GetBoolVariableArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBoolVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBoolVariableArgs $;

        public Builder() {
            $ = new GetBoolVariableArgs();
        }

        public Builder(GetBoolVariableArgs defaults) {
            $ = new GetBoolVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Automation Variable exists.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param name The name of the Automation Variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the automation account exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetBoolVariableArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
