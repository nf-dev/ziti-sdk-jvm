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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** DetailMfa */
@JsonPropertyOrder({
    DetailMfa.JSON_PROPERTY_LINKS,
    DetailMfa.JSON_PROPERTY_CREATED_AT,
    DetailMfa.JSON_PROPERTY_ID,
    DetailMfa.JSON_PROPERTY_TAGS,
    DetailMfa.JSON_PROPERTY_UPDATED_AT,
    DetailMfa.JSON_PROPERTY_IS_VERIFIED,
    DetailMfa.JSON_PROPERTY_PROVISIONING_URL,
    DetailMfa.JSON_PROPERTY_RECOVERY_CODES
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-09-04T10:11:22.635226-04:00[America/New_York]",
        comments = "Generator version: 7.8.0")
public class DetailMfa {
    public static final String JSON_PROPERTY_LINKS = "_links";
    private Map<String, Link> links = new HashMap<>();

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private Tags tags;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private OffsetDateTime updatedAt;

    public static final String JSON_PROPERTY_IS_VERIFIED = "isVerified";
    private Boolean isVerified;

    public static final String JSON_PROPERTY_PROVISIONING_URL = "provisioningUrl";
    private String provisioningUrl;

    public static final String JSON_PROPERTY_RECOVERY_CODES = "recoveryCodes";
    private List<String> recoveryCodes = new ArrayList<>();

    public DetailMfa() {}

    public DetailMfa links(Map<String, Link> links) {
        this.links = links;
        return this;
    }

    public DetailMfa putLinksItem(String key, Link linksItem) {
        if (this.links == null) {
            this.links = new HashMap<>();
        }
        this.links.put(key, linksItem);
        return this;
    }

    /**
     * A map of named links
     *
     * @return links
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, Link> getLinks() {
        return links;
    }

    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLinks(Map<String, Link> links) {
        this.links = links;
    }

    public DetailMfa createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DetailMfa id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public DetailMfa tags(Tags tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Tags getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public DetailMfa updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DetailMfa isVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get isVerified
     *
     * @return isVerified
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsVerified() {
        return isVerified;
    }

    @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public DetailMfa provisioningUrl(String provisioningUrl) {
        this.provisioningUrl = provisioningUrl;
        return this;
    }

    /**
     * Not provided if MFA verification has been completed
     *
     * @return provisioningUrl
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROVISIONING_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getProvisioningUrl() {
        return provisioningUrl;
    }

    @JsonProperty(JSON_PROPERTY_PROVISIONING_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProvisioningUrl(String provisioningUrl) {
        this.provisioningUrl = provisioningUrl;
    }

    public DetailMfa recoveryCodes(List<String> recoveryCodes) {
        this.recoveryCodes = recoveryCodes;
        return this;
    }

    public DetailMfa addRecoveryCodesItem(String recoveryCodesItem) {
        if (this.recoveryCodes == null) {
            this.recoveryCodes = new ArrayList<>();
        }
        this.recoveryCodes.add(recoveryCodesItem);
        return this;
    }

    /**
     * Not provided if MFA verification has been completed
     *
     * @return recoveryCodes
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_RECOVERY_CODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getRecoveryCodes() {
        return recoveryCodes;
    }

    @JsonProperty(JSON_PROPERTY_RECOVERY_CODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecoveryCodes(List<String> recoveryCodes) {
        this.recoveryCodes = recoveryCodes;
    }

    /** Return true if this detailMfa object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailMfa detailMfa = (DetailMfa) o;
        return Objects.equals(this.links, detailMfa.links)
                && Objects.equals(this.createdAt, detailMfa.createdAt)
                && Objects.equals(this.id, detailMfa.id)
                && Objects.equals(this.tags, detailMfa.tags)
                && Objects.equals(this.updatedAt, detailMfa.updatedAt)
                && Objects.equals(this.isVerified, detailMfa.isVerified)
                && Objects.equals(this.provisioningUrl, detailMfa.provisioningUrl)
                && Objects.equals(this.recoveryCodes, detailMfa.recoveryCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links, createdAt, id, tags, updatedAt, isVerified, provisioningUrl, recoveryCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailMfa {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    provisioningUrl: ").append(toIndentedString(provisioningUrl)).append("\n");
        sb.append("    recoveryCodes: ").append(toIndentedString(recoveryCodes)).append("\n");
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

        // add `_links` to the URL query string
        if (getLinks() != null) {
            for (String _key : getLinks().keySet()) {
                if (getLinks().get(_key) != null) {
                    joiner.add(
                            getLinks()
                                    .get(_key)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%s_links%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    _key,
                                                                    containerSuffix))));
                }
            }
        }

        // add `createdAt` to the URL query string
        if (getCreatedAt() != null) {
            joiner.add(
                    String.format(
                            "%screatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getCreatedAt()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
        }

        // add `updatedAt` to the URL query string
        if (getUpdatedAt() != null) {
            joiner.add(
                    String.format(
                            "%supdatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getUpdatedAt()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isVerified` to the URL query string
        if (getIsVerified() != null) {
            joiner.add(
                    String.format(
                            "%sisVerified%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsVerified()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `provisioningUrl` to the URL query string
        if (getProvisioningUrl() != null) {
            joiner.add(
                    String.format(
                            "%sprovisioningUrl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getProvisioningUrl()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `recoveryCodes` to the URL query string
        if (getRecoveryCodes() != null) {
            for (int i = 0; i < getRecoveryCodes().size(); i++) {
                joiner.add(
                        String.format(
                                "%srecoveryCodes%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(getRecoveryCodes().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
