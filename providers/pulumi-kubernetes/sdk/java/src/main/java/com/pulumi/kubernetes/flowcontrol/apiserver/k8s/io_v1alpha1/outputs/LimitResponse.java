// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.QueuingConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LimitResponse {
    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    private final @Nullable QueuingConfiguration queuing;
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LimitResponse(
        @CustomType.Parameter("queuing") @Nullable QueuingConfiguration queuing,
        @CustomType.Parameter("type") String type) {
        this.queuing = queuing;
        this.type = type;
    }

    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    public Optional<QueuingConfiguration> queuing() {
        return Optional.ofNullable(this.queuing);
    }
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QueuingConfiguration queuing;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        public Builder queuing(@Nullable QueuingConfiguration queuing) {
            this.queuing = queuing;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LimitResponse build() {
            return new LimitResponse(queuing, type);
        }
    }
}
