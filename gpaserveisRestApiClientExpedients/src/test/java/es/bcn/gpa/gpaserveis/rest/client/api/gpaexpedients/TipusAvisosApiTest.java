/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.15.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.TipusAvisosRDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TipusAvisosApi
 */
@Ignore
public class TipusAvisosApiTest {

    private final TipusAvisosApi api = new TipusAvisosApi();

    
    /**
     * Returns all the TipusAvisos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void obtenirTipusAvisosUsingGETTest() {
        List<TipusAvisosRDTO> response = api.obtenirTipusAvisosUsingGET();

        // TODO: test validations
    }
    
}
