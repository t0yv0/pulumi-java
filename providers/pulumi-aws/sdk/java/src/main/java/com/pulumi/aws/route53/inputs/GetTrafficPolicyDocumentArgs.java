// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentEndpoint;
import com.pulumi.aws.route53.inputs.GetTrafficPolicyDocumentRule;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficPolicyDocumentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrafficPolicyDocumentArgs Empty = new GetTrafficPolicyDocumentArgs();

    /**
     * Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     * 
     */
    @Import(name="endpoints")
    private @Nullable List<GetTrafficPolicyDocumentEndpoint> endpoints;

    /**
     * @return Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     * 
     */
    public Optional<List<GetTrafficPolicyDocumentEndpoint>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
     * 
     */
    @Import(name="recordType")
    private @Nullable String recordType;

    /**
     * @return DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
     * 
     */
    public Optional<String> recordType() {
        return Optional.ofNullable(this.recordType);
    }

    /**
     * Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     * 
     */
    @Import(name="rules")
    private @Nullable List<GetTrafficPolicyDocumentRule> rules;

    /**
     * @return Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     * 
     */
    public Optional<List<GetTrafficPolicyDocumentRule>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * An endpoint to be as the starting point for the traffic policy.
     * 
     */
    @Import(name="startEndpoint")
    private @Nullable String startEndpoint;

    /**
     * @return An endpoint to be as the starting point for the traffic policy.
     * 
     */
    public Optional<String> startEndpoint() {
        return Optional.ofNullable(this.startEndpoint);
    }

    /**
     * A rule to be as the starting point for the traffic policy.
     * 
     */
    @Import(name="startRule")
    private @Nullable String startRule;

    /**
     * @return A rule to be as the starting point for the traffic policy.
     * 
     */
    public Optional<String> startRule() {
        return Optional.ofNullable(this.startRule);
    }

    /**
     * Version of the traffic policy format.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return Version of the traffic policy format.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetTrafficPolicyDocumentArgs() {}

    private GetTrafficPolicyDocumentArgs(GetTrafficPolicyDocumentArgs $) {
        this.endpoints = $.endpoints;
        this.recordType = $.recordType;
        this.rules = $.rules;
        this.startEndpoint = $.startEndpoint;
        this.startRule = $.startRule;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficPolicyDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficPolicyDocumentArgs $;

        public Builder() {
            $ = new GetTrafficPolicyDocumentArgs();
        }

        public Builder(GetTrafficPolicyDocumentArgs defaults) {
            $ = new GetTrafficPolicyDocumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable List<GetTrafficPolicyDocumentEndpoint> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
         * 
         * @return builder
         * 
         */
        public Builder endpoints(GetTrafficPolicyDocumentEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param recordType DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
         * 
         * @return builder
         * 
         */
        public Builder recordType(@Nullable String recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param rules Configuration block for definitions of the rules that you want to use in this traffic policy. See below
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable List<GetTrafficPolicyDocumentRule> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Configuration block for definitions of the rules that you want to use in this traffic policy. See below
         * 
         * @return builder
         * 
         */
        public Builder rules(GetTrafficPolicyDocumentRule... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param startEndpoint An endpoint to be as the starting point for the traffic policy.
         * 
         * @return builder
         * 
         */
        public Builder startEndpoint(@Nullable String startEndpoint) {
            $.startEndpoint = startEndpoint;
            return this;
        }

        /**
         * @param startRule A rule to be as the starting point for the traffic policy.
         * 
         * @return builder
         * 
         */
        public Builder startRule(@Nullable String startRule) {
            $.startRule = startRule;
            return this;
        }

        /**
         * @param version Version of the traffic policy format.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetTrafficPolicyDocumentArgs build() {
            return $;
        }
    }

}
