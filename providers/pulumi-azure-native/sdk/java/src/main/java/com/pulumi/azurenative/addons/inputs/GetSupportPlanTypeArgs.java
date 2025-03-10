// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.addons.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSupportPlanTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSupportPlanTypeArgs Empty = new GetSupportPlanTypeArgs();

    /**
     * The Canonical support plan type.
     * 
     */
    @Import(name="planTypeName", required=true)
    private String planTypeName;

    /**
     * @return The Canonical support plan type.
     * 
     */
    public String planTypeName() {
        return this.planTypeName;
    }

    /**
     * The support plan type. For now the only valid type is &#34;canonical&#34;.
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return The support plan type. For now the only valid type is &#34;canonical&#34;.
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    private GetSupportPlanTypeArgs() {}

    private GetSupportPlanTypeArgs(GetSupportPlanTypeArgs $) {
        this.planTypeName = $.planTypeName;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSupportPlanTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSupportPlanTypeArgs $;

        public Builder() {
            $ = new GetSupportPlanTypeArgs();
        }

        public Builder(GetSupportPlanTypeArgs defaults) {
            $ = new GetSupportPlanTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planTypeName The Canonical support plan type.
         * 
         * @return builder
         * 
         */
        public Builder planTypeName(String planTypeName) {
            $.planTypeName = planTypeName;
            return this;
        }

        /**
         * @param providerName The support plan type. For now the only valid type is &#34;canonical&#34;.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        public GetSupportPlanTypeArgs build() {
            $.planTypeName = Objects.requireNonNull($.planTypeName, "expected parameter 'planTypeName' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            return $;
        }
    }

}
