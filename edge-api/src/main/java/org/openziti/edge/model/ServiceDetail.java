/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.18
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

/** ServiceDetail */
@JsonPropertyOrder({
    ServiceDetail.JSON_PROPERTY_LINKS,
    ServiceDetail.JSON_PROPERTY_CREATED_AT,
    ServiceDetail.JSON_PROPERTY_ID,
    ServiceDetail.JSON_PROPERTY_TAGS,
    ServiceDetail.JSON_PROPERTY_UPDATED_AT,
    ServiceDetail.JSON_PROPERTY_CONFIG,
    ServiceDetail.JSON_PROPERTY_CONFIGS,
    ServiceDetail.JSON_PROPERTY_ENCRYPTION_REQUIRED,
    ServiceDetail.JSON_PROPERTY_MAX_IDLE_TIME_MILLIS,
    ServiceDetail.JSON_PROPERTY_NAME,
    ServiceDetail.JSON_PROPERTY_PERMISSIONS,
    ServiceDetail.JSON_PROPERTY_POSTURE_QUERIES,
    ServiceDetail.JSON_PROPERTY_ROLE_ATTRIBUTES,
    ServiceDetail.JSON_PROPERTY_TERMINATOR_STRATEGY
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-05-29T11:06:12.834975-04:00[America/New_York]",
        comments = "Generator version: 7.6.0")
public class ServiceDetail {
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

    public static final String JSON_PROPERTY_CONFIG = "config";
    private Map<String, Map<String, Object>> config = new HashMap<>();

    public static final String JSON_PROPERTY_CONFIGS = "configs";
    private List<String> configs = new ArrayList<>();

    public static final String JSON_PROPERTY_ENCRYPTION_REQUIRED = "encryptionRequired";
    private Boolean encryptionRequired;

    public static final String JSON_PROPERTY_MAX_IDLE_TIME_MILLIS = "maxIdleTimeMillis";
    private Integer maxIdleTimeMillis;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
    private List<DialBind> permissions = new ArrayList<>();

    public static final String JSON_PROPERTY_POSTURE_QUERIES = "postureQueries";
    private List<PostureQueries> postureQueries = new ArrayList<>();

    public static final String JSON_PROPERTY_ROLE_ATTRIBUTES = "roleAttributes";
    private List<String> roleAttributes;

    public static final String JSON_PROPERTY_TERMINATOR_STRATEGY = "terminatorStrategy";
    private String terminatorStrategy;

    public ServiceDetail() {}

    public ServiceDetail links(Map<String, Link> links) {
        this.links = links;
        return this;
    }

    public ServiceDetail putLinksItem(String key, Link linksItem) {
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

    public ServiceDetail createdAt(OffsetDateTime createdAt) {
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

    public ServiceDetail id(String id) {
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

    public ServiceDetail tags(Tags tags) {
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

    public ServiceDetail updatedAt(OffsetDateTime updatedAt) {
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

    public ServiceDetail config(Map<String, Map<String, Object>> config) {
        this.config = config;
        return this;
    }

    public ServiceDetail putConfigItem(String key, Map<String, Object> configItem) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        this.config.put(key, configItem);
        return this;
    }

    /**
     * map of config data for this service keyed by the config type name. Only configs of the types
     * requested will be returned.
     *
     * @return config
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, Map<String, Object>> getConfig() {
        return config;
    }

    @JsonProperty(JSON_PROPERTY_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConfig(Map<String, Map<String, Object>> config) {
        this.config = config;
    }

    public ServiceDetail configs(List<String> configs) {
        this.configs = configs;
        return this;
    }

    public ServiceDetail addConfigsItem(String configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    /**
     * Get configs
     *
     * @return configs
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONFIGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getConfigs() {
        return configs;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConfigs(List<String> configs) {
        this.configs = configs;
    }

    public ServiceDetail encryptionRequired(Boolean encryptionRequired) {
        this.encryptionRequired = encryptionRequired;
        return this;
    }

    /**
     * Describes whether connections must support end-to-end encryption on both sides of the
     * connection. Read-only property, set at create.
     *
     * @return encryptionRequired
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ENCRYPTION_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getEncryptionRequired() {
        return encryptionRequired;
    }

    @JsonProperty(JSON_PROPERTY_ENCRYPTION_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEncryptionRequired(Boolean encryptionRequired) {
        this.encryptionRequired = encryptionRequired;
    }

    public ServiceDetail maxIdleTimeMillis(Integer maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
        return this;
    }

    /**
     * Get maxIdleTimeMillis
     *
     * @return maxIdleTimeMillis
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_MAX_IDLE_TIME_MILLIS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getMaxIdleTimeMillis() {
        return maxIdleTimeMillis;
    }

    @JsonProperty(JSON_PROPERTY_MAX_IDLE_TIME_MILLIS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMaxIdleTimeMillis(Integer maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
    }

    public ServiceDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public ServiceDetail permissions(List<DialBind> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ServiceDetail addPermissionsItem(DialBind permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<DialBind> getPermissions() {
        return permissions;
    }

    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPermissions(List<DialBind> permissions) {
        this.permissions = permissions;
    }

    public ServiceDetail postureQueries(List<PostureQueries> postureQueries) {
        this.postureQueries = postureQueries;
        return this;
    }

    public ServiceDetail addPostureQueriesItem(PostureQueries postureQueriesItem) {
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
    public List<PostureQueries> getPostureQueries() {
        return postureQueries;
    }

    @JsonProperty(JSON_PROPERTY_POSTURE_QUERIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPostureQueries(List<PostureQueries> postureQueries) {
        this.postureQueries = postureQueries;
    }

    public ServiceDetail roleAttributes(List<String> roleAttributes) {
        this.roleAttributes = roleAttributes;
        return this;
    }

    public ServiceDetail addRoleAttributesItem(String roleAttributesItem) {
        if (this.roleAttributes == null) {
            this.roleAttributes = new ArrayList<>();
        }
        this.roleAttributes.add(roleAttributesItem);
        return this;
    }

    /**
     * A set of strings used to loosly couple this resource to policies
     *
     * @return roleAttributes
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ROLE_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getRoleAttributes() {
        return roleAttributes;
    }

    @JsonProperty(JSON_PROPERTY_ROLE_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRoleAttributes(List<String> roleAttributes) {
        this.roleAttributes = roleAttributes;
    }

    public ServiceDetail terminatorStrategy(String terminatorStrategy) {
        this.terminatorStrategy = terminatorStrategy;
        return this;
    }

    /**
     * Get terminatorStrategy
     *
     * @return terminatorStrategy
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TERMINATOR_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTerminatorStrategy() {
        return terminatorStrategy;
    }

    @JsonProperty(JSON_PROPERTY_TERMINATOR_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTerminatorStrategy(String terminatorStrategy) {
        this.terminatorStrategy = terminatorStrategy;
    }

    /** Return true if this serviceDetail object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceDetail serviceDetail = (ServiceDetail) o;
        return Objects.equals(this.links, serviceDetail.links)
                && Objects.equals(this.createdAt, serviceDetail.createdAt)
                && Objects.equals(this.id, serviceDetail.id)
                && Objects.equals(this.tags, serviceDetail.tags)
                && Objects.equals(this.updatedAt, serviceDetail.updatedAt)
                && Objects.equals(this.config, serviceDetail.config)
                && Objects.equals(this.configs, serviceDetail.configs)
                && Objects.equals(this.encryptionRequired, serviceDetail.encryptionRequired)
                && Objects.equals(this.maxIdleTimeMillis, serviceDetail.maxIdleTimeMillis)
                && Objects.equals(this.name, serviceDetail.name)
                && Objects.equals(this.permissions, serviceDetail.permissions)
                && Objects.equals(this.postureQueries, serviceDetail.postureQueries)
                && Objects.equals(this.roleAttributes, serviceDetail.roleAttributes)
                && Objects.equals(this.terminatorStrategy, serviceDetail.terminatorStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                createdAt,
                id,
                tags,
                updatedAt,
                config,
                configs,
                encryptionRequired,
                maxIdleTimeMillis,
                name,
                permissions,
                postureQueries,
                roleAttributes,
                terminatorStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceDetail {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    encryptionRequired: ")
                .append(toIndentedString(encryptionRequired))
                .append("\n");
        sb.append("    maxIdleTimeMillis: ")
                .append(toIndentedString(maxIdleTimeMillis))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    postureQueries: ").append(toIndentedString(postureQueries)).append("\n");
        sb.append("    roleAttributes: ").append(toIndentedString(roleAttributes)).append("\n");
        sb.append("    terminatorStrategy: ")
                .append(toIndentedString(terminatorStrategy))
                .append("\n");
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
                                            String.valueOf(getCreatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
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
                                            String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `config` to the URL query string
        if (getConfig() != null) {
            for (String _key : getConfig().keySet()) {
                joiner.add(
                        String.format(
                                "%sconfig%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, _key, containerSuffix),
                                getConfig().get(_key),
                                URLEncoder.encode(
                                                String.valueOf(getConfig().get(_key)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `configs` to the URL query string
        if (getConfigs() != null) {
            for (int i = 0; i < getConfigs().size(); i++) {
                joiner.add(
                        String.format(
                                "%sconfigs%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                String.valueOf(getConfigs().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `encryptionRequired` to the URL query string
        if (getEncryptionRequired() != null) {
            joiner.add(
                    String.format(
                            "%sencryptionRequired%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getEncryptionRequired()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `maxIdleTimeMillis` to the URL query string
        if (getMaxIdleTimeMillis() != null) {
            joiner.add(
                    String.format(
                            "%smaxIdleTimeMillis%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getMaxIdleTimeMillis()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `permissions` to the URL query string
        if (getPermissions() != null) {
            for (int i = 0; i < getPermissions().size(); i++) {
                if (getPermissions().get(i) != null) {
                    joiner.add(
                            String.format(
                                    "%spermissions%s%s=%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format(
                                                    "%s%d%s", containerPrefix, i, containerSuffix),
                                    URLEncoder.encode(
                                                    String.valueOf(getPermissions().get(i)),
                                                    StandardCharsets.UTF_8)
                                            .replaceAll("\\+", "%20")));
                }
            }
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

        // add `roleAttributes` to the URL query string
        if (getRoleAttributes() != null) {
            for (int i = 0; i < getRoleAttributes().size(); i++) {
                joiner.add(
                        String.format(
                                "%sroleAttributes%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                String.valueOf(getRoleAttributes().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `terminatorStrategy` to the URL query string
        if (getTerminatorStrategy() != null) {
            joiner.add(
                    String.format(
                            "%sterminatorStrategy%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTerminatorStrategy()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
