/*
 * API gpatramits
 * API gpatramits
 *
 * OpenAPI spec version: 1.3.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpatramits;

import static java.math.BigDecimal.ONE;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.PageDataOfTramitsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.TramitsRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpatramits.ApiClient.CollectionFormat;

/**
 * API tests for TramitsApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TramitsApiTest extends ParentTest {

	@InjectMocks
	private TramitsApi api = new TramitsApi();

	/**
	 * Returns all the tramits that meet the search criteria and are associated
	 * with a procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cercaTramitsProcedimentTest() {
		when(apiClient.parameterToMultiValueMap(isNull(CollectionFormat.class), any(String.class), any(Object.class)))
		        .thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.parameterToMultiValueMap(any(CollectionFormat.class), any(String.class), any(Object.class)))
		        .thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.invokeAPI(eq("/tramits/searchAssociated/procediment/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new PageDataOfTramitsRDTO());

		BigDecimal idProcediment = ONE;
		Integer absoluteRowNumberOfFirstRowInCurrentPage = null;
		Integer absoluteRowNumberOfLastRowInCurrentPage = null;
		BigDecimal bloqueig = null;
		BigDecimal bloquejosId = null;
		DateTime bloquejosMomentBloqueig = null;
		String bloquejosTipus = null;
		Boolean bloquejosTramitBloquejatPerAltreUsuari = null;
		Boolean bloquejosTramitEditable = null;
		BigDecimal bloquejosUsuari = null;
		String bloquejosUsuariBloquejoCarrec = null;
		String bloquejosUsuariBloquejoCognom1 = null;
		String bloquejosUsuariBloquejoCognom2 = null;
		String bloquejosUsuariBloquejoDocumentIdentitat = null;
		String bloquejosUsuariBloquejoEmail = null;
		List<String> bloquejosUsuariBloquejoGrp = null;
		BigDecimal bloquejosUsuariBloquejoId = null;
		String bloquejosUsuariBloquejoMatricula = null;
		String bloquejosUsuariBloquejoNom = null;
		String bloquejosUsuariBloquejoUser = null;
		Boolean currentPageHasNextPage = null;
		Boolean currentPageHasPreviousPage = null;
		Boolean currentPageIsFirstPage = null;
		Boolean currentPageIsLastPage = null;
		Integer currentPageNumber = null;
		DateTime darreraModificacio = null;
		DateTime dataGestioElectronica = null;
		String descripcio = null;
		String descripcioEstatTramit = null;
		String dir = null;
		Integer esTramitIniciacio = null;
		BigDecimal estatTramit = null;
		BigDecimal estatsTramitEstat = null;
		BigDecimal estatsTramitEstatTramitAnt = null;
		String estatsTramitEstatsTramitsDescripcio = null;
		BigDecimal estatsTramitEstatsTramitsId = null;
		BigDecimal estatsTramitHistoric = null;
		BigDecimal estatsTramitId = null;
		BigDecimal estatsTramitTramit = null;
		Integer exclusiuIntern = null;
		String gestioElectronica = null;
		BigDecimal id = null;
		String informacioTramitador = null;
		Integer nextPageNumber = null;
		String nom = null;
		String normaAltresAplicacio = null;
		String normaReferenciaPrincipal = null;
		Integer pageSize = null;
		Integer previousPageNumber = null;
		String rolUsuari = null;
		String sort = null;
		Long totalElements = null;
		Integer totalPages = null;
		BigDecimal ultimaModificacio = null;
		PageDataOfTramitsRDTO response = api.cercaTramitsProcediment(idProcediment, absoluteRowNumberOfFirstRowInCurrentPage,
		        absoluteRowNumberOfLastRowInCurrentPage, bloqueig, bloquejosId, bloquejosMomentBloqueig, bloquejosTipus,
		        bloquejosTramitBloquejatPerAltreUsuari, bloquejosTramitEditable, bloquejosUsuari, bloquejosUsuariBloquejoCarrec,
		        bloquejosUsuariBloquejoCognom1, bloquejosUsuariBloquejoCognom2, bloquejosUsuariBloquejoDocumentIdentitat,
		        bloquejosUsuariBloquejoEmail, bloquejosUsuariBloquejoGrp, bloquejosUsuariBloquejoId, bloquejosUsuariBloquejoMatricula,
		        bloquejosUsuariBloquejoNom, bloquejosUsuariBloquejoUser, currentPageHasNextPage, currentPageHasPreviousPage,
		        currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, darreraModificacio, dataGestioElectronica, descripcio,
		        descripcioEstatTramit, dir, esTramitIniciacio, estatTramit, estatsTramitEstat, estatsTramitEstatTramitAnt,
		        estatsTramitEstatsTramitsDescripcio, estatsTramitEstatsTramitsId, estatsTramitHistoric, estatsTramitId, estatsTramitTramit,
		        exclusiuIntern, gestioElectronica, id, informacioTramitador, nextPageNumber, nom, normaAltresAplicacio,
		        normaReferenciaPrincipal, pageSize, previousPageNumber, rolUsuari, sort, totalElements, totalPages, ultimaModificacio);

		assertTrue(response != null);
	}

	/**
	 * Returns the requested tramits
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesTramitTest() {
		when(apiClient.invokeAPI(eq("/tramits/1"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class), any(HttpHeaders.class),
		        any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new TramitsRDTO());

		BigDecimal id = ONE;
		TramitsRDTO response = api.consultarDadesTramit(id);

		assertTrue(response != null);
	}

}
