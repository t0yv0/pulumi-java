// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.outputs;

import com.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupEndpointDetails;
import com.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataflowEndpointGroupResult {
    private final @Nullable String arn;
    private final @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails;
    private final @Nullable String id;
    private final @Nullable List<DataflowEndpointGroupTag> tags;

    @CustomType.Constructor
    private GetDataflowEndpointGroupResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("endpointDetails") @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("tags") @Nullable List<DataflowEndpointGroupTag> tags) {
        this.arn = arn;
        this.endpointDetails = endpointDetails;
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public List<DataflowEndpointGroupEndpointDetails> endpointDetails() {
        return this.endpointDetails == null ? List.of() : this.endpointDetails;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public List<DataflowEndpointGroupTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataflowEndpointGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails;
        private @Nullable String id;
        private @Nullable List<DataflowEndpointGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataflowEndpointGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endpointDetails = defaults.endpointDetails;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder endpointDetails(@Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails) {
            this.endpointDetails = endpointDetails;
            return this;
        }
        public Builder endpointDetails(DataflowEndpointGroupEndpointDetails... endpointDetails) {
            return endpointDetails(List.of(endpointDetails));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder tags(@Nullable List<DataflowEndpointGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DataflowEndpointGroupTag... tags) {
            return tags(List.of(tags));
        }        public GetDataflowEndpointGroupResult build() {
            return new GetDataflowEndpointGroupResult(arn, endpointDetails, id, tags);
        }
    }
}
