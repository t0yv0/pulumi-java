// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExportResult {
    /**
     * @return The exporting_stack_id (AWS ARNs) equivalent `ExportingStackId` from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    private final String exportingStackId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetExportResult(
        @CustomType.Parameter("exportingStackId") String exportingStackId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.exportingStackId = exportingStackId;
        this.id = id;
        this.name = name;
        this.value = value;
    }

    /**
     * @return The exporting_stack_id (AWS ARNs) equivalent `ExportingStackId` from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    public String exportingStackId() {
        return this.exportingStackId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exportingStackId;
        private String id;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportingStackId = defaults.exportingStackId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder exportingStackId(String exportingStackId) {
            this.exportingStackId = Objects.requireNonNull(exportingStackId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetExportResult build() {
            return new GetExportResult(exportingStackId, id, name, value);
        }
    }
}
