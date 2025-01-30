/*
 * Ziti Edge Management
 * OpenZiti Edge Management API
 *
 * The version of the OpenAPI document: 0.26.39
 * Contact: help@openziti.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openziti.management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.management.ApiClient;

/** PostureQueries */
@JsonPropertyOrder({
    PostureQueries.JSON_PROPERTY_IS_PASSING,
    PostureQueries.JSON_PROPERTY_POLICY_ID,
    PostureQueries.JSON_PROPERTY_POLICY_TYPE,
    PostureQueries.JSON_PROPERTY_POSTURE_QUERIES
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class PostureQueries {
    public static final String JSON_PROPERTY_IS_PASSING = "isPassing";
    @javax.annotation.Nonnull private Boolean isPassing;

    public static final String JSON_PROPERTY_POLICY_ID = "policyId";
    @javax.annotation.Nonnull private String policyId;

    public static final String JSON_PROPERTY_POLICY_TYPE = "policyType";
    @javax.annotation.Nullable private DialBind policyType;

    public static final String JSON_PROPERTY_POSTURE_QUERIES = "postureQueries";
    @javax.annotation.Nonnull private List<PostureQuery> postureQueries = new ArrayList<>();

    public PostureQueries() {}

    public PostureQueries isPassing(@javax.annotation.Nonnull Boolean isPassing) {
        this.isPassing = isPassing;
        return this;
    }

    /**
     * Get isPassing
     *
     * @return isPassing
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_PASSING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsPassing() {
        return isPassing;
    }

    @JsonProperty(JSON_PROPERTY_IS_PASSING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsPassing(@javax.annotation.Nonnull Boolean isPassing) {
        this.isPassing = isPassing;
    }

    public PostureQueries policyId(@javax.annotation.Nonnull String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get policyId
     *
     * @return policyId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPolicyId() {
        return policyId;
    }

    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPolicyId(@javax.annotation.Nonnull String policyId) {
        this.policyId = policyId;
    }

    public PostureQueries policyType(@javax.annotation.Nullable DialBind policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get policyType
     *
     * @return policyType
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DialBind getPolicyType() {
        return policyType;
    }

    @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyType(@javax.annotation.Nullable DialBind policyType) {
        this.policyType = policyType;
    }

    public PostureQueries postureQueries(
            @javax.annotation.Nonnull List<PostureQuery> postureQueries) {
        this.postureQueries = postureQueries;
        return this;
    }

    public PostureQueries addPostureQueriesItem(PostureQuery postureQueriesItem) {
        if (this.postureQueries == null) {
            this.postureQueries = new ArrayList<>();
        }
        this.postureQueries.add(postureQueriesItem);
        return this;
    }

    /**
     * Get postureQueries
     *
     * @return postureQueries
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_POSTURE_QUERIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<PostureQuery> getPostureQueries() {
        return postureQueries;
    }

    @JsonProperty(JSON_PROPERTY_POSTURE_QUERIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPostureQueries(@javax.annotation.Nonnull List<PostureQuery> postureQueries) {
        this.postureQueries = postureQueries;
    }

    /** Return true if this postureQueries object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureQueries postureQueries = (PostureQueries) o;
        return Objects.equals(this.isPassing, postureQueries.isPassing)
                && Objects.equals(this.policyId, postureQueries.policyId)
                && Objects.equals(this.policyType, postureQueries.policyType)
                && Objects.equals(this.postureQueries, postureQueries.postureQueries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPassing, policyId, policyType, postureQueries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureQueries {\n");
        sb.append("    isPassing: ").append(toIndentedString(isPassing)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    postureQueries: ").append(toIndentedString(postureQueries)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `isPassing` to the URL query string
        if (getIsPassing() != null) {
            joiner.add(
                    String.format(
                            "%sisPassing%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsPassing()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `policyId` to the URL query string
        if (getPolicyId() != null) {
            joiner.add(
                    String.format(
                            "%spolicyId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPolicyId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `policyType` to the URL query string
        if (getPolicyType() != null) {
            joiner.add(
                    String.format(
                            "%spolicyType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPolicyType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `postureQueries` to the URL query string
        if (getPostureQueries() != null) {
            for (int i = 0; i < getPostureQueries().size(); i++) {
                if (getPostureQueries().get(i) != null) {
                    joiner.add(
                            getPostureQueries()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%spostureQueries%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
