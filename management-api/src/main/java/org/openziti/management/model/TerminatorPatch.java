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

/** TerminatorPatch */
@JsonPropertyOrder({
    TerminatorPatch.JSON_PROPERTY_ADDRESS,
    TerminatorPatch.JSON_PROPERTY_BINDING,
    TerminatorPatch.JSON_PROPERTY_COST,
    TerminatorPatch.JSON_PROPERTY_PRECEDENCE,
    TerminatorPatch.JSON_PROPERTY_ROUTER,
    TerminatorPatch.JSON_PROPERTY_SERVICE,
    TerminatorPatch.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class TerminatorPatch {
    public static final String JSON_PROPERTY_ADDRESS = "address";
    @javax.annotation.Nullable private String address;

    public static final String JSON_PROPERTY_BINDING = "binding";
    @javax.annotation.Nullable private String binding;

    public static final String JSON_PROPERTY_COST = "cost";
    @javax.annotation.Nullable private Integer cost;

    public static final String JSON_PROPERTY_PRECEDENCE = "precedence";
    @javax.annotation.Nullable private TerminatorPrecedence precedence;

    public static final String JSON_PROPERTY_ROUTER = "router";
    @javax.annotation.Nullable private String router;

    public static final String JSON_PROPERTY_SERVICE = "service";
    @javax.annotation.Nullable private String service;

    public static final String JSON_PROPERTY_TAGS = "tags";
    @javax.annotation.Nullable private Tags tags;

    public TerminatorPatch() {}

    public TerminatorPatch address(@javax.annotation.Nullable String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAddress() {
        return address;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddress(@javax.annotation.Nullable String address) {
        this.address = address;
    }

    public TerminatorPatch binding(@javax.annotation.Nullable String binding) {
        this.binding = binding;
        return this;
    }

    /**
     * Get binding
     *
     * @return binding
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BINDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBinding() {
        return binding;
    }

    @JsonProperty(JSON_PROPERTY_BINDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBinding(@javax.annotation.Nullable String binding) {
        this.binding = binding;
    }

    public TerminatorPatch cost(@javax.annotation.Nullable Integer cost) {
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
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCost() {
        return cost;
    }

    @JsonProperty(JSON_PROPERTY_COST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCost(@javax.annotation.Nullable Integer cost) {
        this.cost = cost;
    }

    public TerminatorPatch precedence(@javax.annotation.Nullable TerminatorPrecedence precedence) {
        this.precedence = precedence;
        return this;
    }

    /**
     * Get precedence
     *
     * @return precedence
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PRECEDENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TerminatorPrecedence getPrecedence() {
        return precedence;
    }

    @JsonProperty(JSON_PROPERTY_PRECEDENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrecedence(@javax.annotation.Nullable TerminatorPrecedence precedence) {
        this.precedence = precedence;
    }

    public TerminatorPatch router(@javax.annotation.Nullable String router) {
        this.router = router;
        return this;
    }

    /**
     * Get router
     *
     * @return router
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ROUTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRouter() {
        return router;
    }

    @JsonProperty(JSON_PROPERTY_ROUTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRouter(@javax.annotation.Nullable String router) {
        this.router = router;
    }

    public TerminatorPatch service(@javax.annotation.Nullable String service) {
        this.service = service;
        return this;
    }

    /**
     * Get service
     *
     * @return service
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getService() {
        return service;
    }

    @JsonProperty(JSON_PROPERTY_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setService(@javax.annotation.Nullable String service) {
        this.service = service;
    }

    public TerminatorPatch tags(@javax.annotation.Nullable Tags tags) {
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

    /** Return true if this terminatorPatch object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerminatorPatch terminatorPatch = (TerminatorPatch) o;
        return Objects.equals(this.address, terminatorPatch.address)
                && Objects.equals(this.binding, terminatorPatch.binding)
                && Objects.equals(this.cost, terminatorPatch.cost)
                && Objects.equals(this.precedence, terminatorPatch.precedence)
                && Objects.equals(this.router, terminatorPatch.router)
                && Objects.equals(this.service, terminatorPatch.service)
                && Objects.equals(this.tags, terminatorPatch.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, binding, cost, precedence, router, service, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerminatorPatch {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

        // add `address` to the URL query string
        if (getAddress() != null) {
            joiner.add(
                    String.format(
                            "%saddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `binding` to the URL query string
        if (getBinding() != null) {
            joiner.add(
                    String.format(
                            "%sbinding%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getBinding()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
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

        // add `precedence` to the URL query string
        if (getPrecedence() != null) {
            joiner.add(
                    String.format(
                            "%sprecedence%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getPrecedence()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `router` to the URL query string
        if (getRouter() != null) {
            joiner.add(
                    String.format(
                            "%srouter%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getRouter()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `service` to the URL query string
        if (getService() != null) {
            joiner.add(
                    String.format(
                            "%sservice%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getService()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
        }

        return joiner.toString();
    }
}
