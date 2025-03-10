// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.budgets;

import com.pulumi.awsnative.budgets.enums.BudgetsActionActionType;
import com.pulumi.awsnative.budgets.enums.BudgetsActionApprovalModel;
import com.pulumi.awsnative.budgets.enums.BudgetsActionNotificationType;
import com.pulumi.awsnative.budgets.inputs.BudgetsActionActionThresholdArgs;
import com.pulumi.awsnative.budgets.inputs.BudgetsActionDefinitionArgs;
import com.pulumi.awsnative.budgets.inputs.BudgetsActionSubscriberArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetsActionArgs Empty = new BudgetsActionArgs();

    @Import(name="actionThreshold", required=true)
    private Output<BudgetsActionActionThresholdArgs> actionThreshold;

    public Output<BudgetsActionActionThresholdArgs> actionThreshold() {
        return this.actionThreshold;
    }

    @Import(name="actionType", required=true)
    private Output<BudgetsActionActionType> actionType;

    public Output<BudgetsActionActionType> actionType() {
        return this.actionType;
    }

    @Import(name="approvalModel")
    private @Nullable Output<BudgetsActionApprovalModel> approvalModel;

    public Optional<Output<BudgetsActionApprovalModel>> approvalModel() {
        return Optional.ofNullable(this.approvalModel);
    }

    @Import(name="budgetName", required=true)
    private Output<String> budgetName;

    public Output<String> budgetName() {
        return this.budgetName;
    }

    @Import(name="definition", required=true)
    private Output<BudgetsActionDefinitionArgs> definition;

    public Output<BudgetsActionDefinitionArgs> definition() {
        return this.definition;
    }

    @Import(name="executionRoleArn", required=true)
    private Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    @Import(name="notificationType", required=true)
    private Output<BudgetsActionNotificationType> notificationType;

    public Output<BudgetsActionNotificationType> notificationType() {
        return this.notificationType;
    }

    @Import(name="subscribers", required=true)
    private Output<List<BudgetsActionSubscriberArgs>> subscribers;

    public Output<List<BudgetsActionSubscriberArgs>> subscribers() {
        return this.subscribers;
    }

    private BudgetsActionArgs() {}

    private BudgetsActionArgs(BudgetsActionArgs $) {
        this.actionThreshold = $.actionThreshold;
        this.actionType = $.actionType;
        this.approvalModel = $.approvalModel;
        this.budgetName = $.budgetName;
        this.definition = $.definition;
        this.executionRoleArn = $.executionRoleArn;
        this.notificationType = $.notificationType;
        this.subscribers = $.subscribers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetsActionArgs $;

        public Builder() {
            $ = new BudgetsActionArgs();
        }

        public Builder(BudgetsActionArgs defaults) {
            $ = new BudgetsActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionThreshold(Output<BudgetsActionActionThresholdArgs> actionThreshold) {
            $.actionThreshold = actionThreshold;
            return this;
        }

        public Builder actionThreshold(BudgetsActionActionThresholdArgs actionThreshold) {
            return actionThreshold(Output.of(actionThreshold));
        }

        public Builder actionType(Output<BudgetsActionActionType> actionType) {
            $.actionType = actionType;
            return this;
        }

        public Builder actionType(BudgetsActionActionType actionType) {
            return actionType(Output.of(actionType));
        }

        public Builder approvalModel(@Nullable Output<BudgetsActionApprovalModel> approvalModel) {
            $.approvalModel = approvalModel;
            return this;
        }

        public Builder approvalModel(BudgetsActionApprovalModel approvalModel) {
            return approvalModel(Output.of(approvalModel));
        }

        public Builder budgetName(Output<String> budgetName) {
            $.budgetName = budgetName;
            return this;
        }

        public Builder budgetName(String budgetName) {
            return budgetName(Output.of(budgetName));
        }

        public Builder definition(Output<BudgetsActionDefinitionArgs> definition) {
            $.definition = definition;
            return this;
        }

        public Builder definition(BudgetsActionDefinitionArgs definition) {
            return definition(Output.of(definition));
        }

        public Builder executionRoleArn(Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder notificationType(Output<BudgetsActionNotificationType> notificationType) {
            $.notificationType = notificationType;
            return this;
        }

        public Builder notificationType(BudgetsActionNotificationType notificationType) {
            return notificationType(Output.of(notificationType));
        }

        public Builder subscribers(Output<List<BudgetsActionSubscriberArgs>> subscribers) {
            $.subscribers = subscribers;
            return this;
        }

        public Builder subscribers(List<BudgetsActionSubscriberArgs> subscribers) {
            return subscribers(Output.of(subscribers));
        }

        public Builder subscribers(BudgetsActionSubscriberArgs... subscribers) {
            return subscribers(List.of(subscribers));
        }

        public BudgetsActionArgs build() {
            $.actionThreshold = Objects.requireNonNull($.actionThreshold, "expected parameter 'actionThreshold' to be non-null");
            $.actionType = Objects.requireNonNull($.actionType, "expected parameter 'actionType' to be non-null");
            $.budgetName = Objects.requireNonNull($.budgetName, "expected parameter 'budgetName' to be non-null");
            $.definition = Objects.requireNonNull($.definition, "expected parameter 'definition' to be non-null");
            $.executionRoleArn = Objects.requireNonNull($.executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
            $.notificationType = Objects.requireNonNull($.notificationType, "expected parameter 'notificationType' to be non-null");
            $.subscribers = Objects.requireNonNull($.subscribers, "expected parameter 'subscribers' to be non-null");
            return $;
        }
    }

}
