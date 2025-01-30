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
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.management.ApiClient;

/** PostureChecksFailureMfaValues */
@JsonPropertyOrder({
    PostureChecksFailureMfaValues.JSON_PROPERTY_PASSED_MFA,
    PostureChecksFailureMfaValues.JSON_PROPERTY_PASSED_ON_UNLOCK,
    PostureChecksFailureMfaValues.JSON_PROPERTY_PASSED_ON_WAKE,
    PostureChecksFailureMfaValues.JSON_PROPERTY_TIMED_OUT
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class PostureChecksFailureMfaValues {
    public static final String JSON_PROPERTY_PASSED_MFA = "passedMfa";
    @javax.annotation.Nullable private Boolean passedMfa;

    public static final String JSON_PROPERTY_PASSED_ON_UNLOCK = "passedOnUnlock";
    @javax.annotation.Nullable private Boolean passedOnUnlock;

    public static final String JSON_PROPERTY_PASSED_ON_WAKE = "passedOnWake";
    @javax.annotation.Nullable private Boolean passedOnWake;

    public static final String JSON_PROPERTY_TIMED_OUT = "timedOut";
    @javax.annotation.Nullable private Boolean timedOut;

    public PostureChecksFailureMfaValues() {}

    public PostureChecksFailureMfaValues passedMfa(@javax.annotation.Nullable Boolean passedMfa) {
        this.passedMfa = passedMfa;
        return this;
    }

    /**
     * Get passedMfa
     *
     * @return passedMfa
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PASSED_MFA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPassedMfa() {
        return passedMfa;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_MFA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassedMfa(@javax.annotation.Nullable Boolean passedMfa) {
        this.passedMfa = passedMfa;
    }

    public PostureChecksFailureMfaValues passedOnUnlock(
            @javax.annotation.Nullable Boolean passedOnUnlock) {
        this.passedOnUnlock = passedOnUnlock;
        return this;
    }

    /**
     * Get passedOnUnlock
     *
     * @return passedOnUnlock
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PASSED_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPassedOnUnlock() {
        return passedOnUnlock;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassedOnUnlock(@javax.annotation.Nullable Boolean passedOnUnlock) {
        this.passedOnUnlock = passedOnUnlock;
    }

    public PostureChecksFailureMfaValues passedOnWake(
            @javax.annotation.Nullable Boolean passedOnWake) {
        this.passedOnWake = passedOnWake;
        return this;
    }

    /**
     * Get passedOnWake
     *
     * @return passedOnWake
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PASSED_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPassedOnWake() {
        return passedOnWake;
    }

    @JsonProperty(JSON_PROPERTY_PASSED_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassedOnWake(@javax.annotation.Nullable Boolean passedOnWake) {
        this.passedOnWake = passedOnWake;
    }

    public PostureChecksFailureMfaValues timedOut(@javax.annotation.Nullable Boolean timedOut) {
        this.timedOut = timedOut;
        return this;
    }

    /**
     * Get timedOut
     *
     * @return timedOut
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TIMED_OUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getTimedOut() {
        return timedOut;
    }

    @JsonProperty(JSON_PROPERTY_TIMED_OUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimedOut(@javax.annotation.Nullable Boolean timedOut) {
        this.timedOut = timedOut;
    }

    /** Return true if this postureChecksFailureMfaValues object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureChecksFailureMfaValues postureChecksFailureMfaValues =
                (PostureChecksFailureMfaValues) o;
        return Objects.equals(this.passedMfa, postureChecksFailureMfaValues.passedMfa)
                && Objects.equals(this.passedOnUnlock, postureChecksFailureMfaValues.passedOnUnlock)
                && Objects.equals(this.passedOnWake, postureChecksFailureMfaValues.passedOnWake)
                && Objects.equals(this.timedOut, postureChecksFailureMfaValues.timedOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passedMfa, passedOnUnlock, passedOnWake, timedOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureChecksFailureMfaValues {\n");
        sb.append("    passedMfa: ").append(toIndentedString(passedMfa)).append("\n");
        sb.append("    passedOnUnlock: ").append(toIndentedString(passedOnUnlock)).append("\n");
        sb.append("    passedOnWake: ").append(toIndentedString(passedOnWake)).append("\n");
        sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
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

        // add `timedOut` to the URL query string
        if (getTimedOut() != null) {
            joiner.add(
                    String.format(
                            "%stimedOut%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getTimedOut()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
