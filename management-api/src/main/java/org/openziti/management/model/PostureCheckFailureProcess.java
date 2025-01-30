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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.management.ApiClient;
import org.openziti.management.JSON;

/** PostureCheckFailureProcess */
@JsonPropertyOrder({
    PostureCheckFailureProcess.JSON_PROPERTY_ACTUAL_VALUE,
    PostureCheckFailureProcess.JSON_PROPERTY_EXPECTED_VALUE
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
@JsonIgnoreProperties(
        value = "postureCheckType", // ignore manually set postureCheckType, it will be
        // automatically generated by Jackson during serialization
        allowSetters = true // allows the postureCheckType to be set during deserialization
        )
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "postureCheckType",
        visible = true)
public class PostureCheckFailureProcess extends PostureCheckFailure {
    public static final String JSON_PROPERTY_ACTUAL_VALUE = "actualValue";
    @javax.annotation.Nonnull private PostureCheckFailureProcessActual actualValue;

    public static final String JSON_PROPERTY_EXPECTED_VALUE = "expectedValue";
    @javax.annotation.Nonnull private Process expectedValue;

    public PostureCheckFailureProcess() {}

    public PostureCheckFailureProcess actualValue(
            @javax.annotation.Nonnull PostureCheckFailureProcessActual actualValue) {
        this.actualValue = actualValue;
        return this;
    }

    /**
     * Get actualValue
     *
     * @return actualValue
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ACTUAL_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PostureCheckFailureProcessActual getActualValue() {
        return actualValue;
    }

    @JsonProperty(JSON_PROPERTY_ACTUAL_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setActualValue(
            @javax.annotation.Nonnull PostureCheckFailureProcessActual actualValue) {
        this.actualValue = actualValue;
    }

    public PostureCheckFailureProcess expectedValue(
            @javax.annotation.Nonnull Process expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    /**
     * Get expectedValue
     *
     * @return expectedValue
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EXPECTED_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Process getExpectedValue() {
        return expectedValue;
    }

    @JsonProperty(JSON_PROPERTY_EXPECTED_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setExpectedValue(@javax.annotation.Nonnull Process expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public PostureCheckFailureProcess postureCheckId(
            @javax.annotation.Nonnull String postureCheckId) {
        this.setPostureCheckId(postureCheckId);
        return this;
    }

    @Override
    public PostureCheckFailureProcess postureCheckName(
            @javax.annotation.Nonnull String postureCheckName) {
        this.setPostureCheckName(postureCheckName);
        return this;
    }

    @Override
    public PostureCheckFailureProcess postureCheckType(
            @javax.annotation.Nonnull String postureCheckType) {
        this.setPostureCheckType(postureCheckType);
        return this;
    }

    /** Return true if this postureCheckFailureProcess object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureCheckFailureProcess postureCheckFailureProcess = (PostureCheckFailureProcess) o;
        return Objects.equals(this.actualValue, postureCheckFailureProcess.actualValue)
                && Objects.equals(this.expectedValue, postureCheckFailureProcess.expectedValue)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualValue, expectedValue, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureCheckFailureProcess {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    actualValue: ").append(toIndentedString(actualValue)).append("\n");
        sb.append("    expectedValue: ").append(toIndentedString(expectedValue)).append("\n");
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

        // add `postureCheckId` to the URL query string
        if (getPostureCheckId() != null) {
            joiner.add(
                    String.format(
                            "%spostureCheckId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPostureCheckId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `postureCheckName` to the URL query string
        if (getPostureCheckName() != null) {
            joiner.add(
                    String.format(
                            "%spostureCheckName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPostureCheckName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `postureCheckType` to the URL query string
        if (getPostureCheckType() != null) {
            joiner.add(
                    String.format(
                            "%spostureCheckType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPostureCheckType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `actualValue` to the URL query string
        if (getActualValue() != null) {
            joiner.add(getActualValue().toUrlQueryString(prefix + "actualValue" + suffix));
        }

        // add `expectedValue` to the URL query string
        if (getExpectedValue() != null) {
            joiner.add(getExpectedValue().toUrlQueryString(prefix + "expectedValue" + suffix));
        }

        return joiner.toString();
    }

    static {
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("postureCheckFailureProcess", PostureCheckFailureProcess.class);
        JSON.registerDiscriminator(PostureCheckFailureProcess.class, "postureCheckType", mappings);
    }
}
