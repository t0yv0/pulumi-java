// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ContainerCapabilities {
    /**
     * @return List of linux capabilities to add.
     * 
     */
    private final @Nullable List<String> adds;
    /**
     * @return List of linux capabilities to drop.
     * 
     */
    private final @Nullable List<String> drops;

    @CustomType.Constructor
    private ContainerCapabilities(
        @CustomType.Parameter("adds") @Nullable List<String> adds,
        @CustomType.Parameter("drops") @Nullable List<String> drops) {
        this.adds = adds;
        this.drops = drops;
    }

    /**
     * @return List of linux capabilities to add.
     * 
     */
    public List<String> adds() {
        return this.adds == null ? List.of() : this.adds;
    }
    /**
     * @return List of linux capabilities to drop.
     * 
     */
    public List<String> drops() {
        return this.drops == null ? List.of() : this.drops;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCapabilities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> adds;
        private @Nullable List<String> drops;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerCapabilities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adds = defaults.adds;
    	      this.drops = defaults.drops;
        }

        public Builder adds(@Nullable List<String> adds) {
            this.adds = adds;
            return this;
        }
        public Builder adds(String... adds) {
            return adds(List.of(adds));
        }
        public Builder drops(@Nullable List<String> drops) {
            this.drops = drops;
            return this;
        }
        public Builder drops(String... drops) {
            return drops(List.of(drops));
        }        public ContainerCapabilities build() {
            return new ContainerCapabilities(adds, drops);
        }
    }
}
