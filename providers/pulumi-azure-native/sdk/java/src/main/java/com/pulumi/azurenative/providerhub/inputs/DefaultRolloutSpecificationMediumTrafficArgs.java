// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationMediumTrafficArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutSpecificationMediumTrafficArgs Empty = new DefaultRolloutSpecificationMediumTrafficArgs();

    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    @Import(name="waitDuration")
    private @Nullable Output<String> waitDuration;

    public Optional<Output<String>> waitDuration() {
        return Optional.ofNullable(this.waitDuration);
    }

    private DefaultRolloutSpecificationMediumTrafficArgs() {}

    private DefaultRolloutSpecificationMediumTrafficArgs(DefaultRolloutSpecificationMediumTrafficArgs $) {
        this.regions = $.regions;
        this.waitDuration = $.waitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRolloutSpecificationMediumTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRolloutSpecificationMediumTrafficArgs $;

        public Builder() {
            $ = new DefaultRolloutSpecificationMediumTrafficArgs();
        }

        public Builder(DefaultRolloutSpecificationMediumTrafficArgs defaults) {
            $ = new DefaultRolloutSpecificationMediumTrafficArgs(Objects.requireNonNull(defaults));
        }

        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder waitDuration(@Nullable Output<String> waitDuration) {
            $.waitDuration = waitDuration;
            return this;
        }

        public Builder waitDuration(String waitDuration) {
            return waitDuration(Output.of(waitDuration));
        }

        public DefaultRolloutSpecificationMediumTrafficArgs build() {
            return $;
        }
    }

}
