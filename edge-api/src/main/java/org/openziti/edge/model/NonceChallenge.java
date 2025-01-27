/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.39
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
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;
import org.openziti.edge.ApiClient;

/** NonceChallenge */
@JsonPropertyOrder({NonceChallenge.JSON_PROPERTY_KEY_ID, NonceChallenge.JSON_PROPERTY_NONCE})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-27T11:11:53.726065456-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class NonceChallenge {
    public static final String JSON_PROPERTY_KEY_ID = "keyId";
    @javax.annotation.Nonnull private String keyId;

    public static final String JSON_PROPERTY_NONCE = "nonce";
    @javax.annotation.Nonnull private UUID nonce;

    public NonceChallenge() {}

    public NonceChallenge keyId(@javax.annotation.Nonnull String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get keyId
     *
     * @return keyId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getKeyId() {
        return keyId;
    }

    @JsonProperty(JSON_PROPERTY_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKeyId(@javax.annotation.Nonnull String keyId) {
        this.keyId = keyId;
    }

    public NonceChallenge nonce(@javax.annotation.Nonnull UUID nonce) {
        this.nonce = nonce;
        return this;
    }

    /**
     * Get nonce
     *
     * @return nonce
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NONCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getNonce() {
        return nonce;
    }

    @JsonProperty(JSON_PROPERTY_NONCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNonce(@javax.annotation.Nonnull UUID nonce) {
        this.nonce = nonce;
    }

    /** Return true if this nonceChallenge object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NonceChallenge nonceChallenge = (NonceChallenge) o;
        return Objects.equals(this.keyId, nonceChallenge.keyId)
                && Objects.equals(this.nonce, nonceChallenge.nonce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, nonce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonceChallenge {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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

        // add `keyId` to the URL query string
        if (getKeyId() != null) {
            joiner.add(
                    String.format(
                            "%skeyId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getKeyId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `nonce` to the URL query string
        if (getNonce() != null) {
            joiner.add(
                    String.format(
                            "%snonce%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getNonce()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
