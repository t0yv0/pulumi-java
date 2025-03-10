// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration;
import com.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecyclePolicyPolicyDetailsActionCrossRegionCopy {
    /**
     * @return The encryption settings for the copied snapshot. See the `encryption_configuration` block. Max of 1 per action.
     * 
     */
    private final LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration;
    /**
     * @return The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    private final @Nullable LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule retainRule;
    /**
     * @return The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private LifecyclePolicyPolicyDetailsActionCrossRegionCopy(
        @CustomType.Parameter("encryptionConfiguration") LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration,
        @CustomType.Parameter("retainRule") @Nullable LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule retainRule,
        @CustomType.Parameter("target") String target) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.retainRule = retainRule;
        this.target = target;
    }

    /**
     * @return The encryption settings for the copied snapshot. See the `encryption_configuration` block. Max of 1 per action.
     * 
     */
    public LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * @return The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    public Optional<LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule> retainRule() {
        return Optional.ofNullable(this.retainRule);
    }
    /**
     * @return The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsActionCrossRegionCopy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration;
        private @Nullable LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule retainRule;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsActionCrossRegionCopy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.retainRule = defaults.retainRule;
    	      this.target = defaults.target;
        }

        public Builder encryptionConfiguration(LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = Objects.requireNonNull(encryptionConfiguration);
            return this;
        }
        public Builder retainRule(@Nullable LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule retainRule) {
            this.retainRule = retainRule;
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public LifecyclePolicyPolicyDetailsActionCrossRegionCopy build() {
            return new LifecyclePolicyPolicyDetailsActionCrossRegionCopy(encryptionConfiguration, retainRule, target);
        }
    }
}
