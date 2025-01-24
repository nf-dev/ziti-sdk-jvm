/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.38
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
import java.util.Objects;
import java.util.StringJoiner;

/** IdentityExtendEnrollmentEnvelope */
@JsonPropertyOrder({
    IdentityExtendEnrollmentEnvelope.JSON_PROPERTY_DATA,
    IdentityExtendEnrollmentEnvelope.JSON_PROPERTY_META
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-24T15:38:47.422198133-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class IdentityExtendEnrollmentEnvelope {
    public static final String JSON_PROPERTY_DATA = "data";
    @javax.annotation.Nullable private IdentityExtendCerts data;

    public static final String JSON_PROPERTY_META = "meta";
    @javax.annotation.Nullable private Meta meta;

    public IdentityExtendEnrollmentEnvelope() {}

    public IdentityExtendEnrollmentEnvelope data(
            @javax.annotation.Nullable IdentityExtendCerts data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public IdentityExtendCerts getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(@javax.annotation.Nullable IdentityExtendCerts data) {
        this.data = data;
    }

    public IdentityExtendEnrollmentEnvelope meta(@javax.annotation.Nullable Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(@javax.annotation.Nullable Meta meta) {
        this.meta = meta;
    }

    /** Return true if this identityExtendEnrollmentEnvelope object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityExtendEnrollmentEnvelope identityExtendEnrollmentEnvelope =
                (IdentityExtendEnrollmentEnvelope) o;
        return Objects.equals(this.data, identityExtendEnrollmentEnvelope.data)
                && Objects.equals(this.meta, identityExtendEnrollmentEnvelope.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityExtendEnrollmentEnvelope {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

        // add `data` to the URL query string
        if (getData() != null) {
            joiner.add(getData().toUrlQueryString(prefix + "data" + suffix));
        }

        // add `meta` to the URL query string
        if (getMeta() != null) {
            joiner.add(getMeta().toUrlQueryString(prefix + "meta" + suffix));
        }

        return joiner.toString();
    }
}
