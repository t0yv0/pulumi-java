// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
     * 
     */
    @EnumType
    public enum InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction {
        /**
         * Do not perform any action.
         * 
         */
        None("NONE"),
        /**
         * Updates applied in runtime, instances will not be disrupted.
         * 
         */
        Refresh("REFRESH"),
        /**
         * Old instances will be deleted. New instances will be created from the target template.
         * 
         */
        Replace("REPLACE"),
        /**
         * Every instance will be restarted.
         * 
         */
        Restart("RESTART");

        private final String value;

        InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceGroupManagerUpdatePolicyMostDisruptiveAllowedAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
