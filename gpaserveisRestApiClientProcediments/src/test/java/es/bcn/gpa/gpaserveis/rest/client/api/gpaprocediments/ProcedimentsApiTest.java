/*
 * API gpaprocediments
 * API gpaprocediments
 *
 * OpenAPI spec version: 1.3.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpaprocediments;

import static java.lang.Boolean.TRUE;
import static java.math.BigDecimal.ONE;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.BloquejosRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.DadesOperacionsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.HistoricsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.InfoDocProcedimentRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.PageDataOfComentarisRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.PageDataOfHistoricsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.PageDataOfProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsForTramitsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsForUnitatsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.ProcedimentsResponse;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.RestClientResponse;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaprocediments.UnitatsGestoresRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaprocediments.ApiException;

/**
 * API tests for ProcedimentsApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProcedimentsApiTest extends ParentTest {

	@InjectMocks
	private ProcedimentsApi api = new ProcedimentsApi();

	/**
	 * Deletes the requested procediment list
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void bulkDeleteProcedimentsListUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/delete"), eq("POST"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), isNull(GenericType.class))).thenReturn(null);

		List<BigDecimal> procedimentIdList = Arrays.asList(ONE);
		api.bulkDeleteProcedimentsListUsingPOST(procedimentIdList);

		assertTrue(true);
	}

	/**
	 * Change the state of a procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void canviEstatProcedimentsUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/canviEstat/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsRDTO());

		BigDecimal id = ONE;
		ProcedimentsRDTO procedimentRDTO = new ProcedimentsRDTO();
		ProcedimentsRDTO response = api.canviEstatProcedimentsUsingPOST(id, procedimentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Returns all procedures that meet the search criteria
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cercaProcedimentsTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/search"), eq("GET"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfProcedimentsRDTO());

		Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
		Integer absoluteRowNumberOfLastRowInCurrentPage = null;
		List<String> activableFormatElectronic = null;
		String actuacio = null;
		String aplicacioNegoci = null;
		String codi = null;
		List<BigDecimal> competencies = null;
		Boolean currentPageHasNextPage = null;
		Boolean currentPageHasPreviousPage = null;
		Boolean currentPageIsFirstPage = null;
		Boolean currentPageIsLastPage = null;
		Integer currentPageNumber = null;
		String dir = null;
		List<BigDecimal> estats = null;
		List<BigDecimal> families = null;
		BigDecimal id = null;
		BigDecimal idUsuari = null;
		Integer intern = null;
		Integer nextPageNumber = null;
		String nom = null;
		Integer operador = null;
		String organResolutori = null;
		Integer pageSize = null;
		Integer previousPageNumber = null;
		String sort = null;
		Long totalElements = null;
		Integer totalPages = null;
		List<BigDecimal> ugos = null;
		PageDataOfProcedimentsRDTO response = api.cercaProcediments(absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, activableFormatElectronic, actuacio, aplicacioNegoci, codi, competencies,
		        currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir,
		        estats, families, id, idUsuari, intern, nextPageNumber, nom, operador, organResolutori, pageSize, previousPageNumber, sort,
		        totalElements, totalPages, ugos);

		assertTrue(response != null);
	}

	/**
	 * Returns true/false if the published procediment has expedients
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void checkExpedientsUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn("cod");
		when(apiClient.invokeAPI(eq("/procediments/checkExpedients/cod"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class))).thenReturn(TRUE);

		String codProcediment = "cod";
		Boolean response = api.checkExpedientsUsingGET(codProcediment);

		assertTrue(response != null);
	}

	/**
	 * Clone the provided procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cloneProcedimentUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/clonar/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsResponse());

		BigDecimal id = ONE;
		ProcedimentsRDTO procedimentRDTO = new ProcedimentsRDTO();
		ProcedimentsResponse response = api.cloneProcedimentUsingPOST(id, procedimentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Returns the requested procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesProcedimentTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), any(GenericType.class))).thenReturn(new ProcedimentsRDTO());

		BigDecimal id = ONE;
		ProcedimentsRDTO response = api.consultarDadesProcediment(id);

		assertTrue(response != null);
	}

	/**
	 * Deletes the requested procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void deleteProcedimentsUsingDELETETest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/1"), eq("DELETE"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), isNull(GenericType.class))).thenReturn(null);

		BigDecimal id = ONE;
		api.deleteProcedimentsUsingDELETE(id);

		assertTrue(true);
	}

	/**
	 * Retorna les dades d&#39;operació de la darrera versió del procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getDadesOperacioForCercaExpedientUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn("cod");
		when(apiClient.invokeAPI(eq("/procediments/dadesOperacioForCercaExpedient/cod"), eq("GET"), any(List.class), any(Object.class),
		        any(Map.class), any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<DadesOperacionsRDTO>());

		String codi = "cod";
		List<DadesOperacionsRDTO> response = api.getDadesOperacioForCercaExpedientUsingGET(codi);

		assertTrue(response != null);
	}

	/**
	 * Returns all the procediments names
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getNomProcedimentsForOgeUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/infoProcediments"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<ProcedimentsRDTO>());

		List<BigDecimal> procList = Arrays.asList(ONE);
		List<ProcedimentsRDTO> response = api.getNomProcedimentsForOgeUsingPOST(procList);

		assertTrue(response != null);
	}

	/**
	 * Returns procediments associated to tramits
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getProcedimentsAssociatedTramitsUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/getProcedimentsAssociatedTramits/1"), eq("GET"), any(List.class), any(Object.class),
		        any(Map.class), any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<ProcedimentsForTramitsRDTO>());

		String idTramitList = ONE.toString();
		List<ProcedimentsForTramitsRDTO> response = api.getProcedimentsAssociatedTramitsUsingGET(idTramitList);

		assertTrue(response != null);
	}

	/**
	 * Returns all the procediments for OGE
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getProcedimentsForOgeUsingGETTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/procedimentsForOge"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<ProcedimentsRDTO>());

		List<ProcedimentsRDTO> response = api.getProcedimentsForOgeUsingGET();

		assertTrue(response != null);
	}

	/**
	 * Returns the associated procediment list
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getProcedimentsRelacionatsUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/relacionats/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfProcedimentsRDTO());

		BigDecimal id = ONE;
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
		PageDataOfProcedimentsRDTO response = api.getProcedimentsRelacionatsUsingGET(id, absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, totalElements,
		        totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns all the procediments
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getProcedimentsUsingGETTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments"), eq("GET"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfProcedimentsRDTO());

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
		PageDataOfProcedimentsRDTO response = api.getProcedimentsUsingGET(absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, totalElements,
		        totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns UGR and UGOs from procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getUgsByIdProcedimentUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/getUgsByIdProcediment/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<UnitatsGestoresRDTO>());

		BigDecimal idProcediment = ONE;
		List<UnitatsGestoresRDTO> response = api.getUgsByIdProcedimentUsingGET(idProcediment);

		assertTrue(response != null);
	}

	/**
	 * Inserts the provided procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void insertProcedimentsUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments"), eq("POST"), any(List.class), any(Object.class), any(Map.class), any(Map.class),
		        isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsResponse());

		ProcedimentsRDTO procedimentRDTO = new ProcedimentsRDTO();
		ProcedimentsResponse response = api.insertProcedimentsUsingPOST(procedimentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Locks the provided procediment for editing
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void lockProcedimentUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/bloquejar/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsResponse());

		BloquejosRDTO bloquejo = new BloquejosRDTO();
		BigDecimal id = ONE;
		ProcedimentsResponse response = api.lockProcedimentUsingPOST(bloquejo, id);

		assertTrue(response != null);
	}

	/**
	 * Returns all the procediment ids by codi
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void procedimentIdsByCodiAndTramitadorUsingGETTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/procedimentIdsByCodiAndTramitador"), eq("GET"), any(List.class), any(Object.class),
		        any(Map.class), any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<BigDecimal>());

		String aplicacio = null;
		List<String> procedimentCodis = null;
		String procedimentVersio = null;
		String tramitador = null;
		List<BigDecimal> response = api.procedimentIdsByCodiAndTramitadorUsingGET(aplicacio, procedimentCodis, procedimentVersio,
		        tramitador);

		assertTrue(response != null);
	}

	/**
	 * Inserts new historic
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void registrarHistoricTramitUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/historic/insert"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<BigDecimal>());

		List<HistoricsRDTO> historicsRDTO = Arrays.asList(new HistoricsRDTO());
		List<BigDecimal> response = api.registrarHistoricTramitUsingPOST(historicsRDTO);

		assertTrue(response != null);
	}

	/**
	 * Returns all procedures that meet the search criteria
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void searchAssoaciatsUsingGETTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/searchAssociats"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfProcedimentsRDTO());

		Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
		Integer absoluteRowNumberOfLastRowInCurrentPage = null;
		String codi = null;
		Boolean currentPageHasNextPage = null;
		Boolean currentPageHasPreviousPage = null;
		Boolean currentPageIsFirstPage = null;
		Boolean currentPageIsLastPage = null;
		Integer currentPageNumber = null;
		String dir = null;
		BigDecimal id = null;
		BigDecimal idUsuari = null;
		List<BigDecimal> ids = null;
		Integer nextPageNumber = null;
		String nom = null;
		Integer pageSize = null;
		Integer previousPageNumber = null;
		String sort = null;
		Long totalElements = null;
		Integer totalPages = null;
		PageDataOfProcedimentsRDTO response = api.searchAssoaciatsUsingGET(absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, codi, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, id, idUsuari, ids, nextPageNumber, nom, pageSize, previousPageNumber, sort,
		        totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns all the comentaris entries for the procedure that meet the search
	 * criteria
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void searchComentarisUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/comentaris/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfComentarisRDTO());

		BigDecimal id = ONE;
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
		PageDataOfComentarisRDTO response = api.searchComentarisUsingGET(id, absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, totalElements,
		        totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns all the historic entries for the procedure that meet the search
	 * criteria
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void searchHistoricsUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/historic/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PageDataOfHistoricsRDTO());

		BigDecimal id = ONE;
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
		List<Integer> tipus = null;
		Long totalElements = null;
		Integer totalPages = null;
		PageDataOfHistoricsRDTO response = api.searchHistoricsUsingGET(id, absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage, currentPageHasPreviousPage, currentPageIsFirstPage,
		        currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize, previousPageNumber, sort, tipus, totalElements,
		        totalPages);

		assertTrue(response != null);
	}

	/**
	 * check if the units are being used
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void unitatsInUseUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/unitatsInUse/1"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<ProcedimentsForUnitatsRDTO>());

		String ugIdList = ONE.toString();
		List<ProcedimentsForUnitatsRDTO> response = api.unitatsInUseUsingGET(ugIdList);

		assertTrue(response != null);
	}

	/**
	 * Unlocks the provided procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void unlockProcedimentUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/desbloquejar/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsResponse());

		BigDecimal id = ONE;
		ProcedimentsResponse response = api.unlockProcedimentUsingPOST(id);

		assertTrue(response != null);
	}

	/**
	 * updates de requested doc info
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void updateDocUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/procediments/updateDoc"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new RestClientResponse());

		InfoDocProcedimentRDTO infoDocProcedimentRDTO = new InfoDocProcedimentRDTO();
		RestClientResponse response = api.updateDocUsingPOST(infoDocProcedimentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Version the provided procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void versionProcedimentUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/procediments/versionar/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ProcedimentsResponse());

		BigDecimal id = ONE;
		ProcedimentsResponse response = api.versionProcedimentUsingPOST(id);

		assertTrue(response != null);
	}

	/**
	 * Get all versions of the provided codi
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void versionsByCodiUsingGETTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn("cod");
		when(apiClient.invokeAPI(eq("/procediments/versions/cod"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<ProcedimentsRDTO>());

		String codi = "cod";
		List<ProcedimentsRDTO> response = api.versionsByCodiUsingGET(codi);

		assertTrue(response != null);
	}

}
