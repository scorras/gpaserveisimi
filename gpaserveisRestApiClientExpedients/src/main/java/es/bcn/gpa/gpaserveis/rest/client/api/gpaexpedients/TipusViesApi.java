package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.TipusViesRDTO;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiClient;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiException;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.Configuration;
import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.Pair;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-14T14:36:36.923+02:00")
public class TipusViesApi {
	private ApiClient apiClient;

	public TipusViesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public TipusViesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Returns all the TipusVies
	 * 
	 * @return List&lt;TipusViesRDTO&gt;
	 * @throws ApiException
	 *             if fails to make API call
	 */
	public List<TipusViesRDTO> getTipusViesUsingGET() throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/expedients/catalog/tipusVies";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "*/*" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		GenericType<List<TipusViesRDTO>> localVarReturnType = new GenericType<List<TipusViesRDTO>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
		        localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
