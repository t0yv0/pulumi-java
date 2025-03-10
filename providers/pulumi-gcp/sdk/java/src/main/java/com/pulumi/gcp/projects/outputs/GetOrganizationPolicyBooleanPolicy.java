// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyBooleanPolicy {
    private final Boolean enforced;

    @CustomType.Constructor
    private GetOrganizationPolicyBooleanPolicy(@CustomType.Parameter("enforced") Boolean enforced) {
        this.enforced = enforced;
    }

    public Boolean enforced() {
        return this.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyBooleanPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyBooleanPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder enforced(Boolean enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }        public GetOrganizationPolicyBooleanPolicy build() {
            return new GetOrganizationPolicyBooleanPolicy(enforced);
        }
    }
}
