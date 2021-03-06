package es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients;

import es.bcn.gpa.gpaserveis.rest.client.invoker.gpaexpedients.ApiClient;

import es.bcn.gpa.gpaserveis.rest.client.api.model.gpaexpedients.PersonesSollicitudRDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-12T12:40:33.333+01:00")
@Component("es.bcn.gpa.gpaserveis.rest.client.api.gpaexpedients.PersonesSollicitud_Api")
public class PersonesSollicitud_Api {
    private ApiClient apiClient;

    public PersonesSollicitud_Api() {
        this(new ApiClient());
    }

    @Autowired
    public PersonesSollicitud_Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the requested person
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param listPersonaIdext listPersonaIdext
     * @return List&lt;PersonesSollicitudRDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PersonesSollicitudRDTO> consultarDadesAllPersonaSollicitudByPersonaIdext(String listPersonaIdext) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'listPersonaIdext' is set
        if (listPersonaIdext == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listPersonaIdext' when calling consultarDadesAllPersonaSollicitudByPersonaIdext");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("listPersonaIdext", listPersonaIdext);
        String path = UriComponentsBuilder.fromPath("/expedients/personesSollicitud/allPersonesSollicitudByPersonaIdext/{listPersonaIdext}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<PersonesSollicitudRDTO>> returnType = new ParameterizedTypeReference<List<PersonesSollicitudRDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns the requested person
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param idPersonesSollicitud idPersonesSollicitud
     * @return PersonesSollicitudRDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PersonesSollicitudRDTO consultarDadesPersonaSollicitud(Integer idPersonesSollicitud) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'idPersonesSollicitud' is set
        if (idPersonesSollicitud == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idPersonesSollicitud' when calling consultarDadesPersonaSollicitud");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("idPersonesSollicitud", idPersonesSollicitud);
        String path = UriComponentsBuilder.fromPath("/expedients/personesSollicitud/{idPersonesSollicitud}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PersonesSollicitudRDTO> returnType = new ParameterizedTypeReference<PersonesSollicitudRDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
