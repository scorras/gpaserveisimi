/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.11.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.bcn.gpa.gpaserveis.rest.client.api.gpadocumentacio;

import es.bcn.gpa.gpaserveis.rest.client.invoker.gpadocumentacio.ApiException;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.FaseProcedimentRDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FaseProcedimentApi
 */
@Ignore
public class FaseProcedimentApiTest {

    private final FaseProcedimentApi api = new FaseProcedimentApi();

    
    /**
     * Returns all the fase procediments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFaseProcedimentUsingGETTest() throws ApiException {
        List<FaseProcedimentRDTO> response = api.getFaseProcedimentUsingGET();

        // TODO: test validations
    }
    
}
