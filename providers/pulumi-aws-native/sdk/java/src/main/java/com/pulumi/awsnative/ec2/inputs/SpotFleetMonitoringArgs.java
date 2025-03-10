// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetMonitoringArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetMonitoringArgs Empty = new SpotFleetMonitoringArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private SpotFleetMonitoringArgs() {}

    private SpotFleetMonitoringArgs(SpotFleetMonitoringArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetMonitoringArgs $;

        public Builder() {
            $ = new SpotFleetMonitoringArgs();
        }

        public Builder(SpotFleetMonitoringArgs defaults) {
            $ = new SpotFleetMonitoringArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SpotFleetMonitoringArgs build() {
            return $;
        }
    }

}
