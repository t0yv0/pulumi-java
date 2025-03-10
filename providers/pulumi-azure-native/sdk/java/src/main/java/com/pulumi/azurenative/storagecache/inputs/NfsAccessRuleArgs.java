// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.enums.NfsAccessRuleAccess;
import com.pulumi.azurenative.storagecache.enums.NfsAccessRuleScope;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule to place restrictions on portions of the cache namespace being presented to clients.
 * 
 */
public final class NfsAccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NfsAccessRuleArgs Empty = new NfsAccessRuleArgs();

    /**
     * Access allowed by this rule.
     * 
     */
    @Import(name="access", required=true)
    private Output<Either<String,NfsAccessRuleAccess>> access;

    /**
     * @return Access allowed by this rule.
     * 
     */
    public Output<Either<String,NfsAccessRuleAccess>> access() {
        return this.access;
    }

    /**
     * GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    @Import(name="anonymousGID")
    private @Nullable Output<String> anonymousGID;

    /**
     * @return GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
     * 
     */
    public Optional<Output<String>> anonymousGID() {
        return Optional.ofNullable(this.anonymousGID);
    }

    /**
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    @Import(name="anonymousUID")
    private @Nullable Output<String> anonymousUID;

    /**
     * @return UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
     * 
     */
    public Optional<Output<String>> anonymousUID() {
        return Optional.ofNullable(this.anonymousUID);
    }

    /**
     * Filter applied to the scope for this rule. The filter&#39;s format depends on its scope. &#39;default&#39; scope matches all clients and has no filter value. &#39;network&#39; scope takes a filter in CIDR format (for example, 10.99.1.0/24). &#39;host&#39; takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Filter applied to the scope for this rule. The filter&#39;s format depends on its scope. &#39;default&#39; scope matches all clients and has no filter value. &#39;network&#39; scope takes a filter in CIDR format (for example, 10.99.1.0/24). &#39;host&#39; takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    @Import(name="rootSquash")
    private @Nullable Output<Boolean> rootSquash;

    /**
     * @return Map root accesses to anonymousUID and anonymousGID.
     * 
     */
    public Optional<Output<Boolean>> rootSquash() {
        return Optional.ofNullable(this.rootSquash);
    }

    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    @Import(name="scope", required=true)
    private Output<Either<String,NfsAccessRuleScope>> scope;

    /**
     * @return Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    public Output<Either<String,NfsAccessRuleScope>> scope() {
        return this.scope;
    }

    /**
     * For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path &#39;/&#39;. If set to yes, clients can mount a deeper path, like &#39;/a/b&#39;.
     * 
     */
    @Import(name="submountAccess")
    private @Nullable Output<Boolean> submountAccess;

    /**
     * @return For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path &#39;/&#39;. If set to yes, clients can mount a deeper path, like &#39;/a/b&#39;.
     * 
     */
    public Optional<Output<Boolean>> submountAccess() {
        return Optional.ofNullable(this.submountAccess);
    }

    /**
     * Allow SUID semantics.
     * 
     */
    @Import(name="suid")
    private @Nullable Output<Boolean> suid;

    /**
     * @return Allow SUID semantics.
     * 
     */
    public Optional<Output<Boolean>> suid() {
        return Optional.ofNullable(this.suid);
    }

    private NfsAccessRuleArgs() {}

    private NfsAccessRuleArgs(NfsAccessRuleArgs $) {
        this.access = $.access;
        this.anonymousGID = $.anonymousGID;
        this.anonymousUID = $.anonymousUID;
        this.filter = $.filter;
        this.rootSquash = $.rootSquash;
        this.scope = $.scope;
        this.submountAccess = $.submountAccess;
        this.suid = $.suid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsAccessRuleArgs $;

        public Builder() {
            $ = new NfsAccessRuleArgs();
        }

        public Builder(NfsAccessRuleArgs defaults) {
            $ = new NfsAccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access Access allowed by this rule.
         * 
         * @return builder
         * 
         */
        public Builder access(Output<Either<String,NfsAccessRuleAccess>> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access Access allowed by this rule.
         * 
         * @return builder
         * 
         */
        public Builder access(Either<String,NfsAccessRuleAccess> access) {
            return access(Output.of(access));
        }

        /**
         * @param access Access allowed by this rule.
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Either.ofLeft(access));
        }

        /**
         * @param access Access allowed by this rule.
         * 
         * @return builder
         * 
         */
        public Builder access(NfsAccessRuleAccess access) {
            return access(Either.ofRight(access));
        }

        /**
         * @param anonymousGID GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
         * 
         * @return builder
         * 
         */
        public Builder anonymousGID(@Nullable Output<String> anonymousGID) {
            $.anonymousGID = anonymousGID;
            return this;
        }

        /**
         * @param anonymousGID GID value that replaces 0 when rootSquash is true. This will use the value of anonymousUID if not provided.
         * 
         * @return builder
         * 
         */
        public Builder anonymousGID(String anonymousGID) {
            return anonymousGID(Output.of(anonymousGID));
        }

        /**
         * @param anonymousUID UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
         * 
         * @return builder
         * 
         */
        public Builder anonymousUID(@Nullable Output<String> anonymousUID) {
            $.anonymousUID = anonymousUID;
            return this;
        }

        /**
         * @param anonymousUID UID value that replaces 0 when rootSquash is true. 65534 will be used if not provided.
         * 
         * @return builder
         * 
         */
        public Builder anonymousUID(String anonymousUID) {
            return anonymousUID(Output.of(anonymousUID));
        }

        /**
         * @param filter Filter applied to the scope for this rule. The filter&#39;s format depends on its scope. &#39;default&#39; scope matches all clients and has no filter value. &#39;network&#39; scope takes a filter in CIDR format (for example, 10.99.1.0/24). &#39;host&#39; takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filter applied to the scope for this rule. The filter&#39;s format depends on its scope. &#39;default&#39; scope matches all clients and has no filter value. &#39;network&#39; scope takes a filter in CIDR format (for example, 10.99.1.0/24). &#39;host&#39; takes an IP address or fully qualified domain name as filter. If a client does not match any filter rule and there is no default rule, access is denied.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param rootSquash Map root accesses to anonymousUID and anonymousGID.
         * 
         * @return builder
         * 
         */
        public Builder rootSquash(@Nullable Output<Boolean> rootSquash) {
            $.rootSquash = rootSquash;
            return this;
        }

        /**
         * @param rootSquash Map root accesses to anonymousUID and anonymousGID.
         * 
         * @return builder
         * 
         */
        public Builder rootSquash(Boolean rootSquash) {
            return rootSquash(Output.of(rootSquash));
        }

        /**
         * @param scope Scope for this rule. The scope and filter determine which clients match the rule.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<Either<String,NfsAccessRuleScope>> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope for this rule. The scope and filter determine which clients match the rule.
         * 
         * @return builder
         * 
         */
        public Builder scope(Either<String,NfsAccessRuleScope> scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param scope Scope for this rule. The scope and filter determine which clients match the rule.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Either.ofLeft(scope));
        }

        /**
         * @param scope Scope for this rule. The scope and filter determine which clients match the rule.
         * 
         * @return builder
         * 
         */
        public Builder scope(NfsAccessRuleScope scope) {
            return scope(Either.ofRight(scope));
        }

        /**
         * @param submountAccess For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path &#39;/&#39;. If set to yes, clients can mount a deeper path, like &#39;/a/b&#39;.
         * 
         * @return builder
         * 
         */
        public Builder submountAccess(@Nullable Output<Boolean> submountAccess) {
            $.submountAccess = submountAccess;
            return this;
        }

        /**
         * @param submountAccess For the default policy, allow access to subdirectories under the root export. If this is set to no, clients can only mount the path &#39;/&#39;. If set to yes, clients can mount a deeper path, like &#39;/a/b&#39;.
         * 
         * @return builder
         * 
         */
        public Builder submountAccess(Boolean submountAccess) {
            return submountAccess(Output.of(submountAccess));
        }

        /**
         * @param suid Allow SUID semantics.
         * 
         * @return builder
         * 
         */
        public Builder suid(@Nullable Output<Boolean> suid) {
            $.suid = suid;
            return this;
        }

        /**
         * @param suid Allow SUID semantics.
         * 
         * @return builder
         * 
         */
        public Builder suid(Boolean suid) {
            return suid(Output.of(suid));
        }

        public NfsAccessRuleArgs build() {
            $.access = Objects.requireNonNull($.access, "expected parameter 'access' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
