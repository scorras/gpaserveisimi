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

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpatramits.EstatsProcUgRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpatramits.ApiException;

/**
 * API tests for AssociarEstatsTramitacioUgApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssociarEstatsTramitacioUgApiTest extends ParentTest {

	@InjectMocks
	private AssociarEstatsTramitacioUgApi api = new AssociarEstatsTramitacioUgApi();

	/**
	 * Associar unitat gestora a estats de tramitació d&#39;un procediment
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void associarEstatTramProcUgUsingPOSTTest() throws ApiException {
		when(apiClient.invokeAPI(eq("/tramits/associarEstatTramProcUg"), eq("POST"), any(List.class), any(Object.class), any(Map.class),
		        any(Map.class), any(String.class), any(String.class), any(String[].class), isNull(GenericType.class))).thenReturn(null);

		List<EstatsProcUgRDTO> estatsProcUgRDTOList = Arrays.asList(new EstatsProcUgRDTO());
		api.associarEstatTramProcUgUsingPOST(estatsProcUgRDTOList);

		assertTrue(true);
	}

}