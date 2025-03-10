// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaIntervalResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse {
    /**
     * @return Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    private final List<String> contains;
    /**
     * @return Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    private final List<GoogleCloudRetailV2alphaIntervalResponse> intervals;
    /**
     * @return Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
     * 
     */
    private final String key;
    /**
     * @return The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    private final String orderBy;
    /**
     * @return Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    private final List<String> prefixes;
    /**
     * @return The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
     * 
     */
    private final String query;
    /**
     * @return Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    private final List<String> restrictedValues;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse(
        @CustomType.Parameter("contains") List<String> contains,
        @CustomType.Parameter("intervals") List<GoogleCloudRetailV2alphaIntervalResponse> intervals,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("orderBy") String orderBy,
        @CustomType.Parameter("prefixes") List<String> prefixes,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("restrictedValues") List<String> restrictedValues) {
        this.contains = contains;
        this.intervals = intervals;
        this.key = key;
        this.orderBy = orderBy;
        this.prefixes = prefixes;
        this.query = query;
        this.restrictedValues = restrictedValues;
    }

    /**
     * @return Only get facet values that contains the given strings. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;contains&#34; to &#34;Shoe&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Men &gt; Shoe&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    public List<String> contains() {
        return this.contains;
    }
    /**
     * @return Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    public List<GoogleCloudRetailV2alphaIntervalResponse> intervals() {
        return this.intervals;
    }
    /**
     * @return Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * &#34;brands&#34; * &#34;categories&#34; * &#34;genders&#34; * &#34;ageGroups&#34; * &#34;availability&#34; * &#34;colorFamilies&#34; * &#34;colors&#34; * &#34;sizes&#34; * &#34;materials&#34; * &#34;patterns&#34; * &#34;conditions&#34; * &#34;attributes.key&#34; * &#34;pickupInStore&#34; * &#34;shipToStore&#34; * &#34;sameDayDelivery&#34; * &#34;nextDayDelivery&#34; * &#34;customFulfillment1&#34; * &#34;customFulfillment2&#34; * &#34;customFulfillment3&#34; * &#34;customFulfillment4&#34; * &#34;customFulfillment5&#34; * &#34;inventory(place_id,attributes.key)&#34; * numerical_field = * &#34;price&#34; * &#34;discount&#34; * &#34;rating&#34; * &#34;ratingCount&#34; * &#34;attributes.key&#34; * &#34;inventory(place_id,price)&#34; * &#34;inventory(place_id,original_price)&#34; * &#34;inventory(place_id,attributes.key)&#34;
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The order in which Facet.values are returned. Allowed values are: * &#34;count desc&#34;, which means order by Facet.FacetValue.count descending. * &#34;value desc&#34;, which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    public String orderBy() {
        return this.orderBy;
    }
    /**
     * @return Only get facet values that start with the given string prefix. For example, suppose &#34;categories&#34; has three values &#34;Women &gt; Shoe&#34;, &#34;Women &gt; Dress&#34; and &#34;Men &gt; Shoe&#34;. If set &#34;prefixes&#34; to &#34;Women&#34;, the &#34;categories&#34; facet will give only &#34;Women &gt; Shoe&#34; and &#34;Women &gt; Dress&#34;. Only supported on textual fields. Maximum is 10.
     * 
     */
    public List<String> prefixes() {
        return this.prefixes;
    }
    /**
     * @return The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always &#34;1&#34; and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for &#34;shipToStore&#34;, where FacetKey.key is &#34;customizedShipToStore&#34;, and FacetKey.query is &#34;availability: ANY(\&#34;IN_STOCK\&#34;) AND shipToStore: ANY(\&#34;123\&#34;)&#34;. Then the facet will count the products that are both in stock and ship to store &#34;123&#34;.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return Only get facet for the given restricted values. For example, when using &#34;pickupInStore&#34; as key and set restricted values to [&#34;store123&#34;, &#34;store456&#34;], only facets for &#34;store123&#34; and &#34;store456&#34; are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    public List<String> restrictedValues() {
        return this.restrictedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contains;
        private List<GoogleCloudRetailV2alphaIntervalResponse> intervals;
        private String key;
        private String orderBy;
        private List<String> prefixes;
        private String query;
        private List<String> restrictedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.intervals = defaults.intervals;
    	      this.key = defaults.key;
    	      this.orderBy = defaults.orderBy;
    	      this.prefixes = defaults.prefixes;
    	      this.query = defaults.query;
    	      this.restrictedValues = defaults.restrictedValues;
        }

        public Builder contains(List<String> contains) {
            this.contains = Objects.requireNonNull(contains);
            return this;
        }
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }
        public Builder intervals(List<GoogleCloudRetailV2alphaIntervalResponse> intervals) {
            this.intervals = Objects.requireNonNull(intervals);
            return this;
        }
        public Builder intervals(GoogleCloudRetailV2alphaIntervalResponse... intervals) {
            return intervals(List.of(intervals));
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder orderBy(String orderBy) {
            this.orderBy = Objects.requireNonNull(orderBy);
            return this;
        }
        public Builder prefixes(List<String> prefixes) {
            this.prefixes = Objects.requireNonNull(prefixes);
            return this;
        }
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder restrictedValues(List<String> restrictedValues) {
            this.restrictedValues = Objects.requireNonNull(restrictedValues);
            return this;
        }
        public Builder restrictedValues(String... restrictedValues) {
            return restrictedValues(List.of(restrictedValues));
        }        public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse(contains, intervals, key, orderBy, prefixes, query, restrictedValues);
        }
    }
}
