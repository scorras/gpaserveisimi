/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.0.0
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
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ProcedimentSerieDocRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RespostaSincronitzarCheckRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.RespostaSincronitzarRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SerieDTO;

/**
 * API tests for SeriesCatalegApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeriesCatalegApiTest extends ParentTest {

	@InjectMocks
	private SeriesCatalegApi api = new SeriesCatalegApi();

	/**
	 * Returns the series
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void getSeriesUsingGETTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/series"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new ArrayList<SerieDTO>());

		List<SerieDTO> response = api.getSeriesUsingGET();

		assertTrue(response != null);
	}

	/**
	 * Sincronitzar la configuració de la documentació del procediment
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void sincronitzarSeriesToProcUsingPOSTTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/sincronitzarSeriesToProc"), eq(HttpMethod.POST), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new RespostaSincronitzarRDTO());

		ProcedimentSerieDocRDTO procedimentSerieDocRDTO = new ProcedimentSerieDocRDTO();
		RespostaSincronitzarRDTO response = api.sincronitzarSeriesToProcUsingPOST(procedimentSerieDocRDTO);

		assertTrue(response != null);
	}

	/**
	 * Sincronitzar la configuració de la documentació del procediment
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void sincronitzarUsingPOSTTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/sincronitzar"), eq(HttpMethod.POST), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new RespostaSincronitzarRDTO());

		ProcedimentSerieDocRDTO procedimentSerieDocRDTO = new ProcedimentSerieDocRDTO();
		RespostaSincronitzarRDTO response = api.sincronitzarUsingPOST(procedimentSerieDocRDTO);

		assertTrue(response != null);
	}

	/**
	 * Sincronitzar la configuració de la documentació del procediment
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void checkSerieDocumentalUsingGETTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/configuracioDocumentacio/serie/1"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new RespostaSincronitzarCheckRDTO());

		String serieDocumental = ONE.toString();
		RespostaSincronitzarCheckRDTO response = api.checkSerieDocumentalUsingGET(serieDocumental);

		assertTrue(response != null);
	}

}
