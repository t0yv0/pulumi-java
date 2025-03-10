// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TargetOSInfoResponse {
    /**
     * @return Specifies the OS update type to test against, e.g., &#39;Security updates&#39; or &#39;Feature updates&#39;.
     * 
     */
    private final String osUpdateType;
    /**
     * @return Specifies the target OSs to be tested.
     * 
     */
    private final List<String> targetOSs;

    @CustomType.Constructor
    private TargetOSInfoResponse(
        @CustomType.Parameter("osUpdateType") String osUpdateType,
        @CustomType.Parameter("targetOSs") List<String> targetOSs) {
        this.osUpdateType = osUpdateType;
        this.targetOSs = targetOSs;
    }

    /**
     * @return Specifies the OS update type to test against, e.g., &#39;Security updates&#39; or &#39;Feature updates&#39;.
     * 
     */
    public String osUpdateType() {
        return this.osUpdateType;
    }
    /**
     * @return Specifies the target OSs to be tested.
     * 
     */
    public List<String> targetOSs() {
        return this.targetOSs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetOSInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osUpdateType;
        private List<String> targetOSs;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetOSInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osUpdateType = defaults.osUpdateType;
    	      this.targetOSs = defaults.targetOSs;
        }

        public Builder osUpdateType(String osUpdateType) {
            this.osUpdateType = Objects.requireNonNull(osUpdateType);
            return this;
        }
        public Builder targetOSs(List<String> targetOSs) {
            this.targetOSs = Objects.requireNonNull(targetOSs);
            return this;
        }
        public Builder targetOSs(String... targetOSs) {
            return targetOSs(List.of(targetOSs));
        }        public TargetOSInfoResponse build() {
            return new TargetOSInfoResponse(osUpdateType, targetOSs);
        }
    }
}
