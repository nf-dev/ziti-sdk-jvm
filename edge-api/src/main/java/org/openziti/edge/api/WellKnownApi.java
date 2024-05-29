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
public class WellKnownApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public WellKnownApi() {
    this(new ApiClient());
  }

  public WellKnownApi(ApiClient apiClient) {
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
   * Get CA Cert Store
   * This endpoint is used during enrollments to bootstrap trust between enrolling clients and the Ziti Edge API. This endpoint returns a base64 encoded PKCS7 store. The content can be base64 decoded and parsed by any library that supports parsing PKCS7 stores. 
   * @return CompletableFuture&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<String> listWellKnownCas() throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listWellKnownCasRequestBuilder();
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listWellKnownCas", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<String>() {})
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
   * Get CA Cert Store
   * This endpoint is used during enrollments to bootstrap trust between enrolling clients and the Ziti Edge API. This endpoint returns a base64 encoded PKCS7 store. The content can be base64 decoded and parsed by any library that supports parsing PKCS7 stores. 
   * @return CompletableFuture&lt;ApiResponse&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<String>> listWellKnownCasWithHttpInfo() throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = listWellKnownCasRequestBuilder();
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("listWellKnownCas", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<String>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<String>() {}))
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

  private HttpRequest.Builder listWellKnownCasRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/.well-known/est/cacerts";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/pkcs7-mime");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
