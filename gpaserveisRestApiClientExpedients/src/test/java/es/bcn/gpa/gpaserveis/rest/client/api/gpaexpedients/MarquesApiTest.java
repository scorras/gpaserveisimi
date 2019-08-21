/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.5.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DropdownCampReferenciaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.MarquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfMarquesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiException;

/**
 * API tests for MarquesApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MarquesApiTest extends ParentTest {

	@InjectMocks
	private MarquesApi api = new MarquesApi();

	/**
	 * Returns all the marques entries for the administrador
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void marquesAdministradorTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/marques/marquesAdministrador"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfMarquesRDTO());

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
		PageDataOfMarquesRDTO response = api.marquesAdministrador(absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, totalElements,
		        totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns all the marques that meet the search criteria
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cercaMarquesTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/marques/search"), eq("GET"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), any(GenericType.class))).thenReturn(new PageDataOfMarquesRDTO());

		Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
		Integer absoluteRowNumberOfLastRowInCurrentPage = null;
		String campReferencia = null;
		String codi = null;
		Boolean currentPageHasNextPage = null;
		Boolean currentPageHasPreviousPage = null;
		Boolean currentPageIsFirstPage = null;
		Boolean currentPageIsLastPage = null;
		Integer currentPageNumber = null;
		String descripcio = null;
		String dir = null;
		BigDecimal id = null;
		BigDecimal idUsuari = null;
		Integer nextPageNumber = null;
		Integer pageSize = null;
		Integer previousPageNumber = null;
		String procedimentCodi = null;
		BigDecimal procedimentVersio = null;
		String sort = null;
		Long totalElements = null;
		Integer totalPages = null;
		PageDataOfMarquesRDTO response = api.cercaMarques(absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage,
		        campReferencia, codi, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage,
		        currentPageNumber, descripcio, dir, id, idUsuari, nextPageNumber, pageSize, previousPageNumber, procedimentCodi,
		        procedimentVersio, sort, totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Insert marques
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void saveTramitUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/marques"), eq("POST"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class))).thenReturn(new MarquesRDTO());

		MarquesRDTO tramitsRDTO = new MarquesRDTO();
		MarquesRDTO response = api.saveTramitUsingPOST(tramitsRDTO);

		assertTrue(response != null);
	}

	/**
	 * Returns all the camps referencia entries
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void obtenirCampsReferenciaTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/marques/obtenirCampsReferencia"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<DropdownCampReferenciaRDTO>());

		List<DropdownCampReferenciaRDTO> response = api.obtenirCampsReferencia();

		assertTrue(response != null);
	}
}
