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
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
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

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.AccionsEstatsRDTO;

/**
 * API tests for AccionsEstatsApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccionsEstatsApiTest extends ParentTest {

	@InjectMocks
	private AccionsEstatsApi api = new AccionsEstatsApi();

	/**
	 * Returns the accions allowed for the current expedient&#39;s status
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cercaAccionsPossiblesTest() {
		when(apiClient.invokeAPI(eq("/tramits/accionsPermesesForEstatActual/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new ArrayList<AccionsEstatsRDTO>());

		BigDecimal estatId = ONE;
		List<AccionsEstatsRDTO> response = api.cercaAccionsPossibles(estatId);

		assertTrue(response != null);
	}

	/**
	 * Returns the transition for the current expedient&#39;s status and action
	 * execution
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cercaTransicioCanviEstatTest() {
		when(apiClient.invokeAPI(eq("/tramits/accionsEstatsForEstatActualAndAccio/1/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new ArrayList<AccionsEstatsRDTO>());

		BigDecimal idAccio = ONE;
		BigDecimal idEstatActual = ONE;
		List<AccionsEstatsRDTO> response = api.cercaTransicioCanviEstat(idAccio, idEstatActual);

		assertTrue(response != null);
	}

}
