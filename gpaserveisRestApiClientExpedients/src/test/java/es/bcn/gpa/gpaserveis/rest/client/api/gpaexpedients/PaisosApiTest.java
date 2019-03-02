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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PaisosRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiException;

/**
 * API tests for PaisosApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisosApiTest extends ParentTest {

	@InjectMocks
	private PaisosApi api = new PaisosApi();

	/**
	 * Returns all the paisos
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void getPaisosUsingGETTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/expedients/catalog/paisos"), eq("GET"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new ArrayList<PaisosRDTO>());

		List<PaisosRDTO> response = api.getPaisosUsingGET();

		assertTrue(response != null);
	}

	/**
	 * Returns the requested pais
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesPaisPerCodiIsoTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/expedients/catalog/paisos/perCodiIso/1"), eq("GET"), any(List.class), any(Object.class),
		        any(Map.class), any(Map.class), any(String.class), any(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new PaisosRDTO());

		String codiIso = ONE.toString();
		PaisosRDTO response = api.consultarDadesPaisPerCodiIso(codiIso);

		assertTrue(response != null);
	}

}
