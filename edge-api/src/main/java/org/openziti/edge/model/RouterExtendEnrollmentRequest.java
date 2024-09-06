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
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** RouterExtendEnrollmentRequest */
@JsonPropertyOrder({
    RouterExtendEnrollmentRequest.JSON_PROPERTY_CERT_CSR,
    RouterExtendEnrollmentRequest.JSON_PROPERTY_SERVER_CERT_CSR
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-09-04T10:11:22.635226-04:00[America/New_York]",
        comments = "Generator version: 7.8.0")
public class RouterExtendEnrollmentRequest {
    public static final String JSON_PROPERTY_CERT_CSR = "certCsr";
    private String certCsr;

    public static final String JSON_PROPERTY_SERVER_CERT_CSR = "serverCertCsr";
    private String serverCertCsr;

    public RouterExtendEnrollmentRequest() {}

    public RouterExtendEnrollmentRequest certCsr(String certCsr) {
        this.certCsr = certCsr;
        return this;
    }

    /**
     * Get certCsr
     *
     * @return certCsr
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CERT_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCertCsr() {
        return certCsr;
    }

    @JsonProperty(JSON_PROPERTY_CERT_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCertCsr(String certCsr) {
        this.certCsr = certCsr;
    }

    public RouterExtendEnrollmentRequest serverCertCsr(String serverCertCsr) {
        this.serverCertCsr = serverCertCsr;
        return this;
    }

    /**
     * Get serverCertCsr
     *
     * @return serverCertCsr
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SERVER_CERT_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getServerCertCsr() {
        return serverCertCsr;
    }

    @JsonProperty(JSON_PROPERTY_SERVER_CERT_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setServerCertCsr(String serverCertCsr) {
        this.serverCertCsr = serverCertCsr;
    }

    /** Return true if this routerExtendEnrollmentRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouterExtendEnrollmentRequest routerExtendEnrollmentRequest =
                (RouterExtendEnrollmentRequest) o;
        return Objects.equals(this.certCsr, routerExtendEnrollmentRequest.certCsr)
                && Objects.equals(this.serverCertCsr, routerExtendEnrollmentRequest.serverCertCsr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certCsr, serverCertCsr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouterExtendEnrollmentRequest {\n");
        sb.append("    certCsr: ").append(toIndentedString(certCsr)).append("\n");
        sb.append("    serverCertCsr: ").append(toIndentedString(serverCertCsr)).append("\n");
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

        // add `certCsr` to the URL query string
        if (getCertCsr() != null) {
            joiner.add(
                    String.format(
                            "%scertCsr%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getCertCsr()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `serverCertCsr` to the URL query string
        if (getServerCertCsr() != null) {
            joiner.add(
                    String.format(
                            "%sserverCertCsr%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getServerCertCsr()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
