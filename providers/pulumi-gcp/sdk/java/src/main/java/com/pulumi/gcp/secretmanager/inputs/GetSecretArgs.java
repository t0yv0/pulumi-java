// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * The ID of the project in which the resource belongs.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return The name of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.project = $.project;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param secretId The name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        public GetSecretArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
