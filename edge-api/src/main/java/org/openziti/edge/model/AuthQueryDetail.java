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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openziti.edge.model.MfaFormats;
import org.openziti.edge.model.MfaProviders;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AuthQueryDetail
 */
@JsonPropertyOrder({
  AuthQueryDetail.JSON_PROPERTY_FORMAT,
  AuthQueryDetail.JSON_PROPERTY_HTTP_METHOD,
  AuthQueryDetail.JSON_PROPERTY_HTTP_URL,
  AuthQueryDetail.JSON_PROPERTY_MAX_LENGTH,
  AuthQueryDetail.JSON_PROPERTY_MIN_LENGTH,
  AuthQueryDetail.JSON_PROPERTY_PROVIDER,
  AuthQueryDetail.JSON_PROPERTY_TYPE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-29T11:06:12.834975-04:00[America/New_York]", comments = "Generator version: 7.6.0")
public class AuthQueryDetail {
  public static final String JSON_PROPERTY_FORMAT = "format";
  private MfaFormats format;

  public static final String JSON_PROPERTY_HTTP_METHOD = "httpMethod";
  private String httpMethod;

  public static final String JSON_PROPERTY_HTTP_URL = "httpUrl";
  private String httpUrl;

  public static final String JSON_PROPERTY_MAX_LENGTH = "maxLength";
  private Integer maxLength;

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  private Integer minLength;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private MfaProviders provider;

  public static final String JSON_PROPERTY_TYPE_ID = "typeId";
  private String typeId;

  public AuthQueryDetail() { 
  }

  public AuthQueryDetail format(MfaFormats format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MfaFormats getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(MfaFormats format) {
    this.format = format;
  }


  public AuthQueryDetail httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * Get httpMethod
   * @return httpMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHttpMethod() {
    return httpMethod;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  public AuthQueryDetail httpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
    return this;
  }

   /**
   * Get httpUrl
   * @return httpUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHttpUrl() {
    return httpUrl;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
  }


  public AuthQueryDetail maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public AuthQueryDetail minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinLength() {
    return minLength;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public AuthQueryDetail provider(MfaProviders provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MfaProviders getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(MfaProviders provider) {
    this.provider = provider;
  }


  public AuthQueryDetail typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeId() {
    return typeId;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  /**
   * Return true if this authQueryDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthQueryDetail authQueryDetail = (AuthQueryDetail) o;
    return Objects.equals(this.format, authQueryDetail.format) &&
        Objects.equals(this.httpMethod, authQueryDetail.httpMethod) &&
        Objects.equals(this.httpUrl, authQueryDetail.httpUrl) &&
        Objects.equals(this.maxLength, authQueryDetail.maxLength) &&
        Objects.equals(this.minLength, authQueryDetail.minLength) &&
        Objects.equals(this.provider, authQueryDetail.provider) &&
        Objects.equals(this.typeId, authQueryDetail.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, httpMethod, httpUrl, maxLength, minLength, provider, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthQueryDetail {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    httpUrl: ").append(toIndentedString(httpUrl)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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

    // add `format` to the URL query string
    if (getFormat() != null) {
      joiner.add(String.format("%sformat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `httpMethod` to the URL query string
    if (getHttpMethod() != null) {
      joiner.add(String.format("%shttpMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHttpMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `httpUrl` to the URL query string
    if (getHttpUrl() != null) {
      joiner.add(String.format("%shttpUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHttpUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maxLength` to the URL query string
    if (getMaxLength() != null) {
      joiner.add(String.format("%smaxLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxLength()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `minLength` to the URL query string
    if (getMinLength() != null) {
      joiner.add(String.format("%sminLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinLength()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `typeId` to the URL query string
    if (getTypeId() != null) {
      joiner.add(String.format("%stypeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTypeId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

