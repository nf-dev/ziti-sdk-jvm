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

/** PostureCheckMfaProperties */
@JsonPropertyOrder({
    PostureCheckMfaProperties.JSON_PROPERTY_IGNORE_LEGACY_ENDPOINTS,
    PostureCheckMfaProperties.JSON_PROPERTY_PROMPT_ON_UNLOCK,
    PostureCheckMfaProperties.JSON_PROPERTY_PROMPT_ON_WAKE,
    PostureCheckMfaProperties.JSON_PROPERTY_TIMEOUT_SECONDS
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class PostureCheckMfaProperties {
    public static final String JSON_PROPERTY_IGNORE_LEGACY_ENDPOINTS = "ignoreLegacyEndpoints";
    @javax.annotation.Nullable private Boolean ignoreLegacyEndpoints;

    public static final String JSON_PROPERTY_PROMPT_ON_UNLOCK = "promptOnUnlock";
    @javax.annotation.Nullable private Boolean promptOnUnlock;

    public static final String JSON_PROPERTY_PROMPT_ON_WAKE = "promptOnWake";
    @javax.annotation.Nullable private Boolean promptOnWake;

    public static final String JSON_PROPERTY_TIMEOUT_SECONDS = "timeoutSeconds";
    @javax.annotation.Nullable private Integer timeoutSeconds;

    public PostureCheckMfaProperties() {}

    public PostureCheckMfaProperties ignoreLegacyEndpoints(
            @javax.annotation.Nullable Boolean ignoreLegacyEndpoints) {
        this.ignoreLegacyEndpoints = ignoreLegacyEndpoints;
        return this;
    }

    /**
     * Get ignoreLegacyEndpoints
     *
     * @return ignoreLegacyEndpoints
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_IGNORE_LEGACY_ENDPOINTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIgnoreLegacyEndpoints() {
        return ignoreLegacyEndpoints;
    }

    @JsonProperty(JSON_PROPERTY_IGNORE_LEGACY_ENDPOINTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIgnoreLegacyEndpoints(@javax.annotation.Nullable Boolean ignoreLegacyEndpoints) {
        this.ignoreLegacyEndpoints = ignoreLegacyEndpoints;
    }

    public PostureCheckMfaProperties promptOnUnlock(
            @javax.annotation.Nullable Boolean promptOnUnlock) {
        this.promptOnUnlock = promptOnUnlock;
        return this;
    }

    /**
     * Get promptOnUnlock
     *
     * @return promptOnUnlock
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROMPT_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPromptOnUnlock() {
        return promptOnUnlock;
    }

    @JsonProperty(JSON_PROPERTY_PROMPT_ON_UNLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPromptOnUnlock(@javax.annotation.Nullable Boolean promptOnUnlock) {
        this.promptOnUnlock = promptOnUnlock;
    }

    public PostureCheckMfaProperties promptOnWake(@javax.annotation.Nullable Boolean promptOnWake) {
        this.promptOnWake = promptOnWake;
        return this;
    }

    /**
     * Get promptOnWake
     *
     * @return promptOnWake
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROMPT_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPromptOnWake() {
        return promptOnWake;
    }

    @JsonProperty(JSON_PROPERTY_PROMPT_ON_WAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPromptOnWake(@javax.annotation.Nullable Boolean promptOnWake) {
        this.promptOnWake = promptOnWake;
    }

    public PostureCheckMfaProperties timeoutSeconds(
            @javax.annotation.Nullable Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Get timeoutSeconds
     *
     * @return timeoutSeconds
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TIMEOUT_SECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    @JsonProperty(JSON_PROPERTY_TIMEOUT_SECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimeoutSeconds(@javax.annotation.Nullable Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /** Return true if this postureCheckMfaProperties object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureCheckMfaProperties postureCheckMfaProperties = (PostureCheckMfaProperties) o;
        return Objects.equals(
                        this.ignoreLegacyEndpoints, postureCheckMfaProperties.ignoreLegacyEndpoints)
                && Objects.equals(this.promptOnUnlock, postureCheckMfaProperties.promptOnUnlock)
                && Objects.equals(this.promptOnWake, postureCheckMfaProperties.promptOnWake)
                && Objects.equals(this.timeoutSeconds, postureCheckMfaProperties.timeoutSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignoreLegacyEndpoints, promptOnUnlock, promptOnWake, timeoutSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureCheckMfaProperties {\n");
        sb.append("    ignoreLegacyEndpoints: ")
                .append(toIndentedString(ignoreLegacyEndpoints))
                .append("\n");
        sb.append("    promptOnUnlock: ").append(toIndentedString(promptOnUnlock)).append("\n");
        sb.append("    promptOnWake: ").append(toIndentedString(promptOnWake)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

        // add `ignoreLegacyEndpoints` to the URL query string
        if (getIgnoreLegacyEndpoints() != null) {
            joiner.add(
                    String.format(
                            "%signoreLegacyEndpoints%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIgnoreLegacyEndpoints()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `promptOnUnlock` to the URL query string
        if (getPromptOnUnlock() != null) {
            joiner.add(
                    String.format(
                            "%spromptOnUnlock%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPromptOnUnlock()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `promptOnWake` to the URL query string
        if (getPromptOnWake() != null) {
            joiner.add(
                    String.format(
                            "%spromptOnWake%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPromptOnWake()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `timeoutSeconds` to the URL query string
        if (getTimeoutSeconds() != null) {
            joiner.add(
                    String.format(
                            "%stimeoutSeconds%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getTimeoutSeconds()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
