// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.AzureBackupRuleResponse;
import com.pulumi.azurenative.dataprotection.outputs.AzureRetentionRuleResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackupPolicyResponse {
    /**
     * @return Type of datasource for the backup management
     * 
     */
    private final List<String> datasourceTypes;
    /**
     * @return
     * Expected value is &#39;BackupPolicy&#39;.
     * 
     */
    private final String objectType;
    /**
     * @return Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    private final List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

    @CustomType.Constructor
    private BackupPolicyResponse(
        @CustomType.Parameter("datasourceTypes") List<String> datasourceTypes,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("policyRules") List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
        this.datasourceTypes = datasourceTypes;
        this.objectType = objectType;
        this.policyRules = policyRules;
    }

    /**
     * @return Type of datasource for the backup management
     * 
     */
    public List<String> datasourceTypes() {
        return this.datasourceTypes;
    }
    /**
     * @return
     * Expected value is &#39;BackupPolicy&#39;.
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    /**
     * @return Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    public List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules() {
        return this.policyRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> datasourceTypes;
        private String objectType;
        private List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceTypes = defaults.datasourceTypes;
    	      this.objectType = defaults.objectType;
    	      this.policyRules = defaults.policyRules;
        }

        public Builder datasourceTypes(List<String> datasourceTypes) {
            this.datasourceTypes = Objects.requireNonNull(datasourceTypes);
            return this;
        }
        public Builder datasourceTypes(String... datasourceTypes) {
            return datasourceTypes(List.of(datasourceTypes));
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder policyRules(List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
            this.policyRules = Objects.requireNonNull(policyRules);
            return this;
        }
        public Builder policyRules(Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>... policyRules) {
            return policyRules(List.of(policyRules));
        }        public BackupPolicyResponse build() {
            return new BackupPolicyResponse(datasourceTypes, objectType, policyRules);
        }
    }
}
