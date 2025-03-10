// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadClassifierResult {
    /**
     * @return The workload classifier context.
     * 
     */
    private final @Nullable String context;
    /**
     * @return The workload classifier end time for classification.
     * 
     */
    private final @Nullable String endTime;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return The workload classifier importance.
     * 
     */
    private final @Nullable String importance;
    /**
     * @return The workload classifier label.
     * 
     */
    private final @Nullable String label;
    /**
     * @return The workload classifier member name.
     * 
     */
    private final String memberName;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The workload classifier start time for classification.
     * 
     */
    private final @Nullable String startTime;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkloadClassifierResult(
        @CustomType.Parameter("context") @Nullable String context,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("importance") @Nullable String importance,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("memberName") String memberName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("type") String type) {
        this.context = context;
        this.endTime = endTime;
        this.id = id;
        this.importance = importance;
        this.label = label;
        this.memberName = memberName;
        this.name = name;
        this.startTime = startTime;
        this.type = type;
    }

    /**
     * @return The workload classifier context.
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * @return The workload classifier end time for classification.
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The workload classifier importance.
     * 
     */
    public Optional<String> importance() {
        return Optional.ofNullable(this.importance);
    }
    /**
     * @return The workload classifier label.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The workload classifier member name.
     * 
     */
    public String memberName() {
        return this.memberName;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The workload classifier start time for classification.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadClassifierResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private @Nullable String endTime;
        private String id;
        private @Nullable String importance;
        private @Nullable String label;
        private String memberName;
        private String name;
        private @Nullable String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadClassifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.label = defaults.label;
    	      this.memberName = defaults.memberName;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder importance(@Nullable String importance) {
            this.importance = importance;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder memberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkloadClassifierResult build() {
            return new GetWorkloadClassifierResult(context, endTime, id, importance, label, memberName, name, startTime, type);
        }
    }
}
