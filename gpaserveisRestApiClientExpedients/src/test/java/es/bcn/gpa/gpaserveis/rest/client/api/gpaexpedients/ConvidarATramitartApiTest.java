/*
 * API gpaexpedients
 * API gpaexpedients
 *
 * OpenAPI spec version: 1.10.0
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

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.ConvidarTramitarMassiuRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiException;

/**
 * API tests for ConvidarATramitartApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConvidarATramitartApiTest extends ParentTest {

	@InjectMocks
	private ConvidarATramitartApi api = new ConvidarATramitartApi();

	/**
	 * ConvidarATramitart
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void convidarTramitarExpedientTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/expedients/convidarATramitar"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class))).thenReturn(null);

		ConvidarTramitarMassiuRDTO convidarTramitarMassiuRDTO = new ConvidarTramitarMassiuRDTO();
		api.convidarTramitarExpedient(convidarTramitarMassiuRDTO);

		assertTrue(true);
	}

}
