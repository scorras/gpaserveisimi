/*
 * API gpadocumentacio
 * API gpadocumentacio
 *
 * OpenAPI spec version: 1.21.0
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

import java.math.BigDecimal;
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

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.CallbackPortaSig;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.DadesSignatura;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.PeticionsPortasig;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarPortasignaturesDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarSegellDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarTabletDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarTabletDocumentResponse;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarValidDocument;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpadocumentacio.SignarValidDocumentResponse;

/**
 * API tests for SignaturesApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignaturesApiTest extends ParentTest {

	/** The api. */
	@InjectMocks
	private SignaturesApi api = new SignaturesApi();

	/**
	 * Callback per actualitzar l&#39;estat dels documents enviats a portasig
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void callbackPortaSigTest() {
		when(apiClient.invokeAPI(eq("/signatures/callbackPortaSig"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(null);

		CallbackPortaSig callbackPortaSigRDTO = new CallbackPortaSig();
		api.callbackPortaSig(callbackPortaSigRDTO);

		assertTrue(true);
	}

	/**
	 * Consultar dades signatura
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void consultarDadesSignaturaTest() {
		when(apiClient.invokeAPI(eq("/signatures/dadesSignatura/1"), eq(HttpMethod.GET), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new DadesSignatura());

		String codiPeticio = ONE.toString();
		DadesSignatura response = api.consultarDadesSignatura(codiPeticio);

		assertTrue(response != null);
	}

	/**
	 * Crear una petició per signar o validar un document
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void crearPeticioPortaSigTest() {
		when(apiClient.invokeAPI(eq("/signatures/crearPeticioPortaSig"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new PeticionsPortasig());

		SignarPortasignaturesDocument signarPortasignaturesDocumentRDTO = new SignarPortasignaturesDocument();
		PeticionsPortasig response = api.crearPeticioPortaSig(signarPortasignaturesDocumentRDTO);

		assertTrue(response != null);
	}

	/**
	 * downloadUltimaSignatura
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void descarregarDocumentExpedientSignatTest() {
		when(apiClient.invokeAPI(eq("/signatures/descarregarDocumentExpedientSignat/1"), eq(HttpMethod.GET), any(MultiValueMap.class),
		        any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class),
		        any(String[].class), any(ParameterizedTypeReference.class))).thenReturn("prova".getBytes());

		BigDecimal idUltimaSignatura = ONE;
		byte[] response = api.descarregarDocumentExpedientSignat(idUltimaSignatura);

		assertTrue(response != null);
	}

	/**
	 * Crear una petició per signar un document
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void signarSegellTest() {
		when(apiClient.invokeAPI(eq("/signatures/signarSegell"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new SignarSegellDocument());

		SignarSegellDocument signarSegellDocumentRDTO = new SignarSegellDocument();
		SignarSegellDocument response = api.signarSegell(signarSegellDocumentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Crear una petició per signar un document en la tablet
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void signarTabletTest() {
		when(apiClient.invokeAPI(eq("/signatures/signarTablet"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new SignarTabletDocumentResponse());

		SignarTabletDocument signarTabletDocumentRDTO = new SignarTabletDocument();
		SignarTabletDocumentResponse response = api.signarTablet(signarTabletDocumentRDTO);

		assertTrue(response != null);
	}

	/**
	 * Crear una petició per signar un document en IMI Valid
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void signarValidTest() {
		when(apiClient.invokeAPI(eq("/signatures/signarValid"), eq(HttpMethod.POST), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(new SignarValidDocumentResponse());

		SignarValidDocument signarValidDocumentRDTO = new SignarValidDocument();
		SignarValidDocumentResponse response = api.signarValid(signarValidDocumentRDTO);

		assertTrue(response != null);
	}

}