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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** CommonEdgeRouterProperties */
@JsonPropertyOrder({
    CommonEdgeRouterProperties.JSON_PROPERTY_APP_DATA,
    CommonEdgeRouterProperties.JSON_PROPERTY_COST,
    CommonEdgeRouterProperties.JSON_PROPERTY_DISABLED,
    CommonEdgeRouterProperties.JSON_PROPERTY_HOSTNAME,
    CommonEdgeRouterProperties.JSON_PROPERTY_IS_ONLINE,
    CommonEdgeRouterProperties.JSON_PROPERTY_NAME,
    CommonEdgeRouterProperties.JSON_PROPERTY_NO_TRAVERSAL,
    CommonEdgeRouterProperties.JSON_PROPERTY_SUPPORTED_PROTOCOLS,
    CommonEdgeRouterProperties.JSON_PROPERTY_SYNC_STATUS
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-24T15:38:47.422198133-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class CommonEdgeRouterProperties {
    public static final String JSON_PROPERTY_APP_DATA = "appData";
    @javax.annotation.Nullable private Tags appData;

    public static final String JSON_PROPERTY_COST = "cost";
    @javax.annotation.Nullable private Integer cost;

    public static final String JSON_PROPERTY_DISABLED = "disabled";
    @javax.annotation.Nonnull private Boolean disabled;

    public static final String JSON_PROPERTY_HOSTNAME = "hostname";
    @javax.annotation.Nonnull private String hostname;

    public static final String JSON_PROPERTY_IS_ONLINE = "isOnline";
    @javax.annotation.Nonnull private Boolean isOnline;

    public static final String JSON_PROPERTY_NAME = "name";
    @javax.annotation.Nonnull private String name;

    public static final String JSON_PROPERTY_NO_TRAVERSAL = "noTraversal";
    @javax.annotation.Nullable private Boolean noTraversal;

    public static final String JSON_PROPERTY_SUPPORTED_PROTOCOLS = "supportedProtocols";
    @javax.annotation.Nonnull private Map<String, String> supportedProtocols = new HashMap<>();

    public static final String JSON_PROPERTY_SYNC_STATUS = "syncStatus";
    @javax.annotation.Nonnull private String syncStatus;

    public CommonEdgeRouterProperties() {}

    public CommonEdgeRouterProperties appData(@javax.annotation.Nullable Tags appData) {
        this.appData = appData;
        return this;
    }

    /**
     * Get appData
     *
     * @return appData
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_APP_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Tags getAppData() {
        return appData;
    }

    @JsonProperty(JSON_PROPERTY_APP_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAppData(@javax.annotation.Nullable Tags appData) {
        this.appData = appData;
    }

    public CommonEdgeRouterProperties cost(@javax.annotation.Nullable Integer cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get cost minimum: 0 maximum: 65535
     *
     * @return cost
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_COST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCost() {
        return cost;
    }

    @JsonProperty(JSON_PROPERTY_COST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCost(@javax.annotation.Nullable Integer cost) {
        this.cost = cost;
    }

    public CommonEdgeRouterProperties disabled(@javax.annotation.Nonnull Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DISABLED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty(JSON_PROPERTY_DISABLED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDisabled(@javax.annotation.Nonnull Boolean disabled) {
        this.disabled = disabled;
    }

    public CommonEdgeRouterProperties hostname(@javax.annotation.Nonnull String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getHostname() {
        return hostname;
    }

    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHostname(@javax.annotation.Nonnull String hostname) {
        this.hostname = hostname;
    }

    public CommonEdgeRouterProperties isOnline(@javax.annotation.Nonnull Boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    /**
     * Get isOnline
     *
     * @return isOnline
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_ONLINE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getIsOnline() {
        return isOnline;
    }

    @JsonProperty(JSON_PROPERTY_IS_ONLINE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsOnline(@javax.annotation.Nonnull Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public CommonEdgeRouterProperties name(@javax.annotation.Nonnull String name) {
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
    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public CommonEdgeRouterProperties noTraversal(@javax.annotation.Nullable Boolean noTraversal) {
        this.noTraversal = noTraversal;
        return this;
    }

    /**
     * Get noTraversal
     *
     * @return noTraversal
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NO_TRAVERSAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getNoTraversal() {
        return noTraversal;
    }

    @JsonProperty(JSON_PROPERTY_NO_TRAVERSAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNoTraversal(@javax.annotation.Nullable Boolean noTraversal) {
        this.noTraversal = noTraversal;
    }

    public CommonEdgeRouterProperties supportedProtocols(
            @javax.annotation.Nonnull Map<String, String> supportedProtocols) {
        this.supportedProtocols = supportedProtocols;
        return this;
    }

    public CommonEdgeRouterProperties putSupportedProtocolsItem(
            String key, String supportedProtocolsItem) {
        if (this.supportedProtocols == null) {
            this.supportedProtocols = new HashMap<>();
        }
        this.supportedProtocols.put(key, supportedProtocolsItem);
        return this;
    }

    /**
     * Get supportedProtocols
     *
     * @return supportedProtocols
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SUPPORTED_PROTOCOLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, String> getSupportedProtocols() {
        return supportedProtocols;
    }

    @JsonProperty(JSON_PROPERTY_SUPPORTED_PROTOCOLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSupportedProtocols(
            @javax.annotation.Nonnull Map<String, String> supportedProtocols) {
        this.supportedProtocols = supportedProtocols;
    }

    public CommonEdgeRouterProperties syncStatus(@javax.annotation.Nonnull String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * Get syncStatus
     *
     * @return syncStatus
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SYNC_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSyncStatus() {
        return syncStatus;
    }

    @JsonProperty(JSON_PROPERTY_SYNC_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSyncStatus(@javax.annotation.Nonnull String syncStatus) {
        this.syncStatus = syncStatus;
    }

    /** Return true if this commonEdgeRouterProperties object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonEdgeRouterProperties commonEdgeRouterProperties = (CommonEdgeRouterProperties) o;
        return Objects.equals(this.appData, commonEdgeRouterProperties.appData)
                && Objects.equals(this.cost, commonEdgeRouterProperties.cost)
                && Objects.equals(this.disabled, commonEdgeRouterProperties.disabled)
                && Objects.equals(this.hostname, commonEdgeRouterProperties.hostname)
                && Objects.equals(this.isOnline, commonEdgeRouterProperties.isOnline)
                && Objects.equals(this.name, commonEdgeRouterProperties.name)
                && Objects.equals(this.noTraversal, commonEdgeRouterProperties.noTraversal)
                && Objects.equals(
                        this.supportedProtocols, commonEdgeRouterProperties.supportedProtocols)
                && Objects.equals(this.syncStatus, commonEdgeRouterProperties.syncStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                appData,
                cost,
                disabled,
                hostname,
                isOnline,
                name,
                noTraversal,
                supportedProtocols,
                syncStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonEdgeRouterProperties {\n");
        sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noTraversal: ").append(toIndentedString(noTraversal)).append("\n");
        sb.append("    supportedProtocols: ")
                .append(toIndentedString(supportedProtocols))
                .append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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

        // add `appData` to the URL query string
        if (getAppData() != null) {
            joiner.add(getAppData().toUrlQueryString(prefix + "appData" + suffix));
        }

        // add `cost` to the URL query string
        if (getCost() != null) {
            joiner.add(
                    String.format(
                            "%scost%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getCost()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `disabled` to the URL query string
        if (getDisabled() != null) {
            joiner.add(
                    String.format(
                            "%sdisabled%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getDisabled()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `hostname` to the URL query string
        if (getHostname() != null) {
            joiner.add(
                    String.format(
                            "%shostname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getHostname()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `isOnline` to the URL query string
        if (getIsOnline() != null) {
            joiner.add(
                    String.format(
                            "%sisOnline%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getIsOnline()),
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
                            URLEncoder.encode(
                                            ApiClient.valueToString(getName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `noTraversal` to the URL query string
        if (getNoTraversal() != null) {
            joiner.add(
                    String.format(
                            "%snoTraversal%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getNoTraversal()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `supportedProtocols` to the URL query string
        if (getSupportedProtocols() != null) {
            for (String _key : getSupportedProtocols().keySet()) {
                joiner.add(
                        String.format(
                                "%ssupportedProtocols%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, _key, containerSuffix),
                                getSupportedProtocols().get(_key),
                                URLEncoder.encode(
                                                ApiClient.valueToString(
                                                        getSupportedProtocols().get(_key)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `syncStatus` to the URL query string
        if (getSyncStatus() != null) {
            joiner.add(
                    String.format(
                            "%ssyncStatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getSyncStatus()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
