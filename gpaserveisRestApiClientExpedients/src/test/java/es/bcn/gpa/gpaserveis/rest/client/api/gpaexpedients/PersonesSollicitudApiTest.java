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
import static org.mockito.Matchers.isNull;
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
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PageDataOfPersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiClient.CollectionFormat;

/**
 * API tests for PersonesSollicitudApi
 */
@SuppressWarnings("unchecked")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonesSollicitudApiTest extends ParentTest {

	@InjectMocks
	private PersonesSollicitudApi api = new PersonesSollicitudApi();

	/**
	 * Save the provided persone
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void donarAccesAltraPersonaImplicadaTestOK() {
		when(apiClient.parameterToMultiValueMap(isNull(CollectionFormat.class), any(String.class), any(Object.class)))
		        .thenReturn(new LinkedMultiValueMap<String, String>());
		when(apiClient.invokeAPI(eq("/expedients/personesSollicitud/donarAccesAltresImplidades"), eq(HttpMethod.POST),
		        any(MultiValueMap.class), any(Object.class), any(HttpHeaders.class), any(MultiValueMap.class), any(List.class),
		        any(MediaType.class), any(String[].class), any(ParameterizedTypeReference.class)))
		                .thenReturn(new PageDataOfPersonesSollicitudRDTO());

		PersonesSollicitudRDTO personesSollicitudRDTO = new PersonesSollicitudRDTO();
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
		PageDataOfPersonesSollicitudRDTO response = api.donarAccesAltraPersonaImplicada(personesSollicitudRDTO,
		        absoluteRowNumberOfFirstRowInCurrentPage, absoluteRowNumberOfLastRowInCurrentPage, currentPageHasNextPage,
		        currentPageHasPreviousPage, currentPageIsFirstPage, currentPageIsLastPage, currentPageNumber, dir, nextPageNumber, pageSize,
		        previousPageNumber, sort, totalElements, totalPages);

		assertTrue(response != null);
	}

	/**
	 * Deletes the requested personesSollicitud
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void esborrarPersonaSollicitudTest() {
		when(apiClient.invokeAPI(eq("/expedients/personesSollicitud/1"), eq(HttpMethod.DELETE), any(MultiValueMap.class), any(Object.class),
		        any(HttpHeaders.class), any(MultiValueMap.class), any(List.class), any(MediaType.class), any(String[].class),
		        any(ParameterizedTypeReference.class))).thenReturn(null);

		BigDecimal idPersonesSollicitud = ONE;
		api.esborrarPersonaSollicitud(idPersonesSollicitud);

		assertTrue(true);
	}

}
