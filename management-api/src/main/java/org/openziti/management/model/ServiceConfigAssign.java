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

/** ServiceConfigAssign */
@JsonPropertyOrder({
    ServiceConfigAssign.JSON_PROPERTY_CONFIG_ID,
    ServiceConfigAssign.JSON_PROPERTY_SERVICE_ID
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class ServiceConfigAssign {
    public static final String JSON_PROPERTY_CONFIG_ID = "configId";
    @javax.annotation.Nonnull private String configId;

    public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
    @javax.annotation.Nonnull private String serviceId;

    public ServiceConfigAssign() {}

    public ServiceConfigAssign configId(@javax.annotation.Nonnull String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * Get configId
     *
     * @return configId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONFIG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getConfigId() {
        return configId;
    }

    @JsonProperty(JSON_PROPERTY_CONFIG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConfigId(@javax.annotation.Nonnull String configId) {
        this.configId = configId;
    }

    public ServiceConfigAssign serviceId(@javax.annotation.Nonnull String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get serviceId
     *
     * @return serviceId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SERVICE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getServiceId() {
        return serviceId;
    }

    @JsonProperty(JSON_PROPERTY_SERVICE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setServiceId(@javax.annotation.Nonnull String serviceId) {
        this.serviceId = serviceId;
    }

    /** Return true if this serviceConfigAssign object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceConfigAssign serviceConfigAssign = (ServiceConfigAssign) o;
        return Objects.equals(this.configId, serviceConfigAssign.configId)
                && Objects.equals(this.serviceId, serviceConfigAssign.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, serviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceConfigAssign {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

        // add `configId` to the URL query string
        if (getConfigId() != null) {
            joiner.add(
                    String.format(
                            "%sconfigId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getConfigId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `serviceId` to the URL query string
        if (getServiceId() != null) {
            joiner.add(
                    String.format(
                            "%sserviceId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getServiceId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
