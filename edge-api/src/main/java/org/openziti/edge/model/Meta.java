/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.27
 * Contact: help@openziti.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openziti.edge.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** Meta */
@JsonPropertyOrder({
    Meta.JSON_PROPERTY_API_ENROLLMENT_VERSION,
    Meta.JSON_PROPERTY_API_VERSION,
    Meta.JSON_PROPERTY_FILTERABLE_FIELDS,
    Meta.JSON_PROPERTY_PAGINATION
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-09-04T10:11:22.635226-04:00[America/New_York]",
        comments = "Generator version: 7.8.0")
public class Meta {
    public static final String JSON_PROPERTY_API_ENROLLMENT_VERSION = "apiEnrollmentVersion";
    private String apiEnrollmentVersion;

    public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
    private String apiVersion;

    public static final String JSON_PROPERTY_FILTERABLE_FIELDS = "filterableFields";
    private List<String> filterableFields = new ArrayList<>();

    public static final String JSON_PROPERTY_PAGINATION = "pagination";
    private Pagination pagination;

    public Meta() {}

    public Meta apiEnrollmentVersion(String apiEnrollmentVersion) {
        this.apiEnrollmentVersion = apiEnrollmentVersion;
        return this;
    }

    /**
     * Get apiEnrollmentVersion
     *
     * @return apiEnrollmentVersion
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_API_ENROLLMENT_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getApiEnrollmentVersion() {
        return apiEnrollmentVersion;
    }

    @JsonProperty(JSON_PROPERTY_API_ENROLLMENT_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApiEnrollmentVersion(String apiEnrollmentVersion) {
        this.apiEnrollmentVersion = apiEnrollmentVersion;
    }

    public Meta apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get apiVersion
     *
     * @return apiVersion
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty(JSON_PROPERTY_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Meta filterableFields(List<String> filterableFields) {
        this.filterableFields = filterableFields;
        return this;
    }

    public Meta addFilterableFieldsItem(String filterableFieldsItem) {
        if (this.filterableFields == null) {
            this.filterableFields = new ArrayList<>();
        }
        this.filterableFields.add(filterableFieldsItem);
        return this;
    }

    /**
     * Get filterableFields
     *
     * @return filterableFields
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FILTERABLE_FIELDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFilterableFields() {
        return filterableFields;
    }

    @JsonProperty(JSON_PROPERTY_FILTERABLE_FIELDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFilterableFields(List<String> filterableFields) {
        this.filterableFields = filterableFields;
    }

    public Meta pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PAGINATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty(JSON_PROPERTY_PAGINATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /** Return true if this meta object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Meta meta = (Meta) o;
        return Objects.equals(this.apiEnrollmentVersion, meta.apiEnrollmentVersion)
                && Objects.equals(this.apiVersion, meta.apiVersion)
                && Objects.equals(this.filterableFields, meta.filterableFields)
                && Objects.equals(this.pagination, meta.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiEnrollmentVersion, apiVersion, filterableFields, pagination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Meta {\n");
        sb.append("    apiEnrollmentVersion: ")
                .append(toIndentedString(apiEnrollmentVersion))
                .append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    filterableFields: ").append(toIndentedString(filterableFields)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

        // add `apiEnrollmentVersion` to the URL query string
        if (getApiEnrollmentVersion() != null) {
            joiner.add(
                    String.format(
                            "%sapiEnrollmentVersion%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getApiEnrollmentVersion()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `apiVersion` to the URL query string
        if (getApiVersion() != null) {
            joiner.add(
                    String.format(
                            "%sapiVersion%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getApiVersion()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `filterableFields` to the URL query string
        if (getFilterableFields() != null) {
            for (int i = 0; i < getFilterableFields().size(); i++) {
                joiner.add(
                        String.format(
                                "%sfilterableFields%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(
                                                        getFilterableFields().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `pagination` to the URL query string
        if (getPagination() != null) {
            joiner.add(getPagination().toUrlQueryString(prefix + "pagination" + suffix));
        }

        return joiner.toString();
    }
}
