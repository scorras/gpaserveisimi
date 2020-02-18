/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.3.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

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

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.DadesEspecifiquesRDTO;

/**
 * API tests for DadesEspecifiquesApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DadesEspecifiquesApiTest extends ParentTest {

	@InjectMocks
	private DadesEspecifiquesApi api = new DadesEspecifiquesApi();

	/**
	 * Returns the requested dades especifiques by Sol·licitud
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesEspecifiquesSollicitudTest() {
		when(apiClient.invokeAPI(eq("/expedients/dadesEspecifiques/sollicitud/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(new ArrayList<DadesEspecifiquesRDTO>());

		BigDecimal idSollicitud = ONE;
		List<DadesEspecifiquesRDTO> response = api.consultarDadesEspecifiquesSollicitud(idSollicitud);

		assertTrue(response != null);
	}

	/**
	 * Returns the requested dades especifiques
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesEspecifiquesExpedientTest() {
		when(apiClient.invokeAPI(eq("/expedients/dadesEspecifiques/1"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new ArrayList<DadesEspecifiquesRDTO>());

		BigDecimal idExpedient = ONE;
		List<DadesEspecifiquesRDTO> response = api.consultarDadesEspecifiquesExpedient(idExpedient);

		assertTrue(response != null);
	}

	/**
	 * Save the specific data of a Sollicitud in the Expedient
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void guardarDadesEspecifiquesSollicitudTest() {
		when(apiClient.invokeAPI(eq("/expedients/dadesEspecifiques/sollicitud/1"), eq(HttpMethod.POST), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(null);

		BigDecimal idSollicitud = ONE;
		api.guardarDadesEspecifiquesSollicitud(idSollicitud);

		assertTrue(true);
	}

}
