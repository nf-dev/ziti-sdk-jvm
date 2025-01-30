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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.management.ApiClient;

/** An API Session object */
@JsonPropertyOrder({
    ApiSessionDetail.JSON_PROPERTY_LINKS,
    ApiSessionDetail.JSON_PROPERTY_CREATED_AT,
    ApiSessionDetail.JSON_PROPERTY_ID,
    ApiSessionDetail.JSON_PROPERTY_TAGS,
    ApiSessionDetail.JSON_PROPERTY_UPDATED_AT,
    ApiSessionDetail.JSON_PROPERTY_AUTH_QUERIES,
    ApiSessionDetail.JSON_PROPERTY_AUTHENTICATOR_ID,
    ApiSessionDetail.JSON_PROPERTY_CACHED_LAST_ACTIVITY_AT,
    ApiSessionDetail.JSON_PROPERTY_CONFIG_TYPES,
    ApiSessionDetail.JSON_PROPERTY_IDENTITY,
    ApiSessionDetail.JSON_PROPERTY_IDENTITY_ID,
    ApiSessionDetail.JSON_PROPERTY_IP_ADDRESS,
    ApiSessionDetail.JSON_PROPERTY_IS_CERT_EXTENDABLE,
    ApiSessionDetail.JSON_PROPERTY_IS_MFA_COMPLETE,
    ApiSessionDetail.JSON_PROPERTY_IS_MFA_REQUIRED,
    ApiSessionDetail.JSON_PROPERTY_LAST_ACTIVITY_AT,
    ApiSessionDetail.JSON_PROPERTY_TOKEN
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class ApiSessionDetail {
    public static final String JSON_PROPERTY_LINKS = "_links";
    @javax.annotation.Nonnull private Map<String, Link> links = new HashMap<>();

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    @javax.annotation.Nonnull private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_ID = "id";
    @javax.annotation.Nonnull private String id;

    public static final String JSON_PROPERTY_TAGS = "tags";
    @javax.annotation.Nullable private Tags tags;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    @javax.annotation.Nonnull private OffsetDateTime updatedAt;

    public static final String JSON_PROPERTY_AUTH_QUERIES = "authQueries";
    @javax.annotation.Nonnull private List<AuthQueryDetail> authQueries = new ArrayList<>();

    public static final String JSON_PROPERTY_AUTHENTICATOR_ID = "authenticatorId";
    @javax.annotation.Nonnull private String authenticatorId;

    public static final String JSON_PROPERTY_CACHED_LAST_ACTIVITY_AT = "cachedLastActivityAt";
    @javax.annotation.Nullable private OffsetDateTime cachedLastActivityAt;

    public static final String JSON_PROPERTY_CONFIG_TYPES = "configTypes";
    @javax.annotation.Nonnull private List<String> configTypes = new ArrayList<>();

    public static final String JSON_PROPERTY_IDENTITY = "identity";
    @javax.annotation.Nonnull private EntityRef identity;

    public static final String JSON_PROPERTY_IDENTITY_ID = "identityId";
    @javax.annotation.Nonnull private String identityId;

    public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
    @javax.annotation.Nonnull private String ipAddress;

    public static final String JSON_PROPERTY_IS_CERT_EXTENDABLE = "isCertExtendable";
    @javax.annotation.Nonnull private Boolean isCertExtendable;

    public static final String JSON_PROPERTY_IS_MFA_COMPLETE = "isMfaComplete";
    @javax.annotation.Nonnull private Boolean isMfaComplete;

    public static final String JSON_PROPERTY_IS_MFA_REQUIRED = "isMfaRequired";
    @javax.annotation.Nonnull private Boolean isMfaRequired;

    public static final String JSON_PROPERTY_LAST_ACTIVITY_AT = "lastActivityAt";
    @javax.annotation.Nullable private OffsetDateTime lastActivityAt;

    public static final String JSON_PROPERTY_TOKEN = "token";
    @javax.annotation.Nonnull private String token;

    public ApiSessionDetail() {}

    public ApiSessionDetail links(@javax.annotation.Nonnull Map<String, Link> links) {
        this.links = links;
        return this;
    }

    public ApiSessionDetail putLinksItem(String key, Link linksItem) {
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
    public void setLinks(@javax.annotation.Nonnull Map<String, Link> links) {
        this.links = links;
    }

    public ApiSessionDetail createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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
    public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ApiSessionDetail id(@javax.annotation.Nonnull String id) {
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
    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public ApiSessionDetail tags(@javax.annotation.Nullable Tags tags) {
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
    public void setTags(@javax.annotation.Nullable Tags tags) {
        this.tags = tags;
    }

    public ApiSessionDetail updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
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
    public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ApiSessionDetail authQueries(
            @javax.annotation.Nonnull List<AuthQueryDetail> authQueries) {
        this.authQueries = authQueries;
        return this;
    }

    public ApiSessionDetail addAuthQueriesItem(AuthQueryDetail authQueriesItem) {
        if (this.authQueries == null) {
            this.authQueries = new ArrayList<>();
        }
        this.authQueries.add(authQueriesItem);
        return this;
    }

    /**
     * Get authQueries
     *
     * @return authQueries
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AUTH_QUERIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<AuthQueryDetail> getAuthQueries() {
        return authQueries;
    }

    @JsonProperty(JSON_PROPERTY_AUTH_QUERIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAuthQueries(@javax.annotation.Nonnull List<AuthQueryDetail> authQueries) {
        this.authQueries = authQueries;
    }

    public ApiSessionDetail authenticatorId(@javax.annotation.Nonnull String authenticatorId) {
        this.authenticatorId = authenticatorId;
        return this;
    }

    /**
     * Get authenticatorId
     *
     * @return authenticatorId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAuthenticatorId() {
        return authenticatorId;
    }

    @JsonProperty(JSON_PROPERTY_AUTHENTICATOR_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAuthenticatorId(@javax.annotation.Nonnull String authenticatorId) {
        this.authenticatorId = authenticatorId;
    }

    public ApiSessionDetail cachedLastActivityAt(
            @javax.annotation.Nullable OffsetDateTime cachedLastActivityAt) {
        this.cachedLastActivityAt = cachedLastActivityAt;
        return this;
    }

    /**
     * Get cachedLastActivityAt
     *
     * @return cachedLastActivityAt
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CACHED_LAST_ACTIVITY_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCachedLastActivityAt() {
        return cachedLastActivityAt;
    }

    @JsonProperty(JSON_PROPERTY_CACHED_LAST_ACTIVITY_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCachedLastActivityAt(
            @javax.annotation.Nullable OffsetDateTime cachedLastActivityAt) {
        this.cachedLastActivityAt = cachedLastActivityAt;
    }

    public ApiSessionDetail configTypes(@javax.annotation.Nonnull List<String> configTypes) {
        this.configTypes = configTypes;
        return this;
    }

    public ApiSessionDetail addConfigTypesItem(String configTypesItem) {
        if (this.configTypes == null) {
            this.configTypes = new ArrayList<>();
        }
        this.configTypes.add(configTypesItem);
        return this;
    }

    /**
     * Get configTypes
     *
     * @return configTypes
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONFIG_TYPES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getConfigTypes() {
        return configTypes;
    }

    @JsonProperty(JSON_PROPERTY_CONFIG_TYPES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConfigTypes(@javax.annotation.Nonnull List<String> configTypes) {
        this.configTypes = configTypes;
    }

    public ApiSessionDetail identity(@javax.annotation.Nonnull EntityRef identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get identity
     *
     * @return identity
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IDENTITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public EntityRef getIdentity() {
        return identity;
    }

    @JsonProperty(JSON_PROPERTY_IDENTITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIdentity(@javax.annotation.Nonnull EntityRef identity) {
        this.identity = identity;
    }

    public ApiSessionDetail identityId(@javax.annotation.Nonnull String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Get identityId
     *
     * @return identityId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IDENTITY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIdentityId() {
        return identityId;
    }

    @JsonProperty(JSON_PROPERTY_IDENTITY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIdentityId(@javax.annotation.Nonnull String identityId) {
        this.identityId = identityId;
    }

    public ApiSessionDetail ipAddress(@javax.annotation.Nonnull String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIpAddress(@javax.annotation.Nonnull String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ApiSessionDetail isCertExtendable(@javax.annotation.Nonnull Boolean isCertExtendable) {
        this.isCertExtendable = isCertExtendable;
        return this;
    }

    /**
     * Get isCertExtendable
     *
     * @return isCertExtendable
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_CERT_EXTENDABLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsCertExtendable() {
        return isCertExtendable;
    }

    @JsonProperty(JSON_PROPERTY_IS_CERT_EXTENDABLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsCertExtendable(@javax.annotation.Nonnull Boolean isCertExtendable) {
        this.isCertExtendable = isCertExtendable;
    }

    public ApiSessionDetail isMfaComplete(@javax.annotation.Nonnull Boolean isMfaComplete) {
        this.isMfaComplete = isMfaComplete;
        return this;
    }

    /**
     * Get isMfaComplete
     *
     * @return isMfaComplete
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_MFA_COMPLETE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsMfaComplete() {
        return isMfaComplete;
    }

    @JsonProperty(JSON_PROPERTY_IS_MFA_COMPLETE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsMfaComplete(@javax.annotation.Nonnull Boolean isMfaComplete) {
        this.isMfaComplete = isMfaComplete;
    }

    public ApiSessionDetail isMfaRequired(@javax.annotation.Nonnull Boolean isMfaRequired) {
        this.isMfaRequired = isMfaRequired;
        return this;
    }

    /**
     * Get isMfaRequired
     *
     * @return isMfaRequired
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_MFA_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsMfaRequired() {
        return isMfaRequired;
    }

    @JsonProperty(JSON_PROPERTY_IS_MFA_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsMfaRequired(@javax.annotation.Nonnull Boolean isMfaRequired) {
        this.isMfaRequired = isMfaRequired;
    }

    public ApiSessionDetail lastActivityAt(
            @javax.annotation.Nullable OffsetDateTime lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    /**
     * Get lastActivityAt
     *
     * @return lastActivityAt
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getLastActivityAt() {
        return lastActivityAt;
    }

    @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLastActivityAt(@javax.annotation.Nullable OffsetDateTime lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public ApiSessionDetail token(@javax.annotation.Nonnull String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getToken() {
        return token;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToken(@javax.annotation.Nonnull String token) {
        this.token = token;
    }

    /** Return true if this apiSessionDetail object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSessionDetail apiSessionDetail = (ApiSessionDetail) o;
        return Objects.equals(this.links, apiSessionDetail.links)
                && Objects.equals(this.createdAt, apiSessionDetail.createdAt)
                && Objects.equals(this.id, apiSessionDetail.id)
                && Objects.equals(this.tags, apiSessionDetail.tags)
                && Objects.equals(this.updatedAt, apiSessionDetail.updatedAt)
                && Objects.equals(this.authQueries, apiSessionDetail.authQueries)
                && Objects.equals(this.authenticatorId, apiSessionDetail.authenticatorId)
                && Objects.equals(this.cachedLastActivityAt, apiSessionDetail.cachedLastActivityAt)
                && Objects.equals(this.configTypes, apiSessionDetail.configTypes)
                && Objects.equals(this.identity, apiSessionDetail.identity)
                && Objects.equals(this.identityId, apiSessionDetail.identityId)
                && Objects.equals(this.ipAddress, apiSessionDetail.ipAddress)
                && Objects.equals(this.isCertExtendable, apiSessionDetail.isCertExtendable)
                && Objects.equals(this.isMfaComplete, apiSessionDetail.isMfaComplete)
                && Objects.equals(this.isMfaRequired, apiSessionDetail.isMfaRequired)
                && Objects.equals(this.lastActivityAt, apiSessionDetail.lastActivityAt)
                && Objects.equals(this.token, apiSessionDetail.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                createdAt,
                id,
                tags,
                updatedAt,
                authQueries,
                authenticatorId,
                cachedLastActivityAt,
                configTypes,
                identity,
                identityId,
                ipAddress,
                isCertExtendable,
                isMfaComplete,
                isMfaRequired,
                lastActivityAt,
                token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSessionDetail {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    authQueries: ").append(toIndentedString(authQueries)).append("\n");
        sb.append("    authenticatorId: ").append(toIndentedString(authenticatorId)).append("\n");
        sb.append("    cachedLastActivityAt: ")
                .append(toIndentedString(cachedLastActivityAt))
                .append("\n");
        sb.append("    configTypes: ").append(toIndentedString(configTypes)).append("\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    isCertExtendable: ").append(toIndentedString(isCertExtendable)).append("\n");
        sb.append("    isMfaComplete: ").append(toIndentedString(isMfaComplete)).append("\n");
        sb.append("    isMfaRequired: ").append(toIndentedString(isMfaRequired)).append("\n");
        sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

        // add `authQueries` to the URL query string
        if (getAuthQueries() != null) {
            for (int i = 0; i < getAuthQueries().size(); i++) {
                if (getAuthQueries().get(i) != null) {
                    joiner.add(
                            getAuthQueries()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sauthQueries%s%s",
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

        // add `authenticatorId` to the URL query string
        if (getAuthenticatorId() != null) {
            joiner.add(
                    String.format(
                            "%sauthenticatorId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getAuthenticatorId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `cachedLastActivityAt` to the URL query string
        if (getCachedLastActivityAt() != null) {
            joiner.add(
                    String.format(
                            "%scachedLastActivityAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getCachedLastActivityAt()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `configTypes` to the URL query string
        if (getConfigTypes() != null) {
            for (int i = 0; i < getConfigTypes().size(); i++) {
                joiner.add(
                        String.format(
                                "%sconfigTypes%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(getConfigTypes().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `identity` to the URL query string
        if (getIdentity() != null) {
            joiner.add(getIdentity().toUrlQueryString(prefix + "identity" + suffix));
        }

        // add `identityId` to the URL query string
        if (getIdentityId() != null) {
            joiner.add(
                    String.format(
                            "%sidentityId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIdentityId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `ipAddress` to the URL query string
        if (getIpAddress() != null) {
            joiner.add(
                    String.format(
                            "%sipAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIpAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isCertExtendable` to the URL query string
        if (getIsCertExtendable() != null) {
            joiner.add(
                    String.format(
                            "%sisCertExtendable%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsCertExtendable()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isMfaComplete` to the URL query string
        if (getIsMfaComplete() != null) {
            joiner.add(
                    String.format(
                            "%sisMfaComplete%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsMfaComplete()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isMfaRequired` to the URL query string
        if (getIsMfaRequired() != null) {
            joiner.add(
                    String.format(
                            "%sisMfaRequired%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsMfaRequired()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `lastActivityAt` to the URL query string
        if (getLastActivityAt() != null) {
            joiner.add(
                    String.format(
                            "%slastActivityAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getLastActivityAt()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `token` to the URL query string
        if (getToken() != null) {
            joiner.add(
                    String.format(
                            "%stoken%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getToken()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
