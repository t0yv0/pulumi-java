// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.azurenative.peering.enums.Role;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The contact detail class.
 * 
 */
public final class ContactDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactDetailArgs Empty = new ContactDetailArgs();

    /**
     * The e-mail address of the contact.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The e-mail address of the contact.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The phone number of the contact.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    /**
     * @return The phone number of the contact.
     * 
     */
    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    /**
     * The role of the contact.
     * 
     */
    @Import(name="role")
    private @Nullable Output<Either<String,Role>> role;

    /**
     * @return The role of the contact.
     * 
     */
    public Optional<Output<Either<String,Role>>> role() {
        return Optional.ofNullable(this.role);
    }

    private ContactDetailArgs() {}

    private ContactDetailArgs(ContactDetailArgs $) {
        this.email = $.email;
        this.phone = $.phone;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactDetailArgs $;

        public Builder() {
            $ = new ContactDetailArgs();
        }

        public Builder(ContactDetailArgs defaults) {
            $ = new ContactDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The e-mail address of the contact.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The e-mail address of the contact.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param phone The phone number of the contact.
         * 
         * @return builder
         * 
         */
        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone The phone number of the contact.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        /**
         * @param role The role of the contact.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<Either<String,Role>> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the contact.
         * 
         * @return builder
         * 
         */
        public Builder role(Either<String,Role> role) {
            return role(Output.of(role));
        }

        /**
         * @param role The role of the contact.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Either.ofLeft(role));
        }

        /**
         * @param role The role of the contact.
         * 
         * @return builder
         * 
         */
        public Builder role(Role role) {
            return role(Either.ofRight(role));
        }

        public ContactDetailArgs build() {
            return $;
        }
    }

}
