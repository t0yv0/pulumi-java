// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPartitionResult {
    /**
     * @return Optional. The etag for this partition.
     * 
     */
    private final String etag;
    /**
     * @return Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
     * 
     */
    private final String location;
    /**
     * @return Partition values used in the HTTP URL must be double encoded. For example, url_encode(url_encode(value)) can be used to encode &#34;US:CA/CA#Sunnyvale so that the request URL ends with &#34;/partitions/US%253ACA/CA%2523Sunnyvale&#34;. The name field in the response retains the encoded format.
     * 
     */
    private final String name;
    /**
     * @return Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetPartitionResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.etag = etag;
        this.location = location;
        this.name = name;
        this.values = values;
    }

    /**
     * @return Optional. The etag for this partition.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Partition values used in the HTTP URL must be double encoded. For example, url_encode(url_encode(value)) can be used to encode &#34;US:CA/CA#Sunnyvale so that the request URL ends with &#34;/partitions/US%253ACA/CA%2523Sunnyvale&#34;. The name field in the response retains the encoded format.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String location;
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetPartitionResult build() {
            return new GetPartitionResult(etag, location, name, values);
        }
    }
}
