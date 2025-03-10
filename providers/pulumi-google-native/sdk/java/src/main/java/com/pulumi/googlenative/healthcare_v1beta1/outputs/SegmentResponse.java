// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SegmentResponse {
    /**
     * @return A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, &#34;hemoglobin&#34;) denotes that the first component of Field 0 has the value &#34;hemoglobin&#34;. * (1.1.2, &#34;CBC&#34;) denotes that the second sub-component of the first component of Field 1 has the value &#34;CBC&#34;. * (1[0].1, &#34;HbA1c&#34;) denotes that the first component of the first Instance of Field 1, which is repeated, has the value &#34;HbA1c&#34;.
     * 
     */
    private final Map<String,String> fields;
    /**
     * @return A string that indicates the type of segment. For example, EVN or PID.
     * 
     */
    private final String segmentId;
    /**
     * @return Set ID for segments that can be in a set. This can be empty if it&#39;s missing or isn&#39;t applicable.
     * 
     */
    private final String setId;

    @CustomType.Constructor
    private SegmentResponse(
        @CustomType.Parameter("fields") Map<String,String> fields,
        @CustomType.Parameter("segmentId") String segmentId,
        @CustomType.Parameter("setId") String setId) {
        this.fields = fields;
        this.segmentId = segmentId;
        this.setId = setId;
    }

    /**
     * @return A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, &#34;hemoglobin&#34;) denotes that the first component of Field 0 has the value &#34;hemoglobin&#34;. * (1.1.2, &#34;CBC&#34;) denotes that the second sub-component of the first component of Field 1 has the value &#34;CBC&#34;. * (1[0].1, &#34;HbA1c&#34;) denotes that the first component of the first Instance of Field 1, which is repeated, has the value &#34;HbA1c&#34;.
     * 
     */
    public Map<String,String> fields() {
        return this.fields;
    }
    /**
     * @return A string that indicates the type of segment. For example, EVN or PID.
     * 
     */
    public String segmentId() {
        return this.segmentId;
    }
    /**
     * @return Set ID for segments that can be in a set. This can be empty if it&#39;s missing or isn&#39;t applicable.
     * 
     */
    public String setId() {
        return this.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fields;
        private String segmentId;
        private String setId;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.segmentId = defaults.segmentId;
    	      this.setId = defaults.setId;
        }

        public Builder fields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder segmentId(String segmentId) {
            this.segmentId = Objects.requireNonNull(segmentId);
            return this;
        }
        public Builder setId(String setId) {
            this.setId = Objects.requireNonNull(setId);
            return this;
        }        public SegmentResponse build() {
            return new SegmentResponse(fields, segmentId, setId);
        }
    }
}
