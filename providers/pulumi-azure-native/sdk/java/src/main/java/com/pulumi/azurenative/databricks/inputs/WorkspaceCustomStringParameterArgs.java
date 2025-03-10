// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Value.
 * 
 */
public final class WorkspaceCustomStringParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomStringParameterArgs Empty = new WorkspaceCustomStringParameterArgs();

    /**
     * The value which should be used for this field.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value which should be used for this field.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private WorkspaceCustomStringParameterArgs() {}

    private WorkspaceCustomStringParameterArgs(WorkspaceCustomStringParameterArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceCustomStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceCustomStringParameterArgs $;

        public Builder() {
            $ = new WorkspaceCustomStringParameterArgs();
        }

        public Builder(WorkspaceCustomStringParameterArgs defaults) {
            $ = new WorkspaceCustomStringParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The value which should be used for this field.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value which should be used for this field.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WorkspaceCustomStringParameterArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
