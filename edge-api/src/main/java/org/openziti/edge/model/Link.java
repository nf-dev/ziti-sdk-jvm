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
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** A link to another resource */
@JsonPropertyOrder({Link.JSON_PROPERTY_COMMENT, Link.JSON_PROPERTY_HREF, Link.JSON_PROPERTY_METHOD})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-27T11:11:53.726065456-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class Link {
    public static final String JSON_PROPERTY_COMMENT = "comment";
    @javax.annotation.Nullable private String comment;

    public static final String JSON_PROPERTY_HREF = "href";
    @javax.annotation.Nonnull private URI href;

    public static final String JSON_PROPERTY_METHOD = "method";
    @javax.annotation.Nullable private String method;

    public Link() {}

    public Link comment(@javax.annotation.Nullable String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getComment() {
        return comment;
    }

    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComment(@javax.annotation.Nullable String comment) {
        this.comment = comment;
    }

    public Link href(@javax.annotation.Nonnull URI href) {
        this.href = href;
        return this;
    }

    /**
     * Get href
     *
     * @return href
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_HREF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public URI getHref() {
        return href;
    }

    @JsonProperty(JSON_PROPERTY_HREF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHref(@javax.annotation.Nonnull URI href) {
        this.href = href;
    }

    public Link method(@javax.annotation.Nullable String method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMethod() {
        return method;
    }

    @JsonProperty(JSON_PROPERTY_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMethod(@javax.annotation.Nullable String method) {
        this.method = method;
    }

    /** Return true if this link object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Link link = (Link) o;
        return Objects.equals(this.comment, link.comment)
                && Objects.equals(this.href, link.href)
                && Objects.equals(this.method, link.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, href, method);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Link {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

        // add `comment` to the URL query string
        if (getComment() != null) {
            joiner.add(
                    String.format(
                            "%scomment%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getComment()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `href` to the URL query string
        if (getHref() != null) {
            joiner.add(
                    String.format(
                            "%shref%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getHref()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `method` to the URL query string
        if (getMethod() != null) {
            joiner.add(
                    String.format(
                            "%smethod%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getMethod()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
