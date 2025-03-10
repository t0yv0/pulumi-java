// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path in which to create the user.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path in which to create the user.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    @Import(name="permissionsBoundary")
    private @Nullable Output<String> permissionsBoundary;

    /**
     * @return The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    public Optional<Output<String>> permissionsBoundary() {
        return Optional.ofNullable(this.permissionsBoundary);
    }

    /**
     * Key-value mapping of tags for the IAM user
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags for the IAM user
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.forceDestroy = $.forceDestroy;
        this.name = $.name;
        this.path = $.path;
        this.permissionsBoundary = $.permissionsBoundary;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forceDestroy When destroying this user, destroy even if it
         * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
         * a user with non-provider-managed access keys and login profile will fail to be destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy When destroying this user, destroy even if it
         * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
         * a user with non-provider-managed access keys and login profile will fail to be destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param name The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path in which to create the user.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path in which to create the user.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param permissionsBoundary The ARN of the policy that is used to set the permissions boundary for the user.
         * 
         * @return builder
         * 
         */
        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            $.permissionsBoundary = permissionsBoundary;
            return this;
        }

        /**
         * @param permissionsBoundary The ARN of the policy that is used to set the permissions boundary for the user.
         * 
         * @return builder
         * 
         */
        public Builder permissionsBoundary(String permissionsBoundary) {
            return permissionsBoundary(Output.of(permissionsBoundary));
        }

        /**
         * @param tags Key-value mapping of tags for the IAM user
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of tags for the IAM user
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public UserArgs build() {
            return $;
        }
    }

}
