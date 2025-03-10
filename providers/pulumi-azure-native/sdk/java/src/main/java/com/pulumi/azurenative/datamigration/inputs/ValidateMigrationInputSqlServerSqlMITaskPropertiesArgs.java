// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ValidateMigrationInputSqlServerSqlMITaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for task that validates migration input for SQL to Azure SQL Database Managed Instance
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs Empty = new ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input;

    /**
     * @return Task input
     * 
     */
    public Optional<Output<ValidateMigrationInputSqlServerSqlMITaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;ValidateMigrationInput.SqlServer.AzureSqlDbMI&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Task type.
     * Expected value is &#39;ValidateMigrationInput.SqlServer.AzureSqlDbMI&#39;.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs() {}

    private ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs(ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs $;

        public Builder() {
            $ = new ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs();
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs defaults) {
            $ = new ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<ValidateMigrationInputSqlServerSqlMITaskInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(ValidateMigrationInputSqlServerSqlMITaskInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ValidateMigrationInput.SqlServer.AzureSqlDbMI&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ValidateMigrationInput.SqlServer.AzureSqlDbMI&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ValidateMigrationInputSqlServerSqlMITaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
