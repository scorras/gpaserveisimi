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
import java.math.BigDecimal;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.MarquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfMarquesRDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarquesApi
 */
@Ignore
public class MarquesApiTest {

    private final MarquesApi api = new MarquesApi();

    
    /**
     * Returns all the marques that meet the search criteria
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cercaMarquesTest() throws ApiException {
        Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
        Integer absoluteRowNumberOfLastRowInCurrentPage = null;
        String codi = null;
        Boolean currentPageHasNextPage = null;
        Boolean currentPageHasPreviousPage = null;
        Boolean currentPageIsFirstPage = null;
        Boolean currentPageIsLastPage = null;
        Integer currentPageNumber = null;
        String descripcio = null;
        String dir = null;
        String example = null;
        String expressio = null;
        BigDecimal id = null;
        Integer nextPageNumber = null;
        Integer pageSize = null;
        Integer previousPageNumber = null;
        String referencia = null;
        String sort = null;
        Long totalElements = null;
        Integer totalPages = null;
        PageDataOfMarquesRDTO response = api.cercaMarques(absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, codi, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, descripcio, dir, example, expressio, id, nextPageNumber, pageSize, previousPageNumber, referencia, sort, totalElements, totalPages);

        // TODO: test validations
    }
    
    /**
     * Returns all the marques entries for the administrador
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void marquesAdministradorTest() throws ApiException {
        Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
        Integer absoluteRowNumberOfLastRowInCurrentPage = null;
        Boolean currentPageHasNextPage = null;
        Boolean currentPageHasPreviousPage = null;
        Boolean currentPageIsFirstPage = null;
        Boolean currentPageIsLastPage = null;
        Integer currentPageNumber = null;
        String dir = null;
        Integer nextPageNumber = null;
        Integer pageSize = null;
        Integer previousPageNumber = null;
        String sort = null;
        Long totalElements = null;
        Integer totalPages = null;
        PageDataOfMarquesRDTO response = api.marquesAdministrador(absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, totalElements, totalPages);

        // TODO: test validations
    }
    
    /**
     * Insert  marques
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveTramitUsingPOSTTest() throws ApiException {
        MarquesRDTO marquesRDTO = null;
        MarquesRDTO response = api.saveTramitUsingPOST(marquesRDTO);

        // TODO: test validations
    }
    
}
