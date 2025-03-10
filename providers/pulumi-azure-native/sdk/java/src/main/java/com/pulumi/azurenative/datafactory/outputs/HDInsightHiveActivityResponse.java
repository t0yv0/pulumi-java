// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HDInsightHiveActivityResponse {
    /**
     * @return User specified arguments to HDInsightActivity.
     * 
     */
    private final @Nullable List<Object> arguments;
    /**
     * @return Allows user to specify defines for Hive job request.
     * 
     */
    private final @Nullable Map<String,Object> defines;
    /**
     * @return Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * @return Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Debug info option.
     * 
     */
    private final @Nullable String getDebugInfo;
    /**
     * @return Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * @return Activity name.
     * 
     */
    private final String name;
    /**
     * @return Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * @return Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    private final @Nullable Integer queryTimeout;
    /**
     * @return Script linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse scriptLinkedService;
    /**
     * @return Script path. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object scriptPath;
    /**
     * @return Storage linked service references.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
    /**
     * @return Type of activity.
     * Expected value is &#39;HDInsightHive&#39;.
     * 
     */
    private final String type;
    /**
     * @return Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * @return User specified arguments under hivevar namespace.
     * 
     */
    private final @Nullable List<Object> variables;

    @CustomType.Constructor
    private HDInsightHiveActivityResponse(
        @CustomType.Parameter("arguments") @Nullable List<Object> arguments,
        @CustomType.Parameter("defines") @Nullable Map<String,Object> defines,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("getDebugInfo") @Nullable String getDebugInfo,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("queryTimeout") @Nullable Integer queryTimeout,
        @CustomType.Parameter("scriptLinkedService") @Nullable LinkedServiceReferenceResponse scriptLinkedService,
        @CustomType.Parameter("scriptPath") @Nullable Object scriptPath,
        @CustomType.Parameter("storageLinkedServices") @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @CustomType.Parameter("variables") @Nullable List<Object> variables) {
        this.arguments = arguments;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.queryTimeout = queryTimeout;
        this.scriptLinkedService = scriptLinkedService;
        this.scriptPath = scriptPath;
        this.storageLinkedServices = storageLinkedServices;
        this.type = type;
        this.userProperties = userProperties;
        this.variables = variables;
    }

    /**
     * @return User specified arguments to HDInsightActivity.
     * 
     */
    public List<Object> arguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * @return Allows user to specify defines for Hive job request.
     * 
     */
    public Map<String,Object> defines() {
        return this.defines == null ? Map.of() : this.defines;
    }
    /**
     * @return Activity depends on condition.
     * 
     */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * @return Activity description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Debug info option.
     * 
     */
    public Optional<String> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }
    /**
     * @return Linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * @return Activity name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Activity policy.
     * 
     */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    public Optional<Integer> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * @return Script linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> scriptLinkedService() {
        return Optional.ofNullable(this.scriptLinkedService);
    }
    /**
     * @return Script path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }
    /**
     * @return Storage linked service references.
     * 
     */
    public List<LinkedServiceReferenceResponse> storageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }
    /**
     * @return Type of activity.
     * Expected value is &#39;HDInsightHive&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Activity user properties.
     * 
     */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * @return User specified arguments under hivevar namespace.
     * 
     */
    public List<Object> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightHiveActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> arguments;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable String getDebugInfo;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Integer queryTimeout;
        private @Nullable LinkedServiceReferenceResponse scriptLinkedService;
        private @Nullable Object scriptPath;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable List<Object> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightHiveActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.variables = defaults.variables;
        }

        public Builder arguments(@Nullable List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder defines(@Nullable Map<String,Object> defines) {
            this.defines = defines;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder getDebugInfo(@Nullable String getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder queryTimeout(@Nullable Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder scriptLinkedService(@Nullable LinkedServiceReferenceResponse scriptLinkedService) {
            this.scriptLinkedService = scriptLinkedService;
            return this;
        }
        public Builder scriptPath(@Nullable Object scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceResponse> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }
        public Builder storageLinkedServices(LinkedServiceReferenceResponse... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder variables(@Nullable List<Object> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(Object... variables) {
            return variables(List.of(variables));
        }        public HDInsightHiveActivityResponse build() {
            return new HDInsightHiveActivityResponse(arguments, defines, dependsOn, description, getDebugInfo, linkedServiceName, name, policy, queryTimeout, scriptLinkedService, scriptPath, storageLinkedServices, type, userProperties, variables);
        }
    }
}
