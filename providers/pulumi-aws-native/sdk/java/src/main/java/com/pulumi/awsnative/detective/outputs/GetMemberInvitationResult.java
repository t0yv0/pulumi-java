// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.detective.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMemberInvitationResult {
    /**
     * @return When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    private final @Nullable Boolean disableEmailNotification;
    /**
     * @return The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    private final @Nullable String memberEmailAddress;
    /**
     * @return A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    private final @Nullable String message;

    @CustomType.Constructor
    private GetMemberInvitationResult(
        @CustomType.Parameter("disableEmailNotification") @Nullable Boolean disableEmailNotification,
        @CustomType.Parameter("memberEmailAddress") @Nullable String memberEmailAddress,
        @CustomType.Parameter("message") @Nullable String message) {
        this.disableEmailNotification = disableEmailNotification;
        this.memberEmailAddress = memberEmailAddress;
        this.message = message;
    }

    /**
     * @return When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    public Optional<Boolean> disableEmailNotification() {
        return Optional.ofNullable(this.disableEmailNotification);
    }
    /**
     * @return The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    public Optional<String> memberEmailAddress() {
        return Optional.ofNullable(this.memberEmailAddress);
    }
    /**
     * @return A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMemberInvitationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableEmailNotification;
        private @Nullable String memberEmailAddress;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMemberInvitationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.memberEmailAddress = defaults.memberEmailAddress;
    	      this.message = defaults.message;
        }

        public Builder disableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }
        public Builder memberEmailAddress(@Nullable String memberEmailAddress) {
            this.memberEmailAddress = memberEmailAddress;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public GetMemberInvitationResult build() {
            return new GetMemberInvitationResult(disableEmailNotification, memberEmailAddress, message);
        }
    }
}
