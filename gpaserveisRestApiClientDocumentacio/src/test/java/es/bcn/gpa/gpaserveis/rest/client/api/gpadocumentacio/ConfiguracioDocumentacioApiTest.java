/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.4.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpadocumentacio;

import static java.math.BigDecimal.ONE;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.PageDataOfConfiguracioDocsEntradaRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.PageDataOfConfiguracioDocsTramitacioRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RespostaPlantillaDocVinculada;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpadocumentacio.ApiClient.CollectionFormat;

/**
 * API tests for ConfiguracioDocumentacioApi.
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConfiguracioDocumentacioApiTest extends ParentTest {

	/** The api. */
	@InjectMocks
	private ConfiguracioDocumentacioApi api = new ConfiguracioDocumentacioApi();

	/**
	 * Returns the requested entrada configuracio.
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void cercaConfiguracioDocumentacioEntradaTest() throws RestClientException {
		when(apiClient.parameterToMultiValueMap(isNull(CollectionFormat.class), any(String.class), any(Object.class)))
				.thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/entrada/1"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class),
				any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
				any(ParameterizedTypeReference.class))).thenReturn(new PageDataOfConfiguracioDocsEntradaRDTO());

		Integer id = 1;
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
		PageDataOfConfiguracioDocsEntradaRDTO response = api.cercaConfiguracioDocumentacioEntrada(id,
				absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage,
				currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize,
				previousPageNumber, sort, totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns the requested entrada configuracio.
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void cercaConfiguracioDocumentacioEntradaPerTramitOvtTest() throws RestClientException {
		when(apiClient.parameterToMultiValueMap(isNull(CollectionFormat.class), any(String.class), any(Object.class)))
				.thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/entrada/1/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
				any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
				any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new PageDataOfConfiguracioDocsEntradaRDTO());

		Integer id = 1;
		Integer idTramitOvt = 1;
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
		PageDataOfConfiguracioDocsEntradaRDTO response = api.cercaConfiguracioDocumentacioEntradaPerTramitOvt(id, idTramitOvt,
				absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage,
				currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize,
				previousPageNumber, sort, totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Returns the requested tramitacio configuracio.
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void cercaConfiguracioDocumentacioTramitacioTest() throws RestClientException {
		when(apiClient.parameterToMultiValueMap(isNull(CollectionFormat.class), any(String.class), any(Object.class)))
				.thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/tramitacio/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
				any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
				any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new PageDataOfConfiguracioDocsTramitacioRDTO());

		Integer id = 1;
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
		PageDataOfConfiguracioDocsTramitacioRDTO response = api.cercaConfiguracioDocumentacioTramitacio(id,
				absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage,
				currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize,
				previousPageNumber, sort, totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Gets the plantilla doc vinculada test.
	 *
	 * @return the plantilla doc vinculada test
	 * @throws RestClientException
	 *             the rest client exception
	 */
	@Test
	public void getPlantillaDocVinculadaTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/plantillaDocVinculada/1/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
				any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
				any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new RespostaPlantillaDocVinculada());

		RespostaPlantillaDocVinculada plantillaDocVinculada = api.consultarPlantillaDocumentacioVinculada(1, 1);

		assertTrue(plantillaDocVinculada != null);
	}

	@Test
	@Ignore
	public void consultarPlantillaDocumentacioVinculadaTest() {
		Integer idConfDoc = null;
		Integer idDocVinculada = null;
		RespostaPlantillaDocVinculada response = api.consultarPlantillaDocumentacioVinculada(idConfDoc, idDocVinculada);

		// TODO: test validations
	}
}
