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

import org.openziti.edge.ApiException;
import org.openziti.edge.model.ApiErrorEnvelope;
import org.openziti.edge.model.CreateEnvelope;
import org.openziti.edge.model.CurrentIdentityDetailEnvelope;
import org.openziti.edge.model.DetailMfaEnvelope;
import org.openziti.edge.model.DetailMfaRecoveryCodesEnvelope;
import org.openziti.edge.model.Empty;
import org.openziti.edge.model.ListCurrentIdentityEdgeRoutersEnvelope;
import org.openziti.edge.model.MfaCode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for CurrentIdentityApi
 */
@Disabled
public class CurrentIdentityApiTest {

    private final CurrentIdentityApi api = new CurrentIdentityApi();

    
    /**
     * For a completed MFA enrollment regenerate the recovery codes
     *
     * Allows regeneration of recovery codes of an MFA enrollment. Requires a current valid time based one time password to interact with. Available after a completed MFA enrollment. This replaces all existing recovery codes. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMfaRecoveryCodesTest() throws ApiException {
        MfaCode mfaValidation = null;
        CompletableFuture<DetailMfaRecoveryCodesEnvelope> response = 
        api.createMfaRecoveryCodes(mfaValidation);
        
        // TODO: test validations
    }
    
    /**
     * Disable MFA for the current identity
     *
     * Disable MFA for the current identity. Requires a current valid time based one time password if MFA enrollment has been completed. If not, code should be an empty string. If one time passwords are not available and admin account can be used to remove MFA from the identity via &#x60;DELETE /identities/&lt;id&gt;/mfa&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMfaTest() throws ApiException {
        String mfaValidationCode = null;
        CompletableFuture<Empty> response = 
        api.deleteMfa(mfaValidationCode);
        
        // TODO: test validations
    }
    
    /**
     * Returns the current status of MFA enrollment
     *
     * Returns details about the current MFA enrollment. If enrollment has not been completed it will return the current MFA configuration details necessary to complete a &#x60;POST /current-identity/mfa/verify&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detailMfaTest() throws ApiException {
        CompletableFuture<DetailMfaEnvelope> response = 
        api.detailMfa();
        
        // TODO: test validations
    }
    
    /**
     * Show a QR code for unverified MFA enrollments
     *
     * Shows an QR code image for unverified MFA enrollments. 404s if the MFA enrollment has been completed or not started. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detailMfaQrCodeTest() throws ApiException {
        
        CompletableFuture<Void> response = api.detailMfaQrCode();
        
        // TODO: test validations
    }
    
    /**
     * For a completed MFA enrollment view the current recovery codes
     *
     * Allows the viewing of recovery codes of an MFA enrollment. Requires a current valid time based one time password to interact with. Available after a completed MFA enrollment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detailMfaRecoveryCodesTest() throws ApiException {
        String mfaValidationCode = null;
        MfaCode mfaValidation = null;
        CompletableFuture<Empty> response = 
        api.detailMfaRecoveryCodes(mfaValidationCode, mfaValidation);
        
        // TODO: test validations
    }
    
    /**
     * Initiate MFA enrollment
     *
     * Allows authenticator based MFA enrollment. If enrollment has already been completed, it must be disabled before attempting to re-enroll. Subsequent enrollment request is completed via &#x60;POST /current-identity/mfa/verify&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enrollMfaTest() throws ApiException {
        CompletableFuture<CreateEnvelope> response = 
        api.enrollMfa();
        
        // TODO: test validations
    }
    
    /**
     * Return the current identity
     *
     * Returns the identity associated with the API sessions used to issue the current request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentIdentityTest() throws ApiException {
        CompletableFuture<CurrentIdentityDetailEnvelope> response = 
        api.getCurrentIdentity();
        
        // TODO: test validations
    }
    
    /**
     * Return this list of Edge Routers the identity has access to
     *
     * Lists the Edge Routers that the current identity has access to via policies. The data returned includes their address and online status 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentIdentityEdgeRoutersTest() throws ApiException {
        CompletableFuture<ListCurrentIdentityEdgeRoutersEnvelope> response = 
        api.getCurrentIdentityEdgeRouters();
        
        // TODO: test validations
    }
    
    /**
     * Complete MFA enrollment by verifying a time based one time token
     *
     * Completes MFA enrollment by accepting a time based one time password as verification. Called after MFA enrollment has been initiated via &#x60;POST /current-identity/mfa&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyMfaTest() throws ApiException {
        MfaCode mfaValidation = null;
        CompletableFuture<Empty> response = 
        api.verifyMfa(mfaValidation);
        
        // TODO: test validations
    }
    
}
