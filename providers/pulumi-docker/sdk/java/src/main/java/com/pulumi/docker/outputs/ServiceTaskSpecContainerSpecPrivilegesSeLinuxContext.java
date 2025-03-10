// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext {
    private final @Nullable Boolean disable;
    private final @Nullable String level;
    private final @Nullable String role;
    private final @Nullable String type;
    private final @Nullable String user;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext(
        @CustomType.Parameter("disable") @Nullable Boolean disable,
        @CustomType.Parameter("level") @Nullable String level,
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("user") @Nullable String user) {
        this.disable = disable;
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    public Optional<Boolean> disable() {
        return Optional.ofNullable(this.disable);
    }
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disable;
        private @Nullable String level;
        private @Nullable String role;
        private @Nullable String type;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disable = defaults.disable;
    	      this.level = defaults.level;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder disable(@Nullable Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext build() {
            return new ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext(disable, level, role, type, user);
        }
    }
}
