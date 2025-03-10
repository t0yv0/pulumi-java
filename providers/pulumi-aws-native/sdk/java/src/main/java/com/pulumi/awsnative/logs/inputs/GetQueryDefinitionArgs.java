// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.logs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQueryDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueryDefinitionArgs Empty = new GetQueryDefinitionArgs();

    /**
     * Unique identifier of a query definition
     * 
     */
    @Import(name="queryDefinitionId", required=true)
    private String queryDefinitionId;

    /**
     * @return Unique identifier of a query definition
     * 
     */
    public String queryDefinitionId() {
        return this.queryDefinitionId;
    }

    private GetQueryDefinitionArgs() {}

    private GetQueryDefinitionArgs(GetQueryDefinitionArgs $) {
        this.queryDefinitionId = $.queryDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueryDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueryDefinitionArgs $;

        public Builder() {
            $ = new GetQueryDefinitionArgs();
        }

        public Builder(GetQueryDefinitionArgs defaults) {
            $ = new GetQueryDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryDefinitionId Unique identifier of a query definition
         * 
         * @return builder
         * 
         */
        public Builder queryDefinitionId(String queryDefinitionId) {
            $.queryDefinitionId = queryDefinitionId;
            return this;
        }

        public GetQueryDefinitionArgs build() {
            $.queryDefinitionId = Objects.requireNonNull($.queryDefinitionId, "expected parameter 'queryDefinitionId' to be non-null");
            return $;
        }
    }

}
