// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationTokenArgs Empty = new GetAuthorizationTokenArgs();

    /**
     * The name of the domain that is in scope for the generated authorization token.
     * 
     */
    @Import(name="domain", required=true)
    private String domain;

    /**
     * @return The name of the domain that is in scope for the generated authorization token.
     * 
     */
    public String domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable String domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Optional<String> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Integer durationSeconds;

    /**
     * @return The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     * 
     */
    public Optional<Integer> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    private GetAuthorizationTokenArgs() {}

    private GetAuthorizationTokenArgs(GetAuthorizationTokenArgs $) {
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.durationSeconds = $.durationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationTokenArgs $;

        public Builder() {
            $ = new GetAuthorizationTokenArgs();
        }

        public Builder(GetAuthorizationTokenArgs defaults) {
            $ = new GetAuthorizationTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The name of the domain that is in scope for the generated authorization token.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable String domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param durationSeconds The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        public GetAuthorizationTokenArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            return $;
        }
    }

}
