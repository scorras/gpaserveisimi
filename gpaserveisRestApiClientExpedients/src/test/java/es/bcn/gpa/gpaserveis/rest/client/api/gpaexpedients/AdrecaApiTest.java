/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.11.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiException;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.AdrecaNormalitzadaRDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdrecaApi
 */
@Ignore
public class AdrecaApiTest {

    private final AdrecaApi api = new AdrecaApi();

    
    /**
     * Returns the normalitzada adreca
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void normalitzarAdrecaPostalUsingGETTest() throws ApiException {
        String nomVia = null;
        String numero = null;
        AdrecaNormalitzadaRDTO response = api.normalitzarAdrecaPostalUsingGET(nomVia, numero);

        // TODO: test validations
    }
    
}
