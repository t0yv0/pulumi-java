// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiPortalResourceRequestsResponse {
    /**
     * @return Cpu allocated to each API portal instance
     * 
     */
    private final String cpu;
    /**
     * @return Memory allocated to each API portal instance
     * 
     */
    private final String memory;

    @CustomType.Constructor
    private ApiPortalResourceRequestsResponse(
        @CustomType.Parameter("cpu") String cpu,
        @CustomType.Parameter("memory") String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    /**
     * @return Cpu allocated to each API portal instance
     * 
     */
    public String cpu() {
        return this.cpu;
    }
    /**
     * @return Memory allocated to each API portal instance
     * 
     */
    public String memory() {
        return this.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }        public ApiPortalResourceRequestsResponse build() {
            return new ApiPortalResourceRequestsResponse(cpu, memory);
        }
    }
}
