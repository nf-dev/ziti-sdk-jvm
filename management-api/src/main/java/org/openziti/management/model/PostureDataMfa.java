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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.management.ApiClient;

/** PostureDataMfa */
@JsonPropertyOrder({
    PostureDataMfa.JSON_PROPERTY_API_SESSION_ID,
    PostureDataMfa.JSON_PROPERTY_PASSED_AT,
    PostureDataMfa.JSON_PROPERTY_PASSED_MFA,
    PostureDataMfa.JSON_PROPERTY_PASSED_ON_UNLOCK,
    PostureDataMfa.JSON_PROPERTY_PASSED_ON_WAKE
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class PostureDataMfa {
    public static final String JSON_PROPERTY_API_SESSION_ID = "apiSessionId";
    @javax.annotation.Nonnull private String apiSessionId;

    public static final String JSON_PROPERTY_PASSED_AT = "passedAt";
    @javax.annotation.Nonnull private OffsetDateTime passedAt;

    public static final String JSON_PROPERTY_PASSED_MFA = "passedMfa";
    @javax.annotation.Nonnull private Boolean passedMfa;

    public static final String JSON_PROPERTY_PASSED_ON_UNLOCK = "passedOnUnlock";
    @javax.annotation.Nonnull private Boolean passedOnUnlock;

    public static final String JSON_PROPERTY_PASSED_ON_WAKE = "passedOnWake";
    @javax.annotation.Nonnull private Boolean passedOnWake;

    public PostureDataMfa() {}

    public PostureDataMfa apiSessionId(@javax.annotation.Nonnull String apiSessionId) {
        this.apiSessionId = apiSessionId;
        return this;
    }

    /**
     * Get apiSessionId
     *
     * @return apiSessionId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_API_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getApiSessionId() {
        return apiSessionId;
    }

    @JsonProperty(JSON_PROPERTY_API_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setApiSessionId(@javax.annotation.Nonnull String apiSessionId) {
        this.apiSessionId = apiSessionId;
    }

    public PostureDataMfa passedAt(@javax.annotation.Nonnull OffsetDateTime passedAt) {
        this.passedAt = passedAt;
        return this;
    }

    /**
     * Get passedAt
     *
     * @return passedAt
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PASSED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getPassedAt() {
        return passedAt;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPassedAt(@javax.annotation.Nonnull OffsetDateTime passedAt) {
        this.passedAt = passedAt;
    }

    public PostureDataMfa passedMfa(@javax.annotation.Nonnull Boolean passedMfa) {
        this.passedMfa = passedMfa;
        return this;
    }

    /**
     * Get passedMfa
     *
     * @return passedMfa
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PASSED_MFA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getPassedMfa() {
        return passedMfa;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_MFA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPassedMfa(@javax.annotation.Nonnull Boolean passedMfa) {
        this.passedMfa = passedMfa;
    }

    public PostureDataMfa passedOnUnlock(@javax.annotation.Nonnull Boolean passedOnUnlock) {
        this.passedOnUnlock = passedOnUnlock;
        return this;
    }

    /**
     * Get passedOnUnlock
     *
     * @return passedOnUnlock
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PASSED_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getPassedOnUnlock() {
        return passedOnUnlock;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPassedOnUnlock(@javax.annotation.Nonnull Boolean passedOnUnlock) {
        this.passedOnUnlock = passedOnUnlock;
    }

    public PostureDataMfa passedOnWake(@javax.annotation.Nonnull Boolean passedOnWake) {
        this.passedOnWake = passedOnWake;
        return this;
    }

    /**
     * Get passedOnWake
     *
     * @return passedOnWake
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PASSED_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getPassedOnWake() {
        return passedOnWake;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPassedOnWake(@javax.annotation.Nonnull Boolean passedOnWake) {
        this.passedOnWake = passedOnWake;
    }

    /** Return true if this postureDataMfa object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureDataMfa postureDataMfa = (PostureDataMfa) o;
        return Objects.equals(this.apiSessionId, postureDataMfa.apiSessionId)
                && Objects.equals(this.passedAt, postureDataMfa.passedAt)
                && Objects.equals(this.passedMfa, postureDataMfa.passedMfa)
                && Objects.equals(this.passedOnUnlock, postureDataMfa.passedOnUnlock)
                && Objects.equals(this.passedOnWake, postureDataMfa.passedOnWake);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiSessionId, passedAt, passedMfa, passedOnUnlock, passedOnWake);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureDataMfa {\n");
        sb.append("    apiSessionId: ").append(toIndentedString(apiSessionId)).append("\n");
        sb.append("    passedAt: ").append(toIndentedString(passedAt)).append("\n");
        sb.append("    passedMfa: ").append(toIndentedString(passedMfa)).append("\n");
        sb.append("    passedOnUnlock: ").append(toIndentedString(passedOnUnlock)).append("\n");
        sb.append("    passedOnWake: ").append(toIndentedString(passedOnWake)).append("\n");
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

        // add `apiSessionId` to the URL query string
        if (getApiSessionId() != null) {
            joiner.add(
                    String.format(
                            "%sapiSessionId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getApiSessionId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `passedAt` to the URL query string
        if (getPassedAt() != null) {
            joiner.add(
                    String.format(
                            "%spassedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPassedAt()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `passedMfa` to the URL query string
        if (getPassedMfa() != null) {
            joiner.add(
                    String.format(
                            "%spassedMfa%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPassedMfa()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `passedOnUnlock` to the URL query string
        if (getPassedOnUnlock() != null) {
            joiner.add(
                    String.format(
                            "%spassedOnUnlock%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPassedOnUnlock()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `passedOnWake` to the URL query string
        if (getPassedOnWake() != null) {
            joiner.add(
                    String.format(
                            "%spassedOnWake%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPassedOnWake()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
