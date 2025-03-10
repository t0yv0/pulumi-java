// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AzureIaaSVMHealthDetailsResponse {
    /**
     * @return Health Code
     * 
     */
    private final Integer code;
    /**
     * @return Health Message
     * 
     */
    private final String message;
    /**
     * @return Health Recommended Actions
     * 
     */
    private final List<String> recommendations;
    /**
     * @return Health Title
     * 
     */
    private final String title;

    @CustomType.Constructor
    private AzureIaaSVMHealthDetailsResponse(
        @CustomType.Parameter("code") Integer code,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("recommendations") List<String> recommendations,
        @CustomType.Parameter("title") String title) {
        this.code = code;
        this.message = message;
        this.recommendations = recommendations;
        this.title = title;
    }

    /**
     * @return Health Code
     * 
     */
    public Integer code() {
        return this.code;
    }
    /**
     * @return Health Message
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Health Recommended Actions
     * 
     */
    public List<String> recommendations() {
        return this.recommendations;
    }
    /**
     * @return Health Title
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private String message;
        private List<String> recommendations;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.recommendations = defaults.recommendations;
    	      this.title = defaults.title;
        }

        public Builder code(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder recommendations(List<String> recommendations) {
            this.recommendations = Objects.requireNonNull(recommendations);
            return this;
        }
        public Builder recommendations(String... recommendations) {
            return recommendations(List.of(recommendations));
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public AzureIaaSVMHealthDetailsResponse build() {
            return new AzureIaaSVMHealthDetailsResponse(code, message, recommendations, title);
        }
    }
}
