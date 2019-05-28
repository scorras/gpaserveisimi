/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.11.0
 * Contact: sergio.corras@iecisa.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package es.bcn.gpa.gpaserveis.rest.client.api.gpadocumentacio;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

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

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.ActualitzarNotificacionDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.CrearNotificacio;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.NotificacionsRDTO;

/**
 * API tests for NotificacionsApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NotificacionsApiTest extends ParentTest {

	@InjectMocks
	private NotificacionsApi api = new NotificacionsApi();

	/**
	 * actualitzarNotificacio
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void actualitzarNotificacioTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/notificacions/actualitzarNotificacio"), eq(HttpMethod.POST), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn(null);

		ActualitzarNotificacionDocument actualitzarNotificacionDocumentRDTO = new ActualitzarNotificacionDocument();
		api.actualitzarNotificacio(actualitzarNotificacionDocumentRDTO);

		assertTrue(true);
	}

	/**
	 * crearNotificacio
	 *
	 * 
	 *
	 * @throws RestClientException
	 *             if the Api call fails
	 */
	@Test
	public void crearNotificacioTest() throws RestClientException {
		when(apiClient.invokeAPI(eq("/notificacions/crearNotificacio"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new NotificacionsRDTO());

		CrearNotificacio crearNotificacioRDTO = new CrearNotificacio();
		NotificacionsRDTO response = api.crearNotificacio(crearNotificacioRDTO);

		assertTrue(response != null);
	}

}
