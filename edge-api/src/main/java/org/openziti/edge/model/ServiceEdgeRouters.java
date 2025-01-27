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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ServiceEdgeRouters */
@JsonPropertyOrder({ServiceEdgeRouters.JSON_PROPERTY_EDGE_ROUTERS})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-27T11:11:53.726065456-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
public class ServiceEdgeRouters {
    public static final String JSON_PROPERTY_EDGE_ROUTERS = "edgeRouters";

    @javax.annotation.Nullable
    private List<CommonEdgeRouterProperties> edgeRouters = new ArrayList<>();

    public ServiceEdgeRouters() {}

    public ServiceEdgeRouters edgeRouters(
            @javax.annotation.Nullable List<CommonEdgeRouterProperties> edgeRouters) {
        this.edgeRouters = edgeRouters;
        return this;
    }

    public ServiceEdgeRouters addEdgeRoutersItem(CommonEdgeRouterProperties edgeRoutersItem) {
        if (this.edgeRouters == null) {
            this.edgeRouters = new ArrayList<>();
        }
        this.edgeRouters.add(edgeRoutersItem);
        return this;
    }

    /**
     * Get edgeRouters
     *
     * @return edgeRouters
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EDGE_ROUTERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<CommonEdgeRouterProperties> getEdgeRouters() {
        return edgeRouters;
    }

    @JsonProperty(JSON_PROPERTY_EDGE_ROUTERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEdgeRouters(
            @javax.annotation.Nullable List<CommonEdgeRouterProperties> edgeRouters) {
        this.edgeRouters = edgeRouters;
    }

    /** Return true if this serviceEdgeRouters object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceEdgeRouters serviceEdgeRouters = (ServiceEdgeRouters) o;
        return Objects.equals(this.edgeRouters, serviceEdgeRouters.edgeRouters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeRouters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceEdgeRouters {\n");
        sb.append("    edgeRouters: ").append(toIndentedString(edgeRouters)).append("\n");
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

        // add `edgeRouters` to the URL query string
        if (getEdgeRouters() != null) {
            for (int i = 0; i < getEdgeRouters().size(); i++) {
                if (getEdgeRouters().get(i) != null) {
                    joiner.add(
                            getEdgeRouters()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sedgeRouters%s%s",
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

        return joiner.toString();
    }
}
