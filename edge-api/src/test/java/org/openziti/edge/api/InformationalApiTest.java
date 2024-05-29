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
import org.openziti.edge.model.DetailSpecBodyEnvelope;
import org.openziti.edge.model.DetailSpecEnvelope;
import org.openziti.edge.model.ListEnumeratedCapabilitiesEnvelope;
import org.openziti.edge.model.ListProtocolsEnvelope;
import org.openziti.edge.model.ListSpecsEnvelope;
import org.openziti.edge.model.ListVersionEnvelope;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for InformationalApi
 */
@Disabled
public class InformationalApiTest {

    private final InformationalApi api = new InformationalApi();

    
    /**
     * Return a single spec resource
     *
     * Returns single spec resource embedded within the controller for consumption/documentation/code geneartion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detailSpecTest() throws ApiException {
        String id = null;
        CompletableFuture<DetailSpecEnvelope> response = 
        api.detailSpec(id);
        
        // TODO: test validations
    }
    
    /**
     * Returns the spec&#39;s file
     *
     * Return the body of the specification (i.e. Swagger, OpenAPI 2.0, 3.0, etc).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detailSpecBodyTest() throws ApiException {
        String id = null;
        CompletableFuture<DetailSpecBodyEnvelope> response = 
        api.detailSpecBody(id);
        
        // TODO: test validations
    }
    
    /**
     * Returns all capabilities this version of the controller is aware of, enabled or not.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEnumeratedCapabilitiesTest() throws ApiException {
        CompletableFuture<ListEnumeratedCapabilitiesEnvelope> response = 
        api.listEnumeratedCapabilities();
        
        // TODO: test validations
    }
    
    /**
     * Return a list of the listening Edge protocols
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProtocolsTest() throws ApiException {
        CompletableFuture<ListProtocolsEnvelope> response = 
        api.listProtocols();
        
        // TODO: test validations
    }
    
    /**
     * Returns version information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRootTest() throws ApiException {
        CompletableFuture<ListVersionEnvelope> response = 
        api.listRoot();
        
        // TODO: test validations
    }
    
    /**
     * Returns a list of API specs
     *
     * Returns a list of spec files embedded within the controller for consumption/documentation/code geneartion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSpecsTest() throws ApiException {
        CompletableFuture<ListSpecsEnvelope> response = 
        api.listSpecs();
        
        // TODO: test validations
    }
    
    /**
     * Returns version information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVersionTest() throws ApiException {
        CompletableFuture<ListVersionEnvelope> response = 
        api.listVersion();
        
        // TODO: test validations
    }
    
}
