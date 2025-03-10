// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.servicebus.enums.AccessRights;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicAuthorizationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicAuthorizationRuleArgs Empty = new TopicAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName")
    private @Nullable Output<String> authorizationRuleName;

    /**
     * @return The authorization rule name.
     * 
     */
    public Optional<Output<String>> authorizationRuleName() {
        return Optional.ofNullable(this.authorizationRuleName);
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @Import(name="rights", required=true)
    private Output<List<AccessRights>> rights;

    /**
     * @return The rights associated with the rule.
     * 
     */
    public Output<List<AccessRights>> rights() {
        return this.rights;
    }

    /**
     * The topic name.
     * 
     */
    @Import(name="topicName", required=true)
    private Output<String> topicName;

    /**
     * @return The topic name.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    private TopicAuthorizationRuleArgs() {}

    private TopicAuthorizationRuleArgs(TopicAuthorizationRuleArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.rights = $.rights;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicAuthorizationRuleArgs $;

        public Builder() {
            $ = new TopicAuthorizationRuleArgs();
        }

        public Builder(TopicAuthorizationRuleArgs defaults) {
            $ = new TopicAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(@Nullable Output<String> authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            return authorizationRuleName(Output.of(authorizationRuleName));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rights The rights associated with the rule.
         * 
         * @return builder
         * 
         */
        public Builder rights(Output<List<AccessRights>> rights) {
            $.rights = rights;
            return this;
        }

        /**
         * @param rights The rights associated with the rule.
         * 
         * @return builder
         * 
         */
        public Builder rights(List<AccessRights> rights) {
            return rights(Output.of(rights));
        }

        /**
         * @param rights The rights associated with the rule.
         * 
         * @return builder
         * 
         */
        public Builder rights(AccessRights... rights) {
            return rights(List.of(rights));
        }

        /**
         * @param topicName The topic name.
         * 
         * @return builder
         * 
         */
        public Builder topicName(Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The topic name.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public TopicAuthorizationRuleArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.rights = Objects.requireNonNull($.rights, "expected parameter 'rights' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
