// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlanArgs Empty = new GetPlanArgs();

    /**
     * The backup plan ID.
     * 
     */
    @Import(name="planId", required=true)
    private String planId;

    /**
     * @return The backup plan ID.
     * 
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Metadata that you can assign to help organize the plans you create.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Metadata that you can assign to help organize the plans you create.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetPlanArgs() {}

    private GetPlanArgs(GetPlanArgs $) {
        this.planId = $.planId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlanArgs $;

        public Builder() {
            $ = new GetPlanArgs();
        }

        public Builder(GetPlanArgs defaults) {
            $ = new GetPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planId The backup plan ID.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param tags Metadata that you can assign to help organize the plans you create.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetPlanArgs build() {
            $.planId = Objects.requireNonNull($.planId, "expected parameter 'planId' to be non-null");
            return $;
        }
    }

}
