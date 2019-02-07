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
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.RestClientResponse;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpatramits.ApiException;

/**
 * API tests for EstatsTramitacioApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EstatsTramitacioApiTest extends ParentTest {

	@InjectMocks
	private EstatsTramitacioApi api = new EstatsTramitacioApi();

	/**
	 * Generar estats de tramitacio per al procediment sol licitat
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void generaEstatsTramitacioUsingPOSTTest() throws ApiException {
		when(apiClient.escapeString(any(String.class))).thenReturn(ONE.toString());
		when(apiClient.invokeAPI(eq("/tramits/estatsTramitacio/1"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), isNull(String.class), isNull(String.class), any(String[].class), any(GenericType.class)))
		                .thenReturn(new RestClientResponse());

		BigDecimal idProcediment = ONE;
		RestClientResponse response = api.generaEstatsTramitacioUsingPOST(idProcediment);

		assertTrue(response != null);
	}

}