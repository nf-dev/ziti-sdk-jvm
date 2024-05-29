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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ServiceUpdate */
@JsonPropertyOrder({
    ServiceUpdate.JSON_PROPERTY_CONFIGS,
    ServiceUpdate.JSON_PROPERTY_ENCRYPTION_REQUIRED,
    ServiceUpdate.JSON_PROPERTY_MAX_IDLE_TIME_MILLIS,
    ServiceUpdate.JSON_PROPERTY_NAME,
    ServiceUpdate.JSON_PROPERTY_ROLE_ATTRIBUTES,
    ServiceUpdate.JSON_PROPERTY_TAGS,
    ServiceUpdate.JSON_PROPERTY_TERMINATOR_STRATEGY
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-05-29T11:06:12.834975-04:00[America/New_York]",
        comments = "Generator version: 7.6.0")
public class ServiceUpdate {
    public static final String JSON_PROPERTY_CONFIGS = "configs";
    private List<String> configs = new ArrayList<>();

    public static final String JSON_PROPERTY_ENCRYPTION_REQUIRED = "encryptionRequired";
    private Boolean encryptionRequired;

    public static final String JSON_PROPERTY_MAX_IDLE_TIME_MILLIS = "maxIdleTimeMillis";
    private Integer maxIdleTimeMillis;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ROLE_ATTRIBUTES = "roleAttributes";
    private List<String> roleAttributes = new ArrayList<>();

    public static final String JSON_PROPERTY_TAGS = "tags";
    private Tags tags;

    public static final String JSON_PROPERTY_TERMINATOR_STRATEGY = "terminatorStrategy";
    private String terminatorStrategy;

    public ServiceUpdate() {}

    public ServiceUpdate configs(List<String> configs) {
        this.configs = configs;
        return this;
    }

    public ServiceUpdate addConfigsItem(String configsItem) {
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
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONFIGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getConfigs() {
        return configs;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConfigs(List<String> configs) {
        this.configs = configs;
    }

    public ServiceUpdate encryptionRequired(Boolean encryptionRequired) {
        this.encryptionRequired = encryptionRequired;
        return this;
    }

    /**
     * Describes whether connections must support end-to-end encryption on both sides of the
     * connection. Read-only property, set at create.
     *
     * @return encryptionRequired
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENCRYPTION_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEncryptionRequired() {
        return encryptionRequired;
    }

    @JsonProperty(JSON_PROPERTY_ENCRYPTION_REQUIRED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEncryptionRequired(Boolean encryptionRequired) {
        this.encryptionRequired = encryptionRequired;
    }

    public ServiceUpdate maxIdleTimeMillis(Integer maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
        return this;
    }

    /**
     * Get maxIdleTimeMillis
     *
     * @return maxIdleTimeMillis
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MAX_IDLE_TIME_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMaxIdleTimeMillis() {
        return maxIdleTimeMillis;
    }

    @JsonProperty(JSON_PROPERTY_MAX_IDLE_TIME_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxIdleTimeMillis(Integer maxIdleTimeMillis) {
        this.maxIdleTimeMillis = maxIdleTimeMillis;
    }

    public ServiceUpdate name(String name) {
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

    public ServiceUpdate roleAttributes(List<String> roleAttributes) {
        this.roleAttributes = roleAttributes;
        return this;
    }

    public ServiceUpdate addRoleAttributesItem(String roleAttributesItem) {
        if (this.roleAttributes == null) {
            this.roleAttributes = new ArrayList<>();
        }
        this.roleAttributes.add(roleAttributesItem);
        return this;
    }

    /**
     * Get roleAttributes
     *
     * @return roleAttributes
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ROLE_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getRoleAttributes() {
        return roleAttributes;
    }

    @JsonProperty(JSON_PROPERTY_ROLE_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoleAttributes(List<String> roleAttributes) {
        this.roleAttributes = roleAttributes;
    }

    public ServiceUpdate tags(Tags tags) {
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

    public ServiceUpdate terminatorStrategy(String terminatorStrategy) {
        this.terminatorStrategy = terminatorStrategy;
        return this;
    }

    /**
     * Get terminatorStrategy
     *
     * @return terminatorStrategy
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TERMINATOR_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTerminatorStrategy() {
        return terminatorStrategy;
    }

    @JsonProperty(JSON_PROPERTY_TERMINATOR_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTerminatorStrategy(String terminatorStrategy) {
        this.terminatorStrategy = terminatorStrategy;
    }

    /** Return true if this serviceUpdate object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceUpdate serviceUpdate = (ServiceUpdate) o;
        return Objects.equals(this.configs, serviceUpdate.configs)
                && Objects.equals(this.encryptionRequired, serviceUpdate.encryptionRequired)
                && Objects.equals(this.maxIdleTimeMillis, serviceUpdate.maxIdleTimeMillis)
                && Objects.equals(this.name, serviceUpdate.name)
                && Objects.equals(this.roleAttributes, serviceUpdate.roleAttributes)
                && Objects.equals(this.tags, serviceUpdate.tags)
                && Objects.equals(this.terminatorStrategy, serviceUpdate.terminatorStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configs,
                encryptionRequired,
                maxIdleTimeMillis,
                name,
                roleAttributes,
                tags,
                terminatorStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceUpdate {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    encryptionRequired: ")
                .append(toIndentedString(encryptionRequired))
                .append("\n");
        sb.append("    maxIdleTimeMillis: ")
                .append(toIndentedString(maxIdleTimeMillis))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roleAttributes: ").append(toIndentedString(roleAttributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
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
