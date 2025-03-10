// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetUserAssessmentUserAnalyticsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserAssessmentUserAnalyticsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserAssessmentUserAnalyticsArgs Empty = new GetUserAssessmentUserAnalyticsArgs();

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable String accessLevel;

    /**
     * @return Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * A filter to return only items that match the specified account status.
     * 
     */
    @Import(name="accountStatus")
    private @Nullable String accountStatus;

    /**
     * @return A filter to return only items that match the specified account status.
     * 
     */
    public Optional<String> accountStatus() {
        return Optional.ofNullable(this.accountStatus);
    }

    /**
     * A filter to return only items that match the specified authentication type.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    /**
     * @return A filter to return only items that match the specified authentication type.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    @Import(name="filters")
    private @Nullable List<GetUserAssessmentUserAnalyticsFilter> filters;

    public Optional<List<GetUserAssessmentUserAnalyticsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only items related to a specific target OCID.
     * 
     */
    @Import(name="targetId")
    private @Nullable String targetId;

    /**
     * @return A filter to return only items related to a specific target OCID.
     * 
     */
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    /**
     * A filter to return users whose last login time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeLastLoginGreaterThanOrEqualTo")
    private @Nullable String timeLastLoginGreaterThanOrEqualTo;

    /**
     * @return A filter to return users whose last login time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<String> timeLastLoginGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeLastLoginGreaterThanOrEqualTo);
    }

    /**
     * A filter to return users whose last login time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    @Import(name="timeLastLoginLessThan")
    private @Nullable String timeLastLoginLessThan;

    /**
     * @return A filter to return users whose last login time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    public Optional<String> timeLastLoginLessThan() {
        return Optional.ofNullable(this.timeLastLoginLessThan);
    }

    /**
     * A filter to return users whose last password change in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timePasswordLastChangedGreaterThanOrEqualTo")
    private @Nullable String timePasswordLastChangedGreaterThanOrEqualTo;

    /**
     * @return A filter to return users whose last password change in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<String> timePasswordLastChangedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timePasswordLastChangedGreaterThanOrEqualTo);
    }

    /**
     * A filter to return users whose last password change in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timePasswordLastChangedLessThan")
    private @Nullable String timePasswordLastChangedLessThan;

    /**
     * @return A filter to return users whose last password change in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<String> timePasswordLastChangedLessThan() {
        return Optional.ofNullable(this.timePasswordLastChangedLessThan);
    }

    /**
     * A filter to return users whose creation time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    @Import(name="timeUserCreatedGreaterThanOrEqualTo")
    private @Nullable String timeUserCreatedGreaterThanOrEqualTo;

    /**
     * @return A filter to return users whose creation time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    public Optional<String> timeUserCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeUserCreatedGreaterThanOrEqualTo);
    }

    /**
     * A filter to return users whose creation time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    @Import(name="timeUserCreatedLessThan")
    private @Nullable String timeUserCreatedLessThan;

    /**
     * @return A filter to return users whose creation time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
     * 
     */
    public Optional<String> timeUserCreatedLessThan() {
        return Optional.ofNullable(this.timeUserCreatedLessThan);
    }

    /**
     * The OCID of the user assessment.
     * 
     */
    @Import(name="userAssessmentId", required=true)
    private String userAssessmentId;

    /**
     * @return The OCID of the user assessment.
     * 
     */
    public String userAssessmentId() {
        return this.userAssessmentId;
    }

    /**
     * A filter to return only items that match the specified user category.
     * 
     */
    @Import(name="userCategory")
    private @Nullable String userCategory;

    /**
     * @return A filter to return only items that match the specified user category.
     * 
     */
    public Optional<String> userCategory() {
        return Optional.ofNullable(this.userCategory);
    }

    /**
     * A filter to return only items that match the specified user key.
     * 
     */
    @Import(name="userKey")
    private @Nullable String userKey;

    /**
     * @return A filter to return only items that match the specified user key.
     * 
     */
    public Optional<String> userKey() {
        return Optional.ofNullable(this.userKey);
    }

    /**
     * A filter to return only items that match the specified user name.
     * 
     */
    @Import(name="userName")
    private @Nullable String userName;

    /**
     * @return A filter to return only items that match the specified user name.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    private GetUserAssessmentUserAnalyticsArgs() {}

    private GetUserAssessmentUserAnalyticsArgs(GetUserAssessmentUserAnalyticsArgs $) {
        this.accessLevel = $.accessLevel;
        this.accountStatus = $.accountStatus;
        this.authenticationType = $.authenticationType;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.filters = $.filters;
        this.targetId = $.targetId;
        this.timeLastLoginGreaterThanOrEqualTo = $.timeLastLoginGreaterThanOrEqualTo;
        this.timeLastLoginLessThan = $.timeLastLoginLessThan;
        this.timePasswordLastChangedGreaterThanOrEqualTo = $.timePasswordLastChangedGreaterThanOrEqualTo;
        this.timePasswordLastChangedLessThan = $.timePasswordLastChangedLessThan;
        this.timeUserCreatedGreaterThanOrEqualTo = $.timeUserCreatedGreaterThanOrEqualTo;
        this.timeUserCreatedLessThan = $.timeUserCreatedLessThan;
        this.userAssessmentId = $.userAssessmentId;
        this.userCategory = $.userCategory;
        this.userKey = $.userKey;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserAssessmentUserAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserAssessmentUserAnalyticsArgs $;

        public Builder() {
            $ = new GetUserAssessmentUserAnalyticsArgs();
        }

        public Builder(GetUserAssessmentUserAnalyticsArgs defaults) {
            $ = new GetUserAssessmentUserAnalyticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable String accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accountStatus A filter to return only items that match the specified account status.
         * 
         * @return builder
         * 
         */
        public Builder accountStatus(@Nullable String accountStatus) {
            $.accountStatus = accountStatus;
            return this;
        }

        /**
         * @param authenticationType A filter to return only items that match the specified authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        public Builder filters(@Nullable List<GetUserAssessmentUserAnalyticsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetUserAssessmentUserAnalyticsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param targetId A filter to return only items related to a specific target OCID.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable String targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param timeLastLoginGreaterThanOrEqualTo A filter to return users whose last login time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeLastLoginGreaterThanOrEqualTo(@Nullable String timeLastLoginGreaterThanOrEqualTo) {
            $.timeLastLoginGreaterThanOrEqualTo = timeLastLoginGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeLastLoginLessThan A filter to return users whose last login time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
         * 
         * @return builder
         * 
         */
        public Builder timeLastLoginLessThan(@Nullable String timeLastLoginLessThan) {
            $.timeLastLoginLessThan = timeLastLoginLessThan;
            return this;
        }

        /**
         * @param timePasswordLastChangedGreaterThanOrEqualTo A filter to return users whose last password change in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timePasswordLastChangedGreaterThanOrEqualTo(@Nullable String timePasswordLastChangedGreaterThanOrEqualTo) {
            $.timePasswordLastChangedGreaterThanOrEqualTo = timePasswordLastChangedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timePasswordLastChangedLessThan A filter to return users whose last password change in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timePasswordLastChangedLessThan(@Nullable String timePasswordLastChangedLessThan) {
            $.timePasswordLastChangedLessThan = timePasswordLastChangedLessThan;
            return this;
        }

        /**
         * @param timeUserCreatedGreaterThanOrEqualTo A filter to return users whose creation time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
         * 
         * @return builder
         * 
         */
        public Builder timeUserCreatedGreaterThanOrEqualTo(@Nullable String timeUserCreatedGreaterThanOrEqualTo) {
            $.timeUserCreatedGreaterThanOrEqualTo = timeUserCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeUserCreatedLessThan A filter to return users whose creation time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). **Example:** 2016-12-19T16:39:57.600Z
         * 
         * @return builder
         * 
         */
        public Builder timeUserCreatedLessThan(@Nullable String timeUserCreatedLessThan) {
            $.timeUserCreatedLessThan = timeUserCreatedLessThan;
            return this;
        }

        /**
         * @param userAssessmentId The OCID of the user assessment.
         * 
         * @return builder
         * 
         */
        public Builder userAssessmentId(String userAssessmentId) {
            $.userAssessmentId = userAssessmentId;
            return this;
        }

        /**
         * @param userCategory A filter to return only items that match the specified user category.
         * 
         * @return builder
         * 
         */
        public Builder userCategory(@Nullable String userCategory) {
            $.userCategory = userCategory;
            return this;
        }

        /**
         * @param userKey A filter to return only items that match the specified user key.
         * 
         * @return builder
         * 
         */
        public Builder userKey(@Nullable String userKey) {
            $.userKey = userKey;
            return this;
        }

        /**
         * @param userName A filter to return only items that match the specified user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable String userName) {
            $.userName = userName;
            return this;
        }

        public GetUserAssessmentUserAnalyticsArgs build() {
            $.userAssessmentId = Objects.requireNonNull($.userAssessmentId, "expected parameter 'userAssessmentId' to be non-null");
            return $;
        }
    }

}
