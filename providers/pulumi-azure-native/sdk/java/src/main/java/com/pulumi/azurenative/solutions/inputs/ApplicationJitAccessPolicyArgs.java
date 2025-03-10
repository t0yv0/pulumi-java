// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.azurenative.solutions.enums.JitApprovalMode;
import com.pulumi.azurenative.solutions.inputs.JitApproverDefinitionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed application Jit access policy.
 * 
 */
public final class ApplicationJitAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationJitAccessPolicyArgs Empty = new ApplicationJitAccessPolicyArgs();

    /**
     * Whether the JIT access is enabled.
     * 
     */
    @Import(name="jitAccessEnabled", required=true)
    private Output<Boolean> jitAccessEnabled;

    /**
     * @return Whether the JIT access is enabled.
     * 
     */
    public Output<Boolean> jitAccessEnabled() {
        return this.jitAccessEnabled;
    }

    /**
     * JIT approval mode.
     * 
     */
    @Import(name="jitApprovalMode")
    private @Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode;

    /**
     * @return JIT approval mode.
     * 
     */
    public Optional<Output<Either<String,JitApprovalMode>>> jitApprovalMode() {
        return Optional.ofNullable(this.jitApprovalMode);
    }

    /**
     * The JIT approvers
     * 
     */
    @Import(name="jitApprovers")
    private @Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers;

    /**
     * @return The JIT approvers
     * 
     */
    public Optional<Output<List<JitApproverDefinitionArgs>>> jitApprovers() {
        return Optional.ofNullable(this.jitApprovers);
    }

    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    @Import(name="maximumJitAccessDuration")
    private @Nullable Output<String> maximumJitAccessDuration;

    /**
     * @return The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    public Optional<Output<String>> maximumJitAccessDuration() {
        return Optional.ofNullable(this.maximumJitAccessDuration);
    }

    private ApplicationJitAccessPolicyArgs() {}

    private ApplicationJitAccessPolicyArgs(ApplicationJitAccessPolicyArgs $) {
        this.jitAccessEnabled = $.jitAccessEnabled;
        this.jitApprovalMode = $.jitApprovalMode;
        this.jitApprovers = $.jitApprovers;
        this.maximumJitAccessDuration = $.maximumJitAccessDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationJitAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationJitAccessPolicyArgs $;

        public Builder() {
            $ = new ApplicationJitAccessPolicyArgs();
        }

        public Builder(ApplicationJitAccessPolicyArgs defaults) {
            $ = new ApplicationJitAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jitAccessEnabled Whether the JIT access is enabled.
         * 
         * @return builder
         * 
         */
        public Builder jitAccessEnabled(Output<Boolean> jitAccessEnabled) {
            $.jitAccessEnabled = jitAccessEnabled;
            return this;
        }

        /**
         * @param jitAccessEnabled Whether the JIT access is enabled.
         * 
         * @return builder
         * 
         */
        public Builder jitAccessEnabled(Boolean jitAccessEnabled) {
            return jitAccessEnabled(Output.of(jitAccessEnabled));
        }

        /**
         * @param jitApprovalMode JIT approval mode.
         * 
         * @return builder
         * 
         */
        public Builder jitApprovalMode(@Nullable Output<Either<String,JitApprovalMode>> jitApprovalMode) {
            $.jitApprovalMode = jitApprovalMode;
            return this;
        }

        /**
         * @param jitApprovalMode JIT approval mode.
         * 
         * @return builder
         * 
         */
        public Builder jitApprovalMode(Either<String,JitApprovalMode> jitApprovalMode) {
            return jitApprovalMode(Output.of(jitApprovalMode));
        }

        /**
         * @param jitApprovalMode JIT approval mode.
         * 
         * @return builder
         * 
         */
        public Builder jitApprovalMode(String jitApprovalMode) {
            return jitApprovalMode(Either.ofLeft(jitApprovalMode));
        }

        /**
         * @param jitApprovalMode JIT approval mode.
         * 
         * @return builder
         * 
         */
        public Builder jitApprovalMode(JitApprovalMode jitApprovalMode) {
            return jitApprovalMode(Either.ofRight(jitApprovalMode));
        }

        /**
         * @param jitApprovers The JIT approvers
         * 
         * @return builder
         * 
         */
        public Builder jitApprovers(@Nullable Output<List<JitApproverDefinitionArgs>> jitApprovers) {
            $.jitApprovers = jitApprovers;
            return this;
        }

        /**
         * @param jitApprovers The JIT approvers
         * 
         * @return builder
         * 
         */
        public Builder jitApprovers(List<JitApproverDefinitionArgs> jitApprovers) {
            return jitApprovers(Output.of(jitApprovers));
        }

        /**
         * @param jitApprovers The JIT approvers
         * 
         * @return builder
         * 
         */
        public Builder jitApprovers(JitApproverDefinitionArgs... jitApprovers) {
            return jitApprovers(List.of(jitApprovers));
        }

        /**
         * @param maximumJitAccessDuration The maximum duration JIT access is granted. This is an ISO8601 time period value.
         * 
         * @return builder
         * 
         */
        public Builder maximumJitAccessDuration(@Nullable Output<String> maximumJitAccessDuration) {
            $.maximumJitAccessDuration = maximumJitAccessDuration;
            return this;
        }

        /**
         * @param maximumJitAccessDuration The maximum duration JIT access is granted. This is an ISO8601 time period value.
         * 
         * @return builder
         * 
         */
        public Builder maximumJitAccessDuration(String maximumJitAccessDuration) {
            return maximumJitAccessDuration(Output.of(maximumJitAccessDuration));
        }

        public ApplicationJitAccessPolicyArgs build() {
            $.jitAccessEnabled = Objects.requireNonNull($.jitAccessEnabled, "expected parameter 'jitAccessEnabled' to be non-null");
            return $;
        }
    }

}
