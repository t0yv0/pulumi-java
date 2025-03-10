// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSourceControlTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSourceControlTokenArgs Empty = new GetSourceControlTokenArgs();

    /**
     * The Token type. Possible values include `Bitbucket`, `Dropbox`, `Github`, and `OneDrive`.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The Token type. Possible values include `Bitbucket`, `Dropbox`, `Github`, and `OneDrive`.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetSourceControlTokenArgs() {}

    private GetSourceControlTokenArgs(GetSourceControlTokenArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSourceControlTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSourceControlTokenArgs $;

        public Builder() {
            $ = new GetSourceControlTokenArgs();
        }

        public Builder(GetSourceControlTokenArgs defaults) {
            $ = new GetSourceControlTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The Token type. Possible values include `Bitbucket`, `Dropbox`, `Github`, and `OneDrive`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetSourceControlTokenArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
