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

package org.openziti.edge.api;

import org.openziti.edge.ApiClient;
import org.openziti.edge.ApiException;
import org.openziti.edge.ApiResponse;
import org.openziti.edge.Pair;

import org.openziti.edge.model.ApiErrorEnvelope;
import org.openziti.edge.model.Empty;
import org.openziti.edge.model.EnrollmentCertsEnvelope;
import org.openziti.edge.model.IdentityExtendEnrollmentEnvelope;
import org.openziti.edge.model.IdentityExtendEnrollmentRequest;
import org.openziti.edge.model.IdentityExtendValidateEnrollmentRequest;
import org.openziti.edge.model.RouterExtendEnrollmentRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import java.util.concurrent.CompletableFuture;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-29T11:06:12.834975-04:00[America/New_York]", comments = "Generator version: 7.6.0")
public class ExtendEnrollmentApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ExtendEnrollmentApi() {
    this(new ApiClient());
  }

  public ExtendEnrollmentApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Allows the current identity to recieve a new certificate associated with a certificate based authenticator
   * This endpoint only functions for certificates issued by the controller. 3rd party certificates are not handled. Allows an identity to extend its certificate&#39;s expiration date by using its current and valid client certificate to submit a CSR. This CSR may be passed in using a new private key, thus allowing private key rotation. The response from this endpoint is a new client certificate which the client must  be verified via the /authenticators/{id}/extend-verify endpoint. After verification is completion any new connections must be made with new certificate. Prior to verification the old client certificate remains active.
   * @param id The id of the requested resource (required)
   * @param extend  (required)
   * @return CompletableFuture&lt;IdentityExtendEnrollmentEnvelope&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<IdentityExtendEnrollmentEnvelope> extendCurrentIdentityAuthenticator(String id, IdentityExtendEnrollmentRequest extend) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendCurrentIdentityAuthenticatorRequestBuilder(id, extend);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendCurrentIdentityAuthenticator", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<IdentityExtendEnrollmentEnvelope>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Allows the current identity to recieve a new certificate associated with a certificate based authenticator
   * This endpoint only functions for certificates issued by the controller. 3rd party certificates are not handled. Allows an identity to extend its certificate&#39;s expiration date by using its current and valid client certificate to submit a CSR. This CSR may be passed in using a new private key, thus allowing private key rotation. The response from this endpoint is a new client certificate which the client must  be verified via the /authenticators/{id}/extend-verify endpoint. After verification is completion any new connections must be made with new certificate. Prior to verification the old client certificate remains active.
   * @param id The id of the requested resource (required)
   * @param extend  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IdentityExtendEnrollmentEnvelope&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<IdentityExtendEnrollmentEnvelope>> extendCurrentIdentityAuthenticatorWithHttpInfo(String id, IdentityExtendEnrollmentRequest extend) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendCurrentIdentityAuthenticatorRequestBuilder(id, extend);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendCurrentIdentityAuthenticator", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<IdentityExtendEnrollmentEnvelope>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<IdentityExtendEnrollmentEnvelope>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder extendCurrentIdentityAuthenticatorRequestBuilder(String id, IdentityExtendEnrollmentRequest extend) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extendCurrentIdentityAuthenticator");
    }
    // verify the required parameter 'extend' is set
    if (extend == null) {
      throw new ApiException(400, "Missing the required parameter 'extend' when calling extendCurrentIdentityAuthenticator");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/current-identity/authenticators/{id}/extend"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(extend);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Extend the life of a currently enrolled router&#39;s certificates
   * Allows a router to extend its certificates&#39; expiration date by using its current and valid client certificate to submit a CSR. This CSR may be passed in using a new private key, thus allowing private key rotation or swapping.  After completion any new connections must be made with certificates returned from a 200 OK response. The previous client certificate is rendered invalid for use with the controller even if it has not expired.  This request must be made using the existing, valid, client certificate. 
   * @param routerExtendEnrollmentRequest  (required)
   * @return CompletableFuture&lt;EnrollmentCertsEnvelope&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<EnrollmentCertsEnvelope> extendRouterEnrollment(RouterExtendEnrollmentRequest routerExtendEnrollmentRequest) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendRouterEnrollmentRequestBuilder(routerExtendEnrollmentRequest);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendRouterEnrollment", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EnrollmentCertsEnvelope>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Extend the life of a currently enrolled router&#39;s certificates
   * Allows a router to extend its certificates&#39; expiration date by using its current and valid client certificate to submit a CSR. This CSR may be passed in using a new private key, thus allowing private key rotation or swapping.  After completion any new connections must be made with certificates returned from a 200 OK response. The previous client certificate is rendered invalid for use with the controller even if it has not expired.  This request must be made using the existing, valid, client certificate. 
   * @param routerExtendEnrollmentRequest  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;EnrollmentCertsEnvelope&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<EnrollmentCertsEnvelope>> extendRouterEnrollmentWithHttpInfo(RouterExtendEnrollmentRequest routerExtendEnrollmentRequest) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendRouterEnrollmentRequestBuilder(routerExtendEnrollmentRequest);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendRouterEnrollment", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<EnrollmentCertsEnvelope>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EnrollmentCertsEnvelope>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder extendRouterEnrollmentRequestBuilder(RouterExtendEnrollmentRequest routerExtendEnrollmentRequest) throws ApiException {
    // verify the required parameter 'routerExtendEnrollmentRequest' is set
    if (routerExtendEnrollmentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'routerExtendEnrollmentRequest' when calling extendRouterEnrollment");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/enroll/extend/router";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(routerExtendEnrollmentRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Allows the current identity to validate reciept of a new client certificate
   * After submitting a CSR for a new client certificate the resulting public certificate must be re-submitted to this endpoint to verify receipt. After receipt, the new client certificate must be used for new authentication requests.
   * @param id The id of the requested resource (required)
   * @param extend  (required)
   * @return CompletableFuture&lt;Empty&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Empty> extendVerifyCurrentIdentityAuthenticator(String id, IdentityExtendValidateEnrollmentRequest extend) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendVerifyCurrentIdentityAuthenticatorRequestBuilder(id, extend);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendVerifyCurrentIdentityAuthenticator", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Empty>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Allows the current identity to validate reciept of a new client certificate
   * After submitting a CSR for a new client certificate the resulting public certificate must be re-submitted to this endpoint to verify receipt. After receipt, the new client certificate must be used for new authentication requests.
   * @param id The id of the requested resource (required)
   * @param extend  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Empty&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Empty>> extendVerifyCurrentIdentityAuthenticatorWithHttpInfo(String id, IdentityExtendValidateEnrollmentRequest extend) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = extendVerifyCurrentIdentityAuthenticatorRequestBuilder(id, extend);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("extendVerifyCurrentIdentityAuthenticator", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Empty>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Empty>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder extendVerifyCurrentIdentityAuthenticatorRequestBuilder(String id, IdentityExtendValidateEnrollmentRequest extend) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extendVerifyCurrentIdentityAuthenticator");
    }
    // verify the required parameter 'extend' is set
    if (extend == null) {
      throw new ApiException(400, "Missing the required parameter 'extend' when calling extendVerifyCurrentIdentityAuthenticator");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/current-identity/authenticators/{id}/extend-verify"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(extend);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
